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
		"CHARACTER_LITERAL", "NUMERIC_LITERAL", "NUMBER", "LETTER", "CHARACTER", 
		"WHITESPACE", "NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u0133\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u014a"+
		"\n\60\3\61\3\61\3\61\7\61\u014f\n\61\f\61\16\61\u0152\13\61\3\62\3\62"+
		"\7\62\u0156\n\62\f\62\16\62\u0159\13\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\5\64\u0162\n\64\3\64\3\64\3\65\6\65\u0167\n\65\r\65\16\65\u0168"+
		"\3\66\3\66\3\67\3\67\38\38\38\38\39\59\u0174\n9\39\39\69\u0178\n9\r9\16"+
		"9\u0179\39\39\3:\3:\3:\3:\7:\u0182\n:\f:\16:\u0185\13:\3:\3:\3;\3;\3;"+
		"\3;\7;\u018d\n;\f;\16;\u0190\13;\3;\3;\3;\3;\3;\3\u018e\2<\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\67q8s9u:\3\2"+
		"\b\4\2--//\3\2\62;\4\2C\\c|\3\2\"\u0080\4\2\13\13\"\"\4\2\f\f\17\17\2"+
		"\u01a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3"+
		"\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2"+
		"\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008e\3\2\2\2\31\u0094\3\2\2\2"+
		"\33\u0099\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a6\3\2\2\2#\u00ac"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00b4\3\2\2\2)\u00bb\3\2\2\2+\u00c1\3\2\2\2"+
		"-\u00c6\3\2\2\2/\u00cc\3\2\2\2\61\u00d0\3\2\2\2\63\u00d6\3\2\2\2\65\u00db"+
		"\3\2\2\2\67\u00e2\3\2\2\29\u00e9\3\2\2\2;\u00ef\3\2\2\2=\u00f4\3\2\2\2"+
		"?\u00f7\3\2\2\2A\u00f9\3\2\2\2C\u00fc\3\2\2\2E\u00ff\3\2\2\2G\u0101\3"+
		"\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u0107\3\2\2\2O\u010a\3\2\2\2Q\u010d"+
		"\3\2\2\2S\u0110\3\2\2\2U\u0112\3\2\2\2W\u0114\3\2\2\2Y\u0116\3\2\2\2["+
		"\u0118\3\2\2\2]\u0132\3\2\2\2_\u0149\3\2\2\2a\u014b\3\2\2\2c\u0153\3\2"+
		"\2\2e\u015c\3\2\2\2g\u0161\3\2\2\2i\u0166\3\2\2\2k\u016a\3\2\2\2m\u016c"+
		"\3\2\2\2o\u016e\3\2\2\2q\u0177\3\2\2\2s\u017d\3\2\2\2u\u0188\3\2\2\2w"+
		"x\7*\2\2x\4\3\2\2\2yz\7+\2\2z\6\3\2\2\2{|\7\60\2\2|\b\3\2\2\2}~\7=\2\2"+
		"~\n\3\2\2\2\177\u0080\7}\2\2\u0080\f\3\2\2\2\u0081\u0082\7\177\2\2\u0082"+
		"\16\3\2\2\2\u0083\u0084\7.\2\2\u0084\20\3\2\2\2\u0085\u0086\7]\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0088\7_\2\2\u0088\24\3\2\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7t\2\2\u008b\u008c\7w\2\2\u008c\u008d\7g\2\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2"+
		"\u0092\u0093\7g\2\2\u0093\30\3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7"+
		"w\2\2\u0096\u0097\7n\2\2\u0097\u0098\7n\2\2\u0098\32\3\2\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7u\2\2\u009d"+
		"\34\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0\36\3\2\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5 \3\2\2\2\u00a6\u00a7\7y\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7k\2"+
		"\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7"+
		"h\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7t\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\7p\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7y\2\2\u00b3&\3\2\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00b9\7t\2\2\u00b9\u00ba\7p\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2"+
		"\u00c0*\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7c\2"+
		"\2\u00c4\u00c5\7f\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7"+
		"r\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7p\2\2\u00cb."+
		"\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\60\3\2\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7m\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7n\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7m\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7q\2\2"+
		"\u00df\u00e0\7e\2\2\u00e0\u00e1\7m\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7"+
		"k\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7v\2\2\u00e88\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7u\2\2\u00ee"+
		":\3\2\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		">\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb"+
		"\7(\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7~\2\2\u00fd\u00fe\7~\2\2\u00feD\3"+
		"\2\2\2\u00ff\u0100\7-\2\2\u0100F\3\2\2\2\u0101\u0102\7/\2\2\u0102H\3\2"+
		"\2\2\u0103\u0104\7,\2\2\u0104J\3\2\2\2\u0105\u0106\7\61\2\2\u0106L\3\2"+
		"\2\2\u0107\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109N\3\2\2\2\u010a\u010b"+
		"\7>\2\2\u010b\u010c\7?\2\2\u010cP\3\2\2\2\u010d\u010e\7@\2\2\u010e\u010f"+
		"\7?\2\2\u010fR\3\2\2\2\u0110\u0111\7>\2\2\u0111T\3\2\2\2\u0112\u0113\7"+
		"@\2\2\u0113V\3\2\2\2\u0114\u0115\7?\2\2\u0115X\3\2\2\2\u0116\u0117\7A"+
		"\2\2\u0117Z\3\2\2\2\u0118\u0119\7<\2\2\u0119\\\3\2\2\2\u011a\u011b\7r"+
		"\2\2\u011b\u011c\7w\2\2\u011c\u011d\7d\2\2\u011d\u011e\7n\2\2\u011e\u011f"+
		"\7k\2\2\u011f\u0133\7e\2\2\u0120\u0121\7r\2\2\u0121\u0122\7t\2\2\u0122"+
		"\u0123\7k\2\2\u0123\u0124\7x\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2"+
		"\u0126\u0133\7g\2\2\u0127\u0128\7u\2\2\u0128\u0129\7v\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7v\2\2\u012b\u012c\7k\2\2\u012c\u0133\7e\2\2\u012d"+
		"\u012e\7e\2\2\u012e\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7u\2\2"+
		"\u0131\u0133\7v\2\2\u0132\u011a\3\2\2\2\u0132\u0120\3\2\2\2\u0132\u0127"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0133^\3\2\2\2\u0134\u0135\7k\2\2\u0135\u0136"+
		"\7p\2\2\u0136\u014a\7v\2\2\u0137\u0138\7e\2\2\u0138\u0139\7j\2\2\u0139"+
		"\u013a\7c\2\2\u013a\u014a\7t\2\2\u013b\u013c\7d\2\2\u013c\u013d\7q\2\2"+
		"\u013d\u013e\7q\2\2\u013e\u014a\7n\2\2\u013f\u0140\7u\2\2\u0140\u0141"+
		"\7v\2\2\u0141\u0142\7t\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144"+
		"\u014a\7i\2\2\u0145\u0146\7x\2\2\u0146\u0147\7q\2\2\u0147\u0148\7k\2\2"+
		"\u0148\u014a\7f\2\2\u0149\u0134\3\2\2\2\u0149\u0137\3\2\2\2\u0149\u013b"+
		"\3\2\2\2\u0149\u013f\3\2\2\2\u0149\u0145\3\2\2\2\u014a`\3\2\2\2\u014b"+
		"\u0150\5k\66\2\u014c\u014f\5k\66\2\u014d\u014f\5i\65\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151b\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0157\7$\2\2\u0154"+
		"\u0156\5m\67\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\7$\2\2\u015bd\3\2\2\2\u015c\u015d\7)\2\2\u015d\u015e\5m\67\2\u015e"+
		"\u015f\7)\2\2\u015ff\3\2\2\2\u0160\u0162\t\2\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\5i\65\2\u0164h\3\2\2\2"+
		"\u0165\u0167\t\3\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169j\3\2\2\2\u016a\u016b\t\4\2\2\u016b"+
		"l\3\2\2\2\u016c\u016d\t\5\2\2\u016dn\3\2\2\2\u016e\u016f\t\6\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\b8\2\2\u0171p\3\2\2\2\u0172\u0174\7\17\2\2"+
		"\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178"+
		"\7\f\2\2\u0176\u0178\7\17\2\2\u0177\u0173\3\2\2\2\u0177\u0176\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017c\b9\2\2\u017cr\3\2\2\2\u017d\u017e\7\61\2\2\u017e"+
		"\u017f\7\61\2\2\u017f\u0183\3\2\2\2\u0180\u0182\n\7\2\2\u0181\u0180\3"+
		"\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\b:\2\2\u0187t\3\2\2\2\u0188"+
		"\u0189\7\61\2\2\u0189\u018a\7,\2\2\u018a\u018e\3\2\2\2\u018b\u018d\13"+
		"\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018f\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7,"+
		"\2\2\u0192\u0193\7\61\2\2\u0193\u0194\3\2\2\2\u0194\u0195\b;\2\2\u0195"+
		"v\3\2\2\2\17\2\u0132\u0149\u014e\u0150\u0157\u0161\u0168\u0173\u0177\u0179"+
		"\u0183\u018e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}