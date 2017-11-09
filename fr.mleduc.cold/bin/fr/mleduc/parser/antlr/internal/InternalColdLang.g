/*
 * generated by Xtext 2.10.0
 */
grammar InternalColdLang;

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
import fr.mleduc.services.ColdLangGrammarAccess;

}

@parser::members {

 	private ColdLangGrammarAccess grammarAccess;

    public InternalColdLangParser(TokenStream input, ColdLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ColdLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getModelAccess().getConcernsConcernParserRuleCall_0_0());
				}
				lv_concerns_0_0=ruleConcern
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"concerns",
						lv_concerns_0_0,
						"fr.mleduc.ColdLang.Concern");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getLanguagesLanguageParserRuleCall_1_0());
				}
				lv_languages_1_0=ruleLanguage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"languages",
						lv_languages_1_0,
						"fr.mleduc.ColdLang.Language");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getPerspectivesPerspectiveParserRuleCall_2_0());
				}
				lv_perspectives_2_0=rulePerspective
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"perspectives",
						lv_perspectives_2_0,
						"fr.mleduc.ColdLang.Perspective");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)*
;

// Entry rule entryRuleConcern
entryRuleConcern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConcernRule()); }
	iv_ruleConcern=ruleConcern
	{ $current=$iv_ruleConcern.current; }
	EOF;

// Rule Concern
ruleConcern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='concern'
		{
			newLeafNode(otherlv_0, grammarAccess.getConcernAccess().getConcernKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConcernRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='import'
			{
				newLeafNode(otherlv_3, grammarAccess.getConcernAccess().getImportKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConcernRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getConcernAccess().getImportedPerspectiveCrossReference_3_1_0());
					}
				)
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConcernAccess().getFacetsFacetParserRuleCall_4_0_0());
					}
					lv_facets_5_0=ruleFacet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConcernRule());
						}
						add(
							$current,
							"facets",
							lv_facets_5_0,
							"fr.mleduc.ColdLang.Facet");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConcernAccess().getArtifactArtifactParserRuleCall_4_1_0());
					}
					lv_artifact_6_0=ruleArtifact
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConcernRule());
						}
						add(
							$current,
							"artifact",
							lv_artifact_6_0,
							"fr.mleduc.ColdLang.Artifact");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getConcernAccess().getFmFeatureModelParserRuleCall_5_0());
				}
				lv_fm_7_0=ruleFeatureModel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConcernRule());
					}
					set(
						$current,
						"fm",
						lv_fm_7_0,
						"fr.mleduc.ColdLang.FeatureModel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleFeatureModel
entryRuleFeatureModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureModelRule()); }
	iv_ruleFeatureModel=ruleFeatureModel
	{ $current=$iv_ruleFeatureModel.current; }
	EOF;

// Rule FeatureModel
ruleFeatureModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFeatureModelAccess().getOneOfParserRuleCall_0());
		}
		this_OneOf_0=ruleOneOf
		{
			$current = $this_OneOf_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureModelAccess().getSomeOfParserRuleCall_1());
		}
		this_SomeOf_1=ruleSomeOf
		{
			$current = $this_SomeOf_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureModelAccess().getFeatureParserRuleCall_2());
		}
		this_Feature_2=ruleFeature
		{
			$current = $this_Feature_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOneOf
entryRuleOneOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOneOfRule()); }
	iv_ruleOneOf=ruleOneOf
	{ $current=$iv_ruleOneOf.current; }
	EOF;

// Rule OneOf
ruleOneOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getOneOfAccess().getOneOfAction_0(),
					$current);
			}
		)
		(
			(
				lv_optional_1_0='?'
				{
					newLeafNode(lv_optional_1_0, grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOneOfRule());
					}
					setWithLastConsumed($current, "optional", true, "?");
				}
			)
		)?
		otherlv_2='oneOf'
		{
			newLeafNode(otherlv_2, grammarAccess.getOneOfAccess().getOneOfKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getOneOfAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOneOfRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='['
		{
			newLeafNode(otherlv_4, grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4());
		}
		(
			otherlv_5='-'
			{
				newLeafNode(otherlv_5, grammarAccess.getOneOfAccess().getHyphenMinusKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOneOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0());
					}
					lv_children_6_0=ruleFeatureModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOneOfRule());
						}
						add(
							$current,
							"children",
							lv_children_6_0,
							"fr.mleduc.ColdLang.FeatureModel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOneOfAccess().getConditionConditionParserRuleCall_7_0());
				}
				lv_condition_8_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOneOfRule());
					}
					set(
						$current,
						"condition",
						lv_condition_8_0,
						"fr.mleduc.ColdLang.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSomeOf
entryRuleSomeOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSomeOfRule()); }
	iv_ruleSomeOf=ruleSomeOf
	{ $current=$iv_ruleSomeOf.current; }
	EOF;

// Rule SomeOf
ruleSomeOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSomeOfAccess().getSomeOfAction_0(),
					$current);
			}
		)
		(
			(
				lv_optional_1_0='?'
				{
					newLeafNode(lv_optional_1_0, grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSomeOfRule());
					}
					setWithLastConsumed($current, "optional", true, "?");
				}
			)
		)?
		otherlv_2='someOf'
		{
			newLeafNode(otherlv_2, grammarAccess.getSomeOfAccess().getSomeOfKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSomeOfAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSomeOfRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='['
		{
			newLeafNode(otherlv_4, grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4());
		}
		(
			otherlv_5='-'
			{
				newLeafNode(otherlv_5, grammarAccess.getSomeOfAccess().getHyphenMinusKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSomeOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0());
					}
					lv_children_6_0=ruleFeatureModel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSomeOfRule());
						}
						add(
							$current,
							"children",
							lv_children_6_0,
							"fr.mleduc.ColdLang.FeatureModel");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSomeOfAccess().getConditionConditionParserRuleCall_7_0());
				}
				lv_condition_8_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSomeOfRule());
					}
					set(
						$current,
						"condition",
						lv_condition_8_0,
						"fr.mleduc.ColdLang.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFeatureAccess().getFeatureAction_0(),
					$current);
			}
		)
		(
			(
				lv_optional_1_0='?'
				{
					newLeafNode(lv_optional_1_0, grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed($current, "optional", true, "?");
				}
			)
		)?
		otherlv_2='feature'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getConditionConditionParserRuleCall_4_0());
				}
				lv_condition_4_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"condition",
						lv_condition_4_0,
						"fr.mleduc.ColdLang.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleLanguage
entryRuleLanguage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageRule()); }
	iv_ruleLanguage=ruleLanguage
	{ $current=$iv_ruleLanguage.current; }
	EOF;

// Rule Language
ruleLanguage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='language'
		{
			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLanguageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageAccess().getOperatorsLanguageOperatorParserRuleCall_3_0());
				}
				lv_operators_3_0=ruleLanguageOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageRule());
					}
					add(
						$current,
						"operators",
						lv_operators_3_0,
						"fr.mleduc.ColdLang.LanguageOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLanguageOperator
entryRuleLanguageOperator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageOperatorRule()); }
	iv_ruleLanguageOperator=ruleLanguageOperator
	{ $current=$iv_ruleLanguageOperator.current; }
	EOF;

// Rule LanguageOperator
ruleLanguageOperator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getLanguageOperatorAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLanguageOperatorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getLanguageOperatorAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLanguageOperatorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getLanguageOperatorAccess().getTypeLanguageCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='=>'
			{
				newLeafNode(otherlv_3, grammarAccess.getLanguageOperatorAccess().getEqualsSignGreaterThanSignKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLanguageOperatorRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getLanguageOperatorAccess().getTypesLanguageCrossReference_3_1_0());
					}
				)
			)
		)*
		otherlv_5='['
		{
			newLeafNode(otherlv_5, grammarAccess.getLanguageOperatorAccess().getLeftSquareBracketKeyword_4());
		}
		(
			(
				lv_description_6_0=RULE_STRING
				{
					newLeafNode(lv_description_6_0, grammarAccess.getLanguageOperatorAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLanguageOperatorRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_6_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_7=']'
		{
			newLeafNode(otherlv_7, grammarAccess.getLanguageOperatorAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRulePerspective
entryRulePerspective returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPerspectiveRule()); }
	iv_rulePerspective=rulePerspective
	{ $current=$iv_rulePerspective.current; }
	EOF;

// Rule Perspective
rulePerspective returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='perspective'
		{
			newLeafNode(otherlv_0, grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerspectiveRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPerspectiveAccess().getLanguagesPerspectiveLanguageParserRuleCall_3_0());
				}
				lv_languages_3_0=rulePerspectiveLanguage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPerspectiveRule());
					}
					add(
						$current,
						"languages",
						lv_languages_3_0,
						"fr.mleduc.ColdLang.PerspectiveLanguage");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePerspectiveLanguage
entryRulePerspectiveLanguage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPerspectiveLanguageRule()); }
	iv_rulePerspectiveLanguage=rulePerspectiveLanguage
	{ $current=$iv_rulePerspectiveLanguage.current; }
	EOF;

// Rule PerspectiveLanguage
rulePerspectiveLanguage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPerspectiveLanguageAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPerspectiveLanguageAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageCrossReference_2_0());
				}
			)
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorCrossReference_3_0_0());
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageCrossReference_3_1_0());
					}
					ruleIDS
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFacet
entryRuleFacet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFacetRule()); }
	iv_ruleFacet=ruleFacet
	{ $current=$iv_ruleFacet.current; }
	EOF;

// Rule Facet
ruleFacet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='facet'
		{
			newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFacetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFacetRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getFacetAccess().getPerspectivePerspectiveCrossReference_3_0());
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_4());
		}
		otherlv_5='activation'
		{
			newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getActivationKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getActivationConditionParserRuleCall_6_0());
				}
				lv_activation_6_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					set(
						$current,
						"activation",
						lv_activation_6_0,
						"fr.mleduc.ColdLang.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetAccess().getCompositionsFacetCompositionParserRuleCall_7_0());
				}
				lv_compositions_7_0=ruleFacetComposition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetRule());
					}
					add(
						$current,
						"compositions",
						lv_compositions_7_0,
						"fr.mleduc.ColdLang.FacetComposition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFacetComposition
entryRuleFacetComposition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFacetCompositionRule()); }
	iv_ruleFacetComposition=ruleFacetComposition
	{ $current=$iv_ruleFacetComposition.current; }
	EOF;

// Rule FacetComposition
ruleFacetComposition returns [EObject current=null]
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
						$current = createModelElement(grammarAccess.getFacetCompositionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageCrossReference_0_0());
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getFacetCompositionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFacetCompositionAccess().getApplicationApplicationParserRuleCall_2_0());
				}
				lv_application_2_0=ruleApplication
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFacetCompositionRule());
					}
					set(
						$current,
						"application",
						lv_application_2_0,
						"fr.mleduc.ColdLang.Application");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApplicationRule()); }
	iv_ruleApplication=ruleApplication
	{ $current=$iv_ruleApplication.current; }
	EOF;

// Rule Application
ruleApplication returns [EObject current=null]
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
						grammarAccess.getApplicationAccess().getArtifactRefAction_0_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getApplicationRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getArtifactArtifactCrossReference_0_1_0());
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getApplicationAccess().getApplicationAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getApplicationRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorCrossReference_1_1_0());
					}
				)
			)
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_1_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_3_0());
					}
					lv_applications_5_0=ruleApplication
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getApplicationRule());
						}
						add(
							$current,
							"applications",
							lv_applications_5_0,
							"fr.mleduc.ColdLang.Application");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getCommaKeyword_1_4_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_4_1_0());
						}
						lv_applications_7_0=ruleApplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getApplicationRule());
							}
							add(
								$current,
								"applications",
								lv_applications_7_0,
								"fr.mleduc.ColdLang.Application");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightParenthesisKeyword_1_5());
			}
		)
	)
;

// Entry rule entryRuleArtifact
entryRuleArtifact returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArtifactRule()); }
	iv_ruleArtifact=ruleArtifact
	{ $current=$iv_ruleArtifact.current; }
	EOF;

// Rule Artifact
ruleArtifact returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='artifact'
		{
			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArtifactRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArtifactRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLanguageLanguageCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getConditionAccess().getEquivParserRuleCall());
	}
	this_Equiv_0=ruleEquiv
	{
		$current = $this_Equiv_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEquiv
entryRuleEquiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEquivRule()); }
	iv_ruleEquiv=ruleEquiv
	{ $current=$iv_ruleEquiv.current; }
	EOF;

// Rule Equiv
ruleEquiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEquivAccess().getImplyParserRuleCall_0());
		}
		this_Imply_0=ruleImply
		{
			$current = $this_Imply_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getEquivAccess().getEquivLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='<=>'
			{
				newLeafNode(otherlv_2, grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleImply
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEquivRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fr.mleduc.ColdLang.Imply");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleImply
entryRuleImply returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImplyRule()); }
	iv_ruleImply=ruleImply
	{ $current=$iv_ruleImply.current; }
	EOF;

// Rule Imply
ruleImply returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getImplyAccess().getOrParserRuleCall_0());
		}
		this_Or_0=ruleOr
		{
			$current = $this_Or_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getImplyAccess().getImplyLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='=>'
			{
				newLeafNode(otherlv_2, grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleOr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getImplyRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fr.mleduc.ColdLang.Or");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	iv_ruleOr=ruleOr
	{ $current=$iv_ruleOr.current; }
	EOF;

// Rule Or
ruleOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
		}
		this_And_0=ruleAnd
		{
			$current = $this_And_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='or'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fr.mleduc.ColdLang.And");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"fr.mleduc.ColdLang.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getConditionParserRuleCall_0_1());
			}
			this_Condition_1=ruleCondition
			{
				$current = $this_Condition_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
						$current);
				}
			)
			otherlv_4='!'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getNextPrimaryParserRuleCall_1_2_0());
					}
					lv_next_5_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"next",
							lv_next_5_0,
							"fr.mleduc.ColdLang.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getVariableAction_2_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRefFeatureModelCrossReference_2_1_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleIDS
entryRuleIDS returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIDSRule()); }
	iv_ruleIDS=ruleIDS
	{ $current=$iv_ruleIDS.current.getText(); }
	EOF;

// Rule IDS
ruleIDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getIDSAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getIDSAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getIDSAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
