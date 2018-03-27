// Generated from C:/Users/christopherjman/Documents/CclCompiler/src/main/java/io/github/cmansfield/language/recognition\CclGrammar.g4 by ANTLR 4.7
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
}