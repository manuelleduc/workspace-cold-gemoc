/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleExpr
entryRuleExpr
:
{ before(grammarAccess.getExprRule()); }
	 ruleExpr
{ after(grammarAccess.getExprRule()); } 
	 EOF 
;

// Rule Expr
ruleExpr 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExprAccess().getAddParserRuleCall()); }
		ruleAdd
		{ after(grammarAccess.getExprAccess().getAddParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdd
entryRuleAdd
:
{ before(grammarAccess.getAddRule()); }
	 ruleAdd
{ after(grammarAccess.getAddRule()); } 
	 EOF 
;

// Rule Add
ruleAdd 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddAccess().getGroup()); }
		(rule__Add__Group__0)
		{ after(grammarAccess.getAddAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMult
entryRuleMult
:
{ before(grammarAccess.getMultRule()); }
	 ruleMult
{ after(grammarAccess.getMultRule()); } 
	 EOF 
;

// Rule Mult
ruleMult 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultAccess().getGroup()); }
		(rule__Mult__Group__0)
		{ after(grammarAccess.getMultAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCst
entryRuleCst
:
{ before(grammarAccess.getCstRule()); }
	 ruleCst
{ after(grammarAccess.getCstRule()); } 
	 EOF 
;

// Rule Cst
ruleCst 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCstAccess().getGroup()); }
		(rule__Cst__Group__0)
		{ after(grammarAccess.getCstAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleELong
entryRuleELong
:
{ before(grammarAccess.getELongRule()); }
	 ruleELong
{ after(grammarAccess.getELongRule()); } 
	 EOF 
;

// Rule ELong
ruleELong 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getELongAccess().getGroup()); }
		(rule__ELong__Group__0)
		{ after(grammarAccess.getELongAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getCstParserRuleCall_1()); }
		ruleCst
		{ after(grammarAccess.getPrimaryAccess().getCstParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__0__Impl
	rule__Add__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getMultParserRuleCall_0()); }
	ruleMult
	{ after(grammarAccess.getAddAccess().getMultParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getGroup_1()); }
	(rule__Add__Group_1__0)*
	{ after(grammarAccess.getAddAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Add__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group_1__0__Impl
	rule__Add__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getAddLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAddAccess().getAddLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group_1__1__Impl
	rule__Add__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getPlusSignKeyword_1_1()); }
	'+'
	{ after(grammarAccess.getAddAccess().getPlusSignKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Add__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Add__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddAccess().getRightAssignment_1_2()); }
	(rule__Add__RightAssignment_1_2)
	{ after(grammarAccess.getAddAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mult__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mult__Group__0__Impl
	rule__Mult__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getMultAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mult__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultAccess().getGroup_1()); }
	(rule__Mult__Group_1__0)*
	{ after(grammarAccess.getMultAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Mult__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mult__Group_1__0__Impl
	rule__Mult__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultAccess().getMultLeftAction_1_0()); }
	()
	{ after(grammarAccess.getMultAccess().getMultLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mult__Group_1__1__Impl
	rule__Mult__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultAccess().getAsteriskKeyword_1_1()); }
	'*'
	{ after(grammarAccess.getMultAccess().getAsteriskKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Mult__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultAccess().getRightAssignment_1_2()); }
	(rule__Mult__RightAssignment_1_2)
	{ after(grammarAccess.getMultAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
	rule__Primary__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); }
	ruleExpr
	{ after(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cst__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cst__Group__0__Impl
	rule__Cst__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cst__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCstAccess().getCstAction_0()); }
	()
	{ after(grammarAccess.getCstAccess().getCstAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cst__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cst__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cst__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCstAccess().getValueAssignment_1()); }
	(rule__Cst__ValueAssignment_1)
	{ after(grammarAccess.getCstAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ELong__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ELong__Group__0__Impl
	rule__ELong__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ELong__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ELong__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ELong__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ELong__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Add__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddAccess().getRightAddParserRuleCall_1_2_0()); }
		ruleAdd
		{ after(grammarAccess.getAddAccess().getRightAddParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Mult__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultAccess().getRightMultParserRuleCall_1_2_0()); }
		ruleMult
		{ after(grammarAccess.getMultAccess().getRightMultParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cst__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCstAccess().getValueELongParserRuleCall_1_0()); }
		ruleELong
		{ after(grammarAccess.getCstAccess().getValueELongParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
