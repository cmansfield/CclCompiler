package io.github.cmansfield.secondpass;

import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.firstpass.symbols.Symbol;
import org.apache.commons.collections4.map.LinkedMap;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.collections4.BidiMap;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CommonToken;

import java.util.List;


public class TemplateVisitor extends SemanticsVisitor {
  private final List<CclGrammarParser.ClassDeclarationContext> templateClassContexts;
  private final LinkedMap<String,String> templateTypeMap;
  
  public TemplateVisitor(BidiMap<String, Symbol> symbols, List<CclGrammarParser.ClassDeclarationContext> templateClassContexts, LinkedMap<String,String> templateTypeMap) {
    super(symbols);
    this.templateClassContexts = templateClassContexts;
    this.templateTypeMap = templateTypeMap;
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
}
