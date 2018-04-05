package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.CclGrammarParser;
import io.github.cmansfield.symbols.data.AccessModifier;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Collection;
import java.util.List;


class SymbolTableUtils {
  private SymbolTableUtils() {}
  
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

  static String getType(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    return getReturnType(ctx, visitor);
  }

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
  
  static void visitMethodBody(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.MethodBodyContext)
            .map(context -> (CclGrammarParser.MethodBodyContext)context)
            .forEach(visitor::visitMethodBody);
  }

  static void visitAssignmentExpression(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.AssignmentExpressionContext)
            .map(context -> (CclGrammarParser.AssignmentExpressionContext)context)
            .forEach(visitor::visitAssignmentExpression);
  }
  
  static boolean isArray(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.ArrayOperatorContext)
            .count() > 0;
  }
  
  static boolean isTemplate(ParserRuleContext ctx) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .count() > 0;
  }

  static List<String> getTemplatePlaceHolders(ParserRuleContext ctx, SymbolTableVisitor visitor) {
    return ctx.children.stream()
            .filter(node -> node instanceof CclGrammarParser.TemplateDeclarationContext)
            .map(context -> (CclGrammarParser.TemplateDeclarationContext)context)
            .map(visitor::visitTemplateDeclaration)
            .flatMap(val -> ((List<String>)val).stream())
            .collect(Collectors.toList());
  }
}
