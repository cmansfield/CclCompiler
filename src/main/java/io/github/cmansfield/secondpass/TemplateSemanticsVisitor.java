package io.github.cmansfield.secondpass;

import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.SymbolKind;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.map.LinkedMap;
import io.github.cmansfield.parser.TemplateVisitor;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import io.github.cmansfield.parser.ParserUtils;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CommonToken;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


public class TemplateSemanticsVisitor extends SemanticsVisitor implements TemplateVisitor {
  private final Map<String,String> templateTypeMap;
  private List<String> templateTypes;

  public TemplateSemanticsVisitor(BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts, String scope) {
    super(symbols, templateClassContexts);
    this.templateTypeMap = new LinkedMap<>();
    this.scope = scope;
  }

  /**
   *
   *
   * @param templateClass
   * @param templateTypes
   * @param lineNumber
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

  /**
   * This method will replace all template place holders with the declared template type for 
   * this class creation
   * 
   * @param ctx
   * @return
   */
  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    TerminalNode originalNode = (TerminalNode)ctx.getChild(0);
    String text = getChildText(ctx);
    
    if(templateTypeMap.containsKey(text)) {
      ctx.children.clear();
      CommonToken commonToken = new CommonToken(CclGrammarParser.IDENTIFIER);
      commonToken.setText(templateTypeMap.get(text));
      ctx.children.add(new TerminalNodeImpl(commonToken));
    }
    
    Object type = super.visitType(ctx);
    
    ctx.children.clear();
    ctx.children.add(originalNode);
    
    return type;
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    String name = getChildText(ctx) + ParserUtils.templateTextFormat(templateTypes);
    duplicate(name, SymbolKind.CLASS);
    return name;
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
