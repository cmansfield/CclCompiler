package io.github.cmansfield.firstpass.symbols;

import io.github.cmansfield.firstpass.symbols.data.AccessModifier;
import io.github.cmansfield.firstpass.symbols.data.Data;
import io.github.cmansfield.firstpass.symbols.data.DataBuilder;
import io.github.cmansfield.parser.ParserUtils;
import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.parser.TemplateVisitor;
import org.apache.commons.collections4.BidiMap;

import java.util.List;


public class TemplateSymbolVisitor extends SymbolTableVisitor implements TemplateVisitor {
  private List<String> templateTypes;

  public TemplateSymbolVisitor(BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts, String scope) {
    super(symbols, templateClassContexts);
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
    return super.visitConstructorDeclaration(ctx);
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
    return super.visitType(ctx);
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
