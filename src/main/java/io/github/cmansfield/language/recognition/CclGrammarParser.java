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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, MODIFIER=45, 
		PRIMITIVE_TYPE=46, IDENTIFIER=47, STRING_LITTERAL=48, CHARACTER_LITTERAL=49, 
		NUMERIC_LITTERAL=50, NUMBER=51, WHITESPACE=52, NEWLINE=53, LINE_COMMENT=54, 
		MULTILINE_COMMENT=55;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_templateDeclaration = 3, RULE_templateList = 4, RULE_classMemberDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_parameterList = 7, RULE_parameter = 8, 
		RULE_constructorDeclaration = 9, RULE_methodBody = 10, RULE_variableDeclaration = 11, 
		RULE_statement = 12, RULE_assignmentExpression = 13, RULE_typeCast = 14, 
		RULE_braceEnclosedInitializer = 15, RULE_newDeclaration = 16, RULE_expression = 17, 
		RULE_fnArrMember = 18, RULE_memberRefz = 19, RULE_expressionz = 20, RULE_invokeOperator = 21, 
		RULE_arrayOperator = 22, RULE_argumentList = 23, RULE_type = 24;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "classDeclaration", "templateDeclaration", 
		"templateList", "classMemberDeclaration", "methodDeclaration", "parameterList", 
		"parameter", "constructorDeclaration", "methodBody", "variableDeclaration", 
		"statement", "assignmentExpression", "typeCast", "braceEnclosedInitializer", 
		"newDeclaration", "expression", "fnArrMember", "memberRefz", "expressionz", 
		"invokeOperator", "arrayOperator", "argumentList", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'('", "')'", "'import'", "'.'", "';'", "'class'", "'{'", 
		"'}'", "','", "'='", "'if'", "'else'", "'while'", "'for'", "'return'", 
		"'print'", "'read'", "'spawn'", "'set'", "'block'", "'lock'", "'unlock'", 
		"'new'", "'['", "']'", "'true'", "'false'", "'null'", "'this'", "'?'", 
		"':'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "MODIFIER", "PRIMITIVE_TYPE", 
		"IDENTIFIER", "STRING_LITTERAL", "CHARACTER_LITTERAL", "NUMERIC_LITTERAL", 
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
		public TerminalNode EOF() { return getToken(CclGrammarParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(50);
				importDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					classDeclaration();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			match(MODIFIER);
			setState(63);
			match(PRIMITIVE_TYPE);
			setState(64);
			match(T__0);
			setState(65);
			match(T__1);
			setState(66);
			match(T__2);
			setState(67);
			methodBody();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==MODIFIER) {
				{
				{
				setState(68);
				classDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(EOF);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(CclGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CclGrammarParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__3);
			setState(77);
			match(IDENTIFIER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(78);
				match(T__4);
				setState(79);
				match(IDENTIFIER);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__5);
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
		public List<TerminalNode> MODIFIER() { return getTokens(CclGrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(CclGrammarParser.MODIFIER, i);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public List<ClassMemberDeclarationContext> classMemberDeclaration() {
			return getRuleContexts(ClassMemberDeclarationContext.class);
		}
		public ClassMemberDeclarationContext classMemberDeclaration(int i) {
			return getRuleContext(ClassMemberDeclarationContext.class,i);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(87);
				match(MODIFIER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__6);
			setState(94);
			match(IDENTIFIER);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(95);
				templateDeclaration();
				}
			}

			setState(98);
			match(T__7);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==IDENTIFIER) {
				{
				{
				setState(99);
				classMemberDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TemplateListContext templateList() {
			return getRuleContext(TemplateListContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitTemplateDeclaration(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__1);
			setState(108);
			templateList();
			setState(109);
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

	public static class TemplateListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CclGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CclGrammarParser.IDENTIFIER, i);
		}
		public TemplateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterTemplateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitTemplateList(this);
		}
	}

	public final TemplateListContext templateList() throws RecognitionException {
		TemplateListContext _localctx = new TemplateListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(112);
				match(T__9);
				setState(113);
				match(IDENTIFIER);
				}
				}
				setState(118);
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

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> MODIFIER() { return getTokens(CclGrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(CclGrammarParser.MODIFIER, i);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_classMemberDeclaration);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(MODIFIER);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MODIFIER );
				setState(125);
				type();
				setState(126);
				match(IDENTIFIER);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(127);
					arrayOperator();
					}
				}

				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(130);
					match(T__10);
					setState(131);
					assignmentExpression();
					}
				}

				setState(134);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				constructorDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(CclGrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(CclGrammarParser.MODIFIER, i);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(MODIFIER);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFIER );
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(144);
				templateDeclaration();
				}
			}

			setState(147);
			type();
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(T__1);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(150);
				parameterList();
				}
			}

			setState(153);
			match(T__2);
			setState(154);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			parameter();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(157);
				match(T__9);
				setState(158);
				parameter();
				}
				}
				setState(163);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
			setState(165);
			match(IDENTIFIER);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(166);
				arrayOperator();
				}
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(CclGrammarParser.MODIFIER, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(169);
				match(MODIFIER);
				}
			}

			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(T__1);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(174);
				parameterList();
				}
			}

			setState(177);
			match(T__2);
			setState(178);
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
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__7);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(181);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(182);
					statement();
					}
					break;
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			type();
			setState(191);
			match(IDENTIFIER);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(192);
				arrayOperator();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(195);
				match(T__10);
				setState(196);
				assignmentExpression();
				}
			}

			setState(199);
			match(T__5);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
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
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__11);
				setState(202);
				match(T__1);
				setState(203);
				expression(0);
				setState(204);
				match(T__2);
				setState(205);
				statement();
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(206);
					match(T__12);
					setState(207);
					statement();
					}
					break;
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__13);
				setState(211);
				match(T__1);
				setState(212);
				expression(0);
				setState(213);
				match(T__2);
				setState(214);
				statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__14);
				setState(217);
				match(T__1);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(218);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(219);
					expression(0);
					setState(220);
					match(T__5);
					}
					break;
				case 3:
					{
					setState(222);
					match(T__5);
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(225);
					expression(0);
					}
				}

				setState(228);
				match(T__5);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(229);
					expression(0);
					}
				}

				setState(232);
				match(T__2);
				setState(233);
				statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__15);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(235);
					expression(0);
					}
				}

				setState(238);
				match(T__5);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				match(T__16);
				setState(240);
				match(T__1);
				setState(241);
				expression(0);
				setState(242);
				match(T__2);
				setState(243);
				match(T__5);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(T__17);
				setState(246);
				invokeOperator();
				setState(247);
				match(T__5);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(T__18);
				setState(250);
				expression(0);
				setState(251);
				match(T__19);
				setState(252);
				match(IDENTIFIER);
				setState(253);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(T__20);
				setState(256);
				invokeOperator();
				setState(257);
				match(T__5);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				match(T__21);
				setState(260);
				match(IDENTIFIER);
				setState(261);
				match(T__5);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(T__22);
				setState(263);
				match(IDENTIFIER);
				setState(264);
				match(T__5);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 11);
				{
				setState(265);
				match(T__7);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					{
					setState(266);
					statement();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__8);
				}
				break;
			case T__1:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case IDENTIFIER:
			case STRING_LITTERAL:
			case CHARACTER_LITTERAL:
			case NUMERIC_LITTERAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				expression(0);
				setState(274);
				match(T__5);
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
		enterRule(_localctx, 26, RULE_assignmentExpression);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__23);
				setState(279);
				type();
				setState(280);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				typeCast();
				setState(283);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(STRING_LITTERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				braceEnclosedInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
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
		enterRule(_localctx, 28, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__1);
			setState(291);
			match(PRIMITIVE_TYPE);
			setState(292);
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
		enterRule(_localctx, 30, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__7);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(295);
				argumentList();
				}
			}

			setState(298);
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
		enterRule(_localctx, 32, RULE_newDeclaration);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__1);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(301);
					argumentList();
					}
				}

				setState(304);
				match(T__2);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__24);
				setState(306);
				expression(0);
				setState(307);
				match(T__25);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(312);
				match(T__1);
				setState(313);
				expression(0);
				setState(314);
				match(T__2);
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(315);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__26:
			case T__27:
			case T__28:
				{
				setState(318);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(319);
					expressionz();
					}
					break;
				}
				}
				break;
			case T__29:
				{
				setState(322);
				match(T__29);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(323);
					memberRefz();
					}
					break;
				}
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(326);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(329);
				match(NUMERIC_LITTERAL);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(330);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(333);
				match(CHARACTER_LITTERAL);
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(334);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(337);
				match(STRING_LITTERAL);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(338);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(341);
				match(IDENTIFIER);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(342);
					fnArrMember();
					}
					break;
				}
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(345);
					memberRefz();
					}
					break;
				}
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(348);
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
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(353);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(354);
					match(T__30);
					setState(355);
					expression(0);
					setState(356);
					match(T__31);
					setState(357);
					expression(2);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 36, RULE_fnArrMember);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(T__1);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(365);
					argumentList();
					}
				}

				setState(368);
				match(T__2);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(T__24);
				setState(370);
				expression(0);
				setState(371);
				match(T__25);
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
		enterRule(_localctx, 38, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__4);
			setState(376);
			match(IDENTIFIER);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(377);
				fnArrMember();
				}
				break;
			}
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(380);
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
		enterRule(_localctx, 40, RULE_expressionz);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(T__10);
				setState(384);
				assignmentExpression();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(T__32);
				setState(386);
				expression(0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(T__33);
				setState(388);
				expression(0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(T__34);
				setState(390);
				expression(0);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				match(T__35);
				setState(392);
				expression(0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(T__36);
				setState(394);
				expression(0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 7);
				{
				setState(395);
				match(T__37);
				setState(396);
				expression(0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				match(T__38);
				setState(398);
				expression(0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 9);
				{
				setState(399);
				match(T__39);
				setState(400);
				expression(0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 10);
				{
				setState(401);
				match(T__40);
				setState(402);
				expression(0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 11);
				{
				setState(403);
				match(T__41);
				setState(404);
				expression(0);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 12);
				{
				setState(405);
				match(T__42);
				setState(406);
				expression(0);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 13);
				{
				setState(407);
				match(T__43);
				setState(408);
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

	public static class InvokeOperatorContext extends ParserRuleContext {
		public InvokeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterInvokeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitInvokeOperator(this);
		}
	}

	public final InvokeOperatorContext invokeOperator() throws RecognitionException {
		InvokeOperatorContext _localctx = new InvokeOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__1);
			setState(412);
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

	public static class ArrayOperatorContext extends ParserRuleContext {
		public ArrayOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterArrayOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitArrayOperator(this);
		}
	}

	public final ArrayOperatorContext arrayOperator() throws RecognitionException {
		ArrayOperatorContext _localctx = new ArrayOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__24);
			setState(415);
			match(T__25);
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
		enterRule(_localctx, 46, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			expression(0);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(418);
				match(T__9);
				setState(419);
				expression(0);
				}
				}
				setState(424);
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
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3"+
		"\4\3\4\5\4c\n\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\7\3\7\6\7|\n\7\r\7\16\7}\3\7"+
		"\3\7\3\7\5\7\u0083\n\7\3\7\3\7\5\7\u0087\n\7\3\7\3\7\3\7\5\7\u008c\n\7"+
		"\3\b\6\b\u008f\n\b\r\b\16\b\u0090\3\b\5\b\u0094\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u009a\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t"+
		"\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\5\13\u00ad\n\13\3\13\3\13\3\13\5\13\u00b2"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\5\r\u00c4\n\r\3\r\3\r\5\r\u00c8\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\16\5\16\u00e5\n"+
		"\16\3\16\3\16\5\16\u00e9\n\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u010e\n\16\f\16\16\16\u0111\13\16\3\16\3\16\3\16\3\16\5\16\u0117"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u012b\n\21\3\21\3\21\3\22\3\22\5\22"+
		"\u0131\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0138\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u013f\n\23\3\23\3\23\5\23\u0143\n\23\3\23\3\23\5\23\u0147"+
		"\n\23\3\23\5\23\u014a\n\23\3\23\3\23\5\23\u014e\n\23\3\23\3\23\5\23\u0152"+
		"\n\23\3\23\3\23\5\23\u0156\n\23\3\23\3\23\5\23\u015a\n\23\3\23\5\23\u015d"+
		"\n\23\3\23\5\23\u0160\n\23\5\23\u0162\n\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u016a\n\23\f\23\16\23\u016d\13\23\3\24\3\24\5\24\u0171\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u0178\n\24\3\25\3\25\3\25\5\25\u017d\n\25"+
		"\3\25\5\25\u0180\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u019c\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u01a7\n\31\f\31\16\31\u01aa\13\31\3\32\3\32\3\32\2\3$\33\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\35\37\3\2\60\61"+
		"\2\u01e7\2\67\3\2\2\2\4N\3\2\2\2\6\\\3\2\2\2\bm\3\2\2\2\nq\3\2\2\2\f\u008b"+
		"\3\2\2\2\16\u008e\3\2\2\2\20\u009e\3\2\2\2\22\u00a6\3\2\2\2\24\u00ac\3"+
		"\2\2\2\26\u00b6\3\2\2\2\30\u00c0\3\2\2\2\32\u0116\3\2\2\2\34\u0122\3\2"+
		"\2\2\36\u0124\3\2\2\2 \u0128\3\2\2\2\"\u0137\3\2\2\2$\u0161\3\2\2\2&\u0177"+
		"\3\2\2\2(\u0179\3\2\2\2*\u019b\3\2\2\2,\u019d\3\2\2\2.\u01a0\3\2\2\2\60"+
		"\u01a3\3\2\2\2\62\u01ab\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\6\4\2;:\3\2\2\2"+
		"<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7/\2\2AB\7\60\2\2"+
		"BC\7\3\2\2CD\7\4\2\2DE\7\5\2\2EI\5\26\f\2FH\5\6\4\2GF\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NO\7\6"+
		"\2\2OT\7\61\2\2PQ\7\7\2\2QS\7\61\2\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\b\2\2X\5\3\2\2\2Y[\7/\2\2ZY\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\t\2\2`b\7\61\2\2"+
		"ac\5\b\5\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dh\7\n\2\2eg\5\f\7\2fe\3\2\2\2"+
		"gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\13\2\2l\7\3\2\2"+
		"\2mn\7\4\2\2no\5\n\6\2op\7\5\2\2p\t\3\2\2\2qv\7\61\2\2rs\7\f\2\2su\7\61"+
		"\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xv\3\2\2\2y\u008c"+
		"\5\16\b\2z|\7/\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\5\62\32\2\u0080\u0082\7\61\2\2\u0081\u0083\5.\30\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\7\r"+
		"\2\2\u0085\u0087\5\34\17\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008c\3\2\2\2\u008a\u008c\5\24"+
		"\13\2\u008by\3\2\2\2\u008b{\3\2\2\2\u008b\u008a\3\2\2\2\u008c\r\3\2\2"+
		"\2\u008d\u008f\7/\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\b\5\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\62"+
		"\32\2\u0096\u0097\7\61\2\2\u0097\u0099\7\4\2\2\u0098\u009a\5\20\t\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\5"+
		"\2\2\u009c\u009d\5\26\f\2\u009d\17\3\2\2\2\u009e\u00a3\5\22\n\2\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00a2\5\22\n\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\5\62\32\2\u00a7\u00a9\7\61\2\2\u00a8\u00aa"+
		"\5.\30\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\23\3\2\2\2\u00ab"+
		"\u00ad\7/\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\7\61\2\2\u00af\u00b1\7\4\2\2\u00b0\u00b2\5\20\t\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\5"+
		"\2\2\u00b4\u00b5\5\26\f\2\u00b5\25\3\2\2\2\u00b6\u00bb\7\n\2\2\u00b7\u00ba"+
		"\5\30\r\2\u00b8\u00ba\5\32\16\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf\27\3\2\2\2\u00c0"+
		"\u00c1\5\62\32\2\u00c1\u00c3\7\61\2\2\u00c2\u00c4\5.\30\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6"+
		"\u00c8\5\34\17\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9\u00ca\7\b\2\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc"+
		"\u00cd\7\4\2\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7\5\2\2\u00cf\u00d2\5\32"+
		"\16\2\u00d0\u00d1\7\17\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u0117\3\2\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\7"+
		"\4\2\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9\5\32\16\2\u00d9"+
		"\u0117\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00e1\7\4\2\2\u00dc\u00e2\5"+
		"\30\r\2\u00dd\u00de\5$\23\2\u00de\u00df\7\b\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00e2\7\b\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5\5$\23\2\u00e4\u00e3\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\7\b\2\2\u00e7\u00e9\5$"+
		"\23\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\7\5\2\2\u00eb\u0117\5\32\16\2\u00ec\u00ee\7\22\2\2\u00ed\u00ef"+
		"\5$\23\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u0117\7\b\2\2\u00f1\u00f2\7\23\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\5"+
		"$\23\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6\7\b\2\2\u00f6\u0117\3\2\2\2\u00f7"+
		"\u00f8\7\24\2\2\u00f8\u00f9\5,\27\2\u00f9\u00fa\7\b\2\2\u00fa\u0117\3"+
		"\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\5$\23\2\u00fd\u00fe\7\26\2\2\u00fe"+
		"\u00ff\7\61\2\2\u00ff\u0100\7\b\2\2\u0100\u0117\3\2\2\2\u0101\u0102\7"+
		"\27\2\2\u0102\u0103\5,\27\2\u0103\u0104\7\b\2\2\u0104\u0117\3\2\2\2\u0105"+
		"\u0106\7\30\2\2\u0106\u0107\7\61\2\2\u0107\u0117\7\b\2\2\u0108\u0109\7"+
		"\31\2\2\u0109\u010a\7\61\2\2\u010a\u0117\7\b\2\2\u010b\u010f\7\n\2\2\u010c"+
		"\u010e\5\32\16\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0117\7\13\2\2\u0113\u0114\5$\23\2\u0114\u0115\7\b\2\2\u0115\u0117\3"+
		"\2\2\2\u0116\u00cb\3\2\2\2\u0116\u00d4\3\2\2\2\u0116\u00da\3\2\2\2\u0116"+
		"\u00ec\3\2\2\2\u0116\u00f1\3\2\2\2\u0116\u00f7\3\2\2\2\u0116\u00fb\3\2"+
		"\2\2\u0116\u0101\3\2\2\2\u0116\u0105\3\2\2\2\u0116\u0108\3\2\2\2\u0116"+
		"\u010b\3\2\2\2\u0116\u0113\3\2\2\2\u0117\33\3\2\2\2\u0118\u0119\7\32\2"+
		"\2\u0119\u011a\5\62\32\2\u011a\u011b\5\"\22\2\u011b\u0123\3\2\2\2\u011c"+
		"\u011d\5\36\20\2\u011d\u011e\5$\23\2\u011e\u0123\3\2\2\2\u011f\u0123\7"+
		"\62\2\2\u0120\u0123\5 \21\2\u0121\u0123\5$\23\2\u0122\u0118\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\35\3\2\2\2\u0124\u0125\7\4\2\2\u0125\u0126\7\60\2\2\u0126\u0127"+
		"\7\5\2\2\u0127\37\3\2\2\2\u0128\u012a\7\n\2\2\u0129\u012b\5\60\31\2\u012a"+
		"\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\13"+
		"\2\2\u012d!\3\2\2\2\u012e\u0130\7\4\2\2\u012f\u0131\5\60\31\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0138\7\5\2\2\u0133"+
		"\u0134\7\33\2\2\u0134\u0135\5$\23\2\u0135\u0136\7\34\2\2\u0136\u0138\3"+
		"\2\2\2\u0137\u012e\3\2\2\2\u0137\u0133\3\2\2\2\u0138#\3\2\2\2\u0139\u013a"+
		"\b\23\1\2\u013a\u013b\7\4\2\2\u013b\u013c\5$\23\2\u013c\u013e\7\5\2\2"+
		"\u013d\u013f\5*\26\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0162"+
		"\3\2\2\2\u0140\u0142\t\2\2\2\u0141\u0143\5*\26\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0162\3\2\2\2\u0144\u0146\7 \2\2\u0145\u0147\5(\25"+
		"\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a"+
		"\5*\26\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0162\3\2\2\2\u014b"+
		"\u014d\7\64\2\2\u014c\u014e\5*\26\2\u014d\u014c\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u0162\3\2\2\2\u014f\u0151\7\63\2\2\u0150\u0152\5*\26\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0162\3\2\2\2\u0153\u0155\7\62"+
		"\2\2\u0154\u0156\5*\26\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0162\3\2\2\2\u0157\u0159\7\61\2\2\u0158\u015a\5&\24\2\u0159\u0158\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\5(\25\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\5*"+
		"\26\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u0139\3\2\2\2\u0161\u0140\3\2\2\2\u0161\u0144\3\2\2\2\u0161\u014b\3\2"+
		"\2\2\u0161\u014f\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0157\3\2\2\2\u0162"+
		"\u016b\3\2\2\2\u0163\u0164\f\3\2\2\u0164\u0165\7!\2\2\u0165\u0166\5$\23"+
		"\2\u0166\u0167\7\"\2\2\u0167\u0168\5$\23\4\u0168\u016a\3\2\2\2\u0169\u0163"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"%\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\7\4\2\2\u016f\u0171\5\60\31"+
		"\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0178"+
		"\7\5\2\2\u0173\u0174\7\33\2\2\u0174\u0175\5$\23\2\u0175\u0176\7\34\2\2"+
		"\u0176\u0178\3\2\2\2\u0177\u016e\3\2\2\2\u0177\u0173\3\2\2\2\u0178\'\3"+
		"\2\2\2\u0179\u017a\7\7\2\2\u017a\u017c\7\61\2\2\u017b\u017d\5&\24\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\5("+
		"\25\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180)\3\2\2\2\u0181\u0182"+
		"\7\r\2\2\u0182\u019c\5\34\17\2\u0183\u0184\7#\2\2\u0184\u019c\5$\23\2"+
		"\u0185\u0186\7$\2\2\u0186\u019c\5$\23\2\u0187\u0188\7%\2\2\u0188\u019c"+
		"\5$\23\2\u0189\u018a\7&\2\2\u018a\u019c\5$\23\2\u018b\u018c\7\'\2\2\u018c"+
		"\u019c\5$\23\2\u018d\u018e\7(\2\2\u018e\u019c\5$\23\2\u018f\u0190\7)\2"+
		"\2\u0190\u019c\5$\23\2\u0191\u0192\7*\2\2\u0192\u019c\5$\23\2\u0193\u0194"+
		"\7+\2\2\u0194\u019c\5$\23\2\u0195\u0196\7,\2\2\u0196\u019c\5$\23\2\u0197"+
		"\u0198\7-\2\2\u0198\u019c\5$\23\2\u0199\u019a\7.\2\2\u019a\u019c\5$\23"+
		"\2\u019b\u0181\3\2\2\2\u019b\u0183\3\2\2\2\u019b\u0185\3\2\2\2\u019b\u0187"+
		"\3\2\2\2\u019b\u0189\3\2\2\2\u019b\u018b\3\2\2\2\u019b\u018d\3\2\2\2\u019b"+
		"\u018f\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u0195\3\2"+
		"\2\2\u019b\u0197\3\2\2\2\u019b\u0199\3\2\2\2\u019c+\3\2\2\2\u019d\u019e"+
		"\7\4\2\2\u019e\u019f\7\5\2\2\u019f-\3\2\2\2\u01a0\u01a1\7\33\2\2\u01a1"+
		"\u01a2\7\34\2\2\u01a2/\3\2\2\2\u01a3\u01a8\5$\23\2\u01a4\u01a5\7\f\2\2"+
		"\u01a5\u01a7\5$\23\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\61\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\t\3\2\2\u01ac\63\3\2\2\2\66\67=IT\\bhv}\u0082\u0086\u008b\u0090"+
		"\u0093\u0099\u00a3\u00a9\u00ac\u00b1\u00b9\u00bb\u00c3\u00c7\u00d2\u00e1"+
		"\u00e4\u00e8\u00ee\u010f\u0116\u0122\u012a\u0130\u0137\u013e\u0142\u0146"+
		"\u0149\u014d\u0151\u0155\u0159\u015c\u015f\u0161\u016b\u0170\u0177\u017c"+
		"\u017f\u019b\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}