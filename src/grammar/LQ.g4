// LQ (Language of queries)
grammar LQ;

//----------------------------------------------------------
// Query rules
//----------------------------------------------------------
query : QueryHeadSign goals QueryBodySign conditions EOF;

goals : goal (',' goal)* | aggregateGoal ;

goal : variableAttrSelector;

aggregateGoal : (aggregateFunction '(' attributeSelector ')') ;

//----------------------------------------------------------
// Conditions
//----------------------------------------------------------
conditions : condition (';' condition)* ;

condition
 : inClass
 | variableOperatorCondition
 | linkCondition
 | functionalLinkCondition
 ;

inClass
 : variableName 'IN' className attributeConditions? ;

attributeConditions
 : '(' attributeCondition (';' attributeCondition)*  ')'
 ;

attributeCondition
 : attributeSelector binaryOperator ( value | variableAttrSelector )
 ;

linkCondition
 : '(' variableName linkName variableName? variableName ')'
 ;

functionalLinkCondition
 : linkName '(' variableName ')' '.' attributeCondition
 ;

variableOperatorCondition
 : variableAttrSelector binaryOperator ( value | variableAttrSelector )
 ;

variableAttrSelector
 : variableName ('.' attributeName)*
 ;

attributeSelector
 : attributeName ('.' attributeName)*
 ;
//----------------------------------------------------------
// Basic rules
//----------------------------------------------------------
variableName : Name ;

className    : Name ;

linkName : Name ;

attributeName: Name ;

aggregateFunction : SUM | AVG | MIN | MAX ;

binaryOperator : EQ | NOTEQ | LT | LE | GT | GE | LIKE ;

value : number | QuotedString ;

number : Int | Float ;

//----------------------------------------------------------
// Tokens
//----------------------------------------------------------
QueryHeadSign
 : '?'
 ;

QueryBodySign
 : '-'
 ;

Int
 : Digit+
 ;

Float
 : Digit+ ('.' Digit*)?
 ;

QuotedString
 : ["] (~["\r\n] | '\\\\' | '\\"')* ["]
 | ['] (~['\r\n] | '\\\\' | '\\\'')* [']
 ;

SUM : 'SUM' ;
AVG : 'AVG' ;
MIN : 'MIN' ;
MAX : 'MAX' ;

EQ      : '=' ;
NOTEQ   : '=/=' ;
LT      : '<' ;
LE      : '<=' ;
GT      : '>' ;
GE      : '>=' ;
LIKE    : 'LIKE' ;

Name
 : [a-zA-Z0-9_\-\u0410-\u044F]+
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;


fragment Digit
 : [0-9]
 ;