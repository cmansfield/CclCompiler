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
		TRUE=10, FALSE=11, NULL=12, THIS=13, IF=14, ELSE=15, WHILE=16, FOR=17, 
		NEW=18, RETURN=19, PRINT=20, READ=21, SPAWN=22, SET=23, BLOCK=24, LOCK=25, 
		UNLOCK=26, IMPORT=27, CLASS=28, MAIN=29, NOT_EQ=30, NOT=31, AND=32, OR=33, 
		PLUS=34, MINUS=35, MULTI=36, DIV=37, EQUALS=38, LESS_EQ=39, GREAT_EQ=40, 
		LESS=41, GREATER=42, ASSIGN=43, QUESTION=44, COLON=45, MODIFIER=46, PRIMITIVE_TYPE=47, 
		IDENTIFIER=48, STRING_LITTERAL=49, CHARACTER_LITTERAL=50, NUMERIC_LITTERAL=51, 
		NUMBER=52, WHITESPACE=53, NEWLINE=54, LINE_COMMENT=55, MULTILINE_COMMENT=56;
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_templateDeclaration = 3, RULE_templateList = 4, RULE_classMemberDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_parameterList = 7, RULE_parameter = 8, 
		RULE_constructorDeclaration = 9, RULE_methodBody = 10, RULE_variableDeclaration = 11, 
		RULE_statement = 12, RULE_statementWithScope = 13, RULE_assignmentExpression = 14, 
		RULE_typeCast = 15, RULE_braceEnclosedInitializer = 16, RULE_newDeclaration = 17, 
		RULE_expression = 18, RULE_fnArrMember = 19, RULE_memberRefz = 20, RULE_expressionz = 21, 
		RULE_assignmentOperation = 22, RULE_booleanOperation = 23, RULE_mathOperation = 24, 
		RULE_invokeOperator = 25, RULE_arrayOperator = 26, RULE_argumentList = 27, 
		RULE_type = 28, RULE_className = 29;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "classDeclaration", "templateDeclaration", 
		"templateList", "classMemberDeclaration", "methodDeclaration", "parameterList", 
		"parameter", "constructorDeclaration", "methodBody", "variableDeclaration", 
		"statement", "statementWithScope", "assignmentExpression", "typeCast", 
		"braceEnclosedInitializer", "newDeclaration", "expression", "fnArrMember", 
		"memberRefz", "expressionz", "assignmentOperation", "booleanOperation", 
		"mathOperation", "invokeOperator", "arrayOperator", "argumentList", "type", 
		"className"
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
		"COLON", "MODIFIER", "PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITTERAL", 
		"CHARACTER_LITTERAL", "NUMERIC_LITTERAL", "NUMBER", "WHITESPACE", "NEWLINE", 
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
		public TerminalNode MAIN() { return getToken(CclGrammarParser.MAIN, 0); }
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(60);
				importDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					classDeclaration();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(72);
			match(MODIFIER);
			setState(73);
			match(PRIMITIVE_TYPE);
			setState(74);
			match(MAIN);
			setState(75);
			match(T__0);
			setState(76);
			match(T__1);
			setState(77);
			methodBody();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==MODIFIER) {
				{
				{
				setState(78);
				classDeclaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
		public TerminalNode IMPORT() { return getToken(CclGrammarParser.IMPORT, 0); }
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
			setState(86);
			match(IMPORT);
			setState(87);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(88);
				match(T__2);
				setState(89);
				match(IDENTIFIER);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__3);
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
		public TerminalNode CLASS() { return getToken(CclGrammarParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(97);
				match(MODIFIER);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(CLASS);
			setState(104);
			className();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(105);
				templateDeclaration();
				}
			}

			setState(108);
			match(T__4);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << MODIFIER) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(109);
				classMemberDeclaration();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			setState(117);
			match(T__0);
			setState(118);
			templateList();
			setState(119);
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
			setState(121);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(122);
				match(T__6);
				setState(123);
				match(IDENTIFIER);
				}
				}
				setState(128);
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
		public TerminalNode ASSIGN() { return getToken(CclGrammarParser.ASSIGN, 0); }
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MODIFIER) {
					{
					{
					setState(130);
					match(MODIFIER);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				type();
				setState(137);
				match(IDENTIFIER);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(138);
					arrayOperator();
					}
				}

				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(141);
					match(ASSIGN);
					setState(142);
					assignmentExpression();
					}
				}

				setState(145);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
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
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(150);
				match(MODIFIER);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(156);
				templateDeclaration();
				}
			}

			setState(159);
			type();
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(T__0);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(162);
				parameterList();
				}
			}

			setState(165);
			match(T__1);
			setState(166);
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
			setState(168);
			parameter();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(169);
				match(T__6);
				setState(170);
				parameter();
				}
				}
				setState(175);
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
			setState(176);
			type();
			setState(177);
			match(IDENTIFIER);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(178);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(181);
				match(MODIFIER);
				}
			}

			setState(184);
			className();
			setState(185);
			match(T__0);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(186);
				parameterList();
				}
			}

			setState(189);
			match(T__1);
			setState(190);
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
			setState(192);
			match(T__4);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(193);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(194);
					statement();
					}
					break;
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CclGrammarParser.ASSIGN, 0); }
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
			setState(202);
			type();
			setState(203);
			match(IDENTIFIER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(204);
				arrayOperator();
				}
			}

			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(207);
				match(ASSIGN);
				setState(208);
				assignmentExpression();
				}
			}

			setState(211);
			match(T__3);
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
		public TerminalNode RETURN() { return getToken(CclGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(CclGrammarParser.PRINT, 0); }
		public TerminalNode READ() { return getToken(CclGrammarParser.READ, 0); }
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public TerminalNode SPAWN() { return getToken(CclGrammarParser.SPAWN, 0); }
		public TerminalNode SET() { return getToken(CclGrammarParser.SET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public TerminalNode BLOCK() { return getToken(CclGrammarParser.BLOCK, 0); }
		public TerminalNode LOCK() { return getToken(CclGrammarParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(CclGrammarParser.UNLOCK, 0); }
		public StatementWithScopeContext statementWithScope() {
			return getRuleContext(StatementWithScopeContext.class,0);
		}
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
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(RETURN);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(214);
					expression(0);
					}
				}

				setState(217);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(PRINT);
				setState(219);
				match(T__0);
				setState(220);
				expression(0);
				setState(221);
				match(T__1);
				setState(222);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(READ);
				setState(225);
				invokeOperator();
				setState(226);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(SPAWN);
				setState(229);
				expression(0);
				setState(230);
				match(SET);
				setState(231);
				match(IDENTIFIER);
				setState(232);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(BLOCK);
				setState(235);
				invokeOperator();
				setState(236);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(LOCK);
				setState(239);
				match(IDENTIFIER);
				setState(240);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				match(UNLOCK);
				setState(242);
				match(IDENTIFIER);
				setState(243);
				match(T__3);
				}
				break;
			case T__4:
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				statementWithScope();
				}
				break;
			case T__0:
			case TRUE:
			case FALSE:
			case NULL:
			case THIS:
			case NOT:
			case IDENTIFIER:
			case STRING_LITTERAL:
			case CHARACTER_LITTERAL:
			case NUMERIC_LITTERAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				expression(0);
				setState(246);
				match(T__3);
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

	public static class StatementWithScopeContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CclGrammarParser.IF, 0); }
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
		public TerminalNode ELSE() { return getToken(CclGrammarParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CclGrammarParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(CclGrammarParser.FOR, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementWithScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterStatementWithScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitStatementWithScope(this);
		}
	}

	public final StatementWithScopeContext statementWithScope() throws RecognitionException {
		StatementWithScopeContext _localctx = new StatementWithScopeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementWithScope);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(IF);
				setState(251);
				match(T__0);
				setState(252);
				expression(0);
				setState(253);
				match(T__1);
				setState(254);
				statement();
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(255);
					match(ELSE);
					setState(256);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(WHILE);
				setState(260);
				match(T__0);
				setState(261);
				expression(0);
				setState(262);
				match(T__1);
				setState(263);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(FOR);
				setState(266);
				match(T__0);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(267);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(268);
					expression(0);
					setState(269);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(271);
					match(T__3);
					}
					break;
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(274);
					expression(0);
					}
				}

				setState(277);
				match(T__3);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(278);
					expression(0);
					}
				}

				setState(281);
				match(T__1);
				setState(282);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(T__4);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					{
					setState(284);
					statement();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(290);
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
		public TerminalNode NEW() { return getToken(CclGrammarParser.NEW, 0); }
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
		enterRule(_localctx, 28, RULE_assignmentExpression);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(NEW);
				setState(294);
				type();
				setState(295);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				typeCast();
				setState(298);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(STRING_LITTERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				braceEnclosedInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
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
		enterRule(_localctx, 30, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__0);
			setState(306);
			match(PRIMITIVE_TYPE);
			setState(307);
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
		enterRule(_localctx, 32, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__4);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(310);
				argumentList();
				}
			}

			setState(313);
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
		enterRule(_localctx, 34, RULE_newDeclaration);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__0);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(316);
					argumentList();
					}
				}

				setState(319);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__7);
				setState(321);
				expression(0);
				setState(322);
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
		public TerminalNode TRUE() { return getToken(CclGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CclGrammarParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CclGrammarParser.NULL, 0); }
		public TerminalNode THIS() { return getToken(CclGrammarParser.THIS, 0); }
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
		public TerminalNode NOT() { return getToken(CclGrammarParser.NOT, 0); }
		public TerminalNode QUESTION() { return getToken(CclGrammarParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(CclGrammarParser.COLON, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(327);
				match(T__0);
				setState(328);
				expression(0);
				setState(329);
				match(T__1);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(330);
					expressionz();
					}
					break;
				}
				}
				break;
			case TRUE:
			case FALSE:
			case NULL:
				{
				setState(333);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(334);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(337);
				match(THIS);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(338);
					memberRefz();
					}
					break;
				}
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(341);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(344);
				match(NUMERIC_LITTERAL);
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(345);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(348);
				match(CHARACTER_LITTERAL);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(349);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(352);
				match(STRING_LITTERAL);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(353);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(356);
				match(IDENTIFIER);
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(357);
					fnArrMember();
					}
					break;
				}
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(360);
					memberRefz();
					}
					break;
				}
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(363);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(366);
				match(NOT);
				setState(367);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(370);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(371);
					match(QUESTION);
					setState(372);
					expression(0);
					setState(373);
					match(COLON);
					setState(374);
					expression(3);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 38, RULE_fnArrMember);
		int _la;
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__0);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(382);
					argumentList();
					}
				}

				setState(385);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__7);
				setState(387);
				expression(0);
				setState(388);
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
		enterRule(_localctx, 40, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__2);
			setState(393);
			match(IDENTIFIER);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(394);
				fnArrMember();
				}
				break;
			}
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(397);
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
		public AssignmentOperationContext assignmentOperation() {
			return getRuleContext(AssignmentOperationContext.class,0);
		}
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
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
		enterRule(_localctx, 42, RULE_expressionz);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				assignmentOperation();
				}
				break;
			case NOT_EQ:
			case AND:
			case OR:
			case EQUALS:
			case LESS_EQ:
			case GREAT_EQ:
			case LESS:
			case GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				mathOperation();
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

	public static class AssignmentOperationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CclGrammarParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterAssignmentOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitAssignmentOperation(this);
		}
	}

	public final AssignmentOperationContext assignmentOperation() throws RecognitionException {
		AssignmentOperationContext _localctx = new AssignmentOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ASSIGN);
			setState(406);
			assignmentExpression();
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

	public static class BooleanOperationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CclGrammarParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CclGrammarParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(CclGrammarParser.EQUALS, 0); }
		public TerminalNode NOT_EQ() { return getToken(CclGrammarParser.NOT_EQ, 0); }
		public TerminalNode LESS_EQ() { return getToken(CclGrammarParser.LESS_EQ, 0); }
		public TerminalNode GREAT_EQ() { return getToken(CclGrammarParser.GREAT_EQ, 0); }
		public TerminalNode LESS() { return getToken(CclGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(CclGrammarParser.GREATER, 0); }
		public BooleanOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterBooleanOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitBooleanOperation(this);
		}
	}

	public final BooleanOperationContext booleanOperation() throws RecognitionException {
		BooleanOperationContext _localctx = new BooleanOperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanOperation);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(AND);
				setState(409);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OR);
				setState(411);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(EQUALS);
				setState(413);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				match(NOT_EQ);
				setState(415);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				match(LESS_EQ);
				setState(417);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				match(GREAT_EQ);
				setState(419);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(LESS);
				setState(421);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				match(GREATER);
				setState(423);
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

	public static class MathOperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CclGrammarParser.PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CclGrammarParser.MINUS, 0); }
		public TerminalNode MULTI() { return getToken(CclGrammarParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(CclGrammarParser.DIV, 0); }
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterMathOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitMathOperation(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mathOperation);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(PLUS);
				setState(427);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(MINUS);
				setState(429);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(MULTI);
				setState(431);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(DIV);
				setState(433);
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
		enterRule(_localctx, 50, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__0);
			setState(437);
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
		enterRule(_localctx, 52, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__7);
			setState(440);
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
		enterRule(_localctx, 54, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			expression(0);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(443);
				match(T__6);
				setState(444);
				expression(0);
				}
				}
				setState(449);
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
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_type);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				className();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CclGrammarListener ) ((CclGrammarListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IDENTIFIER);
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
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2R\n\2\f\2\16\2U\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16"+
		"\3`\13\3\3\3\3\3\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\3\4\5\4m\n\4\3\4"+
		"\3\4\7\4q\n\4\f\4\16\4t\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\177"+
		"\n\6\f\6\16\6\u0082\13\6\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7"+
		"\3\7\3\7\5\7\u008e\n\7\3\7\3\7\5\7\u0092\n\7\3\7\3\7\3\7\5\7\u0097\n\7"+
		"\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\5\b\u00a0\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a6\n\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1"+
		"\13\t\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\5\13\u00b9\n\13\3\13\3\13\3\13\5"+
		"\13\u00be\n\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00c6\n\f\f\f\16\f\u00c9"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\5\r\u00d4\n\r\3\r\3\r"+
		"\3\16\3\16\5\16\u00da\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fb\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0113\n\17\3\17\5\17\u0116\n\17\3"+
		"\17\3\17\5\17\u011a\n\17\3\17\3\17\3\17\3\17\7\17\u0120\n\17\f\17\16\17"+
		"\u0123\13\17\3\17\5\17\u0126\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0132\n\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u013a"+
		"\n\22\3\22\3\22\3\23\3\23\5\23\u0140\n\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0147\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u014e\n\24\3\24\3\24\5\24\u0152"+
		"\n\24\3\24\3\24\5\24\u0156\n\24\3\24\5\24\u0159\n\24\3\24\3\24\5\24\u015d"+
		"\n\24\3\24\3\24\5\24\u0161\n\24\3\24\3\24\5\24\u0165\n\24\3\24\3\24\5"+
		"\24\u0169\n\24\3\24\5\24\u016c\n\24\3\24\5\24\u016f\n\24\3\24\3\24\5\24"+
		"\u0173\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u017b\n\24\f\24\16\24\u017e"+
		"\13\24\3\25\3\25\5\25\u0182\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u0189\n"+
		"\25\3\26\3\26\3\26\5\26\u018e\n\26\3\26\5\26\u0191\n\26\3\27\3\27\3\27"+
		"\5\27\u0196\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ab\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u01b5\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\7\35\u01c0\n\35\f\35\16\35\u01c3\13\35\3\36\3\36\5\36"+
		"\u01c7\n\36\3\37\3\37\3\37\2\3& \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<\2\3\3\2\f\16\2\u0201\2A\3\2\2\2\4X\3\2\2\2\6"+
		"f\3\2\2\2\bw\3\2\2\2\n{\3\2\2\2\f\u0096\3\2\2\2\16\u009b\3\2\2\2\20\u00aa"+
		"\3\2\2\2\22\u00b2\3\2\2\2\24\u00b8\3\2\2\2\26\u00c2\3\2\2\2\30\u00cc\3"+
		"\2\2\2\32\u00fa\3\2\2\2\34\u0125\3\2\2\2\36\u0131\3\2\2\2 \u0133\3\2\2"+
		"\2\"\u0137\3\2\2\2$\u0146\3\2\2\2&\u0172\3\2\2\2(\u0188\3\2\2\2*\u018a"+
		"\3\2\2\2,\u0195\3\2\2\2.\u0197\3\2\2\2\60\u01aa\3\2\2\2\62\u01b4\3\2\2"+
		"\2\64\u01b6\3\2\2\2\66\u01b9\3\2\2\28\u01bc\3\2\2\2:\u01c6\3\2\2\2<\u01c8"+
		"\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2C"+
		"A\3\2\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2"+
		"IG\3\2\2\2JK\7\60\2\2KL\7\61\2\2LM\7\37\2\2MN\7\3\2\2NO\7\4\2\2OS\5\26"+
		"\f\2PR\5\6\4\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2"+
		"\2\2VW\7\2\2\3W\3\3\2\2\2XY\7\35\2\2Y^\7\62\2\2Z[\7\5\2\2[]\7\62\2\2\\"+
		"Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\6\2\2"+
		"b\5\3\2\2\2ce\7\60\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2"+
		"\2hf\3\2\2\2ij\7\36\2\2jl\5<\37\2km\5\b\5\2lk\3\2\2\2lm\3\2\2\2mn\3\2"+
		"\2\2nr\7\7\2\2oq\5\f\7\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2"+
		"\2\2tr\3\2\2\2uv\7\b\2\2v\7\3\2\2\2wx\7\3\2\2xy\5\n\6\2yz\7\4\2\2z\t\3"+
		"\2\2\2{\u0080\7\62\2\2|}\7\t\2\2}\177\7\62\2\2~|\3\2\2\2\177\u0082\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\13\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0083\u0097\5\16\b\2\u0084\u0086\7\60\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5:\36\2\u008b\u008d\7\62\2\2\u008c"+
		"\u008e\5\66\34\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u0090\7-\2\2\u0090\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\6\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0097\5\24\13\2\u0096\u0083\3\2\2\2\u0096\u0087\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\r\3\2\2\2\u0098\u009a\7\60\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\5\b\5\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5:\36\2\u00a2\u00a3\7\62"+
		"\2\2\u00a3\u00a5\7\3\2\2\u00a4\u00a6\5\20\t\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\26"+
		"\f\2\u00a9\17\3\2\2\2\u00aa\u00af\5\22\n\2\u00ab\u00ac\7\t\2\2\u00ac\u00ae"+
		"\5\22\n\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\5:\36\2\u00b3\u00b5\7\62\2\2\u00b4\u00b6\5\66\34\2\u00b5\u00b4\3\2\2"+
		"\2\u00b5\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\5<\37\2\u00bb"+
		"\u00bd\7\3\2\2\u00bc\u00be\5\20\t\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\25\3\2\2\2\u00c2\u00c7\7\7\2\2\u00c3\u00c6\5\30\r\2\u00c4\u00c6\5\32"+
		"\16\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cb\7\b\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\5:\36\2\u00cd\u00cf"+
		"\7\62\2\2\u00ce\u00d0\5\66\34\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2"+
		"\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\u00d4\5\36\20\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\6"+
		"\2\2\u00d6\31\3\2\2\2\u00d7\u00d9\7\25\2\2\u00d8\u00da\5&\24\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00fb\7\6\2\2\u00dc"+
		"\u00dd\7\26\2\2\u00dd\u00de\7\3\2\2\u00de\u00df\5&\24\2\u00df\u00e0\7"+
		"\4\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00fb\3\2\2\2\u00e2\u00e3\7\27\2\2\u00e3"+
		"\u00e4\5\64\33\2\u00e4\u00e5\7\6\2\2\u00e5\u00fb\3\2\2\2\u00e6\u00e7\7"+
		"\30\2\2\u00e7\u00e8\5&\24\2\u00e8\u00e9\7\31\2\2\u00e9\u00ea\7\62\2\2"+
		"\u00ea\u00eb\7\6\2\2\u00eb\u00fb\3\2\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00ee"+
		"\5\64\33\2\u00ee\u00ef\7\6\2\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\7\33\2"+
		"\2\u00f1\u00f2\7\62\2\2\u00f2\u00fb\7\6\2\2\u00f3\u00f4\7\34\2\2\u00f4"+
		"\u00f5\7\62\2\2\u00f5\u00fb\7\6\2\2\u00f6\u00fb\5\34\17\2\u00f7\u00f8"+
		"\5&\24\2\u00f8\u00f9\7\6\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00d7\3\2\2\2\u00fa"+
		"\u00dc\3\2\2\2\u00fa\u00e2\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00ec\3\2"+
		"\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fb\33\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\7\3\2"+
		"\2\u00fe\u00ff\5&\24\2\u00ff\u0100\7\4\2\2\u0100\u0103\5\32\16\2\u0101"+
		"\u0102\7\21\2\2\u0102\u0104\5\32\16\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0126\3\2\2\2\u0105\u0106\7\22\2\2\u0106\u0107\7\3\2\2"+
		"\u0107\u0108\5&\24\2\u0108\u0109\7\4\2\2\u0109\u010a\5\32\16\2\u010a\u0126"+
		"\3\2\2\2\u010b\u010c\7\23\2\2\u010c\u0112\7\3\2\2\u010d\u0113\5\30\r\2"+
		"\u010e\u010f\5&\24\2\u010f\u0110\7\6\2\2\u0110\u0113\3\2\2\2\u0111\u0113"+
		"\7\6\2\2\u0112\u010d\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0116\5&\24\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7\6\2\2\u0118\u011a\5&\24\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\4"+
		"\2\2\u011c\u0126\5\32\16\2\u011d\u0121\7\7\2\2\u011e\u0120\5\32\16\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\7\b\2\2\u0125"+
		"\u00fc\3\2\2\2\u0125\u0105\3\2\2\2\u0125\u010b\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0126\35\3\2\2\2\u0127\u0128\7\24\2\2\u0128\u0129\5:\36\2\u0129\u012a"+
		"\5$\23\2\u012a\u0132\3\2\2\2\u012b\u012c\5 \21\2\u012c\u012d\5&\24\2\u012d"+
		"\u0132\3\2\2\2\u012e\u0132\7\63\2\2\u012f\u0132\5\"\22\2\u0130\u0132\5"+
		"&\24\2\u0131\u0127\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\37\3\2\2\2\u0133\u0134\7\3\2"+
		"\2\u0134\u0135\7\61\2\2\u0135\u0136\7\4\2\2\u0136!\3\2\2\2\u0137\u0139"+
		"\7\7\2\2\u0138\u013a\58\35\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\b\2\2\u013c#\3\2\2\2\u013d\u013f\7\3\2\2"+
		"\u013e\u0140\58\35\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0147\7\4\2\2\u0142\u0143\7\n\2\2\u0143\u0144\5&\24\2\u0144"+
		"\u0145\7\13\2\2\u0145\u0147\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u0142\3"+
		"\2\2\2\u0147%\3\2\2\2\u0148\u0149\b\24\1\2\u0149\u014a\7\3\2\2\u014a\u014b"+
		"\5&\24\2\u014b\u014d\7\4\2\2\u014c\u014e\5,\27\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0173\3\2\2\2\u014f\u0151\t\2\2\2\u0150\u0152\5,"+
		"\27\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0173\3\2\2\2\u0153"+
		"\u0155\7\17\2\2\u0154\u0156\5*\26\2\u0155\u0154\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5,\27\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u0173\3\2\2\2\u015a\u015c\7\65\2\2\u015b\u015d\5"+
		",\27\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0173\3\2\2\2\u015e"+
		"\u0160\7\64\2\2\u015f\u0161\5,\27\2\u0160\u015f\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0173\3\2\2\2\u0162\u0164\7\63\2\2\u0163\u0165\5,\27\2\u0164"+
		"\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0173\3\2\2\2\u0166\u0168\7\62"+
		"\2\2\u0167\u0169\5(\25\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u016c\5*\26\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016f\5,\27\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0173\3\2\2\2\u0170\u0171\7!\2\2\u0171\u0173\5&\24"+
		"\3\u0172\u0148\3\2\2\2\u0172\u014f\3\2\2\2\u0172\u0153\3\2\2\2\u0172\u015a"+
		"\3\2\2\2\u0172\u015e\3\2\2\2\u0172\u0162\3\2\2\2\u0172\u0166\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u017c\3\2\2\2\u0174\u0175\f\4\2\2\u0175\u0176\7."+
		"\2\2\u0176\u0177\5&\24\2\u0177\u0178\7/\2\2\u0178\u0179\5&\24\5\u0179"+
		"\u017b\3\2\2\2\u017a\u0174\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\'\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181"+
		"\7\3\2\2\u0180\u0182\58\35\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0189\7\4\2\2\u0184\u0185\7\n\2\2\u0185\u0186\5&"+
		"\24\2\u0186\u0187\7\13\2\2\u0187\u0189\3\2\2\2\u0188\u017f\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0189)\3\2\2\2\u018a\u018b\7\5\2\2\u018b\u018d\7\62\2\2"+
		"\u018c\u018e\5(\25\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u0191\5*\26\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"+\3\2\2\2\u0192\u0196\5.\30\2\u0193\u0196\5\60\31\2\u0194\u0196\5\62\32"+
		"\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196-"+
		"\3\2\2\2\u0197\u0198\7-\2\2\u0198\u0199\5\36\20\2\u0199/\3\2\2\2\u019a"+
		"\u019b\7\"\2\2\u019b\u01ab\5&\24\2\u019c\u019d\7#\2\2\u019d\u01ab\5&\24"+
		"\2\u019e\u019f\7(\2\2\u019f\u01ab\5&\24\2\u01a0\u01a1\7 \2\2\u01a1\u01ab"+
		"\5&\24\2\u01a2\u01a3\7)\2\2\u01a3\u01ab\5&\24\2\u01a4\u01a5\7*\2\2\u01a5"+
		"\u01ab\5&\24\2\u01a6\u01a7\7+\2\2\u01a7\u01ab\5&\24\2\u01a8\u01a9\7,\2"+
		"\2\u01a9\u01ab\5&\24\2\u01aa\u019a\3\2\2\2\u01aa\u019c\3\2\2\2\u01aa\u019e"+
		"\3\2\2\2\u01aa\u01a0\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa"+
		"\u01a6\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\61\3\2\2\2\u01ac\u01ad\7$\2\2"+
		"\u01ad\u01b5\5&\24\2\u01ae\u01af\7%\2\2\u01af\u01b5\5&\24\2\u01b0\u01b1"+
		"\7&\2\2\u01b1\u01b5\5&\24\2\u01b2\u01b3\7\'\2\2\u01b3\u01b5\5&\24\2\u01b4"+
		"\u01ac\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\63\3\2\2\2\u01b6\u01b7\7\3\2\2\u01b7\u01b8\7\4\2\2\u01b8\65"+
		"\3\2\2\2\u01b9\u01ba\7\n\2\2\u01ba\u01bb\7\13\2\2\u01bb\67\3\2\2\2\u01bc"+
		"\u01c1\5&\24\2\u01bd\u01be\7\t\2\2\u01be\u01c0\5&\24\2\u01bf\u01bd\3\2"+
		"\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"9\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\7\61\2\2\u01c5\u01c7\5<\37\2"+
		"\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7;\3\2\2\2\u01c8\u01c9\7"+
		"\62\2\2\u01c9=\3\2\2\2:AGS^flr\u0080\u0087\u008d\u0091\u0096\u009b\u009f"+
		"\u00a5\u00af\u00b5\u00b8\u00bd\u00c5\u00c7\u00cf\u00d3\u00d9\u00fa\u0103"+
		"\u0112\u0115\u0119\u0121\u0125\u0131\u0139\u013f\u0146\u014d\u0151\u0155"+
		"\u0158\u015c\u0160\u0164\u0168\u016b\u016e\u0172\u017c\u0181\u0188\u018d"+
		"\u0190\u0195\u01aa\u01b4\u01c1\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}