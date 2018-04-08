// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/language\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.language;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TRUE=10, FALSE=11, NULL=12, THIS=13, IF=14, ELSE=15, WHILE=16, FOR=17, 
		NEW=18, RETURN=19, PRINT=20, READ=21, SPAWN=22, SET=23, BLOCK=24, LOCK=25, 
		UNLOCK=26, IMPORT=27, CLASS=28, MAIN=29, NOT_EQ=30, NOT=31, AND=32, OR=33, 
		PLUS=34, MINUS=35, MULTI=36, DIV=37, EQUALS=38, LESS_EQ=39, GREAT_EQ=40, 
		LESS=41, GREATER=42, ASSIGN=43, QUESTION=44, COLON=45, MODIFIER=46, PRIMITIVE_TYPE=47, 
		IDENTIFIER=48, STRING_LITERAL=49, CHARACTER_LITERAL=50, NUMERIC_LITERAL=51, 
		NUMBER=52, WHITESPACE=53, NEWLINE=54, LINE_COMMENT=55, MULTILINE_COMMENT=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"TRUE", "FALSE", "NULL", "THIS", "IF", "ELSE", "WHILE", "FOR", "NEW", 
		"RETURN", "PRINT", "READ", "SPAWN", "SET", "BLOCK", "LOCK", "UNLOCK", 
		"IMPORT", "CLASS", "MAIN", "NOT_EQ", "NOT", "AND", "OR", "PLUS", "MINUS", 
		"MULTI", "DIV", "EQUALS", "LESS_EQ", "GREAT_EQ", "LESS", "GREATER", "ASSIGN", 
		"QUESTION", "COLON", "MODIFIER", "PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITERAL", 
		"CHARACTER_LITERAL", "NUMERIC_LITERAL", "NUMBER", "LETTER", "UNDERSCORE", 
		"CHARACTER", "WHITESPACE", "NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "';'", "'{'", "'}'", "','", "'['", "']'", "'true'", 
		"'false'", "'null'", "'this'", "'if'", "'else'", "'while'", "'for'", "'new'", 
		"'return'", "'print'", "'read'", "'spawn'", "'set'", "'block'", "'lock'", 
		"'unlock'", "'import'", "'class'", "'main'", "'!='", "'!'", "'&&'", "'||'", 
		"'+'", "'-'", "'*'", "'/'", "'=='", "'<='", "'>='", "'<'", "'>'", "'='", 
		"'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
		"NULL", "THIS", "IF", "ELSE", "WHILE", "FOR", "NEW", "RETURN", "PRINT", 
		"READ", "SPAWN", "SET", "BLOCK", "LOCK", "UNLOCK", "IMPORT", "CLASS", 
		"MAIN", "NOT_EQ", "NOT", "AND", "OR", "PLUS", "MINUS", "MULTI", "DIV", 
		"EQUALS", "LESS_EQ", "GREAT_EQ", "LESS", "GREATER", "ASSIGN", "QUESTION", 
		"COLON", "MODIFIER", "PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITERAL", 
		"CHARACTER_LITERAL", "NUMERIC_LITERAL", "NUMBER", "WHITESPACE", "NEWLINE", 
		"LINE_COMMENT", "MULTILINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01ab\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0135\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u014c\n\60\3\61\3\61\3\61\3\61\7\61\u0152\n\61\f\61\16\61\u0155\13\61"+
		"\3\62\3\62\7\62\u0159\n\62\f\62\16\62\u015c\13\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\5\64\u0165\n\64\3\64\3\64\3\65\6\65\u016a\n\65\r\65\16"+
		"\65\u016b\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\58\u0182\n8\39\39\39\39\3:\5:\u0189\n:\3:\3:\6:\u018d\n:\r:\16"+
		":\u018e\3:\3:\3;\3;\3;\3;\7;\u0197\n;\f;\16;\u019a\13;\3;\3;\3<\3<\3<"+
		"\3<\7<\u01a2\n<\f<\16<\u01a5\13<\3<\3<\3<\3<\3<\3\u01a3\2=\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\67s8u9w:"+
		"\3\2\b\4\2--//\3\2\62;\4\2C\\c|\7\2\"#%B]]_b}\u0080\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\2\u01c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2"+
		"\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21"+
		"\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u0090\3\2\2\2\31\u0096"+
		"\3\2\2\2\33\u009b\3\2\2\2\35\u00a0\3\2\2\2\37\u00a3\3\2\2\2!\u00a8\3\2"+
		"\2\2#\u00ae\3\2\2\2%\u00b2\3\2\2\2\'\u00b6\3\2\2\2)\u00bd\3\2\2\2+\u00c3"+
		"\3\2\2\2-\u00c8\3\2\2\2/\u00ce\3\2\2\2\61\u00d2\3\2\2\2\63\u00d8\3\2\2"+
		"\2\65\u00dd\3\2\2\2\67\u00e4\3\2\2\29\u00eb\3\2\2\2;\u00f1\3\2\2\2=\u00f6"+
		"\3\2\2\2?\u00f9\3\2\2\2A\u00fb\3\2\2\2C\u00fe\3\2\2\2E\u0101\3\2\2\2G"+
		"\u0103\3\2\2\2I\u0105\3\2\2\2K\u0107\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2"+
		"\2\2Q\u010f\3\2\2\2S\u0112\3\2\2\2U\u0114\3\2\2\2W\u0116\3\2\2\2Y\u0118"+
		"\3\2\2\2[\u011a\3\2\2\2]\u0134\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c"+
		"\u0156\3\2\2\2e\u015f\3\2\2\2g\u0164\3\2\2\2i\u0169\3\2\2\2k\u016d\3\2"+
		"\2\2m\u016f\3\2\2\2o\u0181\3\2\2\2q\u0183\3\2\2\2s\u018c\3\2\2\2u\u0192"+
		"\3\2\2\2w\u019d\3\2\2\2yz\7*\2\2z\4\3\2\2\2{|\7+\2\2|\6\3\2\2\2}~\7\60"+
		"\2\2~\b\3\2\2\2\177\u0080\7=\2\2\u0080\n\3\2\2\2\u0081\u0082\7}\2\2\u0082"+
		"\f\3\2\2\2\u0083\u0084\7\177\2\2\u0084\16\3\2\2\2\u0085\u0086\7.\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7]\2\2\u0088\22\3\2\2\2\u0089\u008a\7_\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e"+
		"\u008f\7g\2\2\u008f\26\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\30\3\2\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7w\2\2\u0098\u0099\7n\2\2\u0099\u009a\7n\2\2"+
		"\u009a\32\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e\7"+
		"k\2\2\u009e\u009f\7u\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7g\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa"+
		"\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\"\3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"$\3\2\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"&\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7p\2\2\u00bc(\3\2\2\2\u00bd"+
		"\u00be\7r\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2"+
		"\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7f\2\2\u00c7,\3\2\2\2\u00c8\u00c9\7"+
		"u\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7q\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7m\2\2\u00d7\62\3\2\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7m\2\2\u00dc"+
		"\64\3\2\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7m\2\2\u00e3\66\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7r\2\2\u00e7\u00e8\7q\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9\u00ea\7v\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7e\2"+
		"\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0"+
		"\7u\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4"+
		"\7k\2\2\u00f4\u00f5\7p\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8>\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa@\3\2\2\2\u00fb\u00fc\7"+
		"(\2\2\u00fc\u00fd\7(\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7~\2\2\u00ff\u0100"+
		"\7~\2\2\u0100D\3\2\2\2\u0101\u0102\7-\2\2\u0102F\3\2\2\2\u0103\u0104\7"+
		"/\2\2\u0104H\3\2\2\2\u0105\u0106\7,\2\2\u0106J\3\2\2\2\u0107\u0108\7\61"+
		"\2\2\u0108L\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7?\2\2\u010bN\3\2\2"+
		"\2\u010c\u010d\7>\2\2\u010d\u010e\7?\2\2\u010eP\3\2\2\2\u010f\u0110\7"+
		"@\2\2\u0110\u0111\7?\2\2\u0111R\3\2\2\2\u0112\u0113\7>\2\2\u0113T\3\2"+
		"\2\2\u0114\u0115\7@\2\2\u0115V\3\2\2\2\u0116\u0117\7?\2\2\u0117X\3\2\2"+
		"\2\u0118\u0119\7A\2\2\u0119Z\3\2\2\2\u011a\u011b\7<\2\2\u011b\\\3\2\2"+
		"\2\u011c\u011d\7r\2\2\u011d\u011e\7w\2\2\u011e\u011f\7d\2\2\u011f\u0120"+
		"\7n\2\2\u0120\u0121\7k\2\2\u0121\u0135\7e\2\2\u0122\u0123\7r\2\2\u0123"+
		"\u0124\7t\2\2\u0124\u0125\7k\2\2\u0125\u0126\7x\2\2\u0126\u0127\7c\2\2"+
		"\u0127\u0128\7v\2\2\u0128\u0135\7g\2\2\u0129\u012a\7u\2\2\u012a\u012b"+
		"\7v\2\2\u012b\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d\u012e\7k\2\2\u012e"+
		"\u0135\7e\2\2\u012f\u0130\7e\2\2\u0130\u0131\7q\2\2\u0131\u0132\7p\2\2"+
		"\u0132\u0133\7u\2\2\u0133\u0135\7v\2\2\u0134\u011c\3\2\2\2\u0134\u0122"+
		"\3\2\2\2\u0134\u0129\3\2\2\2\u0134\u012f\3\2\2\2\u0135^\3\2\2\2\u0136"+
		"\u0137\7k\2\2\u0137\u0138\7p\2\2\u0138\u014c\7v\2\2\u0139\u013a\7e\2\2"+
		"\u013a\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u014c\7t\2\2\u013d\u013e"+
		"\7d\2\2\u013e\u013f\7q\2\2\u013f\u0140\7q\2\2\u0140\u014c\7n\2\2\u0141"+
		"\u0142\7u\2\2\u0142\u0143\7v\2\2\u0143\u0144\7t\2\2\u0144\u0145\7k\2\2"+
		"\u0145\u0146\7p\2\2\u0146\u014c\7i\2\2\u0147\u0148\7x\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014a\7k\2\2\u014a\u014c\7f\2\2\u014b\u0136\3\2\2\2\u014b"+
		"\u0139\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0147\3\2"+
		"\2\2\u014c`\3\2\2\2\u014d\u0153\5k\66\2\u014e\u0152\5k\66\2\u014f\u0152"+
		"\5i\65\2\u0150\u0152\5m\67\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154b\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015a\7$\2\2\u0157\u0159"+
		"\5o8\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7$"+
		"\2\2\u015ed\3\2\2\2\u015f\u0160\7)\2\2\u0160\u0161\5o8\2\u0161\u0162\7"+
		")\2\2\u0162f\3\2\2\2\u0163\u0165\t\2\2\2\u0164\u0163\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5i\65\2\u0167h\3\2\2\2\u0168"+
		"\u016a\t\3\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016cj\3\2\2\2\u016d\u016e\t\4\2\2\u016el\3\2"+
		"\2\2\u016f\u0170\7a\2\2\u0170n\3\2\2\2\u0171\u0182\5k\66\2\u0172\u0182"+
		"\t\5\2\2\u0173\u0174\7^\2\2\u0174\u0182\7v\2\2\u0175\u0176\7^\2\2\u0176"+
		"\u0182\7^\2\2\u0177\u0178\7^\2\2\u0178\u0182\7d\2\2\u0179\u017a\7^\2\2"+
		"\u017a\u0182\7\62\2\2\u017b\u017c\7^\2\2\u017c\u0182\7$\2\2\u017d\u017e"+
		"\7^\2\2\u017e\u0182\7p\2\2\u017f\u0180\7^\2\2\u0180\u0182\7t\2\2\u0181"+
		"\u0171\3\2\2\2\u0181\u0172\3\2\2\2\u0181\u0173\3\2\2\2\u0181\u0175\3\2"+
		"\2\2\u0181\u0177\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017b\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0181\u017f\3\2\2\2\u0182p\3\2\2\2\u0183\u0184\t\6\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0186\b9\2\2\u0186r\3\2\2\2\u0187\u0189\7\17"+
		"\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018d\7\f\2\2\u018b\u018d\7\17\2\2\u018c\u0188\3\2\2\2\u018c\u018b\3"+
		"\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\b:\2\2\u0191t\3\2\2\2\u0192\u0193\7\61\2\2"+
		"\u0193\u0194\7\61\2\2\u0194\u0198\3\2\2\2\u0195\u0197\n\7\2\2\u0196\u0195"+
		"\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b;\2\2\u019cv\3\2\2\2\u019d"+
		"\u019e\7\61\2\2\u019e\u019f\7,\2\2\u019f\u01a3\3\2\2\2\u01a0\u01a2\13"+
		"\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7,"+
		"\2\2\u01a7\u01a8\7\61\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b<\2\2\u01aa"+
		"x\3\2\2\2\20\2\u0134\u014b\u0151\u0153\u015a\u0164\u016b\u0181\u0188\u018c"+
		"\u018e\u0198\u01a3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}