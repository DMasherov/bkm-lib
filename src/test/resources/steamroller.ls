Wolf ISA Animal.
Fox ISA Animal.
Bird ISA Animal.
Caterpillar ISA Animal.
Snail ISA Animal.
EXIST Wolf.
EXIST Fox.
EXIST Bird.
EXIST Caterpillar.
EXIST Snail.
Grain ISA Plant.
EXIST Grain.
EACH Animal:X LikesToEat SOME Plant OR LikesToEat EACH Animal THAT Smaller EACH X AND LikesToEat SOME Plant.
EACH Caterpillar Smaller EACH Bird.
EACH Bird Smaller EACH Fox.
EACH Fox Smaller EACH Wolf.
EACH Wolf NOT LikesToEat EACH (Caterpilar OR Plant).
EACH Bird (LikeToEat EACH Caterpillar AND (NOT LikeToEat) EACH Snail).
EACH (Caterpillar OR Snail) LikesToEat SOME Plant.
EXIST Animal THAT LikeToEat SOME Animal THAT LikeToEat SOME Grain.