grammar Module;
import LSS;

module : types? fun? ;

types : 'TYPES' (definedTypeSentence '.')+ 'END' ;

definedTypeSentence : Name EQ dataType ;

fun : 'FUN' Name ':' dataType '->' dataType funBody 'END';

/**
 Not implemented
*/
funBody : 'FUN_BODY' ;