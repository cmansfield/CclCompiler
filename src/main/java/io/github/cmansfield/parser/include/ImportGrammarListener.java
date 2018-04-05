// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/include\ImportGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.include;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImportGrammarParser}.
 */
public interface ImportGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImportGrammarParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(ImportGrammarParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImportGrammarParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(ImportGrammarParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImportGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ImportGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImportGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ImportGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImportGrammarParser#directoryOrFile}.
	 * @param ctx the parse tree
	 */
	void enterDirectoryOrFile(ImportGrammarParser.DirectoryOrFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImportGrammarParser#directoryOrFile}.
	 * @param ctx the parse tree
	 */
	void exitDirectoryOrFile(ImportGrammarParser.DirectoryOrFileContext ctx);
}