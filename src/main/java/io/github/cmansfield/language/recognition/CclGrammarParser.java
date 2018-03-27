// Generated from C:/Users/christopherjman/Documents/CclCompiler/src/main/java/io/github/cmansfield/language/recognition\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.language.recognition;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CclGrammarParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		MODIFIER=46, PRIMITIVE_TYPE=47, IDENTIFIER=48, STRING_LITTERAL=49, CHARACTER_LITTERAL=50, 
		NUMERIC_LITTERAL=51, WHITESPACE=52, NEWLINE=53, LINE_COMMENT=54;
	public static final int
		RULE_importDeclaration = 0, RULE_compilationUnit = 1, RULE_classDeclaration = 2, 
		RULE_classMemberDeclaration = 3, RULE_methodBody = 4, RULE_variableDeclaration = 5, 
		RULE_statement = 6, RULE_assignmentExpression = 7, RULE_typeCast = 8, 
		RULE_braceEnclosedInitializer = 9, RULE_newDeclaration = 10, RULE_expression = 11, 
		RULE_fnArrMember = 12, RULE_memberRefz = 13, RULE_expressionz = 14, RULE_argumentList = 15, 
		RULE_type = 16;
	public static final String[] ruleNames = {
		"importDeclaration", "compilationUnit", "classDeclaration", "classMemberDeclaration", 
		"methodBody", "variableDeclaration", "statement", "assignmentExpression", 
		"typeCast", "braceEnclosedInitializer", "newDeclaration", "expression", 
		"fnArrMember", "memberRefz", "expressionz", "argumentList", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "';'", "'main'", "'('", "')'", "'class'", "'{'", "'}'", 
		"'classMemberDeclaration'", "'['", "']'", "'='", "'if'", "'else'", "'while'", 
		"'for'", "'return'", "'print'", "'read'", "'spawn'", "'set'", "'block'", 
		"'lock'", "'unlock'", "'new'", "'true'", "'false'", "'null'", "'this'", 
		"'?'", "':'", "'.'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "MODIFIER", 
		"PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITTERAL", "CHARACTER_LITTERAL", 
		"NUMERIC_LITTERAL", "WHITESPACE", "NEWLINE", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "CclGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CclGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(IDENTIFIER);
			setState(36);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(CclGrammarParser.MODIFIER, 0); }
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(38);
				importDeclaration();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					classDeclaration();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50);
			match(MODIFIER);
			setState(51);
			match(PRIMITIVE_TYPE);
			setState(52);
			match(T__2);
			setState(53);
			match(T__3);
			setState(54);
			match(T__4);
			setState(55);
			methodBody();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public TerminalNode MODIFIER() { return getToken(CclGrammarParser.MODIFIER, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(57);
				match(MODIFIER);
				}
			}

			setState(60);
			match(T__5);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(T__6);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==MODIFIER) {
				{
				{
				setState(63);
				classDeclaration();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__7);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__8);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					variableDeclaration();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				{
				setState(80);
				statement();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__7);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			type();
			setState(89);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(90);
				match(T__9);
				setState(91);
				match(T__10);
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(94);
				match(T__11);
				setState(95);
				assignmentExpression();
				}
			}

			setState(98);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__12);
				setState(101);
				match(T__3);
				setState(102);
				expression(0);
				setState(103);
				match(T__4);
				setState(104);
				statement();
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(105);
					match(T__13);
					setState(106);
					statement();
					}
					break;
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__14);
				setState(110);
				match(T__3);
				setState(111);
				expression(0);
				setState(112);
				match(T__4);
				setState(113);
				statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__15);
				setState(116);
				match(T__3);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(117);
					expression(0);
					}
				}

				setState(120);
				match(T__1);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(121);
					expression(0);
					}
				}

				setState(124);
				match(T__1);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(125);
					expression(0);
					}
				}

				setState(128);
				match(T__4);
				setState(129);
				statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__16);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(131);
					expression(0);
					}
				}

				setState(134);
				match(T__1);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(T__17);
				setState(136);
				match(T__3);
				setState(137);
				expression(0);
				setState(138);
				match(T__4);
				setState(139);
				match(T__1);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(T__18);
				setState(142);
				match(T__3);
				setState(143);
				match(T__4);
				setState(144);
				match(T__1);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(T__19);
				setState(146);
				expression(0);
				setState(147);
				match(T__20);
				setState(148);
				match(IDENTIFIER);
				setState(149);
				match(T__1);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(T__21);
				setState(152);
				match(T__3);
				setState(153);
				match(T__4);
				setState(154);
				match(T__1);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				match(T__22);
				setState(156);
				match(IDENTIFIER);
				setState(157);
				match(T__1);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				match(T__23);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(T__1);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 11);
				{
				setState(161);
				match(T__6);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					{
					setState(162);
					statement();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__7);
				}
				break;
			case T__3:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case IDENTIFIER:
			case STRING_LITTERAL:
			case CHARACTER_LITTERAL:
			case NUMERIC_LITTERAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(169);
				expression(0);
				setState(170);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewDeclarationContext newDeclaration() {
			return getRuleContext(NewDeclarationContext.class,0);
		}
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LITTERAL() { return getToken(CclGrammarParser.STRING_LITTERAL, 0); }
		public BraceEnclosedInitializerContext braceEnclosedInitializer() {
			return getRuleContext(BraceEnclosedInitializerContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignmentExpression);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__24);
				setState(175);
				type();
				setState(176);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				typeCast();
				setState(179);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(STRING_LITTERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				braceEnclosedInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				expression(0);
				}
				break;
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

	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitTypeCast(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__3);
			setState(187);
			match(PRIMITIVE_TYPE);
			setState(188);
			match(T__4);
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

	public static class BraceEnclosedInitializerContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public BraceEnclosedInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceEnclosedInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterBraceEnclosedInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitBraceEnclosedInitializer(this);
		}
	}

	public final BraceEnclosedInitializerContext braceEnclosedInitializer() throws RecognitionException {
		BraceEnclosedInitializerContext _localctx = new BraceEnclosedInitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__6);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(191);
				argumentList();
				}
			}

			setState(194);
			match(T__7);
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

	public static class NewDeclarationContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterNewDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitNewDeclaration(this);
		}
	}

	public final NewDeclarationContext newDeclaration() throws RecognitionException {
		NewDeclarationContext _localctx = new NewDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_newDeclaration);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__3);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(197);
					argumentList();
					}
				}

				setState(200);
				match(T__4);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__9);
				setState(202);
				expression(0);
				setState(203);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionzContext expressionz() {
			return getRuleContext(ExpressionzContext.class,0);
		}
		public MemberRefzContext memberRefz() {
			return getRuleContext(MemberRefzContext.class,0);
		}
		public TerminalNode NUMERIC_LITTERAL() { return getToken(CclGrammarParser.NUMERIC_LITTERAL, 0); }
		public TerminalNode CHARACTER_LITTERAL() { return getToken(CclGrammarParser.CHARACTER_LITTERAL, 0); }
		public TerminalNode STRING_LITTERAL() { return getToken(CclGrammarParser.STRING_LITTERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public FnArrMemberContext fnArrMember() {
			return getRuleContext(FnArrMemberContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(208);
				match(T__3);
				setState(209);
				expression(0);
				setState(210);
				match(T__4);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(211);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__25:
			case T__26:
			case T__27:
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(215);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__28:
				{
				setState(218);
				match(T__28);
				setState(220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(219);
					memberRefz();
					}
					break;
				}
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(222);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(225);
				match(NUMERIC_LITTERAL);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(226);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(229);
				match(CHARACTER_LITTERAL);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(230);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(233);
				match(STRING_LITTERAL);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(234);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(237);
				match(IDENTIFIER);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(238);
					fnArrMember();
					}
					break;
				}
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(241);
					memberRefz();
					}
					break;
				}
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(244);
					expressionz();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(249);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(250);
					match(T__29);
					setState(251);
					expression(0);
					setState(252);
					match(T__30);
					setState(253);
					expression(2);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FnArrMemberContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FnArrMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnArrMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterFnArrMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitFnArrMember(this);
		}
	}

	public final FnArrMemberContext fnArrMember() throws RecognitionException {
		FnArrMemberContext _localctx = new FnArrMemberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fnArrMember);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__3);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(261);
					argumentList();
					}
				}

				setState(264);
				match(T__4);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__9);
				setState(266);
				expression(0);
				setState(267);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MemberRefzContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public FnArrMemberContext fnArrMember() {
			return getRuleContext(FnArrMemberContext.class,0);
		}
		public MemberRefzContext memberRefz() {
			return getRuleContext(MemberRefzContext.class,0);
		}
		public MemberRefzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberRefz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterMemberRefz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitMemberRefz(this);
		}
	}

	public final MemberRefzContext memberRefz() throws RecognitionException {
		MemberRefzContext _localctx = new MemberRefzContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__31);
			setState(272);
			match(IDENTIFIER);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(273);
				fnArrMember();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(276);
				memberRefz();
				}
				break;
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

	public static class ExpressionzContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterExpressionz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitExpressionz(this);
		}
	}

	public final ExpressionzContext expressionz() throws RecognitionException {
		ExpressionzContext _localctx = new ExpressionzContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionz);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__11);
				setState(280);
				assignmentExpression();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__32);
				setState(282);
				expression(0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__33);
				setState(284);
				expression(0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(T__34);
				setState(286);
				expression(0);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__35);
				setState(288);
				expression(0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				match(T__36);
				setState(290);
				expression(0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(T__37);
				setState(292);
				expression(0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(T__38);
				setState(294);
				expression(0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				match(T__39);
				setState(296);
				expression(0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				match(T__40);
				setState(298);
				expression(0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 11);
				{
				setState(299);
				match(T__41);
				setState(300);
				expression(0);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 12);
				{
				setState(301);
				match(T__42);
				setState(302);
				expression(0);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 13);
				{
				setState(303);
				match(T__43);
				setState(304);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			expression(0);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(308);
				match(T__44);
				setState(309);
				expression(0);
				}
				}
				setState(314);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==PRIMITIVE_TYPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\7\4C\n"+
		"\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6"+
		"\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\5\7"+
		"c\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\by\n\b\3\b\3\b\5\b}\n\b\3\b\3\b\5\b\u0081\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0087\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bb\n\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\5\13\u00c3\n\13\3\13\3\13\3\f\3\f\5\f\u00c9\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00d0\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\5\r\u00db"+
		"\n\r\3\r\3\r\5\r\u00df\n\r\3\r\5\r\u00e2\n\r\3\r\3\r\5\r\u00e6\n\r\3\r"+
		"\3\r\5\r\u00ea\n\r\3\r\3\r\5\r\u00ee\n\r\3\r\3\r\5\r\u00f2\n\r\3\r\5\r"+
		"\u00f5\n\r\3\r\5\r\u00f8\n\r\5\r\u00fa\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0102\n\r\f\r\16\r\u0105\13\r\3\16\3\16\5\16\u0109\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0110\n\16\3\17\3\17\3\17\5\17\u0115\n\17\3\17\5\17\u0118"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0134\n\20\3\21\3\21\3\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\22"+
		"\3\22\3\22\2\3\30\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2"+
		"\34\36\3\2\61\62\2\u0170\2$\3\2\2\2\4+\3\2\2\2\6<\3\2\2\2\bI\3\2\2\2\n"+
		"K\3\2\2\2\fZ\3\2\2\2\16\u00ae\3\2\2\2\20\u00ba\3\2\2\2\22\u00bc\3\2\2"+
		"\2\24\u00c0\3\2\2\2\26\u00cf\3\2\2\2\30\u00f9\3\2\2\2\32\u010f\3\2\2\2"+
		"\34\u0111\3\2\2\2\36\u0133\3\2\2\2 \u0135\3\2\2\2\"\u013d\3\2\2\2$%\7"+
		"\3\2\2%&\7\62\2\2&\'\7\4\2\2\'\3\3\2\2\2(*\5\2\2\2)(\3\2\2\2*-\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7"+
		"\60\2\2\65\66\7\61\2\2\66\67\7\5\2\2\678\7\6\2\289\7\7\2\29:\5\n\6\2:"+
		"\5\3\2\2\2;=\7\60\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\b\2\2?@\7\62\2"+
		"\2@D\7\t\2\2AC\5\6\4\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2"+
		"\2FD\3\2\2\2GH\7\n\2\2H\7\3\2\2\2IJ\7\13\2\2J\t\3\2\2\2KO\7\t\2\2LN\5"+
		"\f\7\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2\2RT\5"+
		"\16\b\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY"+
		"\7\n\2\2Y\13\3\2\2\2Z[\5\"\22\2[^\7\62\2\2\\]\7\f\2\2]_\7\r\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_b\3\2\2\2`a\7\16\2\2ac\5\20\t\2b`\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2de\7\4\2\2e\r\3\2\2\2fg\7\17\2\2gh\7\6\2\2hi\5\30\r\2ij\7\7\2\2"+
		"jm\5\16\b\2kl\7\20\2\2ln\5\16\b\2mk\3\2\2\2mn\3\2\2\2n\u00af\3\2\2\2o"+
		"p\7\21\2\2pq\7\6\2\2qr\5\30\r\2rs\7\7\2\2st\5\16\b\2t\u00af\3\2\2\2uv"+
		"\7\22\2\2vx\7\6\2\2wy\5\30\r\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z|\7\4\2\2"+
		"{}\5\30\r\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\7\4\2\2\177\u0081\5\30"+
		"\r\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\7\7\2\2\u0083\u00af\5\16\b\2\u0084\u0086\7\23\2\2\u0085\u0087\5\30\r"+
		"\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u00af"+
		"\7\4\2\2\u0089\u008a\7\24\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5\30\r\2"+
		"\u008c\u008d\7\7\2\2\u008d\u008e\7\4\2\2\u008e\u00af\3\2\2\2\u008f\u0090"+
		"\7\25\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7\7\2\2\u0092\u00af\7\4\2\2"+
		"\u0093\u0094\7\26\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\27\2\2\u0096"+
		"\u0097\7\62\2\2\u0097\u0098\7\4\2\2\u0098\u00af\3\2\2\2\u0099\u009a\7"+
		"\30\2\2\u009a\u009b\7\6\2\2\u009b\u009c\7\7\2\2\u009c\u00af\7\4\2\2\u009d"+
		"\u009e\7\31\2\2\u009e\u009f\7\62\2\2\u009f\u00af\7\4\2\2\u00a0\u00a1\7"+
		"\32\2\2\u00a1\u00a2\7\62\2\2\u00a2\u00af\7\4\2\2\u00a3\u00a7\7\t\2\2\u00a4"+
		"\u00a6\5\16\b\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00af\7\n\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7\4\2\2\u00ad\u00af\3"+
		"\2\2\2\u00aef\3\2\2\2\u00aeo\3\2\2\2\u00aeu\3\2\2\2\u00ae\u0084\3\2\2"+
		"\2\u00ae\u0089\3\2\2\2\u00ae\u008f\3\2\2\2\u00ae\u0093\3\2\2\2\u00ae\u0099"+
		"\3\2\2\2\u00ae\u009d\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00af\17\3\2\2\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\5\"\22"+
		"\2\u00b2\u00b3\5\26\f\2\u00b3\u00bb\3\2\2\2\u00b4\u00b5\5\22\n\2\u00b5"+
		"\u00b6\5\30\r\2\u00b6\u00bb\3\2\2\2\u00b7\u00bb\7\63\2\2\u00b8\u00bb\5"+
		"\24\13\2\u00b9\u00bb\5\30\r\2\u00ba\u00b0\3\2\2\2\u00ba\u00b4\3\2\2\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\21"+
		"\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf\7\7\2\2"+
		"\u00bf\23\3\2\2\2\u00c0\u00c2\7\t\2\2\u00c1\u00c3\5 \21\2\u00c2\u00c1"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"\25\3\2\2\2\u00c6\u00c8\7\6\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c7\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d0\7\7\2\2\u00cb\u00cc"+
		"\7\f\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7\r\2\2\u00ce\u00d0\3\2\2\2"+
		"\u00cf\u00c6\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d2"+
		"\b\r\1\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00d6\7\7\2\2"+
		"\u00d5\u00d7\5\36\20\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00fa"+
		"\3\2\2\2\u00d8\u00da\t\2\2\2\u00d9\u00db\5\36\20\2\u00da\u00d9\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00fa\3\2\2\2\u00dc\u00de\7\37\2\2\u00dd\u00df"+
		"\5\34\17\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2"+
		"\u00e0\u00e2\5\36\20\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00fa"+
		"\3\2\2\2\u00e3\u00e5\7\65\2\2\u00e4\u00e6\5\36\20\2\u00e5\u00e4\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00fa\3\2\2\2\u00e7\u00e9\7\64\2\2\u00e8"+
		"\u00ea\5\36\20\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00fa\3"+
		"\2\2\2\u00eb\u00ed\7\63\2\2\u00ec\u00ee\5\36\20\2\u00ed\u00ec\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00fa\3\2\2\2\u00ef\u00f1\7\62\2\2\u00f0\u00f2"+
		"\5\32\16\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f8\5\36\20\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00fa\3\2\2\2\u00f9\u00d1\3\2\2\2\u00f9\u00d8\3\2\2\2\u00f9\u00dc"+
		"\3\2\2\2\u00f9\u00e3\3\2\2\2\u00f9\u00e7\3\2\2\2\u00f9\u00eb\3\2\2\2\u00f9"+
		"\u00ef\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\f\3\2\2\u00fc\u00fd\7 "+
		"\2\2\u00fd\u00fe\5\30\r\2\u00fe\u00ff\7!\2\2\u00ff\u0100\5\30\r\4\u0100"+
		"\u0102\3\2\2\2\u0101\u00fb\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\31\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108"+
		"\7\6\2\2\u0107\u0109\5 \21\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0110\7\7\2\2\u010b\u010c\7\f\2\2\u010c\u010d\5\30"+
		"\r\2\u010d\u010e\7\r\2\2\u010e\u0110\3\2\2\2\u010f\u0106\3\2\2\2\u010f"+
		"\u010b\3\2\2\2\u0110\33\3\2\2\2\u0111\u0112\7\"\2\2\u0112\u0114\7\62\2"+
		"\2\u0113\u0115\5\32\16\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0118\5\34\17\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\35\3\2\2\2\u0119\u011a\7\16\2\2\u011a\u0134\5\20\t\2\u011b"+
		"\u011c\7#\2\2\u011c\u0134\5\30\r\2\u011d\u011e\7$\2\2\u011e\u0134\5\30"+
		"\r\2\u011f\u0120\7%\2\2\u0120\u0134\5\30\r\2\u0121\u0122\7&\2\2\u0122"+
		"\u0134\5\30\r\2\u0123\u0124\7\'\2\2\u0124\u0134\5\30\r\2\u0125\u0126\7"+
		"(\2\2\u0126\u0134\5\30\r\2\u0127\u0128\7)\2\2\u0128\u0134\5\30\r\2\u0129"+
		"\u012a\7*\2\2\u012a\u0134\5\30\r\2\u012b\u012c\7+\2\2\u012c\u0134\5\30"+
		"\r\2\u012d\u012e\7,\2\2\u012e\u0134\5\30\r\2\u012f\u0130\7-\2\2\u0130"+
		"\u0134\5\30\r\2\u0131\u0132\7.\2\2\u0132\u0134\5\30\r\2\u0133\u0119\3"+
		"\2\2\2\u0133\u011b\3\2\2\2\u0133\u011d\3\2\2\2\u0133\u011f\3\2\2\2\u0133"+
		"\u0121\3\2\2\2\u0133\u0123\3\2\2\2\u0133\u0125\3\2\2\2\u0133\u0127\3\2"+
		"\2\2\u0133\u0129\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0134\37\3\2\2\2\u0135\u013a\5\30\r"+
		"\2\u0136\u0137\7/\2\2\u0137\u0139\5\30\r\2\u0138\u0136\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b!\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\t\3\2\2\u013e#\3\2\2\2\'+\61<DOU^bmx|\u0080"+
		"\u0086\u00a7\u00ae\u00ba\u00c2\u00c8\u00cf\u00d6\u00da\u00de\u00e1\u00e5"+
		"\u00e9\u00ed\u00f1\u00f4\u00f7\u00f9\u0103\u0108\u010f\u0114\u0117\u0133"+
		"\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}