// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/include\ImportGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.include;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImportGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IMPORT=3, IDENTIFIER=4, WHITESPACE=5, NEWLINE=6, LINE_COMMENT=7, 
		MULTILINE_COMMENT=8;
	public static final int
		RULE_importList = 0, RULE_importDeclaration = 1, RULE_directoryOrFile = 2;
	public static final String[] ruleNames = {
		"importList", "importDeclaration", "directoryOrFile"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "IMPORT", "IDENTIFIER", "WHITESPACE", "NEWLINE", "LINE_COMMENT", 
		"MULTILINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ImportGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImportGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ImportListContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImportGrammarVisitor ) return ((ImportGrammarVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(6);
				importDeclaration();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ImportGrammarParser.IMPORT, 0); }
		public List<DirectoryOrFileContext> directoryOrFile() {
			return getRuleContexts(DirectoryOrFileContext.class);
		}
		public DirectoryOrFileContext directoryOrFile(int i) {
			return getRuleContext(DirectoryOrFileContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImportGrammarVisitor ) return ((ImportGrammarVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(IMPORT);
			setState(13);
			directoryOrFile();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(14);
				match(T__0);
				setState(15);
				directoryOrFile();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectoryOrFileContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ImportGrammarParser.IDENTIFIER, 0); }
		public DirectoryOrFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directoryOrFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImportGrammarVisitor ) return ((ImportGrammarVisitor<? extends T>)visitor).visitDirectoryOrFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectoryOrFileContext directoryOrFile() throws RecognitionException {
		DirectoryOrFileContext _localctx = new DirectoryOrFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directoryOrFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\7\3\23\n\3"+
		"\f\3\16\3\26\13\3\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\32\2\13\3\2\2"+
		"\2\4\16\3\2\2\2\6\31\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t"+
		"\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\5\2\2\17\24\5\6"+
		"\4\2\20\21\7\3\2\2\21\23\5\6\4\2\22\20\3\2\2\2\23\26\3\2\2\2\24\22\3\2"+
		"\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7\4\2\2\30\5\3\2"+
		"\2\2\31\32\7\6\2\2\32\7\3\2\2\2\4\13\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}