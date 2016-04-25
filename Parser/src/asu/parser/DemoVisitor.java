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
	 * Visit a parse tree produced by {@link DemoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DemoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#funcblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncblock(DemoParser.FuncblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#ifblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfblock(DemoParser.IfblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DemoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(DemoParser.ExpContext ctx);
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
	 * Visit a parse tree produced by {@link DemoParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DemoParser.AssignContext ctx);
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
}