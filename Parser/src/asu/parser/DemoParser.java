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
		T__9=10, IF=11, WHILE=12, ELSE=13, NEWLINE=14, INT=15, BOOL=16, STRING=17, 
		BSTART=18, BEND=19, ADDSUB=20, MULDIV=21, AND=22, OR=23, NOT=24, EQUAL=25, 
		COMPARE=26, DATATYPE=27, STACKI=28, STACKB=29, STACKSTR=30, IDENTIFIER=31, 
		WS=32, ASSIGNMENT=33, PSTART=34, PEND=35, MSTART=36, MEND=37;
	public static final int
		RULE_program = 0, RULE_global = 1, RULE_main = 2, RULE_ifblock = 3, RULE_elseblock = 4, 
		RULE_block = 5, RULE_condition = 6, RULE_funcblock = 7, RULE_exp = 8, 
		RULE_print = 9, RULE_println = 10, RULE_iexp = 11, RULE_conditional = 12, 
		RULE_bexp = 13, RULE_equality = 14, RULE_comparison = 15, RULE_declare = 16, 
		RULE_stackdeclare = 17, RULE_assign = 18, RULE_assignwithfunccall = 19, 
		RULE_funcargs = 20, RULE_funccallargs = 21, RULE_funcDeclare = 22, RULE_returnexp = 23, 
		RULE_funcCall = 24, RULE_push = 25, RULE_pop = 26, RULE_read = 27;
	public static final String[] ruleNames = {
		"program", "global", "main", "ifblock", "elseblock", "block", "condition", 
		"funcblock", "exp", "print", "println", "iexp", "conditional", "bexp", 
		"equality", "comparison", "declare", "stackdeclare", "assign", "assignwithfunccall", 
		"funcargs", "funccallargs", "funcDeclare", "returnexp", "funcCall", "push", 
		"pop", "read"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'PRINT'", "'PRINTLN'", "','", "'FUNCTION'", "'RETURN'", 
		"'PUSH'", "'POP'", "'READ'", "'IF'", "'WHILE'", "'ELSE'", "'\n'", null, 
		null, null, "'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, 
		null, null, "'STACKI'", "'STACKB'", "'STACKSTR'", null, null, "'='", "'['", 
		"']'", "'--'", "'!!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "IF", 
		"WHILE", "ELSE", "NEWLINE", "INT", "BOOL", "STRING", "BSTART", "BEND", 
		"ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", "DATATYPE", 
		"STACKI", "STACKB", "STACKSTR", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", 
		"PEND", "MSTART", "MEND"
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
			setState(56);
			match(PSTART);
			setState(57);
			match(NEWLINE);
			setState(58);
			global();
			setState(59);
			main();
			setState(60);
			global();
			setState(61);
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
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(63);
							declare();
							setState(64);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(68); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(70);
						assign();
						setState(71);
						match(NEWLINE);
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(78);
						funcDeclare();
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DATATYPE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE) {
						{
						{
						setState(88);
						declare();
						setState(89);
						match(NEWLINE);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(96);
						assign();
						setState(97);
						match(NEWLINE);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(104);
							funcDeclare();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(107); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(111); 
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(MSTART);
				setState(117);
				block(0);
				setState(118);
				match(MEND);
				setState(119);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(MSTART);
				setState(122);
				match(NEWLINE);
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						exp();
						setState(124);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(130);
				block(0);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << STACKI) | (1L << STACKB) | (1L << STACKSTR) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(131);
					exp();
					setState(132);
					match(NEWLINE);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(MEND);
				setState(140);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(MSTART);
				setState(143);
				match(NEWLINE);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(144);
						exp();
						setState(145);
						match(NEWLINE);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(152);
				block(0);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(153);
					exp();
					setState(154);
					match(NEWLINE);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << STACKI) | (1L << STACKB) | (1L << STACKSTR) | (1L << IDENTIFIER))) != 0) );
				setState(160);
				match(MEND);
				setState(161);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(MSTART);
				setState(164);
				match(NEWLINE);
				setState(165);
				block(0);
				setState(166);
				match(MEND);
				setState(167);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(IF);
				setState(172);
				condition();
				setState(173);
				block(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IF);
				setState(176);
				condition();
				setState(177);
				block(0);
				setState(178);
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
			setState(182);
			match(ELSE);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(WS);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(189);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						exp();
						setState(193);
						match(NEWLINE);
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(203); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(200);
						exp();
						setState(201);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(205); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(207);
				block(5);
				}
				break;
			case 3:
				{
				setState(209);
				match(BSTART);
				setState(210);
				match(NEWLINE);
				setState(211);
				block(0);
				setState(212);
				match(BEND);
				setState(213);
				match(NEWLINE);
				}
				break;
			case 4:
				{
				setState(215);
				ifblock();
				}
				break;
			case 5:
				{
				setState(216);
				match(WHILE);
				setState(217);
				condition();
				setState(218);
				block(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
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
					setState(222);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(226); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(223);
							exp();
							setState(224);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(228); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(234);
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
			setState(235);
			match(T__0);
			setState(236);
			conditional(0);
			setState(237);
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
			setState(239);
			match(BSTART);
			setState(240);
			match(NEWLINE);
			setState(241);
			block(0);
			setState(245);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(242);
				returnexp();
				setState(243);
				match(NEWLINE);
				}
			}

			setState(247);
			match(BEND);
			setState(248);
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
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				println();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				iexp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				conditional(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				declare();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				assignwithfunccall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				stackdeclare();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				push();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				pop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(261);
				read();
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(T__2);
				setState(265);
				match(WS);
				setState(266);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__2);
				setState(268);
				match(WS);
				setState(269);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(T__2);
				setState(271);
				match(WS);
				setState(272);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				match(T__2);
				setState(274);
				match(WS);
				setState(275);
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
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__3);
				setState(279);
				match(WS);
				setState(280);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__3);
				setState(282);
				match(WS);
				setState(283);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__3);
				setState(285);
				match(WS);
				setState(286);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(T__3);
				setState(288);
				match(WS);
				setState(289);
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
			setState(299);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(293);
				match(T__0);
				setState(294);
				iexp(0);
				setState(295);
				match(T__1);
				}
				break;
			case INT:
				{
				setState(297);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				setState(298);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(301);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(302);
						match(ADDSUB);
						setState(303);
						iexp(5);
						}
						break;
					case 2:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(304);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(305);
						match(MULDIV);
						setState(306);
						match(INT);
						}
						break;
					case 3:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(307);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(308);
						match(MULDIV);
						setState(309);
						match(T__0);
						setState(310);
						iexp(0);
						setState(311);
						match(T__1);
						}
						break;
					case 4:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(313);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(314);
						match(MULDIV);
						setState(315);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(320);
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
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(322);
				match(T__0);
				setState(323);
				conditional(0);
				setState(324);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(326);
				match(NOT);
				setState(327);
				match(WS);
				setState(328);
				conditional(16);
				}
				break;
			case 3:
				{
				setState(329);
				match(NOT);
				setState(330);
				conditional(15);
				}
				break;
			case 4:
				{
				setState(331);
				equality(0);
				setState(332);
				match(WS);
				setState(333);
				match(AND);
				setState(334);
				match(WS);
				setState(335);
				bexp(0);
				}
				break;
			case 5:
				{
				setState(337);
				equality(0);
				setState(338);
				match(WS);
				setState(339);
				match(OR);
				setState(340);
				match(WS);
				setState(341);
				bexp(0);
				}
				break;
			case 6:
				{
				setState(343);
				bexp(0);
				setState(344);
				match(WS);
				setState(345);
				match(AND);
				setState(346);
				match(WS);
				setState(347);
				equality(0);
				}
				break;
			case 7:
				{
				setState(349);
				bexp(0);
				setState(350);
				match(WS);
				setState(351);
				match(OR);
				setState(352);
				match(WS);
				setState(353);
				equality(0);
				}
				break;
			case 8:
				{
				setState(355);
				comparison();
				setState(356);
				match(WS);
				setState(357);
				match(AND);
				setState(358);
				match(WS);
				setState(359);
				bexp(0);
				}
				break;
			case 9:
				{
				setState(361);
				comparison();
				setState(362);
				match(WS);
				setState(363);
				match(OR);
				setState(364);
				match(WS);
				setState(365);
				bexp(0);
				}
				break;
			case 10:
				{
				setState(367);
				bexp(0);
				setState(368);
				match(WS);
				setState(369);
				match(AND);
				setState(370);
				match(WS);
				setState(371);
				comparison();
				}
				break;
			case 11:
				{
				setState(373);
				bexp(0);
				setState(374);
				match(WS);
				setState(375);
				match(OR);
				setState(376);
				match(WS);
				setState(377);
				comparison();
				}
				break;
			case 12:
				{
				setState(379);
				equality(0);
				}
				break;
			case 13:
				{
				setState(380);
				comparison();
				}
				break;
			case 14:
				{
				setState(381);
				bexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(384);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(385);
						match(EQUAL);
						setState(386);
						conditional(15);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(387);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(388);
						match(WS);
						setState(389);
						match(AND);
						setState(390);
						match(WS);
						setState(391);
						conditional(14);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(392);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(393);
						match(WS);
						setState(394);
						match(OR);
						setState(395);
						match(WS);
						setState(396);
						conditional(13);
						}
						break;
					}
					} 
				}
				setState(401);
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
			setState(409);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(403);
				match(T__0);
				setState(404);
				bexp(0);
				setState(405);
				match(T__1);
				}
				break;
			case BOOL:
				{
				setState(407);
				match(BOOL);
				}
				break;
			case IDENTIFIER:
				{
				setState(408);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(411);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(412);
						match(OR);
						setState(413);
						bexp(4);
						}
						break;
					case 2:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(414);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(415);
						match(AND);
						setState(416);
						match(BOOL);
						}
						break;
					case 3:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(417);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(418);
						match(AND);
						setState(419);
						match(T__0);
						setState(420);
						bexp(0);
						setState(421);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(427);
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
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(429);
				match(T__0);
				setState(430);
				equality(0);
				setState(431);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(433);
				comparison();
				setState(434);
				match(EQUAL);
				setState(435);
				comparison();
				}
				break;
			case 3:
				{
				setState(437);
				comparison();
				setState(438);
				match(EQUAL);
				setState(439);
				equality(7);
				}
				break;
			case 4:
				{
				setState(441);
				bexp(0);
				setState(442);
				match(EQUAL);
				setState(443);
				equality(5);
				}
				break;
			case 5:
				{
				setState(445);
				comparison();
				setState(446);
				match(EQUAL);
				setState(447);
				bexp(0);
				}
				break;
			case 6:
				{
				setState(449);
				bexp(0);
				setState(450);
				match(EQUAL);
				setState(451);
				comparison();
				}
				break;
			case 7:
				{
				setState(453);
				bexp(0);
				setState(454);
				match(EQUAL);
				setState(455);
				bexp(0);
				}
				break;
			case 8:
				{
				setState(457);
				iexp(0);
				setState(458);
				match(EQUAL);
				setState(459);
				iexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(463);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(464);
						match(EQUAL);
						setState(465);
						equality(11);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(466);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(467);
						match(EQUAL);
						setState(468);
						comparison();
						}
						break;
					case 3:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(469);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(470);
						match(EQUAL);
						setState(471);
						bexp(0);
						}
						break;
					}
					} 
				}
				setState(476);
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
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(T__0);
				setState(478);
				comparison();
				setState(479);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				iexp(0);
				setState(482);
				match(COMPARE);
				setState(483);
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
			setState(487);
			match(DATATYPE);
			setState(488);
			match(WS);
			setState(489);
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
			setState(500);
			switch (_input.LA(1)) {
			case STACKI:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(STACKI);
				setState(492);
				match(WS);
				setState(493);
				match(IDENTIFIER);
				}
				break;
			case STACKB:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(STACKB);
				setState(495);
				match(WS);
				setState(496);
				match(IDENTIFIER);
				}
				break;
			case STACKSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(STACKSTR);
				setState(498);
				match(WS);
				setState(499);
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
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(IDENTIFIER);
				setState(503);
				match(ASSIGNMENT);
				setState(504);
				iexp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(IDENTIFIER);
				setState(506);
				match(ASSIGNMENT);
				setState(507);
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
			setState(510);
			match(IDENTIFIER);
			setState(511);
			match(ASSIGNMENT);
			setState(512);
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
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(T__0);
				setState(515);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(T__0);
				setState(517);
				match(IDENTIFIER);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(518);
					match(T__4);
					setState(519);
					match(IDENTIFIER);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
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
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(T__0);
				setState(529);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(T__0);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(531);
					match(INT);
					}
					break;
				case 2:
					{
					setState(532);
					match(BOOL);
					}
					break;
				case 3:
					{
					setState(533);
					match(IDENTIFIER);
					}
					break;
				case 4:
					{
					setState(534);
					iexp(0);
					}
					break;
				case 5:
					{
					setState(535);
					conditional(0);
					}
					break;
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(538);
					match(T__4);
					setState(544);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(539);
						match(INT);
						}
						break;
					case 2:
						{
						setState(540);
						match(BOOL);
						}
						break;
					case 3:
						{
						setState(541);
						match(IDENTIFIER);
						}
						break;
					case 4:
						{
						setState(542);
						iexp(0);
						}
						break;
					case 5:
						{
						setState(543);
						conditional(0);
						}
						break;
					}
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
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
			setState(554);
			match(T__5);
			setState(555);
			match(WS);
			setState(556);
			match(IDENTIFIER);
			setState(557);
			funcargs();
			setState(558);
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
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(T__6);
				setState(561);
				match(WS);
				setState(562);
				iexp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(T__6);
				setState(564);
				match(WS);
				setState(565);
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
			setState(568);
			match(IDENTIFIER);
			setState(569);
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
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(T__7);
				setState(572);
				match(T__0);
				setState(573);
				match(IDENTIFIER);
				setState(574);
				match(T__4);
				setState(575);
				match(INT);
				setState(576);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(T__7);
				setState(578);
				match(T__0);
				setState(579);
				match(IDENTIFIER);
				setState(580);
				match(T__4);
				setState(581);
				match(BOOL);
				setState(582);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(T__7);
				setState(584);
				match(T__0);
				setState(585);
				match(IDENTIFIER);
				setState(586);
				match(T__4);
				setState(587);
				match(STRING);
				setState(588);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(T__7);
				setState(590);
				match(T__0);
				setState(591);
				match(IDENTIFIER);
				setState(592);
				match(T__4);
				setState(593);
				match(IDENTIFIER);
				setState(594);
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
			setState(597);
			match(T__8);
			setState(598);
			match(T__0);
			setState(599);
			match(IDENTIFIER);
			setState(600);
			match(T__4);
			setState(601);
			match(IDENTIFIER);
			setState(602);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DemoVisitor ) return ((DemoVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__9);
			setState(605);
			match(WS);
			setState(606);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u0263\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3"+
		"\7\3R\n\3\f\3\16\3U\13\3\6\3W\n\3\r\3\16\3X\3\3\3\3\3\3\7\3^\n\3\f\3\16"+
		"\3a\13\3\3\3\3\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\6\3l\n\3\r\3\16\3m\6"+
		"\3p\n\3\r\3\16\3q\3\3\5\3u\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4\u0081\n\4\r\4\16\4\u0082\3\4\3\4\3\4\3\4\7\4\u0089\n\4\f\4\16\4\u008c"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0096\n\4\f\4\16\4\u0099\13"+
		"\4\3\4\3\4\3\4\3\4\6\4\u009f\n\4\r\4\16\4\u00a0\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b7"+
		"\n\5\3\6\3\6\7\6\u00bb\n\6\f\6\16\6\u00be\13\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\7\7\u00c6\n\7\f\7\16\7\u00c9\13\7\3\7\3\7\3\7\6\7\u00ce\n\7\r\7\16\7"+
		"\u00cf\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00df\n"+
		"\7\3\7\3\7\3\7\3\7\6\7\u00e5\n\7\r\7\16\7\u00e6\7\7\u00e9\n\7\f\7\16\7"+
		"\u00ec\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f8\n\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0109\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0117"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0125\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u012e\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013f\n\r\f\r\16\r\u0142\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0181\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0190\n\16\f\16\16\16\u0193\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u019c\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u01aa\n\17\f\17\16\17\u01ad"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01d0\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u01db\n\20\f\20\16\20\u01de\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01e8\n\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01f7\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u01ff\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u020b\n\26\f\26\16\26\u020e\13\26\3\26\5\26\u0211\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021b\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0223\n\27\7\27\u0225\n\27\f\27\16\27\u0228\13\27"+
		"\3\27\5\27\u022b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0239\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0256\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\2\7\f\30\32\34\36\36\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\2\u02ac\2:\3\2\2\2\4t\3\2\2\2"+
		"\6\u00ab\3\2\2\2\b\u00b6\3\2\2\2\n\u00b8\3\2\2\2\f\u00de\3\2\2\2\16\u00ed"+
		"\3\2\2\2\20\u00f1\3\2\2\2\22\u0108\3\2\2\2\24\u0116\3\2\2\2\26\u0124\3"+
		"\2\2\2\30\u012d\3\2\2\2\32\u0180\3\2\2\2\34\u019b\3\2\2\2\36\u01cf\3\2"+
		"\2\2 \u01e7\3\2\2\2\"\u01e9\3\2\2\2$\u01f6\3\2\2\2&\u01fe\3\2\2\2(\u0200"+
		"\3\2\2\2*\u0210\3\2\2\2,\u022a\3\2\2\2.\u022c\3\2\2\2\60\u0238\3\2\2\2"+
		"\62\u023a\3\2\2\2\64\u0255\3\2\2\2\66\u0257\3\2\2\28\u025e\3\2\2\2:;\7"+
		"$\2\2;<\7\20\2\2<=\5\4\3\2=>\5\6\4\2>?\5\4\3\2?@\7%\2\2@\3\3\2\2\2AB\5"+
		"\"\22\2BC\7\20\2\2CE\3\2\2\2DA\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"M\3\2\2\2HI\5&\24\2IJ\7\20\2\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5.\30\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VD\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Yu\3\2\2\2Z[\5\"\22\2[\\\7\20\2\2\\^\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2"+
		"\2\2_`\3\2\2\2`g\3\2\2\2a_\3\2\2\2bc\5&\24\2cd\7\20\2\2df\3\2\2\2eb\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\5.\30\2kj\3"+
		"\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2o_\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2ru\3\2\2\2su\3\2\2\2tV\3\2\2\2to\3\2\2\2ts\3\2\2\2u\5"+
		"\3\2\2\2vw\7&\2\2wx\5\f\7\2xy\7\'\2\2yz\7\20\2\2z\u00ac\3\2\2\2{|\7&\2"+
		"\2|\u0080\7\20\2\2}~\5\22\n\2~\177\7\20\2\2\177\u0081\3\2\2\2\u0080}\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008a\5\f\7\2\u0085\u0086\5\22\n\2\u0086\u0087\7"+
		"\20\2\2\u0087\u0089\3\2\2\2\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\'\2\2\u008e\u008f\7\20\2\2\u008f\u00ac\3\2\2\2\u0090"+
		"\u0091\7&\2\2\u0091\u0097\7\20\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7"+
		"\20\2\2\u0094\u0096\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009e\5\f\7\2\u009b\u009c\5\22\n\2\u009c\u009d\7\20\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3"+
		"\u00a4\7\20\2\2\u00a4\u00ac\3\2\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a7\7\20"+
		"\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\'\2\2\u00a9\u00aa\7\20\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00abv\3\2\2\2\u00ab{\3\2\2\2\u00ab\u0090\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\5\16\b"+
		"\2\u00af\u00b0\5\f\7\2\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3"+
		"\5\16\b\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\5\n\6\2\u00b5\u00b7\3\2\2\2"+
		"\u00b6\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\t\3\2\2\2\u00b8\u00bc\7"+
		"\17\2\2\u00b9\u00bb\7\"\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c0\5\f\7\2\u00c0\13\3\2\2\2\u00c1\u00c7\b\7\1\2\u00c2\u00c3"+
		"\5\22\n\2\u00c3\u00c4\7\20\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c2\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00df"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\7\20\2\2"+
		"\u00cc\u00ce\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\f\7\7\u00d2"+
		"\u00df\3\2\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\5"+
		"\f\7\2\u00d6\u00d7\7\25\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00df\3\2\2\2\u00d9"+
		"\u00df\5\b\5\2\u00da\u00db\7\16\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\5"+
		"\f\7\3\u00dd\u00df\3\2\2\2\u00de\u00c1\3\2\2\2\u00de\u00cd\3\2\2\2\u00de"+
		"\u00d3\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00ea\3\2"+
		"\2\2\u00e0\u00e4\f\6\2\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\7\20\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\r\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\5\32\16\2\u00ef\u00f0"+
		"\7\4\2\2\u00f0\17\3\2\2\2\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7\20\2\2\u00f3"+
		"\u00f7\5\f\7\2\u00f4\u00f5\5\60\31\2\u00f5\u00f6\7\20\2\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7\25\2\2\u00fa\u00fb\7\20\2\2\u00fb\21\3\2\2\2\u00fc\u0109\5\24"+
		"\13\2\u00fd\u0109\5\26\f\2\u00fe\u0109\5\30\r\2\u00ff\u0109\5\32\16\2"+
		"\u0100\u0109\5\"\22\2\u0101\u0109\5&\24\2\u0102\u0109\5(\25\2\u0103\u0109"+
		"\5\62\32\2\u0104\u0109\5$\23\2\u0105\u0109\5\64\33\2\u0106\u0109\5\66"+
		"\34\2\u0107\u0109\58\35\2\u0108\u00fc\3\2\2\2\u0108\u00fd\3\2\2\2\u0108"+
		"\u00fe\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2"+
		"\2\2\u0108\u0102\3\2\2\2\u0108\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108"+
		"\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\23\3\2\2"+
		"\2\u010a\u010b\7\5\2\2\u010b\u010c\7\"\2\2\u010c\u0117\7\23\2\2\u010d"+
		"\u010e\7\5\2\2\u010e\u010f\7\"\2\2\u010f\u0117\7!\2\2\u0110\u0111\7\5"+
		"\2\2\u0111\u0112\7\"\2\2\u0112\u0117\7\21\2\2\u0113\u0114\7\5\2\2\u0114"+
		"\u0115\7\"\2\2\u0115\u0117\7\22\2\2\u0116\u010a\3\2\2\2\u0116\u010d\3"+
		"\2\2\2\u0116\u0110\3\2\2\2\u0116\u0113\3\2\2\2\u0117\25\3\2\2\2\u0118"+
		"\u0119\7\6\2\2\u0119\u011a\7\"\2\2\u011a\u0125\7\23\2\2\u011b\u011c\7"+
		"\6\2\2\u011c\u011d\7\"\2\2\u011d\u0125\7!\2\2\u011e\u011f\7\6\2\2\u011f"+
		"\u0120\7\"\2\2\u0120\u0125\7\21\2\2\u0121\u0122\7\6\2\2\u0122\u0123\7"+
		"\"\2\2\u0123\u0125\7\22\2\2\u0124\u0118\3\2\2\2\u0124\u011b\3\2\2\2\u0124"+
		"\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0125\27\3\2\2\2\u0126\u0127\b\r\1"+
		"\2\u0127\u0128\7\3\2\2\u0128\u0129\5\30\r\2\u0129\u012a\7\4\2\2\u012a"+
		"\u012e\3\2\2\2\u012b\u012e\7\21\2\2\u012c\u012e\7!\2\2\u012d\u0126\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0140\3\2\2\2\u012f"+
		"\u0130\f\6\2\2\u0130\u0131\7\26\2\2\u0131\u013f\5\30\r\7\u0132\u0133\f"+
		"\b\2\2\u0133\u0134\7\27\2\2\u0134\u013f\7\21\2\2\u0135\u0136\f\7\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u0138\7\3\2\2\u0138\u0139\5\30\r\2\u0139\u013a\7"+
		"\4\2\2\u013a\u013f\3\2\2\2\u013b\u013c\f\4\2\2\u013c\u013d\7\27\2\2\u013d"+
		"\u013f\7!\2\2\u013e\u012f\3\2\2\2\u013e\u0132\3\2\2\2\u013e\u0135\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\31\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\b\16\1"+
		"\2\u0144\u0145\7\3\2\2\u0145\u0146\5\32\16\2\u0146\u0147\7\4\2\2\u0147"+
		"\u0181\3\2\2\2\u0148\u0149\7\32\2\2\u0149\u014a\7\"\2\2\u014a\u0181\5"+
		"\32\16\22\u014b\u014c\7\32\2\2\u014c\u0181\5\32\16\21\u014d\u014e\5\36"+
		"\20\2\u014e\u014f\7\"\2\2\u014f\u0150\7\30\2\2\u0150\u0151\7\"\2\2\u0151"+
		"\u0152\5\34\17\2\u0152\u0181\3\2\2\2\u0153\u0154\5\36\20\2\u0154\u0155"+
		"\7\"\2\2\u0155\u0156\7\31\2\2\u0156\u0157\7\"\2\2\u0157\u0158\5\34\17"+
		"\2\u0158\u0181\3\2\2\2\u0159\u015a\5\34\17\2\u015a\u015b\7\"\2\2\u015b"+
		"\u015c\7\30\2\2\u015c\u015d\7\"\2\2\u015d\u015e\5\36\20\2\u015e\u0181"+
		"\3\2\2\2\u015f\u0160\5\34\17\2\u0160\u0161\7\"\2\2\u0161\u0162\7\31\2"+
		"\2\u0162\u0163\7\"\2\2\u0163\u0164\5\36\20\2\u0164\u0181\3\2\2\2\u0165"+
		"\u0166\5 \21\2\u0166\u0167\7\"\2\2\u0167\u0168\7\30\2\2\u0168\u0169\7"+
		"\"\2\2\u0169\u016a\5\34\17\2\u016a\u0181\3\2\2\2\u016b\u016c\5 \21\2\u016c"+
		"\u016d\7\"\2\2\u016d\u016e\7\31\2\2\u016e\u016f\7\"\2\2\u016f\u0170\5"+
		"\34\17\2\u0170\u0181\3\2\2\2\u0171\u0172\5\34\17\2\u0172\u0173\7\"\2\2"+
		"\u0173\u0174\7\30\2\2\u0174\u0175\7\"\2\2\u0175\u0176\5 \21\2\u0176\u0181"+
		"\3\2\2\2\u0177\u0178\5\34\17\2\u0178\u0179\7\"\2\2\u0179\u017a\7\31\2"+
		"\2\u017a\u017b\7\"\2\2\u017b\u017c\5 \21\2\u017c\u0181\3\2\2\2\u017d\u0181"+
		"\5\36\20\2\u017e\u0181\5 \21\2\u017f\u0181\5\34\17\2\u0180\u0143\3\2\2"+
		"\2\u0180\u0148\3\2\2\2\u0180\u014b\3\2\2\2\u0180\u014d\3\2\2\2\u0180\u0153"+
		"\3\2\2\2\u0180\u0159\3\2\2\2\u0180\u015f\3\2\2\2\u0180\u0165\3\2\2\2\u0180"+
		"\u016b\3\2\2\2\u0180\u0171\3\2\2\2\u0180\u0177\3\2\2\2\u0180\u017d\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0191\3\2\2\2\u0182"+
		"\u0183\f\20\2\2\u0183\u0184\7\33\2\2\u0184\u0190\5\32\16\21\u0185\u0186"+
		"\f\17\2\2\u0186\u0187\7\"\2\2\u0187\u0188\7\30\2\2\u0188\u0189\7\"\2\2"+
		"\u0189\u0190\5\32\16\20\u018a\u018b\f\16\2\2\u018b\u018c\7\"\2\2\u018c"+
		"\u018d\7\31\2\2\u018d\u018e\7\"\2\2\u018e\u0190\5\32\16\17\u018f\u0182"+
		"\3\2\2\2\u018f\u0185\3\2\2\2\u018f\u018a\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\33\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0194\u0195\b\17\1\2\u0195\u0196\7\3\2\2\u0196\u0197\5\34\17\2\u0197"+
		"\u0198\7\4\2\2\u0198\u019c\3\2\2\2\u0199\u019c\7\22\2\2\u019a\u019c\7"+
		"!\2\2\u019b\u0194\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u01ab\3\2\2\2\u019d\u019e\f\5\2\2\u019e\u019f\7\31\2\2\u019f\u01aa\5"+
		"\34\17\6\u01a0\u01a1\f\7\2\2\u01a1\u01a2\7\30\2\2\u01a2\u01aa\7\22\2\2"+
		"\u01a3\u01a4\f\6\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\7\3\2\2\u01a6\u01a7"+
		"\5\34\17\2\u01a7\u01a8\7\4\2\2\u01a8\u01aa\3\2\2\2\u01a9\u019d\3\2\2\2"+
		"\u01a9\u01a0\3\2\2\2\u01a9\u01a3\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\35\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\b\20\1\2\u01af\u01b0\7\3\2\2\u01b0\u01b1\5\36\20\2\u01b1\u01b2"+
		"\7\4\2\2\u01b2\u01d0\3\2\2\2\u01b3\u01b4\5 \21\2\u01b4\u01b5\7\33\2\2"+
		"\u01b5\u01b6\5 \21\2\u01b6\u01d0\3\2\2\2\u01b7\u01b8\5 \21\2\u01b8\u01b9"+
		"\7\33\2\2\u01b9\u01ba\5\36\20\t\u01ba\u01d0\3\2\2\2\u01bb\u01bc\5\34\17"+
		"\2\u01bc\u01bd\7\33\2\2\u01bd\u01be\5\36\20\7\u01be\u01d0\3\2\2\2\u01bf"+
		"\u01c0\5 \21\2\u01c0\u01c1\7\33\2\2\u01c1\u01c2\5\34\17\2\u01c2\u01d0"+
		"\3\2\2\2\u01c3\u01c4\5\34\17\2\u01c4\u01c5\7\33\2\2\u01c5\u01c6\5 \21"+
		"\2\u01c6\u01d0\3\2\2\2\u01c7\u01c8\5\34\17\2\u01c8\u01c9\7\33\2\2\u01c9"+
		"\u01ca\5\34\17\2\u01ca\u01d0\3\2\2\2\u01cb\u01cc\5\30\r\2\u01cc\u01cd"+
		"\7\33\2\2\u01cd\u01ce\5\30\r\2\u01ce\u01d0\3\2\2\2\u01cf\u01ae\3\2\2\2"+
		"\u01cf\u01b3\3\2\2\2\u01cf\u01b7\3\2\2\2\u01cf\u01bb\3\2\2\2\u01cf\u01bf"+
		"\3\2\2\2\u01cf\u01c3\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0"+
		"\u01dc\3\2\2\2\u01d1\u01d2\f\f\2\2\u01d2\u01d3\7\33\2\2\u01d3\u01db\5"+
		"\36\20\r\u01d4\u01d5\f\n\2\2\u01d5\u01d6\7\33\2\2\u01d6\u01db\5 \21\2"+
		"\u01d7\u01d8\f\b\2\2\u01d8\u01d9\7\33\2\2\u01d9\u01db\5\34\17\2\u01da"+
		"\u01d1\3\2\2\2\u01da\u01d4\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\37\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e0\7\3\2\2\u01e0\u01e1\5 \21\2\u01e1\u01e2\7\4\2\2\u01e2"+
		"\u01e8\3\2\2\2\u01e3\u01e4\5\30\r\2\u01e4\u01e5\7\34\2\2\u01e5\u01e6\5"+
		"\30\r\2\u01e6\u01e8\3\2\2\2\u01e7\u01df\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e8"+
		"!\3\2\2\2\u01e9\u01ea\7\35\2\2\u01ea\u01eb\7\"\2\2\u01eb\u01ec\7!\2\2"+
		"\u01ec#\3\2\2\2\u01ed\u01ee\7\36\2\2\u01ee\u01ef\7\"\2\2\u01ef\u01f7\7"+
		"!\2\2\u01f0\u01f1\7\37\2\2\u01f1\u01f2\7\"\2\2\u01f2\u01f7\7!\2\2\u01f3"+
		"\u01f4\7 \2\2\u01f4\u01f5\7\"\2\2\u01f5\u01f7\7!\2\2\u01f6\u01ed\3\2\2"+
		"\2\u01f6\u01f0\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7%\3\2\2\2\u01f8\u01f9"+
		"\7!\2\2\u01f9\u01fa\7#\2\2\u01fa\u01ff\5\30\r\2\u01fb\u01fc\7!\2\2\u01fc"+
		"\u01fd\7#\2\2\u01fd\u01ff\5\32\16\2\u01fe\u01f8\3\2\2\2\u01fe\u01fb\3"+
		"\2\2\2\u01ff\'\3\2\2\2\u0200\u0201\7!\2\2\u0201\u0202\7#\2\2\u0202\u0203"+
		"\5\62\32\2\u0203)\3\2\2\2\u0204\u0205\7\3\2\2\u0205\u0211\7\4\2\2\u0206"+
		"\u0207\7\3\2\2\u0207\u020c\7!\2\2\u0208\u0209\7\7\2\2\u0209\u020b\7!\2"+
		"\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\7\4\2\2\u0210"+
		"\u0204\3\2\2\2\u0210\u0206\3\2\2\2\u0211+\3\2\2\2\u0212\u0213\7\3\2\2"+
		"\u0213\u022b\7\4\2\2\u0214\u021a\7\3\2\2\u0215\u021b\7\21\2\2\u0216\u021b"+
		"\7\22\2\2\u0217\u021b\7!\2\2\u0218\u021b\5\30\r\2\u0219\u021b\5\32\16"+
		"\2\u021a\u0215\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u0226\3\2\2\2\u021c\u0222\7\7\2\2\u021d"+
		"\u0223\7\21\2\2\u021e\u0223\7\22\2\2\u021f\u0223\7!\2\2\u0220\u0223\5"+
		"\30\r\2\u0221\u0223\5\32\16\2\u0222\u021d\3\2\2\2\u0222\u021e\3\2\2\2"+
		"\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u0225"+
		"\3\2\2\2\u0224\u021c\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\7\4"+
		"\2\2\u022a\u0212\3\2\2\2\u022a\u0214\3\2\2\2\u022b-\3\2\2\2\u022c\u022d"+
		"\7\b\2\2\u022d\u022e\7\"\2\2\u022e\u022f\7!\2\2\u022f\u0230\5*\26\2\u0230"+
		"\u0231\5\20\t\2\u0231/\3\2\2\2\u0232\u0233\7\t\2\2\u0233\u0234\7\"\2\2"+
		"\u0234\u0239\5\30\r\2\u0235\u0236\7\t\2\2\u0236\u0237\7\"\2\2\u0237\u0239"+
		"\5\32\16\2\u0238\u0232\3\2\2\2\u0238\u0235\3\2\2\2\u0239\61\3\2\2\2\u023a"+
		"\u023b\7!\2\2\u023b\u023c\5,\27\2\u023c\63\3\2\2\2\u023d\u023e\7\n\2\2"+
		"\u023e\u023f\7\3\2\2\u023f\u0240\7!\2\2\u0240\u0241\7\7\2\2\u0241\u0242"+
		"\7\21\2\2\u0242\u0256\7\4\2\2\u0243\u0244\7\n\2\2\u0244\u0245\7\3\2\2"+
		"\u0245\u0246\7!\2\2\u0246\u0247\7\7\2\2\u0247\u0248\7\22\2\2\u0248\u0256"+
		"\7\4\2\2\u0249\u024a\7\n\2\2\u024a\u024b\7\3\2\2\u024b\u024c\7!\2\2\u024c"+
		"\u024d\7\7\2\2\u024d\u024e\7\23\2\2\u024e\u0256\7\4\2\2\u024f\u0250\7"+
		"\n\2\2\u0250\u0251\7\3\2\2\u0251\u0252\7!\2\2\u0252\u0253\7\7\2\2\u0253"+
		"\u0254\7!\2\2\u0254\u0256\7\4\2\2\u0255\u023d\3\2\2\2\u0255\u0243\3\2"+
		"\2\2\u0255\u0249\3\2\2\2\u0255\u024f\3\2\2\2\u0256\65\3\2\2\2\u0257\u0258"+
		"\7\13\2\2\u0258\u0259\7\3\2\2\u0259\u025a\7!\2\2\u025a\u025b\7\7\2\2\u025b"+
		"\u025c\7!\2\2\u025c\u025d\7\4\2\2\u025d\67\3\2\2\2\u025e\u025f\7\f\2\2"+
		"\u025f\u0260\7\"\2\2\u0260\u0261\7!\2\2\u02619\3\2\2\2\62FMSX_gmqt\u0082"+
		"\u008a\u0097\u00a0\u00ab\u00b6\u00bc\u00c7\u00cf\u00de\u00e6\u00ea\u00f7"+
		"\u0108\u0116\u0124\u012d\u013e\u0140\u0180\u018f\u0191\u019b\u01a9\u01ab"+
		"\u01cf\u01da\u01dc\u01e7\u01f6\u01fe\u020c\u0210\u021a\u0222\u0226\u022a"+
		"\u0238\u0255";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}