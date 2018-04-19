package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import io.github.cmansfield.firstpass.symbols.*;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.*;


public class SemanticsVisitor extends CclCompilerVisitor {
  private final Logger logger = LoggerFactory.getLogger(SemanticsVisitor.class);
  private Deque<String> operatorStack;
  private Deque<SAR> sas;

  public SemanticsVisitor(BidiMap<String, Symbol> symbols) {
    super(symbols);
    sas = new LinkedList<>();
    operatorStack = new LinkedList<>();
  }

  Deque<SAR> getSemanticActionStack() {
    return sas == null ? new LinkedList<>() : sas;
  }

  Deque<String> getOperatorStack() {
    return operatorStack == null ? new LinkedList() : operatorStack;
  }

  void setScope(String scope) {
    this.scope = scope;
  }
  
  /**
   * This method will create a simple filter object for searching
   * 
   * @param text        Match the Symbol with this text
   * @param symbolKind  Match Symbols of this kind
   * @param scope       Match Symbols within this scope
   * @return            The Symbol filter used to find Symbols in the symbol table
   */
  private Symbol generateFilter(String text, SymbolKind symbolKind, String scope) {
    return new SymbolBuilder()
            .text(text)
            .symbolKind(symbolKind)
            .scope(scope)
            .build();
  }

  /**
   * This will walk up from the current scope to try and find the
   * Symbol Id of the Symbol that matches the supplied text
   *
   * @param text    Text of the Symbol to find
   * @param sarType The SarType of the symbol we are searching for
   * @return        The ID of the found Symbol
   */
  String traceScopeToFindSymbolId(String text, SarType sarType, String currentScope) {
    if(StringUtils.isBlank(text)) {
      logger.warn("Cannot find the symbolId of something with a blank text");
      return "";
    }
    if(sarType == null || sarType == SarType.UNKNOWN) {
      logger.warn("Unknown SarType provided");
      return "";
    }

    Symbol filter = new SymbolBuilder()
            .text(text)
            .build();
    List<Symbol> found = SymbolFilter.filter(symbols, filter);

    // We have to make sure we are only comparing SAR's of the same type otherwise
    // a class instance var with the same name as the class' method would produce
    // an error. We only want to produce an error if variables of the same scope
    // have the same name
    found = found.stream()
            .filter(symbol -> sarType == SarType.getSarType(symbol.getSymbolKind()))
            .collect(Collectors.toList());

    return traceScopeToFindSymbolId(text, found, currentScope);
  }

  /**
   * This will walk up from the current scope to try and find the
   * Symbol Id of the Symbol that matches the supplied text
   * 
   * @param text            Text of the Symbol to find
   * @param symbolsToFilter A List of Symbols to filter through
   * @param currentScope    The currentScope to check for the desired Symbol
   * @return                The Symbol ID if found
   */
  private String traceScopeToFindSymbolId(String text, List<Symbol> symbolsToFilter, String currentScope) {
    if(CollectionUtils.isEmpty(symbolsToFilter)) {
      logger.info("Could not find Symbol \'{}\'", text);
      return null;
    }
    
    List<Symbol> found = SymbolFilter.filter(
            symbolsToFilter, 
            new SymbolBuilder()
              .scope(currentScope)
              .build());
    
    if(found.size() > 1) {
      throw new IllegalStateException(String.format(
              "All of these Symbols have the same name/identifier in scope: %s%n%s",
              currentScope,
              found.stream()
                      .map(Symbol::toString)
                      .collect(Collectors.joining("\n"))));
    }
    if(CollectionUtils.isEmpty(found)) {
      if(GLOBAL_SCOPE.equals(currentScope)) {
        throw new IllegalStateException(String.format("Could not find Symbol \'%s\'", text));
      }
      String parentId = SymbolTableUtils.getParentScope(currentScope);
      Symbol parentSymbol = symbols.get(parentId);
      if(parentSymbol == null) {
        throw new IllegalStateException(String.format(
                "Bad scope \'%s\' symbolId \'%s\' not found",
                currentScope,
                parentId));
      }
      return traceScopeToFindSymbolId(
              text,
              symbolsToFilter,
              parentSymbol.getScope());
    }
    
    return found.get(0).getSymbolId();
  }

  /**
   * Get the method name or identifier name from the child node without
   * running the visitName or visitMethodName methods
   *
   * @param ctx The context to get child text from
   * @return    The child's name
   */
  private String getNameWithoutVisiting(ParserRuleContext ctx) {
    if(ctx == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.NameContext
                    || node instanceof CclGrammarParser.MethodNameContext)
            .map(context -> context.getChild(0).getText())
            .findFirst()
            .orElse(null);
  }

  /*
    **************************************
    *           Semantic methods
    **************************************
   */

  /**
   * #literalPush
   * This method will push a new literal semantic action record onto the SAS
   *
   * @param ctx         The context of where int the tree the visitor currently is
   * @param symbolKind  The type of literal being pushed onto the SAS
   */
  private void literalPush(ParserRuleContext ctx, SymbolKind symbolKind) {
    String symbolId = findSymbolId(
            generateFilter(
                    getChildText(ctx),
                    symbolKind,
                    GLOBAL_SCOPE),
            true);

    // literalPush
    sas.push(new SAR(
            SarType.LITERAL, 
            symbolId, 
            symbols.get(symbolId).getText(), 
            ctx.start.getLine()));
  }

  /**
   * #identifierPush
   * This method wil push a new identifier semantic action record onto the SAS
   * 
   * @param ctx   The context of where int the tree the visitor currently is
   * @param text  The name of the identifier to be pushed
   */
  private void identifierPush(ParserRuleContext ctx, String text) {
    SAR sar = new SAR(SarType.IDENTIFIER, text);
    sar.setLineNumber(ctx.start.getLine());
    sas.push(sar);
  }

  /**
   * #typePush
   * This method will push a new type semantic action record onto the SAS
   * 
   * @param ctx   The context of where int the tree the visitor currently is
   * @param text  The name of the type to be pushed
   */
  void typePush(ParserRuleContext ctx, String text) {
    SAR sar = new SAR(SarType.TYPE, text);
    sar.setLineNumber(ctx.start.getLine());
    sas.push(sar);
  }

  /**
   * #BeginningArgumentListPush
   * 
   * @param ctx   The context of where int the tree the visitor currently is
   */
  private void balPush(ParserRuleContext ctx) {
    // Beginning argument list Push
    sas.push(new SAR(
            SarType.BEGINNING_ARG_LIST,
            "",
            SarType.BEGINNING_ARG_LIST.toString(),
            ctx.start.getLine()));
  }

  /**
   * #EAL
   * End of argument list
   * This will pop SARs from the SAS until a SarType.BEGINNING_ARG_LIST is found, all args
   * popped off will be inserted into a single argumentList SAR
   */
  void endOfArgumentList() {
    List<String> argIds = new ArrayList<>();
    SAR sar = null;
    SAR argListSar = new SAR(
            SarType.ARG_LIST,
            "");
    
    while(CollectionUtils.isNotEmpty(sas) && (sar = sas.pop()).getType() != SarType.BEGINNING_ARG_LIST) {
      String symbolId = sar.getSymbolId();
      if(StringUtils.isBlank(symbolId)) {
        throw new IllegalStateException(String.format("Missing SymbolId for SAR: %s", sar));
      }
      argIds.add(symbolId);
    }
    
    if(sar == null || sar.getType() != SarType.BEGINNING_ARG_LIST) {
      throw new IllegalStateException("End of Argument List called but the SAS is either empty or does not contain a BEGINNING_ARG_LIST Semantic Action Record");
    }

    Collections.reverse(argIds);
    argListSar.setSymbolIds(argIds);
    sar.getLineNumber().ifPresent(argListSar::setLineNumber);
    sas.push(argListSar);
  }
  
  /**
   * #identifierExist
   * This method will pop off the top SAR from the SAS and then check to make sure
   * the identifier exists and does not conflict with other identifiers. If the
   * identifier is found in the SymbolTable then the symbolId is added to the SAR
   */
  private void identifierExist() {
    if(sas.isEmpty()) {
      throw new IllegalStateException("SAS is empty when trying to check if an identifier exists");
    }
    SAR sar = sas.pop();
    String symbolId = traceScopeToFindSymbolId(sar.getText(), SarType.IDENTIFIER, scope);
    if(StringUtils.isBlank(symbolId)) {
      symbolId = traceScopeToFindSymbolId(sar.getText(), SarType.TYPE, scope);
      sar.setType(SarType.TYPE);
    }
    if(StringUtils.isBlank(symbolId)) {
      Optional<Integer> lineNumberOpt = sar.getLineNumber();
      throw new IllegalStateException(String.format(
              "The identifier \'%s\' on line %s does not exist!",
              lineNumberOpt.orElse(-1),
              sar.getText()));
    }
    sar.setSymbolId(symbolId);
    sas.push(sar);
  }

  /**
   * #typeExist
   * This method will pop off the top SAR from the SAS and then check to make sure
   * the type exists and does not conflict with other types. If the type is found 
   * in the SymbolTable then the symbolId is added to the SAR
   */
  void typeExist() {
    if(sas.isEmpty()) {
      throw new IllegalStateException("SAS is empty when trying to check if a type exists");
    }
    SAR sar = sas.pop();
    if(ParserUtils.isPrimitiveType(sar.getText())) {
      sas.push(sar);
      return;
    }
    
    String symbolId = traceScopeToFindSymbolId(sar.getText(), SarType.TYPE, scope);
    if(StringUtils.isBlank(symbolId)) {
      Optional<Integer> lineNumberOpt = sar.getLineNumber();
      throw new IllegalStateException(String.format(
              "%s : The type \'%s\' does not exist!",
              lineNumberOpt.orElse(-1),
              sar.getText()));
    }
    sar.setSymbolId(symbolId);
    sas.push(sar);
  }

  /**
   * #referenceExist
   * This method will pop off the top SAR from the SAS and then check to make sure the reference 
   * exists and does not conflict with other references. If the reference is found in the 
   * SymbolTable then the symbolId is added to the SAR
   */
  void referenceExist() {
    if(CollectionUtils.isEmpty(sas) || sas.size() < 2) {
      throw new IllegalStateException("SAS does not have enough SARs when trying to check if a reference exists");
    }
    SAR fieldSar = sas.pop();
    SAR parentSar = sas.pop();

    String classId = parentSar.getSymbolId();
    Consumer<String> throwExcpetion = message -> {
      throw new IllegalStateException(String.format("%s : %s.%s, %s",
              parentSar.getLineNumber().orElse(0),
              parentSar.getText(),
              fieldSar.getText(),
              message));
    };

    if(fieldSar.getType() != SarType.IDENTIFIER) {
      throwExcpetion.accept(fieldSar.getText() + "is not something that can be referenced");
    }

    if(parentSar.getType() == SarType.IDENTIFIER) {
      // The parent must be an instantiated object and the field a non-static class member that is visible
      Symbol classSymbol = symbols.get(parentSar.getSymbolId()); 
      String className = classSymbol == null ? "" : classSymbol.getData().getType().orElse("");
      classId = findSymbolId(className, SymbolKind.CLASS);
      
      if(StringUtils.isBlank(className) || StringUtils.isBlank(classId)) {
        throwExcpetion.accept(String.format("instance \'%s\'s class not found", parentSar.getText()));
      }
    }
    else if(parentSar.getType() != SarType.TYPE) {
      throwExcpetion.accept(String.format("%s is not a object or a class and cannot referenced from", parentSar.getText()));
    }

    Symbol classSymbol = symbols.get(classId);
    Symbol filter = new SymbolBuilder()
            .scope(classSymbol.getScope() + "." + classId)
            .text(fieldSar.getText())
            .build();
    List<Symbol> foundSymbols = SymbolFilter.filter(symbols, filter);
    if(foundSymbols.size() != 1) {
      throwExcpetion.accept(String.format("Too many \'%s\'s in the same scope", fieldSar.getText()));
    }
    Symbol fieldSymbol = foundSymbols.get(0);
    fieldSar.setSymbolId(fieldSymbol.getSymbolId());
    Data fieldData = fieldSymbol.getData();
    List<AccessModifier> accessModifiers = fieldData.getAccessModifiers();

    if(accessModifiers.contains(AccessModifier.PRIVATE)) {
      throwExcpetion.accept(String.format("\'%s\' is private and cannot be accessed", fieldSar.getText()));
    }
    if(parentSar.getType() == SarType.TYPE && !accessModifiers.contains(AccessModifier.STATIC)) {
      throwExcpetion.accept(String.format("\'%s\' is not static and cannot be accessed in a static context", fieldSar.getText()));
    }
    
    Data refData = new DataBuilder()
            .returnType(fieldData.getReturnType().orElse(""))
            .type(fieldData.getType().orElse(""))
            .isTypeAnArray(fieldData.isTypeAnArray())
            .parameter(classId)
            .parameter(fieldSar.getSymbolId())
            .build();
    Symbol referenceSymbol = addNewSymbol(
            String.format("%s.%s", parentSar.getText(), fieldSar.getText()), 
            SymbolKind.REFERENCE, 
            scope, 
            refData);
    SAR refSar = new SAR(
            SarType.REFERENCE, 
            referenceSymbol.getSymbolId(), 
            referenceSymbol.getText(), 
            parentSar.getLineNumber().orElse(-1));
    refSar.addSymbolId(classId);
    refSar.addSymbolId(fieldSar.getSymbolId());
    sas.push(refSar);
  }
  
  /**
   * #duplicate
   * This method will check to make sure there isn't a duplicate element of the same 
   * type in the same scope
   * 
   * @param name        The name of the Symbol to check for duplicates
   * @param symbolKind  The Symbol type of of the element to check 
   */
  void duplicate(String name, SymbolKind symbolKind) {
    Symbol filter = new SymbolBuilder()
            .text(name)
            .symbolKind(symbolKind)
            .scope(scope)
            .build();
    List<Symbol> foundSymbols = SymbolFilter.filter(symbols, filter);
    
    if(CollectionUtils.isEmpty(foundSymbols)) {
      throw new IllegalStateException(String.format("There should have been at least one Symbol of %s, found none", name));
    }
    if(foundSymbols.size() > 1) {
      throw new IllegalStateException(String.format(
              "There are duplicate %s %s in scope %s",
              symbolKind.toString(),
              name,
              scope));
    }
  }
  
  /**
   * Move this method from SymbolTableVisitor to this class because we don't want to create
   * local variables until the second pass or else the symbol table could say they exist before
   * they are instantiated
   */
  @Override
  public Object visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    String type = getType(ctx);
    String name = getNameWithoutVisiting(ctx);
    boolean isArray = isArray(ctx);

    Data data = new DataBuilder()
            .accessModifier(AccessModifier.PRIVATE)
            .isTypeAnArray(isArray)
            .type(type)
            .build();
    addNewSymbol(name, SymbolKind.LOCAL_VAR, scope, data);

    getName(ctx);     // This adds the identifier to the SAS and verifies it
    traverseAssignmentOperation(ctx);

    return null;
  }

  /**
   * Move this method from SymbolTableVisitor to this class because we don't want to create
   * symbols for blocks or for-loops before we have reached them. It makes it impossible to
   * look these up on the second pass
   */
  @Override
  public Object visitStatementWithScope(CclGrammarParser.StatementWithScopeContext ctx) {
    if(ctx.children == null || ctx.children.isEmpty()) {
      throw new IllegalArgumentException("There must be child nodes at this point in the tree");
    }
    SymbolKind symbolKind = SymbolKind.UNKNOWN;
    String symbolId;
    String scopeOrig = scope;
    ParseTree child = ctx.getChild(0);

    if("{".equals(child.getText())) {
      symbolKind = SymbolKind.BLOCK;
    }
    else if(ParserUtils.getLiteralName(CclGrammarParser.FOR).equals(child.getText())) {
      symbolKind = SymbolKind.FOR;
    }

    if(symbolKind == SymbolKind.UNKNOWN) {
      throw new IllegalStateException(
              String.format("Unknown statement \"%s\" found", StringUtils.isBlank(child.getText()) ? "" : child.getText()));
    }

    symbolId = SymbolIdGenerator.generateId(symbolKind);
    scope = scope + "." + symbolId;

    Data data = new DataBuilder().accessModifier(AccessModifier.PRIVATE).build();
    addNewSymbol(symbolId, symbolKind, scopeOrig, data, symbolId);

    super.visitStatementWithScope(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {     // NOSONAR
    String name = getClassName(ctx);
    String scopeOrig = scope;

    String symbolId = findSymbolId(
            new SymbolBuilder()
              .text(name)
              .symbolKind(SymbolKind.CLASS)
              .build(),
            false);
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }
    
    scope = scope + "." + symbolId;
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassMemberDeclarationContext)
            .map(context -> (CclGrammarParser.ClassMemberDeclarationContext)context)
            .forEach(this::visitClassMemberDeclaration);
    scope = scopeOrig;
    
    return null; 
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {   // NOSONAR
    String name = getMethodName(ctx);
    String scopeOrig = scope;

    String symbolId = findSymbolId(name, SymbolKind.CONSTRUCTOR);
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }

    scope = scope + "." + symbolId;
    traverseParameterList(ctx);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {     // NOSONAR
    getType(ctx);
    String name = getMethodName(ctx);
    if(name == null) {
      throw new IllegalStateException("Method name came back null, should not be null after the first pass");
    }
    String scopeOrig = scope;

    String symbolId = findSymbolId(
            new SymbolBuilder()
              .text(name)
              .symbolKind(SymbolKind.METHOD)
              .build(),
            false);
    if(StringUtils.isBlank(symbolId)) {
      return null;
    }

    scope = scope + "." + symbolId;
    traverseParameterList(ctx);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx) {
    String symbolId = findSymbolId(ParserUtils.getLiteralName(CclGrammarParser.MAIN), SymbolKind.MAIN);
    String scopeOrig = scope;
    scope = String.format("%s.%s", scope, symbolId);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitNumericLiteral(CclGrammarParser.NumericLiteralContext ctx) {
    literalPush(ctx, SymbolKind.INT_LIT);
    return super.visitNumericLiteral(ctx);
  }

  @Override
  public Object visitCharacterLiteral(CclGrammarParser.CharacterLiteralContext ctx) {
    literalPush(ctx, SymbolKind.CHAR_LIT);
    return super.visitCharacterLiteral(ctx);
  }

  @Override
  public Object visitStringLiteral(CclGrammarParser.StringLiteralContext ctx) {
    literalPush(ctx, SymbolKind.STR_LIT);
    return super.visitStringLiteral(ctx);
  }

  @Override
  public Object visitBooleanLiteral(CclGrammarParser.BooleanLiteralContext ctx) {
    literalPush(ctx, SymbolKind.BOOL_LIT);
    return super.visitBooleanLiteral(ctx);
  }

  @Override
  public Object visitSpecialLiteral(CclGrammarParser.SpecialLiteralContext ctx) {
    literalPush(ctx, SymbolKind.SPECIAL_LIT);
    return super.visitSpecialLiteral(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    String name = getChildText(ctx);
    duplicate(name, SymbolKind.CLASS);
    return getChildText(ctx);
  }

  @Override
  public Object visitMethodName(CclGrammarParser.MethodNameContext ctx) {
    String name = getChildText(ctx);
    duplicate(
            name, 
            ctx.parent instanceof CclGrammarParser.ConstructorDeclarationContext 
                    ? SymbolKind.CONSTRUCTOR 
                    : SymbolKind.METHOD);
    return getChildText(ctx);
  }

  @Override
  public Object visitName(CclGrammarParser.NameContext ctx) {
    if(ctx == null) {
      throw new IllegalStateException("NameContext cannot be null");
    }
    String name = getChildText(ctx);

    identifierPush(ctx, name);
    identifierExist();
    return getChildText(ctx);
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    String text = getChildText(ctx);
    typePush(ctx, text);
    typeExist();
    return text;
  }

  @Override
  public Object visitMemberRefz(CclGrammarParser.MemberRefzContext ctx) {
    String name = getNameWithoutVisiting(ctx);
    if(ctx == null) {
      throw new IllegalStateException("Member reference cannot be null");
    }
    identifierPush(ctx, name);

    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.FnArrMemberContext)
            .map(context -> (CclGrammarParser.FnArrMemberContext)context)
            .forEach(this::visitFnArrMember);
    referenceExist();
    
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MemberRefzContext)
            .map(context -> (CclGrammarParser.MemberRefzContext)context)
            .forEach(this::visitMemberRefz);
    return null;
  }

  @Override
  public String toString() {
    return String.format("SymbolTable:%n\t%s%nSemantic Action Stack%n\t%s%nOperator Stack%n\t%s",
            symbols.entrySet().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")),
            sas.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")),
            operatorStack.stream()
                    .collect(Collectors.joining("\n\t")));
  }

  @Override
  public Object visitAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx) {
    operatorStack.push(getChildText(ctx));
    return super.visitAssignmentOperation(ctx);
  }

  @Override
  public Object visitBooleanOperation(CclGrammarParser.BooleanOperationContext ctx) {
    operatorStack.push(getChildText(ctx));
    return super.visitBooleanOperation(ctx);
  }

  @Override
  public Object visitMathOperation(CclGrammarParser.MathOperationContext ctx) {
    operatorStack.push(getChildText(ctx));
    return super.visitMathOperation(ctx);
  }

  @Override
  public Object visitInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx) {
    operatorStack.push(getChildText(ctx));
    return super.visitInvokeOperator(ctx);
  }

  @Override
  public Object visitArrayOperator(CclGrammarParser.ArrayOperatorContext ctx) {
    operatorStack.push(getChildText(ctx));
    return super.visitArrayOperator(ctx);
  }

  @Override
  public Object visitArgumentList(CclGrammarParser.ArgumentListContext ctx) {
    balPush(ctx);
    Object result = super.visitArgumentList(ctx);
    endOfArgumentList();
    return result;
  }
}
