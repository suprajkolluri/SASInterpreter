// define a grammar called dello
grammar Demo;
program:PSTART NEWLINE global main global PEND; 
	  
global:((declare NEWLINE)+|(assign NEWLINE)*(funcDeclare)*)+
       |((declare NEWLINE)*(assign NEWLINE)*(funcDeclare)+)+
       |	   
       |;	   
	  
main:MSTART block MEND NEWLINE
    |MSTART NEWLINE (exp NEWLINE)+ block (exp NEWLINE)* MEND NEWLINE
	|MSTART NEWLINE (exp NEWLINE)* block (exp NEWLINE)+ MEND NEWLINE;
	  
block:(exp NEWLINE)*
			|BSTART NEWLINE block BEND NEWLINE
			|IF '('conditional')' block
            |IF '('conditional')' block ELSE (WS)* block  
	        |WHILE '('conditional')' block;			
             
funcblock: BSTART NEWLINE block (returnexp NEWLINE)? BEND NEWLINE;
	  
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
	 |assign
	 |funcCall;
	 
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
 
DATATYPE:('INTEGER'|'BOOLEAN'|'VOID');

IDENTIFIER:[A-Za-z]+;

declare:DATATYPE WS IDENTIFIER; 

WS:(' ')+;

assign: IDENTIFIER ASSIGNMENT INT
	   |IDENTIFIER ASSIGNMENT iexp
	   |IDENTIFIER ASSIGNMENT conditional
	   |IDENTIFIER ASSIGNMENT funcCall;
	   
ASSIGNMENT:'='; 

PSTART:'[';

PEND:']';

MSTART:'--';

MEND:'!!';

funcDeclare:'FUNCTION' WS IDENTIFIER '('')' funcblock
           |'FUNCTION' WS IDENTIFIER '(' IDENTIFIER (','IDENTIFIER)* ')' funcblock;
		   
returnexp:  'RETURN' WS iexp
          | 'RETURN' WS conditional;  

funcCall:IDENTIFIER'('')'
        |IDENTIFIER'('(INT|BOOL|IDENTIFIER)(','(INT|BOOL|IDENTIFIER))*')';  		  