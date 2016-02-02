// LSS (Language for specification of object structure)
grammar LSS;

//----------------------------------------------------------
// Concept rules
//----------------------------------------------------------
conceptSentence
 : classSentence
 | binaryLinkSentence
 | isaSentence
 ;

classSentence
 : className '[' attributes ']'
 ;

binaryLinkSentence
 : '(' classAttributeCondition binaryLinkName intervalRestriction? classAttributeCondition ')' ('[' attributes ']')?
 ;

isaSentence
 : Name 'ISA' Name
 ;
//----------------------------------------------------------
// Attribute rules
//----------------------------------------------------------
attributes
 : attribute (',' attribute)*
 ;

attribute
 : conceptAttribute
 | dataTypeAttribute
 ;

dataTypeAttribute
 : Name ':' dataType
 ;

conceptAttribute
 : conceptType
 | Name ':' conceptType
 ;
//----------------------------------------------------------
// Binary links rules
//----------------------------------------------------------
classAttributeCondition
 : conceptAttribute baseAttributeCondition?
 ;

baseAttributeCondition
 : '(' elementaryAttributeCondition (';' elementaryAttributeCondition)* ')'
 ;

elementaryAttributeCondition
 : selector binaryOperator (selector | attributeValue)
 ;

intervalRestriction
 : fullIntervalRestriction
 | contractedIntervalRestriction
 | '->'                              // Functional restriction
 ;

fullIntervalRestriction
 : '(' atomRestriction ',' atomRestriction ')'
 ;

contractedIntervalRestriction
 : '(' atomRestriction ')'
 ;

atomRestriction
 : EQ Int
 | LE Int
 | LT Int
 | GT Int
 | GE Int
 | Int ':' Int
 | '*'
 ;
//----------------------------------------------------------
// Type rules
//----------------------------------------------------------
dataType
 : primitiveType                            # primitiveData
 | rangeDataType                            # rangeData
 | labeledDataType                          # labelRuleLabel
 | definedTypeName                          # definedTypeRuleLabel
 | dataType '(' '*' ')'                     # starData
 | dataType '|' dataType                    # unionData
 | '(' dataType (',' dataType)* ')'         # cartesianProductData
 | '{' Name  (',' Name )* '}'               # enum
 | 'LIST' '(' dataType ')'                  # list
 | 'LLIST' '(' dataType ')'                 # llist
 ;

primitiveType
 : 'Boolean'        # BooleanPrimitive
 | 'Number'         # NumberPrimitive
 | 'Integer'        # IntegerPrimitive
 | 'Char'           # CharPrimitive
 | 'String'         # StringPrimitive
 ;

rangeDataType
 : '[' Range ']'
 ;

labeledDataType
 : Name ':' dataType
 ;

conceptType
 : Name                                     # conceptName
 | conceptType '(' '*' ')'                  # starConcept
 | conceptType '|' conceptType              # unionConcept
 | '(' conceptType (',' conceptType)* ')'   # cartesianProductConcept
 ;
//----------------------------------------------------------
// Basic rules
//----------------------------------------------------------
selector
 : Name ('.' Name)*
 ;

className
 : Name
 ;

binaryLinkName
 : Name
 ;

attributeValue
 : Name
 ;

definedTypeName
 : Name
 ;

binaryOperator
  : EQ | NOTEQ | LT | LE | GT | GE
  ;

number
 : Int
 | Float
 ;


//----------------------------------------------------------
// Tokens
//----------------------------------------------------------
Range
 : Int? [ ]* '-' [ ]* Int
 | Int '-' [ ]*
 | QuotedString? [ ]* '-' [ ]* QuotedString
 | QuotedString '-' [ ]*
 ;

Int
 : Digit+
 ;

Float
 : Digit+ ('.' Digit*)?
 ;

Name
 : [a-zA-Z0-9_\-\u0410-\u044F]+
 ;

EQ      : '=' ;
NOTEQ   : '=/=' ;
LT      : '<' ;
LE      : '<=' ;
GT      : '>' ;
GE      : '>=' ;


QuotedString
 : ["] (~["\r\n] | '\\\\' | '\\"')* ["]
 | ['] (~['\r\n] | '\\\\' | '\\\'')* [']
 ;

Comment
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;


fragment Digit
 : [0-9]
 ;