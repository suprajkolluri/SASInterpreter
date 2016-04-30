// Generated from Demo.g4 by ANTLR 4.5.3
package asu.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IF=10, WHILE=11, ELSE=12, NEWLINE=13, INT=14, BOOL=15, STRING=16, BSTART=17, 
		BEND=18, ADDSUB=19, MULDIV=20, AND=21, OR=22, NOT=23, EQUAL=24, COMPARE=25, 
		DATATYPE=26, STACKI=27, STACKB=28, STACKSTR=29, IDENTIFIER=30, WS=31, 
		ASSIGNMENT=32, PSTART=33, PEND=34, MSTART=35, MEND=36;
	public static final int
		RULE_program = 0, RULE_global = 1, RULE_main = 2, RULE_ifblock = 3, RULE_elseblock = 4, 
		RULE_block = 5, RULE_condition = 6, RULE_funcblock = 7, RULE_exp = 8, 
		RULE_print = 9, RULE_println = 10, RULE_iexp = 11, RULE_conditional = 12, 
		RULE_bexp = 13, RULE_equality = 14, RULE_comparison = 15, RULE_declare = 16, 
		RULE_stackdeclare = 17, RULE_assign = 18, RULE_assignwithfunccall = 19, 
		RULE_funcargs = 20, RULE_funccallargs = 21, RULE_funcDeclare = 22, RULE_returnexp = 23, 
		RULE_funcCall = 24, RULE_push = 25, RULE_pop = 26;
	public static final String[] ruleNames = {
		"program", "global", "main", "ifblock", "elseblock", "block", "condition", 
		"funcblock", "exp", "print", "println", "iexp", "conditional", "bexp", 
		"equality", "comparison", "declare", "stackdeclare", "assign", "assignwithfunccall", 
		"funcargs", "funccallargs", "funcDeclare", "returnexp", "funcCall", "push", 
		"pop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'PRINT'", "'PRINTLN'", "','", "'FUNCTION'", "'RETURN'", 
		"'PUSH'", "'POP'", "'IF'", "'WHILE'", "'ELSE'", "'\n'", null, null, null, 
		"'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, null, null, 
		"'STACKI'", "'STACKB'", "'STACKSTR'", null, null, "'='", "'['", "']'", 
		"'--'", "'!!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "IF", "WHILE", 
		"ELSE", "NEWLINE", "INT", "BOOL", "STRING", "BSTART", "BEND", "ADDSUB", 
		"MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", "DATATYPE", "STACKI", 
		"STACKB", "STACKSTR", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", 
		"MSTART", "MEND"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Demo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DemoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PSTART() { return getToken(DemoParser.PSTART, 0); }
		public TerminalNode NEWLINE() { return getToken(DemoParser.NEWLINE, 0); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode PEND() { return getToken(DemoParser.PEND, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PSTART);
			setState(55);
			match(NEWLINE);
			setState(56);
			global();
			setState(57);
			main();
			setState(58);
			global();
			setState(59);
			match(PEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalContext extends ParserRuleContext {
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<FuncDeclareContext> funcDeclare() {
			return getRuleContexts(FuncDeclareContext.class);
		}
		public FuncDeclareContext funcDeclare(int i) {
			return getRuleContext(FuncDeclareContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		int _la;
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(61);
							declare();
							setState(62);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(66); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(68);
						assign();
						setState(69);
						match(NEWLINE);
						}
						}
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(76);
						funcDeclare();
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DATATYPE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE) {
						{
						{
						setState(86);
						declare();
						setState(87);
						match(NEWLINE);
						}
						}
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(94);
						assign();
						setState(95);
						match(NEWLINE);
						}
						}
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(102);
							funcDeclare();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(105); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << DATATYPE) | (1L << IDENTIFIER))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MSTART() { return getToken(DemoParser.MSTART, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode MEND() { return getToken(DemoParser.MEND, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		int _la;
		try {
			int _alt;
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(MSTART);
				setState(115);
				block(0);
				setState(116);
				match(MEND);
				setState(117);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(MSTART);
				setState(120);
				match(NEWLINE);
				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(121);
						exp();
						setState(122);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(128);
				block(0);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << STACKI) | (1L << STACKB) | (1L << STACKSTR) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(129);
					exp();
					setState(130);
					match(NEWLINE);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(MEND);
				setState(138);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(MSTART);
				setState(141);
				match(NEWLINE);
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(142);
						exp();
						setState(143);
						match(NEWLINE);
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(150);
				block(0);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					exp();
					setState(152);
					match(NEWLINE);
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << STACKI) | (1L << STACKB) | (1L << STACKSTR) | (1L << IDENTIFIER))) != 0) );
				setState(158);
				match(MEND);
				setState(159);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(MSTART);
				setState(162);
				match(NEWLINE);
				setState(163);
				block(0);
				setState(164);
				match(MEND);
				setState(165);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfblockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DemoParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseblockContext elseblock() {
			return getRuleContext(ElseblockContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifblock);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(IF);
				setState(170);
				condition();
				setState(171);
				block(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IF);
				setState(174);
				condition();
				setState(175);
				block(0);
				setState(176);
				elseblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseblockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DemoParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(DemoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DemoParser.WS, i);
		}
		public ElseblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitElseblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseblockContext elseblock() throws RecognitionException {
		ElseblockContext _localctx = new ElseblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ELSE);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(WS);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(187);
			block(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BSTART() { return getToken(DemoParser.BSTART, 0); }
		public TerminalNode BEND() { return getToken(DemoParser.BEND, 0); }
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DemoParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		return block(0);
	}

	private BlockContext block(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockContext _localctx = new BlockContext(_ctx, _parentState);
		BlockContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_block, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(190);
						exp();
						setState(191);
						match(NEWLINE);
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(201); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(198);
						exp();
						setState(199);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(203); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(205);
				block(5);
				}
				break;
			case 3:
				{
				setState(207);
				match(BSTART);
				setState(208);
				match(NEWLINE);
				setState(209);
				block(0);
				setState(210);
				match(BEND);
				setState(211);
				match(NEWLINE);
				}
				break;
			case 4:
				{
				setState(213);
				ifblock();
				}
				break;
			case 5:
				{
				setState(214);
				match(WHILE);
				setState(215);
				condition();
				setState(216);
				block(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_block);
					setState(220);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(224); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(221);
							exp();
							setState(222);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(226); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__0);
			setState(234);
			conditional(0);
			setState(235);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncblockContext extends ParserRuleContext {
		public TerminalNode BSTART() { return getToken(DemoParser.BSTART, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode BEND() { return getToken(DemoParser.BEND, 0); }
		public ReturnexpContext returnexp() {
			return getRuleContext(ReturnexpContext.class,0);
		}
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFuncblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(BSTART);
			setState(238);
			match(NEWLINE);
			setState(239);
			block(0);
			setState(243);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(240);
				returnexp();
				setState(241);
				match(NEWLINE);
				}
			}

			setState(245);
			match(BEND);
			setState(246);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public IexpContext iexp() {
			return getRuleContext(IexpContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignwithfunccallContext assignwithfunccall() {
			return getRuleContext(AssignwithfunccallContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public StackdeclareContext stackdeclare() {
			return getRuleContext(StackdeclareContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				println();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				iexp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				conditional(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				declare();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				assignwithfunccall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				stackdeclare();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(257);
				push();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(258);
				pop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__2);
				setState(262);
				match(WS);
				setState(263);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__2);
				setState(265);
				match(WS);
				setState(266);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				match(T__2);
				setState(268);
				match(WS);
				setState(269);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(T__2);
				setState(271);
				match(WS);
				setState(272);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_println);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__3);
				setState(276);
				match(WS);
				setState(277);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__3);
				setState(279);
				match(WS);
				setState(280);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(T__3);
				setState(282);
				match(WS);
				setState(283);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(T__3);
				setState(285);
				match(WS);
				setState(286);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IexpContext extends ParserRuleContext {
		public List<IexpContext> iexp() {
			return getRuleContexts(IexpContext.class);
		}
		public IexpContext iexp(int i) {
			return getRuleContext(IexpContext.class,i);
		}
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode ADDSUB() { return getToken(DemoParser.ADDSUB, 0); }
		public TerminalNode MULDIV() { return getToken(DemoParser.MULDIV, 0); }
		public IexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitIexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IexpContext iexp() throws RecognitionException {
		return iexp(0);
	}

	private IexpContext iexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IexpContext _localctx = new IexpContext(_ctx, _parentState);
		IexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_iexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(290);
				match(T__0);
				setState(291);
				iexp(0);
				setState(292);
				match(T__1);
				}
				break;
			case INT:
				{
				setState(294);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				setState(295);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(298);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(299);
						match(ADDSUB);
						setState(300);
						iexp(5);
						}
						break;
					case 2:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						match(MULDIV);
						setState(303);
						match(INT);
						}
						break;
					case 3:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(304);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(305);
						match(MULDIV);
						setState(306);
						match(T__0);
						setState(307);
						iexp(0);
						setState(308);
						match(T__1);
						}
						break;
					case 4:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(310);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(311);
						match(MULDIV);
						setState(312);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public TerminalNode NOT() { return getToken(DemoParser.NOT, 0); }
		public List<TerminalNode> WS() { return getTokens(DemoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DemoParser.WS, i);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TerminalNode AND() { return getToken(DemoParser.AND, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode OR() { return getToken(DemoParser.OR, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(DemoParser.EQUAL, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		return conditional(0);
	}

	private ConditionalContext conditional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalContext _localctx = new ConditionalContext(_ctx, _parentState);
		ConditionalContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_conditional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(319);
				match(T__0);
				setState(320);
				conditional(0);
				setState(321);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(323);
				match(NOT);
				setState(324);
				match(WS);
				setState(325);
				conditional(16);
				}
				break;
			case 3:
				{
				setState(326);
				match(NOT);
				setState(327);
				conditional(15);
				}
				break;
			case 4:
				{
				setState(328);
				equality(0);
				setState(329);
				match(WS);
				setState(330);
				match(AND);
				setState(331);
				match(WS);
				setState(332);
				bexp(0);
				}
				break;
			case 5:
				{
				setState(334);
				equality(0);
				setState(335);
				match(WS);
				setState(336);
				match(OR);
				setState(337);
				match(WS);
				setState(338);
				bexp(0);
				}
				break;
			case 6:
				{
				setState(340);
				bexp(0);
				setState(341);
				match(WS);
				setState(342);
				match(AND);
				setState(343);
				match(WS);
				setState(344);
				equality(0);
				}
				break;
			case 7:
				{
				setState(346);
				bexp(0);
				setState(347);
				match(WS);
				setState(348);
				match(OR);
				setState(349);
				match(WS);
				setState(350);
				equality(0);
				}
				break;
			case 8:
				{
				setState(352);
				comparison();
				setState(353);
				match(WS);
				setState(354);
				match(AND);
				setState(355);
				match(WS);
				setState(356);
				bexp(0);
				}
				break;
			case 9:
				{
				setState(358);
				comparison();
				setState(359);
				match(WS);
				setState(360);
				match(OR);
				setState(361);
				match(WS);
				setState(362);
				bexp(0);
				}
				break;
			case 10:
				{
				setState(364);
				bexp(0);
				setState(365);
				match(WS);
				setState(366);
				match(AND);
				setState(367);
				match(WS);
				setState(368);
				comparison();
				}
				break;
			case 11:
				{
				setState(370);
				bexp(0);
				setState(371);
				match(WS);
				setState(372);
				match(OR);
				setState(373);
				match(WS);
				setState(374);
				comparison();
				}
				break;
			case 12:
				{
				setState(376);
				equality(0);
				}
				break;
			case 13:
				{
				setState(377);
				comparison();
				}
				break;
			case 14:
				{
				setState(378);
				bexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(394);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(381);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(382);
						match(EQUAL);
						setState(383);
						conditional(15);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(384);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(385);
						match(WS);
						setState(386);
						match(AND);
						setState(387);
						match(WS);
						setState(388);
						conditional(14);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(389);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(390);
						match(WS);
						setState(391);
						match(OR);
						setState(392);
						match(WS);
						setState(393);
						conditional(13);
						}
						break;
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexpContext extends ParserRuleContext {
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode OR() { return getToken(DemoParser.OR, 0); }
		public TerminalNode AND() { return getToken(DemoParser.AND, 0); }
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitBexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		return bexp(0);
	}

	private BexpContext bexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexpContext _localctx = new BexpContext(_ctx, _parentState);
		BexpContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_bexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(400);
				match(T__0);
				setState(401);
				bexp(0);
				setState(402);
				match(T__1);
				}
				break;
			case BOOL:
				{
				setState(404);
				match(BOOL);
				}
				break;
			case IDENTIFIER:
				{
				setState(405);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						match(OR);
						setState(410);
						bexp(4);
						}
						break;
					case 2:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(411);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(412);
						match(AND);
						setState(413);
						match(BOOL);
						}
						break;
					case 3:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(414);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(415);
						match(AND);
						setState(416);
						match(T__0);
						setState(417);
						bexp(0);
						setState(418);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(DemoParser.EQUAL, 0); }
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public List<IexpContext> iexp() {
			return getRuleContexts(IexpContext.class);
		}
		public IexpContext iexp(int i) {
			return getRuleContext(IexpContext.class,i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		return equality(0);
	}

	private EqualityContext equality(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityContext _localctx = new EqualityContext(_ctx, _parentState);
		EqualityContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(426);
				match(T__0);
				setState(427);
				equality(0);
				setState(428);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(430);
				comparison();
				setState(431);
				match(EQUAL);
				setState(432);
				comparison();
				}
				break;
			case 3:
				{
				setState(434);
				comparison();
				setState(435);
				match(EQUAL);
				setState(436);
				equality(7);
				}
				break;
			case 4:
				{
				setState(438);
				bexp(0);
				setState(439);
				match(EQUAL);
				setState(440);
				equality(5);
				}
				break;
			case 5:
				{
				setState(442);
				comparison();
				setState(443);
				match(EQUAL);
				setState(444);
				bexp(0);
				}
				break;
			case 6:
				{
				setState(446);
				bexp(0);
				setState(447);
				match(EQUAL);
				setState(448);
				comparison();
				}
				break;
			case 7:
				{
				setState(450);
				bexp(0);
				setState(451);
				match(EQUAL);
				setState(452);
				bexp(0);
				}
				break;
			case 8:
				{
				setState(454);
				iexp(0);
				setState(455);
				match(EQUAL);
				setState(456);
				iexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(460);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(461);
						match(EQUAL);
						setState(462);
						equality(11);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(463);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(464);
						match(EQUAL);
						setState(465);
						comparison();
						}
						break;
					case 3:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(466);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(467);
						match(EQUAL);
						setState(468);
						bexp(0);
						}
						break;
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<IexpContext> iexp() {
			return getRuleContexts(IexpContext.class);
		}
		public IexpContext iexp(int i) {
			return getRuleContext(IexpContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(DemoParser.COMPARE, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				match(T__0);
				setState(475);
				comparison();
				setState(476);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				iexp(0);
				setState(479);
				match(COMPARE);
				setState(480);
				iexp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(DemoParser.DATATYPE, 0); }
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(DATATYPE);
			setState(485);
			match(WS);
			setState(486);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackdeclareContext extends ParserRuleContext {
		public TerminalNode STACKI() { return getToken(DemoParser.STACKI, 0); }
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode STACKB() { return getToken(DemoParser.STACKB, 0); }
		public TerminalNode STACKSTR() { return getToken(DemoParser.STACKSTR, 0); }
		public StackdeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackdeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitStackdeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackdeclareContext stackdeclare() throws RecognitionException {
		StackdeclareContext _localctx = new StackdeclareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stackdeclare);
		try {
			setState(497);
			switch (_input.LA(1)) {
			case STACKI:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(STACKI);
				setState(489);
				match(WS);
				setState(490);
				match(IDENTIFIER);
				}
				break;
			case STACKB:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(STACKB);
				setState(492);
				match(WS);
				setState(493);
				match(IDENTIFIER);
				}
				break;
			case STACKSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				match(STACKSTR);
				setState(495);
				match(WS);
				setState(496);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DemoParser.ASSIGNMENT, 0); }
		public IexpContext iexp() {
			return getRuleContext(IexpContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(IDENTIFIER);
				setState(500);
				match(ASSIGNMENT);
				setState(501);
				iexp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(IDENTIFIER);
				setState(503);
				match(ASSIGNMENT);
				setState(504);
				conditional(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignwithfunccallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DemoParser.ASSIGNMENT, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public AssignwithfunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignwithfunccall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitAssignwithfunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignwithfunccallContext assignwithfunccall() throws RecognitionException {
		AssignwithfunccallContext _localctx = new AssignwithfunccallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignwithfunccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(IDENTIFIER);
			setState(508);
			match(ASSIGNMENT);
			setState(509);
			funcCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncargsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public FuncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFuncargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargsContext funcargs() throws RecognitionException {
		FuncargsContext _localctx = new FuncargsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcargs);
		int _la;
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(T__0);
				setState(512);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(T__0);
				setState(514);
				match(IDENTIFIER);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(515);
					match(T__4);
					setState(516);
					match(IDENTIFIER);
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallargsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DemoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DemoParser.INT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(DemoParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(DemoParser.BOOL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public List<IexpContext> iexp() {
			return getRuleContexts(IexpContext.class);
		}
		public IexpContext iexp(int i) {
			return getRuleContext(IexpContext.class,i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public FunccallargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccallargs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFunccallargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallargsContext funccallargs() throws RecognitionException {
		FunccallargsContext _localctx = new FunccallargsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funccallargs);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(T__0);
				setState(526);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(T__0);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(528);
					match(INT);
					}
					break;
				case 2:
					{
					setState(529);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(530);
					match(IDENTIFIER);
					}
					break;
				case 4:
					{
					setState(531);
					iexp(0);
					}
					break;
				case 5:
					{
					setState(532);
					conditional(0);
					}
					break;
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(535);
					match(T__4);
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(536);
						match(INT);
						}
						break;
					case 2:
						{
						setState(537);
						match(BOOL);
						}
						break;
					case 3:
						{
						setState(538);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						setState(539);
						iexp(0);
						}
						break;
					case 5:
						{
						setState(540);
						conditional(0);
						}
						break;
					}
					}
					}
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclareContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFuncDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclareContext funcDeclare() throws RecognitionException {
		FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__5);
			setState(552);
			match(WS);
			setState(553);
			match(IDENTIFIER);
			setState(554);
			funcargs();
			setState(555);
			funcblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnexpContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public IexpContext iexp() {
			return getRuleContext(IexpContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ReturnexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitReturnexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnexpContext returnexp() throws RecognitionException {
		ReturnexpContext _localctx = new ReturnexpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnexp);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(T__6);
				setState(558);
				match(WS);
				setState(559);
				iexp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				match(T__6);
				setState(561);
				match(WS);
				setState(562);
				conditional(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public FunccallargsContext funccallargs() {
			return getRuleContext(FunccallargsContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(IDENTIFIER);
			setState(566);
			funccallargs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(DemoParser.STRING, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_push);
		try {
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(T__7);
				setState(569);
				match(T__0);
				setState(570);
				match(IDENTIFIER);
				setState(571);
				match(T__4);
				setState(572);
				match(INT);
				setState(573);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(T__7);
				setState(575);
				match(T__0);
				setState(576);
				match(IDENTIFIER);
				setState(577);
				match(T__4);
				setState(578);
				match(BOOL);
				setState(579);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(T__7);
				setState(581);
				match(T__0);
				setState(582);
				match(IDENTIFIER);
				setState(583);
				match(T__4);
				setState(584);
				match(STRING);
				setState(585);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(T__7);
				setState(587);
				match(T__0);
				setState(588);
				match(IDENTIFIER);
				setState(589);
				match(T__4);
				setState(590);
				match(IDENTIFIER);
				setState(591);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DemoParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DemoParser.IDENTIFIER, i);
		}
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__8);
			setState(595);
			match(T__0);
			setState(596);
			match(IDENTIFIER);
			setState(597);
			match(T__4);
			setState(598);
			match(IDENTIFIER);
			setState(599);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return block_sempred((BlockContext)_localctx, predIndex);
		case 11:
			return iexp_sempred((IexpContext)_localctx, predIndex);
		case 12:
			return conditional_sempred((ConditionalContext)_localctx, predIndex);
		case 13:
			return bexp_sempred((BexpContext)_localctx, predIndex);
		case 14:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_sempred(BlockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean iexp_sempred(IexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditional_sempred(ConditionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean bexp_sempred(BexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u025c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\6\3C\n\3\r\3\16\3D\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\7\3P\n\3\f"+
		"\3\16\3S\13\3\6\3U\n\3\r\3\16\3V\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3"+
		"\3\3\3\3\3\3\7\3d\n\3\f\3\16\3g\13\3\3\3\6\3j\n\3\r\3\16\3k\6\3n\n\3\r"+
		"\3\16\3o\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\177"+
		"\n\4\r\4\16\4\u0080\3\4\3\4\3\4\3\4\7\4\u0087\n\4\f\4\16\4\u008a\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16\4\u0097\13\4\3\4"+
		"\3\4\3\4\3\4\6\4\u009d\n\4\r\4\16\4\u009e\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00aa\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b5\n"+
		"\5\3\6\3\6\7\6\u00b9\n\6\f\6\16\6\u00bc\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7\u00c4\n\7\f\7\16\7\u00c7\13\7\3\7\3\7\3\7\6\7\u00cc\n\7\r\7\16\7\u00cd"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00dd\n\7\3\7"+
		"\3\7\3\7\3\7\6\7\u00e3\n\7\r\7\16\7\u00e4\7\7\u00e7\n\7\f\7\16\7\u00ea"+
		"\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f6\n\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0106\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0114\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0122\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u012b\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u013c\n\r\f\r\16\r\u013f\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u017e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u018d\n\16\f\16\16\16\u0190\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0199\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01a7\n\17\f\17\16\17\u01aa\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01cd\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u01d8\n\20\f\20\16\20\u01db\13\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u01e5\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01f4\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u01fc\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0208\n\26\f\26\16\26\u020b\13\26\3\26\5\26\u020e\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0218\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0220\n\27\7\27\u0222\n\27\f\27\16\27\u0225\13\27\3\27"+
		"\5\27\u0228\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0236\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0253\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\2\7\f\30\32\34\36\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\66\2\2\u02a5\28\3\2\2\2\4r\3\2\2\2\6\u00a9\3\2\2\2\b\u00b4\3"+
		"\2\2\2\n\u00b6\3\2\2\2\f\u00dc\3\2\2\2\16\u00eb\3\2\2\2\20\u00ef\3\2\2"+
		"\2\22\u0105\3\2\2\2\24\u0113\3\2\2\2\26\u0121\3\2\2\2\30\u012a\3\2\2\2"+
		"\32\u017d\3\2\2\2\34\u0198\3\2\2\2\36\u01cc\3\2\2\2 \u01e4\3\2\2\2\"\u01e6"+
		"\3\2\2\2$\u01f3\3\2\2\2&\u01fb\3\2\2\2(\u01fd\3\2\2\2*\u020d\3\2\2\2,"+
		"\u0227\3\2\2\2.\u0229\3\2\2\2\60\u0235\3\2\2\2\62\u0237\3\2\2\2\64\u0252"+
		"\3\2\2\2\66\u0254\3\2\2\289\7#\2\29:\7\17\2\2:;\5\4\3\2;<\5\6\4\2<=\5"+
		"\4\3\2=>\7$\2\2>\3\3\2\2\2?@\5\"\22\2@A\7\17\2\2AC\3\2\2\2B?\3\2\2\2C"+
		"D\3\2\2\2DB\3\2\2\2DE\3\2\2\2EK\3\2\2\2FG\5&\24\2GH\7\17\2\2HJ\3\2\2\2"+
		"IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5.\30\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TB\3\2\2\2"+
		"UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2Ws\3\2\2\2XY\5\"\22\2YZ\7\17\2\2Z\\\3\2"+
		"\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^e\3\2\2\2_]\3\2\2\2`a\5"+
		"&\24\2ab\7\17\2\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi"+
		"\3\2\2\2ge\3\2\2\2hj\5.\30\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"n\3\2\2\2m]\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qs\3\2\2\2"+
		"rT\3\2\2\2rm\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tu\7%\2\2uv\5\f\7\2vw\7&\2\2"+
		"wx\7\17\2\2x\u00aa\3\2\2\2yz\7%\2\2z~\7\17\2\2{|\5\22\n\2|}\7\17\2\2}"+
		"\177\3\2\2\2~{\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0088\5\f\7\2\u0083\u0084\5\22\n\2\u0084"+
		"\u0085\7\17\2\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7&\2\2\u008c\u008d\7\17\2\2\u008d\u00aa\3\2"+
		"\2\2\u008e\u008f\7%\2\2\u008f\u0095\7\17\2\2\u0090\u0091\5\22\n\2\u0091"+
		"\u0092\7\17\2\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009c\5\f\7\2\u0099\u009a\5\22\n\2\u009a\u009b\7"+
		"\17\2\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7&"+
		"\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a4\7%\2\2\u00a4"+
		"\u00a5\7\17\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\7&\2\2\u00a7\u00a8\7\17"+
		"\2\2\u00a8\u00aa\3\2\2\2\u00a9t\3\2\2\2\u00a9y\3\2\2\2\u00a9\u008e\3\2"+
		"\2\2\u00a9\u00a3\3\2\2\2\u00aa\7\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad"+
		"\5\16\b\2\u00ad\u00ae\5\f\7\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\7\f\2\2"+
		"\u00b0\u00b1\5\16\b\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\5\n\6\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\t\3\2\2\2\u00b6"+
		"\u00ba\7\16\2\2\u00b7\u00b9\7!\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5\f\7\2\u00be\13\3\2\2\2\u00bf\u00c5\b\7\1"+
		"\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7\17\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00dd\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\22\n\2\u00c9"+
		"\u00ca\7\17\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\5\f\7\7\u00d0\u00dd\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\7"+
		"\17\2\2\u00d3\u00d4\5\f\7\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\7\17\2\2"+
		"\u00d6\u00dd\3\2\2\2\u00d7\u00dd\5\b\5\2\u00d8\u00d9\7\r\2\2\u00d9\u00da"+
		"\5\16\b\2\u00da\u00db\5\f\7\3\u00db\u00dd\3\2\2\2\u00dc\u00bf\3\2\2\2"+
		"\u00dc\u00cb\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8"+
		"\3\2\2\2\u00dd\u00e8\3\2\2\2\u00de\u00e2\f\6\2\2\u00df\u00e0\5\22\n\2"+
		"\u00e0\u00e1\7\17\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00de\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\r\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed"+
		"\5\32\16\2\u00ed\u00ee\7\4\2\2\u00ee\17\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0"+
		"\u00f1\7\17\2\2\u00f1\u00f5\5\f\7\2\u00f2\u00f3\5\60\31\2\u00f3\u00f4"+
		"\7\17\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\7\17\2\2\u00f9\21"+
		"\3\2\2\2\u00fa\u0106\5\24\13\2\u00fb\u0106\5\26\f\2\u00fc\u0106\5\30\r"+
		"\2\u00fd\u0106\5\32\16\2\u00fe\u0106\5\"\22\2\u00ff\u0106\5&\24\2\u0100"+
		"\u0106\5(\25\2\u0101\u0106\5\62\32\2\u0102\u0106\5$\23\2\u0103\u0106\5"+
		"\64\33\2\u0104\u0106\5\66\34\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2"+
		"\u0105\u00fc\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff"+
		"\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\23\3\2\2\2\u0107\u0108\7\5\2"+
		"\2\u0108\u0109\7!\2\2\u0109\u0114\7\22\2\2\u010a\u010b\7\5\2\2\u010b\u010c"+
		"\7!\2\2\u010c\u0114\7 \2\2\u010d\u010e\7\5\2\2\u010e\u010f\7!\2\2\u010f"+
		"\u0114\7\20\2\2\u0110\u0111\7\5\2\2\u0111\u0112\7!\2\2\u0112\u0114\7\21"+
		"\2\2\u0113\u0107\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010d\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0114\25\3\2\2\2\u0115\u0116\7\6\2\2\u0116\u0117\7!\2\2"+
		"\u0117\u0122\7\22\2\2\u0118\u0119\7\6\2\2\u0119\u011a\7!\2\2\u011a\u0122"+
		"\7 \2\2\u011b\u011c\7\6\2\2\u011c\u011d\7!\2\2\u011d\u0122\7\20\2\2\u011e"+
		"\u011f\7\6\2\2\u011f\u0120\7!\2\2\u0120\u0122\7\21\2\2\u0121\u0115\3\2"+
		"\2\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u011e\3\2\2\2\u0122"+
		"\27\3\2\2\2\u0123\u0124\b\r\1\2\u0124\u0125\7\3\2\2\u0125\u0126\5\30\r"+
		"\2\u0126\u0127\7\4\2\2\u0127\u012b\3\2\2\2\u0128\u012b\7\20\2\2\u0129"+
		"\u012b\7 \2\2\u012a\u0123\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2"+
		"\2\2\u012b\u013d\3\2\2\2\u012c\u012d\f\6\2\2\u012d\u012e\7\25\2\2\u012e"+
		"\u013c\5\30\r\7\u012f\u0130\f\b\2\2\u0130\u0131\7\26\2\2\u0131\u013c\7"+
		"\20\2\2\u0132\u0133\f\7\2\2\u0133\u0134\7\26\2\2\u0134\u0135\7\3\2\2\u0135"+
		"\u0136\5\30\r\2\u0136\u0137\7\4\2\2\u0137\u013c\3\2\2\2\u0138\u0139\f"+
		"\4\2\2\u0139\u013a\7\26\2\2\u013a\u013c\7 \2\2\u013b\u012c\3\2\2\2\u013b"+
		"\u012f\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\31\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0141\b\16\1\2\u0141\u0142\7\3\2\2\u0142\u0143\5\32\16"+
		"\2\u0143\u0144\7\4\2\2\u0144\u017e\3\2\2\2\u0145\u0146\7\31\2\2\u0146"+
		"\u0147\7!\2\2\u0147\u017e\5\32\16\22\u0148\u0149\7\31\2\2\u0149\u017e"+
		"\5\32\16\21\u014a\u014b\5\36\20\2\u014b\u014c\7!\2\2\u014c\u014d\7\27"+
		"\2\2\u014d\u014e\7!\2\2\u014e\u014f\5\34\17\2\u014f\u017e\3\2\2\2\u0150"+
		"\u0151\5\36\20\2\u0151\u0152\7!\2\2\u0152\u0153\7\30\2\2\u0153\u0154\7"+
		"!\2\2\u0154\u0155\5\34\17\2\u0155\u017e\3\2\2\2\u0156\u0157\5\34\17\2"+
		"\u0157\u0158\7!\2\2\u0158\u0159\7\27\2\2\u0159\u015a\7!\2\2\u015a\u015b"+
		"\5\36\20\2\u015b\u017e\3\2\2\2\u015c\u015d\5\34\17\2\u015d\u015e\7!\2"+
		"\2\u015e\u015f\7\30\2\2\u015f\u0160\7!\2\2\u0160\u0161\5\36\20\2\u0161"+
		"\u017e\3\2\2\2\u0162\u0163\5 \21\2\u0163\u0164\7!\2\2\u0164\u0165\7\27"+
		"\2\2\u0165\u0166\7!\2\2\u0166\u0167\5\34\17\2\u0167\u017e\3\2\2\2\u0168"+
		"\u0169\5 \21\2\u0169\u016a\7!\2\2\u016a\u016b\7\30\2\2\u016b\u016c\7!"+
		"\2\2\u016c\u016d\5\34\17\2\u016d\u017e\3\2\2\2\u016e\u016f\5\34\17\2\u016f"+
		"\u0170\7!\2\2\u0170\u0171\7\27\2\2\u0171\u0172\7!\2\2\u0172\u0173\5 \21"+
		"\2\u0173\u017e\3\2\2\2\u0174\u0175\5\34\17\2\u0175\u0176\7!\2\2\u0176"+
		"\u0177\7\30\2\2\u0177\u0178\7!\2\2\u0178\u0179\5 \21\2\u0179\u017e\3\2"+
		"\2\2\u017a\u017e\5\36\20\2\u017b\u017e\5 \21\2\u017c\u017e\5\34\17\2\u017d"+
		"\u0140\3\2\2\2\u017d\u0145\3\2\2\2\u017d\u0148\3\2\2\2\u017d\u014a\3\2"+
		"\2\2\u017d\u0150\3\2\2\2\u017d\u0156\3\2\2\2\u017d\u015c\3\2\2\2\u017d"+
		"\u0162\3\2\2\2\u017d\u0168\3\2\2\2\u017d\u016e\3\2\2\2\u017d\u0174\3\2"+
		"\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u018e\3\2\2\2\u017f\u0180\f\20\2\2\u0180\u0181\7\32\2\2\u0181\u018d\5"+
		"\32\16\21\u0182\u0183\f\17\2\2\u0183\u0184\7!\2\2\u0184\u0185\7\27\2\2"+
		"\u0185\u0186\7!\2\2\u0186\u018d\5\32\16\20\u0187\u0188\f\16\2\2\u0188"+
		"\u0189\7!\2\2\u0189\u018a\7\30\2\2\u018a\u018b\7!\2\2\u018b\u018d\5\32"+
		"\16\17\u018c\u017f\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0187\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\33\3\2\2"+
		"\2\u0190\u018e\3\2\2\2\u0191\u0192\b\17\1\2\u0192\u0193\7\3\2\2\u0193"+
		"\u0194\5\34\17\2\u0194\u0195\7\4\2\2\u0195\u0199\3\2\2\2\u0196\u0199\7"+
		"\21\2\2\u0197\u0199\7 \2\2\u0198\u0191\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\u01a8\3\2\2\2\u019a\u019b\f\5\2\2\u019b\u019c\7\30"+
		"\2\2\u019c\u01a7\5\34\17\6\u019d\u019e\f\7\2\2\u019e\u019f\7\27\2\2\u019f"+
		"\u01a7\7\21\2\2\u01a0\u01a1\f\6\2\2\u01a1\u01a2\7\27\2\2\u01a2\u01a3\7"+
		"\3\2\2\u01a3\u01a4\5\34\17\2\u01a4\u01a5\7\4\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u019a\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\35\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\u01ac\b\20\1\2\u01ac\u01ad\7\3\2\2\u01ad\u01ae\5\36\20"+
		"\2\u01ae\u01af\7\4\2\2\u01af\u01cd\3\2\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2"+
		"\7\32\2\2\u01b2\u01b3\5 \21\2\u01b3\u01cd\3\2\2\2\u01b4\u01b5\5 \21\2"+
		"\u01b5\u01b6\7\32\2\2\u01b6\u01b7\5\36\20\t\u01b7\u01cd\3\2\2\2\u01b8"+
		"\u01b9\5\34\17\2\u01b9\u01ba\7\32\2\2\u01ba\u01bb\5\36\20\7\u01bb\u01cd"+
		"\3\2\2\2\u01bc\u01bd\5 \21\2\u01bd\u01be\7\32\2\2\u01be\u01bf\5\34\17"+
		"\2\u01bf\u01cd\3\2\2\2\u01c0\u01c1\5\34\17\2\u01c1\u01c2\7\32\2\2\u01c2"+
		"\u01c3\5 \21\2\u01c3\u01cd\3\2\2\2\u01c4\u01c5\5\34\17\2\u01c5\u01c6\7"+
		"\32\2\2\u01c6\u01c7\5\34\17\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\5\30\r\2"+
		"\u01c9\u01ca\7\32\2\2\u01ca\u01cb\5\30\r\2\u01cb\u01cd\3\2\2\2\u01cc\u01ab"+
		"\3\2\2\2\u01cc\u01b0\3\2\2\2\u01cc\u01b4\3\2\2\2\u01cc\u01b8\3\2\2\2\u01cc"+
		"\u01bc\3\2\2\2\u01cc\u01c0\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c8\3\2"+
		"\2\2\u01cd\u01d9\3\2\2\2\u01ce\u01cf\f\f\2\2\u01cf\u01d0\7\32\2\2\u01d0"+
		"\u01d8\5\36\20\r\u01d1\u01d2\f\n\2\2\u01d2\u01d3\7\32\2\2\u01d3\u01d8"+
		"\5 \21\2\u01d4\u01d5\f\b\2\2\u01d5\u01d6\7\32\2\2\u01d6\u01d8\5\34\17"+
		"\2\u01d7\u01ce\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\37\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01dd\7\3\2\2\u01dd\u01de\5 \21\2\u01de\u01df\7\4"+
		"\2\2\u01df\u01e5\3\2\2\2\u01e0\u01e1\5\30\r\2\u01e1\u01e2\7\33\2\2\u01e2"+
		"\u01e3\5\30\r\2\u01e3\u01e5\3\2\2\2\u01e4\u01dc\3\2\2\2\u01e4\u01e0\3"+
		"\2\2\2\u01e5!\3\2\2\2\u01e6\u01e7\7\34\2\2\u01e7\u01e8\7!\2\2\u01e8\u01e9"+
		"\7 \2\2\u01e9#\3\2\2\2\u01ea\u01eb\7\35\2\2\u01eb\u01ec\7!\2\2\u01ec\u01f4"+
		"\7 \2\2\u01ed\u01ee\7\36\2\2\u01ee\u01ef\7!\2\2\u01ef\u01f4\7 \2\2\u01f0"+
		"\u01f1\7\37\2\2\u01f1\u01f2\7!\2\2\u01f2\u01f4\7 \2\2\u01f3\u01ea\3\2"+
		"\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4%\3\2\2\2\u01f5\u01f6"+
		"\7 \2\2\u01f6\u01f7\7\"\2\2\u01f7\u01fc\5\30\r\2\u01f8\u01f9\7 \2\2\u01f9"+
		"\u01fa\7\"\2\2\u01fa\u01fc\5\32\16\2\u01fb\u01f5\3\2\2\2\u01fb\u01f8\3"+
		"\2\2\2\u01fc\'\3\2\2\2\u01fd\u01fe\7 \2\2\u01fe\u01ff\7\"\2\2\u01ff\u0200"+
		"\5\62\32\2\u0200)\3\2\2\2\u0201\u0202\7\3\2\2\u0202\u020e\7\4\2\2\u0203"+
		"\u0204\7\3\2\2\u0204\u0209\7 \2\2\u0205\u0206\7\7\2\2\u0206\u0208\7 \2"+
		"\2\u0207\u0205\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7\4\2\2\u020d"+
		"\u0201\3\2\2\2\u020d\u0203\3\2\2\2\u020e+\3\2\2\2\u020f\u0210\7\3\2\2"+
		"\u0210\u0228\7\4\2\2\u0211\u0217\7\3\2\2\u0212\u0218\7\20\2\2\u0213\u0218"+
		"\7\21\2\2\u0214\u0218\7 \2\2\u0215\u0218\5\30\r\2\u0216\u0218\5\32\16"+
		"\2\u0217\u0212\3\2\2\2\u0217\u0213\3\2\2\2\u0217\u0214\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0223\3\2\2\2\u0219\u021f\7\7\2\2\u021a"+
		"\u0220\7\20\2\2\u021b\u0220\7\21\2\2\u021c\u0220\7 \2\2\u021d\u0220\5"+
		"\30\r\2\u021e\u0220\5\32\16\2\u021f\u021a\3\2\2\2\u021f\u021b\3\2\2\2"+
		"\u021f\u021c\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u0222"+
		"\3\2\2\2\u0221\u0219\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228\7\4"+
		"\2\2\u0227\u020f\3\2\2\2\u0227\u0211\3\2\2\2\u0228-\3\2\2\2\u0229\u022a"+
		"\7\b\2\2\u022a\u022b\7!\2\2\u022b\u022c\7 \2\2\u022c\u022d\5*\26\2\u022d"+
		"\u022e\5\20\t\2\u022e/\3\2\2\2\u022f\u0230\7\t\2\2\u0230\u0231\7!\2\2"+
		"\u0231\u0236\5\30\r\2\u0232\u0233\7\t\2\2\u0233\u0234\7!\2\2\u0234\u0236"+
		"\5\32\16\2\u0235\u022f\3\2\2\2\u0235\u0232\3\2\2\2\u0236\61\3\2\2\2\u0237"+
		"\u0238\7 \2\2\u0238\u0239\5,\27\2\u0239\63\3\2\2\2\u023a\u023b\7\n\2\2"+
		"\u023b\u023c\7\3\2\2\u023c\u023d\7 \2\2\u023d\u023e\7\7\2\2\u023e\u023f"+
		"\7\20\2\2\u023f\u0253\7\4\2\2\u0240\u0241\7\n\2\2\u0241\u0242\7\3\2\2"+
		"\u0242\u0243\7 \2\2\u0243\u0244\7\7\2\2\u0244\u0245\7\21\2\2\u0245\u0253"+
		"\7\4\2\2\u0246\u0247\7\n\2\2\u0247\u0248\7\3\2\2\u0248\u0249\7 \2\2\u0249"+
		"\u024a\7\7\2\2\u024a\u024b\7\22\2\2\u024b\u0253\7\4\2\2\u024c\u024d\7"+
		"\n\2\2\u024d\u024e\7\3\2\2\u024e\u024f\7 \2\2\u024f\u0250\7\7\2\2\u0250"+
		"\u0251\7 \2\2\u0251\u0253\7\4\2\2\u0252\u023a\3\2\2\2\u0252\u0240\3\2"+
		"\2\2\u0252\u0246\3\2\2\2\u0252\u024c\3\2\2\2\u0253\65\3\2\2\2\u0254\u0255"+
		"\7\13\2\2\u0255\u0256\7\3\2\2\u0256\u0257\7 \2\2\u0257\u0258\7\7\2\2\u0258"+
		"\u0259\7 \2\2\u0259\u025a\7\4\2\2\u025a\67\3\2\2\2\62DKQV]ekor\u0080\u0088"+
		"\u0095\u009e\u00a9\u00b4\u00ba\u00c5\u00cd\u00dc\u00e4\u00e8\u00f5\u0105"+
		"\u0113\u0121\u012a\u013b\u013d\u017d\u018c\u018e\u0198\u01a6\u01a8\u01cc"+
		"\u01d7\u01d9\u01e4\u01f3\u01fb\u0209\u020d\u0217\u021f\u0223\u0227\u0235"+
		"\u0252";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}