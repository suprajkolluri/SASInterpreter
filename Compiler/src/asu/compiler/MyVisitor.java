package asu.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import asu.parser.DemoBaseVisitor;
import asu.parser.DemoParser.AssignContext;
import asu.parser.DemoParser.AssignwithfunccallContext;
import asu.parser.DemoParser.BexpContext;
import asu.parser.DemoParser.BlockContext;
import asu.parser.DemoParser.ComparisonContext;
import asu.parser.DemoParser.ConditionContext;
import asu.parser.DemoParser.ConditionalContext;
import asu.parser.DemoParser.DeclareContext;
import asu.parser.DemoParser.ElseblockContext;
import asu.parser.DemoParser.EqualityContext;
import asu.parser.DemoParser.FuncCallContext;
import asu.parser.DemoParser.FuncDeclareContext;
import asu.parser.DemoParser.FuncargsContext;
import asu.parser.DemoParser.FuncblockContext;
import asu.parser.DemoParser.FunccallargsContext;
import asu.parser.DemoParser.IexpContext;
import asu.parser.DemoParser.IfblockContext;
import asu.parser.DemoParser.MainContext;
import asu.parser.DemoParser.PopContext;
import asu.parser.DemoParser.PrintContext;
import asu.parser.DemoParser.PrintlnContext;
import asu.parser.DemoParser.ProgramContext;
import asu.parser.DemoParser.PushContext;
import asu.parser.DemoParser.ReturnexpContext;
import asu.parser.DemoParser.StackdeclareContext;

public class MyVisitor extends DemoBaseVisitor<String> {

    private static int count = -1;
    public static List<String> statements = new ArrayList<>();
    private static Stack<Integer> conditionStack = new Stack<>();
    private static Stack<Integer> whileIndexStack = new Stack<>();
     
    /**
     * @param ctx
     * @return returns final program string (op code)
     */
    @Override
    public String visitProgram(ProgramContext ctx) {
        statements.add("PSTART");
        visitChildren(ctx);
        statements.add("PEND");
        return "";
    }

    /**
     * @param ctx
     * @return returns the declaration op code
     */
    @Override
    public String visitDeclare(DeclareContext ctx) {
        if(ctx.getChild(0).getText().equals("BOOLEAN"))
            statements.add("DCLRB " + ctx.getChild(2));
        else
            statements.add("DCLRI " + ctx.getChild(2));
        return null;
    }

    /**
     * @param ctx
     *            integer expression context
     * @return returns the op code for integer expressions
     */
    @Override
    public String visitIexp(IexpContext ctx) {
        String temp = visitChildren(ctx);

        if(ctx.getChildCount() == 1) {
            return ctx.getChild(0).getText();
        } else if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else if(ctx.INT() != null) {
            count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + "," + temp.replace("\n", ",") + "," + ctx.INT().getText());
            return "$" + count;
        } 
        
        else if(ctx.IDENTIFIER()!=null){
        	count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + "," + temp.replace("\n", ",") + "," + ctx.IDENTIFIER().getText());
            return "$" + count;
        	
        }
        
        else {
            count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + "," + temp.replace("\n", ","));
            return "$" + count;
        }
    }

    /**
     *  @param ctx
     * @return returns the op code for assignment statements
     */
    @Override
    public String visitAssign(AssignContext ctx) {
        String temp = visitChildren(ctx);
        statements.add("STORE " + ctx.getChild(0).getText() + "," + temp.replace("\n", ""));
        return null;
    }

    
    /**
     * @param ctx
     * @return returns the op code for boolean expressions
     */
    @Override
    public String visitBexp(BexpContext ctx) {
        visitChildren(ctx);
        if(ctx.getChild(0).getText().equals("NOT")) {
            count += 1;
            statements.add(ctx.getChild(0).getText() + " $" + count + " " + ctx.getChild(2).getText());
            return "$" + count;
        } else if(ctx.BOOL() != null) {
            count += 1;
            statements.add("STORE " + " $" + count + " " + ctx.getText());
            return "$" + count;

        }
        return ctx.getChild(0).getText();
    }

    /**
     * @param ctx
     * @return returns the op code for conditional expressions
     */
    @Override
    public String visitConditional(ConditionalContext ctx) {
        String temp = visitChildren(ctx);
        if(ctx.getChildCount() == 1) {
            return temp;
        } else if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else {
            count += 1;
            statements.add(ctx.getChild(2).getText() + " $" + count + "," + temp.replace("\n", ","));
            return "$" + count;
        }
    }

    /**
     * @param ctx
     * @return returns the op coe for the comparison context
     */
    @Override
    public String visitComparison(ComparisonContext ctx) {
        String temp = visitChildren(ctx);
        if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else {
            count += 1;
            statements.add(getCOperation(ctx.getChild(1).getText()) + " $" + count + " " + temp.replace("\n", " "));
            return "$" + count;
        }
    }

    /**
     * @param ctx
     * @return return the op code for an equality comparison context
     */
    @Override
    public String visitEquality(EqualityContext ctx) {
        String temp = visitChildren(ctx);
        if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else {
            count += 1;
            statements.add(getEOperation(ctx.getChild(1).getText()) + " $" + count + " " + temp.replace("\n", " "));
            return "$" + count;
        }
    }

    /**
     * @param ctx
     *            block
     */
    @Override
    public String visitBlock(BlockContext ctx) {
        if(ctx.getChildCount() > 0) {
           /* if(ctx.getChild(0).getText().equals("IF")) {
                statements.add("IF");
                visitChildren(ctx);
                int index=ifIndexStack.pop();
                String stmt = statements.get(index);
                stmt += "," + (statements.size() + 1);
                if(ctx.getChildCount()==3)
                    stmt += "," + (statements.size() + 1);
                statements.set(index, stmt);
                
               
            } else*/
        	if(ctx.getChild(0).getText().equals("WHILE")){
        		statements.add("LOOP");
        		whileIndexStack.push(statements.size());
        		visitChildren(ctx);
        		int index=conditionStack.pop();
        		String stmt = statements.get(index);
                stmt += "," + (statements.size() + 1);
                statements.set(index, stmt);
                whileIndexStack.pop();
        	}
        	
        	else if(ctx.getChild(0).getText().equals("{")) {
                statements.add("BSTART");
                visitChildren(ctx);
                if(!whileIndexStack.isEmpty()){
                	int index=whileIndexStack.peek();
                	statements.add("GOTO "+index);
                }
                statements.add("BEND");
            } else {
                visitChildren(ctx);
            }
        }
        return "";
    }

    @Override
    public String visitIfblock(IfblockContext ctx) {
    	// TODO Auto-generated method stub
    	//return super.visitIfblock(ctx);
    	statements.add("IF");
    	visitChildren(ctx);
    	int index=conditionStack.pop();
        String stmt = statements.get(index);
        stmt += "," + (statements.size() + 1);
        if(ctx.getChildCount()==3)
            stmt += "," + (statements.size() + 1);
        statements.set(index, stmt);
        return "";

    }
    
    @Override
    public String visitElseblock(ElseblockContext ctx) {
        statements.add("ELSE");
        int index=conditionStack.peek();
        String stmt = statements.get(index);
        stmt += "," + (statements.size());
        statements.set(index, stmt);
        visitChildren(ctx);
        return "";
    }

    
    @Override
    public String visitCondition(ConditionContext ctx) {
        visitChildren(ctx);
        statements.add("CHECKT $" + count);
        int index = statements.size() - 1;
        conditionStack.push(index);
        return "";
    }

    @Override
    public String visitMain(MainContext ctx) {
        statements.add("MSTART");
        visitChildren(ctx);
        statements.add("MEND");
        return "";
    }

   
    @Override
    public String visitFuncblock(FuncblockContext ctx) {
    	// TODO Auto-generated method stub
          	
    	statements.add("BSTART");
    	visitChildren(ctx);
    	statements.add("BEND");
    	return "";
    }
    
    @Override
    public String visitFuncDeclare(FuncDeclareContext ctx) {
    	// TODO Auto-generated method stub
    	statements.add("FUNC "+ctx.getChild(2).getText());
    	visitChildren(ctx);
    	return "";
    }
    
    
    @Override
    public String visitFuncargs(FuncargsContext ctx) {
    	// TODO Auto-generated method stub
    	//return super.visitFuncargs(ctx);
    	int index=statements.size()-1;
    	String statement=statements.get(index);
    	int len=ctx.getChildCount();
        if(len>2){
    	statement+=","+ctx.getChild(1).getText();
        for(int i=3;i<len;i+=2){
        	statement+=","+ctx.getChild(i);
        }
        }
        statements.set(index, statement);
        return "";
    }
    
    @Override
    public String visitReturnexp(ReturnexpContext ctx) {
    	// TODO Auto-generated method stub
    	String temp=visitChildren(ctx);
    	temp=temp.replace("\n", "");
    	String statement="RETURN "+temp;
    	statements.add(statement);
    	return "";
    	//return super.visitReturnexp(ctx);
    }
   
 
    @Override
    public String visitFunccallargs(FunccallargsContext ctx) {
    	// TODO Auto-generated method stub
    	int index=statements.size()-1;
    	String statement=statements.get(index);
    	int len=ctx.getChildCount();
        if(len>2){
    	statement+=","+ctx.getChild(1).getText();
        for(int i=3;i<len;i+=2){
        	statement+=","+ctx.getChild(i);
        }
        }
        statements.set(index, statement);
        return "";
    
    }  

    @Override
    public String visitFuncCall(FuncCallContext ctx) {
    	// TODO Auto-generated method stub
    	statements.add("GOTO "+ctx.getChild(0).getText());
    	visitChildren(ctx);
    	return "";
     
    }
    
    @Override
    public String visitAssignwithfunccall(AssignwithfunccallContext ctx) {
    	// TODO Auto-generated method stub
      visitChildren(ctx);
      statements.add("STORE "+ctx.getChild(0).getText()+",POP()");
      return "";
    }
    
     
    /**
     * @param aggregate
     * @param nextResult
     * @return concatenates result strings
     */
    
    @Override
    public String visitPrint(PrintContext ctx) {
    	// TODO Auto-generated method stub
    statements.add("PRINT \""+ctx.getChild(2).getText()+"\"");
    return "";
    }
    
    @Override
    public String visitPrintln(PrintlnContext ctx) {
    	// TODO Auto-generated method stub
    	System.out.println(ctx.getChild(2).getText());
    	statements.add("PRINTLN \""+ctx.getChild(2).getText()+"\"");
        return "";    
    }
    
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null && nextResult == null) return "";
        if(aggregate == null) return nextResult;
        if(nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }

    @Override
    public String visitStackdeclare(StackdeclareContext ctx) {
    	// TODO Auto-generated method stub
        if(ctx.getChildCount()==3){
        	if(ctx.getChild(0).getText().equals("STACKI"))
        		statements.add("DECLARESI "+ctx.getChild(2).getText());
        	else if(ctx.getChild(0).getText().equals("STACKB"))
        		statements.add("DECLARESB "+ctx.getChild(2).getText());
        	else
        		statements.add("DECLARESS "+ctx.getChild(2).getText());
        		
        }
    return "";	
    }
   
    @Override
    public String visitPush(PushContext ctx) {
    	// TODO Auto-generated method stub
    if(ctx.getChildCount()==6){	
    statements.add("PUSH "+ctx.getChild(2).getText()+","+ctx.getChild(4).getText());
    }
    return "";
    }
   
    @Override
    public String visitPop(PopContext ctx) {
    	// TODO Auto-generated method stub
    	if(ctx.getChildCount()==6){	
    	    statements.add("POP "+ctx.getChild(2).getText()+","+ctx.getChild(4).getText());
    	    }
    	    return "";
    	  }
    /**
     * @param operation
     * @return return the right integer operation op code
     */
    private String getIOperation(String operation) {
        if(operation.equals("+")) return "ADD";
        if(operation.equals("-")) return "SUB";
        if(operation.equals("*")) return "MUL";
        if(operation.equals("%")) return "REM";
        return "DIV";
    }

    /**
     * @param operation
     * @return return the right comparison op code
     */
    private String getCOperation(String operation) {
        if(operation.equals("<")) return "LT";
        if(operation.equals(">")) return "GT";
        if(operation.equals("<=")) return "LTE";
        return "GTE";
    }

    /**
     * @param operation
     * @return return the right equality op code
     */
    private String getEOperation(String operation) {
        if(operation.equals("==")) return "EQ";
        return "NEQ";
    }
}
