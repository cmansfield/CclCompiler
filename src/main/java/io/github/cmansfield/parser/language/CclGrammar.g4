grammar CclGrammar;

// *************** Parser ***************

compilationUnit : importDeclaration* classDeclaration* (modifier PRIMITIVE_TYPE MAIN '(' ')'
        methodBody)? classDeclaration* EOF ;

importDeclaration : IMPORT IDENTIFIER ('.' IDENTIFIER)* ';' ;

classDeclaration : modifier* CLASS className templateDeclaration?
        '{' classMemberDeclaration* '}' ;

templateDeclaration : '(' templateList ')' ;

templateList : IDENTIFIER (',' IDENTIFIER)* ;

classMemberDeclaration 
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    ;

methodDeclaration : modifier* templateDeclaration? type name '(' parameterList? ')' 
        methodBody ;

fieldDeclaration : modifier* type name (arrayOperator)? (ASSIGN assignmentExpression)? ';' ;

parameterList : parameter (',' parameter)* ;

parameter : type name (arrayOperator)? ;

constructorDeclaration : modifier? className '(' parameterList? ')' methodBody ;

methodBody : '{' (variableDeclaration | statement)* '}' ;

variableDeclaration : type name (arrayOperator)? (ASSIGN assignmentExpression)? ';' ;

statement 
    : IF '(' expression ')' statement (ELSE statement)?
    | WHILE '(' expression ')' statement
    | RETURN expression? ';'
    | PRINT '(' expression ')' ';'
    | READ invokeOperator ';'
    | SPAWN expression SET name ';'
    | BLOCK invokeOperator ';'
    | LOCK name ';'
    | UNLOCK name ';'
    | statementWithScope
    | expression ';'
    ;
    
statementWithScope 
    : FOR '(' (variableDeclaration | expression ';' | ';') expression? ';' expression? ')'
      statement
    | '{' (statement | variableDeclaration)* '}'
    ;

assignmentExpression 
    : NEW type templateDeclaration? newDeclaration
    | typeCast expression
    | braceEnclosedInitializer
    | expression
    ;

typeCast : '(' PRIMITIVE_TYPE ')' ;

braceEnclosedInitializer : '{' argumentList? '}' ;

newDeclaration 
    : '(' argumentList? ')'
    | '[' expression ']'
    ;

expression 
    : '(' expression ')' expressionz?
    |  (TRUE | FALSE | NULL) expressionz?
    |  THIS memberRefz? expressionz?
    | numericLiteral expressionz?
    | characterLiteral expressionz?
    | stringLiteral
    | name fnArrMember? memberRefz? expressionz?
    | expression QUESTION expression COLON expression
    | NOT expression
    ;

fnArrMember 
    : '(' argumentList? ')'
    | '[' expression ']'
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
    
invokeOperator : '(' ')' ;

arrayOperator : '[' ']' ;

argumentList : expression (',' expression)* ;

modifier : MODIFIER ;

type 
    : PRIMITIVE_TYPE
    | className ;

className : IDENTIFIER ;

name : IDENTIFIER ;

stringLiteral : STRING_LITERAL ;

characterLiteral : CHARACTER_LITERAL ;

numericLiteral : NUMERIC_LITERAL ;

// *************** Lexer ***************

PRIMITIVE_TYPE
    : INT
    | CHAR
    | BOOL
    | STRING
    | VOID
    ;

MODIFIER 
    : 'public' 
    | 'private' 
    | 'static' 
    | 'const' 
    ;

// Keywords
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