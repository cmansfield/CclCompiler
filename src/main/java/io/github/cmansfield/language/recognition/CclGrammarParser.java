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
		T__38=39, T__39=40, T__40=41, T__41=42, MODIFIER=43, PRIMITIVE_TYPE=44, 
		IDENTIFIER=45, STRING_LITTERAL=46, CHARACTER_LITTERAL=47, NUMERIC_LITTERAL=48, 
		WHITESPACE=49, NEWLINE=50, LINE_COMMENT=51;
	public static final int
		RULE_compilationUnit = 0, RULE_methodBody = 1, RULE_variableDeclaration = 2, 
		RULE_statement = 3, RULE_assignmentExpression = 4, RULE_typeCast = 5, 
		RULE_braceEnclosedInitializer = 6, RULE_newDeclaration = 7, RULE_expression = 8, 
		RULE_fnArrMember = 9, RULE_memberRefz = 10, RULE_expressionz = 11, RULE_argumentList = 12, 
		RULE_type = 13;
	public static final String[] ruleNames = {
		"compilationUnit", "methodBody", "variableDeclaration", "statement", "assignmentExpression", 
		"typeCast", "braceEnclosedInitializer", "newDeclaration", "expression", 
		"fnArrMember", "memberRefz", "expressionz", "argumentList", "type"
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
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(CclGrammarParser.MODIFIER, 0); }
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(MODIFIER);
			setState(29);
			match(PRIMITIVE_TYPE);
			setState(30);
			match(T__0);
			setState(31);
			match(T__1);
			setState(32);
			match(T__2);
			setState(33);
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
		enterRule(_localctx, 2, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					variableDeclaration();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		enterRule(_localctx, 4, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			type();
			setState(51);
			match(IDENTIFIER);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(52);
				match(T__5);
				setState(53);
				match(T__6);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(56);
				match(T__7);
				setState(57);
				assignmentExpression();
				}
			}

			setState(60);
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
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__9);
				setState(63);
				match(T__1);
				setState(64);
				expression(0);
				setState(65);
				match(T__2);
				setState(66);
				statement();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(67);
					match(T__10);
					setState(68);
					statement();
					}
					break;
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__11);
				setState(72);
				match(T__1);
				setState(73);
				expression(0);
				setState(74);
				match(T__2);
				setState(75);
				statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__12);
				setState(78);
				match(T__1);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(79);
					expression(0);
					}
				}

				setState(82);
				match(T__8);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(83);
					expression(0);
					}
				}

				setState(86);
				match(T__8);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(87);
					expression(0);
					}
				}

				setState(90);
				match(T__2);
				setState(91);
				statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T__13);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(93);
					expression(0);
					}
				}

				setState(96);
				match(T__8);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__14);
				setState(98);
				match(T__1);
				setState(99);
				expression(0);
				setState(100);
				match(T__2);
				setState(101);
				match(T__8);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(T__15);
				setState(104);
				match(T__1);
				setState(105);
				match(T__2);
				setState(106);
				match(T__8);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__16);
				setState(108);
				expression(0);
				setState(109);
				match(T__17);
				setState(110);
				match(IDENTIFIER);
				setState(111);
				match(T__8);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				match(T__18);
				setState(114);
				match(T__1);
				setState(115);
				match(T__2);
				setState(116);
				match(T__8);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 9);
				{
				setState(117);
				match(T__19);
				setState(118);
				match(IDENTIFIER);
				setState(119);
				match(T__8);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				match(T__20);
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__8);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 11);
				{
				setState(123);
				match(T__3);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					{
					setState(124);
					statement();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(T__4);
				}
				break;
			case T__1:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case IDENTIFIER:
			case STRING_LITTERAL:
			case CHARACTER_LITTERAL:
			case NUMERIC_LITTERAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				expression(0);
				setState(132);
				match(T__8);
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
		enterRule(_localctx, 8, RULE_assignmentExpression);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__21);
				setState(137);
				type();
				setState(138);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				typeCast();
				setState(141);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(STRING_LITTERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				braceEnclosedInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
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
		enterRule(_localctx, 10, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__1);
			setState(149);
			match(PRIMITIVE_TYPE);
			setState(150);
			match(T__2);
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
		enterRule(_localctx, 12, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__3);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(153);
				argumentList();
				}
			}

			setState(156);
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
		enterRule(_localctx, 14, RULE_newDeclaration);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__1);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(159);
					argumentList();
					}
				}

				setState(162);
				match(T__2);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__5);
				setState(164);
				expression(0);
				setState(165);
				match(T__6);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(170);
				match(T__1);
				setState(171);
				expression(0);
				setState(172);
				match(T__2);
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(173);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__22:
			case T__23:
			case T__24:
				{
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(177);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__25:
				{
				setState(180);
				match(T__25);
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(181);
					memberRefz();
					}
					break;
				}
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(184);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(187);
				match(NUMERIC_LITTERAL);
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(188);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(191);
				match(CHARACTER_LITTERAL);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(192);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(195);
				match(STRING_LITTERAL);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(196);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(199);
				match(IDENTIFIER);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(200);
					fnArrMember();
					}
					break;
				}
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(203);
					memberRefz();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(206);
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
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(212);
					match(T__26);
					setState(213);
					expression(0);
					setState(214);
					match(T__27);
					setState(215);
					expression(2);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 18, RULE_fnArrMember);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__1);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(223);
					argumentList();
					}
				}

				setState(226);
				match(T__2);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__5);
				setState(228);
				expression(0);
				setState(229);
				match(T__6);
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
		enterRule(_localctx, 20, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__28);
			setState(234);
			match(IDENTIFIER);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(235);
				fnArrMember();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(238);
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
		enterRule(_localctx, 22, RULE_expressionz);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__7);
				setState(242);
				assignmentExpression();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__29);
				setState(244);
				expression(0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T__30);
				setState(246);
				expression(0);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(T__31);
				setState(248);
				expression(0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__32);
				setState(250);
				expression(0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(T__33);
				setState(252);
				expression(0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				match(T__34);
				setState(254);
				expression(0);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(T__35);
				setState(256);
				expression(0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 9);
				{
				setState(257);
				match(T__36);
				setState(258);
				expression(0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				match(T__37);
				setState(260);
				expression(0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 11);
				{
				setState(261);
				match(T__38);
				setState(262);
				expression(0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 12);
				{
				setState(263);
				match(T__39);
				setState(264);
				expression(0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 13);
				{
				setState(265);
				match(T__40);
				setState(266);
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
		enterRule(_localctx, 24, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			expression(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(270);
				match(T__41);
				setState(271);
				expression(0);
				}
				}
				setState(276);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u011a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3\5\3\5"+
		"\5\5W\n\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083\13\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\t\3\t\5\t\u00a3\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b1\n\n"+
		"\3\n\3\n\5\n\u00b5\n\n\3\n\3\n\5\n\u00b9\n\n\3\n\5\n\u00bc\n\n\3\n\3\n"+
		"\5\n\u00c0\n\n\3\n\3\n\5\n\u00c4\n\n\3\n\3\n\5\n\u00c8\n\n\3\n\3\n\5\n"+
		"\u00cc\n\n\3\n\5\n\u00cf\n\n\3\n\5\n\u00d2\n\n\5\n\u00d4\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00dc\n\n\f\n\16\n\u00df\13\n\3\13\3\13\5\13\u00e3"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ea\n\13\3\f\3\f\3\f\5\f\u00ef\n"+
		"\f\3\f\5\f\u00f2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3"+
		"\16\3\16\3\16\7\16\u0113\n\16\f\16\16\16\u0116\13\16\3\17\3\17\3\17\2"+
		"\3\22\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\31\33\3\2./\2\u0149"+
		"\2\36\3\2\2\2\4%\3\2\2\2\6\64\3\2\2\2\b\u0088\3\2\2\2\n\u0094\3\2\2\2"+
		"\f\u0096\3\2\2\2\16\u009a\3\2\2\2\20\u00a9\3\2\2\2\22\u00d3\3\2\2\2\24"+
		"\u00e9\3\2\2\2\26\u00eb\3\2\2\2\30\u010d\3\2\2\2\32\u010f\3\2\2\2\34\u0117"+
		"\3\2\2\2\36\37\7-\2\2\37 \7.\2\2 !\7\3\2\2!\"\7\4\2\2\"#\7\5\2\2#$\5\4"+
		"\3\2$\3\3\2\2\2%)\7\6\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*/\3\2\2\2+)\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2"+
		"/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\7\2\2\63\5\3\2\2\2\64\65"+
		"\5\34\17\2\658\7/\2\2\66\67\7\b\2\2\679\7\t\2\28\66\3\2\2\289\3\2\2\2"+
		"9<\3\2\2\2:;\7\n\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\13\2"+
		"\2?\7\3\2\2\2@A\7\f\2\2AB\7\4\2\2BC\5\22\n\2CD\7\5\2\2DG\5\b\5\2EF\7\r"+
		"\2\2FH\5\b\5\2GE\3\2\2\2GH\3\2\2\2H\u0089\3\2\2\2IJ\7\16\2\2JK\7\4\2\2"+
		"KL\5\22\n\2LM\7\5\2\2MN\5\b\5\2N\u0089\3\2\2\2OP\7\17\2\2PR\7\4\2\2QS"+
		"\5\22\n\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\13\2\2UW\5\22\n\2VU\3\2\2"+
		"\2VW\3\2\2\2WX\3\2\2\2XZ\7\13\2\2Y[\5\22\n\2ZY\3\2\2\2Z[\3\2\2\2[\\\3"+
		"\2\2\2\\]\7\5\2\2]\u0089\5\b\5\2^`\7\20\2\2_a\5\22\n\2`_\3\2\2\2`a\3\2"+
		"\2\2ab\3\2\2\2b\u0089\7\13\2\2cd\7\21\2\2de\7\4\2\2ef\5\22\n\2fg\7\5\2"+
		"\2gh\7\13\2\2h\u0089\3\2\2\2ij\7\22\2\2jk\7\4\2\2kl\7\5\2\2l\u0089\7\13"+
		"\2\2mn\7\23\2\2no\5\22\n\2op\7\24\2\2pq\7/\2\2qr\7\13\2\2r\u0089\3\2\2"+
		"\2st\7\25\2\2tu\7\4\2\2uv\7\5\2\2v\u0089\7\13\2\2wx\7\26\2\2xy\7/\2\2"+
		"y\u0089\7\13\2\2z{\7\27\2\2{|\7/\2\2|\u0089\7\13\2\2}\u0081\7\6\2\2~\u0080"+
		"\5\b\5\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\7\7\2\2\u0085"+
		"\u0086\5\22\n\2\u0086\u0087\7\13\2\2\u0087\u0089\3\2\2\2\u0088@\3\2\2"+
		"\2\u0088I\3\2\2\2\u0088O\3\2\2\2\u0088^\3\2\2\2\u0088c\3\2\2\2\u0088i"+
		"\3\2\2\2\u0088m\3\2\2\2\u0088s\3\2\2\2\u0088w\3\2\2\2\u0088z\3\2\2\2\u0088"+
		"}\3\2\2\2\u0088\u0085\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\7\30\2\2\u008b"+
		"\u008c\5\34\17\2\u008c\u008d\5\20\t\2\u008d\u0095\3\2\2\2\u008e\u008f"+
		"\5\f\7\2\u008f\u0090\5\22\n\2\u0090\u0095\3\2\2\2\u0091\u0095\7\60\2\2"+
		"\u0092\u0095\5\16\b\2\u0093\u0095\5\22\n\2\u0094\u008a\3\2\2\2\u0094\u008e"+
		"\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\13\3\2\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7.\2\2\u0098\u0099\7\5\2\2"+
		"\u0099\r\3\2\2\2\u009a\u009c\7\6\2\2\u009b\u009d\5\32\16\2\u009c\u009b"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\7\2\2\u009f"+
		"\17\3\2\2\2\u00a0\u00a2\7\4\2\2\u00a1\u00a3\5\32\16\2\u00a2\u00a1\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00aa\7\5\2\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\t\2\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\21\3\2\2\2\u00ab"+
		"\u00ac\b\n\1\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00b0\7"+
		"\5\2\2\u00af\u00b1\5\30\r\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00d4\3\2\2\2\u00b2\u00b4\t\2\2\2\u00b3\u00b5\5\30\r\2\u00b4\u00b3\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00d4\3\2\2\2\u00b6\u00b8\7\34\2\2\u00b7"+
		"\u00b9\5\26\f\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3"+
		"\2\2\2\u00ba\u00bc\5\30\r\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00d4\3\2\2\2\u00bd\u00bf\7\62\2\2\u00be\u00c0\5\30\r\2\u00bf\u00be\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00d4\3\2\2\2\u00c1\u00c3\7\61\2\2\u00c2"+
		"\u00c4\5\30\r\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00d4\3"+
		"\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00d4\3\2\2\2\u00c9\u00cb\7/\2\2\u00ca\u00cc\5\24"+
		"\13\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cf\5\26\f\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3"+
		"\2\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00ab\3\2\2\2\u00d3\u00b2\3\2\2\2\u00d3\u00b6\3\2"+
		"\2\2\u00d3\u00bd\3\2\2\2\u00d3\u00c1\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3"+
		"\u00c9\3\2\2\2\u00d4\u00dd\3\2\2\2\u00d5\u00d6\f\3\2\2\u00d6\u00d7\7\35"+
		"\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\5\22\n\4\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d5\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\23\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2"+
		"\7\4\2\2\u00e1\u00e3\5\32\16\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00ea\7\5\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e7"+
		"\5\22\n\2\u00e7\u00e8\7\t\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e0\3\2\2\2"+
		"\u00e9\u00e5\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ee"+
		"\7/\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5\26\f\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f4\7\n\2\2\u00f4\u010e\5\n\6\2\u00f5"+
		"\u00f6\7 \2\2\u00f6\u010e\5\22\n\2\u00f7\u00f8\7!\2\2\u00f8\u010e\5\22"+
		"\n\2\u00f9\u00fa\7\"\2\2\u00fa\u010e\5\22\n\2\u00fb\u00fc\7#\2\2\u00fc"+
		"\u010e\5\22\n\2\u00fd\u00fe\7$\2\2\u00fe\u010e\5\22\n\2\u00ff\u0100\7"+
		"%\2\2\u0100\u010e\5\22\n\2\u0101\u0102\7&\2\2\u0102\u010e\5\22\n\2\u0103"+
		"\u0104\7\'\2\2\u0104\u010e\5\22\n\2\u0105\u0106\7(\2\2\u0106\u010e\5\22"+
		"\n\2\u0107\u0108\7)\2\2\u0108\u010e\5\22\n\2\u0109\u010a\7*\2\2\u010a"+
		"\u010e\5\22\n\2\u010b\u010c\7+\2\2\u010c\u010e\5\22\n\2\u010d\u00f3\3"+
		"\2\2\2\u010d\u00f5\3\2\2\2\u010d\u00f7\3\2\2\2\u010d\u00f9\3\2\2\2\u010d"+
		"\u00fb\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u00ff\3\2\2\2\u010d\u0101\3\2"+
		"\2\2\u010d\u0103\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e\31\3\2\2\2\u010f\u0114\5\22\n"+
		"\2\u0110\u0111\7,\2\2\u0111\u0113\5\22\n\2\u0112\u0110\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\33\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\t\3\2\2\u0118\35\3\2\2\2#)/8<GRVZ`\u0081\u0088"+
		"\u0094\u009c\u00a2\u00a9\u00b0\u00b4\u00b8\u00bb\u00bf\u00c3\u00c7\u00cb"+
		"\u00ce\u00d1\u00d3\u00dd\u00e2\u00e9\u00ee\u00f1\u010d\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}