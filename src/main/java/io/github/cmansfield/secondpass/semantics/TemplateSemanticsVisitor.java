package io.github.cmansfield.secondpass.semantics;

import io.github.cmansfield.firstpass.symbols.Symbol.SymbolBuilder;
import io.github.cmansfield.firstpass.symbols.SymbolUtils;
import io.github.cmansfield.secondpass.icode.IntermediateOpcodes;
import io.github.cmansfield.secondpass.icode.Quad.QuadBuilder;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.map.LinkedMap;
import io.github.cmansfield.parser.TemplateVisitor;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import io.github.cmansfield.compiler.Compiler;
import org.apache.commons.lang3.StringUtils;
import io.github.cmansfield.parser.Keyword;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Map;


final class TemplateSemanticsVisitor extends SemanticsVisitor implements TemplateVisitor {
  private final Map<String,String> templateTypeMap;
  private List<String> templateTypes;

  TemplateSemanticsVisitor(Compiler compiler, BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts, String scope, boolean generateComments) {
    super(compiler, symbols, templateClassContexts, generateComments);
    this.templateTypeMap = new LinkedMap<>();
    this.scope = scope;
  }

  /**
   * This method is used to kick off the generation of a newly defined class from 
   * a template class. As soon as this is finished a new class matching the supplied
   * defined template types will be generated
   *
   * @param templateClass   The template class the new class should be modeled after
   * @param templateTypes   The list of defined types to take the place of the 
   *                        template placeholders
   * @param lineNumber      The line number this operation occurred
   */
  @Override
  public void compileTemplateClass(Symbol templateClass, List<String> templateTypes, int lineNumber) {
    this.templateTypes = templateTypes;
    CclGrammarParser.ClassDeclarationContext ctx = templateClassContexts.stream()
            .filter(context -> getNameWithoutVisiting(context)
                    .equals(templateClass.getText()))
            .filter(context -> getTemplatePlaceHolders(context)
                    .equals(templateClass.getData().getTemplatePlaceHolders()))
            .findFirst()
            .orElse(null);
    if(ctx == null) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] Template Semantics: Could not find the template class context matching \'%s%s\'",
              lineNumber,
              templateClass.getText(),
              ParserUtils.templateTextFormat(templateClass.getData().getTemplatePlaceHolders())));
    }

    List<String> templatePlaceHolders = getTemplatePlaceHolders(ctx);

    if(templatePlaceHolders.size() != templateTypes.size()) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] Template Semantics: Number of template visitor's types \'<%s>\' don't match the supplied template class' placeholders \'<%s>\'",
              lineNumber,
              templateTypes.stream().collect(Collectors.joining(", ")),
              templatePlaceHolders.stream().collect(Collectors.joining(", "))));
    }

    for(int i = 0; i < templateTypes.size(); ++i) {
      templateTypeMap.put(
              templatePlaceHolders.get(i),
              templateTypes.get(i));
    }

    ctx.accept(this);
  }

  /**
   * This method will replace all template place holders with the declared template type for 
   * this class creation
   */
  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    String text = getChildText(ctx);
    if(templateTypeMap.containsKey(text)) {
      text = templateTypeMap.get(text);
    }

    List<String> types = getTemplateTypes(
            (CclGrammarParser.DeclaredTemplateTypeContext)ctx.children.stream()
                    .filter(node -> node instanceof CclGrammarParser.DeclaredTemplateTypeContext)
                    .findFirst()
                    .orElse(null));
    // Remove the template types from the SAS
    IntStream.range(0, types.size())
            .forEach(val -> sas.pop());

    // Semantic call #typePush
    typePush(ctx, text, types);
    // Semantic call #typeExist
    typeExist();

    if(!ParserUtils.isPrimitiveType(text)) {
      checkCanBeAccessedFromCurrentScope(symbols.get(sas.peek().getSymbolId()), ctx.start.getLine());
    }
    return text + ParserUtils.templateTextFormat(types);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    String name = getChildText(ctx) + ParserUtils.templateTextFormat(templateTypes);
    duplicate(name, SymbolKind.CLASS);
    return name;
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    String name = getNameWithoutVisiting(ctx) + ParserUtils.templateTextFormat(templateTypes);
    List<String> paramTypes = traverseParameterList(ctx);

    String symbolId = findMethodSymbolId(name, SymbolKind.CONSTRUCTOR, paramTypes);
    checkForInvalidAccessModifiers(symbols.get(symbolId), ctx.start.getLine());     // NOSONAR

    iCode.setNextLabel(symbolId);
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Method.FUNC.toString())
            .operand1(symbolId)
            .comment(SymbolUtils.formatMethodText(symbols, symbols.get(symbolId)))
            .build());
    
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    // Semantic #constructorCheck
    constructorCheck(name);
    // Semantic #paramExist
    paramExist(ctx);

    // Each class constructor must call the class' init constructor
    String initSymbolId = findSymbolId(new SymbolBuilder()
                    .text("_" + name + "_init")
                    .symbolKind(SymbolKind.CONSTRUCTOR)
                    .build(),
            false);

    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Method.FRAME.toString())
            .operand1(initSymbolId)
            .build());
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Stack.PUSH.toString())
            .operand1(Keyword.THIS.toString())
            .build());
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Method.CALL.toString())
            .operand1(initSymbolId)
            .build());
    
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    getType(ctx);
    String name = getNameWithoutVisiting(ctx);
    if(StringUtils.isBlank(name)) {
      throw new IllegalStateException("[Compiler Bug] Method name came back blank, should not be blank after the first pass");
    }
    
    List<String> paramTypes = traverseParameterList(ctx);
    String symbolId = findMethodSymbolId(
            name, 
            SymbolKind.METHOD, 
            paramTypes.stream()
                    .map(param -> {
                      if(templateTypeMap.containsKey(param)) {
                        return templateTypeMap.get(param);
                      }
                      return param;
                    })
                    .collect(Collectors.toList()));
    checkForInvalidAccessModifiers(symbols.get(symbolId), ctx.start.getLine());

    iCode.setNextLabel(symbolId);
    iCode.add(new QuadBuilder()
            .opcode(IntermediateOpcodes.Method.FUNC.toString())
            .operand1(symbolId)
            .comment(SymbolUtils.formatMethodText(symbols, symbols.get(symbolId)))
            .build());
    
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    // Semantic #paramExist
    paramExist(ctx);
    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx) {
    throw new UnsupportedOperationException("Template visitors cannot visit MainDeclarations");
  }

  @Override
  public Object visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    throw new UnsupportedOperationException("Template visitors cannot visit CompilationUnits");
  }
}
