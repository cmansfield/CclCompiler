// Generated from C:/Users/Chris/Documents/MyProjects/CclCompiler/src/main/java/io/github/cmansfield/parser/language\CclGrammar.g4 by ANTLR 4.7
package io.github.cmansfield.parser.language;
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
		IDENTIFIER=48, STRING_LITERAL=49, CHARACTER_LITERAL=50, NUMERIC_LITERAL=51, 
		NUMBER=52, WHITESPACE=53, NEWLINE=54, LINE_COMMENT=55, MULTILINE_COMMENT=56;
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
		RULE_className = 31, RULE_name = 32, RULE_stringliteral = 33, RULE_characterliteral = 34, 
		RULE_numericliteral = 35;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "classDeclaration", "templateDeclaration", 
		"templateList", "classMemberDeclaration", "methodDeclaration", "fieldDeclaration", 
		"parameterList", "parameter", "constructorDeclaration", "methodBody", 
		"variableDeclaration", "statement", "statementWithScope", "assignmentExpression", 
		"typeCast", "braceEnclosedInitializer", "newDeclaration", "expression", 
		"fnArrMember", "memberRefz", "expressionz", "assignmentOperation", "booleanOperation", 
		"mathOperation", "invokeOperator", "arrayOperator", "argumentList", "modifier", 
		"type", "className", "name", "stringliteral", "characterliteral", "numericliteral"
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
		"COLON", "MODIFIER", "PRIMITIVE_TYPE", "IDENTIFIER", "STRING_LITERAL", 
		"CHARACTER_LITERAL", "NUMERIC_LITERAL", "NUMBER", "WHITESPACE", "NEWLINE", 
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(72);
				importDeclaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					classDeclaration();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84);
				modifier();
				setState(85);
				match(PRIMITIVE_TYPE);
				setState(86);
				match(MAIN);
				setState(87);
				match(T__0);
				setState(88);
				match(T__1);
				setState(89);
				methodBody();
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==MODIFIER) {
				{
				{
				setState(93);
				classDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
			setState(101);
			match(IMPORT);
			setState(102);
			match(IDENTIFIER);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(103);
				match(T__2);
				setState(104);
				match(IDENTIFIER);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(112);
				modifier();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(CLASS);
			setState(119);
			className();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(120);
				templateDeclaration();
				}
			}

			setState(123);
			match(T__4);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << MODIFIER) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(124);
				classMemberDeclaration();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(132);
			match(T__0);
			setState(133);
			templateList();
			setState(134);
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
			setState(136);
			match(IDENTIFIER);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(137);
				match(T__6);
				setState(138);
				match(IDENTIFIER);
				}
				}
				setState(143);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
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
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(149);
				modifier();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(155);
				templateDeclaration();
				}
			}

			setState(158);
			type();
			setState(159);
			name();
			setState(160);
			match(T__0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(161);
				parameterList();
				}
			}

			setState(164);
			match(T__1);
			setState(165);
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
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(167);
				modifier();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			type();
			setState(174);
			name();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(175);
				arrayOperator();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(178);
				match(ASSIGN);
				setState(179);
				assignmentExpression();
				}
			}

			setState(182);
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
			setState(184);
			parameter();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(185);
				match(T__6);
				setState(186);
				parameter();
				}
				}
				setState(191);
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
			setState(192);
			type();
			setState(193);
			name();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(194);
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(197);
				modifier();
				}
			}

			setState(200);
			className();
			setState(201);
			match(T__0);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==IDENTIFIER) {
				{
				setState(202);
				parameterList();
				}
			}

			setState(205);
			match(T__1);
			setState(206);
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
			setState(208);
			match(T__4);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(209);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(210);
					statement();
					}
					break;
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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
			setState(218);
			type();
			setState(219);
			name();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(220);
				arrayOperator();
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(223);
				match(ASSIGN);
				setState(224);
				assignmentExpression();
				}
			}

			setState(227);
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(IF);
				setState(230);
				match(T__0);
				setState(231);
				expression(0);
				setState(232);
				match(T__1);
				setState(233);
				statement();
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(234);
					match(ELSE);
					setState(235);
					statement();
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(WHILE);
				setState(239);
				match(T__0);
				setState(240);
				expression(0);
				setState(241);
				match(T__1);
				setState(242);
				statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(RETURN);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(245);
					expression(0);
					}
				}

				setState(248);
				match(T__3);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(PRINT);
				setState(250);
				match(T__0);
				setState(251);
				expression(0);
				setState(252);
				match(T__1);
				setState(253);
				match(T__3);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(READ);
				setState(256);
				invokeOperator();
				setState(257);
				match(T__3);
				}
				break;
			case SPAWN:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(SPAWN);
				setState(260);
				expression(0);
				setState(261);
				match(SET);
				setState(262);
				name();
				setState(263);
				match(T__3);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				match(BLOCK);
				setState(266);
				invokeOperator();
				setState(267);
				match(T__3);
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				match(LOCK);
				setState(270);
				name();
				setState(271);
				match(T__3);
				}
				break;
			case UNLOCK:
				enterOuterAlt(_localctx, 9);
				{
				setState(273);
				match(UNLOCK);
				setState(274);
				name();
				setState(275);
				match(T__3);
				}
				break;
			case T__4:
			case FOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
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
			case STRING_LITERAL:
			case CHARACTER_LITERAL:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(278);
				expression(0);
				setState(279);
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(FOR);
				setState(284);
				match(T__0);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(285);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(286);
					expression(0);
					setState(287);
					match(T__3);
					}
					break;
				case 3:
					{
					setState(289);
					match(T__3);
					}
					break;
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(292);
					expression(0);
					}
				}

				setState(295);
				match(T__3);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(296);
					expression(0);
					}
				}

				setState(299);
				match(T__1);
				setState(300);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__4);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << SPAWN) | (1L << BLOCK) | (1L << LOCK) | (1L << UNLOCK) | (1L << NOT) | (1L << PRIMITIVE_TYPE) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(302);
						statement();
						}
						break;
					case 2:
						{
						setState(303);
						variableDeclaration();
						}
						break;
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(309);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(NEW);
				setState(313);
				type();
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(314);
					templateDeclaration();
					}
					break;
				}
				setState(317);
				newDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				typeCast();
				setState(320);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				braceEnclosedInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
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
			setState(326);
			match(T__0);
			setState(327);
			match(PRIMITIVE_TYPE);
			setState(328);
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
			setState(330);
			match(T__4);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
				{
				setState(331);
				argumentList();
				}
			}

			setState(334);
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
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__0);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(337);
					argumentList();
					}
				}

				setState(340);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__7);
				setState(342);
				expression(0);
				setState(343);
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
		public NumericliteralContext numericliteral() {
			return getRuleContext(NumericliteralContext.class,0);
		}
		public CharacterliteralContext characterliteral() {
			return getRuleContext(CharacterliteralContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
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
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(348);
				match(T__0);
				setState(349);
				expression(0);
				setState(350);
				match(T__1);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(351);
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
				setState(354);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NULL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(355);
					expressionz();
					}
					break;
				}
				}
				break;
			case THIS:
				{
				setState(358);
				match(THIS);
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(359);
					memberRefz();
					}
					break;
				}
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(362);
					expressionz();
					}
					break;
				}
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(365);
				numericliteral();
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(366);
					expressionz();
					}
					break;
				}
				}
				break;
			case CHARACTER_LITERAL:
				{
				setState(369);
				characterliteral();
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(370);
					expressionz();
					}
					break;
				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(373);
				stringliteral();
				}
				break;
			case IDENTIFIER:
				{
				setState(374);
				name();
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(375);
					fnArrMember();
					}
					break;
				}
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(378);
					memberRefz();
					}
					break;
				}
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(381);
					expressionz();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(384);
				match(NOT);
				setState(385);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(388);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(389);
					match(QUESTION);
					setState(390);
					expression(0);
					setState(391);
					match(COLON);
					setState(392);
					expression(3);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(T__0);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << THIS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STRING_LITERAL) | (1L << CHARACTER_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) {
					{
					setState(400);
					argumentList();
					}
				}

				setState(403);
				match(T__1);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__7);
				setState(405);
				expression(0);
				setState(406);
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
			setState(410);
			match(T__2);
			setState(411);
			name();
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(412);
				fnArrMember();
				}
				break;
			}
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(415);
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
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
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
				setState(419);
				booleanOperation();
				}
				break;
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
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
			setState(423);
			match(ASSIGN);
			setState(424);
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
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(AND);
				setState(427);
				expression(0);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(OR);
				setState(429);
				expression(0);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(EQUALS);
				setState(431);
				expression(0);
				}
				break;
			case NOT_EQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(NOT_EQ);
				setState(433);
				expression(0);
				}
				break;
			case LESS_EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(LESS_EQ);
				setState(435);
				expression(0);
				}
				break;
			case GREAT_EQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(GREAT_EQ);
				setState(437);
				expression(0);
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 7);
				{
				setState(438);
				match(LESS);
				setState(439);
				expression(0);
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 8);
				{
				setState(440);
				match(GREATER);
				setState(441);
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
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(PLUS);
				setState(445);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(MINUS);
				setState(447);
				expression(0);
				}
				break;
			case MULTI:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(MULTI);
				setState(449);
				expression(0);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				match(DIV);
				setState(451);
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
			setState(454);
			match(T__0);
			setState(455);
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
			setState(457);
			match(T__7);
			setState(458);
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
			setState(460);
			expression(0);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(461);
				match(T__6);
				setState(462);
				expression(0);
				}
				}
				setState(467);
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
			setState(468);
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
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(PRIMITIVE_TYPE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
		enterRule(_localctx, 64, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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

	public static class StringliteralContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CclGrammarParser.STRING_LITERAL, 0); }
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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

	public static class CharacterliteralContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(CclGrammarParser.CHARACTER_LITERAL, 0); }
		public CharacterliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitCharacterliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterliteralContext characterliteral() throws RecognitionException {
		CharacterliteralContext _localctx = new CharacterliteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_characterliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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

	public static class NumericliteralContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CclGrammarParser.NUMERIC_LITERAL, 0); }
		public NumericliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CclGrammarVisitor ) return ((CclGrammarVisitor<? extends T>)visitor).visitNumericliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericliteralContext numericliteral() throws RecognitionException {
		NumericliteralContext _localctx = new NumericliteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numericliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2^\n\2\3\2\7\2a\n\2\f\2"+
		"\16\2d\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\3\3\3"+
		"\4\7\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\4\5\4|\n\4\3\4\3\4\7\4\u0080\n\4"+
		"\f\4\16\4\u0083\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u008e\n\6"+
		"\f\6\16\6\u0091\13\6\3\7\3\7\3\7\5\7\u0096\n\7\3\b\7\b\u0099\n\b\f\b\16"+
		"\b\u009c\13\b\3\b\5\b\u009f\n\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\b\3\b"+
		"\3\b\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\3\t\5\t\u00b3\n\t\3"+
		"\t\3\t\5\t\u00b7\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00be\n\n\f\n\16\n\u00c1"+
		"\13\n\3\13\3\13\3\13\5\13\u00c6\n\13\3\f\5\f\u00c9\n\f\3\f\3\f\3\f\5\f"+
		"\u00ce\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u00e0\n\16\3\16\3\16\5\16\u00e4\n\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u011c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0125\n\20\3\20\5"+
		"\20\u0128\n\20\3\20\3\20\5\20\u012c\n\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0133\n\20\f\20\16\20\u0136\13\20\3\20\5\20\u0139\n\20\3\21\3\21\3\21"+
		"\5\21\u013e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\5\23\u014f\n\23\3\23\3\23\3\24\3\24\5\24"+
		"\u0155\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u015c\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0163\n\25\3\25\3\25\5\25\u0167\n\25\3\25\3\25\5\25\u016b"+
		"\n\25\3\25\5\25\u016e\n\25\3\25\3\25\5\25\u0172\n\25\3\25\3\25\5\25\u0176"+
		"\n\25\3\25\3\25\3\25\5\25\u017b\n\25\3\25\5\25\u017e\n\25\3\25\5\25\u0181"+
		"\n\25\3\25\3\25\5\25\u0185\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u018d"+
		"\n\25\f\25\16\25\u0190\13\25\3\26\3\26\5\26\u0194\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u019b\n\26\3\27\3\27\3\27\5\27\u01a0\n\27\3\27\5\27\u01a3"+
		"\n\27\3\30\3\30\3\30\5\30\u01a8\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01bd"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c7\n\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u01d2\n\36\f\36\16\36\u01d5\13"+
		"\36\3\37\3\37\3 \3 \5 \u01db\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\2\3"+
		"(&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FH\2\3\3\2\f\16\2\u0218\2M\3\2\2\2\4g\3\2\2\2\6u\3\2\2\2\b\u0086\3\2\2"+
		"\2\n\u008a\3\2\2\2\f\u0095\3\2\2\2\16\u009a\3\2\2\2\20\u00ac\3\2\2\2\22"+
		"\u00ba\3\2\2\2\24\u00c2\3\2\2\2\26\u00c8\3\2\2\2\30\u00d2\3\2\2\2\32\u00dc"+
		"\3\2\2\2\34\u011b\3\2\2\2\36\u0138\3\2\2\2 \u0146\3\2\2\2\"\u0148\3\2"+
		"\2\2$\u014c\3\2\2\2&\u015b\3\2\2\2(\u0184\3\2\2\2*\u019a\3\2\2\2,\u019c"+
		"\3\2\2\2.\u01a7\3\2\2\2\60\u01a9\3\2\2\2\62\u01bc\3\2\2\2\64\u01c6\3\2"+
		"\2\2\66\u01c8\3\2\2\28\u01cb\3\2\2\2:\u01ce\3\2\2\2<\u01d6\3\2\2\2>\u01da"+
		"\3\2\2\2@\u01dc\3\2\2\2B\u01de\3\2\2\2D\u01e0\3\2\2\2F\u01e2\3\2\2\2H"+
		"\u01e4\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2"+
		"\2\2OM\3\2\2\2PR\5\6\4\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T]\3\2"+
		"\2\2US\3\2\2\2VW\5<\37\2WX\7\61\2\2XY\7\37\2\2YZ\7\3\2\2Z[\7\4\2\2[\\"+
		"\5\30\r\2\\^\3\2\2\2]V\3\2\2\2]^\3\2\2\2^b\3\2\2\2_a\5\6\4\2`_\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\2\2\3f\3\3\2\2"+
		"\2gh\7\35\2\2hm\7\62\2\2ij\7\5\2\2jl\7\62\2\2ki\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\6\2\2q\5\3\2\2\2rt\5<\37\2sr"+
		"\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\36\2\2"+
		"y{\5@!\2z|\5\b\5\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0081\7\7\2\2~\u0080"+
		"\5\f\7\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\b\2\2\u0085"+
		"\7\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7\4\2\2"+
		"\u0089\t\3\2\2\2\u008a\u008f\7\62\2\2\u008b\u008c\7\t\2\2\u008c\u008e"+
		"\7\62\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\13\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0096"+
		"\5\16\b\2\u0093\u0096\5\20\t\2\u0094\u0096\5\26\f\2\u0095\u0092\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\r\3\2\2\2\u0097\u0099"+
		"\5<\37\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\b"+
		"\5\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\5> \2\u00a1\u00a2\5B\"\2\u00a2\u00a4\7\3\2\2\u00a3\u00a5\5\22\n"+
		"\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\7\4\2\2\u00a7\u00a8\5\30\r\2\u00a8\17\3\2\2\2\u00a9\u00ab\5<\37\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5> \2\u00b0\u00b2"+
		"\5B\"\2\u00b1\u00b3\58\35\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b7\5 \21\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9"+
		"\21\3\2\2\2\u00ba\u00bf\5\24\13\2\u00bb\u00bc\7\t\2\2\u00bc\u00be\5\24"+
		"\13\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5> \2"+
		"\u00c3\u00c5\5B\"\2\u00c4\u00c6\58\35\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c9\5<\37\2\u00c8\u00c7\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5@!\2\u00cb\u00cd\7\3\2"+
		"\2\u00cc\u00ce\5\22\n\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\5\30\r\2\u00d1\27\3\2\2"+
		"\2\u00d2\u00d7\7\7\2\2\u00d3\u00d6\5\32\16\2\u00d4\u00d6\5\34\17\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00db\7\b\2\2\u00db\31\3\2\2\2\u00dc\u00dd\5> \2\u00dd\u00df\5B\"\2\u00de"+
		"\u00e0\58\35\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2"+
		"\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6\33\3\2\2"+
		"\2\u00e7\u00e8\7\20\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5(\25\2\u00ea"+
		"\u00eb\7\4\2\2\u00eb\u00ee\5\34\17\2\u00ec\u00ed\7\21\2\2\u00ed\u00ef"+
		"\5\34\17\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u011c\3\2\2\2"+
		"\u00f0\u00f1\7\22\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\5(\25\2\u00f3\u00f4"+
		"\7\4\2\2\u00f4\u00f5\5\34\17\2\u00f5\u011c\3\2\2\2\u00f6\u00f8\7\25\2"+
		"\2\u00f7\u00f9\5(\25\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u011c\7\6\2\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\7\3\2\2"+
		"\u00fd\u00fe\5(\25\2\u00fe\u00ff\7\4\2\2\u00ff\u0100\7\6\2\2\u0100\u011c"+
		"\3\2\2\2\u0101\u0102\7\27\2\2\u0102\u0103\5\66\34\2\u0103\u0104\7\6\2"+
		"\2\u0104\u011c\3\2\2\2\u0105\u0106\7\30\2\2\u0106\u0107\5(\25\2\u0107"+
		"\u0108\7\31\2\2\u0108\u0109\5B\"\2\u0109\u010a\7\6\2\2\u010a\u011c\3\2"+
		"\2\2\u010b\u010c\7\32\2\2\u010c\u010d\5\66\34\2\u010d\u010e\7\6\2\2\u010e"+
		"\u011c\3\2\2\2\u010f\u0110\7\33\2\2\u0110\u0111\5B\"\2\u0111\u0112\7\6"+
		"\2\2\u0112\u011c\3\2\2\2\u0113\u0114\7\34\2\2\u0114\u0115\5B\"\2\u0115"+
		"\u0116\7\6\2\2\u0116\u011c\3\2\2\2\u0117\u011c\5\36\20\2\u0118\u0119\5"+
		"(\25\2\u0119\u011a\7\6\2\2\u011a\u011c\3\2\2\2\u011b\u00e7\3\2\2\2\u011b"+
		"\u00f0\3\2\2\2\u011b\u00f6\3\2\2\2\u011b\u00fb\3\2\2\2\u011b\u0101\3\2"+
		"\2\2\u011b\u0105\3\2\2\2\u011b\u010b\3\2\2\2\u011b\u010f\3\2\2\2\u011b"+
		"\u0113\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011c\35\3\2\2"+
		"\2\u011d\u011e\7\23\2\2\u011e\u0124\7\3\2\2\u011f\u0125\5\32\16\2\u0120"+
		"\u0121\5(\25\2\u0121\u0122\7\6\2\2\u0122\u0125\3\2\2\2\u0123\u0125\7\6"+
		"\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0128\5(\25\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\7\6\2\2\u012a\u012c\5(\25\2\u012b"+
		"\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\4"+
		"\2\2\u012e\u0139\5\34\17\2\u012f\u0134\7\7\2\2\u0130\u0133\5\34\17\2\u0131"+
		"\u0133\5\32\16\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0139\7\b\2\2\u0138\u011d\3\2\2\2\u0138\u012f\3\2"+
		"\2\2\u0139\37\3\2\2\2\u013a\u013b\7\24\2\2\u013b\u013d\5> \2\u013c\u013e"+
		"\5\b\5\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\5&\24\2\u0140\u0147\3\2\2\2\u0141\u0142\5\"\22\2\u0142\u0143\5"+
		"(\25\2\u0143\u0147\3\2\2\2\u0144\u0147\5$\23\2\u0145\u0147\5(\25\2\u0146"+
		"\u013a\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2"+
		"\2\2\u0147!\3\2\2\2\u0148\u0149\7\3\2\2\u0149\u014a\7\61\2\2\u014a\u014b"+
		"\7\4\2\2\u014b#\3\2\2\2\u014c\u014e\7\7\2\2\u014d\u014f\5:\36\2\u014e"+
		"\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\b"+
		"\2\2\u0151%\3\2\2\2\u0152\u0154\7\3\2\2\u0153\u0155\5:\36\2\u0154\u0153"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015c\7\4\2\2\u0157"+
		"\u0158\7\n\2\2\u0158\u0159\5(\25\2\u0159\u015a\7\13\2\2\u015a\u015c\3"+
		"\2\2\2\u015b\u0152\3\2\2\2\u015b\u0157\3\2\2\2\u015c\'\3\2\2\2\u015d\u015e"+
		"\b\25\1\2\u015e\u015f\7\3\2\2\u015f\u0160\5(\25\2\u0160\u0162\7\4\2\2"+
		"\u0161\u0163\5.\30\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0185"+
		"\3\2\2\2\u0164\u0166\t\2\2\2\u0165\u0167\5.\30\2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0185\3\2\2\2\u0168\u016a\7\17\2\2\u0169\u016b\5"+
		",\27\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016e\5.\30\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0185\3\2"+
		"\2\2\u016f\u0171\5H%\2\u0170\u0172\5.\30\2\u0171\u0170\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0185\3\2\2\2\u0173\u0175\5F$\2\u0174\u0176\5.\30\2\u0175"+
		"\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0185\3\2\2\2\u0177\u0185\5D"+
		"#\2\u0178\u017a\5B\"\2\u0179\u017b\5*\26\2\u017a\u0179\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017e\5,\27\2\u017d\u017c\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0181\5.\30\2\u0180\u017f\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0183\7!\2\2\u0183"+
		"\u0185\5(\25\3\u0184\u015d\3\2\2\2\u0184\u0164\3\2\2\2\u0184\u0168\3\2"+
		"\2\2\u0184\u016f\3\2\2\2\u0184\u0173\3\2\2\2\u0184\u0177\3\2\2\2\u0184"+
		"\u0178\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u018e\3\2\2\2\u0186\u0187\f\4"+
		"\2\2\u0187\u0188\7.\2\2\u0188\u0189\5(\25\2\u0189\u018a\7/\2\2\u018a\u018b"+
		"\5(\25\5\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f)\3\2\2\2\u0190\u018e\3\2\2\2"+
		"\u0191\u0193\7\3\2\2\u0192\u0194\5:\36\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u019b\7\4\2\2\u0196\u0197\7\n\2\2\u0197"+
		"\u0198\5(\25\2\u0198\u0199\7\13\2\2\u0199\u019b\3\2\2\2\u019a\u0191\3"+
		"\2\2\2\u019a\u0196\3\2\2\2\u019b+\3\2\2\2\u019c\u019d\7\5\2\2\u019d\u019f"+
		"\5B\"\2\u019e\u01a0\5*\26\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u01a3\5,\27\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3-\3\2\2\2\u01a4\u01a8\5\60\31\2\u01a5\u01a8\5\62\32\2\u01a6"+
		"\u01a8\5\64\33\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8/\3\2\2\2\u01a9\u01aa\7-\2\2\u01aa\u01ab\5 \21\2\u01ab\61"+
		"\3\2\2\2\u01ac\u01ad\7\"\2\2\u01ad\u01bd\5(\25\2\u01ae\u01af\7#\2\2\u01af"+
		"\u01bd\5(\25\2\u01b0\u01b1\7(\2\2\u01b1\u01bd\5(\25\2\u01b2\u01b3\7 \2"+
		"\2\u01b3\u01bd\5(\25\2\u01b4\u01b5\7)\2\2\u01b5\u01bd\5(\25\2\u01b6\u01b7"+
		"\7*\2\2\u01b7\u01bd\5(\25\2\u01b8\u01b9\7+\2\2\u01b9\u01bd\5(\25\2\u01ba"+
		"\u01bb\7,\2\2\u01bb\u01bd\5(\25\2\u01bc\u01ac\3\2\2\2\u01bc\u01ae\3\2"+
		"\2\2\u01bc\u01b0\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc"+
		"\u01b6\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\63\3\2\2"+
		"\2\u01be\u01bf\7$\2\2\u01bf\u01c7\5(\25\2\u01c0\u01c1\7%\2\2\u01c1\u01c7"+
		"\5(\25\2\u01c2\u01c3\7&\2\2\u01c3\u01c7\5(\25\2\u01c4\u01c5\7\'\2\2\u01c5"+
		"\u01c7\5(\25\2\u01c6\u01be\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\65\3\2\2\2\u01c8\u01c9\7\3\2\2\u01c9\u01ca"+
		"\7\4\2\2\u01ca\67\3\2\2\2\u01cb\u01cc\7\n\2\2\u01cc\u01cd\7\13\2\2\u01cd"+
		"9\3\2\2\2\u01ce\u01d3\5(\25\2\u01cf\u01d0\7\t\2\2\u01d0\u01d2\5(\25\2"+
		"\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4;\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7\60\2\2\u01d7"+
		"=\3\2\2\2\u01d8\u01db\7\61\2\2\u01d9\u01db\5@!\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db?\3\2\2\2\u01dc\u01dd\7\62\2\2\u01ddA\3\2\2\2\u01de"+
		"\u01df\7\62\2\2\u01dfC\3\2\2\2\u01e0\u01e1\7\63\2\2\u01e1E\3\2\2\2\u01e2"+
		"\u01e3\7\64\2\2\u01e3G\3\2\2\2\u01e4\u01e5\7\65\2\2\u01e5I\3\2\2\2<MS"+
		"]bmu{\u0081\u008f\u0095\u009a\u009e\u00a4\u00ac\u00b2\u00b6\u00bf\u00c5"+
		"\u00c8\u00cd\u00d5\u00d7\u00df\u00e3\u00ee\u00f8\u011b\u0124\u0127\u012b"+
		"\u0132\u0134\u0138\u013d\u0146\u014e\u0154\u015b\u0162\u0166\u016a\u016d"+
		"\u0171\u0175\u017a\u017d\u0180\u0184\u018e\u0193\u019a\u019f\u01a2\u01a7"+
		"\u01bc\u01c6\u01d3\u01da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}