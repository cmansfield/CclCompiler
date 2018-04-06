package io.github.cmansfield.symbols;

import io.github.cmansfield.parser.language.CclGrammarParser;
import io.github.cmansfield.symbols.data.AccessModifier;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Collection;
import java.util.List;


class SymbolTableUtils {
  private SymbolTableUtils() {}

  /**
   * This will get the children from the context and then traverse any modifier nodes and
   * return a list of discovered access modifiers
   * 
   * @param ctx     The current context to search for access modifiers
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        List of found access modifiers
   */
  static List<AccessModifier> getAccessModifiers(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    if(ctx == null || visitor == null) {
      return Collections.emptyList();
    }
    
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ModifierContext)
            .map(context -> (CclGrammarParser.ModifierContext)context)
            .map(visitor::visitModifier)
            .map(am -> (AccessModifier)am)
            .collect(Collectors.toList());
  }

  /**
   * This will get the children from the context and then traverse any type nodes and
   * return a String
   *
   * @param ctx     The current context to search for type nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        A String of the found type
   */
  static String getType(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    return getReturnType(ctx, visitor);
  }

  /**
   * This will get the children from the context and then traverse any type nodes and
   * return a String
   *
   * @param ctx     The current context to search for type nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        A String of the found type
   */
  static String getReturnType(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    if(ctx == null || visitor == null) {
      return null;
    }
    
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TypeContext)
            .map(context -> (CclGrammarParser.TypeContext)context)
            .map(visitor::visitType)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }

  /**
   * This will get the children from the context and then traverse any parameter nodes and
   * return a String List with the symbol IDs of the newly created parameter symbols
   *
   * @param ctx     The current context to search for any parameter nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        A String List of symbol IDs for the newly created parameter symbols
   */
  static List<String> getParameters(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    if(ctx == null || visitor == null) {
      return Collections.emptyList();
    }
    
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ParameterListContext)
            .map(context -> (CclGrammarParser.ParameterListContext)context)
            .map(visitor::visitParameterList)
            .map(val -> (List<String>)val)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
  }

  /**
   * This will get the children from the context and then traverse any class name nodes 
   * and return a class name if found
   *
   * @param ctx     The current context to search for any class name nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        The class name if found, null if not
   */
  static String getClassName(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    if(ctx == null || visitor == null) {
      return null;
    }

    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ClassNameContext)
            .map(context -> (CclGrammarParser.ClassNameContext)context)
            .map(visitor::visitClassName)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }

  /**
   * This will get the children from the context and then traverse any name nodes 
   * and return the name if found
   *
   * @param ctx     The current context to search for any name nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        The name of the node if found, null if not
   */
  static String getName(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    if(ctx == null || visitor == null) {
      return null;
    }
    
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.NameContext)
            .map(context -> (CclGrammarParser.NameContext)context)
            .map(visitor::visitName)
            .map(val -> (String)val)
            .findFirst()
            .orElse(null);
  }

  /**
   * This will get the children from the context and then traverse any method body nodes 
   *
   * @param ctx     The current context to search for any method body nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   */
  static void visitMethodBody(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodBodyContext)
            .map(context -> (CclGrammarParser.MethodBodyContext)context)
            .forEach(visitor::visitMethodBody);
  }

  /**
   * This will get the children from the context and then traverse any assignment expression nodes 
   *
   * @param ctx     The current context to search for any assignment expression nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   */
  static void visitAssignmentExpression(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.AssignmentExpressionContext)
            .map(context -> (CclGrammarParser.AssignmentExpressionContext)context)
            .forEach(visitor::visitAssignmentExpression);
  }

  /**
   * This will get the children from the context and then check for any array nodes 
   * and return true if any are found
   *
   * @param ctx     The current context to search for any array nodes
   * @return        Boolean, if array nodes were found
   */
  static boolean isArray(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ArrayOperatorContext)
            .count() > 0;
  }

  /**
   * This will get the children from the context and then check for any template nodes 
   * and return true if any are found
   *
   * @param ctx     The current context to search for any template nodes
   * @return        Boolean, if template nodes were found
   */
  static boolean isTemplate(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .count() > 0;
  }

  /**
   * This will get the children from the context and then traverse any template nodes and
   * return a String List with all of the found template placeholders
   *
   * @param ctx     The current context to search for any template nodes
   * @param visitor The symbol table visitor, used to traverse the nodes
   * @return        A String List of found template placeholders 
   */
  static List<String> getTemplatePlaceHolders(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .map(visitor::visitTemplateDeclaration)
            .flatMap(val -> ((List<String>)val).stream())
            .collect(Collectors.toList());
  }
}