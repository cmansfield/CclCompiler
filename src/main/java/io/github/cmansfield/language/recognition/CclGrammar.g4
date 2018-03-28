grammar CclGrammar;

// *************** Parser ***************

compilationUnit : importDeclaration* classDeclaration* MODIFIER PRIMITIVE_TYPE 'main' '(' ')' methodBody classDeclaration* ;

importDeclaration : 'import' IDENTIFIER ('.' IDENTIFIER)* ';' ;

classDeclaration : MODIFIER* 'class' IDENTIFIER '{' classMemberDeclaration* '}' ;

classMemberDeclaration 
    : MODIFIER+ type IDENTIFIER fieldDeclaration
    | constructorDeclaration
    ;

fieldDeclaration 
    : ('[' ']')? ('=' assignmentExpression)? ';'
    | '(' parameterList? ')' methodBody
    ;

parameterList : parameter (',' parameter)* ;

parameter : type IDENTIFIER ('[' ']')? ;

constructorDeclaration : MODIFIER? IDENTIFIER '(' parameterList? ')' methodBody ;

methodBody : '{' variableDeclaration* statement* '}' ;

variableDeclaration : type IDENTIFIER ('[' ']')? ('=' assignmentExpression)? ';' ;

statement 
    : 'if' '(' expression ')' statement ('else' statement)?
    | 'while' '(' expression ')' statement
    | 'for' '(' expression? ';' expression? ';' expression? ')' statement
    | 'return' expression? ';'
    | 'print' '(' expression ')' ';'
    | 'read' '(' ')' ';'
    | 'spawn' expression 'set' IDENTIFIER ';'
    | 'block' '(' ')' ';'
    | 'lock' IDENTIFIER ';'
    | 'unlock' IDENTIFIER ';'
    | '{' statement* '}'
    | expression ';'
    ;

assignmentExpression 
    : 'new' type newDeclaration
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
    |  ('true' | 'false' | 'null') expressionz?
    |  'this' memberRefz? expressionz?
    | NUMERIC_LITTERAL expressionz?
    | CHARACTER_LITTERAL expressionz?
    | STRING_LITTERAL expressionz?
    | IDENTIFIER fnArrMember? memberRefz? expressionz?
    | expression '?' expression ':' expression
    ;

fnArrMember 
    : '(' argumentList? ')'
    | '[' expression ']'
    ;

memberRefz : '.' IDENTIFIER fnArrMember? memberRefz? ;

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

MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;