grammar CclGrammar;

// Parser
compilationUnit : MODIFIER PRIMITIVE_TYPE 'main' '(' ')' ;

// Lexer

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
CLASS_NAME : IDENTIFIER ;
TYPE 
    : PRIMITIVE_TYPE
    | CLASS_NAME
    ;
IDENTIFIER : LETTER (LETTER | NUMBER)? ;
STRING_LITTERAL : '"' CHARACTER* '"' ;
CHARACTER_LITTERAL : '\'' CHARACTER '\'' ;
NUMERIC_LITTERAL : [+-]? NUMBER ;
fragment LETTER : [a-zA-Z] ;
fragment NUMBER : [0-9]+ ;
fragment CHARACTER : . ; 
WHITESPACE : [ \t] -> skip ;
NEWLINE : ('\r'? '\n' | '\n'? '\r' | '\r')+ -> skip ;