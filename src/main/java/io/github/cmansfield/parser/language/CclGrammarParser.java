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
		RULE_cast = 18, RULE_braceEnclosedInitializer = 19, RULE_newDeclaration = 20, 
		RULE_expression = 21, RULE_fnArrMember = 22, RULE_memberRefz = 23, RULE_expressionz = 24, 
		RULE_assignmentOperation = 25, RULE_booleanOperation = 26, RULE_mathOperation = 27, 
		RULE_invokeOperator = 28, RULE_invokeOperatorEnd = 29, RULE_arrayOperator = 30, 
		RULE_arrayOperatorEnd = 31, RULE_arrayDeclaration = 32, RULE_argumentList = 33, 
		RULE_modifier = 34, RULE_type = 35, RULE_templatePlaceHolder = 36, RULE_declaredTemplateType = 37, 
		RULE_className = 38, RULE_methodName = 39, RULE_name = 40, RULE_self = 41, 
		RULE_stringLiteral = 42, RULE_characterLiteral = 43, RULE_numericLiteral = 44, 
		RULE_booleanLiteral = 45, RULE_specialLiteral = 46;
	public static final String[] ruleNames = {
		"compilationUnit", "mainDeclaration", "importDeclaration", "classDeclaration", 
		"templateDeclaration", "templateList", "classMemberDeclaration", "methodDeclaration", 
		"fieldDeclaration", "parameterList", "parameter", "constructorDeclaration", 
		"methodBody", "variableDeclaration", "statement", "statementWithScope", 
		"assignmentExpression", "typeCast", "cast", "braceEnclosedInitializer", 
		"newDeclaration", "expression", "fnArrMember", "memberRefz", "expressionz", 
		"assignmentOperation", "booleanOperation", "mathOperation", "invokeOperator", 
		"invokeOperatorEnd", "arrayOperator", "arrayOperatorEnd", "arrayDeclaration", 
		"argumentList", "modifier", "type", "templatePlaceHolder", "declaredTemplateType", 
		"className", "methodName", "name", "self", "stringLiteral", "characterLiteral", 
		"numericLiteral", "booleanLiteral", "specialLiteral"
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(94);
				importDeclaration();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					classDeclaration();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(106);
				mainDeclaration();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==CLASS) {
				{
				{
				setState(109);
				classDeclaration();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(CclGrammarParser.MAIN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				modifier();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFIER );
			setState(122);
			match(PRIMITIVE_TYPE);
			setState(123);
			match(MAIN);
			setState(124);
			match(T__0);
			setState(125);
			match(T__1);
			setState(126);
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
			setState(128);
			match(IMPORT);
			setState(129);
			match(IDENTIFIER);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(130);
				match(T__2);
				setState(131);
				match(IDENTIFIER);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(139);
				modifier();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(CLASS);
			setState(146);
			className();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(147);
				templateDeclaration();
				}
			}

			setState(150);
			match(T__4);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMITIVE_TYPE) | (1L << MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(151);
				classMemberDeclaration();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
			setState(159);
			match(T__0);
			setState(160);
			templateList();
			setState(161);
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
			setState(163);
			templatePlaceHolder();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(164);
				match(T__6);
				setState(165);
				templatePlaceHolder();
				}
				}
				setState(170);
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
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
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(176);
				modifier();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			type();
			setState(183);
			methodName();
			setState(184);
			match(T__0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(185);
				parameterList();
				}
			}

			setState(188);
			match(T__1);
			setState(189);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public AssignmentOperationContext assignmentOperation() {
			return getRuleContext(AssignmentOperationContext.class,0);
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
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(191);
				modifier();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			type();
			setState(198);
			name();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(199);
				arrayDeclaration();
				}
			}

			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(202);
				assignmentOperation();
				}
			}

			setState(205);
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
			setState(207);
			parameter();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(208);
				match(T__6);
				setState(209);
				parameter();
				}
				}
				setState(214);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
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
			setState(215);
			type();
			setState(216);
			name();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(217);
				arrayDeclaration();
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
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(220);
				modifier();
				}
			}

			setState(223);
			methodName();
			setState(224);
			match(T__0);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(225);
				parameterList();
				}
			}

			setState(228);
			match(T__1);
			setState(229);
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
			setState(231);
			match(T__4);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(232);
					variableDeclaration();
					setState(233);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(235);
					statement();
					}
					break;
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public AssignmentOperationContext assignmentOperation() {
			return getRuleContext(AssignmentOperationContext.class,0);
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
			setState(243);
			type();
			setState(244);
			name();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(245);
				arrayDeclaration();
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(248);
				assignmentOperation();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CclGrammarParser.IF, 0); }
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InvokeOperatorEndContext invokeOperatorEnd() {
			return getRuleContext(InvokeOperatorEndContext.class,0);
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
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(IF);
				setState(252);
				invokeOperator();
				setState(253);
				expression(0);
				setState(254);
				invokeOperatorEnd();
				setState(255);
				statement();
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(256);
					match(ELSE);
					setState(257);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(WHILE);
				setState(261);
				invokeOperator();
				setState(262);
				expression(0);
				setState(263);
				invokeOperatorEnd();
				setState(264);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(RETURN);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(267);
					expression(0);
					}
				}

				setState(270);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(PRINT);
				setState(272);
				invokeOperator();
				setState(273);
				expression(0);
				setState(274);
				invokeOperatorEnd();
				setState(275);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(READ);
				setState(278);
				invokeOperator();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(279);
					expression(0);
					}
				}

				setState(282);
				invokeOperatorEnd();
				setState(283);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(SPAWN);
				setState(286);
				expression(0);
				setState(287);
				match(SET);
				setState(288);
				name();
				setState(289);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(BLOCK);
				setState(292);
				match(T__0);
				setState(293);
				match(T__1);
				setState(294);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				match(LOCK);
				setState(296);
				name();
				setState(297);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(299);
				match(UNLOCK);
				setState(300);
				name();
				setState(301);
				match(T__3);
				}
				break;
			case T__4:
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(303);
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
				setState(304);
				expression(0);
				setState(305);
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
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InvokeOperatorEndContext invokeOperatorEnd() {
			return getRuleContext(InvokeOperatorEndContext.class,0);
		}
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(FOR);
				setState(310);
				invokeOperator();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(311);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(312);
					expression(0);
					}
					break;
				}
				setState(315);
				match(T__3);
				setState(316);
				expression(0);
				setState(317);
				match(T__3);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(318);
					expression(0);
					}
				}

				setState(321);
				invokeOperatorEnd();
				setState(322);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(T__4);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(325);
						statement();
						}
						break;
					case 2:
						{
						setState(326);
						variableDeclaration();
						setState(327);
						match(T__3);
						}
						break;
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
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
		public BraceEnclosedInitializerContext braceEnclosedInitializer() {
			return getRuleContext(BraceEnclosedInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(NEW);
				setState(338);
				type();
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(339);
					templateDeclaration();
					}
					break;
				}
				setState(342);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				typeCast();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				braceEnclosedInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
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
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(349);
			cast();
			setState(350);
			expression(0);
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__0);
			setState(353);
			match(PRIMITIVE_TYPE);
			setState(354);
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
		enterRule(_localctx, 38, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__4);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(357);
				argumentList();
				}
			}

			setState(360);
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
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public InvokeOperatorEndContext invokeOperatorEnd() {
			return getRuleContext(InvokeOperatorEndContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayOperatorEndContext arrayOperatorEnd() {
			return getRuleContext(ArrayOperatorEndContext.class,0);
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
		enterRule(_localctx, 40, RULE_newDeclaration);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				invokeOperator();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(363);
					argumentList();
					}
				}

				setState(366);
				invokeOperatorEnd();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				arrayOperator();
				setState(369);
				expression(0);
				setState(370);
				arrayOperatorEnd();
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
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InvokeOperatorEndContext invokeOperatorEnd() {
			return getRuleContext(InvokeOperatorEndContext.class,0);
		}
		public ExpressionzContext expressionz() {
			return getRuleContext(ExpressionzContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(CclGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CclGrammarParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(CclGrammarParser.NULL, 0); }
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(375);
				invokeOperator();
				setState(376);
				expression(0);
				setState(377);
				invokeOperatorEnd();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(378);
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
				setState(381);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(382);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(385);
				self();
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(386);
					memberRefz();
					}
					break;
				}
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(389);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(392);
				numericLiteral();
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(393);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITERAL:
				{
				setState(396);
				characterLiteral();
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(397);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(400);
				stringLiteral();
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(401);
					expressionz();
					}
					break;
				}
				}
				break;
			case BOOLEAN_LITERAL:
				{
				setState(404);
				booleanLiteral();
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(405);
					expressionz();
					}
					break;
				}
				}
				break;
			case SPECIAL_LITERAL:
				{
				setState(408);
				specialLiteral();
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(409);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(412);
				name();
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(413);
					fnArrMember();
					}
					break;
				}
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(416);
					memberRefz();
					}
					break;
				}
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(419);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(422);
				match(NOT);
				setState(423);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
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
					setState(426);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(427);
					match(QUESTION);
					setState(428);
					expression(0);
					setState(429);
					match(COLON);
					setState(430);
					expression(3);
					}
					} 
				}
				setState(436);
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
		public InvokeOperatorContext invokeOperator() {
			return getRuleContext(InvokeOperatorContext.class,0);
		}
		public InvokeOperatorEndContext invokeOperatorEnd() {
			return getRuleContext(InvokeOperatorEndContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArrayOperatorContext arrayOperator() {
			return getRuleContext(ArrayOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayOperatorEndContext arrayOperatorEnd() {
			return getRuleContext(ArrayOperatorEndContext.class,0);
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
		enterRule(_localctx, 44, RULE_fnArrMember);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				invokeOperator();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(438);
					argumentList();
					}
				}

				setState(441);
				invokeOperatorEnd();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				arrayOperator();
				setState(444);
				expression(0);
				setState(445);
				arrayOperatorEnd();
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
		enterRule(_localctx, 46, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__2);
			setState(450);
			name();
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(451);
				fnArrMember();
				}
				break;
			}
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(454);
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
		enterRule(_localctx, 48, RULE_expressionz);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
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
				setState(458);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
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
		enterRule(_localctx, 50, RULE_assignmentOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(ASSIGN);
			setState(463);
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
		enterRule(_localctx, 52, RULE_booleanOperation);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(AND);
				setState(466);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(OR);
				setState(468);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(EQUALS);
				setState(470);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(NOT_EQ);
				setState(472);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				match(LESS_EQ);
				setState(474);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
				match(GREAT_EQ);
				setState(476);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(477);
				match(LESS);
				setState(478);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(479);
				match(GREATER);
				setState(480);
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
		enterRule(_localctx, 54, RULE_mathOperation);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(PLUS);
				setState(484);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(MINUS);
				setState(486);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(MULTI);
				setState(488);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(DIV);
				setState(490);
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
		enterRule(_localctx, 56, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__0);
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

	public static class InvokeOperatorEndContext extends ParserRuleContext {
		public InvokeOperatorEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeOperatorEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitInvokeOperatorEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeOperatorEndContext invokeOperatorEnd() throws RecognitionException {
		InvokeOperatorEndContext _localctx = new InvokeOperatorEndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_invokeOperatorEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
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
		enterRule(_localctx, 60, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
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

	public static class ArrayOperatorEndContext extends ParserRuleContext {
		public ArrayOperatorEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperatorEnd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitArrayOperatorEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperatorEndContext arrayOperatorEnd() throws RecognitionException {
		ArrayOperatorEndContext _localctx = new ArrayOperatorEndContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayOperatorEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__7);
			setState(502);
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
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
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
		enterRule(_localctx, 66, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			assignmentExpression();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(505);
				match(T__6);
				setState(506);
				assignmentExpression();
				}
				}
				setState(511);
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
		enterRule(_localctx, 68, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		public DeclaredTemplateTypeContext declaredTemplateType() {
			return getRuleContext(DeclaredTemplateTypeContext.class,0);
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
		enterRule(_localctx, 70, RULE_type);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				className();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS) {
					{
					setState(516);
					declaredTemplateType();
					}
				}

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
		enterRule(_localctx, 72, RULE_templatePlaceHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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

	public static class DeclaredTemplateTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclaredTemplateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaredTemplateType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitDeclaredTemplateType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaredTemplateTypeContext declaredTemplateType() throws RecognitionException {
		DeclaredTemplateTypeContext _localctx = new DeclaredTemplateTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaredTemplateType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LESS);
			setState(524);
			type();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(525);
				match(T__6);
				setState(526);
				type();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
			match(GREATER);
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
		enterRule(_localctx, 76, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 78, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		enterRule(_localctx, 80, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
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

	public static class SelfContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CclGrammarParser.THIS, 0); }
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(THIS);
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
		enterRule(_localctx, 84, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 86, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 88, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		enterRule(_localctx, 90, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
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
		enterRule(_localctx, 92, RULE_specialLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u022b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\7\2h"+
		"\n\2\f\2\16\2k\13\2\3\2\5\2n\n\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\3\2\3"+
		"\3\6\3y\n\3\r\3\16\3z\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u0087"+
		"\n\4\f\4\16\4\u008a\13\4\3\4\3\4\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5"+
		"\3\5\3\5\3\5\5\5\u0097\n\5\3\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac\13\7\3"+
		"\b\3\b\3\b\5\b\u00b1\n\b\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13"+
		"\n\3\n\3\n\3\n\5\n\u00cb\n\n\3\n\5\n\u00ce\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13\u00d5\n\13\f\13\16\13\u00d8\13\13\3\f\3\f\3\f\5\f\u00dd\n\f\3\r"+
		"\5\r\u00e0\n\r\3\r\3\r\3\r\5\r\u00e5\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00ef\n\16\f\16\16\16\u00f2\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\5\17\u00f9\n\17\3\17\5\17\u00fc\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0105\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u010f"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011b\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0136\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u013c\n\21\3\21\3\21\3\21\3\21\5\21\u0142\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u014c\n\21\f\21\16\21"+
		"\u014f\13\21\3\21\5\21\u0152\n\21\3\22\3\22\3\22\5\22\u0157\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u015e\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\5\25\u0169\n\25\3\25\3\25\3\26\3\26\5\26\u016f\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0177\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u017e\n\27\3\27\3\27\5\27\u0182\n\27\3\27\3\27\5\27\u0186\n\27\3\27\5"+
		"\27\u0189\n\27\3\27\3\27\5\27\u018d\n\27\3\27\3\27\5\27\u0191\n\27\3\27"+
		"\3\27\5\27\u0195\n\27\3\27\3\27\5\27\u0199\n\27\3\27\3\27\5\27\u019d\n"+
		"\27\3\27\3\27\5\27\u01a1\n\27\3\27\5\27\u01a4\n\27\3\27\5\27\u01a7\n\27"+
		"\3\27\3\27\5\27\u01ab\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01b3\n"+
		"\27\f\27\16\27\u01b6\13\27\3\30\3\30\5\30\u01ba\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u01c2\n\30\3\31\3\31\3\31\5\31\u01c7\n\31\3\31\5\31"+
		"\u01ca\n\31\3\32\3\32\3\32\5\32\u01cf\n\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u01e4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01ee\n\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\7#\u01fe\n#\f#\16"+
		"#\u0201\13#\3$\3$\3%\3%\3%\5%\u0208\n%\5%\u020a\n%\3&\3&\3\'\3\'\3\'\3"+
		"\'\7\'\u0212\n\'\f\'\16\'\u0215\13\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\2\3,\61\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\3\3\2\31\33"+
		"\2\u0258\2c\3\2\2\2\4x\3\2\2\2\6\u0082\3\2\2\2\b\u0090\3\2\2\2\n\u00a1"+
		"\3\2\2\2\f\u00a5\3\2\2\2\16\u00b0\3\2\2\2\20\u00b5\3\2\2\2\22\u00c4\3"+
		"\2\2\2\24\u00d1\3\2\2\2\26\u00d9\3\2\2\2\30\u00df\3\2\2\2\32\u00e9\3\2"+
		"\2\2\34\u00f5\3\2\2\2\36\u0135\3\2\2\2 \u0151\3\2\2\2\"\u015d\3\2\2\2"+
		"$\u015f\3\2\2\2&\u0162\3\2\2\2(\u0166\3\2\2\2*\u0176\3\2\2\2,\u01aa\3"+
		"\2\2\2.\u01c1\3\2\2\2\60\u01c3\3\2\2\2\62\u01ce\3\2\2\2\64\u01d0\3\2\2"+
		"\2\66\u01e3\3\2\2\28\u01ed\3\2\2\2:\u01ef\3\2\2\2<\u01f1\3\2\2\2>\u01f3"+
		"\3\2\2\2@\u01f5\3\2\2\2B\u01f7\3\2\2\2D\u01fa\3\2\2\2F\u0202\3\2\2\2H"+
		"\u0209\3\2\2\2J\u020b\3\2\2\2L\u020d\3\2\2\2N\u0218\3\2\2\2P\u021a\3\2"+
		"\2\2R\u021c\3\2\2\2T\u021e\3\2\2\2V\u0220\3\2\2\2X\u0222\3\2\2\2Z\u0224"+
		"\3\2\2\2\\\u0226\3\2\2\2^\u0228\3\2\2\2`b\5\6\4\2a`\3\2\2\2be\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2\2\2fh\5\b\5\2gf\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2ln\5\4\3\2ml\3\2\2\2mn\3\2\2\2"+
		"nr\3\2\2\2oq\5\b\5\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tr\3\2\2\2uv\7\2\2\3v\3\3\2\2\2wy\5F$\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}~\7,\2\2~\177\7\3\2\2\177\u0080\7\4\2\2"+
		"\u0080\u0081\5\32\16\2\u0081\5\3\2\2\2\u0082\u0083\7*\2\2\u0083\u0088"+
		"\7=\2\2\u0084\u0085\7\5\2\2\u0085\u0087\7=\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\6\2\2\u008c\7\3\2\2\2\u008d\u008f"+
		"\5F$\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7+"+
		"\2\2\u0094\u0096\5N(\2\u0095\u0097\5\n\6\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\7\7\2\2\u0099\u009b\5\16\b\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0"+
		"\t\3\2\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\4\2\2"+
		"\u00a4\13\3\2\2\2\u00a5\u00aa\5J&\2\u00a6\u00a7\7\t\2\2\u00a7\u00a9\5"+
		"J&\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\r\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\5\20\t"+
		"\2\u00ae\u00b1\5\22\n\2\u00af\u00b1\5\30\r\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b4\5F$\2"+
		"\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5H%\2\u00b9"+
		"\u00ba\5P)\2\u00ba\u00bc\7\3\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00bb\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf"+
		"\u00c0\5\32\16\2\u00c0\21\3\2\2\2\u00c1\u00c3\5F$\2\u00c2\u00c1\3\2\2"+
		"\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5H%\2\u00c8\u00ca\5R*\2\u00c9"+
		"\u00cb\5B\"\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ce\5\64\33\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0\23\3\2\2\2\u00d1\u00d6\5\26\f"+
		"\2\u00d2\u00d3\7\t\2\2\u00d3\u00d5\5\26\f\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\25\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5H%\2\u00da\u00dc\5R*\2\u00db\u00dd"+
		"\5B\"\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\27\3\2\2\2\u00de"+
		"\u00e0\5F$\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00e2\5P)\2\u00e2\u00e4\7\3\2\2\u00e3\u00e5\5\24\13\2\u00e4\u00e3"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7"+
		"\u00e8\5\32\16\2\u00e8\31\3\2\2\2\u00e9\u00f0\7\7\2\2\u00ea\u00eb\5\34"+
		"\17\2\u00eb\u00ec\7\6\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5\36\20\2\u00ee"+
		"\u00ea\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7\b\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\5H%\2\u00f6\u00f8\5R*\2\u00f7"+
		"\u00f9\5B\"\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2"+
		"\2\2\u00fa\u00fc\5\64\33\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\35\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe\u00ff\5:\36\2\u00ff\u0100\5,\27"+
		"\2\u0100\u0101\5<\37\2\u0101\u0104\5\36\20\2\u0102\u0103\7\36\2\2\u0103"+
		"\u0105\5\36\20\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0136\3"+
		"\2\2\2\u0106\u0107\7\37\2\2\u0107\u0108\5:\36\2\u0108\u0109\5,\27\2\u0109"+
		"\u010a\5<\37\2\u010a\u010b\5\36\20\2\u010b\u0136\3\2\2\2\u010c\u010e\7"+
		"\"\2\2\u010d\u010f\5,\27\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0136\7\6\2\2\u0111\u0112\7#\2\2\u0112\u0113\5:\36"+
		"\2\u0113\u0114\5,\27\2\u0114\u0115\5<\37\2\u0115\u0116\7\6\2\2\u0116\u0136"+
		"\3\2\2\2\u0117\u0118\7$\2\2\u0118\u011a\5:\36\2\u0119\u011b\5,\27\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5<"+
		"\37\2\u011d\u011e\7\6\2\2\u011e\u0136\3\2\2\2\u011f\u0120\7%\2\2\u0120"+
		"\u0121\5,\27\2\u0121\u0122\7&\2\2\u0122\u0123\5R*\2\u0123\u0124\7\6\2"+
		"\2\u0124\u0136\3\2\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7\3\2\2\u0127\u0128"+
		"\7\4\2\2\u0128\u0136\7\6\2\2\u0129\u012a\7(\2\2\u012a\u012b\5R*\2\u012b"+
		"\u012c\7\6\2\2\u012c\u0136\3\2\2\2\u012d\u012e\7)\2\2\u012e\u012f\5R*"+
		"\2\u012f\u0130\7\6\2\2\u0130\u0136\3\2\2\2\u0131\u0136\5 \21\2\u0132\u0133"+
		"\5,\27\2\u0133\u0134\7\6\2\2\u0134\u0136\3\2\2\2\u0135\u00fd\3\2\2\2\u0135"+
		"\u0106\3\2\2\2\u0135\u010c\3\2\2\2\u0135\u0111\3\2\2\2\u0135\u0117\3\2"+
		"\2\2\u0135\u011f\3\2\2\2\u0135\u0125\3\2\2\2\u0135\u0129\3\2\2\2\u0135"+
		"\u012d\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0136\37\3\2\2"+
		"\2\u0137\u0138\7 \2\2\u0138\u013b\5:\36\2\u0139\u013c\5\34\17\2\u013a"+
		"\u013c\5,\27\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\6\2\2\u013e\u013f\5,\27\2\u013f"+
		"\u0141\7\6\2\2\u0140\u0142\5,\27\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0143\3\2\2\2\u0143\u0144\5<\37\2\u0144\u0145\5\36\20\2\u0145"+
		"\u0152\3\2\2\2\u0146\u014d\7\7\2\2\u0147\u014c\5\36\20\2\u0148\u0149\5"+
		"\34\17\2\u0149\u014a\7\6\2\2\u014a\u014c\3\2\2\2\u014b\u0147\3\2\2\2\u014b"+
		"\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7\b\2\2\u0151"+
		"\u0137\3\2\2\2\u0151\u0146\3\2\2\2\u0152!\3\2\2\2\u0153\u0154\7!\2\2\u0154"+
		"\u0156\5H%\2\u0155\u0157\5\n\6\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157\u0158\3\2\2\2\u0158\u0159\5*\26\2\u0159\u015e\3\2\2\2\u015a\u015e"+
		"\5$\23\2\u015b\u015e\5(\25\2\u015c\u015e\5,\27\2\u015d\u0153\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e#\3\2\2\2"+
		"\u015f\u0160\5&\24\2\u0160\u0161\5,\27\2\u0161%\3\2\2\2\u0162\u0163\7"+
		"\3\2\2\u0163\u0164\7\f\2\2\u0164\u0165\7\4\2\2\u0165\'\3\2\2\2\u0166\u0168"+
		"\7\7\2\2\u0167\u0169\5D#\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\7\b\2\2\u016b)\3\2\2\2\u016c\u016e\5:\36\2"+
		"\u016d\u016f\5D#\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0171\5<\37\2\u0171\u0177\3\2\2\2\u0172\u0173\5> \2\u0173"+
		"\u0174\5,\27\2\u0174\u0175\5@!\2\u0175\u0177\3\2\2\2\u0176\u016c\3\2\2"+
		"\2\u0176\u0172\3\2\2\2\u0177+\3\2\2\2\u0178\u0179\b\27\1\2\u0179\u017a"+
		"\5:\36\2\u017a\u017b\5,\27\2\u017b\u017d\5<\37\2\u017c\u017e\5\62\32\2"+
		"\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u01ab\3\2\2\2\u017f\u0181"+
		"\t\2\2\2\u0180\u0182\5\62\32\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2"+
		"\u0182\u01ab\3\2\2\2\u0183\u0185\5T+\2\u0184\u0186\5\60\31\2\u0185\u0184"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\5\62\32\2"+
		"\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u01ab\3\2\2\2\u018a\u018c"+
		"\5Z.\2\u018b\u018d\5\62\32\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u01ab\3\2\2\2\u018e\u0190\5X-\2\u018f\u0191\5\62\32\2\u0190\u018f\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u01ab\3\2\2\2\u0192\u0194\5V,\2\u0193\u0195"+
		"\5\62\32\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01ab\3\2\2\2"+
		"\u0196\u0198\5\\/\2\u0197\u0199\5\62\32\2\u0198\u0197\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u01ab\3\2\2\2\u019a\u019c\5^\60\2\u019b\u019d\5\62\32\2"+
		"\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01ab\3\2\2\2\u019e\u01a0"+
		"\5R*\2\u019f\u01a1\5.\30\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u01a4\5\60\31\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5\62\32\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01a9\7.\2\2\u01a9\u01ab\5,\27"+
		"\3\u01aa\u0178\3\2\2\2\u01aa\u017f\3\2\2\2\u01aa\u0183\3\2\2\2\u01aa\u018a"+
		"\3\2\2\2\u01aa\u018e\3\2\2\2\u01aa\u0192\3\2\2\2\u01aa\u0196\3\2\2\2\u01aa"+
		"\u019a\3\2\2\2\u01aa\u019e\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b4\3\2"+
		"\2\2\u01ac\u01ad\f\4\2\2\u01ad\u01ae\7;\2\2\u01ae\u01af\5,\27\2\u01af"+
		"\u01b0\7<\2\2\u01b0\u01b1\5,\27\5\u01b1\u01b3\3\2\2\2\u01b2\u01ac\3\2"+
		"\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"-\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\5:\36\2\u01b8\u01ba\5D#\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5<"+
		"\37\2\u01bc\u01c2\3\2\2\2\u01bd\u01be\5> \2\u01be\u01bf\5,\27\2\u01bf"+
		"\u01c0\5@!\2\u01c0\u01c2\3\2\2\2\u01c1\u01b7\3\2\2\2\u01c1\u01bd\3\2\2"+
		"\2\u01c2/\3\2\2\2\u01c3\u01c4\7\5\2\2\u01c4\u01c6\5R*\2\u01c5\u01c7\5"+
		".\30\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01ca\5\60\31\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\61\3\2"+
		"\2\2\u01cb\u01cf\5\64\33\2\u01cc\u01cf\5\66\34\2\u01cd\u01cf\58\35\2\u01ce"+
		"\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\63\3\2\2"+
		"\2\u01d0\u01d1\7:\2\2\u01d1\u01d2\5\"\22\2\u01d2\65\3\2\2\2\u01d3\u01d4"+
		"\7/\2\2\u01d4\u01e4\5,\27\2\u01d5\u01d6\7\60\2\2\u01d6\u01e4\5,\27\2\u01d7"+
		"\u01d8\7\65\2\2\u01d8\u01e4\5,\27\2\u01d9\u01da\7-\2\2\u01da\u01e4\5,"+
		"\27\2\u01db\u01dc\7\66\2\2\u01dc\u01e4\5,\27\2\u01dd\u01de\7\67\2\2\u01de"+
		"\u01e4\5,\27\2\u01df\u01e0\78\2\2\u01e0\u01e4\5,\27\2\u01e1\u01e2\79\2"+
		"\2\u01e2\u01e4\5,\27\2\u01e3\u01d3\3\2\2\2\u01e3\u01d5\3\2\2\2\u01e3\u01d7"+
		"\3\2\2\2\u01e3\u01d9\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3"+
		"\u01df\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\67\3\2\2\2\u01e5\u01e6\7\61\2"+
		"\2\u01e6\u01ee\5,\27\2\u01e7\u01e8\7\62\2\2\u01e8\u01ee\5,\27\2\u01e9"+
		"\u01ea\7\63\2\2\u01ea\u01ee\5,\27\2\u01eb\u01ec\7\64\2\2\u01ec\u01ee\5"+
		",\27\2\u01ed\u01e5\3\2\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed"+
		"\u01eb\3\2\2\2\u01ee9\3\2\2\2\u01ef\u01f0\7\3\2\2\u01f0;\3\2\2\2\u01f1"+
		"\u01f2\7\4\2\2\u01f2=\3\2\2\2\u01f3\u01f4\7\n\2\2\u01f4?\3\2\2\2\u01f5"+
		"\u01f6\7\13\2\2\u01f6A\3\2\2\2\u01f7\u01f8\7\n\2\2\u01f8\u01f9\7\13\2"+
		"\2\u01f9C\3\2\2\2\u01fa\u01ff\5\"\22\2\u01fb\u01fc\7\t\2\2\u01fc\u01fe"+
		"\5\"\22\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2"+
		"\u01ff\u0200\3\2\2\2\u0200E\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7"+
		"\r\2\2\u0203G\3\2\2\2\u0204\u020a\7\f\2\2\u0205\u0207\5N(\2\u0206\u0208"+
		"\5L\'\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209"+
		"\u0204\3\2\2\2\u0209\u0205\3\2\2\2\u020aI\3\2\2\2\u020b\u020c\7=\2\2\u020c"+
		"K\3\2\2\2\u020d\u020e\78\2\2\u020e\u0213\5H%\2\u020f\u0210\7\t\2\2\u0210"+
		"\u0212\5H%\2\u0211\u020f\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2"+
		"\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217"+
		"\79\2\2\u0217M\3\2\2\2\u0218\u0219\7=\2\2\u0219O\3\2\2\2\u021a\u021b\7"+
		"=\2\2\u021bQ\3\2\2\2\u021c\u021d\7=\2\2\u021dS\3\2\2\2\u021e\u021f\7\34"+
		"\2\2\u021fU\3\2\2\2\u0220\u0221\7>\2\2\u0221W\3\2\2\2\u0222\u0223\7?\2"+
		"\2\u0223Y\3\2\2\2\u0224\u0225\7@\2\2\u0225[\3\2\2\2\u0226\u0227\7\17\2"+
		"\2\u0227]\3\2\2\2\u0228\u0229\7\16\2\2\u0229_\3\2\2\2Acimrz\u0088\u0090"+
		"\u0096\u009c\u00aa\u00b0\u00b5\u00bc\u00c4\u00ca\u00cd\u00d6\u00dc\u00df"+
		"\u00e4\u00ee\u00f0\u00f8\u00fb\u0104\u010e\u011a\u0135\u013b\u0141\u014b"+
		"\u014d\u0151\u0156\u015d\u0168\u016e\u0176\u017d\u0181\u0185\u0188\u018c"+
		"\u0190\u0194\u0198\u019c\u01a0\u01a3\u01a6\u01aa\u01b4\u01b9\u01c1\u01c6"+
		"\u01c9\u01ce\u01e3\u01ed\u01ff\u0207\u0209\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}