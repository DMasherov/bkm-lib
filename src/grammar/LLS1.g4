// LLS1 (Logical specification language-1)
grammar LLS1;

statements : (statement '.')+ ;

//----------------------------------------------------------
// C,L,P-terms and statement
//----------------------------------------------------------
c
 : Name           # NamedC
 | 'NOT' c        # notC
 | c ':' variable # conceptVariableC
 | c 'AND' c      # andC
 | c 'OR' c       # orC
 | c 'THAT' p     # thatC
 | 'THOSE' p      # thoseC
 | '(' c ')'      # bracketedC
 ;

l
 : Name            # NamedL
 | 'NOT' l         # notL
 | l 'AND' l       # andL
 | l 'OR' l        # orL
 | 'INV' '(' l ')' # invL
 | '(' l ')'       # bracketedL
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

statement
 : 'NOT' statement             # notStatement
 | statement 'AND' statement   # andStatement
 | statement 'OR' statement    # orStatement
 | statement 'IMP' statement   # impStatement
 | 'EXIST' c                   # existCStatement
 | 'EXIST' l                   # existLStatement
 | 'NULL' c                    # nullCStatement
 | 'NULL' l                    # nullLStatement
 | c 'ISA' c                   # isaCStatement
 | l 'ISA' l                   # isaLStatement
 | c '=' c                     # equalsCStatement
 | l '=' l                     # equalsLStatement
 | p '=' p                     # equalsPStatement
 | c '=' 'NOT' c               # notEqualsCStatement
 | l '=' 'NOT' l               # notEqualsLStatement
 | 'EACH' c p                  # eachStatement
 | 'SOME' c p                  # someStatement
 | '(' statement ')'           # bracketedStatement
 ;

variable : Name;
surrogate : Name;

//----------------------------------------------------------
// Tokens
//----------------------------------------------------------
Name
 : [a-zA-Z0-9_\-\u0410-\u044F]+
 ;

Comment
 : ('//' ~[\r\n]* | '/*' .*? '*/') -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;
