/*
 * generated by Xtext 2.10.0
 */
grammar InternalCsv;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.mleduc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package fr.mleduc.ide.contentassist.antlr.internal;

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
import fr.mleduc.services.CsvGrammarAccess;

}
@parser::members {
	private CsvGrammarAccess grammarAccess;

	public void setGrammarAccess(CsvGrammarAccess grammarAccess) {
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

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)?
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLine
entryRuleLine
:
{ before(grammarAccess.getLineRule()); }
	 ruleLine
{ after(grammarAccess.getLineRule()); } 
	 EOF 
;

// Rule Line
ruleLine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLineAccess().getGroup()); }
		(rule__Line__Group__0)
		{ after(grammarAccess.getLineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCell
entryRuleCell
:
{ before(grammarAccess.getCellRule()); }
	 ruleCell
{ after(grammarAccess.getCellRule()); } 
	 EOF 
;

// Rule Cell
ruleCell 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCellAccess().getAlternatives()); }
		(rule__Cell__Alternatives)
		{ after(grammarAccess.getCellAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getGroup_0()); }
		(rule__Cell__Group_0__0)
		{ after(grammarAccess.getCellAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getCellAccess().getGroup_1()); }
		(rule__Cell__Group_1__0)
		{ after(grammarAccess.getCellAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLinesAssignment_0()); }
	(rule__Model__LinesAssignment_0)
	{ after(grammarAccess.getModelAccess().getLinesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGroup_1()); }
	(rule__Model__Group_1__0)*
	{ after(grammarAccess.getModelAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_1__0__Impl
	rule__Model__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); }
	RULE_NL
	{ after(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLinesAssignment_1_1()); }
	(rule__Model__LinesAssignment_1_1)
	{ after(grammarAccess.getModelAccess().getLinesAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Line__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group__0__Impl
	rule__Line__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getCellsAssignment_0()); }
	(rule__Line__CellsAssignment_0)
	{ after(grammarAccess.getLineAccess().getCellsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getGroup_1()); }
	(rule__Line__Group_1__0)*
	{ after(grammarAccess.getLineAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Line__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group_1__0__Impl
	rule__Line__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getLineAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Line__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLineAccess().getCellsAssignment_1_1()); }
	(rule__Line__CellsAssignment_1_1)?
	{ after(grammarAccess.getLineAccess().getCellsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__0__Impl
	rule__Cell__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getStringCellAction_0_0()); }
	()
	{ after(grammarAccess.getCellAccess().getStringCellAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getContentAssignment_0_1()); }
	(rule__Cell__ContentAssignment_0_1)
	{ after(grammarAccess.getCellAccess().getContentAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cell__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_1__0__Impl
	rule__Cell__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getFreeCellAction_1_0()); }
	()
	{ after(grammarAccess.getCellAccess().getFreeCellAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cell__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCellAccess().getContentAssignment_1_1()); }
	(rule__Cell__ContentAssignment_1_1)
	{ after(grammarAccess.getCellAccess().getContentAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__LinesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getLinesLineParserRuleCall_0_0()); }
		ruleLine
		{ after(grammarAccess.getModelAccess().getLinesLineParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__LinesAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getLinesLineParserRuleCall_1_1_0()); }
		ruleLine
		{ after(grammarAccess.getModelAccess().getLinesLineParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__CellsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLineAccess().getCellsCellParserRuleCall_0_0()); }
		ruleCell
		{ after(grammarAccess.getLineAccess().getCellsCellParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Line__CellsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLineAccess().getCellsCellParserRuleCall_1_1_0()); }
		ruleCell
		{ after(grammarAccess.getLineAccess().getCellsCellParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__ContentAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getContentSTRINGTerminalRuleCall_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getCellAccess().getContentSTRINGTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cell__ContentAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCellAccess().getContentFREE_CELLTerminalRuleCall_1_1_0()); }
		RULE_FREE_CELL
		{ after(grammarAccess.getCellAccess().getContentFREE_CELLTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NL : ('\r'|'\n')+;

RULE_FREE_CELL : ~(('\r'|'\n'|','))*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
