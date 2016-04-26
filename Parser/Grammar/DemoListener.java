// Generated from Demo.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DemoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DemoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DemoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void enterFuncblock(DemoParser.FuncblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#funcblock}.
	 * @param ctx the parse tree
	 */
	void exitFuncblock(DemoParser.FuncblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void enterIfblock(DemoParser.IfblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#ifblock}.
	 * @param ctx the parse tree
	 */
	void exitIfblock(DemoParser.IfblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(DemoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(DemoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#iexp}.
	 * @param ctx the parse tree
	 */
	void enterIexp(DemoParser.IexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#iexp}.
	 * @param ctx the parse tree
	 */
	void exitIexp(DemoParser.IexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(DemoParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(DemoParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBexp(DemoParser.BexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBexp(DemoParser.BexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(DemoParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(DemoParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DemoParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DemoParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(DemoParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(DemoParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DemoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DemoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclare(DemoParser.FuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#funcDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclare(DemoParser.FuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#returnexp}.
	 * @param ctx the parse tree
	 */
	void enterReturnexp(DemoParser.ReturnexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#returnexp}.
	 * @param ctx the parse tree
	 */
	void exitReturnexp(DemoParser.ReturnexpContext ctx);
}