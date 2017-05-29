A ISA B.
EACH A related_to SOME B.
EACH E related_to ONLY B.
NULL A.
(C THAT related_to SOME A) OR D ISA (A OR B THAT related_to SOME C).
EXIST (D OR THOSE (related_to SOME B)).
A[Attribute:String].
(C related_to A)[Name:B, R:Boolean].
