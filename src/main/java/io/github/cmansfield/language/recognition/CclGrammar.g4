grammar CclGrammar;

// *************** Parser ***************

compilationUnit : MODIFIER PRIMITIVE_TYPE 'main' '(' ')' methodBody ;

methodBody : '{' variableDeclaration* statement* '}' ;

variableDeclaration : type IDENTIFIER ('[' ']')? ('=' assignmentExpression)? ';' ;

statement : 'statement' ';' ;

assignmentExpression 
    : expression
    | 'new' type newDeclaration
    | typeCast expression
    | STRING_LITTERAL
    | braceEnclosedInitializer
    ;

typeCast : '(' PRIMITIVE_TYPE ')' ;

braceEnclosedInitializer : '{' argumentList? '}' ;

newDeclaration 
    : '(' argumentList? ')'
    | '[' expression ']'
    ;

expression 
    : '(' expression ')' expressionz?
    |  ('true' | 'false' | 'null') expressionz?
    |  'this' memberRefz? expressionz?
    | NUMERIC_LITTERAL expressionz?
    | CHARACTER_LITTERAL expressionz?
    | STRING_LITTERAL expressionz?
    | IDENTIFIER fnArrMember? memberRefz? expressionz?
    | expression '?' expression ':' expression
    ;

fnArrMember : 'fnArrMember' ;

memberRefz : 'memberRefz' ;

expressionz 
    : '=' assignmentExpression
    | '&&' expression
    | '||' expression
    | '==' expression
    | '!=' expression
    | '<=' expression
    | '>=' expression
    | '<' expression
    | '>' expression
    | '+' expression
    | '-' expression
    | '*' expression
    | '/' expression
    ;

argumentList : expression (',' expression)* ;

type 
    : PRIMITIVE_TYPE
    | IDENTIFIER ;


// *************** Lexer ***************

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

fragment LETTER : [a-zA-Z] ;

fragment NUMBER : [0-9]+ ;

fragment CHARACTER : [ -~] ;

WHITESPACE : [ \t] -> skip ;

NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;