package io.github.cmansfield.secondpass;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.data.Data;
import org.apache.commons.collections4.CollectionUtils;
import io.github.cmansfield.parser.CclCompilerVisitor;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import io.github.cmansfield.firstpass.symbols.*;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.parser.Keyword;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CommonToken;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.stream.Collectors;
import java.util.*;


public class SemanticsVisitor extends CclCompilerVisitor {
  private final Logger logger = LoggerFactory.getLogger(SemanticsVisitor.class);
  private final Deque<ParserRuleContext> operatorStack;
  private final Deque<SAR> sas;
  
  private static final int DEFAULT_LINE_NUMBER = -1;

  public SemanticsVisitor(BidiMap<String, Symbol> symbols) {
    super(symbols);
    sas = new LinkedList<>();
    operatorStack = new LinkedList<>();
  }

  Deque<SAR> getSemanticActionStack() {
    return sas == null ? new LinkedList<>() : sas;
  }

  void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * This will walk up from the current scope to try and find the
   * Symbol Id of the Symbol that matches the supplied text
   *
   * @param text    Text of the Symbol to find
   * @param sarType The SarType of the symbol we are searching for
   * @return        The ID of the found Symbol
   */
  String traceScopeToFindSymbolId(String text, SarType sarType, String currentScope, int lineNumber) {
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

    return traceScopeToFindSymbolId(text, found, currentScope, lineNumber);
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
  private String traceScopeToFindSymbolId(String text, List<Symbol> symbolsToFilter, String currentScope, int lineNumber) {
    if(CollectionUtils.isEmpty(symbolsToFilter)) {
      logger.trace("Could not find Symbol \'{}\'", text);
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
        throw new IllegalStateException(String.format(
                "%s : Could not find Symbol \'%s\' in scope \'%s\'",
                lineNumber,
                text,
                SymbolUtils.formatScopeText(symbols, scope)));
      }
      String parentId = SymbolUtils.getParentSymbolId(currentScope);
      Symbol parentSymbol = symbols.get(parentId);
      if(parentSymbol == null) {
        throw new IllegalStateException(String.format(
                "[Compiler Bug] Bad scope \'%s\' symbolId \'%s\' not found",
                currentScope,
                parentId));
      }
      return traceScopeToFindSymbolId(
              text,
              symbolsToFilter,
              parentSymbol.getScope(),
              lineNumber);
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
            new SymbolBuilder()
                    .text(getChildText(ctx))
                    .symbolKind(symbolKind)
                    .scope(GLOBAL_SCOPE)
                    .build(),
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
        throw new IllegalStateException(String.format(
                "%s : Missing SymbolId for SAR: %s", 
                sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
                sar));
      }
      argIds.add(symbolId);
    }
    
    if(sar == null || sar.getType() != SarType.BEGINNING_ARG_LIST) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] End of Argument List called but the SAS is either empty or does not contain a BEGINNING_ARG_LIST Semantic Action Record",
              sar == null ? DEFAULT_LINE_NUMBER : sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER)));
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
      throw new IllegalStateException("[Compiler Bug] SAS is empty when trying to check if an identifier exists");
    }
    SAR sar = sas.pop();
    String symbolId = traceScopeToFindSymbolId(
            sar.getText(),
            SarType.IDENTIFIER,
            scope,
            sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    if(StringUtils.isBlank(symbolId)) {
      symbolId = traceScopeToFindSymbolId(
              sar.getText(),
              SarType.TYPE,
              scope,
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
      sar.setType(SarType.TYPE);
    }
    if(StringUtils.isBlank(symbolId)) {
      throw new IllegalStateException(String.format(
              "%s : The identifier \'%s\' does not exist!",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
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
      throw new IllegalStateException("[Compiler Bug] SAS is empty when trying to check if a type exists");
    }
    SAR sar = sas.pop();
    if(ParserUtils.isPrimitiveType(sar.getText())) {
      sas.push(sar);
      return;
    }
    
    String symbolId = traceScopeToFindSymbolId(
            sar.getText(),
            SarType.TYPE,
            scope,
            sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    if(StringUtils.isBlank(symbolId)) {
      throw new IllegalStateException(String.format(
              "%s : The type \'%s\' does not exist!",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
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
      throw new IllegalStateException("[Compiler Bug] SAS does not have enough SARs when trying to check if a reference exists");
    }
    SAR fieldSar = sas.pop();
    SAR parentSar = sas.pop();
    
    SarType fieldType = fieldSar.getType();
    
    if(fieldType != SarType.IDENTIFIER && fieldType != SarType.METHOD && fieldType != SarType.TEMPORARY) {
      referenceExistException(parentSar, fieldSar, fieldSar.getText() + " is not something that can be referenced");
    }
    
    if(parentSar.getType() == SarType.IDENTIFIER) {
      referenceExistIdentifierBase(parentSar, fieldSar);
    }
    else if(parentSar.getType() == SarType.TYPE) {
      referenceExistTypeBase(parentSar, fieldSar);
    }
    else if(parentSar.getType() == SarType.REFERENCE) {
      referenceExistReferenceBase(parentSar, fieldSar);
    }
    else {
      referenceExistException(parentSar, fieldSar, String.format("\'%s\' is not a object or a class and cannot referenced from", parentSar.getText()));
    }
  }

  /**
   * Supporting method for #referenceExist, will throw a standardized exception for all
   * referenceExist SarTypes
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   * @param message     A unique error message for the reference exception  
   */
  private void referenceExistException(SAR parentSar, SAR fieldSar, String message) {
    throw new IllegalStateException(String.format("%s : %s.%s, %s",
            fieldSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
            parentSar.getText(),
            fieldSar.getText(),
            message));
  }

  /**
   * Supporting method for #referenceExist, this method will find the Symbol for the class
   * field being referenced
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   * @param classId     The Symbol ID of the class that houses the field we are searching for
   * @return            The Symbol object of the field being searched
   */
  private Symbol getFieldSymbol(SAR parentSar, SAR fieldSar, String classId) {
    Symbol classSymbol = symbols.get(classId);
    Symbol filter = new SymbolBuilder()
            .scope(classSymbol.getScope() + "." + classId)
            .text(fieldSar.getText())
            .build();
    List<Symbol> foundSymbols = SymbolFilter.filter(symbols, filter);
    if(foundSymbols.size() != 1) {
      referenceExistException(parentSar, fieldSar, String.format("Too many or too few \'%s\'s in the same scope", fieldSar.getText()));
    }
    return foundSymbols.get(0);
  }

  /**
   * Supporting method for #referenceExist, this will create a new SAR of SarType.REFERENCE
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   * @param classId     The Symbol ID of the class that houses the field
   * @param fieldData   The Data object from the field Symbol
   */
  private void createReferenceSar(SAR parentSar, SAR fieldSar, String classId, Data fieldData) {
    Data refData = new DataBuilder()
            .returnType(fieldData.getReturnType().orElse(""))
            .type(fieldData.getType().orElse(""))
            .isTypeAnArray(fieldData.isTypeAnArray())
            .parameter(classId)
            .parameter(fieldSar.getSymbolId())
            .parameters(fieldSar.getSymbolIds())
            .build();
    Symbol referenceSymbol = addNewSymbol(
            fieldSar.getText(),
            SymbolKind.REFERENCE,
            scope,
            refData);
    SAR refSar = new SAR(
            SarType.REFERENCE,
            referenceSymbol.getSymbolId(),
            referenceSymbol.getText(),
            parentSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    refSar.addSymbolId(classId);
    refSar.addSymbolId(fieldSar.getSymbolId());
    fieldSar.getSymbolIds().forEach(refSar::addSymbolId);
    sas.push(refSar);
  }

  /**
   * Supporting method for #referenceExist
   * The method will handle references where the base is an identifier, usually this
   * is the case when working with instantiated objects. (Ex. employee.getName)
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   */
  private void referenceExistIdentifierBase(SAR parentSar, SAR fieldSar) {
    if(symbols.get(parentSar.getSymbolId()).getData().isTypeAnArray()) {
      referenceExistArrayInstanceBase(parentSar, fieldSar);
    }
    else {
      referenceExistObjectInstanceBase(parentSar, fieldSar);
    }
  }

  /**
   * Supporting method for #referenceExist
   * The method will handle references where the base is an array instance.
   * (Ex. numbers[4])
   *
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   */
  private void referenceExistArrayInstanceBase(SAR parentSar, SAR fieldSar) {
    String arrayType = SymbolUtils.getSymbolType(symbols.get(parentSar.getSymbolId()));

    Symbol arraySymbol = addNewSymbol(
            arrayType,
            SymbolKind.REFERENCE,
            scope,
            new DataBuilder()
                    .type(arrayType)
                    .isTypeAnArray(false)
                    .parameter(parentSar.getSymbolId())
                    .parameter(fieldSar.getSymbolIds().get(0))
                    .build());
    SAR arraySar = new SAR(
            SarType.ARRAY,
            arraySymbol.getSymbolId(),
            arraySymbol.getText(),
            parentSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    arraySar.addSymbolId(parentSar.getSymbolId());
    arraySar.addSymbolId(fieldSar.getSymbolIds().get(0));
    sas.push(arraySar);
  }

  /**
   * Supporting method for #referenceExist
   * The method will handle references where the base is an object instance, usually this
   * is the case when working with instantiated objects. (Ex. employee.getName)
   *
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   */
  private void referenceExistObjectInstanceBase(SAR parentSar, SAR fieldSar) {
    // The parent must be an instantiated object and the field a non-static class member that is visible
    Symbol instanceSymbol = symbols.get(parentSar.getSymbolId());
    String className = instanceSymbol == null ? "" : SymbolUtils.getSymbolType(instanceSymbol);
    String classId = findSymbolId(className, SymbolKind.CLASS);

    if(StringUtils.isBlank(className) || StringUtils.isBlank(classId) || instanceSymbol == null) {
      referenceExistException(parentSar, fieldSar, String.format("instance \'%s\'s class not found", parentSar.getText()));
    }

    Symbol fieldSymbol = getFieldSymbol(parentSar, fieldSar, classId);
    fieldSar.setSymbolId(fieldSymbol.getSymbolId());
    Data fieldData = fieldSymbol.getData();
    List<AccessModifier> accessModifiers = fieldData.getAccessModifiers();

    if(Keyword.THIS.toString().equals(parentSar.getText())) {
      if(accessModifiers.contains(AccessModifier.STATIC)) {
        referenceExistException(parentSar, fieldSar, String.format(
                "Cannot access static \'%s\' from an instance of \'%s\'",
                fieldSar.getText(),
                Keyword.THIS.toString()));
      }
    }
    else if(accessModifiers.contains(AccessModifier.PRIVATE)) {
      referenceExistException(parentSar, fieldSar, String.format("\'%s\' is private and cannot be accessed", fieldSar.getText()));      // NOSONAR
    }

    createReferenceSar(parentSar, fieldSar, classId, fieldData);
  }

  /**
   * Supporting method for #referenceExist
   * The method will handle references where the base is a type, usually this is the 
   * case when working with static class member fields. (Ex. Tax.stateTaxPercentage)
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   */
  private void referenceExistTypeBase(SAR parentSar, SAR fieldSar) {
    String classId = parentSar.getSymbolId();
    Symbol fieldSymbol = getFieldSymbol(parentSar, fieldSar, classId);
    fieldSar.setSymbolId(fieldSymbol.getSymbolId());
    Data fieldData = fieldSymbol.getData();
    List<AccessModifier> accessModifiers = fieldData.getAccessModifiers();
    
    if(accessModifiers.contains(AccessModifier.PRIVATE)) {
      referenceExistException(parentSar, fieldSar, String.format("\'%s\' is private and cannot be accessed", fieldSar.getText()));
    }
    if(!accessModifiers.contains(AccessModifier.STATIC)) {
      referenceExistException(parentSar, fieldSar, String.format("\'%s\' is not static and cannot be accessed in a static context", fieldSar.getText()));
    }

    createReferenceSar(parentSar, fieldSar, classId, fieldData);
  }

  /**
   * Supporting method for #referenceExist
   * The method will handle references where the base is a reference, usually this is the 
   * case when making nested calls, functional programming 
   * (Ex. company.getCeo.getName()) 
   * 
   * @param parentSar   The base SAR in the reference call
   * @param fieldSar    The referenced SAR in the reference call
   */
  private void referenceExistReferenceBase(SAR parentSar, SAR fieldSar) {
    String className = SymbolUtils.getSymbolType(symbols.get(parentSar.getSymbolId()));
    String classId = findSymbolId(className, SymbolKind.CLASS);
    Symbol classSymbol = symbols.get(classId);
    String classScope = classSymbol.getScope() + "." + classId;
    Symbol fieldSymbol = getFieldSymbol(parentSar, fieldSar, classId);
    fieldSar.setSymbolId(fieldSymbol.getSymbolId());
    Data fieldData = fieldSymbol.getData();
    List<AccessModifier> accessModifiers = fieldData.getAccessModifiers();

    if(!fieldSymbol.getScope().contains(classScope)
            && accessModifiers.contains(AccessModifier.PRIVATE)) {
      referenceExistException(parentSar, fieldSar, String.format("\'%s\' is private and cannot be accessed", fieldSar.getText()));
    }

    createReferenceSar(parentSar, fieldSar, classId, fieldData);
  }

  /**
   * #paramExist
   * Check to make sure we don't have any duplicate parameters
   * 
   * @param ctx   The context of where int the tree the visitor currently is
   */
  private void paramExist(ParserRuleContext ctx) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ParameterListContext)
            .map(context -> (CclGrammarParser.ParameterListContext)context)
            .flatMap(context -> context.children.stream())
            .filter(node -> node instanceof CclGrammarParser.ParameterContext)
            .map(context -> (CclGrammarParser.ParameterContext)context)
            .forEach(node -> findSymbolId(
                      new SymbolBuilder()
                              .text(node.children.get(1).getText())
                              .symbolKind(SymbolKind.PARAM)
                              .scope(scope)
                              .build(),
                      true));
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
      throw new IllegalStateException(String.format("[Compiler Bug] There should have been at least one Symbol of %s, found none", name));
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
   * #checkConstructor
   * This method will make sure the class' constructor matches the name
   * of the containing class
   *
   * @param name  The name of the constructor
   */
  private void constructorCheck(String name) {
    if(StringUtils.isBlank(name)) {
      throw new IllegalArgumentException("[Compiler Bug] Constructor name cannot be blank");
    }
    String classId = SymbolUtils.getParentSymbolId(scope);
    Symbol classSymbol = symbols.get(classId);

    if(classSymbol == null) {
      throw new IllegalStateException(String.format(
              "Could not find the class \'%s\' Symbol matching ID \'%s\'",
              name,
              classId));
    }
    if(!name.equals(classSymbol.getText())) {
      throw new IllegalArgumentException(String.format(
              "Constructors for class \'%s\' must have the same name",
              classSymbol.getText()));
    }
  }

  /**
   * #methodCall
   * This semantic all will pop off a argumentListSar and an identifier sar and create a
   * methodCallSar
   */
  private void methodCall() {
    if(CollectionUtils.isEmpty(sas)) {
      throw new IllegalStateException("[Compiler Bug] SAS does not have enough SARs when trying to make a method call");
    }

    SAR argListSar = null;
    if(sas.peek().getType() == SarType.ARG_LIST) {
      argListSar = sas.pop();
    }
    SAR methodNameSar = sas.pop();
    SAR instanceSar = sas.pop();
    
    String classType = SymbolUtils.getSymbolType(symbols.get(instanceSar.getSymbolId()));
    Symbol classSymbol = symbols.get(findSymbolId(classType, SymbolKind.CLASS));
    if(classSymbol == null) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the class for method \'%s\'",
              methodNameSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              methodNameSar.getText()));
    }
    
    methodExist(methodNameSar, argListSar, classSymbol, SymbolKind.METHOD, Keyword.THIS.toString().equalsIgnoreCase(instanceSar.getText()));
  }

  /**
   * #integerCast
   * This method will check to see if the top SAR on the SAS can be
   * cast to an integer
   */
  void integerCast() {
    if(CollectionUtils.isEmpty(sas)) {
      throw new IllegalStateException("[Compiler Bug] SAS does not have enough SARs when trying to make an integer cast");
    }
    String integerType = Keyword.INT.toString();
    SAR sar = sas.pop();
    Symbol symbol = symbols.get(sar.getSymbolId());
    String type = SymbolUtils.getSymbolType(symbol);

    if(!type.equals(Keyword.CHAR.toString())) {
      throw new UnsupportedOperationException(String.format(
              "%s : Cannot cast type \'%s\' to \'%s\' at this time",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              type,
              integerType));
    }

    String tempSymbolId = SymbolIdGenerator.generateId(SymbolKind.TEMPORARY);
    String tempText = String.format("cast %s to %s",
            type,
            integerType);
    Data tempData = new DataBuilder()
            .type(integerType)
            .build();
    addNewSymbol(
            tempText,
            SymbolKind.TEMPORARY,
            scope,
            tempData,
            tempSymbolId);

    SAR tempSar = new SAR(
            SarType.TEMPORARY,
            tempSymbolId,
            tempText,
            sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    tempSar.addSymbolId(sar.getSymbolId());
    sas.push(tempSar);
  }

  /**
   * #charCast
   * This method will check to see if the top SAR on the SAS can be
   * cast to a character
   */
  void charCast() {
    if(CollectionUtils.isEmpty(sas)) {
      throw new IllegalStateException("[Compiler Bug] SAS does not have enough SARs when trying to make an integer cast");
    }
    String charType = Keyword.CHAR.toString();
    SAR sar = sas.pop();
    Symbol symbol = symbols.get(sar.getSymbolId());
    String type = SymbolUtils.getSymbolType(symbol);

    if(!type.equals(Keyword.INT.toString())) {
      throw new UnsupportedOperationException(String.format(
              "%s : Cannot cast type \'%s\' to \'%s\' at this time",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              type,
              charType));
    }

    String tempSymbolId = SymbolIdGenerator.generateId(SymbolKind.TEMPORARY);
    String tempText = String.format("cast %s to %s",
            type,
            charType);
    Data tempData = new DataBuilder()
            .type(charType)
            .build();
    addNewSymbol(
            tempText,
            SymbolKind.TEMPORARY,
            scope,
            tempData,
            tempSymbolId);

    SAR tempSar = new SAR(
            SarType.TEMPORARY,
            tempSymbolId,
            tempText,
            sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    tempSar.addSymbolId(sar.getSymbolId());
    sas.push(tempSar);
  }

  private void operatorException(int lineNumber, String operation, String operator, String op1Type, String op1Text, String op2Type, String op2Text) {
    throw new IllegalStateException(String.format(
            "%s : Cannot perform %s operation \'%s%s %s %s%s\'",
            lineNumber,
            operation,
            op2Type,
            op2Type.equals(op2Text) ? "" : " " + op2Text,
            operator,
            op1Type,
            op1Type.equals(op1Text) ? "" : " " + op1Text));
  }
  
  /**
   * This will evaluate the given operator and check to make sure it can be used with the top
   * two SARs on the SAS, after it will create a new temporary Symbol and SAR
   * 
   * @param operatorCtx   The context of the operator
   */
  private void evaluateOperator(ParserRuleContext operatorCtx) {      // NOSONAR
    if(CollectionUtils.isEmpty(sas) || sas.size() < 2) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] There are not enough SARs on the SAS while trying to evaluate operand \'%s\'", 
              operatorCtx.start.getLine(),
              getChildText(operatorCtx)));
    }
    
    String operator = getChildText(operatorCtx);
    String tempType = null;
    
    SAR operand1 = sas.pop();
    SAR operand2 = sas.pop();
    
    Symbol op1Symbol = symbols.get(operand1.getSymbolId());
    Symbol op2Symbol = symbols.get(operand2.getSymbolId());
    
    String op1Type = SymbolUtils.getSymbolType(op1Symbol);
    String op2Type = SymbolUtils.getSymbolType(op2Symbol);
    
    if(op1Symbol == null || op2Symbol == null) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the Symbol for \'%s\' or \'%s\'",
              operand1.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              operand1.getText(),
              operand2.getText()));
    }
    
    if(operatorCtx instanceof CclGrammarParser.MathOperationContext) {
      if(!Keyword.INT.toString().equals(op1Type) || !Keyword.INT.toString().equals(op2Type)) {
        operatorException(operatorCtx.start.getLine(), "math", operator, op1Type, op1Symbol.getText(), op2Type, op2Symbol.getText());
      }
      
      tempType = Keyword.INT.toString();
    }
    else if(operatorCtx instanceof CclGrammarParser.BooleanOperationContext) {
      if(Keyword.AND.toString().equals(operator) || Keyword.OR.toString().equals(operator)) {
        if(!Keyword.BOOL.toString().equals(op1Type) || !Keyword.BOOL.toString().equals(op2Type)) {
          operatorException(operatorCtx.start.getLine(), "boolean", operator, op1Type, op1Symbol.getText(), op2Type, op2Symbol.getText());
        }
      }
      else if(Keyword.NULL.toString().equals(op1Type) && !ParserUtils.isPrimitiveType(op2Type)) {      // NOSONAR
        // Then we are comparing an object to null
        // employee == null
      }
      else if(!ParserUtils.isPrimitiveType(op1Type) || !ParserUtils.isPrimitiveType(op2Type)) {
        operatorException(operatorCtx.start.getLine(), "boolean", operator, op1Type, op1Symbol.getText(), op2Type, op2Symbol.getText());
      }

      tempType = Keyword.BOOL.toString();
    }
    else if(operatorCtx instanceof CclGrammarParser.AssignmentOperationContext) {
      if(!op1Type.equals(op2Type)) {
        if(!ParserUtils.isPrimitiveType(op2Type) && Keyword.NULL.toString().equals(op1Type)) {
          // Object assignment of null
          // employee = null
          sas.push(operand2);
          return;
        }
        operatorException(operatorCtx.start.getLine(), "assignment", operator, op1Type, op1Symbol.getText(), op2Type, op2Symbol.getText());
      }
      
      sas.push(operand2);
      return;
    }
    else {
      logger.warn("Not sure how to evaluate operator {}", getChildText(operatorCtx));
    }

    String tempText = String.format("(%s %s %s)",
            op2Symbol.getText(),
            operator,
            op1Symbol.getText());
    Symbol tempSymbol = addNewSymbol(
            tempText,
            SymbolKind.TEMPORARY,
            scope, new DataBuilder()
                    .isTypeAnArray(op1Symbol.getData().isTypeAnArray())
                    .type(tempType)
                    .build());
    SAR tempSar = new SAR(
            SarType.TEMPORARY,
            tempSymbol.getSymbolId(),
            tempText,
            operatorCtx.start.getLine());
    tempSar.addSymbolId(op2Symbol.getSymbolId());
    tempSar.addSymbolId(op1Symbol.getSymbolId());
    sas.push(tempSar);
  }

  /**
   * This will push the supplied operator onto the operator stack. It will continue to process
   * operators on the operator stack until the stack is empty or the top operator has a lower
   * precedence than the operator being pushed on
   * 
   * @param operatorCtx     The context of the operator
   */
  private void pushOperatorOntoStack(ParserRuleContext operatorCtx) {
    if(operatorCtx == null) {
      throw new IllegalArgumentException("[Compiler Bug] Operators pushed onto the operator stack cannot be null");
    }
    String operator = getChildText(operatorCtx);
    if("(".equals(operator) || "[".equals(operator)) {
      operatorStack.push(operatorCtx);
      
      if(logger.isTraceEnabled()) {
        logger.trace("Operator Stack after adding \'{}\': [{}]",
                getChildText(operatorCtx),
                operatorStack.stream()
                        .map(this::getChildText)
                        .collect(Collectors.joining(", ")));
      }
      return;
    }

    ParserRuleContext stackOperator;
    while(CollectionUtils.isNotEmpty(operatorStack) 
            && operatorPrecedence(stackOperator = operatorStack.peek()) >= operatorPrecedence(operatorCtx)) {
      
      // Eval stackOperator
      evaluateOperator(stackOperator);
      
      operatorStack.pop();
    }

    operatorStack.push(operatorCtx);     // NOSONAR
    
    if(logger.isTraceEnabled()) {
      logger.trace("Operator Stack after adding \'{}\': [{}]",
              getChildText(operatorCtx),
              operatorStack.stream()
                      .map(this::getChildText)
                      .collect(Collectors.joining(", ")));
    }
  }

  /**
   * This method will return the precedence value for the supplied operator
   * 
   * @param ctx         Operator to evaluate
   * @return            The precedence value for the supplied operator
   */
  private int operatorPrecedence(ParserRuleContext ctx) {
    String operator = getChildText(ctx);
    
    if(StringUtils.isBlank(operator)) {
      return -1;
    }
    if(operator.equals(Keyword.ASSIGN.toString())) {
      return 0;
    }
    if(operator.equals(Keyword.OR.toString())) {
      return 1;
    }
    if(operator.equals(Keyword.AND.toString())) {
      return 2;
    }
    if(operator.equals(Keyword.EQUALS.toString())
            ||operator.equals(Keyword.NOT_EQ.toString())) {
      return 3;
    }
    if(operator.equals(Keyword.LESS.toString())
            || operator.equals(Keyword.GREATER.toString()) 
            || operator.equals(Keyword.LESS_EQ.toString()) 
            || operator.equals(Keyword.GREAT_EQ.toString())) {
      return 4;
    }
    if(operator.equals(Keyword.PLUS.toString()) 
            || operator.equals(Keyword.MINUS.toString())) {
      return 5;
    }
    if(operator.equals(Keyword.MULTI.toString())
            || operator.equals(Keyword.DIV.toString())) {
      return 6;
    }
    
    return -1;
  }
  
  /**
   * #EOE
   * EndOfExpression, this method will pop operators off the operator stack and process the
   * required SARs from the SAS for that operation 
   */
  private void endOfExpression() {
    while(CollectionUtils.isNotEmpty(operatorStack) && !"(".equals(getChildText(operatorStack.peek()))) {
      evaluateOperator(operatorStack.pop());
    }
  }

  /**
   * #closingParenthesis
   * closingParenthesis, this method will pop operators off the operator stack and process the
   * required SARs from the SAS for that operation until an opening parenthesis is found
   */
  private void closingParenthesis() {
    while(CollectionUtils.isNotEmpty(operatorStack) && !"(".equals(getChildText(operatorStack.peek()))) {
      evaluateOperator(operatorStack.pop());
    }
    if(CollectionUtils.isEmpty(operatorStack)) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] Could not find a matching opening parenthesis on the operator stack",
              sas.isEmpty() ? DEFAULT_LINE_NUMBER : sas.peek().getLineNumber().orElse(DEFAULT_LINE_NUMBER)));
    }

    // Remove the opening paren from the stack
    operatorStack.pop();
  }

  /**
   * #arrayClose
   * This method will pop operators off the operator stack and process the required SARs from 
   * the SAS for that operation until an opening bracket is found
   */
  private void arrayClose() {
    while(CollectionUtils.isNotEmpty(operatorStack) && !"[".equals(getChildText(operatorStack.peek()))) {
      evaluateOperator(operatorStack.pop());
    }
    if(CollectionUtils.isEmpty(operatorStack)) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] Could not find a matching opening \'[\' on the operator stack",
              sas.isEmpty() ? DEFAULT_LINE_NUMBER : sas.peek().getLineNumber().orElse(DEFAULT_LINE_NUMBER)));
    }

    // Remove the opening bracket from the stack
    operatorStack.pop();
  }

  /**
   * #array
   * This method will pop off an integer sar and an object sar from the sas and check to 
   * make sure this is a valid array reference, will create a new temp sar to be pushed 
   * onto the sas
   */
  private void array() {
    SAR indexSar = sas.pop();
    SAR objSar = sas.pop();

    Symbol indexSymbol = symbols.get(indexSar.getSymbolId());
    Symbol objSymbol = symbols.get(objSar.getSymbolId());

    String indexType = SymbolUtils.getSymbolType(indexSymbol);
    String objType = SymbolUtils.getSymbolType(objSymbol);
    objType = StringUtils.isBlank(objType) ? objSar.getText() : objType;
    
    if(indexSymbol == null) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the Symbol \'%s\'",
              indexSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              indexSar.getText()));
    }
    if(!Keyword.INT.toString().equals(indexType)) {
      throw new IllegalStateException(String.format(
              "%s : Expecting array index type \'%s\' found \'%s[%s]\'",
              indexSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              indexType,
              objType,
              Keyword.INT.toString()));
    }

    String tempType = objType.substring(0, objType.length() - 2);     // Need to remove the '[]' from the end of the type
    Symbol tempSymbol = addNewSymbol(
            tempType,
            SymbolKind.TEMPORARY, 
            scope, 
            new DataBuilder()
                    .parameter(indexSymbol.getSymbolId())
                    .isTypeAnArray(false)
                    .type(tempType)
                    .build());
    SAR tempSar = new SAR(
            SarType.TEMPORARY, 
            tempSymbol.getSymbolId(), 
            tempSymbol.getText(), 
            indexSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    tempSar.addSymbolId(indexSymbol.getSymbolId());
    sas.push(tempSar);
  }
  
  /**
   * #print
   * This method processes everything on the operator stack and checks to
   * see if the top SAR can be printed
   */
  private void print() {
    int lineNumber = sas.isEmpty() ? DEFAULT_LINE_NUMBER : sas.peek().getLineNumber().orElse(DEFAULT_LINE_NUMBER);
    
    endOfExpression();

    if(CollectionUtils.isEmpty(sas)) {
      throw new IllegalStateException(String.format(
              "%s : Print statements cannot be empty",
              lineNumber));
    }

    SAR sar = sas.pop();
    Symbol symbol = symbols.get(sar.getSymbolId());

    if(symbol == null) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the Symbol \'%s\' for the print statement",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              sar.getSymbolId()));
    }

    String type = SymbolUtils.getSymbolType(symbol);
    if(!ParserUtils.isPrimitiveType(type)) {
      throw new IllegalStateException(String.format(
              "%s : Cannot print type \'%s\'",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              type));
    }
  }

  /**
   * #read
   * This method processes everything on the operator stack and checks to
   * see if the top SAR can store a read value
   */
  private void read() {
    int lineNumber = sas.isEmpty() ? DEFAULT_LINE_NUMBER : sas.peek().getLineNumber().orElse(DEFAULT_LINE_NUMBER);
    
    endOfExpression();

    if(CollectionUtils.isEmpty(sas)) {
      throw new IllegalStateException(String.format(
              "%s : Read statements cannot be empty",
              lineNumber));
    }

    SAR sar = sas.pop();
    Symbol symbol = symbols.get(sar.getSymbolId());

    if(symbol == null) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the Symbol \'%s\' for the read statement",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              sar.getSymbolId()));
    }

    String type = SymbolUtils.getSymbolType(symbol);
    if(!Keyword.INT.toString().equals(type) && !Keyword.CHAR.toString().equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : Cannot store read value into type \'%s\'",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              type));
    }
  }

  /**
   * #return
   * This method processes everything on the operator stack and checks to
   * see if the top SAR can be returned by the method
   */
  private void semanticReturn() {
    Symbol symbol = null;
    SAR sar = null;
            
    endOfExpression();

    if(CollectionUtils.isNotEmpty(sas)) {
      sar = sas.pop();
      symbol = symbols.get(sar.getSymbolId());
    }
    if(symbol == null) {
      return;
    }

    String type = SymbolUtils.getSymbolType(symbol);
    
    Symbol methodSymbol;
    String workingScope = scope;
    while((methodSymbol = symbols.get(SymbolUtils.getParentSymbolId(workingScope))).getSymbolKind() 
            != SymbolKind.METHOD) {
      workingScope = methodSymbol.getScope();
    }
    
    String returnType = methodSymbol
            .getData()
            .getReturnType()
            .orElse("");
    
    if(!returnType.equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : Cannot return type \'%s\' from method \'%s\'",
              sar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              type,
              SymbolUtils.formatMethodText(symbols, methodSymbol)));
    }
  }

  /**
   * #if
   * This will pop off the top SAR from the SAS and ensure it's a boolean type
   */
  private void semanticIf() {
    SAR booleanSar = sas.pop();
    Symbol booleanSymbol = symbols.get(booleanSar.getSymbolId());
    String type = SymbolUtils.getSymbolType(booleanSymbol);

    if(!Keyword.BOOL.toString().equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : \'%s\' statement requires type \'%s\' found \'%s(%s)\'",
              booleanSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.IF.toString(),
              Keyword.BOOL.toString(),
              Keyword.IF.toString(),
              type));
    }
  }

  /**
   * #ternary
   * The method will pop off a boolean, if, and else SARs from the SAS and check
   * to make sure they are of the expected types
   */
  private void ternary() {
    SAR elseSar = sas.pop();
    SAR ifSar = sas.pop();
    SAR booleanSar = sas.pop();

    Symbol booleanSymbol = symbols.get(booleanSar.getSymbolId());
    Symbol ifSymbol = symbols.get(ifSar.getSymbolId());
    Symbol elseSymbol = symbols.get(elseSar.getSymbolId());

    String type = SymbolUtils.getSymbolType(booleanSymbol);
    String ifType = SymbolUtils.getSymbolType(ifSymbol);
    String elseType = SymbolUtils.getSymbolType(elseSymbol);

    if(StringUtils.isBlank(ifType) || StringUtils.isBlank(elseType)) {
      throw new IllegalStateException("[Compiler Bug] Ternary types should not be blank");
    }
    if(!Keyword.BOOL.toString().equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : The first ternary expression must be type \'%s\', found \'%s ? %s : %s\'",
              elseSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.BOOL.toString(),
              type,
              ifType,
              elseType));
    }
    if(!ifType.equals(elseType)) {
      throw new IllegalStateException(String.format(
              "%s : Ternary expressions must return the same type, found \'%s ? %s : %s\'",
              elseSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.BOOL.toString(),
              ifType,
              elseType));
    }

    Symbol tempSymbol = addNewSymbol(
            String.format("%s ? %s : %s", type, ifType, elseType),
            SymbolKind.TEMPORARY,
            scope,
            new DataBuilder()
                    .parameter(booleanSymbol.getSymbolId())
                    .parameter(ifSymbol.getSymbolId())
                    .parameter(elseSymbol.getSymbolId())
                    .isTypeAnArray(false)
                    .type(ifType)
                    .build());
    SAR tempSar = new SAR(
            SarType.TEMPORARY,
            tempSymbol.getSymbolId(),
            tempSymbol.getText(),
            booleanSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    tempSar.addSymbolId(booleanSymbol.getSymbolId());
    tempSar.addSymbolId(ifSymbol.getSymbolId());
    tempSar.addSymbolId(elseSymbol.getSymbolId());
    sas.push(tempSar);
  }

  /**
   * #while
   * This will pop off the top SAR from the SAS and ensure it's a boolean type
   */
  private void semanticWhile() {
    SAR booleanSar = sas.pop();
    Symbol booleanSymbol = symbols.get(booleanSar.getSymbolId());
    String type = SymbolUtils.getSymbolType(booleanSymbol);

    if(!Keyword.BOOL.toString().equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : \'%s\' statement requires type \'%s\' found \'%s(%s)\'",
              booleanSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.WHILE.toString(),
              Keyword.BOOL.toString(),
              Keyword.WHILE.toString(),
              type));
    }
  }

  /**
   * #for
   * Semantic 'for' will check to make sure the second expression of a for-loop
   * is a boolean expression
   */
  private void semanticFor() {
    SAR booleanSar = sas.pop();
    Symbol booleanSymbol = symbols.get(booleanSar.getSymbolId());
    String type = SymbolUtils.getSymbolType(booleanSymbol);

    if(!Keyword.BOOL.toString().equals(type)) {
      throw new IllegalStateException(String.format(
              "%s : The second expression of a \'%s-loop\' must be of type \'%s\', found \'%s( ; %s; )\'",
              booleanSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.FOR.toString(),
              Keyword.BOOL.toString(),
              Keyword.FOR.toString(),
              type));
    }

    sas.push(booleanSar);
  }

  /**
   * #newObject
   * This semantic call will pop a TYPE sar off of the sas and a argList sar if one exists
   * After it will check to make sure the constructor exists and then create a new constructor
   * sar
   */
  private void newObject() {
    SAR argListSar = null;
    SAR typeSar;
    
    if(sas.peek().getType() == SarType.ARG_LIST) {
      argListSar = sas.pop();
    }
    typeSar = sas.pop();
    if(typeSar.getType() != SarType.TYPE) {
      throw new IllegalStateException(String.format(
              "%s : Expecting a SAR type \'TYPE\', found \'%s\'",
              typeSar.getLineNumber(),
              typeSar.getType().toString()));
    }
    
    Symbol classSymbol = symbols.get(typeSar.getSymbolId());
    methodExist(typeSar, argListSar, classSymbol, SymbolKind.CONSTRUCTOR, false);
  }

  /**
   * #methodExist
   * This method will check to make sure the method being called exists in the context it's being used
   * If it exists and is accessible then a new method SAR will be placed on the SAS
   * 
   * @param typeSar       The type of Sar pulled off the sas
   * @param argListSar    The argument list sar if one exists
   * @param classSymbol   The Symbol of the class that houses the method being called
   * @param symbolKind    The type of method being called (constructor, or method)
   */
  private void methodExist(SAR typeSar, SAR argListSar, Symbol classSymbol, SymbolKind symbolKind, boolean isThis) {
    List<String> argList = argListSar == null
            ? Collections.emptyList()
            : argListSar.getSymbolIds();
    List<String> argListTypes = argList.stream()
            .map(id -> SymbolUtils.getSymbolType(symbols.get(id)))
            .collect(Collectors.toList());

    List<Symbol> found = SymbolFilter.filter(
            symbols,
            new SymbolBuilder()
                    .scope(classSymbol.getScope() + "." + classSymbol.getSymbolId())
                    .symbolKind(symbolKind)
                    .text(typeSar.getText())
                    .build());
    // Filter out methods that don't have matching parameters 
    found = found.stream()
            .filter(symbol -> symbol.getData().getParameters().stream()
                    .map(symbols::get)
                    .map(Symbol::getData)
                    .map(Data::getType)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList()).equals(argListTypes))
            .collect(Collectors.toList());
    if(CollectionUtils.isEmpty(found)) {
      throw new IllegalStateException(String.format(
              "%s : Could not find method that matching \'%s(%s)\'",
              typeSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              typeSar.getText(),
              argListTypes.stream().collect(Collectors.joining(", "))));
    }
    Symbol symbol = found.get(0);
    if(found.size() > 1) {
      throw new IllegalStateException(String.format(
              "%s : Found too many methods matching \'%s\'",
              typeSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              SymbolUtils.formatMethodText(symbols, symbol)));
    }
    if(!isThis
            && symbol.getData().getAccessModifiers().contains(AccessModifier.PRIVATE)
            && !scope.contains(symbol.getScope())) {
      throw new IllegalStateException(String.format(
              "%s : %s \'%s\' is private and cannot be accessed",
              typeSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              symbol.getSymbolKind().toString(),
              SymbolUtils.formatMethodText(symbols, symbol)));
    }

    SAR methodSar = new SAR(
            SarType.METHOD,
            symbol.getSymbolId(),
            symbol.getText(),
            typeSar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    if(CollectionUtils.isNotEmpty(argList)) {
      argList.forEach(methodSar::addSymbolId);
    }
    sas.push(methodSar);
  }

  /**
   * #newArray
   * This will pop a quantity sar and a type sar off of the SAS and check to make sure a valid
   * array object can be instantiated
   */
  private void newArray() {
    if(CollectionUtils.isEmpty(sas) || sas.size() < 2) {
      throw new IllegalStateException("[Compiler Bug] There are not enough SARs on the SAS while trying to create a new array");
    }
    SAR quantitySar = sas.pop();
    SAR typeSar = sas.pop();

    Symbol quantitySymbol = symbols.get(quantitySar.getSymbolId());
    Symbol typeSymbol = symbols.get(typeSar.getSymbolId());
    
    String quantityType = SymbolUtils.getSymbolType(quantitySymbol);
    String type = typeSymbol == null ? typeSar.getText() : SymbolUtils.getSymbolType(typeSymbol);
    
    if(StringUtils.isBlank(quantityType) || StringUtils.isBlank(type)) {
      throw new IllegalStateException(String.format(
              "%s : Could not find the type for \'%s\' or \'%s\'",
              quantitySar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              typeSar.getText(),
              quantitySar.getText()));
    }
    // Check quantity
    if(!Keyword.INT.toString().equals(quantityType)) {
      throw new IllegalStateException(String.format(
              "%s : Cannot create array \'%s %s[%s]\', size specifier must be of type \'%s\'",
              quantitySar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
              Keyword.NEW.toString(),
              type,
              quantityType,
              Keyword.INT.toString()));
    }
    // Check type
    String classId;
    if(!ParserUtils.isPrimitiveType(type)) {
      classId = findSymbolId(type, SymbolKind.CLASS);
      if(StringUtils.isBlank(classId)) {
        throw new IllegalStateException(String.format(
                "%s : Cannot create array \'%s %s[%s]\', unknown type \'%s\'",
                quantitySar.getLineNumber().orElse(DEFAULT_LINE_NUMBER),
                Keyword.NEW.toString(),
                type,
                Keyword.INT.toString(),
                type));
      }
    }

    Symbol tempSymbol = addNewSymbol(
            String.format("%s %s[]", Keyword.NEW.toString(), type), 
            SymbolKind.TEMPORARY,
            scope, 
            new DataBuilder()
                    .parameter(quantitySymbol.getSymbolId())
                    .isTypeAnArray(true)
                    .type(type)
                    .build());
    SAR tempSar = new SAR(
            SarType.ARRAY, 
            tempSymbol.getSymbolId(), 
            tempSymbol.getText(), 
            quantitySar.getLineNumber().orElse(DEFAULT_LINE_NUMBER));
    tempSar.addSymbolId(quantitySymbol.getSymbolId());
    sas.push(tempSar);
  }
  
  /*
  **************************************
  *           Overridden methods
  **************************************
 */

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
    
    // Semantic call #EOE
    endOfExpression();
    
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
      throw new IllegalArgumentException("[Compiler Bug] There must be child nodes at this point in the tree");
    }
    ParseTree child = ctx.getChild(0);

    if("{".equals(child.getText())) {
      blockStatement(ctx);
    }
    else if(Keyword.FOR.toString().equals(child.getText())) {
      forStatement(ctx);
    }
    else {
      throw new IllegalStateException(
              String.format("[Compiler Bug] Unknown statement \"%s\" found", StringUtils.isBlank(child.getText()) ? "" : child.getText()));
    }

    return null;
  }

  /**
   * Moved the logic for the 'for' statement into its own method
   *
   * @param ctx   The 'for' statement context
   */
  private void forStatement(CclGrammarParser.StatementWithScopeContext ctx) {
    String scopeOrig = scope;
    String symbolId = SymbolIdGenerator.generateId(SymbolKind.FOR);
    scope = scope + "." + symbolId;

    Data data = new DataBuilder().accessModifier(AccessModifier.PRIVATE).build();
    addNewSymbol(symbolId, SymbolKind.FOR, scopeOrig, data, symbolId);

    boolean isSecondSemicolon = false;
    for(ParseTree child : ctx.children) {
      child.accept(this);
      endOfExpression();

      if(";".equals(child.getText())) {
        if(!isSecondSemicolon) {
          isSecondSemicolon = true;
        }
        else {
          // Check to make sure the second for-loop expression is a
          // boolean type
          semanticFor();         // Semantic call #for
        }
      }
    }
    scope = scopeOrig;
  }

  /**
   * Moved the logic for a block statement into its own method
   *
   * @param ctx   A block statement context
   */
  private void blockStatement(ParserRuleContext ctx) {
    String scopeOrig = scope;
    String symbolId = SymbolIdGenerator.generateId(SymbolKind.BLOCK);
    scope = scope + "." + symbolId;

    Data data = new DataBuilder().accessModifier(AccessModifier.PRIVATE).build();
    addNewSymbol(symbolId, SymbolKind.BLOCK, scopeOrig, data, symbolId);

    for(ParseTree child : ctx.children) {
      child.accept(this);
    }

    scope = scopeOrig;
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
    String name = getNameWithoutVisiting(ctx);
    List<String> paramTypes = traverseParameterList(ctx);
    
    String scopeOrig = scope;
    String symbolId = findMethodSymbolId(name, SymbolKind.CONSTRUCTOR, paramTypes);
    scope = scope + "." + symbolId;
    
    // Semantic #constructorCheck
    constructorCheck(name);
    // Semantic #paramExist
    paramExist(ctx);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {     // NOSONAR
    getType(ctx);
    String name = getNameWithoutVisiting(ctx);
    List<String> paramTypes = traverseParameterList(ctx);
    if(StringUtils.isBlank(name)) {
      throw new IllegalStateException("[Compiler Bug] Method name came back blank, should not be blank after the first pass");
    }
    
    String scopeOrig = scope;
    String symbolId = findMethodSymbolId(name, SymbolKind.METHOD, paramTypes);
    scope = scope + "." + symbolId;

    // Semantic #paramExist
    paramExist(ctx);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx) {
    String symbolId = findSymbolId(Keyword.MAIN.toString(), SymbolKind.MAIN);
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
      throw new IllegalStateException("[Compiler Bug] NameContext cannot be null");
    }
    String name = getChildText(ctx);

    identifierPush(ctx, name);
    identifierExist();
    return getChildText(ctx);
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    String text = getChildText(ctx);
    // Semantic call #typePush
    typePush(ctx, text);
    // Semantic call #typeExist
    typeExist();
    return text;
  }

  @Override
  public Object visitMemberRefz(CclGrammarParser.MemberRefzContext ctx) {
    String name = getNameWithoutVisiting(ctx);
    if(ctx == null) {
      throw new IllegalStateException("[Compiler Bug] Member reference cannot be null");
    }
    identifierPush(ctx, name);

    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.FnArrMemberContext)
            .map(context -> (CclGrammarParser.FnArrMemberContext)context)
            .forEach(this::visitFnArrMember);
    boolean isMethodCall = ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.FnArrMemberContext)
            .map(context -> (CclGrammarParser.FnArrMemberContext)context)
            .flatMap(context -> context.children.stream())
            .anyMatch(node -> node instanceof CclGrammarParser.InvokeOperatorContext);
    if(isMethodCall) {
      methodCall();       // Semantic method
    }
    else {
      referenceExist();   // Semantic method
    }
    
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MemberRefzContext)
            .map(context -> (CclGrammarParser.MemberRefzContext)context)
            .forEach(this::visitMemberRefz);
    return null;
  }

  @Override
  public String toString() {
    return String.format("SymbolTable:%n\t%s%nSemantic Action Stack%n\t%s",
            symbols.entrySet().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")),
            sas.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("\n\t")));
  }

  @Override
  public Object visitAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx) {
    pushOperatorOntoStack(ctx);
    super.visitAssignmentOperation(ctx);
    endOfExpression();
    
    return null;
  }

  @Override
  public Object visitBooleanOperation(CclGrammarParser.BooleanOperationContext ctx) {
    pushOperatorOntoStack(ctx);
    return super.visitBooleanOperation(ctx);
  }

  @Override
  public Object visitMathOperation(CclGrammarParser.MathOperationContext ctx) {
    pushOperatorOntoStack(ctx);
    return super.visitMathOperation(ctx);
  }

  @Override
  public Object visitInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx) {
    pushOperatorOntoStack(ctx);
    return super.visitInvokeOperator(ctx);
  }

  @Override
  public Object visitArrayOperator(CclGrammarParser.ArrayOperatorContext ctx) {
    pushOperatorOntoStack(ctx);
    return super.visitArrayOperator(ctx);
  }

  @Override
  public Object visitArgumentList(CclGrammarParser.ArgumentListContext ctx) {
    balPush(ctx);
    Object result = super.visitArgumentList(ctx);
    endOfArgumentList();
    return result;
  }

  @Override
  public Object visitFieldDeclaration(CclGrammarParser.FieldDeclarationContext ctx) {
    getName(ctx);

    super.visitFieldDeclaration(ctx);
    
    // Semantic call #EOE
    endOfExpression();
    
    return null;
  }

  @Override
  public Object visitSelf(CclGrammarParser.SelfContext ctx) {
    String workingScope = scope;
    Symbol symbol = null;
    String classId;

    while(StringUtils.isNotBlank(classId = SymbolUtils.getParentSymbolId(workingScope))) {
      symbol = symbols.get(classId);
      if(symbol.getSymbolKind() == SymbolKind.CLASS) {
        break;
      }
      workingScope = symbol.getScope(); 
    }

    if(symbol == null || symbol.getSymbolKind() != SymbolKind.CLASS) {
      throw new IllegalStateException(String.format(
              "%s : The keyword \'%s\' cannot be used here", 
              ctx.start.getLine(),
              Keyword.THIS.toString()));
    }

    // Push 'this'
    sas.push(new SAR(
            SarType.REFERENCE,
            symbol.getSymbolId(),
            Keyword.THIS.toString(),
            ctx.start.getLine()));

    return super.visitSelf(ctx);
  }

  @Override
  public Object visitCast(CclGrammarParser.CastContext ctx) {
    return ctx.children.get(1).getText();
  }

  @Override
  public Object visitTypeCast(CclGrammarParser.TypeCastContext ctx) {
    String type = ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.CastContext)
            .map(context -> (CclGrammarParser.CastContext)context)
            .map(this::visitCast)
            .map(value -> (String)value)
            .findFirst()
            .orElse("");
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ExpressionContext)
            .map(context -> (CclGrammarParser.ExpressionContext)context)
            .forEach(this::visitExpression);

    if(type.equals(Keyword.INT.toString())) {
      integerCast();
    }
    else if(type.equals(Keyword.CHAR.toString())) {
      charCast();
    }
    else {
      throw new UnsupportedOperationException(String.format(
              "Casting to type \'%s\' is not supported at this time",
              type));
    }
    return null;
  }

  @Override
  public Object visitParameter(CclGrammarParser.ParameterContext ctx) {
    return getChildText(ctx); 
  }

  @Override
  public Object visitInvokeOperatorEnd(CclGrammarParser.InvokeOperatorEndContext ctx) {
    closingParenthesis();   // Semantic call #closingParenthesis
    return null;
  }

  @Override
  public Object visitArrayOperatorEnd(CclGrammarParser.ArrayOperatorEndContext ctx) {
    arrayClose();         // Semantic call #arrayClose
    return null;
  }

  @Override
  public Object visitStatement(CclGrammarParser.StatementContext ctx) {
    String text = getChildText(ctx);
    
    if(Keyword.PRINT.toString().equals(text)) {
      super.visitStatement(ctx);
      print();              // Semantic call #print
    }
    else if(Keyword.READ.toString().equals(text)) {
      super.visitStatement(ctx);
      read();               // Semantic call #read
    }
    else if(Keyword.RETURN.toString().equals(text)) {
      super.visitStatement(ctx);
      semanticReturn();     // Semantic call #return
    }
    else if(Keyword.IF.toString().equals(text)) {
      ifStatement(ctx);
    }
    else if(Keyword.WHILE.toString().equals(text)) {
      whileStatement(ctx);
    }
    else {
      super.visitStatement(ctx);
    }

    endOfExpression();      // Clear the operator stack
    
    return null;
  }

  /**
   * Moved the logic for the 'while' statement into its own method
   *
   * @param ctx   The 'while' statement context
   */
  private void whileStatement(CclGrammarParser.StatementContext ctx) {
    ParseTree child;
    Iterator<ParseTree> childIter = ctx.children.iterator();
    while(!((child = childIter.next()) instanceof CclGrammarParser.StatementContext)) {
      child.accept(this);
    }
    semanticWhile();         // Semantic call #while

    // Visit 'while' statement
    child.accept(this);
  }

  /**
   * Moved the logic for the 'if' statement into its own method
   *
   * @param ctx   The 'if' statement context
   */
  private void ifStatement(CclGrammarParser.StatementContext ctx) {
    ParseTree child;
    Iterator<ParseTree> childIter = ctx.children.iterator();
    while(!((child = childIter.next()) instanceof CclGrammarParser.StatementContext)) {
      child.accept(this);
    }
    semanticIf();         // Semantic call #if

    // Visit 'if' statement and 'else' statement if one exists
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.StatementContext)
            .map(context -> (CclGrammarParser.StatementContext)context)
            .forEach(this::visitStatement);
  }

  @Override
  public Object visitNewDeclaration(CclGrammarParser.NewDeclarationContext ctx) {
    super.visitNewDeclaration(ctx);
    ParseTree childNode = ctx.children.get(0);
    
    if(childNode instanceof CclGrammarParser.InvokeOperatorContext) {
      // Creating a new object
      newObject();      // Semantic call #newObject
    }
    else if(childNode instanceof CclGrammarParser.ArrayOperatorContext) {
      // create a new array
      newArray();       // Semantic call #newArray
    }
    else {
      throw new UnsupportedOperationException("[Compiler Bug] Unknown operation");      
    }
    
    return null;
  }

  @Override
  public Object visitFnArrMember(CclGrammarParser.FnArrMemberContext ctx) {
    super.visitFnArrMember(ctx);

    if(ctx.children.get(0) instanceof CclGrammarParser.ArrayOperatorContext) {
      array();              // Semantic call #array
    }

    return null;
  }

  @Override
  public Object visitExpression(CclGrammarParser.ExpressionContext ctx) {

    // Then this is a ternary expression
    if(ctx.getChild(0) instanceof CclGrammarParser.ExpressionContext) {
      // TODO - Refactor this to avoid creating a new context
      CommonToken commonToken = new CommonToken(CclGrammarParser.BLOCK);
      commonToken.setText("(");
      CclGrammarParser.AssignmentOperationContext assignContext = new CclGrammarParser.AssignmentOperationContext(null, 0);
      assignContext.children = new ArrayList<>();
      assignContext.children.add(new TerminalNodeImpl(commonToken));
      pushOperatorOntoStack(assignContext);

      for(ParseTree child : ctx.children) {
        child.accept(this);
        endOfExpression();
      }

      visitInvokeOperatorEnd(null);
      ternary();       // Semantic #ternary

      endOfExpression();
    }
    else {
      super.visitExpression(ctx);
    }

    return null;
  }
}
