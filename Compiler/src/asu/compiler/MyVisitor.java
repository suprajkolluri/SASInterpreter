package asu.compiler;

import java.util.ArrayList;
import java.util.List;

import asu.parser.DemoBaseVisitor;
import asu.parser.DemoParser.AssignContext;
import asu.parser.DemoParser.BexpContext;
import asu.parser.DemoParser.BlockContext;
import asu.parser.DemoParser.ComparisonContext;
import asu.parser.DemoParser.ConditionalContext;
import asu.parser.DemoParser.DeclareContext;
import asu.parser.DemoParser.EqualityContext;
import asu.parser.DemoParser.IexpContext;
import asu.parser.DemoParser.ProgramContext;

public class MyVisitor extends DemoBaseVisitor<String> {

    private static int count = -1;
    public static List<String> statements = new ArrayList<>();

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
     * @param ctx integer expression context
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
        } else {
            count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + "," + temp.replace("\n", ","));
            return "$" + count;
        }
    }

    /**
     * @param ctx
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
            return ctx.BOOL().getText();
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
        if(ctx.getChildCount() == 1)
            return temp;
        else if(ctx.getChild(0).getText().equals("(")) {
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
     * @param ctx block 
     */
    @Override
    public String visitBlock(BlockContext ctx) {
        statements.add("BSTART");
        visitChildren(ctx);
        statements.add("BEND");
        return "";
    }

    /**
     * @param aggregate
     * @param nextResult
     * @return concatenates result strings
     */
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null && nextResult == null) return "";
        if(aggregate == null) return nextResult;
        if(nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }

    /**
     * @param operation
     * @return return the right integer operation op code
     */
    private String getIOperation(String operation) {
        if(operation.equals("+")) return "ADD";
        if(operation.equals("-")) return "SUB";
        if(operation.equals("*")) return "MUL";
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
