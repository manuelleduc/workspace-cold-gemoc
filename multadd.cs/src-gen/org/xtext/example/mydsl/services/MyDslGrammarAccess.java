/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ExprElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Expr");
		private final RuleCall cAddParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expr:
		//	Add;
		@Override public ParserRule getRule() { return rule; }
		
		//Add
		public RuleCall getAddParserRuleCall() { return cAddParserRuleCall; }
	}
	public class AddElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Add");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAddLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAddParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Add Expr:
		//	Mult ({Add.left=current} '+' right=Add)*
		@Override public ParserRule getRule() { return rule; }
		
		//Mult ({Add.left=current} '+' right=Add)*
		public Group getGroup() { return cGroup; }
		
		//Mult
		public RuleCall getMultParserRuleCall_0() { return cMultParserRuleCall_0; }
		
		//({Add.left=current} '+' right=Add)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Add.left=current}
		public Action getAddLeftAction_1_0() { return cAddLeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=Add
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Add
		public RuleCall getRightAddParserRuleCall_1_2_0() { return cRightAddParserRuleCall_1_2_0; }
	}
	public class MultElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Mult");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Mult Expr:
		//	Primary ({Mult.left=current} '*' right=Mult)*
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({Mult.left=current} '*' right=Mult)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({Mult.left=current} '*' right=Mult)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0() { return cMultLeftAction_1_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }
		
		//right=Mult
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Mult
		public RuleCall getRightMultParserRuleCall_1_2_0() { return cRightMultParserRuleCall_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExprParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cCstParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Primary Expr:
		//	'(' Expr ')' | Cst
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Expr ')' | Cst
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' Expr ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//Expr
		public RuleCall getExprParserRuleCall_0_1() { return cExprParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//Cst
		public RuleCall getCstParserRuleCall_1() { return cCstParserRuleCall_1; }
	}
	public class CstElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Cst");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCstAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueELongParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Cst Expr:
		//	{Cst} value=ELong
		@Override public ParserRule getRule() { return rule; }
		
		//{Cst} value=ELong
		public Group getGroup() { return cGroup; }
		
		//{Cst}
		public Action getCstAction_0() { return cCstAction_0; }
		
		//value=ELong
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//ELong
		public RuleCall getValueELongParserRuleCall_1_0() { return cValueELongParserRuleCall_1_0; }
	}
	public class ELongElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ELong");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//ELong ecore::ELong:
		//	'-'? INT
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final ExprElements pExpr;
	private final AddElements pAdd;
	private final MultElements pMult;
	private final PrimaryElements pPrimary;
	private final CstElements pCst;
	private final ELongElements pELong;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pExpr = new ExprElements();
		this.pAdd = new AddElements();
		this.pMult = new MultElements();
		this.pPrimary = new PrimaryElements();
		this.pCst = new CstElements();
		this.pELong = new ELongElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Expr:
	//	Add;
	public ExprElements getExprAccess() {
		return pExpr;
	}
	
	public ParserRule getExprRule() {
		return getExprAccess().getRule();
	}
	
	//Add Expr:
	//	Mult ({Add.left=current} '+' right=Add)*
	public AddElements getAddAccess() {
		return pAdd;
	}
	
	public ParserRule getAddRule() {
		return getAddAccess().getRule();
	}
	
	//Mult Expr:
	//	Primary ({Mult.left=current} '*' right=Mult)*
	public MultElements getMultAccess() {
		return pMult;
	}
	
	public ParserRule getMultRule() {
		return getMultAccess().getRule();
	}
	
	//Primary Expr:
	//	'(' Expr ')' | Cst
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Cst Expr:
	//	{Cst} value=ELong
	public CstElements getCstAccess() {
		return pCst;
	}
	
	public ParserRule getCstRule() {
		return getCstAccess().getRule();
	}
	
	//ELong ecore::ELong:
	//	'-'? INT
	public ELongElements getELongAccess() {
		return pELong;
	}
	
	public ParserRule getELongRule() {
		return getELongAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
