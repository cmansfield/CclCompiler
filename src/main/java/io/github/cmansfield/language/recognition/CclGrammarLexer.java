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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, MODIFIER=43, PRIMITIVE_TYPE=44, 
		IDENTIFIER=45, STRING_LITTERAL=46, CHARACTER_LITTERAL=47, NUMERIC_LITTERAL=48, 
		WHITESPACE=49, NEWLINE=50, LINE_COMMENT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "MODIFIER", "PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITTERAL", 
		"CHARACTER_LITTERAL", "NUMERIC_LITTERAL", "LETTER", "NUMBER", "CHARACTER", 
		"WHITESPACE", "NEWLINE", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "';'", 
		"'if'", "'else'", "'while'", "'for'", "'return'", "'print'", "'read'", 
		"'spawn'", "'set'", "'block'", "'lock'", "'unlock'", "'new'", "'true'", 
		"'false'", "'null'", "'this'", "'?'", "':'", "'.'", "'&&'", "'||'", "'=='", 
		"'!='", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MODIFIER", "PRIMITIVE_TYPE", 
		"IDENTIFIER", "STRING_LITTERAL", "CHARACTER_LITTERAL", "NUMERIC_LITTERAL", 
		"WHITESPACE", "NEWLINE", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0171\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u011c"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-"+
		"\u0133\n-\3.\3.\3.\7.\u0138\n.\f.\16.\u013b\13.\3/\3/\7/\u013f\n/\f/\16"+
		"/\u0142\13/\3/\3/\3\60\3\60\3\60\3\60\3\61\5\61\u014b\n\61\3\61\3\61\3"+
		"\62\3\62\3\63\6\63\u0152\n\63\r\63\16\63\u0153\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\66\5\66\u015d\n\66\3\66\3\66\6\66\u0161\n\66\r\66\16\66\u0162"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u016b\n\67\f\67\16\67\u016e\13\67"+
		"\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2"+
		"g\2i\63k\64m\65\3\2\b\4\2--//\4\2C\\c|\3\2\62;\3\2\"\u0080\4\2\13\13\""+
		"\"\4\2\f\f\17\17\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2"+
		"\2\5t\3\2\2\2\7v\3\2\2\2\tx\3\2\2\2\13z\3\2\2\2\r|\3\2\2\2\17~\3\2\2\2"+
		"\21\u0080\3\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31"+
		"\u008c\3\2\2\2\33\u0092\3\2\2\2\35\u0096\3\2\2\2\37\u009d\3\2\2\2!\u00a3"+
		"\3\2\2\2#\u00a8\3\2\2\2%\u00ae\3\2\2\2\'\u00b2\3\2\2\2)\u00b8\3\2\2\2"+
		"+\u00bd\3\2\2\2-\u00c4\3\2\2\2/\u00c8\3\2\2\2\61\u00cd\3\2\2\2\63\u00d3"+
		"\3\2\2\2\65\u00d8\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2"+
		"\2=\u00e3\3\2\2\2?\u00e6\3\2\2\2A\u00e9\3\2\2\2C\u00ec\3\2\2\2E\u00ef"+
		"\3\2\2\2G\u00f2\3\2\2\2I\u00f5\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O"+
		"\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0101\3\2\2\2W\u011b\3\2"+
		"\2\2Y\u0132\3\2\2\2[\u0134\3\2\2\2]\u013c\3\2\2\2_\u0145\3\2\2\2a\u014a"+
		"\3\2\2\2c\u014e\3\2\2\2e\u0151\3\2\2\2g\u0155\3\2\2\2i\u0157\3\2\2\2k"+
		"\u0160\3\2\2\2m\u0166\3\2\2\2op\7o\2\2pq\7c\2\2qr\7k\2\2rs\7p\2\2s\4\3"+
		"\2\2\2tu\7*\2\2u\6\3\2\2\2vw\7+\2\2w\b\3\2\2\2xy\7}\2\2y\n\3\2\2\2z{\7"+
		"\177\2\2{\f\3\2\2\2|}\7]\2\2}\16\3\2\2\2~\177\7_\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\7?\2\2\u0081\22\3\2\2\2\u0082\u0083\7=\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7h\2\2\u0086\26\3\2\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a\u008b\7g\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7y\2\2\u008d\u008e\7j\2\2\u008e\u008f\7k\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7g\2\2\u0091\32\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7"+
		"q\2\2\u0094\u0095\7t\2\2\u0095\34\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7w\2\2\u009a\u009b\7t\2\2\u009b"+
		"\u009c\7p\2\2\u009c\36\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2"+
		"\u00a7\"\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7c"+
		"\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad\7p\2\2\u00ad$\3\2\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1&\3\2\2\2\u00b2\u00b3"+
		"\7d\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7m\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7m\2\2\u00bc*\3\2\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7e\2\2"+
		"\u00c2\u00c3\7m\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7g\2"+
		"\2\u00c6\u00c7\7y\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7"+
		"t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\60\3\2\2\2\u00cd\u00ce"+
		"\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7u\2\2\u00dc\66\3\2\2\2\u00dd"+
		"\u00de\7A\2\2\u00de8\3\2\2\2\u00df\u00e0\7<\2\2\u00e0:\3\2\2\2\u00e1\u00e2"+
		"\7\60\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7(\2\2\u00e4\u00e5\7(\2\2\u00e5>"+
		"\3\2\2\2\u00e6\u00e7\7~\2\2\u00e7\u00e8\7~\2\2\u00e8@\3\2\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea\u00eb\7?\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee"+
		"\7?\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7?\2\2\u00f1F\3"+
		"\2\2\2\u00f2\u00f3\7@\2\2\u00f3\u00f4\7?\2\2\u00f4H\3\2\2\2\u00f5\u00f6"+
		"\7>\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7"+
		"-\2\2\u00faN\3\2\2\2\u00fb\u00fc\7/\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7,"+
		"\2\2\u00feR\3\2\2\2\u00ff\u0100\7\61\2\2\u0100T\3\2\2\2\u0101\u0102\7"+
		".\2\2\u0102V\3\2\2\2\u0103\u0104\7r\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7d\2\2\u0106\u0107\7n\2\2\u0107\u0108\7k\2\2\u0108\u011c\7e\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7x\2\2"+
		"\u010d\u010e\7c\2\2\u010e\u010f\7v\2\2\u010f\u011c\7g\2\2\u0110\u0111"+
		"\7u\2\2\u0111\u0112\7v\2\2\u0112\u0113\7c\2\2\u0113\u0114\7v\2\2\u0114"+
		"\u0115\7k\2\2\u0115\u011c\7e\2\2\u0116\u0117\7e\2\2\u0117\u0118\7q\2\2"+
		"\u0118\u0119\7p\2\2\u0119\u011a\7u\2\2\u011a\u011c\7v\2\2\u011b\u0103"+
		"\3\2\2\2\u011b\u0109\3\2\2\2\u011b\u0110\3\2\2\2\u011b\u0116\3\2\2\2\u011c"+
		"X\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0133\7v\2\2\u0120"+
		"\u0121\7e\2\2\u0121\u0122\7j\2\2\u0122\u0123\7c\2\2\u0123\u0133\7t\2\2"+
		"\u0124\u0125\7d\2\2\u0125\u0126\7q\2\2\u0126\u0127\7q\2\2\u0127\u0133"+
		"\7n\2\2\u0128\u0129\7u\2\2\u0129\u012a\7v\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u0133\7i\2\2\u012e\u012f\7x\2\2"+
		"\u012f\u0130\7q\2\2\u0130\u0131\7k\2\2\u0131\u0133\7f\2\2\u0132\u011d"+
		"\3\2\2\2\u0132\u0120\3\2\2\2\u0132\u0124\3\2\2\2\u0132\u0128\3\2\2\2\u0132"+
		"\u012e\3\2\2\2\u0133Z\3\2\2\2\u0134\u0139\5c\62\2\u0135\u0138\5c\62\2"+
		"\u0136\u0138\5e\63\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\\\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f\5g\64\2\u013e\u013d\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144^\3\2\2\2\u0145"+
		"\u0146\7)\2\2\u0146\u0147\5g\64\2\u0147\u0148\7)\2\2\u0148`\3\2\2\2\u0149"+
		"\u014b\t\2\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\5e\63\2\u014db\3\2\2\2\u014e\u014f\t\3\2\2\u014fd\3\2"+
		"\2\2\u0150\u0152\t\4\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154f\3\2\2\2\u0155\u0156\t\5\2\2"+
		"\u0156h\3\2\2\2\u0157\u0158\t\6\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b"+
		"\65\2\2\u015aj\3\2\2\2\u015b\u015d\7\17\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\7\f\2\2\u015f\u0161\7\17"+
		"\2\2\u0160\u015c\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\66"+
		"\2\2\u0165l\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168\7\61\2\2\u0168\u016c"+
		"\3\2\2\2\u0169\u016b\n\7\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016f\u0170\b\67\2\2\u0170n\3\2\2\2\16\2\u011b\u0132\u0137\u0139"+
		"\u0140\u014a\u0153\u015c\u0160\u0162\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}