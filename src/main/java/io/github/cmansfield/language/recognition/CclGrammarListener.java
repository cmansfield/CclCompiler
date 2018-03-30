// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/language/recognition\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.language.recognition;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CclGrammarParser}.
 */
public interface CclGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CclGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CclGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CclGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CclGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(CclGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(CclGrammarParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(CclGrammarParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#templateList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateList(CclGrammarParser.TemplateListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#templateList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateList(CclGrammarParser.TemplateListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(CclGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(CclGrammarParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CclGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CclGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CclGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CclGrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CclGrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(CclGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(CclGrammarParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(CclGrammarParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CclGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CclGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CclGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CclGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CclGrammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void enterTypeCast(CclGrammarParser.TypeCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#typeCast}.
	 * @param ctx the parse tree
	 */
	void exitTypeCast(CclGrammarParser.TypeCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#braceEnclosedInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceEnclosedInitializer(CclGrammarParser.BraceEnclosedInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#braceEnclosedInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceEnclosedInitializer(CclGrammarParser.BraceEnclosedInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#newDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclaration(CclGrammarParser.NewDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#newDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclaration(CclGrammarParser.NewDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CclGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CclGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#fnArrMember}.
	 * @param ctx the parse tree
	 */
	void enterFnArrMember(CclGrammarParser.FnArrMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#fnArrMember}.
	 * @param ctx the parse tree
	 */
	void exitFnArrMember(CclGrammarParser.FnArrMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#memberRefz}.
	 * @param ctx the parse tree
	 */
	void enterMemberRefz(CclGrammarParser.MemberRefzContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#memberRefz}.
	 * @param ctx the parse tree
	 */
	void exitMemberRefz(CclGrammarParser.MemberRefzContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#expressionz}.
	 * @param ctx the parse tree
	 */
	void enterExpressionz(CclGrammarParser.ExpressionzContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#expressionz}.
	 * @param ctx the parse tree
	 */
	void exitExpressionz(CclGrammarParser.ExpressionzContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#assignmentOperation}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperation(CclGrammarParser.AssignmentOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperation(CclGrammarParser.BooleanOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#booleanOperation}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperation(CclGrammarParser.BooleanOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(CclGrammarParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(CclGrammarParser.MathOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#invokeOperator}.
	 * @param ctx the parse tree
	 */
	void enterInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#invokeOperator}.
	 * @param ctx the parse tree
	 */
	void exitInvokeOperator(CclGrammarParser.InvokeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#arrayOperator}.
	 * @param ctx the parse tree
	 */
	void enterArrayOperator(CclGrammarParser.ArrayOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#arrayOperator}.
	 * @param ctx the parse tree
	 */
	void exitArrayOperator(CclGrammarParser.ArrayOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(CclGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(CclGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CclGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CclGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CclGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CclGrammarParser.TypeContext ctx);
}