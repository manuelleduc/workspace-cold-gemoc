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
import fr.mleduc.services.ExplicitOperationsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExplicitOperationsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'activate'", "'where'", "'FM'", "'?'", "'feature'", "'('", "')'", "'oneOf'", "'['", "']'", "'someOf'", "'<=>'", "'=>'", "'or'", "'and'", "'!'", "'operation'", "'inputs'", "'output'", "':'", "'..'", "'0'", "'1'", "'*'", "'language'", "'artifact'", "'composition'", "'::'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExplicitOperationsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExplicitOperationsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExplicitOperationsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExplicitOperations.g"; }



     	private ExplicitOperationsGrammarAccess grammarAccess;

        public InternalExplicitOperationsParser(TokenStream input, ExplicitOperationsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ExplicitOperationsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalExplicitOperations.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExplicitOperations.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExplicitOperations.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExplicitOperations.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_languages_2_0 = null;

        EObject lv_operations_3_0 = null;

        EObject lv_artifacts_4_0 = null;

        EObject lv_compositions_5_0 = null;

        EObject lv_featureModels_6_0 = null;

        EObject lv_activations_7_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )* ) )
            // InternalExplicitOperations.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )* )
            {
            // InternalExplicitOperations.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )* )
            // InternalExplicitOperations.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalExplicitOperations.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExplicitOperations.g:101:3: ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) | ( (lv_activations_7_0= ruleActivation ) ) )*
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    alt1=1;
                    }
                    break;
                case 28:
                    {
                    alt1=2;
                    }
                    break;
                case 37:
                    {
                    alt1=3;
                    }
                    break;
                case 38:
                    {
                    alt1=4;
                    }
                    break;
                case 14:
                    {
                    alt1=5;
                    }
                    break;
                case 12:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalExplicitOperations.g:102:4: ( (lv_languages_2_0= ruleLanguage ) )
            	    {
            	    // InternalExplicitOperations.g:102:4: ( (lv_languages_2_0= ruleLanguage ) )
            	    // InternalExplicitOperations.g:103:5: (lv_languages_2_0= ruleLanguage )
            	    {
            	    // InternalExplicitOperations.g:103:5: (lv_languages_2_0= ruleLanguage )
            	    // InternalExplicitOperations.g:104:6: lv_languages_2_0= ruleLanguage
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getLanguagesLanguageParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_languages_2_0=ruleLanguage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"languages",
            	    							lv_languages_2_0,
            	    							"fr.mleduc.ExplicitOperations.Language");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalExplicitOperations.g:122:4: ( (lv_operations_3_0= ruleOperation ) )
            	    {
            	    // InternalExplicitOperations.g:122:4: ( (lv_operations_3_0= ruleOperation ) )
            	    // InternalExplicitOperations.g:123:5: (lv_operations_3_0= ruleOperation )
            	    {
            	    // InternalExplicitOperations.g:123:5: (lv_operations_3_0= ruleOperation )
            	    // InternalExplicitOperations.g:124:6: lv_operations_3_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operations",
            	    							lv_operations_3_0,
            	    							"fr.mleduc.ExplicitOperations.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalExplicitOperations.g:142:4: ( (lv_artifacts_4_0= ruleArtifact ) )
            	    {
            	    // InternalExplicitOperations.g:142:4: ( (lv_artifacts_4_0= ruleArtifact ) )
            	    // InternalExplicitOperations.g:143:5: (lv_artifacts_4_0= ruleArtifact )
            	    {
            	    // InternalExplicitOperations.g:143:5: (lv_artifacts_4_0= ruleArtifact )
            	    // InternalExplicitOperations.g:144:6: lv_artifacts_4_0= ruleArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getArtifactsArtifactParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_artifacts_4_0=ruleArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"artifacts",
            	    							lv_artifacts_4_0,
            	    							"fr.mleduc.ExplicitOperations.Artifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalExplicitOperations.g:162:4: ( (lv_compositions_5_0= ruleComposition ) )
            	    {
            	    // InternalExplicitOperations.g:162:4: ( (lv_compositions_5_0= ruleComposition ) )
            	    // InternalExplicitOperations.g:163:5: (lv_compositions_5_0= ruleComposition )
            	    {
            	    // InternalExplicitOperations.g:163:5: (lv_compositions_5_0= ruleComposition )
            	    // InternalExplicitOperations.g:164:6: lv_compositions_5_0= ruleComposition
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getCompositionsCompositionParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_compositions_5_0=ruleComposition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"compositions",
            	    							lv_compositions_5_0,
            	    							"fr.mleduc.ExplicitOperations.Composition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalExplicitOperations.g:182:4: ( (lv_featureModels_6_0= ruleFeatureModel ) )
            	    {
            	    // InternalExplicitOperations.g:182:4: ( (lv_featureModels_6_0= ruleFeatureModel ) )
            	    // InternalExplicitOperations.g:183:5: (lv_featureModels_6_0= ruleFeatureModel )
            	    {
            	    // InternalExplicitOperations.g:183:5: (lv_featureModels_6_0= ruleFeatureModel )
            	    // InternalExplicitOperations.g:184:6: lv_featureModels_6_0= ruleFeatureModel
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFeatureModelsFeatureModelParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_featureModels_6_0=ruleFeatureModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"featureModels",
            	    							lv_featureModels_6_0,
            	    							"fr.mleduc.ExplicitOperations.FeatureModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalExplicitOperations.g:202:4: ( (lv_activations_7_0= ruleActivation ) )
            	    {
            	    // InternalExplicitOperations.g:202:4: ( (lv_activations_7_0= ruleActivation ) )
            	    // InternalExplicitOperations.g:203:5: (lv_activations_7_0= ruleActivation )
            	    {
            	    // InternalExplicitOperations.g:203:5: (lv_activations_7_0= ruleActivation )
            	    // InternalExplicitOperations.g:204:6: lv_activations_7_0= ruleActivation
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getActivationsActivationParserRuleCall_2_5_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_activations_7_0=ruleActivation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"activations",
            	    							lv_activations_7_0,
            	    							"fr.mleduc.ExplicitOperations.Activation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleActivation"
    // InternalExplicitOperations.g:226:1: entryRuleActivation returns [EObject current=null] : iv_ruleActivation= ruleActivation EOF ;
    public final EObject entryRuleActivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivation = null;


        try {
            // InternalExplicitOperations.g:226:51: (iv_ruleActivation= ruleActivation EOF )
            // InternalExplicitOperations.g:227:2: iv_ruleActivation= ruleActivation EOF
            {
             newCompositeNode(grammarAccess.getActivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivation=ruleActivation();

            state._fsp--;

             current =iv_ruleActivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivation"


    // $ANTLR start "ruleActivation"
    // InternalExplicitOperations.g:233:1: ruleActivation returns [EObject current=null] : (otherlv_0= 'activate' ( (otherlv_1= RULE_ID ) )* otherlv_2= 'where' ( (lv_constraints_3_0= ruleProposition ) ) ) ;
    public final EObject ruleActivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:239:2: ( (otherlv_0= 'activate' ( (otherlv_1= RULE_ID ) )* otherlv_2= 'where' ( (lv_constraints_3_0= ruleProposition ) ) ) )
            // InternalExplicitOperations.g:240:2: (otherlv_0= 'activate' ( (otherlv_1= RULE_ID ) )* otherlv_2= 'where' ( (lv_constraints_3_0= ruleProposition ) ) )
            {
            // InternalExplicitOperations.g:240:2: (otherlv_0= 'activate' ( (otherlv_1= RULE_ID ) )* otherlv_2= 'where' ( (lv_constraints_3_0= ruleProposition ) ) )
            // InternalExplicitOperations.g:241:3: otherlv_0= 'activate' ( (otherlv_1= RULE_ID ) )* otherlv_2= 'where' ( (lv_constraints_3_0= ruleProposition ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActivationAccess().getActivateKeyword_0());
            		
            // InternalExplicitOperations.g:245:3: ( (otherlv_1= RULE_ID ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExplicitOperations.g:246:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalExplicitOperations.g:246:4: (otherlv_1= RULE_ID )
            	    // InternalExplicitOperations.g:247:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActivationRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    					newLeafNode(otherlv_1, grammarAccess.getActivationAccess().getReferencesReferentiableCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getActivationAccess().getWhereKeyword_2());
            		
            // InternalExplicitOperations.g:262:3: ( (lv_constraints_3_0= ruleProposition ) )
            // InternalExplicitOperations.g:263:4: (lv_constraints_3_0= ruleProposition )
            {
            // InternalExplicitOperations.g:263:4: (lv_constraints_3_0= ruleProposition )
            // InternalExplicitOperations.g:264:5: lv_constraints_3_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getActivationAccess().getConstraintsPropositionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_3_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivationRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_3_0,
            						"fr.mleduc.ExplicitOperations.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivation"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalExplicitOperations.g:285:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalExplicitOperations.g:285:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalExplicitOperations.g:286:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
             newCompositeNode(grammarAccess.getFeatureModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;

             current =iv_ruleFeatureModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalExplicitOperations.g:292:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:298:2: ( (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) ) )
            // InternalExplicitOperations.g:299:2: (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) )
            {
            // InternalExplicitOperations.g:299:2: (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) )
            // InternalExplicitOperations.g:300:3: otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getFMKeyword_0());
            		
            // InternalExplicitOperations.g:304:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:305:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:305:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:306:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExplicitOperations.g:322:3: ( (lv_feature_2_0= ruleFeature ) )
            // InternalExplicitOperations.g:323:4: (lv_feature_2_0= ruleFeature )
            {
            // InternalExplicitOperations.g:323:4: (lv_feature_2_0= ruleFeature )
            // InternalExplicitOperations.g:324:5: lv_feature_2_0= ruleFeature
            {

            					newCompositeNode(grammarAccess.getFeatureModelAccess().getFeatureFeatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_feature_2_0=ruleFeature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            					}
            					set(
            						current,
            						"feature",
            						lv_feature_2_0,
            						"fr.mleduc.ExplicitOperations.Feature");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleFeature"
    // InternalExplicitOperations.g:345:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalExplicitOperations.g:345:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalExplicitOperations.g:346:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalExplicitOperations.g:352:1: ruleFeature returns [EObject current=null] : (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicFeature_0 = null;

        EObject this_OneOf_1 = null;

        EObject this_SomeOf_2 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:358:2: ( (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf ) )
            // InternalExplicitOperations.g:359:2: (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf )
            {
            // InternalExplicitOperations.g:359:2: (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExplicitOperations.g:360:3: this_AtomicFeature_0= ruleAtomicFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getAtomicFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicFeature_0=ruleAtomicFeature();

                    state._fsp--;


                    			current = this_AtomicFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExplicitOperations.g:369:3: this_OneOf_1= ruleOneOf
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getOneOfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneOf_1=ruleOneOf();

                    state._fsp--;


                    			current = this_OneOf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExplicitOperations.g:378:3: this_SomeOf_2= ruleSomeOf
                    {

                    			newCompositeNode(grammarAccess.getFeatureAccess().getSomeOfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SomeOf_2=ruleSomeOf();

                    state._fsp--;


                    			current = this_SomeOf_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAtomicFeature"
    // InternalExplicitOperations.g:390:1: entryRuleAtomicFeature returns [EObject current=null] : iv_ruleAtomicFeature= ruleAtomicFeature EOF ;
    public final EObject entryRuleAtomicFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFeature = null;


        try {
            // InternalExplicitOperations.g:390:54: (iv_ruleAtomicFeature= ruleAtomicFeature EOF )
            // InternalExplicitOperations.g:391:2: iv_ruleAtomicFeature= ruleAtomicFeature EOF
            {
             newCompositeNode(grammarAccess.getAtomicFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicFeature=ruleAtomicFeature();

            state._fsp--;

             current =iv_ruleAtomicFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicFeature"


    // $ANTLR start "ruleAtomicFeature"
    // InternalExplicitOperations.g:397:1: ruleAtomicFeature returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleAtomicFeature() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_constraints_5_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:403:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? ) )
            // InternalExplicitOperations.g:404:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? )
            {
            // InternalExplicitOperations.g:404:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? )
            // InternalExplicitOperations.g:405:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )?
            {
            // InternalExplicitOperations.g:405:3: ()
            // InternalExplicitOperations.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicFeatureAccess().getAtomicFeatureAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:412:3: ( (lv_optional_1_0= '?' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExplicitOperations.g:413:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:413:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:414:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getAtomicFeatureAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicFeatureAccess().getFeatureKeyword_2());
            		
            // InternalExplicitOperations.g:430:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:431:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:431:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:432:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAtomicFeatureAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomicFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExplicitOperations.g:448:3: (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExplicitOperations.g:449:4: otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicFeatureAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalExplicitOperations.g:453:4: ( (lv_constraints_5_0= ruleProposition ) )
                    // InternalExplicitOperations.g:454:5: (lv_constraints_5_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:454:5: (lv_constraints_5_0= ruleProposition )
                    // InternalExplicitOperations.g:455:6: lv_constraints_5_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getAtomicFeatureAccess().getConstraintsPropositionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraints_5_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicFeatureRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_5_0,
                    							"fr.mleduc.ExplicitOperations.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtomicFeatureAccess().getRightParenthesisKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicFeature"


    // $ANTLR start "entryRuleOneOf"
    // InternalExplicitOperations.g:481:1: entryRuleOneOf returns [EObject current=null] : iv_ruleOneOf= ruleOneOf EOF ;
    public final EObject entryRuleOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOf = null;


        try {
            // InternalExplicitOperations.g:481:46: (iv_ruleOneOf= ruleOneOf EOF )
            // InternalExplicitOperations.g:482:2: iv_ruleOneOf= ruleOneOf EOF
            {
             newCompositeNode(grammarAccess.getOneOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOneOf=ruleOneOf();

            state._fsp--;

             current =iv_ruleOneOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneOf"


    // $ANTLR start "ruleOneOf"
    // InternalExplicitOperations.g:488:1: ruleOneOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleOneOf() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_children_5_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:494:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) )
            // InternalExplicitOperations.g:495:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            {
            // InternalExplicitOperations.g:495:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            // InternalExplicitOperations.g:496:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            {
            // InternalExplicitOperations.g:496:3: ()
            // InternalExplicitOperations.g:497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOneOfAccess().getOneOfAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:503:3: ( (lv_optional_1_0= '?' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExplicitOperations.g:504:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:504:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:505:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_11); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOneOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOneOfAccess().getOneOfKeyword_2());
            		
            // InternalExplicitOperations.g:521:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:522:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:522:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:523:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_3_0, grammarAccess.getOneOfAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOneOfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalExplicitOperations.g:543:3: ( (lv_children_5_0= ruleFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=16)||LA7_0==19||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExplicitOperations.g:544:4: (lv_children_5_0= ruleFeature )
            	    {
            	    // InternalExplicitOperations.g:544:4: (lv_children_5_0= ruleFeature )
            	    // InternalExplicitOperations.g:545:5: lv_children_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getOneOfAccess().getChildrenFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_children_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOneOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_5_0,
            	    						"fr.mleduc.ExplicitOperations.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalExplicitOperations.g:566:3: (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExplicitOperations.g:567:4: otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getOneOfAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalExplicitOperations.g:571:4: ( (lv_constraints_8_0= ruleProposition ) )
                    // InternalExplicitOperations.g:572:5: (lv_constraints_8_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:572:5: (lv_constraints_8_0= ruleProposition )
                    // InternalExplicitOperations.g:573:6: lv_constraints_8_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getOneOfAccess().getConstraintsPropositionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraints_8_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOneOfRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_8_0,
                    							"fr.mleduc.ExplicitOperations.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getOneOfAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneOf"


    // $ANTLR start "entryRuleSomeOf"
    // InternalExplicitOperations.g:599:1: entryRuleSomeOf returns [EObject current=null] : iv_ruleSomeOf= ruleSomeOf EOF ;
    public final EObject entryRuleSomeOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeOf = null;


        try {
            // InternalExplicitOperations.g:599:47: (iv_ruleSomeOf= ruleSomeOf EOF )
            // InternalExplicitOperations.g:600:2: iv_ruleSomeOf= ruleSomeOf EOF
            {
             newCompositeNode(grammarAccess.getSomeOfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSomeOf=ruleSomeOf();

            state._fsp--;

             current =iv_ruleSomeOf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSomeOf"


    // $ANTLR start "ruleSomeOf"
    // InternalExplicitOperations.g:606:1: ruleSomeOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleSomeOf() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_children_5_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:612:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) )
            // InternalExplicitOperations.g:613:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            {
            // InternalExplicitOperations.g:613:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            // InternalExplicitOperations.g:614:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            {
            // InternalExplicitOperations.g:614:3: ()
            // InternalExplicitOperations.g:615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeOfAccess().getSomeOfAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:621:3: ( (lv_optional_1_0= '?' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalExplicitOperations.g:622:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:622:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:623:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_14); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSomeOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeOfAccess().getSomeOfKeyword_2());
            		
            // InternalExplicitOperations.g:639:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:640:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:640:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:641:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSomeOfAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSomeOfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalExplicitOperations.g:661:3: ( (lv_children_5_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=16)||LA10_0==19||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExplicitOperations.g:662:4: (lv_children_5_0= ruleFeature )
            	    {
            	    // InternalExplicitOperations.g:662:4: (lv_children_5_0= ruleFeature )
            	    // InternalExplicitOperations.g:663:5: lv_children_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSomeOfAccess().getChildrenFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_children_5_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSomeOfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"children",
            	    						lv_children_5_0,
            	    						"fr.mleduc.ExplicitOperations.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalExplicitOperations.g:684:3: (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExplicitOperations.g:685:4: otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getSomeOfAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalExplicitOperations.g:689:4: ( (lv_constraints_8_0= ruleProposition ) )
                    // InternalExplicitOperations.g:690:5: (lv_constraints_8_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:690:5: (lv_constraints_8_0= ruleProposition )
                    // InternalExplicitOperations.g:691:6: lv_constraints_8_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getSomeOfAccess().getConstraintsPropositionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_constraints_8_0=ruleProposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSomeOfRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_8_0,
                    							"fr.mleduc.ExplicitOperations.Proposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSomeOfAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSomeOf"


    // $ANTLR start "entryRuleProposition"
    // InternalExplicitOperations.g:717:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalExplicitOperations.g:717:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalExplicitOperations.g:718:2: iv_ruleProposition= ruleProposition EOF
            {
             newCompositeNode(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProposition=ruleProposition();

            state._fsp--;

             current =iv_ruleProposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProposition"


    // $ANTLR start "ruleProposition"
    // InternalExplicitOperations.g:724:1: ruleProposition returns [EObject current=null] : this_Equiv_0= ruleEquiv ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject this_Equiv_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:730:2: (this_Equiv_0= ruleEquiv )
            // InternalExplicitOperations.g:731:2: this_Equiv_0= ruleEquiv
            {

            		newCompositeNode(grammarAccess.getPropositionAccess().getEquivParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Equiv_0=ruleEquiv();

            state._fsp--;


            		current = this_Equiv_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProposition"


    // $ANTLR start "entryRuleEquiv"
    // InternalExplicitOperations.g:742:1: entryRuleEquiv returns [EObject current=null] : iv_ruleEquiv= ruleEquiv EOF ;
    public final EObject entryRuleEquiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquiv = null;


        try {
            // InternalExplicitOperations.g:742:46: (iv_ruleEquiv= ruleEquiv EOF )
            // InternalExplicitOperations.g:743:2: iv_ruleEquiv= ruleEquiv EOF
            {
             newCompositeNode(grammarAccess.getEquivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquiv=ruleEquiv();

            state._fsp--;

             current =iv_ruleEquiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquiv"


    // $ANTLR start "ruleEquiv"
    // InternalExplicitOperations.g:749:1: ruleEquiv returns [EObject current=null] : (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) ;
    public final EObject ruleEquiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Imply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:755:2: ( (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) )
            // InternalExplicitOperations.g:756:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            {
            // InternalExplicitOperations.g:756:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            // InternalExplicitOperations.g:757:3: this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquivAccess().getImplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Imply_0=ruleImply();

            state._fsp--;


            			current = this_Imply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:765:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExplicitOperations.g:766:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) )
            	    {
            	    // InternalExplicitOperations.g:766:4: ()
            	    // InternalExplicitOperations.g:767:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquivAccess().getEquivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:777:4: ( (lv_right_3_0= ruleImply ) )
            	    // InternalExplicitOperations.g:778:5: (lv_right_3_0= ruleImply )
            	    {
            	    // InternalExplicitOperations.g:778:5: (lv_right_3_0= ruleImply )
            	    // InternalExplicitOperations.g:779:6: lv_right_3_0= ruleImply
            	    {

            	    						newCompositeNode(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleImply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ExplicitOperations.Imply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquiv"


    // $ANTLR start "entryRuleImply"
    // InternalExplicitOperations.g:801:1: entryRuleImply returns [EObject current=null] : iv_ruleImply= ruleImply EOF ;
    public final EObject entryRuleImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImply = null;


        try {
            // InternalExplicitOperations.g:801:46: (iv_ruleImply= ruleImply EOF )
            // InternalExplicitOperations.g:802:2: iv_ruleImply= ruleImply EOF
            {
             newCompositeNode(grammarAccess.getImplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImply=ruleImply();

            state._fsp--;

             current =iv_ruleImply; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImply"


    // $ANTLR start "ruleImply"
    // InternalExplicitOperations.g:808:1: ruleImply returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:814:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalExplicitOperations.g:815:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalExplicitOperations.g:815:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalExplicitOperations.g:816:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplyAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:824:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExplicitOperations.g:825:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalExplicitOperations.g:825:4: ()
            	    // InternalExplicitOperations.g:826:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplyAccess().getImplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:836:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalExplicitOperations.g:837:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalExplicitOperations.g:837:5: (lv_right_3_0= ruleOr )
            	    // InternalExplicitOperations.g:838:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ExplicitOperations.Or");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImply"


    // $ANTLR start "entryRuleOr"
    // InternalExplicitOperations.g:860:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalExplicitOperations.g:860:43: (iv_ruleOr= ruleOr EOF )
            // InternalExplicitOperations.g:861:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalExplicitOperations.g:867:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:873:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalExplicitOperations.g:874:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalExplicitOperations.g:874:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalExplicitOperations.g:875:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:883:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExplicitOperations.g:884:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalExplicitOperations.g:884:4: ()
            	    // InternalExplicitOperations.g:885:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:895:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalExplicitOperations.g:896:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalExplicitOperations.g:896:5: (lv_right_3_0= ruleAnd )
            	    // InternalExplicitOperations.g:897:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ExplicitOperations.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalExplicitOperations.g:919:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalExplicitOperations.g:919:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalExplicitOperations.g:920:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalExplicitOperations.g:926:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:932:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalExplicitOperations.g:933:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalExplicitOperations.g:933:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalExplicitOperations.g:934:3: this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:942:3: ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExplicitOperations.g:943:4: () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalExplicitOperations.g:943:4: ()
            	    // InternalExplicitOperations.g:944:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:954:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalExplicitOperations.g:955:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalExplicitOperations.g:955:5: (lv_right_3_0= rulePrimary )
            	    // InternalExplicitOperations.g:956:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ExplicitOperations.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // InternalExplicitOperations.g:978:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalExplicitOperations.g:978:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalExplicitOperations.g:979:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalExplicitOperations.g:985:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Proposition_1 = null;

        EObject lv_next_5_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:991:2: ( ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalExplicitOperations.g:992:2: ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalExplicitOperations.g:992:2: ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalExplicitOperations.g:993:3: (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' )
                    {
                    // InternalExplicitOperations.g:993:3: (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' )
                    // InternalExplicitOperations.g:994:4: otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getPropositionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Proposition_1=ruleProposition();

                    state._fsp--;


                    				current = this_Proposition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExplicitOperations.g:1012:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    {
                    // InternalExplicitOperations.g:1012:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    // InternalExplicitOperations.g:1013:4: () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) )
                    {
                    // InternalExplicitOperations.g:1013:4: ()
                    // InternalExplicitOperations.g:1014:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalExplicitOperations.g:1024:4: ( (lv_next_5_0= rulePrimary ) )
                    // InternalExplicitOperations.g:1025:5: (lv_next_5_0= rulePrimary )
                    {
                    // InternalExplicitOperations.g:1025:5: (lv_next_5_0= rulePrimary )
                    // InternalExplicitOperations.g:1026:6: lv_next_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getNextPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_5_0,
                    							"fr.mleduc.ExplicitOperations.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalExplicitOperations.g:1045:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalExplicitOperations.g:1045:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalExplicitOperations.g:1046:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalExplicitOperations.g:1046:4: ()
                    // InternalExplicitOperations.g:1047:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVariableAction_2_0(),
                    						current);
                    				

                    }

                    // InternalExplicitOperations.g:1053:4: ( (otherlv_7= RULE_ID ) )
                    // InternalExplicitOperations.g:1054:5: (otherlv_7= RULE_ID )
                    {
                    // InternalExplicitOperations.g:1054:5: (otherlv_7= RULE_ID )
                    // InternalExplicitOperations.g:1055:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRefFeatureCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleOperation"
    // InternalExplicitOperations.g:1071:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalExplicitOperations.g:1071:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalExplicitOperations.g:1072:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalExplicitOperations.g:1078:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_output_5_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1084:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) ) )
            // InternalExplicitOperations.g:1085:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) )
            {
            // InternalExplicitOperations.g:1085:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) )
            // InternalExplicitOperations.g:1086:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalExplicitOperations.g:1090:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1091:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1091:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1092:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getInputsKeyword_2());
            		
            // InternalExplicitOperations.g:1112:3: ( (lv_inputs_3_0= ruleOperationParameter ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalExplicitOperations.g:1113:4: (lv_inputs_3_0= ruleOperationParameter )
            	    {
            	    // InternalExplicitOperations.g:1113:4: (lv_inputs_3_0= ruleOperationParameter )
            	    // InternalExplicitOperations.g:1114:5: lv_inputs_3_0= ruleOperationParameter
            	    {

            	    					newCompositeNode(grammarAccess.getOperationAccess().getInputsOperationParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_inputs_3_0=ruleOperationParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOperationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_3_0,
            	    						"fr.mleduc.ExplicitOperations.OperationParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getOutputKeyword_4());
            		
            // InternalExplicitOperations.g:1135:3: ( (lv_output_5_0= ruleOperationParameter ) )
            // InternalExplicitOperations.g:1136:4: (lv_output_5_0= ruleOperationParameter )
            {
            // InternalExplicitOperations.g:1136:4: (lv_output_5_0= ruleOperationParameter )
            // InternalExplicitOperations.g:1137:5: lv_output_5_0= ruleOperationParameter
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getOutputOperationParameterParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_output_5_0=ruleOperationParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_5_0,
            						"fr.mleduc.ExplicitOperations.OperationParameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationParameter"
    // InternalExplicitOperations.g:1158:1: entryRuleOperationParameter returns [EObject current=null] : iv_ruleOperationParameter= ruleOperationParameter EOF ;
    public final EObject entryRuleOperationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameter = null;


        try {
            // InternalExplicitOperations.g:1158:59: (iv_ruleOperationParameter= ruleOperationParameter EOF )
            // InternalExplicitOperations.g:1159:2: iv_ruleOperationParameter= ruleOperationParameter EOF
            {
             newCompositeNode(grammarAccess.getOperationParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationParameter=ruleOperationParameter();

            state._fsp--;

             current =iv_ruleOperationParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationParameter"


    // $ANTLR start "ruleOperationParameter"
    // InternalExplicitOperations.g:1165:1: ruleOperationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) ) ;
    public final EObject ruleOperationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1171:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) ) )
            // InternalExplicitOperations.g:1172:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) )
            {
            // InternalExplicitOperations.g:1172:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) )
            // InternalExplicitOperations.g:1173:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )
            {
            // InternalExplicitOperations.g:1173:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExplicitOperations.g:1174:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1174:4: (lv_name_0_0= RULE_ID )
            // InternalExplicitOperations.g:1175:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperationParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationParameterAccess().getColonKeyword_1());
            		
            // InternalExplicitOperations.g:1195:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1196:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1196:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1197:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getOperationParameterAccess().getTypeLanguageCrossReference_2_0());
            				

            }


            }

            // InternalExplicitOperations.g:1208:3: ( (lv_cardinality_3_0= ruleCardinality ) )
            // InternalExplicitOperations.g:1209:4: (lv_cardinality_3_0= ruleCardinality )
            {
            // InternalExplicitOperations.g:1209:4: (lv_cardinality_3_0= ruleCardinality )
            // InternalExplicitOperations.g:1210:5: lv_cardinality_3_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getOperationParameterAccess().getCardinalityCardinalityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_cardinality_3_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationParameterRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_3_0,
            						"fr.mleduc.ExplicitOperations.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationParameter"


    // $ANTLR start "entryRuleCardinality"
    // InternalExplicitOperations.g:1231:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalExplicitOperations.g:1231:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalExplicitOperations.g:1232:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalExplicitOperations.g:1238:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_start_1_0 = null;

        EObject lv_stop_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1244:2: ( (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' ) )
            // InternalExplicitOperations.g:1245:2: (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' )
            {
            // InternalExplicitOperations.g:1245:2: (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' )
            // InternalExplicitOperations.g:1246:3: otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalExplicitOperations.g:1250:3: ( (lv_start_1_0= ruleCardVal ) )
            // InternalExplicitOperations.g:1251:4: (lv_start_1_0= ruleCardVal )
            {
            // InternalExplicitOperations.g:1251:4: (lv_start_1_0= ruleCardVal )
            // InternalExplicitOperations.g:1252:5: lv_start_1_0= ruleCardVal
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getStartCardValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_start_1_0=ruleCardVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_1_0,
            						"fr.mleduc.ExplicitOperations.CardVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalExplicitOperations.g:1273:3: ( (lv_stop_3_0= ruleCardVal ) )
            // InternalExplicitOperations.g:1274:4: (lv_stop_3_0= ruleCardVal )
            {
            // InternalExplicitOperations.g:1274:4: (lv_stop_3_0= ruleCardVal )
            // InternalExplicitOperations.g:1275:5: lv_stop_3_0= ruleCardVal
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getStopCardValParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_stop_3_0=ruleCardVal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinalityRule());
            					}
            					set(
            						current,
            						"stop",
            						lv_stop_3_0,
            						"fr.mleduc.ExplicitOperations.CardVal");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCardVal"
    // InternalExplicitOperations.g:1300:1: entryRuleCardVal returns [EObject current=null] : iv_ruleCardVal= ruleCardVal EOF ;
    public final EObject entryRuleCardVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardVal = null;


        try {
            // InternalExplicitOperations.g:1300:48: (iv_ruleCardVal= ruleCardVal EOF )
            // InternalExplicitOperations.g:1301:2: iv_ruleCardVal= ruleCardVal EOF
            {
             newCompositeNode(grammarAccess.getCardValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardVal=ruleCardVal();

            state._fsp--;

             current =iv_ruleCardVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardVal"


    // $ANTLR start "ruleCardVal"
    // InternalExplicitOperations.g:1307:1: ruleCardVal returns [EObject current=null] : ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) ;
    public final EObject ruleCardVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1313:2: ( ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) )
            // InternalExplicitOperations.g:1314:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            {
            // InternalExplicitOperations.g:1314:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalExplicitOperations.g:1315:3: ( () otherlv_1= '0' )
                    {
                    // InternalExplicitOperations.g:1315:3: ( () otherlv_1= '0' )
                    // InternalExplicitOperations.g:1316:4: () otherlv_1= '0'
                    {
                    // InternalExplicitOperations.g:1316:4: ()
                    // InternalExplicitOperations.g:1317:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardVal0Action_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardValAccess().getDigitZeroKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExplicitOperations.g:1329:3: ( () otherlv_3= '1' )
                    {
                    // InternalExplicitOperations.g:1329:3: ( () otherlv_3= '1' )
                    // InternalExplicitOperations.g:1330:4: () otherlv_3= '1'
                    {
                    // InternalExplicitOperations.g:1330:4: ()
                    // InternalExplicitOperations.g:1331:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardVal1Action_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCardValAccess().getDigitOneKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExplicitOperations.g:1343:3: ( () otherlv_5= '*' )
                    {
                    // InternalExplicitOperations.g:1343:3: ( () otherlv_5= '*' )
                    // InternalExplicitOperations.g:1344:4: () otherlv_5= '*'
                    {
                    // InternalExplicitOperations.g:1344:4: ()
                    // InternalExplicitOperations.g:1345:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardValNAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCardValAccess().getAsteriskKeyword_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardVal"


    // $ANTLR start "entryRuleLanguage"
    // InternalExplicitOperations.g:1360:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalExplicitOperations.g:1360:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalExplicitOperations.g:1361:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalExplicitOperations.g:1367:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1373:2: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* ) )
            // InternalExplicitOperations.g:1374:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* )
            {
            // InternalExplicitOperations.g:1374:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* )
            // InternalExplicitOperations.g:1375:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
            		
            // InternalExplicitOperations.g:1379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1380:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExplicitOperations.g:1397:3: ( (lv_dependencies_2_0= ruleLanguageDependency ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalExplicitOperations.g:1398:4: (lv_dependencies_2_0= ruleLanguageDependency )
            	    {
            	    // InternalExplicitOperations.g:1398:4: (lv_dependencies_2_0= ruleLanguageDependency )
            	    // InternalExplicitOperations.g:1399:5: lv_dependencies_2_0= ruleLanguageDependency
            	    {

            	    					newCompositeNode(grammarAccess.getLanguageAccess().getDependenciesLanguageDependencyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_dependencies_2_0=ruleLanguageDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"fr.mleduc.ExplicitOperations.LanguageDependency");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLanguageDependency"
    // InternalExplicitOperations.g:1420:1: entryRuleLanguageDependency returns [EObject current=null] : iv_ruleLanguageDependency= ruleLanguageDependency EOF ;
    public final EObject entryRuleLanguageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageDependency = null;


        try {
            // InternalExplicitOperations.g:1420:59: (iv_ruleLanguageDependency= ruleLanguageDependency EOF )
            // InternalExplicitOperations.g:1421:2: iv_ruleLanguageDependency= ruleLanguageDependency EOF
            {
             newCompositeNode(grammarAccess.getLanguageDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageDependency=ruleLanguageDependency();

            state._fsp--;

             current =iv_ruleLanguageDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageDependency"


    // $ANTLR start "ruleLanguageDependency"
    // InternalExplicitOperations.g:1427:1: ruleLanguageDependency returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLanguageDependency() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1433:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1434:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1435:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1435:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExplicitOperations.g:1436:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1436:4: (lv_name_0_0= RULE_ID )
            // InternalExplicitOperations.g:1437:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLanguageDependencyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageDependencyAccess().getColonKeyword_1());
            		
            // InternalExplicitOperations.g:1457:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1458:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1458:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1459:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageDependencyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLanguageDependencyAccess().getTypeLanguageCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageDependency"


    // $ANTLR start "entryRuleArtifact"
    // InternalExplicitOperations.g:1474:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalExplicitOperations.g:1474:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalExplicitOperations.g:1475:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalExplicitOperations.g:1481:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1487:2: ( (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? ) )
            // InternalExplicitOperations.g:1488:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? )
            {
            // InternalExplicitOperations.g:1488:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? )
            // InternalExplicitOperations.g:1489:3: otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            // InternalExplicitOperations.g:1493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1494:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1495:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            // InternalExplicitOperations.g:1515:3: ( (otherlv_3= RULE_ID ) )
            // InternalExplicitOperations.g:1516:4: (otherlv_3= RULE_ID )
            {
            // InternalExplicitOperations.g:1516:4: (otherlv_3= RULE_ID )
            // InternalExplicitOperations.g:1517:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getTypeLanguageCrossReference_3_0());
            				

            }


            }

            // InternalExplicitOperations.g:1528:3: (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalExplicitOperations.g:1529:4: otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalExplicitOperations.g:1533:4: ( (lv_parameters_5_0= ruleArtifactParameter ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalExplicitOperations.g:1534:5: (lv_parameters_5_0= ruleArtifactParameter )
                    	    {
                    	    // InternalExplicitOperations.g:1534:5: (lv_parameters_5_0= ruleArtifactParameter )
                    	    // InternalExplicitOperations.g:1535:6: lv_parameters_5_0= ruleArtifactParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getArtifactAccess().getParametersArtifactParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_parameters_5_0=ruleArtifactParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_5_0,
                    	    							"fr.mleduc.ExplicitOperations.ArtifactParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleArtifactParameter"
    // InternalExplicitOperations.g:1561:1: entryRuleArtifactParameter returns [EObject current=null] : iv_ruleArtifactParameter= ruleArtifactParameter EOF ;
    public final EObject entryRuleArtifactParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactParameter = null;


        try {
            // InternalExplicitOperations.g:1561:58: (iv_ruleArtifactParameter= ruleArtifactParameter EOF )
            // InternalExplicitOperations.g:1562:2: iv_ruleArtifactParameter= ruleArtifactParameter EOF
            {
             newCompositeNode(grammarAccess.getArtifactParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifactParameter=ruleArtifactParameter();

            state._fsp--;

             current =iv_ruleArtifactParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifactParameter"


    // $ANTLR start "ruleArtifactParameter"
    // InternalExplicitOperations.g:1568:1: ruleArtifactParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleArtifactParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1574:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1575:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1575:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1576:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1576:3: ( (otherlv_0= RULE_ID ) )
            // InternalExplicitOperations.g:1577:4: (otherlv_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1577:4: (otherlv_0= RULE_ID )
            // InternalExplicitOperations.g:1578:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getArtifactParameterAccess().getNameLanguageDependencyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactParameterAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalExplicitOperations.g:1593:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1594:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1594:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1595:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getArtifactParameterAccess().getArtifactReferentiableCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifactParameter"


    // $ANTLR start "entryRuleComposition"
    // InternalExplicitOperations.g:1610:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalExplicitOperations.g:1610:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalExplicitOperations.g:1611:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalExplicitOperations.g:1617:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_parameters_5_0= ruleCompositionParameter ) )* otherlv_6= ']' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1623:2: ( (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_parameters_5_0= ruleCompositionParameter ) )* otherlv_6= ']' ) )
            // InternalExplicitOperations.g:1624:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_parameters_5_0= ruleCompositionParameter ) )* otherlv_6= ']' )
            {
            // InternalExplicitOperations.g:1624:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_parameters_5_0= ruleCompositionParameter ) )* otherlv_6= ']' )
            // InternalExplicitOperations.g:1625:3: otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= '[' ( (lv_parameters_5_0= ruleCompositionParameter ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalExplicitOperations.g:1629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1630:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getColonColonKeyword_2());
            		
            // InternalExplicitOperations.g:1651:3: ( (otherlv_3= RULE_ID ) )
            // InternalExplicitOperations.g:1652:4: (otherlv_3= RULE_ID )
            {
            // InternalExplicitOperations.g:1652:4: (otherlv_3= RULE_ID )
            // InternalExplicitOperations.g:1653:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getOperationOperationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalExplicitOperations.g:1668:3: ( (lv_parameters_5_0= ruleCompositionParameter ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalExplicitOperations.g:1669:4: (lv_parameters_5_0= ruleCompositionParameter )
            	    {
            	    // InternalExplicitOperations.g:1669:4: (lv_parameters_5_0= ruleCompositionParameter )
            	    // InternalExplicitOperations.g:1670:5: lv_parameters_5_0= ruleCompositionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCompositionAccess().getParametersCompositionParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_parameters_5_0=ruleCompositionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"fr.mleduc.ExplicitOperations.CompositionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleCompositionParameter"
    // InternalExplicitOperations.g:1695:1: entryRuleCompositionParameter returns [EObject current=null] : iv_ruleCompositionParameter= ruleCompositionParameter EOF ;
    public final EObject entryRuleCompositionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionParameter = null;


        try {
            // InternalExplicitOperations.g:1695:61: (iv_ruleCompositionParameter= ruleCompositionParameter EOF )
            // InternalExplicitOperations.g:1696:2: iv_ruleCompositionParameter= ruleCompositionParameter EOF
            {
             newCompositeNode(grammarAccess.getCompositionParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositionParameter=ruleCompositionParameter();

            state._fsp--;

             current =iv_ruleCompositionParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositionParameter"


    // $ANTLR start "ruleCompositionParameter"
    // InternalExplicitOperations.g:1702:1: ruleCompositionParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleCompositionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1708:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1709:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1709:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1710:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1710:3: ( (otherlv_0= RULE_ID ) )
            // InternalExplicitOperations.g:1711:4: (otherlv_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1711:4: (otherlv_0= RULE_ID )
            // InternalExplicitOperations.g:1712:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getCompositionParameterAccess().getNameOperationParameterCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionParameterAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalExplicitOperations.g:1727:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1728:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1728:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1729:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getCompositionParameterAccess().getArtifactReferentiableCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositionParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000007010005002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008020010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000498000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000698000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});

}