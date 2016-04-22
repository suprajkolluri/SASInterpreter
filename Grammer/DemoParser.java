// Generated from Demo.g4 by ANTLR 4.5.3
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
		T__0=1, T__1=2, T__2=3, IF=4, WHILE=5, ELSE=6, NEWLINE=7, INT=8, BOOL=9, 
		BSTART=10, BEND=11, ADDSUB=12, MULDIV=13, AND=14, OR=15, NOT=16, EQUAL=17, 
		COMPARE=18, DATATYPE=19, IDENTIFIER=20, WS=21, ASSIGNMENT=22, PSTART=23, 
		PEND=24, FUNCTIONNAME=25, RETURN=26;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_funcblock = 2, RULE_ifblock = 3, 
		RULE_exp = 4, RULE_iexp = 5, RULE_conditional = 6, RULE_bexp = 7, RULE_equality = 8, 
		RULE_comparison = 9, RULE_declare = 10, RULE_assign = 11, RULE_funcDeclare = 12, 
		RULE_returnexp = 13;
	public static final String[] ruleNames = {
		"program", "block", "funcblock", "ifblock", "exp", "iexp", "conditional", 
		"bexp", "equality", "comparison", "declare", "assign", "funcDeclare", 
		"returnexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'IF'", "'WHILE'", "'ELSE'", "'\n'", null, 
		null, "'{'", "'}'", null, null, "'AND'", "'OR'", "'NOT'", null, null, 
		null, null, null, "'='", "'['", "']'", null, "'Return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "IF", "WHILE", "ELSE", "NEWLINE", "INT", "BOOL", 
		"BSTART", "BEND", "ADDSUB", "MULDIV", "AND", "OR", "NOT", "EQUAL", "COMPARE", 
		"DATATYPE", "IDENTIFIER", "WS", "ASSIGNMENT", "PSTART", "PEND", "FUNCTIONNAME", 
		"RETURN"
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
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public TerminalNode PEND() { return getToken(DemoParser.PEND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(PSTART);
			setState(29);
			match(NEWLINE);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					exp();
					setState(31);
					match(NEWLINE);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					block();
					setState(39);
					match(NEWLINE);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(46);
				exp();
				setState(47);
				match(NEWLINE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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

	public static class BlockContext extends ParserRuleContext {
		public FuncDeclareContext funcDeclare() {
			return getRuleContext(FuncDeclareContext.class,0);
		}
		public TerminalNode IF() { return getToken(DemoParser.IF, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(DemoParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(DemoParser.WHILE, 0); }
		public TerminalNode BSTART() { return getToken(DemoParser.BSTART, 0); }
		public TerminalNode BEND() { return getToken(DemoParser.BEND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				funcDeclare();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IF);
				setState(58);
				match(T__0);
				setState(59);
				conditional(0);
				setState(60);
				match(T__1);
				setState(61);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(IF);
				setState(64);
				match(T__0);
				setState(65);
				conditional(0);
				setState(66);
				match(T__1);
				setState(67);
				block();
				setState(68);
				match(NEWLINE);
				setState(69);
				match(ELSE);
				setState(70);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(WHILE);
				setState(73);
				match(T__0);
				setState(74);
				conditional(0);
				setState(75);
				match(T__1);
				setState(76);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(BSTART);
				setState(79);
				match(NEWLINE);
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						exp();
						setState(81);
						match(NEWLINE);
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(91); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						block();
						setState(89);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(93); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(95);
					exp();
					setState(96);
					match(NEWLINE);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(BEND);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(BSTART);
				setState(106);
				match(NEWLINE);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << BOOL) | (1L << NOT) | (1L << DATATYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(107);
					exp();
					setState(108);
					match(NEWLINE);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(BEND);
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

	public static class FuncblockContext extends ParserRuleContext {
		public TerminalNode BSTART() { return getToken(DemoParser.BSTART, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(DemoParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DemoParser.NEWLINE, i);
		}
		public ReturnexpContext returnexp() {
			return getRuleContext(ReturnexpContext.class,0);
		}
		public TerminalNode BEND() { return getToken(DemoParser.BEND, 0); }
		public FuncblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFuncblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFuncblock(this);
		}
	}

	public final FuncblockContext funcblock() throws RecognitionException {
		FuncblockContext _localctx = new FuncblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(BSTART);
			setState(119);
			match(NEWLINE);
			setState(120);
			returnexp();
			setState(121);
			match(NEWLINE);
			setState(122);
			match(BEND);
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
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIfblock(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			setState(125);
			match(WS);
			setState(126);
			match(T__0);
			setState(127);
			conditional(0);
			setState(128);
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

	public static class ExpContext extends ParserRuleContext {
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				iexp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				conditional(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				declare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				assign();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterIexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitIexp(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_iexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(137);
				match(T__0);
				setState(138);
				iexp(0);
				setState(139);
				match(T__1);
				}
				break;
			case INT:
				{
				setState(141);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				setState(142);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						match(ADDSUB);
						setState(147);
						iexp(5);
						}
						break;
					case 2:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(148);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(149);
						match(MULDIV);
						setState(150);
						match(INT);
						}
						break;
					case 3:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						match(MULDIV);
						setState(153);
						match(T__0);
						setState(154);
						iexp(0);
						setState(155);
						match(T__1);
						}
						break;
					case 4:
						{
						_localctx = new IexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_iexp);
						setState(157);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(158);
						match(MULDIV);
						setState(159);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(DemoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DemoParser.WS, i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitConditional(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_conditional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(166);
				match(T__0);
				setState(167);
				conditional(0);
				setState(168);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(170);
				equality(0);
				setState(171);
				match(WS);
				setState(172);
				match(AND);
				setState(173);
				match(WS);
				setState(174);
				bexp(0);
				}
				break;
			case 3:
				{
				setState(176);
				equality(0);
				setState(177);
				match(WS);
				setState(178);
				match(OR);
				setState(179);
				match(WS);
				setState(180);
				bexp(0);
				}
				break;
			case 4:
				{
				setState(182);
				bexp(0);
				setState(183);
				match(WS);
				setState(184);
				match(AND);
				setState(185);
				match(WS);
				setState(186);
				equality(0);
				}
				break;
			case 5:
				{
				setState(188);
				bexp(0);
				setState(189);
				match(WS);
				setState(190);
				match(OR);
				setState(191);
				match(WS);
				setState(192);
				equality(0);
				}
				break;
			case 6:
				{
				setState(194);
				comparison();
				setState(195);
				match(WS);
				setState(196);
				match(AND);
				setState(197);
				match(WS);
				setState(198);
				bexp(0);
				}
				break;
			case 7:
				{
				setState(200);
				comparison();
				setState(201);
				match(WS);
				setState(202);
				match(OR);
				setState(203);
				match(WS);
				setState(204);
				bexp(0);
				}
				break;
			case 8:
				{
				setState(206);
				bexp(0);
				setState(207);
				match(WS);
				setState(208);
				match(AND);
				setState(209);
				match(WS);
				setState(210);
				comparison();
				}
				break;
			case 9:
				{
				setState(212);
				bexp(0);
				setState(213);
				match(WS);
				setState(214);
				match(OR);
				setState(215);
				match(WS);
				setState(216);
				comparison();
				}
				break;
			case 10:
				{
				setState(218);
				equality(0);
				}
				break;
			case 11:
				{
				setState(219);
				comparison();
				}
				break;
			case 12:
				{
				setState(220);
				bexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(223);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(224);
						match(EQUAL);
						setState(225);
						conditional(15);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(226);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(227);
						match(WS);
						setState(228);
						match(AND);
						setState(229);
						match(WS);
						setState(230);
						conditional(14);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditional);
						setState(231);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(232);
						match(WS);
						setState(233);
						match(OR);
						setState(234);
						match(WS);
						setState(235);
						conditional(13);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public TerminalNode NOT() { return getToken(DemoParser.NOT, 0); }
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode OR() { return getToken(DemoParser.OR, 0); }
		public TerminalNode AND() { return getToken(DemoParser.AND, 0); }
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterBexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitBexp(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_bexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(242);
				match(T__0);
				setState(243);
				bexp(0);
				setState(244);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(246);
				match(NOT);
				setState(247);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(248);
				match(NOT);
				setState(249);
				match(T__0);
				setState(250);
				bexp(0);
				setState(251);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(253);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(254);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(257);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(258);
						match(OR);
						setState(259);
						bexp(4);
						}
						break;
					case 2:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						match(AND);
						setState(262);
						match(BOOL);
						}
						break;
					case 3:
						{
						_localctx = new BexpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						match(AND);
						setState(265);
						match(T__0);
						setState(266);
						bexp(0);
						setState(267);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitEquality(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_equality, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(275);
				match(T__0);
				setState(276);
				equality(0);
				setState(277);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(279);
				comparison();
				setState(280);
				match(EQUAL);
				setState(281);
				comparison();
				}
				break;
			case 3:
				{
				setState(283);
				comparison();
				setState(284);
				match(EQUAL);
				setState(285);
				equality(7);
				}
				break;
			case 4:
				{
				setState(287);
				bexp(0);
				setState(288);
				match(EQUAL);
				setState(289);
				equality(5);
				}
				break;
			case 5:
				{
				setState(291);
				comparison();
				setState(292);
				match(EQUAL);
				setState(293);
				bexp(0);
				}
				break;
			case 6:
				{
				setState(295);
				bexp(0);
				setState(296);
				match(EQUAL);
				setState(297);
				comparison();
				}
				break;
			case 7:
				{
				setState(299);
				bexp(0);
				setState(300);
				match(EQUAL);
				setState(301);
				bexp(0);
				}
				break;
			case 8:
				{
				setState(303);
				iexp(0);
				setState(304);
				match(EQUAL);
				setState(305);
				iexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310);
						match(EQUAL);
						setState(311);
						equality(11);
						}
						break;
					case 2:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(312);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(313);
						match(EQUAL);
						setState(314);
						comparison();
						}
						break;
					case 3:
						{
						_localctx = new EqualityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equality);
						setState(315);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(316);
						match(EQUAL);
						setState(317);
						bexp(0);
						}
						break;
					}
					} 
				}
				setState(322);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(T__0);
				setState(324);
				comparison();
				setState(325);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				iexp(0);
				setState(328);
				match(COMPARE);
				setState(329);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(DATATYPE);
			setState(334);
			match(WS);
			setState(335);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DemoParser.ASSIGNMENT, 0); }
		public TerminalNode INT() { return getToken(DemoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(DemoParser.BOOL, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(IDENTIFIER);
				setState(338);
				match(ASSIGNMENT);
				setState(339);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(IDENTIFIER);
				setState(341);
				match(ASSIGNMENT);
				setState(342);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(IDENTIFIER);
				setState(344);
				match(ASSIGNMENT);
				setState(345);
				iexp(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(IDENTIFIER);
				setState(347);
				match(ASSIGNMENT);
				setState(348);
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

	public static class FuncDeclareContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(DemoParser.DATATYPE, 0); }
		public TerminalNode WS() { return getToken(DemoParser.WS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DemoParser.IDENTIFIER, 0); }
		public FuncblockContext funcblock() {
			return getRuleContext(FuncblockContext.class,0);
		}
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public FuncDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterFuncDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitFuncDeclare(this);
		}
	}

	public final FuncDeclareContext funcDeclare() throws RecognitionException {
		FuncDeclareContext _localctx = new FuncDeclareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcDeclare);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(DATATYPE);
				setState(352);
				match(WS);
				setState(353);
				match(IDENTIFIER);
				setState(354);
				match(T__0);
				setState(355);
				match(T__1);
				setState(356);
				funcblock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(DATATYPE);
				setState(358);
				match(WS);
				setState(359);
				match(IDENTIFIER);
				setState(360);
				match(T__0);
				setState(361);
				declare();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(362);
					match(T__2);
					setState(363);
					declare();
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(T__1);
				setState(370);
				funcblock();
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

	public static class ReturnexpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DemoParser.RETURN, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).enterReturnexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DemoListener ) ((DemoListener)listener).exitReturnexp(this);
		}
	}

	public final ReturnexpContext returnexp() throws RecognitionException {
		ReturnexpContext _localctx = new ReturnexpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnexp);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(RETURN);
				setState(376);
				match(WS);
				setState(377);
				iexp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(RETURN);
				setState(379);
				match(WS);
				setState(380);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return iexp_sempred((IexpContext)_localctx, predIndex);
		case 6:
			return conditional_sempred((ConditionalContext)_localctx, predIndex);
		case 7:
			return bexp_sempred((BexpContext)_localctx, predIndex);
		case 8:
			return equality_sempred((EqualityContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean iexp_sempred(IexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditional_sempred(ConditionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean bexp_sempred(BexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean equality_sempred(EqualityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0182\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\7\2\64"+
		"\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\3\3\6\3^\n\3\r\3\16\3_\3\3\3\3\3\3\7\3"+
		"e\n\3\f\3\16\3h\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3q\n\3\f\3\16\3t\13"+
		"\3\3\3\5\3w\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a3\n\7"+
		"\f\7\16\7\u00a6\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e0\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ef\n\b\f\b\16\b\u00f2\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0102\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0110\n\t\f\t\16\t\u0113"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0136\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0141\n\n\f\n\16"+
		"\n\u0144\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u014e\n\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0160"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u016f\n\16\f\16\16\16\u0172\13\16\3\16\3\16\3\16\5\16\u0177\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0180\n\17\3\17\2\6\f\16\20\22"+
		"\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\u01af\2\36\3\2\2\2\4v\3\2"+
		"\2\2\6x\3\2\2\2\b~\3\2\2\2\n\u0088\3\2\2\2\f\u0091\3\2\2\2\16\u00df\3"+
		"\2\2\2\20\u0101\3\2\2\2\22\u0135\3\2\2\2\24\u014d\3\2\2\2\26\u014f\3\2"+
		"\2\2\30\u015f\3\2\2\2\32\u0176\3\2\2\2\34\u017f\3\2\2\2\36\37\7\31\2\2"+
		"\37%\7\t\2\2 !\5\n\6\2!\"\7\t\2\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3"+
		"\2\2\2%&\3\2\2\2&-\3\2\2\2\'%\3\2\2\2()\5\4\3\2)*\7\t\2\2*,\3\2\2\2+("+
		"\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\65\3\2\2\2/-\3\2\2\2\60\61\5\n"+
		"\6\2\61\62\7\t\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2"+
		"\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\32\2\29\3\3\2\2\2:w\5"+
		"\32\16\2;<\7\6\2\2<=\7\3\2\2=>\5\16\b\2>?\7\4\2\2?@\5\4\3\2@w\3\2\2\2"+
		"AB\7\6\2\2BC\7\3\2\2CD\5\16\b\2DE\7\4\2\2EF\5\4\3\2FG\7\t\2\2GH\7\b\2"+
		"\2HI\5\4\3\2Iw\3\2\2\2JK\7\7\2\2KL\7\3\2\2LM\5\16\b\2MN\7\4\2\2NO\5\4"+
		"\3\2Ow\3\2\2\2PQ\7\f\2\2QW\7\t\2\2RS\5\n\6\2ST\7\t\2\2TV\3\2\2\2UR\3\2"+
		"\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z[\5\4\3\2[\\\7"+
		"\t\2\2\\^\3\2\2\2]Z\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`f\3\2\2\2ab"+
		"\5\n\6\2bc\7\t\2\2ce\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"i\3\2\2\2hf\3\2\2\2ij\7\r\2\2jw\3\2\2\2kl\7\f\2\2lr\7\t\2\2mn\5\n\6\2"+
		"no\7\t\2\2oq\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2"+
		"tr\3\2\2\2uw\7\r\2\2v:\3\2\2\2v;\3\2\2\2vA\3\2\2\2vJ\3\2\2\2vP\3\2\2\2"+
		"vk\3\2\2\2w\5\3\2\2\2xy\7\f\2\2yz\7\t\2\2z{\5\34\17\2{|\7\t\2\2|}\7\r"+
		"\2\2}\7\3\2\2\2~\177\7\6\2\2\177\u0080\7\27\2\2\u0080\u0081\7\3\2\2\u0081"+
		"\u0082\5\16\b\2\u0082\u0083\7\4\2\2\u0083\t\3\2\2\2\u0084\u0089\5\f\7"+
		"\2\u0085\u0089\5\16\b\2\u0086\u0089\5\26\f\2\u0087\u0089\5\30\r\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\13\3\2\2\2\u008a\u008b\b\7\1\2\u008b\u008c\7\3\2\2\u008c\u008d"+
		"\5\f\7\2\u008d\u008e\7\4\2\2\u008e\u0092\3\2\2\2\u008f\u0092\7\n\2\2\u0090"+
		"\u0092\7\26\2\2\u0091\u008a\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3"+
		"\2\2\2\u0092\u00a4\3\2\2\2\u0093\u0094\f\6\2\2\u0094\u0095\7\16\2\2\u0095"+
		"\u00a3\5\f\7\7\u0096\u0097\f\b\2\2\u0097\u0098\7\17\2\2\u0098\u00a3\7"+
		"\n\2\2\u0099\u009a\f\7\2\2\u009a\u009b\7\17\2\2\u009b\u009c\7\3\2\2\u009c"+
		"\u009d\5\f\7\2\u009d\u009e\7\4\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\f\4"+
		"\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a3\7\26\2\2\u00a2\u0093\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\b\b\1\2\u00a8\u00a9\7\3\2\2\u00a9\u00aa\5\16\b\2"+
		"\u00aa\u00ab\7\4\2\2\u00ab\u00e0\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae"+
		"\7\27\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\7\27\2\2\u00b0\u00b1\5\20\t"+
		"\2\u00b1\u00e0\3\2\2\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\7\27\2\2\u00b4"+
		"\u00b5\7\21\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00e0"+
		"\3\2\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7\27\2\2\u00ba\u00bb\7\20\2"+
		"\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\5\22\n\2\u00bd\u00e0\3\2\2\2\u00be"+
		"\u00bf\5\20\t\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7\21\2\2\u00c1\u00c2"+
		"\7\27\2\2\u00c2\u00c3\5\22\n\2\u00c3\u00e0\3\2\2\2\u00c4\u00c5\5\24\13"+
		"\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\20\2\2\u00c7\u00c8\7\27\2\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00e0\3\2\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc"+
		"\7\27\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\5\20\t"+
		"\2\u00cf\u00e0\3\2\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7\27\2\2\u00d2"+
		"\u00d3\7\20\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\5\24\13\2\u00d5\u00e0"+
		"\3\2\2\2\u00d6\u00d7\5\20\t\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9\7\21\2"+
		"\2\u00d9\u00da\7\27\2\2\u00da\u00db\5\24\13\2\u00db\u00e0\3\2\2\2\u00dc"+
		"\u00e0\5\22\n\2\u00dd\u00e0\5\24\13\2\u00de\u00e0\5\20\t\2\u00df\u00a7"+
		"\3\2\2\2\u00df\u00ac\3\2\2\2\u00df\u00b2\3\2\2\2\u00df\u00b8\3\2\2\2\u00df"+
		"\u00be\3\2\2\2\u00df\u00c4\3\2\2\2\u00df\u00ca\3\2\2\2\u00df\u00d0\3\2"+
		"\2\2\u00df\u00d6\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00f0\3\2\2\2\u00e1\u00e2\f\20\2\2\u00e2\u00e3\7"+
		"\23\2\2\u00e3\u00ef\5\16\b\21\u00e4\u00e5\f\17\2\2\u00e5\u00e6\7\27\2"+
		"\2\u00e6\u00e7\7\20\2\2\u00e7\u00e8\7\27\2\2\u00e8\u00ef\5\16\b\20\u00e9"+
		"\u00ea\f\16\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed"+
		"\7\27\2\2\u00ed\u00ef\5\16\b\17\u00ee\u00e1\3\2\2\2\u00ee\u00e4\3\2\2"+
		"\2\u00ee\u00e9\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\17\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\t\1\2\u00f4"+
		"\u00f5\7\3\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\7\4\2\2\u00f7\u0102\3"+
		"\2\2\2\u00f8\u00f9\7\22\2\2\u00f9\u0102\7\13\2\2\u00fa\u00fb\7\22\2\2"+
		"\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5\20\t\2\u00fd\u00fe\7\4\2\2\u00fe\u0102"+
		"\3\2\2\2\u00ff\u0102\7\13\2\2\u0100\u0102\7\26\2\2\u0101\u00f3\3\2\2\2"+
		"\u0101\u00f8\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0111\3\2\2\2\u0103\u0104\f\5\2\2\u0104\u0105\7\21\2\2"+
		"\u0105\u0110\5\20\t\6\u0106\u0107\f\7\2\2\u0107\u0108\7\20\2\2\u0108\u0110"+
		"\7\13\2\2\u0109\u010a\f\6\2\2\u010a\u010b\7\20\2\2\u010b\u010c\7\3\2\2"+
		"\u010c\u010d\5\20\t\2\u010d\u010e\7\4\2\2\u010e\u0110\3\2\2\2\u010f\u0103"+
		"\3\2\2\2\u010f\u0106\3\2\2\2\u010f\u0109\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\21\3\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0114\u0115\b\n\1\2\u0115\u0116\7\3\2\2\u0116\u0117\5\22\n\2\u0117"+
		"\u0118\7\4\2\2\u0118\u0136\3\2\2\2\u0119\u011a\5\24\13\2\u011a\u011b\7"+
		"\23\2\2\u011b\u011c\5\24\13\2\u011c\u0136\3\2\2\2\u011d\u011e\5\24\13"+
		"\2\u011e\u011f\7\23\2\2\u011f\u0120\5\22\n\t\u0120\u0136\3\2\2\2\u0121"+
		"\u0122\5\20\t\2\u0122\u0123\7\23\2\2\u0123\u0124\5\22\n\7\u0124\u0136"+
		"\3\2\2\2\u0125\u0126\5\24\13\2\u0126\u0127\7\23\2\2\u0127\u0128\5\20\t"+
		"\2\u0128\u0136\3\2\2\2\u0129\u012a\5\20\t\2\u012a\u012b\7\23\2\2\u012b"+
		"\u012c\5\24\13\2\u012c\u0136\3\2\2\2\u012d\u012e\5\20\t\2\u012e\u012f"+
		"\7\23\2\2\u012f\u0130\5\20\t\2\u0130\u0136\3\2\2\2\u0131\u0132\5\f\7\2"+
		"\u0132\u0133\7\23\2\2\u0133\u0134\5\f\7\2\u0134\u0136\3\2\2\2\u0135\u0114"+
		"\3\2\2\2\u0135\u0119\3\2\2\2\u0135\u011d\3\2\2\2\u0135\u0121\3\2\2\2\u0135"+
		"\u0125\3\2\2\2\u0135\u0129\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u0131\3\2"+
		"\2\2\u0136\u0142\3\2\2\2\u0137\u0138\f\f\2\2\u0138\u0139\7\23\2\2\u0139"+
		"\u0141\5\22\n\r\u013a\u013b\f\n\2\2\u013b\u013c\7\23\2\2\u013c\u0141\5"+
		"\24\13\2\u013d\u013e\f\b\2\2\u013e\u013f\7\23\2\2\u013f\u0141\5\20\t\2"+
		"\u0140\u0137\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\23\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u0146\7\3\2\2\u0146\u0147\5\24\13\2\u0147\u0148\7"+
		"\4\2\2\u0148\u014e\3\2\2\2\u0149\u014a\5\f\7\2\u014a\u014b\7\24\2\2\u014b"+
		"\u014c\5\f\7\2\u014c\u014e\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0149\3\2"+
		"\2\2\u014e\25\3\2\2\2\u014f\u0150\7\25\2\2\u0150\u0151\7\27\2\2\u0151"+
		"\u0152\7\26\2\2\u0152\27\3\2\2\2\u0153\u0154\7\26\2\2\u0154\u0155\7\30"+
		"\2\2\u0155\u0160\7\n\2\2\u0156\u0157\7\26\2\2\u0157\u0158\7\30\2\2\u0158"+
		"\u0160\7\13\2\2\u0159\u015a\7\26\2\2\u015a\u015b\7\30\2\2\u015b\u0160"+
		"\5\f\7\2\u015c\u015d\7\26\2\2\u015d\u015e\7\30\2\2\u015e\u0160\5\16\b"+
		"\2\u015f\u0153\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015c"+
		"\3\2\2\2\u0160\31\3\2\2\2\u0161\u0162\7\25\2\2\u0162\u0163\7\27\2\2\u0163"+
		"\u0164\7\26\2\2\u0164\u0165\7\3\2\2\u0165\u0166\7\4\2\2\u0166\u0177\5"+
		"\6\4\2\u0167\u0168\7\25\2\2\u0168\u0169\7\27\2\2\u0169\u016a\7\26\2\2"+
		"\u016a\u016b\7\3\2\2\u016b\u0170\5\26\f\2\u016c\u016d\7\5\2\2\u016d\u016f"+
		"\5\26\f\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174"+
		"\7\4\2\2\u0174\u0175\5\6\4\2\u0175\u0177\3\2\2\2\u0176\u0161\3\2\2\2\u0176"+
		"\u0167\3\2\2\2\u0177\33\3\2\2\2\u0178\u0180\7\34\2\2\u0179\u017a\7\34"+
		"\2\2\u017a\u017b\7\27\2\2\u017b\u0180\5\f\7\2\u017c\u017d\7\34\2\2\u017d"+
		"\u017e\7\27\2\2\u017e\u0180\5\16\b\2\u017f\u0178\3\2\2\2\u017f\u0179\3"+
		"\2\2\2\u017f\u017c\3\2\2\2\u0180\35\3\2\2\2\34%-\65W_frv\u0088\u0091\u00a2"+
		"\u00a4\u00df\u00ee\u00f0\u0101\u010f\u0111\u0135\u0140\u0142\u014d\u015f"+
		"\u0170\u0176\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}