// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/include\ImportGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.include;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ImportGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ImportGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ImportGrammarVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitImportList(ImportGrammarParser.ImportListContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitImportDeclaration(ImportGrammarParser.ImportDeclarationContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDirectoryOrFile(ImportGrammarParser.DirectoryOrFileContext ctx) { return visitChildren(ctx); }
}