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
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_templateDeclaration = 3, RULE_templateList = 4, RULE_classMemberDeclaration = 5, 
		RULE_methodDeclaration = 6, RULE_fieldDeclaration = 7, RULE_parameterList = 8, 
		RULE_parameter = 9, RULE_constructorDeclaration = 10, RULE_methodBody = 11, 
		RULE_variableDeclaration = 12, RULE_statement = 13, RULE_statementWithScope = 14, 
		RULE_assignmentExpression = 15, RULE_typeCast = 16, RULE_braceEnclosedInitializer = 17, 
		RULE_newDeclaration = 18, RULE_expression = 19, RULE_fnArrMember = 20, 
		RULE_memberRefz = 21, RULE_expressionz = 22, RULE_assignmentOperation = 23, 
		RULE_booleanOperation = 24, RULE_mathOperation = 25, RULE_invokeOperator = 26, 
		RULE_arrayOperator = 27, RULE_argumentList = 28, RULE_modifier = 29, RULE_type = 30, 
		RULE_templatePlaceHolder = 31, RULE_className = 32, RULE_name = 33, RULE_stringLiteral = 34, 
		RULE_characterLiteral = 35, RULE_numericLiteral = 36, RULE_booleanLiteral = 37, 
		RULE_specialLiteral = 38;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "classDeclaration", "templateDeclaration", 
		"templateList", "classMemberDeclaration", "methodDeclaration", "fieldDeclaration", 
		"parameterList", "parameter", "constructorDeclaration", "methodBody", 
		"variableDeclaration", "statement", "statementWithScope", "assignmentExpression", 
		"typeCast", "braceEnclosedInitializer", "newDeclaration", "expression", 
		"fnArrMember", "memberRefz", "expressionz", "assignmentOperation", "booleanOperation", 
		"mathOperation", "invokeOperator", "arrayOperator", "argumentList", "modifier", 
		"type", "templatePlaceHolder", "className", "name", "stringLiteral", "characterLiteral", 
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
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CclGrammarParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(CclGrammarParser.MAIN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(78);
				importDeclaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					classDeclaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(90);
				modifier();
				setState(91);
				match(PRIMITIVE_TYPE);
				setState(92);
				match(MAIN);
				setState(93);
				match(T__0);
				setState(94);
				match(T__1);
				setState(95);
				methodBody();
				}
				break;
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==CLASS) {
				{
				{
				setState(99);
				classDeclaration();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IMPORT);
			setState(108);
			match(IDENTIFIER);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(109);
				match(T__2);
				setState(110);
				match(IDENTIFIER);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(118);
				modifier();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(CLASS);
			setState(125);
			className();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(126);
				templateDeclaration();
				}
			}

			setState(129);
			match(T__4);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PRIMITIVE_TYPE) | (1L << MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(130);
				classMemberDeclaration();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		enterRule(_localctx, 6, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__0);
			setState(139);
			templateList();
			setState(140);
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
		enterRule(_localctx, 8, RULE_templateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			templatePlaceHolder();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(143);
				match(T__6);
				setState(144);
				templatePlaceHolder();
				}
				}
				setState(149);
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
		enterRule(_localctx, 10, RULE_classMemberDeclaration);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
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
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
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
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(155);
				modifier();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(161);
				templateDeclaration();
				}
			}

			setState(164);
			type();
			setState(165);
			name();
			setState(166);
			match(T__0);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(167);
				parameterList();
				}
			}

			setState(170);
			match(T__1);
			setState(171);
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
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(173);
				modifier();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			type();
			setState(180);
			name();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(181);
				arrayOperator();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(184);
				match(ASSIGN);
				setState(185);
				assignmentExpression();
				}
			}

			setState(188);
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
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			parameter();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(191);
				match(T__6);
				setState(192);
				parameter();
				}
				}
				setState(197);
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
		enterRule(_localctx, 18, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			type();
			setState(199);
			name();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(200);
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
		enterRule(_localctx, 20, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(203);
				modifier();
				}
			}

			setState(206);
			className();
			setState(207);
			match(T__0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(208);
				parameterList();
				}
			}

			setState(211);
			match(T__1);
			setState(212);
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
		enterRule(_localctx, 22, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__4);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(215);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(216);
					statement();
					}
					break;
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			type();
			setState(225);
			name();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(226);
				arrayOperator();
				}
			}

			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(229);
				match(ASSIGN);
				setState(230);
				assignmentExpression();
				}
			}

			setState(233);
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
		enterRule(_localctx, 26, RULE_statement);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IF);
				setState(236);
				match(T__0);
				setState(237);
				expression(0);
				setState(238);
				match(T__1);
				setState(239);
				statement();
				setState(242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(240);
					match(ELSE);
					setState(241);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(WHILE);
				setState(245);
				match(T__0);
				setState(246);
				expression(0);
				setState(247);
				match(T__1);
				setState(248);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(RETURN);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(251);
					expression(0);
					}
				}

				setState(254);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(PRINT);
				setState(256);
				match(T__0);
				setState(257);
				expression(0);
				setState(258);
				match(T__1);
				setState(259);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(READ);
				setState(262);
				invokeOperator();
				setState(263);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(SPAWN);
				setState(266);
				expression(0);
				setState(267);
				match(SET);
				setState(268);
				name();
				setState(269);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(BLOCK);
				setState(272);
				invokeOperator();
				setState(273);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				match(LOCK);
				setState(276);
				name();
				setState(277);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				match(UNLOCK);
				setState(280);
				name();
				setState(281);
				match(T__3);
				}
				break;
			case T__4:
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
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
				setState(284);
				expression(0);
				setState(285);
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
		enterRule(_localctx, 28, RULE_statementWithScope);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(FOR);
				setState(290);
				match(T__0);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(291);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(292);
					expression(0);
					setState(293);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(295);
					match(T__3);
					}
					break;
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(298);
					expression(0);
					}
				}

				setState(301);
				match(T__3);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(302);
					expression(0);
					}
				}

				setState(305);
				match(T__1);
				setState(306);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__4);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << PRIMITIVE_TYPE) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(308);
						statement();
						}
						break;
					case 2:
						{
						setState(309);
						variableDeclaration();
						}
						break;
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
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
		enterRule(_localctx, 30, RULE_assignmentExpression);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(NEW);
				setState(319);
				type();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(320);
					templateDeclaration();
					}
					break;
				}
				setState(323);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				typeCast();
				setState(326);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				braceEnclosedInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
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
		enterRule(_localctx, 32, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__0);
			setState(333);
			match(PRIMITIVE_TYPE);
			setState(334);
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
		enterRule(_localctx, 34, RULE_braceEnclosedInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__4);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(337);
				argumentList();
				}
			}

			setState(340);
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
		enterRule(_localctx, 36, RULE_newDeclaration);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__0);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(343);
					argumentList();
					}
				}

				setState(346);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__7);
				setState(348);
				expression(0);
				setState(349);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(354);
				match(T__0);
				setState(355);
				expression(0);
				setState(356);
				match(T__1);
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(357);
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
				setState(360);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(361);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(364);
				match(THIS);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(365);
					memberRefz();
					}
					break;
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(368);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(371);
				numericLiteral();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(372);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITERAL:
				{
				setState(375);
				characterLiteral();
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(376);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(379);
				stringLiteral();
				}
				break;
			case BOOLEAN_LITERAL:
				{
				setState(380);
				booleanLiteral();
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(381);
					expressionz();
					}
					break;
				}
				}
				break;
			case SPECIAL_LITERAL:
				{
				setState(384);
				specialLiteral();
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(385);
					expressionz();
					}
					break;
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(388);
				name();
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(389);
					fnArrMember();
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(392);
					memberRefz();
					}
					break;
				}
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(395);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(398);
				match(NOT);
				setState(399);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(402);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(403);
					match(QUESTION);
					setState(404);
					expression(0);
					setState(405);
					match(COLON);
					setState(406);
					expression(3);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 40, RULE_fnArrMember);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__0);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SPECIAL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(414);
					argumentList();
					}
				}

				setState(417);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__7);
				setState(419);
				expression(0);
				setState(420);
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
		enterRule(_localctx, 42, RULE_memberRefz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__2);
			setState(425);
			name();
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(426);
				fnArrMember();
				}
				break;
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(429);
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
		enterRule(_localctx, 44, RULE_expressionz);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
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
				setState(433);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
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
		enterRule(_localctx, 46, RULE_assignmentOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ASSIGN);
			setState(438);
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
		enterRule(_localctx, 48, RULE_booleanOperation);
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(AND);
				setState(441);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(OR);
				setState(443);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(EQUALS);
				setState(445);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(NOT_EQ);
				setState(447);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(LESS_EQ);
				setState(449);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(GREAT_EQ);
				setState(451);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				match(LESS);
				setState(453);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				match(GREATER);
				setState(455);
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
		enterRule(_localctx, 50, RULE_mathOperation);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(PLUS);
				setState(459);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(MINUS);
				setState(461);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(MULTI);
				setState(463);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(DIV);
				setState(465);
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
		enterRule(_localctx, 52, RULE_invokeOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__0);
			setState(469);
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
		enterRule(_localctx, 54, RULE_arrayOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__7);
			setState(472);
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
		enterRule(_localctx, 56, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			expression(0);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(475);
				match(T__6);
				setState(476);
				expression(0);
				}
				}
				setState(481);
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
		enterRule(_localctx, 58, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 60, RULE_type);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
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
		enterRule(_localctx, 62, RULE_templatePlaceHolder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
		enterRule(_localctx, 64, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 66, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 68, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 70, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 72, RULE_numericLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
		enterRule(_localctx, 74, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 76, RULE_specialLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u01fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d"+
		"\n\2\3\2\7\2g\n\2\f\2\16\2j\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3r\n\3\f\3"+
		"\16\3u\13\3\3\3\3\3\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\5\4\u0082"+
		"\n\4\3\4\3\4\7\4\u0086\n\4\f\4\16\4\u0089\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\7\3\7\3\7\5\7\u009c\n"+
		"\7\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\b\5\b\u00a5\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00ab\n\b\3\b\3\b\3\b\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3"+
		"\t\3\t\3\t\5\t\u00b9\n\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\n\3\n\3\n\7\n"+
		"\u00c4\n\n\f\n\16\n\u00c7\13\n\3\13\3\13\3\13\5\13\u00cc\n\13\3\f\5\f"+
		"\u00cf\n\f\3\f\3\f\3\f\5\f\u00d4\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00dc"+
		"\n\r\f\r\16\r\u00df\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u00e6\n\16\3\16\3"+
		"\16\5\16\u00ea\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00f5\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ff\n\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0122\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u012b\n\20\3\20\5\20\u012e\n\20\3\20\3\20\5\20\u0132\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0139\n\20\f\20\16\20\u013c\13\20\3\20\5"+
		"\20\u013f\n\20\3\21\3\21\3\21\5\21\u0144\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u014d\n\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u0155\n"+
		"\23\3\23\3\23\3\24\3\24\5\24\u015b\n\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0162\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0169\n\25\3\25\3\25\5\25\u016d"+
		"\n\25\3\25\3\25\5\25\u0171\n\25\3\25\5\25\u0174\n\25\3\25\3\25\5\25\u0178"+
		"\n\25\3\25\3\25\5\25\u017c\n\25\3\25\3\25\3\25\5\25\u0181\n\25\3\25\3"+
		"\25\5\25\u0185\n\25\3\25\3\25\5\25\u0189\n\25\3\25\5\25\u018c\n\25\3\25"+
		"\5\25\u018f\n\25\3\25\3\25\5\25\u0193\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u019b\n\25\f\25\16\25\u019e\13\25\3\26\3\26\5\26\u01a2\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u01a9\n\26\3\27\3\27\3\27\5\27\u01ae\n\27"+
		"\3\27\5\27\u01b1\n\27\3\30\3\30\3\30\5\30\u01b6\n\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u01cb\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01d5\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01e0\n"+
		"\36\f\36\16\36\u01e3\13\36\3\37\3\37\3 \3 \5 \u01e9\n \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\2\3()\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\3\3\2\31\33\2\u022d"+
		"\2S\3\2\2\2\4m\3\2\2\2\6{\3\2\2\2\b\u008c\3\2\2\2\n\u0090\3\2\2\2\f\u009b"+
		"\3\2\2\2\16\u00a0\3\2\2\2\20\u00b2\3\2\2\2\22\u00c0\3\2\2\2\24\u00c8\3"+
		"\2\2\2\26\u00ce\3\2\2\2\30\u00d8\3\2\2\2\32\u00e2\3\2\2\2\34\u0121\3\2"+
		"\2\2\36\u013e\3\2\2\2 \u014c\3\2\2\2\"\u014e\3\2\2\2$\u0152\3\2\2\2&\u0161"+
		"\3\2\2\2(\u0192\3\2\2\2*\u01a8\3\2\2\2,\u01aa\3\2\2\2.\u01b5\3\2\2\2\60"+
		"\u01b7\3\2\2\2\62\u01ca\3\2\2\2\64\u01d4\3\2\2\2\66\u01d6\3\2\2\28\u01d9"+
		"\3\2\2\2:\u01dc\3\2\2\2<\u01e4\3\2\2\2>\u01e8\3\2\2\2@\u01ea\3\2\2\2B"+
		"\u01ec\3\2\2\2D\u01ee\3\2\2\2F\u01f0\3\2\2\2H\u01f2\3\2\2\2J\u01f4\3\2"+
		"\2\2L\u01f6\3\2\2\2N\u01f8\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\6\4\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Zc\3\2\2\2[Y\3\2\2\2\\]\5<\37\2]^\7\f\2\2^_\7,\2\2_`\7\3"+
		"\2\2`a\7\4\2\2ab\5\30\r\2bd\3\2\2\2c\\\3\2\2\2cd\3\2\2\2dh\3\2\2\2eg\5"+
		"\6\4\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7"+
		"\2\2\3l\3\3\2\2\2mn\7*\2\2ns\7=\2\2op\7\5\2\2pr\7=\2\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\6\2\2w\5\3\2\2\2xz\5"+
		"<\37\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177"+
		"\7+\2\2\177\u0081\5B\"\2\u0080\u0082\5\b\5\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\7\7\2\2\u0084\u0086\5\f"+
		"\7\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\b"+
		"\2\2\u008b\7\3\2\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\n\6\2\u008e\u008f"+
		"\7\4\2\2\u008f\t\3\2\2\2\u0090\u0095\5@!\2\u0091\u0092\7\t\2\2\u0092\u0094"+
		"\5@!\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\13\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\5\16\b"+
		"\2\u0099\u009c\5\20\t\2\u009a\u009c\5\26\f\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\r\3\2\2\2\u009d\u009f\5<\37\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\b\5\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5>"+
		" \2\u00a7\u00a8\5D#\2\u00a8\u00aa\7\3\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a9"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00ae\5\30\r\2\u00ae\17\3\2\2\2\u00af\u00b1\5<\37\2\u00b0\u00af\3\2\2"+
		"\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5> \2\u00b6\u00b8\5D#\2\u00b7"+
		"\u00b9\58\35\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00bb\7:\2\2\u00bb\u00bd\5 \21\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\6\2\2\u00bf\21\3\2\2"+
		"\2\u00c0\u00c5\5\24\13\2\u00c1\u00c2\7\t\2\2\u00c2\u00c4\5\24\13\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\23\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5> \2\u00c9\u00cb"+
		"\5D#\2\u00ca\u00cc\58\35\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\25\3\2\2\2\u00cd\u00cf\5<\37\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5B\"\2\u00d1\u00d3\7\3\2\2\u00d2\u00d4"+
		"\5\22\n\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d6\7\4\2\2\u00d6\u00d7\5\30\r\2\u00d7\27\3\2\2\2\u00d8\u00dd"+
		"\7\7\2\2\u00d9\u00dc\5\32\16\2\u00da\u00dc\5\34\17\2\u00db\u00d9\3\2\2"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e3\5> \2\u00e3\u00e5\5D#\2\u00e4\u00e6\58\35\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\7:"+
		"\2\2\u00e8\u00ea\5 \21\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\7\6\2\2\u00ec\33\3\2\2\2\u00ed\u00ee\7\35\2"+
		"\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0\5(\25\2\u00f0\u00f1\7\4\2\2\u00f1\u00f4"+
		"\5\34\17\2\u00f2\u00f3\7\36\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0122\3\2\2\2\u00f6\u00f7\7\37\2\2\u00f7"+
		"\u00f8\7\3\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\5\34"+
		"\17\2\u00fb\u0122\3\2\2\2\u00fc\u00fe\7\"\2\2\u00fd\u00ff\5(\25\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0122\7\6"+
		"\2\2\u0101\u0102\7#\2\2\u0102\u0103\7\3\2\2\u0103\u0104\5(\25\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0106\7\6\2\2\u0106\u0122\3\2\2\2\u0107\u0108\7$"+
		"\2\2\u0108\u0109\5\66\34\2\u0109\u010a\7\6\2\2\u010a\u0122\3\2\2\2\u010b"+
		"\u010c\7%\2\2\u010c\u010d\5(\25\2\u010d\u010e\7&\2\2\u010e\u010f\5D#\2"+
		"\u010f\u0110\7\6\2\2\u0110\u0122\3\2\2\2\u0111\u0112\7\'\2\2\u0112\u0113"+
		"\5\66\34\2\u0113\u0114\7\6\2\2\u0114\u0122\3\2\2\2\u0115\u0116\7(\2\2"+
		"\u0116\u0117\5D#\2\u0117\u0118\7\6\2\2\u0118\u0122\3\2\2\2\u0119\u011a"+
		"\7)\2\2\u011a\u011b\5D#\2\u011b\u011c\7\6\2\2\u011c\u0122\3\2\2\2\u011d"+
		"\u0122\5\36\20\2\u011e\u011f\5(\25\2\u011f\u0120\7\6\2\2\u0120\u0122\3"+
		"\2\2\2\u0121\u00ed\3\2\2\2\u0121\u00f6\3\2\2\2\u0121\u00fc\3\2\2\2\u0121"+
		"\u0101\3\2\2\2\u0121\u0107\3\2\2\2\u0121\u010b\3\2\2\2\u0121\u0111\3\2"+
		"\2\2\u0121\u0115\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011d\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0122\35\3\2\2\2\u0123\u0124\7 \2\2\u0124\u012a\7\3\2\2"+
		"\u0125\u012b\5\32\16\2\u0126\u0127\5(\25\2\u0127\u0128\7\6\2\2\u0128\u012b"+
		"\3\2\2\2\u0129\u012b\7\6\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\5(\25\2\u012d\u012c\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\7\6\2\2\u0130"+
		"\u0132\5(\25\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\7\4\2\2\u0134\u013f\5\34\17\2\u0135\u013a\7\7\2\2\u0136"+
		"\u0139\5\34\17\2\u0137\u0139\5\32\16\2\u0138\u0136\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7\b\2\2\u013e\u0123\3\2"+
		"\2\2\u013e\u0135\3\2\2\2\u013f\37\3\2\2\2\u0140\u0141\7!\2\2\u0141\u0143"+
		"\5> \2\u0142\u0144\5\b\5\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\5&\24\2\u0146\u014d\3\2\2\2\u0147\u0148\5\""+
		"\22\2\u0148\u0149\5(\25\2\u0149\u014d\3\2\2\2\u014a\u014d\5$\23\2\u014b"+
		"\u014d\5(\25\2\u014c\u0140\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014b\3\2\2\2\u014d!\3\2\2\2\u014e\u014f\7\3\2\2\u014f\u0150"+
		"\7\f\2\2\u0150\u0151\7\4\2\2\u0151#\3\2\2\2\u0152\u0154\7\7\2\2\u0153"+
		"\u0155\5:\36\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\7\b\2\2\u0157%\3\2\2\2\u0158\u015a\7\3\2\2\u0159\u015b"+
		"\5:\36\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0162\7\4\2\2\u015d\u015e\7\n\2\2\u015e\u015f\5(\25\2\u015f\u0160\7\13"+
		"\2\2\u0160\u0162\3\2\2\2\u0161\u0158\3\2\2\2\u0161\u015d\3\2\2\2\u0162"+
		"\'\3\2\2\2\u0163\u0164\b\25\1\2\u0164\u0165\7\3\2\2\u0165\u0166\5(\25"+
		"\2\u0166\u0168\7\4\2\2\u0167\u0169\5.\30\2\u0168\u0167\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0193\3\2\2\2\u016a\u016c\t\2\2\2\u016b\u016d\5.\30\2\u016c"+
		"\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0193\3\2\2\2\u016e\u0170\7\34"+
		"\2\2\u016f\u0171\5,\27\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0174\5.\30\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0193\3\2\2\2\u0175\u0177\5J&\2\u0176\u0178\5.\30\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0193\3\2\2\2\u0179\u017b\5H%\2\u017a"+
		"\u017c\5.\30\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0193\3\2"+
		"\2\2\u017d\u0193\5F$\2\u017e\u0180\5L\'\2\u017f\u0181\5.\30\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0193\3\2\2\2\u0182\u0184\5N(\2\u0183"+
		"\u0185\5.\30\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0193\3\2"+
		"\2\2\u0186\u0188\5D#\2\u0187\u0189\5*\26\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\5,\27\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\5.\30\2\u018e\u018d\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0193\3\2\2\2\u0190\u0191\7.\2\2\u0191"+
		"\u0193\5(\25\3\u0192\u0163\3\2\2\2\u0192\u016a\3\2\2\2\u0192\u016e\3\2"+
		"\2\2\u0192\u0175\3\2\2\2\u0192\u0179\3\2\2\2\u0192\u017d\3\2\2\2\u0192"+
		"\u017e\3\2\2\2\u0192\u0182\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0193\u019c\3\2\2\2\u0194\u0195\f\4\2\2\u0195\u0196\7;\2\2\u0196"+
		"\u0197\5(\25\2\u0197\u0198\7<\2\2\u0198\u0199\5(\25\5\u0199\u019b\3\2"+
		"\2\2\u019a\u0194\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d)\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\7\3\2\2"+
		"\u01a0\u01a2\5:\36\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a9\7\4\2\2\u01a4\u01a5\7\n\2\2\u01a5\u01a6\5(\25\2\u01a6"+
		"\u01a7\7\13\2\2\u01a7\u01a9\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a4\3"+
		"\2\2\2\u01a9+\3\2\2\2\u01aa\u01ab\7\5\2\2\u01ab\u01ad\5D#\2\u01ac\u01ae"+
		"\5*\26\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u01b1\5,\27\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1-\3\2\2\2"+
		"\u01b2\u01b6\5\60\31\2\u01b3\u01b6\5\62\32\2\u01b4\u01b6\5\64\33\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6/\3\2\2\2"+
		"\u01b7\u01b8\7:\2\2\u01b8\u01b9\5 \21\2\u01b9\61\3\2\2\2\u01ba\u01bb\7"+
		"/\2\2\u01bb\u01cb\5(\25\2\u01bc\u01bd\7\60\2\2\u01bd\u01cb\5(\25\2\u01be"+
		"\u01bf\7\65\2\2\u01bf\u01cb\5(\25\2\u01c0\u01c1\7-\2\2\u01c1\u01cb\5("+
		"\25\2\u01c2\u01c3\7\66\2\2\u01c3\u01cb\5(\25\2\u01c4\u01c5\7\67\2\2\u01c5"+
		"\u01cb\5(\25\2\u01c6\u01c7\78\2\2\u01c7\u01cb\5(\25\2\u01c8\u01c9\79\2"+
		"\2\u01c9\u01cb\5(\25\2\u01ca\u01ba\3\2\2\2\u01ca\u01bc\3\2\2\2\u01ca\u01be"+
		"\3\2\2\2\u01ca\u01c0\3\2\2\2\u01ca\u01c2\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca"+
		"\u01c6\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\63\3\2\2\2\u01cc\u01cd\7\61\2"+
		"\2\u01cd\u01d5\5(\25\2\u01ce\u01cf\7\62\2\2\u01cf\u01d5\5(\25\2\u01d0"+
		"\u01d1\7\63\2\2\u01d1\u01d5\5(\25\2\u01d2\u01d3\7\64\2\2\u01d3\u01d5\5"+
		"(\25\2\u01d4\u01cc\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\65\3\2\2\2\u01d6\u01d7\7\3\2\2\u01d7\u01d8\7\4\2"+
		"\2\u01d8\67\3\2\2\2\u01d9\u01da\7\n\2\2\u01da\u01db\7\13\2\2\u01db9\3"+
		"\2\2\2\u01dc\u01e1\5(\25\2\u01dd\u01de\7\t\2\2\u01de\u01e0\5(\25\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2;\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7\r\2\2\u01e5=\3\2"+
		"\2\2\u01e6\u01e9\7\f\2\2\u01e7\u01e9\5B\"\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9?\3\2\2\2\u01ea\u01eb\7=\2\2\u01ebA\3\2\2\2\u01ec"+
		"\u01ed\7=\2\2\u01edC\3\2\2\2\u01ee\u01ef\7=\2\2\u01efE\3\2\2\2\u01f0\u01f1"+
		"\7>\2\2\u01f1G\3\2\2\2\u01f2\u01f3\7?\2\2\u01f3I\3\2\2\2\u01f4\u01f5\7"+
		"@\2\2\u01f5K\3\2\2\2\u01f6\u01f7\7\17\2\2\u01f7M\3\2\2\2\u01f8\u01f9\7"+
		"\16\2\2\u01f9O\3\2\2\2>SYchs{\u0081\u0087\u0095\u009b\u00a0\u00a4\u00aa"+
		"\u00b2\u00b8\u00bc\u00c5\u00cb\u00ce\u00d3\u00db\u00dd\u00e5\u00e9\u00f4"+
		"\u00fe\u0121\u012a\u012d\u0131\u0138\u013a\u013e\u0143\u014c\u0154\u015a"+
		"\u0161\u0168\u016c\u0170\u0173\u0177\u017b\u0180\u0184\u0188\u018b\u018e"+
		"\u0192\u019c\u01a1\u01a8\u01ad\u01b0\u01b5\u01ca\u01d4\u01e1\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}