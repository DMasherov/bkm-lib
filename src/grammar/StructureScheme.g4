grammar StructureScheme;

import LSS;

//----------------------------------------------------------
// Scheme and concept rules
//----------------------------------------------------------

scheme
 : 'SCHEME' schemeName ':' (conceptSentence '.')+ 'END' EOF
 ;
schemeName
 : QuotedString
 ;

