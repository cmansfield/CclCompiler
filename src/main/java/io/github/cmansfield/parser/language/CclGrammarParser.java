// Generated from C:/Users/christopherjman/Documents/CclCompiler/src/main/java/io/github/cmansfield/parser/language\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.language;
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
		PRIMITIVE_TYPE=10, MODIFIER=11, SPECIAL_LITERAL=12, BOOLEAN_LITERAL=13, 
		PUBLIC=14, PRIVATE=15, STATIC=16, CONST=17, INT=18, CHAR=19, BOOL=20, 
		STRING=21, VOID=22, TRUE=23, FALSE=24, NULL=25, THIS=26, IF=27, ELSE=28, 
		WHILE=29, FOR=30, NEW=31, RETURN=32, PRINT=33, READ=34, SPAWN=35, SET=36, 
		BLOCK=37, LOCK=38, UNLOCK=39, IMPORT=40, CLASS=41, MAIN=42, NOT_EQ=43, 
		NOT=44, AND=45, OR=46, PLUS=47, MINUS=48, MULTI=49, DIV=50, EQUALS=51, 
		LESS_EQ=52, GREAT_EQ=53, LESS=54, GREATER=55, ASSIGN=56, QUESTION=57, 
		COLON=58, IDENTIFIER=59, STRING_LITERAL=60, CHARACTER_LITERAL=61, NUMERIC_LITERAL=62, 
		NUMBER=63, WHITESPACE=64, NEWLINE=65, LINE_COMMENT=66, MULTILINE_COMMENT=67;
	public static final int
		RULE_compilationUnit = 0, RULE_mainDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classDeclaration = 3, RULE_templateDeclaration = 4, RULE_templateList = 5, 
		RULE_classMemberDeclaration = 6, RULE_methodDeclaration = 7, RULE_fieldDeclaration = 8, 
		RULE_parameterList = 9, RULE_parameter = 10, RULE_constructorDeclaration = 11, 
		RULE_methodBody = 12, RULE_variableDeclaration = 13, RULE_statement = 14, 
		RULE_statementWithScope = 15, RULE_assignmentExpression = 16, RULE_typeCast = 17, 
		RULE_braceEnclosedInitializer = 18, RULE_newDeclaration = 19, RULE_expression = 20, 
		RULE_fnArrMember = 21, RULE_memberRefz = 22, RULE_expressionz = 23, RULE_assignmentOperation = 24, 
		RULE_booleanOperation = 25, RULE_mathOperation = 26, RULE_invokeOperator = 27, 
		RULE_arrayOperator = 28, RULE_argumentList = 29, RULE_modifier = 30, RULE_type = 31, 
		RULE_templatePlaceHolder = 32, RULE_className = 33, RULE_methodName = 34, 
		RULE_name = 35, RULE_stringLiteral = 36, RULE_characterLiteral = 37, RULE_numericLiteral = 38, 
		RULE_booleanLiteral = 39, RULE_specialLiteral = 40;
	public static final String[] ruleNames = {
		"compilationUnit", "mainDeclaration", "importDeclaration", "classDeclaration", 
		"templateDeclaration", "templateList", "classMemberDeclaration", "methodDeclaration", 
		"fieldDeclaration", "parameterList", "parameter", "constructorDeclaration", 
		"methodBody", "variableDeclaration", "statement", "statementWithScope", 
		"assignmentExpression", "typeCast", "braceEnclosedInitializer", "newDeclaration", 
		"expression", "fnArrMember", "memberRefz", "expressionz", "assignmentOperation", 
		"booleanOperation", "mathOperation", "invokeOperator", "arrayOperator", 
		"argumentList", "modifier", "type", "templatePlaceHolder", "className", 
		"methodName", "name", "stringLiteral", "characterLiteral", "numericLiteral", 
		"booleanLiteral", "specialLiteral"
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
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(82);
				importDeclaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					classDeclaration();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(94);
				mainDeclaration();
				}
				break;
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==CLASS) {
				{
				{
				setState(97);
				classDeclaration();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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

	public static class MainDeclarationContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(CclGrammarParser.MAIN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			modifier();
			setState(106);
			match(PRIMITIVE_TYPE);
			setState(107);
			match(MAIN);
			setState(108);
			match(T__0);
			setState(109);
			match(T__1);
			setState(110);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IMPORT);
			setState(113);
			match(IDENTIFIER);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(114);
				match(T__2);
				setState(115);
				match(IDENTIFIER);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(123);
				modifier();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(CLASS);
			setState(130);
			className();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(131);
				templateDeclaration();
				}
			}

			setState(134);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PRIMITIVE_TYPE) | (1L << MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(135);
				classMemberDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__0);
			setState(144);
			templateList();
			setState(145);
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
		public List<TemplatePlaceHolderContext> templatePlaceHolder() {
			return getRuleContexts(TemplatePlaceHolderContext.class);
		}
		public TemplatePlaceHolderContext templatePlaceHolder(int i) {
			return getRuleContext(TemplatePlaceHolderContext.class,i);
		}
		public TemplateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitTemplateList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateListContext templateList() throws RecognitionException {
		TemplateListContext _localctx = new TemplateListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_templateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			templatePlaceHolder();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(148);
				match(T__6);
				setState(149);
				templatePlaceHolder();
				}
				}
				setState(154);
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
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classMemberDeclaration);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
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
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(160);
				modifier();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(166);
				templateDeclaration();
				}
			}

			setState(169);
			type();
			setState(170);
			methodName();
			setState(171);
			match(T__0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(172);
				parameterList();
				}
			}

			setState(175);
			match(T__1);
			setState(176);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CclGrammarParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(178);
				modifier();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			type();
			setState(185);
			name();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(186);
				arrayOperator();
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(189);
				match(ASSIGN);
				setState(190);
				assignmentExpression();
				}
			}

			setState(193);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			parameter();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(196);
				match(T__6);
				setState(197);
				parameter();
				}
				}
				setState(202);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			type();
			setState(204);
			name();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(205);
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
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(208);
				modifier();
				}
			}

			setState(211);
			methodName();
			setState(212);
			match(T__0);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(213);
				parameterList();
				}
			}

			setState(216);
			match(T__1);
			setState(217);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__4);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(220);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(221);
					statement();
					}
					break;
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			type();
			setState(230);
			name();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(231);
				arrayOperator();
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(234);
				match(ASSIGN);
				setState(235);
				assignmentExpression();
				}
			}

			setState(238);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CclGrammarParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CclGrammarParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(CclGrammarParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(CclGrammarParser.PRINT, 0); }
		public TerminalNode READ() { return getToken(CclGrammarParser.READ, 0); }
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public TerminalNode SPAWN() { return getToken(CclGrammarParser.SPAWN, 0); }
		public TerminalNode SET() { return getToken(CclGrammarParser.SET, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(IF);
				setState(241);
				match(T__0);
				setState(242);
				expression(0);
				setState(243);
				match(T__1);
				setState(244);
				statement();
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(245);
					match(ELSE);
					setState(246);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(WHILE);
				setState(250);
				match(T__0);
				setState(251);
				expression(0);
				setState(252);
				match(T__1);
				setState(253);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(RETURN);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(256);
					expression(0);
					}
				}

				setState(259);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(PRINT);
				setState(261);
				match(T__0);
				setState(262);
				expression(0);
				setState(263);
				match(T__1);
				setState(264);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(READ);
				setState(267);
				invokeOperator();
				setState(268);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(SPAWN);
				setState(271);
				expression(0);
				setState(272);
				match(SET);
				setState(273);
				name();
				setState(274);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(BLOCK);
				setState(277);
				invokeOperator();
				setState(278);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				match(LOCK);
				setState(281);
				name();
				setState(282);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				match(UNLOCK);
				setState(285);
				name();
				setState(286);
				match(T__3);
				}
				break;
			case T__4:
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(288);
				statementWithScope();
				}
				break;
			case T__0:
			case SPECIAL_LITERAL:
			case BOOLEAN_LITERAL:
			case TRUE:
			case FALSE:
			case NULL:
			case THIS:
			case NOT:
			case IDENTIFIER:
			case STRING_LITERAL:
			case CHARACTER_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(289);
				expression(0);
				setState(290);
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
		public TerminalNode FOR() { return getToken(CclGrammarParser.FOR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementWithScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithScope; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitStatementWithScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithScopeContext statementWithScope() throws RecognitionException {
		StatementWithScopeContext _localctx = new StatementWithScopeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementWithScope);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(FOR);
				setState(295);
				match(T__0);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(296);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(297);
					expression(0);
					setState(298);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(300);
					match(T__3);
					}
					break;
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(303);
					expression(0);
					}
				}

				setState(306);
				match(T__3);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(307);
					expression(0);
					}
				}

				setState(310);
				match(T__1);
				setState(311);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__4);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(313);
						statement();
						}
						break;
					case 2:
						{
						setState(314);
						variableDeclaration();
						}
						break;
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(320);
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
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BraceEnclosedInitializerContext braceEnclosedInitializer() {
			return getRuleContext(BraceEnclosedInitializerContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignmentExpression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(NEW);
				setState(324);
				type();
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(325);
					templateDeclaration();
					}
					break;
				}
				setState(328);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				typeCast();
				setState(331);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				braceEnclosedInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__0);
			setState(338);
			match(PRIMITIVE_TYPE);
			setState(339);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitBraceEnclosedInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceEnclosedInitializerContext braceEnclosedInitializer() throws RecognitionException {
		BraceEnclosedInitializerContext _localctx = new BraceEnclosedInitializerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__4);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(342);
				argumentList();
				}
			}

			setState(345);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitNewDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclarationContext newDeclaration() throws RecognitionException {
		NewDeclarationContext _localctx = new NewDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newDeclaration);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(T__0);
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(348);
					argumentList();
					}
				}

				setState(351);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(T__7);
				setState(353);
				expression(0);
				setState(354);
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
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public SpecialLiteralContext specialLiteral() {
			return getRuleContext(SpecialLiteralContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(359);
				match(T__0);
				setState(360);
				expression(0);
				setState(361);
				match(T__1);
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(362);
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
				setState(365);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(366);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(369);
				match(THIS);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(370);
					memberRefz();
					}
					break;
				}
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(373);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(376);
				numericLiteral();
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(377);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITERAL:
				{
				setState(380);
				characterLiteral();
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(381);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(384);
				stringLiteral();
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(385);
					expressionz();
					}
					break;
				}
				}
				break;
			case BOOLEAN_LITERAL:
				{
				setState(388);
				booleanLiteral();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(389);
					expressionz();
					}
					break;
				}
				}
				break;
			case SPECIAL_LITERAL:
				{
				setState(392);
				specialLiteral();
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(393);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(396);
				name();
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(397);
					fnArrMember();
					}
					break;
				}
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(400);
					memberRefz();
					}
					break;
				}
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(403);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(406);
				match(NOT);
				setState(407);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(410);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(411);
					match(QUESTION);
					setState(412);
					expression(0);
					setState(413);
					match(COLON);
					setState(414);
					expression(3);
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitFnArrMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnArrMemberContext fnArrMember() throws RecognitionException {
		FnArrMemberContext _localctx = new FnArrMemberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fnArrMember);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(T__0);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(422);
					argumentList();
					}
				}

				setState(425);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(T__7);
				setState(427);
				expression(0);
				setState(428);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMemberRefz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberRefzContext memberRefz() throws RecognitionException {
		MemberRefzContext _localctx = new MemberRefzContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__2);
			setState(433);
			name();
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(434);
				fnArrMember();
				}
				break;
			}
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(437);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitExpressionz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionzContext expressionz() throws RecognitionException {
		ExpressionzContext _localctx = new ExpressionzContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionz);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
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
				setState(441);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitAssignmentOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperationContext assignmentOperation() throws RecognitionException {
		AssignmentOperationContext _localctx = new AssignmentOperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(ASSIGN);
			setState(446);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitBooleanOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperationContext booleanOperation() throws RecognitionException {
		BooleanOperationContext _localctx = new BooleanOperationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleanOperation);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(AND);
				setState(449);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(OR);
				setState(451);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(EQUALS);
				setState(453);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(NOT_EQ);
				setState(455);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(456);
				match(LESS_EQ);
				setState(457);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				match(GREAT_EQ);
				setState(459);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(460);
				match(LESS);
				setState(461);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				match(GREATER);
				setState(463);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		MathOperationContext _localctx = new MathOperationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mathOperation);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(PLUS);
				setState(467);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(MINUS);
				setState(469);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(MULTI);
				setState(471);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				match(DIV);
				setState(473);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitInvokeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeOperatorContext invokeOperator() throws RecognitionException {
		InvokeOperatorContext _localctx = new InvokeOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__0);
			setState(477);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitArrayOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperatorContext arrayOperator() throws RecognitionException {
		ArrayOperatorContext _localctx = new ArrayOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__7);
			setState(480);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			expression(0);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(483);
				match(T__6);
				setState(484);
				expression(0);
				}
				}
				setState(489);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(CclGrammarParser.MODIFIER, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(MODIFIER);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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

	public static class TemplatePlaceHolderContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public TemplatePlaceHolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatePlaceHolder; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitTemplatePlaceHolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePlaceHolderContext templatePlaceHolder() throws RecognitionException {
		TemplatePlaceHolderContext _localctx = new TemplatePlaceHolderContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_templatePlaceHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CclGrammarParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CclGrammarParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(STRING_LITERAL);
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

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(CclGrammarParser.CHARACTER_LITERAL, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(CHARACTER_LITERAL);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CclGrammarParser.NUMERIC_LITERAL, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(NUMERIC_LITERAL);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CclGrammarParser.BOOLEAN_LITERAL, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(BOOLEAN_LITERAL);
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

	public static class SpecialLiteralContext extends ParserRuleContext {
		public TerminalNode SPECIAL_LITERAL() { return getToken(CclGrammarParser.SPECIAL_LITERAL, 0); }
		public SpecialLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitSpecialLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialLiteralContext specialLiteral() throws RecognitionException {
		SpecialLiteralContext _localctx = new SpecialLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_specialLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(SPECIAL_LITERAL);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0205\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\5\2b\n\2\3\2\7\2"+
		"e\n\2\f\2\16\2h\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4w\n\4\f\4\16\4z\13\4\3\4\3\4\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5"+
		"\3\5\3\5\3\5\5\5\u0087\n\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3"+
		"\b\3\b\3\b\5\b\u00a1\n\b\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\5\t"+
		"\u00aa\n\t\3\t\3\t\3\t\3\t\5\t\u00b0\n\t\3\t\3\t\3\t\3\n\7\n\u00b6\n\n"+
		"\f\n\16\n\u00b9\13\n\3\n\3\n\3\n\5\n\u00be\n\n\3\n\3\n\5\n\u00c2\n\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13\u00c9\n\13\f\13\16\13\u00cc\13\13\3\f\3\f\3"+
		"\f\5\f\u00d1\n\f\3\r\5\r\u00d4\n\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\5\17\u00eb\n\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fa\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0104\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0127\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0130\n\21\3\21\5\21\u0133\n"+
		"\21\3\21\3\21\5\21\u0137\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u013e\n\21"+
		"\f\21\16\21\u0141\13\21\3\21\5\21\u0144\n\21\3\22\3\22\3\22\5\22\u0149"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0152\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u015a\n\24\3\24\3\24\3\25\3\25\5\25\u0160\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0167\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u016e\n\26\3\26\3\26\5\26\u0172\n\26\3\26\3\26\5\26\u0176\n\26\3\26\5"+
		"\26\u0179\n\26\3\26\3\26\5\26\u017d\n\26\3\26\3\26\5\26\u0181\n\26\3\26"+
		"\3\26\5\26\u0185\n\26\3\26\3\26\5\26\u0189\n\26\3\26\3\26\5\26\u018d\n"+
		"\26\3\26\3\26\5\26\u0191\n\26\3\26\5\26\u0194\n\26\3\26\5\26\u0197\n\26"+
		"\3\26\3\26\5\26\u019b\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01a3\n"+
		"\26\f\26\16\26\u01a6\13\26\3\27\3\27\5\27\u01aa\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u01b1\n\27\3\30\3\30\3\30\5\30\u01b6\n\30\3\30\5\30\u01b9"+
		"\n\30\3\31\3\31\3\31\5\31\u01be\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01d3"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01dd\n\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u01e8\n\37\f\37\16\37\u01eb\13"+
		"\37\3 \3 \3!\3!\5!\u01f1\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\2\3*+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPR\2\3\3\2\31\33\2\u0236\2W\3\2\2\2\4k\3\2"+
		"\2\2\6r\3\2\2\2\b\u0080\3\2\2\2\n\u0091\3\2\2\2\f\u0095\3\2\2\2\16\u00a0"+
		"\3\2\2\2\20\u00a5\3\2\2\2\22\u00b7\3\2\2\2\24\u00c5\3\2\2\2\26\u00cd\3"+
		"\2\2\2\30\u00d3\3\2\2\2\32\u00dd\3\2\2\2\34\u00e7\3\2\2\2\36\u0126\3\2"+
		"\2\2 \u0143\3\2\2\2\"\u0151\3\2\2\2$\u0153\3\2\2\2&\u0157\3\2\2\2(\u0166"+
		"\3\2\2\2*\u019a\3\2\2\2,\u01b0\3\2\2\2.\u01b2\3\2\2\2\60\u01bd\3\2\2\2"+
		"\62\u01bf\3\2\2\2\64\u01d2\3\2\2\2\66\u01dc\3\2\2\28\u01de\3\2\2\2:\u01e1"+
		"\3\2\2\2<\u01e4\3\2\2\2>\u01ec\3\2\2\2@\u01f0\3\2\2\2B\u01f2\3\2\2\2D"+
		"\u01f4\3\2\2\2F\u01f6\3\2\2\2H\u01f8\3\2\2\2J\u01fa\3\2\2\2L\u01fc\3\2"+
		"\2\2N\u01fe\3\2\2\2P\u0200\3\2\2\2R\u0202\3\2\2\2TV\5\6\4\2UT\3\2\2\2"+
		"VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\b\5\2[Z\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\4\3\2a`\3\2"+
		"\2\2ab\3\2\2\2bf\3\2\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gi\3\2\2\2hf\3\2\2\2ij\7\2\2\3j\3\3\2\2\2kl\5> \2lm\7\f\2\2mn\7,\2"+
		"\2no\7\3\2\2op\7\4\2\2pq\5\32\16\2q\5\3\2\2\2rs\7*\2\2sx\7=\2\2tu\7\5"+
		"\2\2uw\7=\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2"+
		"\2\2{|\7\6\2\2|\7\3\2\2\2}\177\5> \2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7+\2\2\u0084\u0086\5D#\2\u0085\u0087\5\n\6\2\u0086\u0085"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\7\7\2\2\u0089"+
		"\u008b\5\16\b\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7\b\2\2\u0090\t\3\2\2\2\u0091\u0092\7\3\2\2\u0092\u0093\5\f\7\2"+
		"\u0093\u0094\7\4\2\2\u0094\13\3\2\2\2\u0095\u009a\5B\"\2\u0096\u0097\7"+
		"\t\2\2\u0097\u0099\5B\"\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\r\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009d\u00a1\5\20\t\2\u009e\u00a1\5\22\n\2\u009f\u00a1\5\30\r\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\17\3\2\2"+
		"\2\u00a2\u00a4\5> \2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00aa\5\n\6\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\5@!\2\u00ac\u00ad\5F$\2\u00ad\u00af\7\3\2\2\u00ae\u00b0"+
		"\5\24\13\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\32\16\2\u00b3\21\3\2\2\2\u00b4\u00b6"+
		"\5> \2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5@"+
		"!\2\u00bb\u00bd\5H%\2\u00bc\u00be\5:\36\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\7:\2\2\u00c0\u00c2\5\"\22\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\6"+
		"\2\2\u00c4\23\3\2\2\2\u00c5\u00ca\5\26\f\2\u00c6\u00c7\7\t\2\2\u00c7\u00c9"+
		"\5\26\f\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce"+
		"\5@!\2\u00ce\u00d0\5H%\2\u00cf\u00d1\5:\36\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d4\5> \2\u00d3\u00d2\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5F$\2\u00d6\u00d8"+
		"\7\3\2\2\u00d7\u00d9\5\24\13\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\7\4\2\2\u00db\u00dc\5\32\16\2\u00dc\31"+
		"\3\2\2\2\u00dd\u00e2\7\7\2\2\u00de\u00e1\5\34\17\2\u00df\u00e1\5\36\20"+
		"\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7\b\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\5@!\2\u00e8\u00ea\5H%\2\u00e9"+
		"\u00eb\5:\36\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ed\7:\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\6\2\2\u00f1\35\3\2\2"+
		"\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5*\26\2\u00f5"+
		"\u00f6\7\4\2\2\u00f6\u00f9\5\36\20\2\u00f7\u00f8\7\36\2\2\u00f8\u00fa"+
		"\5\36\20\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0127\3\2\2\2"+
		"\u00fb\u00fc\7\37\2\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\5*\26\2\u00fe\u00ff"+
		"\7\4\2\2\u00ff\u0100\5\36\20\2\u0100\u0127\3\2\2\2\u0101\u0103\7\"\2\2"+
		"\u0102\u0104\5*\26\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0127\7\6\2\2\u0106\u0107\7#\2\2\u0107\u0108\7\3\2\2\u0108"+
		"\u0109\5*\26\2\u0109\u010a\7\4\2\2\u010a\u010b\7\6\2\2\u010b\u0127\3\2"+
		"\2\2\u010c\u010d\7$\2\2\u010d\u010e\58\35\2\u010e\u010f\7\6\2\2\u010f"+
		"\u0127\3\2\2\2\u0110\u0111\7%\2\2\u0111\u0112\5*\26\2\u0112\u0113\7&\2"+
		"\2\u0113\u0114\5H%\2\u0114\u0115\7\6\2\2\u0115\u0127\3\2\2\2\u0116\u0117"+
		"\7\'\2\2\u0117\u0118\58\35\2\u0118\u0119\7\6\2\2\u0119\u0127\3\2\2\2\u011a"+
		"\u011b\7(\2\2\u011b\u011c\5H%\2\u011c\u011d\7\6\2\2\u011d\u0127\3\2\2"+
		"\2\u011e\u011f\7)\2\2\u011f\u0120\5H%\2\u0120\u0121\7\6\2\2\u0121\u0127"+
		"\3\2\2\2\u0122\u0127\5 \21\2\u0123\u0124\5*\26\2\u0124\u0125\7\6\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u00f2\3\2\2\2\u0126\u00fb\3\2\2\2\u0126\u0101\3\2"+
		"\2\2\u0126\u0106\3\2\2\2\u0126\u010c\3\2\2\2\u0126\u0110\3\2\2\2\u0126"+
		"\u0116\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3\2"+
		"\2\2\u0126\u0123\3\2\2\2\u0127\37\3\2\2\2\u0128\u0129\7 \2\2\u0129\u012f"+
		"\7\3\2\2\u012a\u0130\5\34\17\2\u012b\u012c\5*\26\2\u012c\u012d\7\6\2\2"+
		"\u012d\u0130\3\2\2\2\u012e\u0130\7\6\2\2\u012f\u012a\3\2\2\2\u012f\u012b"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5*\26\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\7\6"+
		"\2\2\u0135\u0137\5*\26\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\7\4\2\2\u0139\u0144\5\36\20\2\u013a\u013f\7"+
		"\7\2\2\u013b\u013e\5\36\20\2\u013c\u013e\5\34\17\2\u013d\u013b\3\2\2\2"+
		"\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7\b\2\2\u0143"+
		"\u0128\3\2\2\2\u0143\u013a\3\2\2\2\u0144!\3\2\2\2\u0145\u0146\7!\2\2\u0146"+
		"\u0148\5@!\2\u0147\u0149\5\n\6\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u014b\5(\25\2\u014b\u0152\3\2\2\2\u014c\u014d"+
		"\5$\23\2\u014d\u014e\5*\26\2\u014e\u0152\3\2\2\2\u014f\u0152\5&\24\2\u0150"+
		"\u0152\5*\26\2\u0151\u0145\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152#\3\2\2\2\u0153\u0154\7\3\2\2\u0154\u0155"+
		"\7\f\2\2\u0155\u0156\7\4\2\2\u0156%\3\2\2\2\u0157\u0159\7\7\2\2\u0158"+
		"\u015a\5<\37\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\7\b\2\2\u015c\'\3\2\2\2\u015d\u015f\7\3\2\2\u015e\u0160"+
		"\5<\37\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0167\7\4\2\2\u0162\u0163\7\n\2\2\u0163\u0164\5*\26\2\u0164\u0165\7\13"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u015d\3\2\2\2\u0166\u0162\3\2\2\2\u0167"+
		")\3\2\2\2\u0168\u0169\b\26\1\2\u0169\u016a\7\3\2\2\u016a\u016b\5*\26\2"+
		"\u016b\u016d\7\4\2\2\u016c\u016e\5\60\31\2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u019b\3\2\2\2\u016f\u0171\t\2\2\2\u0170\u0172\5\60\31\2"+
		"\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u019b\3\2\2\2\u0173\u0175"+
		"\7\34\2\2\u0174\u0176\5.\30\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0178\3\2\2\2\u0177\u0179\5\60\31\2\u0178\u0177\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u019b\3\2\2\2\u017a\u017c\5N(\2\u017b\u017d\5\60\31\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u019b\3\2\2\2\u017e\u0180\5L"+
		"\'\2\u017f\u0181\5\60\31\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u019b\3\2\2\2\u0182\u0184\5J&\2\u0183\u0185\5\60\31\2\u0184\u0183\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u019b\3\2\2\2\u0186\u0188\5P)\2\u0187\u0189"+
		"\5\60\31\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u019b\3\2\2\2"+
		"\u018a\u018c\5R*\2\u018b\u018d\5\60\31\2\u018c\u018b\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u019b\3\2\2\2\u018e\u0190\5H%\2\u018f\u0191\5,\27\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0194\5."+
		"\30\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195"+
		"\u0197\5\60\31\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\3"+
		"\2\2\2\u0198\u0199\7.\2\2\u0199\u019b\5*\26\3\u019a\u0168\3\2\2\2\u019a"+
		"\u016f\3\2\2\2\u019a\u0173\3\2\2\2\u019a\u017a\3\2\2\2\u019a\u017e\3\2"+
		"\2\2\u019a\u0182\3\2\2\2\u019a\u0186\3\2\2\2\u019a\u018a\3\2\2\2\u019a"+
		"\u018e\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u01a4\3\2\2\2\u019c\u019d\f\4"+
		"\2\2\u019d\u019e\7;\2\2\u019e\u019f\5*\26\2\u019f\u01a0\7<\2\2\u01a0\u01a1"+
		"\5*\26\5\u01a1\u01a3\3\2\2\2\u01a2\u019c\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5+\3\2\2\2\u01a6\u01a4\3\2\2\2"+
		"\u01a7\u01a9\7\3\2\2\u01a8\u01aa\5<\37\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b1\7\4\2\2\u01ac\u01ad\7\n\2\2\u01ad"+
		"\u01ae\5*\26\2\u01ae\u01af\7\13\2\2\u01af\u01b1\3\2\2\2\u01b0\u01a7\3"+
		"\2\2\2\u01b0\u01ac\3\2\2\2\u01b1-\3\2\2\2\u01b2\u01b3\7\5\2\2\u01b3\u01b5"+
		"\5H%\2\u01b4\u01b6\5,\27\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b9\5.\30\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9/\3\2\2\2\u01ba\u01be\5\62\32\2\u01bb\u01be\5\64\33\2\u01bc"+
		"\u01be\5\66\34\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3"+
		"\2\2\2\u01be\61\3\2\2\2\u01bf\u01c0\7:\2\2\u01c0\u01c1\5\"\22\2\u01c1"+
		"\63\3\2\2\2\u01c2\u01c3\7/\2\2\u01c3\u01d3\5*\26\2\u01c4\u01c5\7\60\2"+
		"\2\u01c5\u01d3\5*\26\2\u01c6\u01c7\7\65\2\2\u01c7\u01d3\5*\26\2\u01c8"+
		"\u01c9\7-\2\2\u01c9\u01d3\5*\26\2\u01ca\u01cb\7\66\2\2\u01cb\u01d3\5*"+
		"\26\2\u01cc\u01cd\7\67\2\2\u01cd\u01d3\5*\26\2\u01ce\u01cf\78\2\2\u01cf"+
		"\u01d3\5*\26\2\u01d0\u01d1\79\2\2\u01d1\u01d3\5*\26\2\u01d2\u01c2\3\2"+
		"\2\2\u01d2\u01c4\3\2\2\2\u01d2\u01c6\3\2\2\2\u01d2\u01c8\3\2\2\2\u01d2"+
		"\u01ca\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\65\3\2\2\2\u01d4\u01d5\7\61\2\2\u01d5\u01dd\5*\26\2\u01d6\u01d7"+
		"\7\62\2\2\u01d7\u01dd\5*\26\2\u01d8\u01d9\7\63\2\2\u01d9\u01dd\5*\26\2"+
		"\u01da\u01db\7\64\2\2\u01db\u01dd\5*\26\2\u01dc\u01d4\3\2\2\2\u01dc\u01d6"+
		"\3\2\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\67\3\2\2\2\u01de"+
		"\u01df\7\3\2\2\u01df\u01e0\7\4\2\2\u01e09\3\2\2\2\u01e1\u01e2\7\n\2\2"+
		"\u01e2\u01e3\7\13\2\2\u01e3;\3\2\2\2\u01e4\u01e9\5*\26\2\u01e5\u01e6\7"+
		"\t\2\2\u01e6\u01e8\5*\26\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea=\3\2\2\2\u01eb\u01e9\3\2\2\2"+
		"\u01ec\u01ed\7\r\2\2\u01ed?\3\2\2\2\u01ee\u01f1\7\f\2\2\u01ef\u01f1\5"+
		"D#\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1A\3\2\2\2\u01f2\u01f3"+
		"\7=\2\2\u01f3C\3\2\2\2\u01f4\u01f5\7=\2\2\u01f5E\3\2\2\2\u01f6\u01f7\7"+
		"=\2\2\u01f7G\3\2\2\2\u01f8\u01f9\7=\2\2\u01f9I\3\2\2\2\u01fa\u01fb\7>"+
		"\2\2\u01fbK\3\2\2\2\u01fc\u01fd\7?\2\2\u01fdM\3\2\2\2\u01fe\u01ff\7@\2"+
		"\2\u01ffO\3\2\2\2\u0200\u0201\7\17\2\2\u0201Q\3\2\2\2\u0202\u0203\7\16"+
		"\2\2\u0203S\3\2\2\2?W]afx\u0080\u0086\u008c\u009a\u00a0\u00a5\u00a9\u00af"+
		"\u00b7\u00bd\u00c1\u00ca\u00d0\u00d3\u00d8\u00e0\u00e2\u00ea\u00ee\u00f9"+
		"\u0103\u0126\u012f\u0132\u0136\u013d\u013f\u0143\u0148\u0151\u0159\u015f"+
		"\u0166\u016d\u0171\u0175\u0178\u017c\u0180\u0184\u0188\u018c\u0190\u0193"+
		"\u0196\u019a\u01a4\u01a9\u01b0\u01b5\u01b8\u01bd\u01d2\u01dc\u01e9\u01f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}