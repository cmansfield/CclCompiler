grammar ImportGrammar;

// *************** Parser ***************

importList : importDeclaration* ;

importDeclaration : IMPORT directoryOrFile ('.' directoryOrFile)* ';' ;

//code : CHARACTER* ;

directoryOrFile : IDENTIFIER ;

// *************** Lexer ***************

IMPORT : 'import' ;

IDENTIFIER : LETTER (LETTER | NUMBER)* ;

fragment NUMBER : [0-9]+ ;

fragment LETTER : [a-zA-Z] ;

CHARACTER : [ -~] ;

WHITESPACE : [ \t] -> skip ;

NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

LINE_COMMENT : '//' ~[\r\n]* -> skip ;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip ;