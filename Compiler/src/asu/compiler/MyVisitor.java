package asu.compiler;

import java.util.ArrayList;
import java.util.List;

import asu.parser.DemoBaseVisitor;
import asu.parser.DemoParser.AssignContext;
import asu.parser.DemoParser.DeclareContext;
import asu.parser.DemoParser.IexpContext;

public class MyVisitor extends DemoBaseVisitor<String> {

    private static int count = -1;
    public static List<String> statements = new ArrayList<>();

    @Override
    public String visitDeclare(DeclareContext ctx) {
        statements.add("DCLRI "+ctx.getChild(2));
        return null;
    }
    
    @Override
    public String visitIexp(IexpContext ctx) {
        String temp = visitChildren(ctx);

        if(ctx.getChildCount() == 1) {
            return ctx.getChild(0).getText();
        } else if(ctx.INT() != null) {
            count += 1;
            statements.add("MULT $" + count + " " + temp.replace("\n", " ") + " " + ctx.INT().getText());
            return "$" + count;
        } else {
            count += 1;
            statements.add("ADD $" + count + " " + temp.replace("\n", " "));
            return "$" + count;
        }
    }

    @Override
    public String visitAssign(AssignContext ctx) {
        visitChildren(ctx);
        statements.add("STORE " + ctx.getChild(0).getText() + ",$" + count);
        return null;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null && nextResult == null) return "";
        if(aggregate == null) return nextResult;
        if(nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }
}
