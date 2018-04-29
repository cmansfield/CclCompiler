# CclCompiler
##### Chris' Custom Language Compiler (For fun/practice)

This is a simple programming language with a few modern programming concepts.
****
**Sample Code**
 
_Arrays_
```
public void main() {
	const int NUMBER_OF_EMPLOYEES = EmployeeManager.getNumEmployees();
	int salaryPackages[] = {40000, 55000, 70000};
	string employeeNames[] = new string[NUMBER_OF_EMPLOYEES];
	Employee employees[] = EmployeeManager.getEmployees();
	
	for(int i = 0; i < NUMBER_OF_EMPLOYEES; i = i + 1) {
		employeeNames[i] = employees[i].getName();
	}

	print("Hello " + employeeNames[0]);
}
```
_Templates/Generics_
```
public class SampleClass (T) {
	private T value;

	public SampleClass(T value) {
		this.value = value;
	}
	public (K) T someMethod(K lhs, K rhs) {
		return lhs == rhs ? value : null;
	}
}
```
_Threading_
```
public class Runner {
	int theadNum;
	int mutex;
	public Runner(int theadNum, int mutex) {
		this.theadNum = theadNum;
		this.mutex = mutex;
	}
	
	public void run() {
		for(int i = 0; i < 10; i = i + 1) {
			lock mutex;
			print("Hello from thread ");
			print(theadNum);
			unlock mutex;
		}
	}
}

public void main() {
	const int NUM_RUNNERS = 5;
	Runner runners[] = new Runner[NUM_RUNNERS];
	int mutex;
	
	for(int i = 0; i < NUM_RUNNERS; i + 1) {
		runners[i] = new Runner(i, mutex);
	}
	for(int i = 0; i < NUM_RUNNERS; i + 1) {
		spawn runners[i].run() set i;
	}
	block();
}
```
****
**TODO**
- Add jackson deserialization 
    - Symbol class
    - iCode class
- Begin working on the compiler second pass
	- generate template classes
	- iCode
	- tCode
- Add an easy to use web interface to show case the compiler
****
**Things to consider adding in the future**
- Nested classes
- Add float and double primitive types
- Do-while
- Enums
- Switch statements
- Range-based for-loops
- Add continue and break
- Store method references in variables
- Lambdas
- Inferable type (Ex. auto / var)
****
#### Language Grammar
**_Meta-Language_**
```
:: 	is defined as  
| 	alternative definition
; 	end of rule  
[ ]	optional
{ } 	zero or more occurrences
( ) 	grouping
```
**_Atomic_**
```
COMMENT:: ‘//’ {non-end line character} EOL ;
MULTILINE-COMMENT:: ‘/*’ {character} ‘*/’ ;
LETTER:: ‘A’ to ‘Z’ or ‘a’ to ‘z’ ;
IDENTIFIER:: LETTER {LETTER | NUMBER} ;
CHARACTER:: printableAscii | nonprintableAscii ;
KEYWORD::
	    ‘bool’ | ‘class’ | ‘char’ | ‘read’ | ‘print’ | ‘else’ | ‘false’ 
	  | ‘if’ | ‘int’ | ‘string’ | ‘main’| ‘new’ | ‘null’ | ‘object’ 
	  | ‘public’ | ‘private’ | ‘return’ | ‘this’ | ‘true’ | ‘void’ 
	  | ‘while’ | ‘for’ | ‘spawn’ | ‘lock’ | ‘unlock’ | ‘block’ | ‘const’ 
	  | ‘static’ ;
MODIFIER:: ‘public’ | ‘private’ | ‘static’ | ‘const’ ;
PRIMITIVE_TYPE:: ‘int’ | ‘char’ | ‘bool’ | ‘string’ | ‘void’ ;
CHARACTER_LITERAL:: ‘\’’ CHARACTER ‘\’’ ;
NUMERIC_LITERAL:: [‘+’ | ‘-’]NUMBER ;
STRING_LITERAL:: ‘‘‘ {CHARACTER} ‘‘‘ ;
CLASS_NAME:: IDENTIFIER ;
NUMBER::
	  ‘0’{NUMBER} | ‘1’{NUMBER} | ‘2’{NUMBER} | ‘3’{NUMBER}
	| ‘4’{NUMBER} | ‘5’{NUMBER} | ‘6’{NUMBER} | ‘7’{NUMBER}
	| ‘8’{NUMBER} | ‘9’{NUMBER} ;
```
#### Complex
```
compilationUnit::
	{importDeclaration} {classDeclaration} ‘public’ ‘void’ ‘main’
	‘(‘ ‘)’ methodBody {classDeclaration} ;
type:: PRIMITIVE_TYPE | CLASS_NAME ;
importDeclaration:: ‘import’ IDENTIFIER {‘.’ IDENTIFIER} ‘;’ ;
classDeclaration::
	{MODIFIER} ‘class’ CLASS_NAME [templateDeclaration] ‘{‘
	{classMemberDeclaration} ‘}’;
classMemberDeclaration::
	methodDeclaration | {MODIFIER} type IDENTIFIER [‘[‘ ‘]’] 
	[‘=‘ assignmentExpression] ‘;’ | constructorDeclaration ;
methodDeclaration:: 
	{MODIFIER} [templateDeclaration] type IDENTIFIER
	‘(‘ [parameterList] ‘)’ methodBody ;
templateDeclaration:: ‘(‘ templateList ‘)’ ;
constructorDeclaration:: 
	[MODIFIER] CLASS_NAME ‘(‘ [parameterList] ‘)’ methodBody ;
methodBody::
	‘{‘ {variableDeclaration} {statement} ‘}’ ;
variableDeclaration::
	type IDENTIFIER [‘[‘ ‘]’] [‘**=**‘ assignmentExpression] ‘;’ ;
parameterList:: parameter {‘**,**’ parameter} ;
parameter:: type IDENTIFIER [‘[‘ ‘]’] ;
statement::
	  ‘{‘ {statement} ‘}’
	| expression ‘;’
	| ‘if’ ‘(‘ expression ‘)’ statement [‘else’ statement]
	| ‘while’ ‘(‘ expression ‘)’ statement
	| ‘for’ ‘(‘ [expression] ‘;’ [expression] ‘;’ [expression] ‘)’
		statement
	| ‘return’ [expression] ‘;’
	| ‘print’ ‘(‘ expression ‘)’ ‘;’
	| ‘read’ ‘(‘ expression ‘)’ ‘;’
	| ‘spawn’ expression ‘set’ IDENTIFIER ‘;’
	| ‘block’ ‘(‘ ‘)’ ‘;’
	| ‘lock’ IDENTIFIER ‘;’
	| ‘unlock’ IDENTIFIER ‘;’
	;
expression::
	  ‘(‘ expression ‘)’ [expressionx]
	| ‘true’ [expressionx]
	| ‘false’ [expressionx]
	| ‘null’ [expressionx]
	| ‘this’ [memberRefz] [expressionx]
	| NUMERIC_LITERAL [expressionx]
	| CHARACTER_LITERAL [expressionx]
	| IDENTIFIER [arrMember] [memberRefz] [expressionx]
	| expression ‘?’ expression ‘:’ expression
	;
arrMember:: ‘(‘ [argumentList] ‘)’ | ‘[‘ expression ‘]’ ;
argumentList:: expression {‘,’ expression} ;
templateList:: IDENTIFIER {‘,’ IDENTIFIER} ;
memberRefz:: ‘.’ IDENTIFIER [arrMember] [memberRefz] ;
expressionx::
	  ‘=‘ assignmentExpression
	| ‘&&’ expression  /* logical connective expression */
	| ‘||’ expression  /* logical connective expression */
	| ‘==‘ expression  /* boolean expression */
	| ‘!=‘ expression  /* boolean expression */
	| ‘<=‘ expression  /* boolean expression */
	| ‘>=‘ expression  /* boolean expression */
	| ‘<‘ expression  /* boolean expression */
	| ‘>‘ expression  /* boolean expression */
	| ‘+’ expression  /* mathematical expression */
	| ‘-’ expression  /* mathematical expression */
	| ‘*’ expression  /* mathematical expression */
	| ‘/’ expression  /* mathematical expression */
	;
assignmentExpression::
	  expression
	| ‘new’ type newDeclaration
	| ‘(‘ PRIMITIVE_TYPE ‘)’ expression
	| STRING_LITERAL
	| braceEnclosedInitializer
	;
newDeclaration::
	  ‘(‘ [argumentList] ‘)’
	| ‘[‘ expression ‘]’
	;
braceEnclosedInitializer:: ‘{‘ [argumentList] ‘}’ ;
```
