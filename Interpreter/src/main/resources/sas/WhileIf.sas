PSTART
MSTART
DCLRI a
STORE a,1
LOOP
LT $1,a,5
CHECKT $1,24
BSTART
PRINTLN a
IF
REM $1,a,2
EQ $2,$1,0
CHECKT $2,17,21
BSTART
PRINTLN "EVEN"
BEND
ELSE
BSTART
PRINTLN "ODD"
BEND
ADD a,a,1
GOTO 5
BEND
PRINT "WHILE HAS ENDED"
MEND
PEND