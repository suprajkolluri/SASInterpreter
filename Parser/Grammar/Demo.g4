// define a grammar called demo
grammar Demo;
program:PSTART NEWLINE (exp NEWLINE)* (block NEWLINE)* (exp NEWLINE)* PEND;


block:funcDeclare
      |IF '('conditional')' block
      |IF '('conditional')' block NEWLINE ELSE block  
	  |WHILE '('conditional')' block
      |BSTART NEWLINE (exp NEWLINE)* (block NEWLINE)+ (exp NEWLINE)* BEND
      |BSTART NEWLINE (exp NEWLINE)* BEND ;

funcblock: BSTART NEWLINE returnexp NEWLINE BEND;
	  
IF:'IF';

WHILE:'WHILE';
 
ELSE:'ELSE';

ifblock:IF WS '(' conditional ')';
	  	  
NEWLINE:'\n';         	
			
int: [0-9]+;
				 
bool:'T'|'F' ;

BSTART:'{';

BEND:'}';

exp:  iexp
     |conditional
	 |declare
	 |assign;
	 
iexp: '(' iexp ')' 
      |iexp MULDIV int  	 
      |iexp MULDIV '('iexp')'
	  |iexp ADDSUB iexp	  
	  |int 
	  |iexp MULDIV IDENTIFIER
	  |IDENTIFIER;

ADDSUB: ('+'|'-');  
MULDIV: ('*'|'/');

conditional:'(' conditional ')'
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
     |NOT BOOL
	 |NOT '('bexp')'
     |bexp AND BOOL
	 |bexp AND '('bexp')'
	 |bexp OR bexp	 
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
 
DATATYPE:('INTEGER'|'BOOLEAN');

IDENTIFIER:[A-Za-z]+;

declare:DATATYPE WS IDENTIFIER; 

WS:(' ')+;

assign: IDENTIFIER ASSIGNMENT int
       |IDENTIFIER ASSIGNMENT BOOL
	   |IDENTIFIER ASSIGNMENT iexp
	   |IDENTIFIER ASSIGNMENT conditional;
	   
ASSIGNMENT:'='; 

PSTART:'[';

PEND:']';

FUNCTIONNAME:IDENTIFIER;

funcDeclare:DATATYPE WS IDENTIFIER '('')' funcblock
           |DATATYPE WS IDENTIFIER '(' declare (','declare)* ')' funcblock;
		   
RETURN:'Return';		   

returnexp:  RETURN 
          | RETURN WS iexp
          | RETURN WS conditional;  		  