PSTART
MSTART
GOTO move,4,1,2,3
MEND
FUNC move,n,from,intermediate,to
BSTART
IF
GT $1,n,0
CHECKT $1,18,18
BSTART
SUB $2,n,1
GOTO move,$2,from,to,intermediate
PRINT "Move disk from "
PRINT from
PRINT " to "
PRINTLN to
GOTO move,$2,intermediate,from,to
BEND
BEND
FEND
PEND