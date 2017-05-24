// LS (Logical specification) Language
grammar LS;

//----------------------------------------------------------
// Top rules
//----------------------------------------------------------

// ontology is a set of sentences separated by '.'
// ontology with name is called Scheme.
ontology
 :
 (
 'SCHEME' Name ':' (sentence '.')+ 'END'
 | (sentence '.')+
 )
 EOF
 ;


//----------------------------------------------------------
// Sentence rules
//----------------------------------------------------------
sentence
 : declaration
 | logicalSentence
 ;

declaration
 : classDeclaration
 | binaryLinkDeclaration
 ;

logicalSentence
 : 'NOT' logicalSentence                  #notSentence
 | logicalSentence 'AND' logicalSentence  #andSentence
 | logicalSentence 'OR' logicalSentence   #orSentence
 | logicalSentence 'IMP' logicalSentence  #impSentence
 | statement                              #justStatement
 | '(' logicalSentence ')'                #bracketedStatement
 ;

statement
  : existence
  | isa
  | equality
  | quantifier
  ;

// the following rules for statements should be processed correctly since
// they can mean both c-term and l-term
existence : exist | notExist ;

exist : 'EXIST' c | 'EXIST' l;
notExist : 'NULL' c | 'NULL' l ;

isa : c 'ISA' c | l 'ISA' l ;

equality
 : c '=' c            # equalsCStatement
 | l '=' l            # equalsLStatement
 | p '=' p            # equalsPStatement
 | c '=' 'NOT' c      # notEqualsCStatement
 | l '=' 'NOT' l      # notEqualsLStatement
 ;

quantifier
 : 'EACH' c p         # eachStatement
 | 'SOME' c p         # someStatement
 ;

//----------------------------------------------------------
// C-, L- and P-terms
//----------------------------------------------------------

c
 : className attributeConstraints?               # withAttributesC
 | 'NOT' c                                       # notC
 | c ':' variable                                # conceptVariableC
 | c 'AND' c                                     # andC
 | c 'OR' c                                      # orC
 | c 'THAT' p                                    # thatC
 | 'THOSE' p                                     # thoseC
 | '(' c ')'                                     # bracketedC
 ;

l
 : binaryLinkName attributeConstraints?           # withAttributesL
 | 'NOT' l                                        # notL
 | l 'AND' l                                      # andL
 | l 'OR' l                                       # orL
 | 'INV' '(' l ')'                                # invL
 | '(' l ')'                                      # bracketedL
 ;

p
 : 'NOT' p                 # notP
 | p 'AND' p               # andP
 | p 'OR' p                # orP
 | l 'SOME' c              # someP
 | l 'EACH' c              # eachP
 | l 'ONLY' c              # onlyP
 | '(' l variable ')'      # predicateVariableP
 | '(' l surrogate ')'     # surrogateVariableP
 | '(' p ')'               # bracketedP
 ;

//----------------------------------------------------------
// Declarations
//----------------------------------------------------------
classDeclaration
  : className ('[' attributes ']')?
  ;

binaryLinkDeclaration
  : '(' classAttributeConstraint binaryLinkName intervalRestriction? classAttributeConstraint ')' ('[' attributes ']')?
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
classAttributeConstraint
 : conceptAttribute attributeConstraints?
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
attributeConstraints
 : '(' constraint (';' constraint)* ')'
 ;

constraint
 : selector binaryOperator (selector | attributeValue)
 ;

selector : Name ('.' Name)* ;

className : Name ;

binaryLinkName : Name ;

attributeValue : surrogate | dataValue ;

definedTypeName : Name ;

variable : Name ;

surrogate : '#' Int ;

binaryOperator : EQ | NOTEQ | LT | LE | GT | GE ;

dataValue
  : number
  | trueorfalse
  | string
  ;

trueorfalse : 'TRUE' | 'FALSE' ;

number : Int | Float ;

string : QuotedString ;

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
 : [a-zA-Z0-9_\\-\u0410-\u044F]+
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
