Prefix(:=<http://mpei.ru/bkm//2017/5/16/mine#>)
Prefix(owl:=<http://www.w3.org/2002/07/owl#>)
Prefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)
Prefix(xml:=<http://www.w3.org/XML/1998/namespace>)
Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)
Prefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)
Ontology(<http://mpei.ru/bkm//2017/5/16/mine>

# declarations
Declaration(Class(<A>))
Declaration(Class(<B>))
Declaration(Class(<C>))
Declaration(Class(<D>))
Declaration(Class(<E>))
Declaration(ObjectProperty(<related_to>))
FunctionalObjectProperty(<related_to_Name>)
FunctionalDataProperty(<A_Attribute>)
FunctionalDataProperty(<related_to_R>)

# A ISA B.
SubClassOf(<A> <B>)
# EACH A related_to SOME B.
SubClassOf(<A> ObjectSomeValuesFrom(<related_to> <B>))
# EACH E related_to ONLY B.
SubClassOf(<E> ObjectAllValuesFrom(<related_to> <B>))
# NULL A.
EquivalentClasses(<A> owl:Nothing)
# (C THAT related_to SOME A) OR D ISA A.
SubClassOf(ObjectUnionOf(ObjectIntersectionOf(<C> ObjectSomeValuesFrom(<related_to> <A>)) <D> )
           ObjectIntersectionOf(ObjectUnionOf(<A> <B>) ObjectSomeValuesFrom(<related_to> <C>)))
# EXIST (D OR THOSE (related_to SOME B)).
ClassAssertion(ObjectUnionOf(<D> ObjectSomeValuesFrom(<related_to> <B>)) _:skolem) )
