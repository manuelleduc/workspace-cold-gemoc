/*
 * generated by Xtext 2.10.0
 */
grammar InternalMMCLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.mleduc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.mleduc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.mleduc.services.MMCLangGrammarAccess;

}

@parser::members {

 	private MMCLangGrammarAccess grammarAccess;

    public InternalMMCLangParser(TokenStream input, MMCLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Composition";
   	}

   	@Override
   	protected MMCLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleComposition
entryRuleComposition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositionRule()); }
	iv_ruleComposition=ruleComposition
	{ $current=$iv_ruleComposition.current; }
	EOF;

// Rule Composition
ruleComposition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getPackageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositionAccess().getOperationsOperationParserRuleCall_2_0());
				}
				lv_operations_2_0=ruleOperation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositionRule());
					}
					add(
						$current,
						"operations",
						lv_operations_2_0,
						"fr.mleduc.MMCLang.Operation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOperationAccess().getMergeAction_0_0(),
						$current);
				}
			)
			otherlv_1='merge'
			{
				newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getMergeKeyword_0_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOperationRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_0_2_0());
					}
				)
			)
			(
				otherlv_3='renaming'
				{
					newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getRenamingKeyword_0_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOperationAccess().getPairsPairParserRuleCall_0_3_1_0());
						}
						lv_pairs_4_0=rulePair
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOperationRule());
							}
							add(
								$current,
								"pairs",
								lv_pairs_4_0,
								"fr.mleduc.MMCLang.Pair");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getOperationAccess().getSliceAction_1_0(),
						$current);
				}
			)
			otherlv_6='slice'
			{
				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getSliceKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOperationRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_1_2_0());
					}
				)
			)
			otherlv_8='on'
			{
				newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getOnKeyword_1_3());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOperationRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getTargetsClassCrossReference_1_4_0());
					}
				)
			)*
		)
	)
;

// Entry rule entryRulePair
entryRulePair returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPairRule()); }
	iv_rulePair=rulePair
	{ $current=$iv_rulePair.current; }
	EOF;

// Rule Pair
rulePair returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPairRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getPairAccess().getFromClassCrossReference_0_0());
				}
			)
		)
		otherlv_1='=>'
		{
			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getEqualsSignGreaterThanSignKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPairAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPairRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
