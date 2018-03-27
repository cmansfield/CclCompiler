// Generated from C:/Users/christopherjman/Documents/CclCompiler/src/main/java/io/github/cmansfield/language/recognition\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.language.recognition;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CclGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MODIFIER=4, PRIMITIVE_TYPE=5, CLASS_NAME=6, TYPE=7, 
		IDENTIFIER=8, STRING_LITTERAL=9, CHARACTER_LITTERAL=10, NUMERIC_LITTERAL=11, 
		WHITESPACE=12, NEWLINE=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MODIFIER", "PRIMITIVE_TYPE", "CLASS_NAME", "TYPE", 
		"IDENTIFIER", "STRING_LITTERAL", "CHARACTER_LITTERAL", "NUMERIC_LITTERAL", 
		"LETTER", "NUMBER", "CHARACTER", "WHITESPACE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MODIFIER", "PRIMITIVE_TYPE", "CLASS_NAME", "TYPE", 
		"IDENTIFIER", "STRING_LITTERAL", "CHARACTER_LITTERAL", "NUMERIC_LITTERAL", 
		"WHITESPACE", "NEWLINE"
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


	public CclGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CclGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\b\3\b\5\bb\n\b\3\t\3\t\3\t\5\tg\n\t\3\n"+
		"\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\5\fw\n\f"+
		"\3\f\3\f\3\r\3\r\3\16\6\16~\n\16\r\16\16\16\177\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\5\21\u0089\n\21\3\21\3\21\5\21\u008d\n\21\3\21\3\21\6\21"+
		"\u0091\n\21\r\21\16\21\u0092\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37\16!\17\3\2\6\4\2--//\4\2"+
		"C\\c|\3\2\62;\4\2\13\13\"\"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2"+
		"\5(\3\2\2\2\7*\3\2\2\2\tD\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17a\3\2\2\2\21"+
		"c\3\2\2\2\23h\3\2\2\2\25q\3\2\2\2\27v\3\2\2\2\31z\3\2\2\2\33}\3\2\2\2"+
		"\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0090\3\2\2\2#$\7o\2\2$%\7c\2\2%&"+
		"\7k\2\2&\'\7p\2\2\'\4\3\2\2\2()\7*\2\2)\6\3\2\2\2*+\7+\2\2+\b\3\2\2\2"+
		",-\7r\2\2-.\7w\2\2./\7d\2\2/\60\7n\2\2\60\61\7k\2\2\61E\7e\2\2\62\63\7"+
		"r\2\2\63\64\7t\2\2\64\65\7k\2\2\65\66\7x\2\2\66\67\7c\2\2\678\7v\2\28"+
		"E\7g\2\29:\7u\2\2:;\7v\2\2;<\7c\2\2<=\7v\2\2=>\7k\2\2>E\7e\2\2?@\7e\2"+
		"\2@A\7q\2\2AB\7p\2\2BC\7u\2\2CE\7v\2\2D,\3\2\2\2D\62\3\2\2\2D9\3\2\2\2"+
		"D?\3\2\2\2E\n\3\2\2\2FG\7k\2\2GH\7p\2\2H\\\7v\2\2IJ\7e\2\2JK\7j\2\2KL"+
		"\7c\2\2L\\\7t\2\2MN\7d\2\2NO\7q\2\2OP\7q\2\2P\\\7n\2\2QR\7u\2\2RS\7v\2"+
		"\2ST\7t\2\2TU\7k\2\2UV\7p\2\2V\\\7i\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z\\"+
		"\7f\2\2[F\3\2\2\2[I\3\2\2\2[M\3\2\2\2[Q\3\2\2\2[W\3\2\2\2\\\f\3\2\2\2"+
		"]^\5\21\t\2^\16\3\2\2\2_b\5\13\6\2`b\5\r\7\2a_\3\2\2\2a`\3\2\2\2b\20\3"+
		"\2\2\2cf\5\31\r\2dg\5\31\r\2eg\5\33\16\2fd\3\2\2\2fe\3\2\2\2fg\3\2\2\2"+
		"g\22\3\2\2\2hl\7$\2\2ik\5\35\17\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\7$\2\2p\24\3\2\2\2qr\7)\2\2rs\5\35\17\2st\7"+
		")\2\2t\26\3\2\2\2uw\t\2\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\33\16\2"+
		"y\30\3\2\2\2z{\t\3\2\2{\32\3\2\2\2|~\t\4\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\34\3\2\2\2\u0081\u0082\13\2\2\2\u0082"+
		"\36\3\2\2\2\u0083\u0084\t\5\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\20\2"+
		"\2\u0086 \3\2\2\2\u0087\u0089\7\17\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091\7\f\2\2\u008b\u008d\7\f\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\7\17"+
		"\2\2\u008f\u0091\7\17\2\2\u0090\u0088\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\21\2\2\u0095\"\3\2\2\2\16\2D[a"+
		"flv\177\u0088\u008c\u0090\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}