package asu.compiler;

import asu.parser.DemoBaseVisitor;
import asu.parser.DemoParser.ExpContext;
import asu.parser.DemoParser.IexpContext;

public class MyVisitor extends DemoBaseVisitor<String> {

    @Override
    public String visitIexp(IexpContext ctx) {
        visitChildren(ctx);
        if(ctx.getChildCount() == 1) {
            return ctx.getChild(0).getText() + "\n";
        } else {
            return ctx.getChild(2).getText() + "\n";
        }
    }

    @Override
    public String visitExp(ExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null && nextResult == null) return "";
        if(aggregate == null) return nextResult;
        if(nextResult == null) return aggregate;
        return aggregate + "\n" + nextResult;
    }
}
