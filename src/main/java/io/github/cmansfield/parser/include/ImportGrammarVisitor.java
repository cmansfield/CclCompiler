// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/include\ImportGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.include;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImportGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImportGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImportGrammarParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(ImportGrammarParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImportGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ImportGrammarParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImportGrammarParser#directoryOrFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectoryOrFile(ImportGrammarParser.DirectoryOrFileContext ctx);
}