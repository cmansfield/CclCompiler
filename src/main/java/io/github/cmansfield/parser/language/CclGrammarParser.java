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
		RULE_invokeOperator = 28, RULE_invokeOperatorEnd = 29, RULE_listSeparatorOperator = 30, 
		RULE_arrayOperator = 31, RULE_arrayOperatorEnd = 32, RULE_arrayDeclaration = 33, 
		RULE_argumentList = 34, RULE_modifier = 35, RULE_type = 36, RULE_templatePlaceHolder = 37, 
		RULE_declaredTemplateType = 38, RULE_className = 39, RULE_methodName = 40, 
		RULE_name = 41, RULE_self = 42, RULE_stringLiteral = 43, RULE_characterLiteral = 44, 
		RULE_numericLiteral = 45, RULE_booleanLiteral = 46, RULE_specialLiteral = 47;
	public static final String[] ruleNames = {
		"compilationUnit", "mainDeclaration", "importDeclaration", "classDeclaration", 
		"templateDeclaration", "templateList", "classMemberDeclaration", "methodDeclaration", 
		"fieldDeclaration", "parameterList", "parameter", "constructorDeclaration", 
		"methodBody", "variableDeclaration", "statement", "statementWithScope", 
		"assignmentExpression", "typeCast", "cast", "braceEnclosedInitializer", 
		"newDeclaration", "expression", "fnArrMember", "memberRefz", "expressionz", 
		"assignmentOperation", "booleanOperation", "mathOperation", "invokeOperator", 
		"invokeOperatorEnd", "listSeparatorOperator", "arrayOperator", "arrayOperatorEnd", 
		"arrayDeclaration", "argumentList", "modifier", "type", "templatePlaceHolder", 
		"declaredTemplateType", "className", "methodName", "name", "self", "stringLiteral", 
		"characterLiteral", "numericLiteral", "booleanLiteral", "specialLiteral"
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(96);
				importDeclaration();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					classDeclaration();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(108);
				mainDeclaration();
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==CLASS) {
				{
				{
				setState(111);
				classDeclaration();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				modifier();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODIFIER );
			setState(124);
			match(PRIMITIVE_TYPE);
			setState(125);
			match(MAIN);
			setState(126);
			match(T__0);
			setState(127);
			match(T__1);
			setState(128);
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
			setState(130);
			match(IMPORT);
			setState(131);
			match(IDENTIFIER);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				match(IDENTIFIER);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
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
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(141);
				modifier();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(CLASS);
			setState(148);
			className();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(149);
				templateDeclaration();
				}
			}

			setState(152);
			match(T__4);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMITIVE_TYPE) | (1L << MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(153);
				classMemberDeclaration();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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
			setState(161);
			match(T__0);
			setState(162);
			templateList();
			setState(163);
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
			setState(165);
			templatePlaceHolder();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(166);
				match(T__6);
				setState(167);
				templatePlaceHolder();
				}
				}
				setState(172);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
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
			methodName();
			setState(186);
			match(T__0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(187);
				parameterList();
				}
			}

			setState(190);
			match(T__1);
			setState(191);
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
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(193);
				modifier();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			type();
			setState(200);
			name();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(201);
				arrayDeclaration();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(204);
				assignmentOperation();
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
			setState(209);
			parameter();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(210);
				match(T__6);
				setState(211);
				parameter();
				}
				}
				setState(216);
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
			setState(217);
			type();
			setState(218);
			name();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(219);
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
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(222);
				modifier();
				}
			}

			setState(225);
			methodName();
			setState(226);
			match(T__0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(227);
				parameterList();
				}
			}

			setState(230);
			match(T__1);
			setState(231);
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
			setState(233);
			match(T__4);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(234);
					variableDeclaration();
					setState(235);
					match(T__3);
					}
					break;
				case 2:
					{
					setState(237);
					statement();
					}
					break;
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(245);
			type();
			setState(246);
			name();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(247);
				arrayDeclaration();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(250);
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
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(IF);
				setState(254);
				invokeOperator();
				setState(255);
				expression(0);
				setState(256);
				invokeOperatorEnd();
				setState(257);
				statement();
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(258);
					match(ELSE);
					setState(259);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(WHILE);
				setState(263);
				invokeOperator();
				setState(264);
				expression(0);
				setState(265);
				invokeOperatorEnd();
				setState(266);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(RETURN);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(269);
					expression(0);
					}
				}

				setState(272);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(PRINT);
				setState(274);
				invokeOperator();
				setState(275);
				expression(0);
				setState(276);
				invokeOperatorEnd();
				setState(277);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(279);
				match(READ);
				setState(280);
				invokeOperator();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(281);
					expression(0);
					}
				}

				setState(284);
				invokeOperatorEnd();
				setState(285);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(SPAWN);
				setState(288);
				expression(0);
				setState(289);
				match(SET);
				setState(290);
				name();
				setState(291);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				match(BLOCK);
				setState(294);
				match(T__0);
				setState(295);
				match(T__1);
				setState(296);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(LOCK);
				setState(298);
				name();
				setState(299);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(301);
				match(UNLOCK);
				setState(302);
				name();
				setState(303);
				match(T__3);
				}
				break;
			case T__4:
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
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
				setState(306);
				expression(0);
				setState(307);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(FOR);
				setState(312);
				invokeOperator();
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(313);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(314);
					expression(0);
					}
					break;
				}
				setState(317);
				match(T__3);
				setState(318);
				expression(0);
				setState(319);
				match(T__3);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(320);
					expression(0);
					}
				}

				setState(323);
				invokeOperatorEnd();
				setState(324);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__4);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(327);
						statement();
						}
						break;
					case 2:
						{
						setState(328);
						variableDeclaration();
						setState(329);
						match(T__3);
						}
						break;
					}
					}
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(NEW);
				setState(340);
				type();
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(341);
					templateDeclaration();
					}
					break;
				}
				setState(344);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				typeCast();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				braceEnclosedInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
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
			setState(351);
			cast();
			setState(352);
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
			setState(354);
			match(T__0);
			setState(355);
			match(PRIMITIVE_TYPE);
			setState(356);
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
			setState(358);
			match(T__4);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(359);
				argumentList();
				}
			}

			setState(362);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				invokeOperator();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(365);
					argumentList();
					}
				}

				setState(368);
				invokeOperatorEnd();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				arrayOperator();
				setState(371);
				expression(0);
				setState(372);
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
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(377);
				invokeOperator();
				setState(378);
				expression(0);
				setState(379);
				invokeOperatorEnd();
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(380);
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
				setState(383);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(384);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(387);
				self();
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(388);
					memberRefz();
					}
					break;
				}
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(391);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(394);
				numericLiteral();
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(395);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITERAL:
				{
				setState(398);
				characterLiteral();
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(399);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(402);
				stringLiteral();
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(403);
					expressionz();
					}
					break;
				}
				}
				break;
			case BOOLEAN_LITERAL:
				{
				setState(406);
				booleanLiteral();
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(407);
					expressionz();
					}
					break;
				}
				}
				break;
			case SPECIAL_LITERAL:
				{
				setState(410);
				specialLiteral();
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(411);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(414);
				name();
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(415);
					fnArrMember();
					}
					break;
				}
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(418);
					memberRefz();
					}
					break;
				}
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(421);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(424);
				match(NOT);
				setState(425);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
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
					setState(428);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(429);
					match(QUESTION);
					setState(430);
					expression(0);
					setState(431);
					match(COLON);
					setState(432);
					expression(3);
					}
					} 
				}
				setState(438);
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
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				invokeOperator();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NEW) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(440);
					argumentList();
					}
				}

				setState(443);
				invokeOperatorEnd();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				arrayOperator();
				setState(446);
				expression(0);
				setState(447);
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
			setState(451);
			match(T__2);
			setState(452);
			name();
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(453);
				fnArrMember();
				}
				break;
			}
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(456);
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
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
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
				setState(460);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
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
			setState(464);
			match(ASSIGN);
			setState(465);
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
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(AND);
				setState(468);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(OR);
				setState(470);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(EQUALS);
				setState(472);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(NOT_EQ);
				setState(474);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(475);
				match(LESS_EQ);
				setState(476);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(477);
				match(GREAT_EQ);
				setState(478);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(479);
				match(LESS);
				setState(480);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(481);
				match(GREATER);
				setState(482);
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
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(PLUS);
				setState(486);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(MINUS);
				setState(488);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(MULTI);
				setState(490);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				match(DIV);
				setState(492);
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
			setState(495);
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
			setState(497);
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

	public static class ListSeparatorOperatorContext extends ParserRuleContext {
		public ListSeparatorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSeparatorOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitListSeparatorOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSeparatorOperatorContext listSeparatorOperator() throws RecognitionException {
		ListSeparatorOperatorContext _localctx = new ListSeparatorOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listSeparatorOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__6);
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
		enterRule(_localctx, 62, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		enterRule(_localctx, 64, RULE_arrayOperatorEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 66, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T__7);
			setState(506);
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
		public List<ListSeparatorOperatorContext> listSeparatorOperator() {
			return getRuleContexts(ListSeparatorOperatorContext.class);
		}
		public ListSeparatorOperatorContext listSeparatorOperator(int i) {
			return getRuleContext(ListSeparatorOperatorContext.class,i);
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
		enterRule(_localctx, 68, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			assignmentExpression();
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(509);
				listSeparatorOperator();
				setState(510);
				assignmentExpression();
				}
				}
				setState(516);
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
		enterRule(_localctx, 70, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				className();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS) {
					{
					setState(521);
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
		enterRule(_localctx, 74, RULE_templatePlaceHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		enterRule(_localctx, 76, RULE_declaredTemplateType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(LESS);
			setState(529);
			type();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(530);
				match(T__6);
				setState(531);
				type();
				}
				}
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(537);
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
		enterRule(_localctx, 78, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		enterRule(_localctx, 80, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		enterRule(_localctx, 82, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 84, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		enterRule(_localctx, 86, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		enterRule(_localctx, 88, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		enterRule(_localctx, 90, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		enterRule(_localctx, 92, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 94, RULE_specialLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0230\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\7\2j\n\2\f\2\16\2m\13\2\3\2\5\2p\n\2\3\2\7\2s\n\2\f\2\16\2v\13\2"+
		"\3\2\3\2\3\3\6\3{\n\3\r\3\16\3|\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\4\3\4\3\5\7\5\u0091\n\5\f\5\16"+
		"\5\u0094\13\5\3\5\3\5\3\5\5\5\u0099\n\5\3\5\3\5\7\5\u009d\n\5\f\5\16\5"+
		"\u00a0\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7"+
		"\u00ae\13\7\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9"+
		"\13\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\3\t\3\n\7\n\u00c5\n\n\f\n"+
		"\16\n\u00c8\13\n\3\n\3\n\3\n\5\n\u00cd\n\n\3\n\5\n\u00d0\n\n\3\n\3\n\3"+
		"\13\3\13\3\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\f\3\f\3\f\5\f\u00df"+
		"\n\f\3\r\5\r\u00e2\n\r\3\r\3\r\3\r\5\r\u00e7\n\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00f1\n\16\f\16\16\16\u00f4\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\5\17\u00fb\n\17\3\17\5\17\u00fe\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0107\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0111\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u011d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0138\n\20\3\21\3\21\3\21\3\21\5\21\u013e\n\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0144\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u014e\n\21"+
		"\f\21\16\21\u0151\13\21\3\21\5\21\u0154\n\21\3\22\3\22\3\22\5\22\u0159"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0160\n\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\5\25\u016b\n\25\3\25\3\25\3\26\3\26\5\26\u0171\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0179\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0180\n\27\3\27\3\27\5\27\u0184\n\27\3\27\3\27\5\27\u0188\n"+
		"\27\3\27\5\27\u018b\n\27\3\27\3\27\5\27\u018f\n\27\3\27\3\27\5\27\u0193"+
		"\n\27\3\27\3\27\5\27\u0197\n\27\3\27\3\27\5\27\u019b\n\27\3\27\3\27\5"+
		"\27\u019f\n\27\3\27\3\27\5\27\u01a3\n\27\3\27\5\27\u01a6\n\27\3\27\5\27"+
		"\u01a9\n\27\3\27\3\27\5\27\u01ad\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u01b5\n\27\f\27\16\27\u01b8\13\27\3\30\3\30\5\30\u01bc\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u01c4\n\30\3\31\3\31\3\31\5\31\u01c9\n\31"+
		"\3\31\5\31\u01cc\n\31\3\32\3\32\3\32\5\32\u01d1\n\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01e6\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01f0\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$"+
		"\3$\7$\u0203\n$\f$\16$\u0206\13$\3%\3%\3&\3&\3&\5&\u020d\n&\5&\u020f\n"+
		"&\3\'\3\'\3(\3(\3(\3(\7(\u0217\n(\f(\16(\u021a\13(\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\2\3,\62\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`\2\3\3\2\31\33\2\u025c\2e\3\2\2\2\4z\3\2\2\2\6\u0084\3\2\2\2\b\u0092"+
		"\3\2\2\2\n\u00a3\3\2\2\2\f\u00a7\3\2\2\2\16\u00b2\3\2\2\2\20\u00b7\3\2"+
		"\2\2\22\u00c6\3\2\2\2\24\u00d3\3\2\2\2\26\u00db\3\2\2\2\30\u00e1\3\2\2"+
		"\2\32\u00eb\3\2\2\2\34\u00f7\3\2\2\2\36\u0137\3\2\2\2 \u0153\3\2\2\2\""+
		"\u015f\3\2\2\2$\u0161\3\2\2\2&\u0164\3\2\2\2(\u0168\3\2\2\2*\u0178\3\2"+
		"\2\2,\u01ac\3\2\2\2.\u01c3\3\2\2\2\60\u01c5\3\2\2\2\62\u01d0\3\2\2\2\64"+
		"\u01d2\3\2\2\2\66\u01e5\3\2\2\28\u01ef\3\2\2\2:\u01f1\3\2\2\2<\u01f3\3"+
		"\2\2\2>\u01f5\3\2\2\2@\u01f7\3\2\2\2B\u01f9\3\2\2\2D\u01fb\3\2\2\2F\u01fe"+
		"\3\2\2\2H\u0207\3\2\2\2J\u020e\3\2\2\2L\u0210\3\2\2\2N\u0212\3\2\2\2P"+
		"\u021d\3\2\2\2R\u021f\3\2\2\2T\u0221\3\2\2\2V\u0223\3\2\2\2X\u0225\3\2"+
		"\2\2Z\u0227\3\2\2\2\\\u0229\3\2\2\2^\u022b\3\2\2\2`\u022d\3\2\2\2bd\5"+
		"\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5"+
		"\b\5\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5"+
		"\4\3\2on\3\2\2\2op\3\2\2\2pt\3\2\2\2qs\5\b\5\2rq\3\2\2\2sv\3\2\2\2tr\3"+
		"\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\2\2\3x\3\3\2\2\2y{\5H%\2zy\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\f\2\2\177\u0080"+
		"\7,\2\2\u0080\u0081\7\3\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\32\16\2"+
		"\u0083\5\3\2\2\2\u0084\u0085\7*\2\2\u0085\u008a\7=\2\2\u0086\u0087\7\5"+
		"\2\2\u0087\u0089\7=\2\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\6\2\2\u008e\7\3\2\2\2\u008f\u0091\5H%\2\u0090\u008f"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7+\2\2\u0096\u0098\5P)"+
		"\2\u0097\u0099\5\n\6\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009e\7\7\2\2\u009b\u009d\5\16\b\2\u009c\u009b\3\2\2\2"+
		"\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\b\2\2\u00a2\t\3\2\2\2\u00a3"+
		"\u00a4\7\3\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\7\4\2\2\u00a6\13\3\2\2"+
		"\2\u00a7\u00ac\5L\'\2\u00a8\u00a9\7\t\2\2\u00a9\u00ab\5L\'\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\r\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\5\20\t\2\u00b0\u00b3\5\22\n"+
		"\2\u00b1\u00b3\5\30\r\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b6\5H%\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5J&\2\u00bb\u00bc\5R*\2\u00bc"+
		"\u00be\7\3\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\5\32\16\2\u00c2"+
		"\21\3\2\2\2\u00c3\u00c5\5H%\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00ca\5J&\2\u00ca\u00cc\5T+\2\u00cb\u00cd\5D#\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\5\64\33\2"+
		"\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\7\6\2\2\u00d2\23\3\2\2\2\u00d3\u00d8\5\26\f\2\u00d4\u00d5\7\t\2\2\u00d5"+
		"\u00d7\5\26\f\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\25\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\5J&\2\u00dc\u00de\5T+\2\u00dd\u00df\5D#\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00e2\5H%\2\u00e1\u00e0\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5R*\2\u00e4\u00e6"+
		"\7\3\2\2\u00e5\u00e7\5\24\13\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00ea\5\32\16\2\u00ea\31"+
		"\3\2\2\2\u00eb\u00f2\7\7\2\2\u00ec\u00ed\5\34\17\2\u00ed\u00ee\7\6\2\2"+
		"\u00ee\u00f1\3\2\2\2\u00ef\u00f1\5\36\20\2\u00f0\u00ec\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\b\2\2\u00f6\33\3\2\2"+
		"\2\u00f7\u00f8\5J&\2\u00f8\u00fa\5T+\2\u00f9\u00fb\5D#\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fe\5\64\33\2\u00fd"+
		"\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\35\3\2\2\2\u00ff\u0100\7\35\2"+
		"\2\u0100\u0101\5:\36\2\u0101\u0102\5,\27\2\u0102\u0103\5<\37\2\u0103\u0106"+
		"\5\36\20\2\u0104\u0105\7\36\2\2\u0105\u0107\5\36\20\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0138\3\2\2\2\u0108\u0109\7\37\2\2\u0109"+
		"\u010a\5:\36\2\u010a\u010b\5,\27\2\u010b\u010c\5<\37\2\u010c\u010d\5\36"+
		"\20\2\u010d\u0138\3\2\2\2\u010e\u0110\7\"\2\2\u010f\u0111\5,\27\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0138\7\6"+
		"\2\2\u0113\u0114\7#\2\2\u0114\u0115\5:\36\2\u0115\u0116\5,\27\2\u0116"+
		"\u0117\5<\37\2\u0117\u0118\7\6\2\2\u0118\u0138\3\2\2\2\u0119\u011a\7$"+
		"\2\2\u011a\u011c\5:\36\2\u011b\u011d\5,\27\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5<\37\2\u011f\u0120\7\6"+
		"\2\2\u0120\u0138\3\2\2\2\u0121\u0122\7%\2\2\u0122\u0123\5,\27\2\u0123"+
		"\u0124\7&\2\2\u0124\u0125\5T+\2\u0125\u0126\7\6\2\2\u0126\u0138\3\2\2"+
		"\2\u0127\u0128\7\'\2\2\u0128\u0129\7\3\2\2\u0129\u012a\7\4\2\2\u012a\u0138"+
		"\7\6\2\2\u012b\u012c\7(\2\2\u012c\u012d\5T+\2\u012d\u012e\7\6\2\2\u012e"+
		"\u0138\3\2\2\2\u012f\u0130\7)\2\2\u0130\u0131\5T+\2\u0131\u0132\7\6\2"+
		"\2\u0132\u0138\3\2\2\2\u0133\u0138\5 \21\2\u0134\u0135\5,\27\2\u0135\u0136"+
		"\7\6\2\2\u0136\u0138\3\2\2\2\u0137\u00ff\3\2\2\2\u0137\u0108\3\2\2\2\u0137"+
		"\u010e\3\2\2\2\u0137\u0113\3\2\2\2\u0137\u0119\3\2\2\2\u0137\u0121\3\2"+
		"\2\2\u0137\u0127\3\2\2\2\u0137\u012b\3\2\2\2\u0137\u012f\3\2\2\2\u0137"+
		"\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0138\37\3\2\2\2\u0139\u013a\7 \2\2"+
		"\u013a\u013d\5:\36\2\u013b\u013e\5\34\17\2\u013c\u013e\5,\27\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7\6\2\2\u0140\u0141\5,\27\2\u0141\u0143\7\6\2\2\u0142\u0144\5,"+
		"\27\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\5<\37\2\u0146\u0147\5\36\20\2\u0147\u0154\3\2\2\2\u0148\u014f\7"+
		"\7\2\2\u0149\u014e\5\36\20\2\u014a\u014b\5\34\17\2\u014b\u014c\7\6\2\2"+
		"\u014c\u014e\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0154\7\b\2\2\u0153\u0139\3\2\2\2\u0153\u0148\3\2"+
		"\2\2\u0154!\3\2\2\2\u0155\u0156\7!\2\2\u0156\u0158\5J&\2\u0157\u0159\5"+
		"\n\6\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\5*\26\2\u015b\u0160\3\2\2\2\u015c\u0160\5$\23\2\u015d\u0160\5("+
		"\25\2\u015e\u0160\5,\27\2\u015f\u0155\3\2\2\2\u015f\u015c\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160#\3\2\2\2\u0161\u0162\5&\24\2"+
		"\u0162\u0163\5,\27\2\u0163%\3\2\2\2\u0164\u0165\7\3\2\2\u0165\u0166\7"+
		"\f\2\2\u0166\u0167\7\4\2\2\u0167\'\3\2\2\2\u0168\u016a\7\7\2\2\u0169\u016b"+
		"\5F$\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\7\b\2\2\u016d)\3\2\2\2\u016e\u0170\5:\36\2\u016f\u0171\5F$\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5<"+
		"\37\2\u0173\u0179\3\2\2\2\u0174\u0175\5@!\2\u0175\u0176\5,\27\2\u0176"+
		"\u0177\5B\"\2\u0177\u0179\3\2\2\2\u0178\u016e\3\2\2\2\u0178\u0174\3\2"+
		"\2\2\u0179+\3\2\2\2\u017a\u017b\b\27\1\2\u017b\u017c\5:\36\2\u017c\u017d"+
		"\5,\27\2\u017d\u017f\5<\37\2\u017e\u0180\5\62\32\2\u017f\u017e\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u01ad\3\2\2\2\u0181\u0183\t\2\2\2\u0182\u0184"+
		"\5\62\32\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u01ad\3\2\2\2"+
		"\u0185\u0187\5V,\2\u0186\u0188\5\60\31\2\u0187\u0186\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\5\62\32\2\u018a\u0189\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u01ad\3\2\2\2\u018c\u018e\5\\/\2\u018d\u018f"+
		"\5\62\32\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u01ad\3\2\2\2"+
		"\u0190\u0192\5Z.\2\u0191\u0193\5\62\32\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u01ad\3\2\2\2\u0194\u0196\5X-\2\u0195\u0197\5\62\32\2\u0196"+
		"\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01ad\3\2\2\2\u0198\u019a\5^"+
		"\60\2\u0199\u019b\5\62\32\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u01ad\3\2\2\2\u019c\u019e\5`\61\2\u019d\u019f\5\62\32\2\u019e\u019d\3"+
		"\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ad\3\2\2\2\u01a0\u01a2\5T+\2\u01a1"+
		"\u01a3\5.\30\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a6\5\60\31\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a9\5\62\32\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ab\7.\2\2\u01ab\u01ad\5,\27\3\u01ac"+
		"\u017a\3\2\2\2\u01ac\u0181\3\2\2\2\u01ac\u0185\3\2\2\2\u01ac\u018c\3\2"+
		"\2\2\u01ac\u0190\3\2\2\2\u01ac\u0194\3\2\2\2\u01ac\u0198\3\2\2\2\u01ac"+
		"\u019c\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b6\3\2"+
		"\2\2\u01ae\u01af\f\4\2\2\u01af\u01b0\7;\2\2\u01b0\u01b1\5,\27\2\u01b1"+
		"\u01b2\7<\2\2\u01b2\u01b3\5,\27\5\u01b3\u01b5\3\2\2\2\u01b4\u01ae\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"-\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb\5:\36\2\u01ba\u01bc\5F$\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\5<"+
		"\37\2\u01be\u01c4\3\2\2\2\u01bf\u01c0\5@!\2\u01c0\u01c1\5,\27\2\u01c1"+
		"\u01c2\5B\"\2\u01c2\u01c4\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3\u01bf\3\2"+
		"\2\2\u01c4/\3\2\2\2\u01c5\u01c6\7\5\2\2\u01c6\u01c8\5T+\2\u01c7\u01c9"+
		"\5.\30\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01cc\5\60\31\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\61\3\2"+
		"\2\2\u01cd\u01d1\5\64\33\2\u01ce\u01d1\5\66\34\2\u01cf\u01d1\58\35\2\u01d0"+
		"\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\63\3\2\2"+
		"\2\u01d2\u01d3\7:\2\2\u01d3\u01d4\5\"\22\2\u01d4\65\3\2\2\2\u01d5\u01d6"+
		"\7/\2\2\u01d6\u01e6\5,\27\2\u01d7\u01d8\7\60\2\2\u01d8\u01e6\5,\27\2\u01d9"+
		"\u01da\7\65\2\2\u01da\u01e6\5,\27\2\u01db\u01dc\7-\2\2\u01dc\u01e6\5,"+
		"\27\2\u01dd\u01de\7\66\2\2\u01de\u01e6\5,\27\2\u01df\u01e0\7\67\2\2\u01e0"+
		"\u01e6\5,\27\2\u01e1\u01e2\78\2\2\u01e2\u01e6\5,\27\2\u01e3\u01e4\79\2"+
		"\2\u01e4\u01e6\5,\27\2\u01e5\u01d5\3\2\2\2\u01e5\u01d7\3\2\2\2\u01e5\u01d9"+
		"\3\2\2\2\u01e5\u01db\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01df\3\2\2\2\u01e5"+
		"\u01e1\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\67\3\2\2\2\u01e7\u01e8\7\61\2"+
		"\2\u01e8\u01f0\5,\27\2\u01e9\u01ea\7\62\2\2\u01ea\u01f0\5,\27\2\u01eb"+
		"\u01ec\7\63\2\2\u01ec\u01f0\5,\27\2\u01ed\u01ee\7\64\2\2\u01ee\u01f0\5"+
		",\27\2\u01ef\u01e7\3\2\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f09\3\2\2\2\u01f1\u01f2\7\3\2\2\u01f2;\3\2\2\2\u01f3"+
		"\u01f4\7\4\2\2\u01f4=\3\2\2\2\u01f5\u01f6\7\t\2\2\u01f6?\3\2\2\2\u01f7"+
		"\u01f8\7\n\2\2\u01f8A\3\2\2\2\u01f9\u01fa\7\13\2\2\u01faC\3\2\2\2\u01fb"+
		"\u01fc\7\n\2\2\u01fc\u01fd\7\13\2\2\u01fdE\3\2\2\2\u01fe\u0204\5\"\22"+
		"\2\u01ff\u0200\5> \2\u0200\u0201\5\"\22\2\u0201\u0203\3\2\2\2\u0202\u01ff"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"G\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\r\2\2\u0208I\3\2\2\2\u0209"+
		"\u020f\7\f\2\2\u020a\u020c\5P)\2\u020b\u020d\5N(\2\u020c\u020b\3\2\2\2"+
		"\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0209\3\2\2\2\u020e\u020a"+
		"\3\2\2\2\u020fK\3\2\2\2\u0210\u0211\7=\2\2\u0211M\3\2\2\2\u0212\u0213"+
		"\78\2\2\u0213\u0218\5J&\2\u0214\u0215\7\t\2\2\u0215\u0217\5J&\2\u0216"+
		"\u0214\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021b\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\79\2\2\u021c"+
		"O\3\2\2\2\u021d\u021e\7=\2\2\u021eQ\3\2\2\2\u021f\u0220\7=\2\2\u0220S"+
		"\3\2\2\2\u0221\u0222\7=\2\2\u0222U\3\2\2\2\u0223\u0224\7\34\2\2\u0224"+
		"W\3\2\2\2\u0225\u0226\7>\2\2\u0226Y\3\2\2\2\u0227\u0228\7?\2\2\u0228["+
		"\3\2\2\2\u0229\u022a\7@\2\2\u022a]\3\2\2\2\u022b\u022c\7\17\2\2\u022c"+
		"_\3\2\2\2\u022d\u022e\7\16\2\2\u022ea\3\2\2\2Aekot|\u008a\u0092\u0098"+
		"\u009e\u00ac\u00b2\u00b7\u00be\u00c6\u00cc\u00cf\u00d8\u00de\u00e1\u00e6"+
		"\u00f0\u00f2\u00fa\u00fd\u0106\u0110\u011c\u0137\u013d\u0143\u014d\u014f"+
		"\u0153\u0158\u015f\u016a\u0170\u0178\u017f\u0183\u0187\u018a\u018e\u0192"+
		"\u0196\u019a\u019e\u01a2\u01a5\u01a8\u01ac\u01b6\u01bb\u01c3\u01c8\u01cb"+
		"\u01d0\u01e5\u01ef\u0204\u020c\u020e\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}