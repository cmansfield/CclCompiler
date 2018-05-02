package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.Data;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import io.github.cmansfield.parser.ParserUtils;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.parser.TemplateVisitor;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.map.LinkedMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class TemplateSymbolVisitor extends SymbolTableVisitor implements TemplateVisitor {
  private final Map<String,String> templateTypeMap;
  private List<String> templateTypes;

  public TemplateSymbolVisitor(BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts, String scope) {
    super(symbols, templateClassContexts);
    this.templateTypeMap = new LinkedMap<>();
    this.scope = scope;
  }

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
              "%s : [Compiler Bug] Could not find the template class context matching \'%s%s\'",
              lineNumber,
              templateClass.getText(),
              ParserUtils.templateTextFormat(templateClass.getData().getTemplatePlaceHolders())));
    }
    
    List<String> templatePlaceHolders = getTemplatePlaceHolders(ctx);

    if(templatePlaceHolders.size() != templateTypes.size()) {
      throw new IllegalStateException(String.format(
              "%s : [Compiler Bug] Number of template visitor's types \'<%s>\' don't match the supplied template class' placeholders \'<%s>\'",
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

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.CLASS;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    String name = getClassName(ctx);

    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    Data data = new DataBuilder()
            .accessModifiers(accessModifiers)
            .templatePlaceHolders(templateTypes)
            .build();
    addNewSymbol(
            name,
            SymbolKind.CLASS,
            scopeOrig,
            data,
            symbolId);

    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassMemberDeclarationContext)
            .map(context -> (CclGrammarParser.ClassMemberDeclarationContext)context)
            .forEach(this::visitClassMemberDeclaration);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    SymbolKind symbolKind = SymbolKind.CONSTRUCTOR;
    String symbolId = SymbolIdGenerator.generateId(symbolKind);
    String scopeOrig = scope;
    scope = scope + "." + symbolId;

    // Get the list of template types housed in the class. If the class is a template class
    // then we want the constructor return type to look something like 'ClassName<int>'
    String name = getMethodName(ctx) + ParserUtils.templateTextFormat(templateTypes);
    List<AccessModifier> accessModifiers = getAccessModifiers(ctx);
    List<String> parameters = getParameters(ctx);

    Data data = new DataBuilder()
            .accessModifiers(accessModifiers)
            .parameters(parameters)
            .returnType(name)
            .build();
    addNewSymbol(name, SymbolKind.CONSTRUCTOR, scopeOrig, data, symbolId);

    traverseMethodBody(ctx);
    scope = scopeOrig;

    return null;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    return super.visitMethodDeclaration(ctx);
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    return super.visitClassName(ctx) + ParserUtils.templateTextFormat(templateTypes);
  }

  @Override
  public Object visitMethodName(CclGrammarParser.MethodNameContext ctx) {
    return super.visitMethodName(ctx);
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    String text = (String)super.visitType(ctx);
    if(templateTypeMap.containsKey(text)) {
      text = templateTypeMap.get(text);
    }
    
    return text;
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
