package io.github.cmansfield.symbols;

import io.github.cmansfield.language.recognition.CclGrammarVisitor;
import io.github.cmansfield.language.recognition.CclGrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

public class SymbolTableVisitor implements CclGrammarVisitor {
  @Override
  public Object visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx) {
    return null;
  }

  @Override
  public Object visitImportDeclaration(CclGrammarParser.ImportDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitTemplateDeclaration(CclGrammarParser.TemplateDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitTemplateList(CclGrammarParser.TemplateListContext ctx) {
    return null;
  }

  @Override
  public Object visitClassMemberDeclaration(CclGrammarParser.ClassMemberDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitParameterList(CclGrammarParser.ParameterListContext ctx) {
    return null;
  }

  @Override
  public Object visitParameter(CclGrammarParser.ParameterContext ctx) {
    return null;
  }

  @Override
  public Object visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitMethodBody(CclGrammarParser.MethodBodyContext ctx) {
    return null;
  }

  @Override
  public Object visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitStatement(CclGrammarParser.StatementContext ctx) {
    return null;
  }

  @Override
  public Object visitStatementWithScope(CclGrammarParser.StatementWithScopeContext ctx) {
    return null;
  }

  @Override
  public Object visitAssignmentExpression(CclGrammarParser.AssignmentExpressionContext ctx) {
    return null;
  }

  @Override
  public Object visitTypeCast(CclGrammarParser.TypeCastContext ctx) {
    return null;
  }

  @Override
  public Object visitBraceEnclosedInitializer(CclGrammarParser.BraceEnclosedInitializerContext ctx) {
    return null;
  }

  @Override
  public Object visitNewDeclaration(CclGrammarParser.NewDeclarationContext ctx) {
    return null;
  }

  @Override
  public Object visitExpression(CclGrammarParser.ExpressionContext ctx) {
    return null;
  }

  @Override
  public Object visitFnArrMember(CclGrammarParser.FnArrMemberContext ctx) {
    return null;
  }

  @Override
  public Object visitMemberRefz(CclGrammarParser.MemberRefzContext ctx) {
    return null;
  }

  @Override
  public Object visitExpressionz(CclGrammarParser.ExpressionzContext ctx) {
    return null;
  }

  @Override
  public Object visitAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx) {
    return null;
  }

  @Override
  public Object visitBooleanOperation(CclGrammarParser.BooleanOperationContext ctx) {
    return null;
  }

  @Override
  public Object visitMathOperation(CclGrammarParser.MathOperationContext ctx) {
    return null;
  }

  @Override
  public Object visitInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx) {
    return null;
  }

  @Override
  public Object visitArrayOperator(CclGrammarParser.ArrayOperatorContext ctx) {
    return null;
  }

  @Override
  public Object visitArgumentList(CclGrammarParser.ArgumentListContext ctx) {
    return null;
  }

  @Override
  public Object visitType(CclGrammarParser.TypeContext ctx) {
    return null;
  }

  @Override
  public Object visitClassName(CclGrammarParser.ClassNameContext ctx) {
    return null;
  }

  @Override
  public Object visit(ParseTree tree) {
    return null;
  }

  @Override
  public Object visitChildren(RuleNode node) {
    return null;
  }

  @Override
  public Object visitTerminal(TerminalNode node) {
    return null;
  }

  @Override
  public Object visitErrorNode(ErrorNode node) {
    return null;
  }
}
