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
		T__31=32, MODIFIER=33, PRIMITIVE_TYPE=34, IDENTIFIER=35, STRING_LITTERAL=36, 
		CHARACTER_LITTERAL=37, NUMERIC_LITTERAL=38, WHITESPACE=39, NEWLINE=40, 
		LINE_COMMENT=41;
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
		"'statement'", "'new'", "'true'", "'false'", "'null'", "'this'", "'?'", 
		"':'", "'fnArrMember'", "'memberRefz'", "'&&'", "'||'", "'=='", "'!='", 
		"'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "MODIFIER", "PRIMITIVE_TYPE", 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__3);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				{
				setState(36);
				variableDeclaration();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__9);
			setState(63);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewDeclarationContext newDeclaration() {
			return getRuleContext(NewDeclarationContext.class,0);
		}
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__10);
				setState(67);
				type();
				setState(68);
				newDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				typeCast();
				setState(71);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(STRING_LITTERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				braceEnclosedInitializer();
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
			setState(77);
			match(T__1);
			setState(78);
			match(PRIMITIVE_TYPE);
			setState(79);
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
			setState(81);
			match(T__3);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(82);
				argumentList();
				}
			}

			setState(85);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__1);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(88);
					argumentList();
					}
				}

				setState(91);
				match(T__2);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__5);
				setState(93);
				expression(0);
				setState(94);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(99);
				match(T__1);
				setState(100);
				expression(0);
				setState(101);
				match(T__2);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(102);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__11:
			case T__12:
			case T__13:
				{
				setState(105);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(106);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__14:
				{
				setState(109);
				match(T__14);
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(110);
					memberRefz();
					}
					break;
				}
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(113);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(116);
				match(NUMERIC_LITTERAL);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(117);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(120);
				match(CHARACTER_LITTERAL);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(121);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(124);
				match(STRING_LITTERAL);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(125);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(128);
				match(IDENTIFIER);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(129);
					fnArrMember();
					}
					break;
				}
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(132);
					memberRefz();
					}
					break;
				}
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(135);
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
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141);
					match(T__15);
					setState(142);
					expression(0);
					setState(143);
					match(T__16);
					setState(144);
					expression(2);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__17);
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
			setState(153);
			match(T__18);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__7);
				setState(156);
				assignmentExpression();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__19);
				setState(158);
				expression(0);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__20);
				setState(160);
				expression(0);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__21);
				setState(162);
				expression(0);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__22);
				setState(164);
				expression(0);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				match(T__23);
				setState(166);
				expression(0);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(T__24);
				setState(168);
				expression(0);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				match(T__25);
				setState(170);
				expression(0);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				match(T__26);
				setState(172);
				expression(0);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				match(T__27);
				setState(174);
				expression(0);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				match(T__28);
				setState(176);
				expression(0);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				match(T__29);
				setState(178);
				expression(0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 13);
				{
				setState(179);
				match(T__30);
				setState(180);
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
			setState(183);
			expression(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(184);
				match(T__31);
				setState(185);
				expression(0);
				}
				}
				setState(190);
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
			setState(191);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\bV\n"+
		"\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\nj\n\n\3\n\3\n\5\nn\n\n\3\n\3\n\5\nr\n\n\3\n\5\nu\n\n\3\n\3"+
		"\n\5\ny\n\n\3\n\3\n\5\n}\n\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n\5\n\u0085\n"+
		"\n\3\n\5\n\u0088\n\n\3\n\5\n\u008b\n\n\5\n\u008d\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u0095\n\n\f\n\16\n\u0098\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b8\n\r\3\16\3\16\3\16\7\16\u00bd\n\16\f"+
		"\16\16\16\u00c0\13\16\3\17\3\17\3\17\2\3\22\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\4\3\2\16\20\3\2$%\2\u00de\2\36\3\2\2\2\4%\3\2\2\2\6\64"+
		"\3\2\2\2\b@\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16S\3\2\2\2\20b\3\2\2\2\22\u008c"+
		"\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00b7\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00c1\3\2\2\2\36\37\7#\2\2\37 \7$\2\2 !\7\3\2\2!\"\7\4\2\2\""+
		"#\7\5\2\2#$\5\4\3\2$\3\3\2\2\2%)\7\6\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*/\3\2\2\2+)\3\2\2\2,.\5\b\5\2-,\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\7\2\2\63"+
		"\5\3\2\2\2\64\65\5\34\17\2\658\7%\2\2\66\67\7\b\2\2\679\7\t\2\28\66\3"+
		"\2\2\289\3\2\2\29<\3\2\2\2:;\7\n\2\2;=\5\n\6\2<:\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>?\7\13\2\2?\7\3\2\2\2@A\7\f\2\2AB\7\13\2\2B\t\3\2\2\2CN\5\22\n"+
		"\2DE\7\r\2\2EF\5\34\17\2FG\5\20\t\2GN\3\2\2\2HI\5\f\7\2IJ\5\22\n\2JN\3"+
		"\2\2\2KN\7&\2\2LN\5\16\b\2MC\3\2\2\2MD\3\2\2\2MH\3\2\2\2MK\3\2\2\2ML\3"+
		"\2\2\2N\13\3\2\2\2OP\7\4\2\2PQ\7$\2\2QR\7\5\2\2R\r\3\2\2\2SU\7\6\2\2T"+
		"V\5\32\16\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\7\2\2X\17\3\2\2\2Y[\7\4"+
		"\2\2Z\\\5\32\16\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]c\7\5\2\2^_\7\b\2\2"+
		"_`\5\22\n\2`a\7\t\2\2ac\3\2\2\2bY\3\2\2\2b^\3\2\2\2c\21\3\2\2\2de\b\n"+
		"\1\2ef\7\4\2\2fg\5\22\n\2gi\7\5\2\2hj\5\30\r\2ih\3\2\2\2ij\3\2\2\2j\u008d"+
		"\3\2\2\2km\t\2\2\2ln\5\30\r\2ml\3\2\2\2mn\3\2\2\2n\u008d\3\2\2\2oq\7\21"+
		"\2\2pr\5\26\f\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\30\r\2ts\3\2\2\2tu\3"+
		"\2\2\2u\u008d\3\2\2\2vx\7(\2\2wy\5\30\r\2xw\3\2\2\2xy\3\2\2\2y\u008d\3"+
		"\2\2\2z|\7\'\2\2{}\5\30\r\2|{\3\2\2\2|}\3\2\2\2}\u008d\3\2\2\2~\u0080"+
		"\7&\2\2\177\u0081\5\30\r\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u008d\3\2\2\2\u0082\u0084\7%\2\2\u0083\u0085\5\24\13\2\u0084\u0083\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5\26\f\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\30"+
		"\r\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"d\3\2\2\2\u008ck\3\2\2\2\u008co\3\2\2\2\u008cv\3\2\2\2\u008cz\3\2\2\2"+
		"\u008c~\3\2\2\2\u008c\u0082\3\2\2\2\u008d\u0096\3\2\2\2\u008e\u008f\f"+
		"\3\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\23\2\2"+
		"\u0092\u0093\5\22\n\4\u0093\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\24\2\2\u009a\25\3\2\2\2\u009b\u009c\7\25"+
		"\2\2\u009c\27\3\2\2\2\u009d\u009e\7\n\2\2\u009e\u00b8\5\n\6\2\u009f\u00a0"+
		"\7\26\2\2\u00a0\u00b8\5\22\n\2\u00a1\u00a2\7\27\2\2\u00a2\u00b8\5\22\n"+
		"\2\u00a3\u00a4\7\30\2\2\u00a4\u00b8\5\22\n\2\u00a5\u00a6\7\31\2\2\u00a6"+
		"\u00b8\5\22\n\2\u00a7\u00a8\7\32\2\2\u00a8\u00b8\5\22\n\2\u00a9\u00aa"+
		"\7\33\2\2\u00aa\u00b8\5\22\n\2\u00ab\u00ac\7\34\2\2\u00ac\u00b8\5\22\n"+
		"\2\u00ad\u00ae\7\35\2\2\u00ae\u00b8\5\22\n\2\u00af\u00b0\7\36\2\2\u00b0"+
		"\u00b8\5\22\n\2\u00b1\u00b2\7\37\2\2\u00b2\u00b8\5\22\n\2\u00b3\u00b4"+
		"\7 \2\2\u00b4\u00b8\5\22\n\2\u00b5\u00b6\7!\2\2\u00b6\u00b8\5\22\n\2\u00b7"+
		"\u009d\3\2\2\2\u00b7\u009f\3\2\2\2\u00b7\u00a1\3\2\2\2\u00b7\u00a3\3\2"+
		"\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2"+
		"\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00be"+
		"\5\22\n\2\u00ba\u00bb\7\"\2\2\u00bb\u00bd\5\22\n\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2\35\3\2\2\2\30)"+
		"/8<MU[bimqtx|\u0080\u0084\u0087\u008a\u008c\u0096\u00b7\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}