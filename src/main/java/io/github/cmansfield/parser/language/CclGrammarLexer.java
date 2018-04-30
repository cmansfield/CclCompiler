// Generated from C:/Users/christopherjman/Documents/CclCompiler/src/main/java/io/github/cmansfield/parser/language\CclGrammar.g4 by ANTLR 4.7
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
		PRIMITIVE_TYPE=10, MODIFIER=11, SPECIAL_LITERAL=12, BOOLEAN_LITERAL=13, 
		PUBLIC=14, PRIVATE=15, STATIC=16, CONST=17, INT=18, CHAR=19, BOOL=20, 
		STRING=21, VOID=22, TRUE=23, FALSE=24, NULL=25, THIS=26, IF=27, ELSE=28, 
		WHILE=29, FOR=30, NEW=31, RETURN=32, PRINT=33, READ=34, SPAWN=35, SET=36, 
		BLOCK=37, LOCK=38, UNLOCK=39, IMPORT=40, CLASS=41, MAIN=42, NOT_EQ=43, 
		NOT=44, AND=45, OR=46, PLUS=47, MINUS=48, MULTI=49, DIV=50, EQUALS=51, 
		LESS_EQ=52, GREAT_EQ=53, LESS=54, GREATER=55, ASSIGN=56, QUESTION=57, 
		COLON=58, IDENTIFIER=59, STRING_LITERAL=60, CHARACTER_LITERAL=61, NUMERIC_LITERAL=62, 
		NUMBER=63, WHITESPACE=64, NEWLINE=65, LINE_COMMENT=66, MULTILINE_COMMENT=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"PRIMITIVE_TYPE", "MODIFIER", "SPECIAL_LITERAL", "BOOLEAN_LITERAL", "PUBLIC", 
		"PRIVATE", "STATIC", "CONST", "INT", "CHAR", "BOOL", "STRING", "VOID", 
		"TRUE", "FALSE", "NULL", "THIS", "IF", "ELSE", "WHILE", "FOR", "NEW", 
		"RETURN", "PRINT", "READ", "SPAWN", "SET", "BLOCK", "LOCK", "UNLOCK", 
		"IMPORT", "CLASS", "MAIN", "NOT_EQ", "NOT", "AND", "OR", "PLUS", "MINUS", 
		"MULTI", "DIV", "EQUALS", "LESS_EQ", "GREAT_EQ", "LESS", "GREATER", "ASSIGN", 
		"QUESTION", "COLON", "IDENTIFIER", "STRING_LITERAL", "CHARACTER_LITERAL", 
		"NUMERIC_LITERAL", "NUMBER", "LETTER", "UNDERSCORE", "CHARACTER", "WHITESPACE", 
		"NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "';'", "'{'", "'}'", "','", "'['", "']'", null, 
		null, null, null, "'public'", "'private'", "'static'", "'const'", "'int'", 
		"'char'", "'bool'", "'string'", "'void'", "'true'", "'false'", "'null'", 
		"'this'", "'if'", "'else'", "'while'", "'for'", "'new'", "'return'", "'print'", 
		"'read'", "'spawn'", "'set'", "'block'", "'lock'", "'unlock'", "'import'", 
		"'class'", "'main'", "'!='", "'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", 
		"'/'", "'=='", "'<='", "'>='", "'<'", "'>'", "'='", "'?'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "PRIMITIVE_TYPE", 
		"MODIFIER", "SPECIAL_LITERAL", "BOOLEAN_LITERAL", "PUBLIC", "PRIVATE", 
		"STATIC", "CONST", "INT", "CHAR", "BOOL", "STRING", "VOID", "TRUE", "FALSE", 
		"NULL", "THIS", "IF", "ELSE", "WHILE", "FOR", "NEW", "RETURN", "PRINT", 
		"READ", "SPAWN", "SET", "BLOCK", "LOCK", "UNLOCK", "IMPORT", "CLASS", 
		"MAIN", "NOT_EQ", "NOT", "AND", "OR", "PLUS", "MINUS", "MULTI", "DIV", 
		"EQUALS", "LESS_EQ", "GREAT_EQ", "LESS", "GREATER", "ASSIGN", "QUESTION", 
		"COLON", "IDENTIFIER", "STRING_LITERAL", "CHARACTER_LITERAL", "NUMERIC_LITERAL", 
		"NUMBER", "WHITESPACE", "NEWLINE", "LINE_COMMENT", "MULTILINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3"+
		"\r\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3<\3<\7<\u0180\n<\f<\16<\u0183\13<\3=\3="+
		"\7=\u0187\n=\f=\16=\u018a\13=\3=\3=\3>\3>\3>\3>\3?\5?\u0193\n?\3?\3?\3"+
		"@\6@\u0198\n@\r@\16@\u0199\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\5C\u01b0\nC\3D\3D\3D\3D\3E\5E\u01b7\nE\3E\3E\6E\u01bb"+
		"\nE\rE\16E\u01bc\3E\3E\3F\3F\3F\3F\7F\u01c5\nF\fF\16F\u01c8\13F\3F\3F"+
		"\3G\3G\3G\3G\7G\u01d0\nG\fG\16G\u01d3\13G\3G\3G\3G\3G\3G\3\u01d1\2H\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081\2\u0083\2\u0085\2\u0087B\u0089C\u008bD\u008d"+
		"E\3\2\b\4\2--//\3\2\62;\4\2C\\c|\7\2\"#%B]]_b}\u0080\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\2\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0087\3\2\2\2\2"+
		"\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091"+
		"\3\2\2\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2"+
		"\2\2\17\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u009f\3\2\2\2\25\u00a6\3\2\2"+
		"\2\27\u00ac\3\2\2\2\31\u00ae\3\2\2\2\33\u00b2\3\2\2\2\35\u00b4\3\2\2\2"+
		"\37\u00bb\3\2\2\2!\u00c3\3\2\2\2#\u00ca\3\2\2\2%\u00d0\3\2\2\2\'\u00d4"+
		"\3\2\2\2)\u00d9\3\2\2\2+\u00de\3\2\2\2-\u00e5\3\2\2\2/\u00ea\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00f5\3\2\2\2\65\u00fa\3\2\2\2\67\u00ff\3\2\2\29\u0102"+
		"\3\2\2\2;\u0107\3\2\2\2=\u010d\3\2\2\2?\u0111\3\2\2\2A\u0115\3\2\2\2C"+
		"\u011c\3\2\2\2E\u0122\3\2\2\2G\u0127\3\2\2\2I\u012d\3\2\2\2K\u0131\3\2"+
		"\2\2M\u0137\3\2\2\2O\u013c\3\2\2\2Q\u0143\3\2\2\2S\u014a\3\2\2\2U\u0150"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0158\3\2\2\2[\u015a\3\2\2\2]\u015d\3\2\2\2_"+
		"\u0160\3\2\2\2a\u0162\3\2\2\2c\u0164\3\2\2\2e\u0166\3\2\2\2g\u0168\3\2"+
		"\2\2i\u016b\3\2\2\2k\u016e\3\2\2\2m\u0171\3\2\2\2o\u0173\3\2\2\2q\u0175"+
		"\3\2\2\2s\u0177\3\2\2\2u\u0179\3\2\2\2w\u017b\3\2\2\2y\u0184\3\2\2\2{"+
		"\u018d\3\2\2\2}\u0192\3\2\2\2\177\u0197\3\2\2\2\u0081\u019b\3\2\2\2\u0083"+
		"\u019d\3\2\2\2\u0085\u01af\3\2\2\2\u0087\u01b1\3\2\2\2\u0089\u01ba\3\2"+
		"\2\2\u008b\u01c0\3\2\2\2\u008d\u01cb\3\2\2\2\u008f\u0090\7*\2\2\u0090"+
		"\4\3\2\2\2\u0091\u0092\7+\2\2\u0092\6\3\2\2\2\u0093\u0094\7\60\2\2\u0094"+
		"\b\3\2\2\2\u0095\u0096\7=\2\2\u0096\n\3\2\2\2\u0097\u0098\7}\2\2\u0098"+
		"\f\3\2\2\2\u0099\u009a\7\177\2\2\u009a\16\3\2\2\2\u009b\u009c\7.\2\2\u009c"+
		"\20\3\2\2\2\u009d\u009e\7]\2\2\u009e\22\3\2\2\2\u009f\u00a0\7_\2\2\u00a0"+
		"\24\3\2\2\2\u00a1\u00a7\5%\23\2\u00a2\u00a7\5\'\24\2\u00a3\u00a7\5)\25"+
		"\2\u00a4\u00a7\5+\26\2\u00a5\u00a7\5-\27\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2"+
		"\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\26\3\2\2\2\u00a8\u00ad\5\35\17\2\u00a9\u00ad\5\37\20\2\u00aa\u00ad\5"+
		"!\21\2\u00ab\u00ad\5#\22\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\30\3\2\2\2\u00ae\u00af\5\63\32"+
		"\2\u00af\32\3\2\2\2\u00b0\u00b3\5/\30\2\u00b1\u00b3\5\61\31\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7w\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7k\2\2"+
		"\u00b9\u00ba\7e\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7r\2\2\u00bc\u00bd\7"+
		"t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7x\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7g\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7e\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7p\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf$\3\2\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3&\3\2\2\2\u00d4"+
		"\u00d5\7e\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7t\2\2"+
		"\u00d8(\3\2\2\2\u00d9\u00da\7d\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7q\2"+
		"\2\u00dc\u00dd\7n\2\2\u00dd*\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7"+
		"v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4"+
		"\7i\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7x\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7f\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7g\2\2\u00ee\60\3\2\2\2\u00ef\u00f0"+
		"\7h\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7w\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7n\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7j\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7u\2\2\u00fe\66\3\2\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7h\2\2\u01018\3\2\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106:\3\2\2\2\u0107"+
		"\u0108\7y\2\2\u0108\u0109\7j\2\2\u0109\u010a\7k\2\2\u010a\u010b\7n\2\2"+
		"\u010b\u010c\7g\2\2\u010c<\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7q\2"+
		"\2\u010f\u0110\7t\2\2\u0110>\3\2\2\2\u0111\u0112\7p\2\2\u0112\u0113\7"+
		"g\2\2\u0113\u0114\7y\2\2\u0114@\3\2\2\2\u0115\u0116\7t\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0118\7v\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u011b\7p\2\2\u011bB\3\2\2\2\u011c\u011d\7r\2\2\u011d\u011e\7t\2\2\u011e"+
		"\u011f\7k\2\2\u011f\u0120\7p\2\2\u0120\u0121\7v\2\2\u0121D\3\2\2\2\u0122"+
		"\u0123\7t\2\2\u0123\u0124\7g\2\2\u0124\u0125\7c\2\2\u0125\u0126\7f\2\2"+
		"\u0126F\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7r\2\2\u0129\u012a\7c\2"+
		"\2\u012a\u012b\7y\2\2\u012b\u012c\7p\2\2\u012cH\3\2\2\2\u012d\u012e\7"+
		"u\2\2\u012e\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130J\3\2\2\2\u0131\u0132"+
		"\7d\2\2\u0132\u0133\7n\2\2\u0133\u0134\7q\2\2\u0134\u0135\7e\2\2\u0135"+
		"\u0136\7m\2\2\u0136L\3\2\2\2\u0137\u0138\7n\2\2\u0138\u0139\7q\2\2\u0139"+
		"\u013a\7e\2\2\u013a\u013b\7m\2\2\u013bN\3\2\2\2\u013c\u013d\7w\2\2\u013d"+
		"\u013e\7p\2\2\u013e\u013f\7n\2\2\u013f\u0140\7q\2\2\u0140\u0141\7e\2\2"+
		"\u0141\u0142\7m\2\2\u0142P\3\2\2\2\u0143\u0144\7k\2\2\u0144\u0145\7o\2"+
		"\2\u0145\u0146\7r\2\2\u0146\u0147\7q\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7v\2\2\u0149R\3\2\2\2\u014a\u014b\7e\2\2\u014b\u014c\7n\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7u\2\2\u014e\u014f\7u\2\2\u014fT\3\2\2\2\u0150\u0151"+
		"\7o\2\2\u0151\u0152\7c\2\2\u0152\u0153\7k\2\2\u0153\u0154\7p\2\2\u0154"+
		"V\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157\7?\2\2\u0157X\3\2\2\2\u0158\u0159"+
		"\7#\2\2\u0159Z\3\2\2\2\u015a\u015b\7(\2\2\u015b\u015c\7(\2\2\u015c\\\3"+
		"\2\2\2\u015d\u015e\7~\2\2\u015e\u015f\7~\2\2\u015f^\3\2\2\2\u0160\u0161"+
		"\7-\2\2\u0161`\3\2\2\2\u0162\u0163\7/\2\2\u0163b\3\2\2\2\u0164\u0165\7"+
		",\2\2\u0165d\3\2\2\2\u0166\u0167\7\61\2\2\u0167f\3\2\2\2\u0168\u0169\7"+
		"?\2\2\u0169\u016a\7?\2\2\u016ah\3\2\2\2\u016b\u016c\7>\2\2\u016c\u016d"+
		"\7?\2\2\u016dj\3\2\2\2\u016e\u016f\7@\2\2\u016f\u0170\7?\2\2\u0170l\3"+
		"\2\2\2\u0171\u0172\7>\2\2\u0172n\3\2\2\2\u0173\u0174\7@\2\2\u0174p\3\2"+
		"\2\2\u0175\u0176\7?\2\2\u0176r\3\2\2\2\u0177\u0178\7A\2\2\u0178t\3\2\2"+
		"\2\u0179\u017a\7<\2\2\u017av\3\2\2\2\u017b\u0181\5\u0081A\2\u017c\u0180"+
		"\5\u0081A\2\u017d\u0180\5\177@\2\u017e\u0180\5\u0083B\2\u017f\u017c\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182x\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0188\7$\2\2\u0185\u0187\5\u0085C\2\u0186\u0185\3\2\2\2\u0187\u018a"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018c\7$\2\2\u018cz\3\2\2\2\u018d\u018e\7)\2\2\u018e"+
		"\u018f\5\u0085C\2\u018f\u0190\7)\2\2\u0190|\3\2\2\2\u0191\u0193\t\2\2"+
		"\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195"+
		"\5\177@\2\u0195~\3\2\2\2\u0196\u0198\t\3\2\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0080\3\2"+
		"\2\2\u019b\u019c\t\4\2\2\u019c\u0082\3\2\2\2\u019d\u019e\7a\2\2\u019e"+
		"\u0084\3\2\2\2\u019f\u01b0\5\u0081A\2\u01a0\u01b0\t\5\2\2\u01a1\u01a2"+
		"\7^\2\2\u01a2\u01b0\7v\2\2\u01a3\u01a4\7^\2\2\u01a4\u01b0\7^\2\2\u01a5"+
		"\u01a6\7^\2\2\u01a6\u01b0\7d\2\2\u01a7\u01a8\7^\2\2\u01a8\u01b0\7\62\2"+
		"\2\u01a9\u01aa\7^\2\2\u01aa\u01b0\7$\2\2\u01ab\u01ac\7^\2\2\u01ac\u01b0"+
		"\7p\2\2\u01ad\u01ae\7^\2\2\u01ae\u01b0\7t\2\2\u01af\u019f\3\2\2\2\u01af"+
		"\u01a0\3\2\2\2\u01af\u01a1\3\2\2\2\u01af\u01a3\3\2\2\2\u01af\u01a5\3\2"+
		"\2\2\u01af\u01a7\3\2\2\2\u01af\u01a9\3\2\2\2\u01af\u01ab\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01b0\u0086\3\2\2\2\u01b1\u01b2\t\6\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u01b4\bD\2\2\u01b4\u0088\3\2\2\2\u01b5\u01b7\7\17\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\7\f"+
		"\2\2\u01b9\u01bb\7\17\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\bE\2\2\u01bf\u008a\3\2\2\2\u01c0\u01c1\7\61\2\2\u01c1"+
		"\u01c2\7\61\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\n\7\2\2\u01c4\u01c3\3"+
		"\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\bF\2\2\u01ca\u008c\3\2"+
		"\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01cd\7,\2\2\u01cd\u01d1\3\2\2\2\u01ce"+
		"\u01d0\13\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d2\3"+
		"\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d5\7,\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\bG"+
		"\2\2\u01d8\u008e\3\2\2\2\21\2\u00a6\u00ac\u00b2\u017f\u0181\u0188\u0192"+
		"\u0199\u01af\u01b6\u01ba\u01bc\u01c6\u01d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}