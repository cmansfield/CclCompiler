// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/language/recognition\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.language.recognition;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_statement = 12, RULE_assignmentExpression = 13, RULE_typeCast = 14, 
		RULE_braceEnclosedInitializer = 15, RULE_newDeclaration = 16, RULE_expression = 17, 
		RULE_fnArrMember = 18, RULE_memberRefz = 19, RULE_expressionz = 20, RULE_assignmentOperation = 21, 
		RULE_booleanOperation = 22, RULE_mathOperation = 23, RULE_invokeOperator = 24, 
		RULE_arrayOperator = 25, RULE_argumentList = 26, RULE_type = 27, RULE_className = 28;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "classDeclaration", "templateDeclaration", 
		"templateList", "classMemberDeclaration", "methodDeclaration", "parameterList", 
		"parameter", "constructorDeclaration", "methodBody", "variableDeclaration", 
		"statement", "assignmentExpression", "typeCast", "braceEnclosedInitializer", 
		"newDeclaration", "expression", "fnArrMember", "memberRefz", "expressionz", 
		"assignmentOperation", "booleanOperation", "mathOperation", "invokeOperator", 
		"arrayOperator", "argumentList", "type", "className"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(58);
				importDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					classDeclaration();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
			match(MODIFIER);
			setState(71);
			match(PRIMITIVE_TYPE);
			setState(72);
			match(MAIN);
			setState(73);
			match(T__0);
			setState(74);
			match(T__1);
			setState(75);
			methodBody();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==MODIFIER) {
				{
				{
				setState(76);
				classDeclaration();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			setState(84);
			match(IMPORT);
			setState(85);
			match(IDENTIFIER);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(86);
				match(T__2);
				setState(87);
				match(IDENTIFIER);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(95);
				match(MODIFIER);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(CLASS);
			setState(102);
			className();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(103);
				templateDeclaration();
				}
			}

			setState(106);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==IDENTIFIER) {
				{
				{
				setState(107);
				classMemberDeclaration();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(115);
			match(T__0);
			setState(116);
			templateList();
			setState(117);
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
			setState(119);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(120);
				match(T__6);
				setState(121);
				match(IDENTIFIER);
				}
				}
				setState(126);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(MODIFIER);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MODIFIER );
				setState(133);
				type();
				setState(134);
				match(IDENTIFIER);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(135);
					arrayOperator();
					}
				}

				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(138);
					match(ASSIGN);
					setState(139);
					assignmentExpression();
					}
				}

				setState(142);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				match(MODIFIER);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFIER );
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(152);
				templateDeclaration();
				}
			}

			setState(155);
			type();
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(T__0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(158);
				parameterList();
				}
			}

			setState(161);
			match(T__1);
			setState(162);
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
			setState(164);
			parameter();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(165);
				match(T__6);
				setState(166);
				parameter();
				}
				}
				setState(171);
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
			setState(172);
			type();
			setState(173);
			match(IDENTIFIER);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(174);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(177);
				match(MODIFIER);
				}
			}

			setState(180);
			className();
			setState(181);
			match(T__0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(182);
				parameterList();
				}
			}

			setState(185);
			match(T__1);
			setState(186);
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
			setState(188);
			match(T__4);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(189);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(190);
					statement();
					}
					break;
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
			setState(198);
			type();
			setState(199);
			match(IDENTIFIER);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(200);
				arrayOperator();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(203);
				match(ASSIGN);
				setState(204);
				assignmentExpression();
				}
			}

			setState(207);
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
		public TerminalNode RETURN() { return getToken(CclGrammarParser.RETURN, 0); }
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(IF);
				setState(210);
				match(T__0);
				setState(211);
				expression(0);
				setState(212);
				match(T__1);
				setState(213);
				statement();
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(214);
					match(ELSE);
					setState(215);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(WHILE);
				setState(219);
				match(T__0);
				setState(220);
				expression(0);
				setState(221);
				match(T__1);
				setState(222);
				statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(FOR);
				setState(225);
				match(T__0);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(226);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(227);
					expression(0);
					setState(228);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(230);
					match(T__3);
					}
					break;
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(233);
					expression(0);
					}
				}

				setState(236);
				match(T__3);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(237);
					expression(0);
					}
				}

				setState(240);
				match(T__1);
				setState(241);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(RETURN);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(243);
					expression(0);
					}
				}

				setState(246);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(PRINT);
				setState(248);
				match(T__0);
				setState(249);
				expression(0);
				setState(250);
				match(T__1);
				setState(251);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(READ);
				setState(254);
				invokeOperator();
				setState(255);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(SPAWN);
				setState(258);
				expression(0);
				setState(259);
				match(SET);
				setState(260);
				match(IDENTIFIER);
				setState(261);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(BLOCK);
				setState(264);
				invokeOperator();
				setState(265);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(267);
				match(LOCK);
				setState(268);
				match(IDENTIFIER);
				setState(269);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				match(UNLOCK);
				setState(271);
				match(IDENTIFIER);
				setState(272);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 11);
				{
				setState(273);
				match(T__4);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					{
					setState(274);
					statement();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__5);
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
				enterOuterAlt(_localctx, 12);
				{
				setState(281);
				expression(0);
				setState(282);
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
		enterRule(_localctx, 26, RULE_assignmentExpression);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(NEW);
				setState(287);
				type();
				setState(288);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				typeCast();
				setState(291);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(STRING_LITTERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				braceEnclosedInitializer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
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
			setState(298);
			match(T__0);
			setState(299);
			match(PRIMITIVE_TYPE);
			setState(300);
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
		enterRule(_localctx, 30, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__4);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
				{
				setState(303);
				argumentList();
				}
			}

			setState(306);
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
		enterRule(_localctx, 32, RULE_newDeclaration);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(T__0);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(309);
					argumentList();
					}
				}

				setState(312);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(T__7);
				setState(314);
				expression(0);
				setState(315);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(320);
				match(T__0);
				setState(321);
				expression(0);
				setState(322);
				match(T__1);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(323);
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
				setState(326);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(327);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(330);
				match(THIS);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(331);
					memberRefz();
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(334);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITTERAL:
				{
				setState(337);
				match(NUMERIC_LITTERAL);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(338);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITTERAL:
				{
				setState(341);
				match(CHARACTER_LITTERAL);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(342);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITTERAL:
				{
				setState(345);
				match(STRING_LITTERAL);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(346);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(349);
				match(IDENTIFIER);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(350);
					fnArrMember();
					}
					break;
				}
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(353);
					memberRefz();
					}
					break;
				}
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(356);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(359);
				match(NOT);
				setState(360);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
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
					setState(363);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(364);
					match(QUESTION);
					setState(365);
					expression(0);
					setState(366);
					match(COLON);
					setState(367);
					expression(3);
					}
					} 
				}
				setState(373);
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__0);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITTERAL) | (1L << CHARACTER_LITTERAL) | (1L << NUMERIC_LITTERAL))) != 0)) {
					{
					setState(375);
					argumentList();
					}
				}

				setState(378);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__7);
				setState(380);
				expression(0);
				setState(381);
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
		enterRule(_localctx, 38, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__2);
			setState(386);
			match(IDENTIFIER);
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(387);
				fnArrMember();
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(390);
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
		enterRule(_localctx, 40, RULE_expressionz);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
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
				setState(394);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
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
		enterRule(_localctx, 42, RULE_assignmentOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(ASSIGN);
			setState(399);
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
		enterRule(_localctx, 44, RULE_booleanOperation);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(AND);
				setState(402);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(OR);
				setState(404);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(EQUALS);
				setState(406);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(NOT_EQ);
				setState(408);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(LESS_EQ);
				setState(410);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				match(GREAT_EQ);
				setState(412);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				match(LESS);
				setState(414);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(415);
				match(GREATER);
				setState(416);
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
		enterRule(_localctx, 46, RULE_mathOperation);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(PLUS);
				setState(420);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(MINUS);
				setState(422);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(MULTI);
				setState(424);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(DIV);
				setState(426);
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
		enterRule(_localctx, 48, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__0);
			setState(430);
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
		enterRule(_localctx, 50, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__7);
			setState(433);
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
		enterRule(_localctx, 52, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			expression(0);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(436);
				match(T__6);
				setState(437);
				expression(0);
				}
				}
				setState(442);
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
		enterRule(_localctx, 54, RULE_type);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
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
		enterRule(_localctx, 56, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2P"+
		"\n\2\f\2\16\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3"+
		"\3\3\3\3\4\7\4c\n\4\f\4\16\4f\13\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\7\4o\n"+
		"\4\f\4\16\4r\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6}\n\6\f\6\16"+
		"\6\u0080\13\6\3\7\3\7\6\7\u0084\n\7\r\7\16\7\u0085\3\7\3\7\3\7\5\7\u008b"+
		"\n\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b\6\b\u0097\n\b"+
		"\r\b\16\b\u0098\3\b\5\b\u009c\n\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3\n\3\n\3\n\5\n\u00b2"+
		"\n\n\3\13\5\13\u00b5\n\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3\f\3\f\3\r\3\r\3\r\5\r"+
		"\u00cc\n\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00db\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00ea\n\16\3\16\5\16\u00ed\n\16\3\16\3\16\5\16\u00f1"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u00f7\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0116\n\16\f\16\16"+
		"\16\u0119\13\16\3\16\3\16\3\16\3\16\5\16\u011f\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u012b\n\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\5\21\u0133\n\21\3\21\3\21\3\22\3\22\5\22\u0139\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0140\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0147\n\23"+
		"\3\23\3\23\5\23\u014b\n\23\3\23\3\23\5\23\u014f\n\23\3\23\5\23\u0152\n"+
		"\23\3\23\3\23\5\23\u0156\n\23\3\23\3\23\5\23\u015a\n\23\3\23\3\23\5\23"+
		"\u015e\n\23\3\23\3\23\5\23\u0162\n\23\3\23\5\23\u0165\n\23\3\23\5\23\u0168"+
		"\n\23\3\23\3\23\5\23\u016c\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0174"+
		"\n\23\f\23\16\23\u0177\13\23\3\24\3\24\5\24\u017b\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0182\n\24\3\25\3\25\3\25\5\25\u0187\n\25\3\25\5\25\u018a"+
		"\n\25\3\26\3\26\3\26\5\26\u018f\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01a4"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01ae\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u01b9\n\34\f\34\16\34\u01bc\13"+
		"\34\3\35\3\35\5\35\u01c0\n\35\3\36\3\36\3\36\2\3$\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2\f\16\2\u01fb\2?\3"+
		"\2\2\2\4V\3\2\2\2\6d\3\2\2\2\bu\3\2\2\2\ny\3\2\2\2\f\u0093\3\2\2\2\16"+
		"\u0096\3\2\2\2\20\u00a6\3\2\2\2\22\u00ae\3\2\2\2\24\u00b4\3\2\2\2\26\u00be"+
		"\3\2\2\2\30\u00c8\3\2\2\2\32\u011e\3\2\2\2\34\u012a\3\2\2\2\36\u012c\3"+
		"\2\2\2 \u0130\3\2\2\2\"\u013f\3\2\2\2$\u016b\3\2\2\2&\u0181\3\2\2\2(\u0183"+
		"\3\2\2\2*\u018e\3\2\2\2,\u0190\3\2\2\2.\u01a3\3\2\2\2\60\u01ad\3\2\2\2"+
		"\62\u01af\3\2\2\2\64\u01b2\3\2\2\2\66\u01b5\3\2\2\28\u01bf\3\2\2\2:\u01c1"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A"+
		"?\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"GE\3\2\2\2HI\7\60\2\2IJ\7\61\2\2JK\7\37\2\2KL\7\3\2\2LM\7\4\2\2MQ\5\26"+
		"\f\2NP\5\6\4\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TU\7\2\2\3U\3\3\2\2\2VW\7\35\2\2W\\\7\62\2\2XY\7\5\2\2Y[\7\62\2\2"+
		"ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\6"+
		"\2\2`\5\3\2\2\2ac\7\60\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3"+
		"\2\2\2fd\3\2\2\2gh\7\36\2\2hj\5:\36\2ik\5\b\5\2ji\3\2\2\2jk\3\2\2\2kl"+
		"\3\2\2\2lp\7\7\2\2mo\5\f\7\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q"+
		"s\3\2\2\2rp\3\2\2\2st\7\b\2\2t\7\3\2\2\2uv\7\3\2\2vw\5\n\6\2wx\7\4\2\2"+
		"x\t\3\2\2\2y~\7\62\2\2z{\7\t\2\2{}\7\62\2\2|z\3\2\2\2}\u0080\3\2\2\2~"+
		"|\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080~\3\2\2\2\u0081\u0094\5\16"+
		"\b\2\u0082\u0084\7\60\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\58"+
		"\35\2\u0088\u008a\7\62\2\2\u0089\u008b\5\64\33\2\u008a\u0089\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d\7-\2\2\u008d\u008f\5\34"+
		"\17\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\6\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5\24\13\2\u0093\u0081\3"+
		"\2\2\2\u0093\u0083\3\2\2\2\u0093\u0092\3\2\2\2\u0094\r\3\2\2\2\u0095\u0097"+
		"\7\60\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\5\b\5\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\58\35\2\u009e"+
		"\u009f\7\62\2\2\u009f\u00a1\7\3\2\2\u00a0\u00a2\5\20\t\2\u00a1\u00a0\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\4\2\2\u00a4"+
		"\u00a5\5\26\f\2\u00a5\17\3\2\2\2\u00a6\u00ab\5\22\n\2\u00a7\u00a8\7\t"+
		"\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00af\58\35\2\u00af\u00b1\7\62\2\2\u00b0\u00b2\5\64\33\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b5\7\60\2"+
		"\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\5:\36\2\u00b7\u00b9\7\3\2\2\u00b8\u00ba\5\20\t\2\u00b9\u00b8\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00bd"+
		"\5\26\f\2\u00bd\25\3\2\2\2\u00be\u00c3\7\7\2\2\u00bf\u00c2\5\30\r\2\u00c0"+
		"\u00c2\5\32\16\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\b\2\2\u00c7\27\3\2\2\2\u00c8\u00c9\58\35"+
		"\2\u00c9\u00cb\7\62\2\2\u00ca\u00cc\5\64\33\2\u00cb\u00ca\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00d0\5\34"+
		"\17\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\7\6\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\20\2\2\u00d4\u00d5\7\3\2"+
		"\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\7\4\2\2\u00d7\u00da\5\32\16\2\u00d8"+
		"\u00d9\7\21\2\2\u00d9\u00db\5\32\16\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u011f\3\2\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\7\3\2\2"+
		"\u00de\u00df\5$\23\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\5\32\16\2\u00e1\u011f"+
		"\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e9\7\3\2\2\u00e4\u00ea\5\30\r\2"+
		"\u00e5\u00e6\5$\23\2\u00e6\u00e7\7\6\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea"+
		"\7\6\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00ed\5$\23\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\7\6\2\2\u00ef\u00f1\5$\23\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\4"+
		"\2\2\u00f3\u011f\5\32\16\2\u00f4\u00f6\7\25\2\2\u00f5\u00f7\5$\23\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u011f\7\6"+
		"\2\2\u00f9\u00fa\7\26\2\2\u00fa\u00fb\7\3\2\2\u00fb\u00fc\5$\23\2\u00fc"+
		"\u00fd\7\4\2\2\u00fd\u00fe\7\6\2\2\u00fe\u011f\3\2\2\2\u00ff\u0100\7\27"+
		"\2\2\u0100\u0101\5\62\32\2\u0101\u0102\7\6\2\2\u0102\u011f\3\2\2\2\u0103"+
		"\u0104\7\30\2\2\u0104\u0105\5$\23\2\u0105\u0106\7\31\2\2\u0106\u0107\7"+
		"\62\2\2\u0107\u0108\7\6\2\2\u0108\u011f\3\2\2\2\u0109\u010a\7\32\2\2\u010a"+
		"\u010b\5\62\32\2\u010b\u010c\7\6\2\2\u010c\u011f\3\2\2\2\u010d\u010e\7"+
		"\33\2\2\u010e\u010f\7\62\2\2\u010f\u011f\7\6\2\2\u0110\u0111\7\34\2\2"+
		"\u0111\u0112\7\62\2\2\u0112\u011f\7\6\2\2\u0113\u0117\7\7\2\2\u0114\u0116"+
		"\5\32\16\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011f"+
		"\7\b\2\2\u011b\u011c\5$\23\2\u011c\u011d\7\6\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u00d3\3\2\2\2\u011e\u00dc\3\2\2\2\u011e\u00e2\3\2\2\2\u011e\u00f4\3\2"+
		"\2\2\u011e\u00f9\3\2\2\2\u011e\u00ff\3\2\2\2\u011e\u0103\3\2\2\2\u011e"+
		"\u0109\3\2\2\2\u011e\u010d\3\2\2\2\u011e\u0110\3\2\2\2\u011e\u0113\3\2"+
		"\2\2\u011e\u011b\3\2\2\2\u011f\33\3\2\2\2\u0120\u0121\7\24\2\2\u0121\u0122"+
		"\58\35\2\u0122\u0123\5\"\22\2\u0123\u012b\3\2\2\2\u0124\u0125\5\36\20"+
		"\2\u0125\u0126\5$\23\2\u0126\u012b\3\2\2\2\u0127\u012b\7\63\2\2\u0128"+
		"\u012b\5 \21\2\u0129\u012b\5$\23\2\u012a\u0120\3\2\2\2\u012a\u0124\3\2"+
		"\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"\35\3\2\2\2\u012c\u012d\7\3\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7\4\2"+
		"\2\u012f\37\3\2\2\2\u0130\u0132\7\7\2\2\u0131\u0133\5\66\34\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\b\2\2\u0135"+
		"!\3\2\2\2\u0136\u0138\7\3\2\2\u0137\u0139\5\66\34\2\u0138\u0137\3\2\2"+
		"\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0140\7\4\2\2\u013b\u013c"+
		"\7\n\2\2\u013c\u013d\5$\23\2\u013d\u013e\7\13\2\2\u013e\u0140\3\2\2\2"+
		"\u013f\u0136\3\2\2\2\u013f\u013b\3\2\2\2\u0140#\3\2\2\2\u0141\u0142\b"+
		"\23\1\2\u0142\u0143\7\3\2\2\u0143\u0144\5$\23\2\u0144\u0146\7\4\2\2\u0145"+
		"\u0147\5*\26\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u016c\3\2"+
		"\2\2\u0148\u014a\t\2\2\2\u0149\u014b\5*\26\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u016c\3\2\2\2\u014c\u014e\7\17\2\2\u014d\u014f\5"+
		"(\25\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0152\5*\26\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u016c\3\2"+
		"\2\2\u0153\u0155\7\65\2\2\u0154\u0156\5*\26\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u016c\3\2\2\2\u0157\u0159\7\64\2\2\u0158\u015a\5"+
		"*\26\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u016c\3\2\2\2\u015b"+
		"\u015d\7\63\2\2\u015c\u015e\5*\26\2\u015d\u015c\3\2\2\2\u015d\u015e\3"+
		"\2\2\2\u015e\u016c\3\2\2\2\u015f\u0161\7\62\2\2\u0160\u0162\5&\24\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\5("+
		"\25\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0168\5*\26\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016c\3\2"+
		"\2\2\u0169\u016a\7!\2\2\u016a\u016c\5$\23\3\u016b\u0141\3\2\2\2\u016b"+
		"\u0148\3\2\2\2\u016b\u014c\3\2\2\2\u016b\u0153\3\2\2\2\u016b\u0157\3\2"+
		"\2\2\u016b\u015b\3\2\2\2\u016b\u015f\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u0175\3\2\2\2\u016d\u016e\f\4\2\2\u016e\u016f\7.\2\2\u016f\u0170\5$\23"+
		"\2\u0170\u0171\7/\2\2\u0171\u0172\5$\23\5\u0172\u0174\3\2\2\2\u0173\u016d"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"%\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017a\7\3\2\2\u0179\u017b\5\66\34"+
		"\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0182"+
		"\7\4\2\2\u017d\u017e\7\n\2\2\u017e\u017f\5$\23\2\u017f\u0180\7\13\2\2"+
		"\u0180\u0182\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017d\3\2\2\2\u0182\'\3"+
		"\2\2\2\u0183\u0184\7\5\2\2\u0184\u0186\7\62\2\2\u0185\u0187\5&\24\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\5("+
		"\25\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a)\3\2\2\2\u018b\u018f"+
		"\5,\27\2\u018c\u018f\5.\30\2\u018d\u018f\5\60\31\2\u018e\u018b\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f+\3\2\2\2\u0190\u0191\7"+
		"-\2\2\u0191\u0192\5\34\17\2\u0192-\3\2\2\2\u0193\u0194\7\"\2\2\u0194\u01a4"+
		"\5$\23\2\u0195\u0196\7#\2\2\u0196\u01a4\5$\23\2\u0197\u0198\7(\2\2\u0198"+
		"\u01a4\5$\23\2\u0199\u019a\7 \2\2\u019a\u01a4\5$\23\2\u019b\u019c\7)\2"+
		"\2\u019c\u01a4\5$\23\2\u019d\u019e\7*\2\2\u019e\u01a4\5$\23\2\u019f\u01a0"+
		"\7+\2\2\u01a0\u01a4\5$\23\2\u01a1\u01a2\7,\2\2\u01a2\u01a4\5$\23\2\u01a3"+
		"\u0193\3\2\2\2\u01a3\u0195\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0199\3\2"+
		"\2\2\u01a3\u019b\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4/\3\2\2\2\u01a5\u01a6\7$\2\2\u01a6\u01ae\5$\23\2\u01a7"+
		"\u01a8\7%\2\2\u01a8\u01ae\5$\23\2\u01a9\u01aa\7&\2\2\u01aa\u01ae\5$\23"+
		"\2\u01ab\u01ac\7\'\2\2\u01ac\u01ae\5$\23\2\u01ad\u01a5\3\2\2\2\u01ad\u01a7"+
		"\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\61\3\2\2\2\u01af"+
		"\u01b0\7\3\2\2\u01b0\u01b1\7\4\2\2\u01b1\63\3\2\2\2\u01b2\u01b3\7\n\2"+
		"\2\u01b3\u01b4\7\13\2\2\u01b4\65\3\2\2\2\u01b5\u01ba\5$\23\2\u01b6\u01b7"+
		"\7\t\2\2\u01b7\u01b9\5$\23\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\67\3\2\2\2\u01bc\u01ba\3\2\2"+
		"\2\u01bd\u01c0\7\61\2\2\u01be\u01c0\5:\36\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01be\3\2\2\2\u01c09\3\2\2\2\u01c1\u01c2\7\62\2\2\u01c2;\3\2\2\29?EQ"+
		"\\djp~\u0085\u008a\u008e\u0093\u0098\u009b\u00a1\u00ab\u00b1\u00b4\u00b9"+
		"\u00c1\u00c3\u00cb\u00cf\u00da\u00e9\u00ec\u00f0\u00f6\u0117\u011e\u012a"+
		"\u0132\u0138\u013f\u0146\u014a\u014e\u0151\u0155\u0159\u015d\u0161\u0164"+
		"\u0167\u016b\u0175\u017a\u0181\u0186\u0189\u018e\u01a3\u01ad\u01ba\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}