package asu.compiler;

import java.util.ArrayList;
import java.util.List;

import asu.parser.DemoBaseVisitor;
import asu.parser.DemoParser.AssignContext;
import asu.parser.DemoParser.BexpContext;
import asu.parser.DemoParser.ComparisonContext;
import asu.parser.DemoParser.ConditionalContext;
import asu.parser.DemoParser.DeclareContext;
import asu.parser.DemoParser.EqualityContext;
import asu.parser.DemoParser.IexpContext;

public class MyVisitor extends DemoBaseVisitor<String> {

    private static int count = -1;
    public static List<String> statements = new ArrayList<>();

    @Override
    public String visitDeclare(DeclareContext ctx) {
        if(ctx.getChild(0).getText().equals("BOOLEAN"))
            statements.add("DCLRB " + ctx.getChild(2));
        else
            statements.add("DCLRI " + ctx.getChild(2));
        return null;
    }

    @Override
    public String visitIexp(IexpContext ctx) {
        String temp = visitChildren(ctx);

        if(ctx.getChildCount() == 1) {
            return ctx.getChild(0).getText();
        } else if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else if(ctx.INT() != null) {
            count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + " " + temp.replace("\n", " ") + " " + ctx.INT().getText());
            return "$" + count;
        } else {
            count += 1;
            statements.add(getIOperation(ctx.getChild(1).getText()) + " $" + count + " " + temp.replace("\n", " "));
            return "$" + count;
        }
    }

    @Override
    public String visitAssign(AssignContext ctx) {
        String temp = visitChildren(ctx);
        statements.add("STORE " + ctx.getChild(0).getText() + "," + temp.replace("\n", ""));
        return null;
    }

    @Override
    public String visitBexp(BexpContext ctx) {
        String temp = visitChildren(ctx);
        if(ctx.getChildCount() == 1) return ctx.getChild(0).getText();
        return ctx.BOOL().getText();
    }

    @Override
    public String visitConditional(ConditionalContext ctx) {
        String temp = visitChildren(ctx);
        if(ctx.getChildCount() == 1) {
            return temp;
        } else if(ctx.getChild(0).getText().equals("(")) {
            return "$" + count;
        } else {
            count += 1;
            statements.add(ctx.getChild(2).getText() + " $" + count + " " + temp.replace("\n", " "));
            return "$" + count;
        }
    }

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

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null && nextResult == null) return "";
        if(aggregate == null) return nextResult;
        if(nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }

    private String getIOperation(String operation) {
        if(operation.equals("+")) return "ADD";
        if(operation.equals("-")) return "SUB";
        if(operation.equals("*")) return "MULT";
        return "DIV";
    }

    private String getCOperation(String operation) {
        if(operation.equals("<")) return "LT";
        if(operation.equals(">")) return "GT";
        if(operation.equals("<=")) return "LTE";
        return "GTE";
    }

    private String getEOperation(String operation) {
        if(operation.equals("==")) return "EQ";
        return "NEQ";
    }
}
