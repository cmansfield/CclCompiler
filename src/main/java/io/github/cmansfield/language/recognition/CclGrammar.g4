grammar CclGrammar;

// *************** Parser ***************

compilationUnit : importDeclaration* classDeclaration* MODIFIER PRIMITIVE_TYPE MAIN '(' ')'
        methodBody classDeclaration* EOF ;

importDeclaration : IMPORT IDENTIFIER ('.' IDENTIFIER)* ';' ;

classDeclaration : MODIFIER* CLASS className templateDeclaration?
        '{' classMemberDeclaration* '}' ;

templateDeclaration : '(' templateList ')' ;

templateList : IDENTIFIER (',' IDENTIFIER)* ;

classMemberDeclaration 
    : methodDeclaration
    | MODIFIER+ type IDENTIFIER (arrayOperator)? (ASSIGN assignmentExpression)? ';'
    | constructorDeclaration
    ;

methodDeclaration : MODIFIER+ templateDeclaration? type IDENTIFIER '(' parameterList? ')' 
        methodBody ;

parameterList : parameter (',' parameter)* ;

parameter : type IDENTIFIER (arrayOperator)? ;

constructorDeclaration : MODIFIER? className '(' parameterList? ')' methodBody ;

methodBody : '{' (variableDeclaration | statement)* '}' ;

variableDeclaration : type IDENTIFIER (arrayOperator)? (ASSIGN assignmentExpression)? ';' ;

statement 
    : IF '(' expression ')' statement (ELSE statement)?
    | WHILE '(' expression ')' statement
    | FOR '(' (variableDeclaration | expression ';' | ';') expression? ';' expression? ')'
        statement
    | RETURN expression? ';'
    | PRINT '(' expression ')' ';'
    | READ invokeOperator ';'
    | SPAWN expression SET IDENTIFIER ';'
    | BLOCK invokeOperator ';'
    | LOCK IDENTIFIER ';'
    | UNLOCK IDENTIFIER ';'
    | '{' statement* '}'
    | expression ';'
    ;

assignmentExpression 
    : NEW type newDeclaration
    | typeCast expression
    | STRING_LITTERAL
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
    | NUMERIC_LITTERAL expressionz?
    | CHARACTER_LITTERAL expressionz?
    | STRING_LITTERAL expressionz?
    | IDENTIFIER fnArrMember? memberRefz? expressionz?
    | expression QUESTION expression COLON expression
    | NOT expression
    ;

fnArrMember 
    : '(' argumentList? ')'
    | '[' expression ']'
    ;

memberRefz : '.' IDENTIFIER fnArrMember? memberRefz? ;

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

type 
    : PRIMITIVE_TYPE
    | className ;

className : IDENTIFIER ;

// *************** Lexer ***************

// Keywords
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

MODIFIER 
    : 'public' 
    | 'private' 
    | 'static' 
    | 'const' 
    ;
    
PRIMITIVE_TYPE
    : 'int'
    | 'char'
    | 'bool'
    | 'string'
    | 'void'
    ;
    
IDENTIFIER : LETTER (LETTER | NUMBER)* ;

STRING_LITTERAL : '"' CHARACTER* '"' ;

CHARACTER_LITTERAL : '\'' CHARACTER '\'' ;

NUMERIC_LITTERAL : [+-]? NUMBER ;

NUMBER : [0-9]+ ;

fragment LETTER : [a-zA-Z] ;

fragment CHARACTER : [ -~] ;

WHITESPACE : [ \t] -> skip ;

NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;