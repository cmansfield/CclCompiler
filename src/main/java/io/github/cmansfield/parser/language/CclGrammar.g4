grammar CclGrammar;

// *************** Parser ***************

compilationUnit : importDeclaration* classDeclaration* mainDeclaration? classDeclaration* EOF ;

mainDeclaration : modifier+ PRIMITIVE_TYPE MAIN '(' ')' methodBody ;

importDeclaration : IMPORT IDENTIFIER ('.' IDENTIFIER)* ';' ;

classDeclaration : modifier* CLASS className templateDeclaration?
        '{' classMemberDeclaration* '}' ;

templateDeclaration : '(' templateList ')' ;

templateList : templatePlaceHolder (',' templatePlaceHolder)* ;

classMemberDeclaration 
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    ;

methodDeclaration : modifier* templateDeclaration? type methodName '(' parameterList? ')'
        methodBody ;

fieldDeclaration : modifier* type name (arrayDeclaration)? (assignmentOperation)? ';' ;

parameterList : parameter (',' parameter)* ;

parameter : type name (arrayDeclaration)? ;

constructorDeclaration : modifier? methodName '(' parameterList? ')' methodBody ;

methodBody : '{' (variableDeclaration ';' | statement)* '}' ;

variableDeclaration : type name (arrayDeclaration)? (assignmentOperation)? ;

statement 
    : IF invokeOperator expression invokeOperatorEnd statement (ELSE statement)?
    | WHILE invokeOperator expression invokeOperatorEnd statement
    | RETURN expression? ';'
    | PRINT invokeOperator expression invokeOperatorEnd ';'
    | READ invokeOperator expression? invokeOperatorEnd ';'
    | SPAWN expression SET name ';'
    | BLOCK '(' ')' ';'
    | LOCK name ';'
    | UNLOCK name ';'
    | statementWithScope
    | expression ';'
    ;
    
statementWithScope 
    : FOR invokeOperator (variableDeclaration | expression)? ';' expression ';' expression? invokeOperatorEnd
      statement
    | '{' (statement | variableDeclaration ';')* '}'
    ;

assignmentExpression 
    : NEW type templateDeclaration? newDeclaration
    | typeCast
    | braceEnclosedInitializer
    | expression
    ;

typeCast : cast expression ;

cast : '(' PRIMITIVE_TYPE ')' ;

braceEnclosedInitializer : '{' argumentList? '}' ;

newDeclaration 
    : invokeOperator argumentList? invokeOperatorEnd
    | arrayOperator expression arrayOperatorEnd
    ;

expression 
    : invokeOperator expression invokeOperatorEnd expressionz?
    | (TRUE | FALSE | NULL) expressionz?
    | self memberRefz? expressionz?
    | numericLiteral expressionz?
    | characterLiteral expressionz?
    | stringLiteral expressionz?
    | booleanLiteral expressionz?
    | specialLiteral expressionz?
    | name fnArrMember? memberRefz? expressionz?
    | expression QUESTION expression COLON expression
    | NOT expression
    ;

fnArrMember 
    : invokeOperator argumentList? invokeOperatorEnd
    | arrayOperator expression arrayOperatorEnd
    ;

memberRefz : '.' name fnArrMember? memberRefz? ;

expressionz 
    : assignmentOperation
    | booleanOperation
    | mathOperation
    ;

assignmentOperation : ASSIGN assignmentExpression ;

booleanOperation
    : AND expression
    | OR expression
    | EQUALS expression
    | NOT_EQ expression
    | LESS_EQ expression
    | GREAT_EQ expression
    | LESS expression
    | GREATER expression
    ;

mathOperation 
    : PLUS expression
    | MINUS expression
    | MULTI expression
    | DIV expression
    ;
    
invokeOperator : '(' ;

invokeOperatorEnd : ')';

arrayOperator : '[' ;

arrayOperatorEnd : ']' ;

arrayDeclaration : '[' ']' ;

argumentList : assignmentExpression (',' assignmentExpression)* ;

modifier : MODIFIER ;

type 
    : PRIMITIVE_TYPE
    | className declaredTemplateType? ;

templatePlaceHolder : IDENTIFIER ;

declaredTemplateType : '<' type (',' type)* '>' ;

className : IDENTIFIER ;

methodName : IDENTIFIER ;

name : IDENTIFIER ;

self : THIS ;

stringLiteral : STRING_LITERAL ;

characterLiteral : CHARACTER_LITERAL ;

numericLiteral : NUMERIC_LITERAL ;

booleanLiteral : BOOLEAN_LITERAL;

specialLiteral : SPECIAL_LITERAL ;

// *************** Lexer ***************

PRIMITIVE_TYPE
    : INT
    | CHAR
    | BOOL
    | STRING
    | VOID
    ;

MODIFIER 
    : PUBLIC
    | PRIVATE
    | STATIC
    | CONST
    ;

SPECIAL_LITERAL : NULL ;

BOOLEAN_LITERAL
    : TRUE
    | FALSE
    ;

// Keywords
PUBLIC : 'public' ;
PRIVATE : 'private' ;
STATIC : 'static' ;
CONST : 'const' ;
INT : 'int' ;
CHAR : 'char' ;
BOOL : 'bool' ;
STRING : 'string' ;
VOID : 'void' ;
TRUE : 'true' ;
FALSE : 'false' ;
NULL : 'null' ;
THIS : 'this' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;
NEW : 'new' ;
RETURN : 'return' ;
PRINT : 'print' ;
READ : 'read' ;
SPAWN : 'spawn' ;
SET : 'set' ;
BLOCK : 'block' ;
LOCK : 'lock' ;
UNLOCK : 'unlock' ;
IMPORT : 'import' ;
CLASS : 'class' ;
MAIN : 'main' ;

// Operators
NOT_EQ : '!=' ;
NOT : '!' ;
AND : '&&' ;
OR : '||' ;
PLUS : '+' ;
MINUS : '-';
MULTI : '*';
DIV : '/' ;
EQUALS : '==' ;
LESS_EQ : '<=' ;
GREAT_EQ : '>=' ;
LESS : '<' ;
GREATER : '>' ;
ASSIGN : '=' ;
QUESTION : '?' ;
COLON : ':' ;
    
IDENTIFIER : LETTER (LETTER | NUMBER | UNDERSCORE)* ;

STRING_LITERAL : '"' CHARACTER* '"' ;

CHARACTER_LITERAL : '\'' CHARACTER '\'' ;

NUMERIC_LITERAL : [+-]? NUMBER ;

NUMBER : [0-9]+ ;

fragment LETTER : [a-zA-Z] ;

fragment UNDERSCORE : '_' ;

fragment CHARACTER : LETTER | [0-9 !#$%&'()*+,-./:;<=>?@[\]^_`~{}|] | '\\t' | '\\\\' | '\\b' | '\\0' | '\\"' | '\\n' | '\\r' ;

WHITESPACE : [ \t] -> skip ;

NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;