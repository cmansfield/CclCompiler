// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/include\ImportGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.include;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImportGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IMPORT=3, IDENTIFIER=4, WHITESPACE=5, NEWLINE=6, LINE_COMMENT=7, 
		MULTILINE_COMMENT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "IMPORT", "IDENTIFIER", "NUMBER", "LETTER", "WHITESPACE", 
		"NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT"
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


	public ImportGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ImportGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nY\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5&\n\5\f"+
		"\5\16\5)\13\5\3\6\6\6,\n\6\r\6\16\6-\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5\t\67"+
		"\n\t\3\t\3\t\6\t;\n\t\r\t\16\t<\3\t\3\t\3\n\3\n\3\n\3\n\7\nE\n\n\f\n\16"+
		"\nH\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13P\n\13\f\13\16\13S\13\13\3\13"+
		"\3\13\3\13\3\13\3\13\3Q\2\f\3\3\5\4\7\5\t\6\13\2\r\2\17\7\21\b\23\t\25"+
		"\n\3\2\6\3\2\62;\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2^\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\33\3\2\2\2\t\"\3\2\2\2\13"+
		"+\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21:\3\2\2\2\23@\3\2\2\2\25K\3\2\2\2"+
		"\27\30\7\60\2\2\30\4\3\2\2\2\31\32\7=\2\2\32\6\3\2\2\2\33\34\7k\2\2\34"+
		"\35\7o\2\2\35\36\7r\2\2\36\37\7q\2\2\37 \7t\2\2 !\7v\2\2!\b\3\2\2\2\""+
		"\'\5\r\7\2#&\5\r\7\2$&\5\13\6\2%#\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\n\3\2\2\2)\'\3\2\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3"+
		"\2\2\2-.\3\2\2\2.\f\3\2\2\2/\60\t\3\2\2\60\16\3\2\2\2\61\62\t\4\2\2\62"+
		"\63\3\2\2\2\63\64\b\b\2\2\64\20\3\2\2\2\65\67\7\17\2\2\66\65\3\2\2\2\66"+
		"\67\3\2\2\2\678\3\2\2\28;\7\f\2\29;\7\17\2\2:\66\3\2\2\2:9\3\2\2\2;<\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\t\2\2?\22\3\2\2\2@A\7\61\2\2"+
		"AB\7\61\2\2BF\3\2\2\2CE\n\5\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2GI\3\2\2\2HF\3\2\2\2IJ\b\n\2\2J\24\3\2\2\2KL\7\61\2\2LM\7,\2\2MQ\3\2"+
		"\2\2NP\13\2\2\2ON\3\2\2\2PS\3\2\2\2QR\3\2\2\2QO\3\2\2\2RT\3\2\2\2SQ\3"+
		"\2\2\2TU\7,\2\2UV\7\61\2\2VW\3\2\2\2WX\b\13\2\2X\26\3\2\2\2\13\2%\'-\66"+
		":<FQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}