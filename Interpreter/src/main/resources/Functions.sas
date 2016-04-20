PSTART
MSTART
STORE x,3
STORE y,2
GOTO add,x,y
STORE z,POP()
PRINT "The sum is "
PRINTLN z
GOTO sub,x,y
GOTO sub,5,1
GOTO sub,x,1
GOTO returnfunc
PRINTLN POP()
MEND
FUNC add,a,b
ADD c,a,b
RETURN c
FEND
FUNC sub,a,b
SUB c,a,b
PRINT "The sub is "
PRINTLN c
FEND
FUNC returnfunc
RETURN "RETURNING"
FEND
PEND