// define a grammar called dello
grammar Demo;
program:PSTART NEWLINE (exp NEWLINE)* (block NEWLINE)* (exp NEWLINE)* PEND;


block:funcDeclare
      |IF '('conditional')' block
      |IF '('conditional')' block NEWLINE ELSE (WS)* block  
	  |WHILE '('conditional')' block
      |BSTART NEWLINE (exp NEWLINE)* (block NEWLINE)+ (exp NEWLINE)* BEND
      |BSTART NEWLINE (exp NEWLINE)* BEND ;

funcblock: BSTART NEWLINE (exp NEWLINE)* (returnexp NEWLINE)?  BEND;
	  
IF:'IF';

WHILE:'WHILE';
 
ELSE:'ELSE';

ifblock:IF WS '(' conditional ')';
	  	  
NEWLINE:'\n';         	
			
INT: [0-9]+;
				 
BOOL:'T'|'F' ;

BSTART:'{';

BEND:'}';

exp:  iexp
     |conditional
	 |declare
	 |assign;
	 
iexp: '(' iexp ')' 
      |iexp MULDIV INT  	 
      |iexp MULDIV '('iexp')'
	  |iexp ADDSUB iexp	  
	  |INT 
	  |iexp MULDIV IDENTIFIER
	  |IDENTIFIER;

ADDSUB: ('+'|'-');  
MULDIV: ('*'|'/');

conditional:'(' conditional ')'
		   |NOT WS conditional
		   |NOT conditional
           |conditional EQUAL conditional
           |conditional WS AND WS conditional 		   
           |conditional WS OR WS conditional
		   |equality WS AND WS bexp
		   |equality WS OR WS bexp
           |bexp WS AND WS equality
		   |bexp WS OR WS equality
		   |comparison WS AND WS bexp
		   |comparison WS OR WS bexp
		   |bexp WS AND WS comparison
		   |bexp WS OR WS comparison
           |equality 
           |comparison
		   |bexp;

AND:'AND';

OR: 'OR';		   
		
NOT:'NOT';
			  
bexp:'(' bexp ')'
     |bexp WS AND WS BOOL
	 |bexp WS AND WS '('bexp')'
	 |bexp WS OR WS bexp	 
	 |BOOL
	 |IDENTIFIER;


equality:'(' equality ')'
         |equality EQUAL equality
		 |comparison EQUAL comparison
         |equality EQUAL comparison
         |comparison EQUAL equality   		 
         |equality EQUAL bexp
		 |bexp EQUAL equality
		 |comparison EQUAL bexp
		 |bexp EQUAL comparison
		 |bexp EQUAL bexp   
         |iexp EQUAL iexp;
	
EQUAL:('=='|'!=');		 

comparison:'(' comparison ')' 
           | iexp COMPARE iexp;

COMPARE:('<'|'>'|'<='|'>=');
 
DATATYPE:('INTEGER'|'BOOLEAN'|'VOID');

IDENTIFIER:[A-Za-z]+;

declare:DATATYPE WS IDENTIFIER; 

WS:(' ')+;

assign: IDENTIFIER ASSIGNMENT INT
	   |IDENTIFIER ASSIGNMENT iexp
	   |IDENTIFIER ASSIGNMENT conditional;
	   
ASSIGNMENT:'='; 

PSTART:'[';

PEND:']';

FUNCTIONNAME:IDENTIFIER;

funcDeclare:DATATYPE WS IDENTIFIER '('')' funcblock
           |DATATYPE WS IDENTIFIER '(' declare (','declare)* ')' funcblock;
		   
YIELD:'yield';		   

returnexp:  'RETURN' WS iexp
          | 'RETURN' WS conditional;  		  