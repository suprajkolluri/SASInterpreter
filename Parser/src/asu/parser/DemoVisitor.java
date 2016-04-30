// Generated from Demo.g4 by ANTLR 4.5.3
package asu.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(DemoParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(DemoParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(DemoParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#elseblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseblock(DemoParser.ElseblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DemoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DemoParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(DemoParser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(DemoParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DemoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(DemoParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#iexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIexp(DemoParser.IexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(DemoParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp(DemoParser.BexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(DemoParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DemoParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(DemoParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#stackdeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackdeclare(DemoParser.StackdeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DemoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#assignwithfunccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignwithfunccall(DemoParser.AssignwithfunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funcargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncargs(DemoParser.FuncargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funccallargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccallargs(DemoParser.FunccallargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funcDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclare(DemoParser.FuncDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#returnexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnexp(DemoParser.ReturnexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(DemoParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(DemoParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPop(DemoParser.PopContext ctx);
}