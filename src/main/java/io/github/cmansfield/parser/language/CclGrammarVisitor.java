// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/language\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.language;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CclGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CclGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(CclGrammarParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(CclGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(CclGrammarParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#templateList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateList(CclGrammarParser.TemplateListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(CclGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(CclGrammarParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(CclGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CclGrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(CclGrammarParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CclGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#statementWithScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithScope(CclGrammarParser.StatementWithScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(CclGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#typeCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCast(CclGrammarParser.TypeCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(CclGrammarParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#braceEnclosedInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceEnclosedInitializer(CclGrammarParser.BraceEnclosedInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#newDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclaration(CclGrammarParser.NewDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CclGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#fnArrMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnArrMember(CclGrammarParser.FnArrMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#memberRefz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberRefz(CclGrammarParser.MemberRefzContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#expressionz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionz(CclGrammarParser.ExpressionzContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#assignmentOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#booleanOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperation(CclGrammarParser.BooleanOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#mathOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperation(CclGrammarParser.MathOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#invokeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#invokeOperatorEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeOperatorEnd(CclGrammarParser.InvokeOperatorEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#arrayOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOperator(CclGrammarParser.ArrayOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#arrayOperatorEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOperatorEnd(CclGrammarParser.ArrayOperatorEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CclGrammarParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(CclGrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(CclGrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CclGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#templatePlaceHolder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatePlaceHolder(CclGrammarParser.TemplatePlaceHolderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(CclGrammarParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(CclGrammarParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(CclGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(CclGrammarParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CclGrammarParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#characterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(CclGrammarParser.CharacterLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(CclGrammarParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CclGrammarParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CclGrammarParser#specialLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialLiteral(CclGrammarParser.SpecialLiteralContext ctx);
}