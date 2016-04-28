// define a grammar called dello
grammar Demo;
program:PSTART NEWLINE global main global PEND; 
	  
global:((declare NEWLINE)+(assign NEWLINE)*(funcDeclare)*)+
       |((declare NEWLINE)*(assign NEWLINE)*(funcDeclare)+)+ 
       |;	   
	  
main:MSTART block MEND NEWLINE
    |MSTART NEWLINE (exp NEWLINE)+ block (exp NEWLINE)* MEND NEWLINE
	|MSTART NEWLINE (exp NEWLINE)* block (exp NEWLINE)+ MEND NEWLINE
	|MSTART NEWLINE block MEND NEWLINE;  

ifblock:IF condition block
       |IF condition block elseblock;  	
	
elseblock:ELSE (WS)*block;	  
	  
block:(exp NEWLINE)*
      |(exp NEWLINE)+ block 
      |block (exp NEWLINE)+
	  |BSTART NEWLINE block BEND NEWLINE
	  |ifblock
	  |WHILE condition block;			
             
			 
condition:'('conditional')';			 
			 
funcblock: BSTART NEWLINE block (returnexp NEWLINE)? BEND NEWLINE;
	  
IF:'IF';

WHILE:'WHILE';
 
ELSE:'ELSE';
	  	  
NEWLINE:'\n';         	
			
INT: [0-9]+;
				 
BOOL:'T'|'F' ;

STRING:'\"'('.'*)?'\"';

BSTART:'{';

BEND:'}';

exp:  print
     |println
     |iexp
     |conditional
	 |declare
	 |assign
	 |assignwithfunccall
	 |funcCall
	 |stackdeclare
	 |push
	 |pop;

print: 'PRINT' WS STRING
      |'PRINT' WS IDENTIFIER
      |'PRINT' WS INT
      |'PRINT' WS BOOL;	 
      
println: 'PRINTLN' WS STRING
      |'PRINTLN' WS IDENTIFIER
      |'PRINTLN' WS INT
      |'PRINTLN' WS BOOL;	 
            
	 
iexp: '(' iexp ')' 
      |iexp MULDIV INT  	 
      |iexp MULDIV '('iexp')'
	  |iexp ADDSUB iexp	  
	  |INT 
	  |iexp MULDIV IDENTIFIER
	  |IDENTIFIER;

ADDSUB: ('+'|'-');  
MULDIV: ('*'|'/'|'%');

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

STACKI:'STACKI';

STACKB:'STACKB';

STACKSTR:'STACKSTR';

IDENTIFIER:[A-Za-z]+;

declare: DATATYPE WS IDENTIFIER;
 
stackdeclare: STACKI WS IDENTIFIER
             |STACKB WS IDENTIFIER 
             |STACKSTR WS IDENTIFIER; 
        
WS:(' ')+;

assign:IDENTIFIER ASSIGNMENT iexp
	   |IDENTIFIER ASSIGNMENT conditional;
	   	   
assignwithfunccall:IDENTIFIER ASSIGNMENT funcCall;
	   
ASSIGNMENT:'='; 

PSTART:'[';

PEND:']';

MSTART:'--';

MEND:'!!';

funcargs:'('')'
         |'(' IDENTIFIER (','IDENTIFIER)* ')';

funccallargs:'('')'
            |'('(INT|BOOL|IDENTIFIER|iexp|conditional)(','(INT|BOOL|IDENTIFIER|iexp|conditional))*')';

funcDeclare:'FUNCTION' WS IDENTIFIER funcargs funcblock;
returnexp:  'RETURN' WS iexp
          | 'RETURN' WS conditional;  

funcCall:IDENTIFIER funccallargs;

push:'PUSH''('IDENTIFIER','INT')'
     |'PUSH''('IDENTIFIER','BOOL')'
     |'PUSH''('IDENTIFIER','STRING')'
     |'PUSH''('IDENTIFIER','IDENTIFIER')';
     
pop: 'POP''('IDENTIFIER','IDENTIFIER')';