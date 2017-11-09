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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'FM'", "'?'", "'feature'", "'('", "')'", "'oneOf'", "'['", "']'", "'someOf'", "'<=>'", "'=>'", "'or'", "'and'", "'!'", "'operation'", "'inputs'", "'output'", "':'", "'..'", "'0'", "'1'", "'*'", "'language'", "'artifact'", "'composition'", "'::'", "'activation'", "'='"
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
    // InternalExplicitOperations.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_languages_2_0 = null;

        EObject lv_operations_3_0 = null;

        EObject lv_artifacts_4_0 = null;

        EObject lv_compositions_5_0 = null;

        EObject lv_featureModels_6_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )* ) )
            // InternalExplicitOperations.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )* )
            {
            // InternalExplicitOperations.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )* )
            // InternalExplicitOperations.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )*
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

            // InternalExplicitOperations.g:101:3: ( ( (lv_languages_2_0= ruleLanguage ) ) | ( (lv_operations_3_0= ruleOperation ) ) | ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_compositions_5_0= ruleComposition ) ) | ( (lv_featureModels_6_0= ruleFeatureModel ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 35:
                    {
                    alt1=3;
                    }
                    break;
                case 36:
                    {
                    alt1=4;
                    }
                    break;
                case 12:
                    {
                    alt1=5;
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


    // $ANTLR start "entryRuleFeatureModel"
    // InternalExplicitOperations.g:206:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalExplicitOperations.g:206:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalExplicitOperations.g:207:2: iv_ruleFeatureModel= ruleFeatureModel EOF
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
    // InternalExplicitOperations.g:213:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:219:2: ( (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) ) )
            // InternalExplicitOperations.g:220:2: (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) )
            {
            // InternalExplicitOperations.g:220:2: (otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) ) )
            // InternalExplicitOperations.g:221:3: otherlv_0= 'FM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_feature_2_0= ruleFeature ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getFMKeyword_0());
            		
            // InternalExplicitOperations.g:225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:226:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            // InternalExplicitOperations.g:243:3: ( (lv_feature_2_0= ruleFeature ) )
            // InternalExplicitOperations.g:244:4: (lv_feature_2_0= ruleFeature )
            {
            // InternalExplicitOperations.g:244:4: (lv_feature_2_0= ruleFeature )
            // InternalExplicitOperations.g:245:5: lv_feature_2_0= ruleFeature
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
    // InternalExplicitOperations.g:266:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalExplicitOperations.g:266:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalExplicitOperations.g:267:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalExplicitOperations.g:273:1: ruleFeature returns [EObject current=null] : (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicFeature_0 = null;

        EObject this_OneOf_1 = null;

        EObject this_SomeOf_2 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:279:2: ( (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf ) )
            // InternalExplicitOperations.g:280:2: (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf )
            {
            // InternalExplicitOperations.g:280:2: (this_AtomicFeature_0= ruleAtomicFeature | this_OneOf_1= ruleOneOf | this_SomeOf_2= ruleSomeOf )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt2=2;
                    }
                    break;
                case 14:
                    {
                    alt2=1;
                    }
                    break;
                case 20:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExplicitOperations.g:281:3: this_AtomicFeature_0= ruleAtomicFeature
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
                    // InternalExplicitOperations.g:290:3: this_OneOf_1= ruleOneOf
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
                    // InternalExplicitOperations.g:299:3: this_SomeOf_2= ruleSomeOf
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
    // InternalExplicitOperations.g:311:1: entryRuleAtomicFeature returns [EObject current=null] : iv_ruleAtomicFeature= ruleAtomicFeature EOF ;
    public final EObject entryRuleAtomicFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicFeature = null;


        try {
            // InternalExplicitOperations.g:311:54: (iv_ruleAtomicFeature= ruleAtomicFeature EOF )
            // InternalExplicitOperations.g:312:2: iv_ruleAtomicFeature= ruleAtomicFeature EOF
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
    // InternalExplicitOperations.g:318:1: ruleAtomicFeature returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? ) ;
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
            // InternalExplicitOperations.g:324:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? ) )
            // InternalExplicitOperations.g:325:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? )
            {
            // InternalExplicitOperations.g:325:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )? )
            // InternalExplicitOperations.g:326:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )?
            {
            // InternalExplicitOperations.g:326:3: ()
            // InternalExplicitOperations.g:327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicFeatureAccess().getAtomicFeatureAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:333:3: ( (lv_optional_1_0= '?' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalExplicitOperations.g:334:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:334:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:335:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getAtomicFeatureAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomicFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicFeatureAccess().getFeatureKeyword_2());
            		
            // InternalExplicitOperations.g:351:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:352:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:352:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:353:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalExplicitOperations.g:369:3: (otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExplicitOperations.g:370:4: otherlv_4= '(' ( (lv_constraints_5_0= ruleProposition ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicFeatureAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalExplicitOperations.g:374:4: ( (lv_constraints_5_0= ruleProposition ) )
                    // InternalExplicitOperations.g:375:5: (lv_constraints_5_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:375:5: (lv_constraints_5_0= ruleProposition )
                    // InternalExplicitOperations.g:376:6: lv_constraints_5_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getAtomicFeatureAccess().getConstraintsPropositionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalExplicitOperations.g:402:1: entryRuleOneOf returns [EObject current=null] : iv_ruleOneOf= ruleOneOf EOF ;
    public final EObject entryRuleOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOf = null;


        try {
            // InternalExplicitOperations.g:402:46: (iv_ruleOneOf= ruleOneOf EOF )
            // InternalExplicitOperations.g:403:2: iv_ruleOneOf= ruleOneOf EOF
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
    // InternalExplicitOperations.g:409:1: ruleOneOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) ;
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
            // InternalExplicitOperations.g:415:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) )
            // InternalExplicitOperations.g:416:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            {
            // InternalExplicitOperations.g:416:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            // InternalExplicitOperations.g:417:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            {
            // InternalExplicitOperations.g:417:3: ()
            // InternalExplicitOperations.g:418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOneOfAccess().getOneOfAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:424:3: ( (lv_optional_1_0= '?' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExplicitOperations.g:425:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:425:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:426:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,13,FOLLOW_10); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOneOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOneOfAccess().getOneOfKeyword_2());
            		
            // InternalExplicitOperations.g:442:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:443:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:443:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:444:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalExplicitOperations.g:464:3: ( (lv_children_5_0= ruleFeature ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=14)||LA6_0==17||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExplicitOperations.g:465:4: (lv_children_5_0= ruleFeature )
            	    {
            	    // InternalExplicitOperations.g:465:4: (lv_children_5_0= ruleFeature )
            	    // InternalExplicitOperations.g:466:5: lv_children_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getOneOfAccess().getChildrenFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalExplicitOperations.g:487:3: (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExplicitOperations.g:488:4: otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getOneOfAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalExplicitOperations.g:492:4: ( (lv_constraints_8_0= ruleProposition ) )
                    // InternalExplicitOperations.g:493:5: (lv_constraints_8_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:493:5: (lv_constraints_8_0= ruleProposition )
                    // InternalExplicitOperations.g:494:6: lv_constraints_8_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getOneOfAccess().getConstraintsPropositionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalExplicitOperations.g:520:1: entryRuleSomeOf returns [EObject current=null] : iv_ruleSomeOf= ruleSomeOf EOF ;
    public final EObject entryRuleSomeOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeOf = null;


        try {
            // InternalExplicitOperations.g:520:47: (iv_ruleSomeOf= ruleSomeOf EOF )
            // InternalExplicitOperations.g:521:2: iv_ruleSomeOf= ruleSomeOf EOF
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
    // InternalExplicitOperations.g:527:1: ruleSomeOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) ;
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
            // InternalExplicitOperations.g:533:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? ) )
            // InternalExplicitOperations.g:534:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            {
            // InternalExplicitOperations.g:534:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )? )
            // InternalExplicitOperations.g:535:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' ( (lv_children_5_0= ruleFeature ) )* otherlv_6= ']' (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            {
            // InternalExplicitOperations.g:535:3: ()
            // InternalExplicitOperations.g:536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeOfAccess().getSomeOfAction_0(),
            					current);
            			

            }

            // InternalExplicitOperations.g:542:3: ( (lv_optional_1_0= '?' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExplicitOperations.g:543:4: (lv_optional_1_0= '?' )
                    {
                    // InternalExplicitOperations.g:543:4: (lv_optional_1_0= '?' )
                    // InternalExplicitOperations.g:544:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,13,FOLLOW_13); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSomeOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeOfAccess().getSomeOfKeyword_2());
            		
            // InternalExplicitOperations.g:560:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalExplicitOperations.g:561:4: (lv_name_3_0= RULE_ID )
            {
            // InternalExplicitOperations.g:561:4: (lv_name_3_0= RULE_ID )
            // InternalExplicitOperations.g:562:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalExplicitOperations.g:582:3: ( (lv_children_5_0= ruleFeature ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=13 && LA9_0<=14)||LA9_0==17||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExplicitOperations.g:583:4: (lv_children_5_0= ruleFeature )
            	    {
            	    // InternalExplicitOperations.g:583:4: (lv_children_5_0= ruleFeature )
            	    // InternalExplicitOperations.g:584:5: lv_children_5_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSomeOfAccess().getChildrenFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalExplicitOperations.g:605:3: (otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExplicitOperations.g:606:4: otherlv_7= '(' ( (lv_constraints_8_0= ruleProposition ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSomeOfAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalExplicitOperations.g:610:4: ( (lv_constraints_8_0= ruleProposition ) )
                    // InternalExplicitOperations.g:611:5: (lv_constraints_8_0= ruleProposition )
                    {
                    // InternalExplicitOperations.g:611:5: (lv_constraints_8_0= ruleProposition )
                    // InternalExplicitOperations.g:612:6: lv_constraints_8_0= ruleProposition
                    {

                    						newCompositeNode(grammarAccess.getSomeOfAccess().getConstraintsPropositionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalExplicitOperations.g:638:1: entryRuleProposition returns [EObject current=null] : iv_ruleProposition= ruleProposition EOF ;
    public final EObject entryRuleProposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProposition = null;


        try {
            // InternalExplicitOperations.g:638:52: (iv_ruleProposition= ruleProposition EOF )
            // InternalExplicitOperations.g:639:2: iv_ruleProposition= ruleProposition EOF
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
    // InternalExplicitOperations.g:645:1: ruleProposition returns [EObject current=null] : this_Equiv_0= ruleEquiv ;
    public final EObject ruleProposition() throws RecognitionException {
        EObject current = null;

        EObject this_Equiv_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:651:2: (this_Equiv_0= ruleEquiv )
            // InternalExplicitOperations.g:652:2: this_Equiv_0= ruleEquiv
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
    // InternalExplicitOperations.g:663:1: entryRuleEquiv returns [EObject current=null] : iv_ruleEquiv= ruleEquiv EOF ;
    public final EObject entryRuleEquiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquiv = null;


        try {
            // InternalExplicitOperations.g:663:46: (iv_ruleEquiv= ruleEquiv EOF )
            // InternalExplicitOperations.g:664:2: iv_ruleEquiv= ruleEquiv EOF
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
    // InternalExplicitOperations.g:670:1: ruleEquiv returns [EObject current=null] : (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) ;
    public final EObject ruleEquiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Imply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:676:2: ( (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) )
            // InternalExplicitOperations.g:677:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            {
            // InternalExplicitOperations.g:677:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            // InternalExplicitOperations.g:678:3: this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquivAccess().getImplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Imply_0=ruleImply();

            state._fsp--;


            			current = this_Imply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:686:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalExplicitOperations.g:687:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) )
            	    {
            	    // InternalExplicitOperations.g:687:4: ()
            	    // InternalExplicitOperations.g:688:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquivAccess().getEquivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:698:4: ( (lv_right_3_0= ruleImply ) )
            	    // InternalExplicitOperations.g:699:5: (lv_right_3_0= ruleImply )
            	    {
            	    // InternalExplicitOperations.g:699:5: (lv_right_3_0= ruleImply )
            	    // InternalExplicitOperations.g:700:6: lv_right_3_0= ruleImply
            	    {

            	    						newCompositeNode(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop11;
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
    // InternalExplicitOperations.g:722:1: entryRuleImply returns [EObject current=null] : iv_ruleImply= ruleImply EOF ;
    public final EObject entryRuleImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImply = null;


        try {
            // InternalExplicitOperations.g:722:46: (iv_ruleImply= ruleImply EOF )
            // InternalExplicitOperations.g:723:2: iv_ruleImply= ruleImply EOF
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
    // InternalExplicitOperations.g:729:1: ruleImply returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:735:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalExplicitOperations.g:736:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalExplicitOperations.g:736:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalExplicitOperations.g:737:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplyAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:745:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalExplicitOperations.g:746:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalExplicitOperations.g:746:4: ()
            	    // InternalExplicitOperations.g:747:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplyAccess().getImplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:757:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalExplicitOperations.g:758:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalExplicitOperations.g:758:5: (lv_right_3_0= ruleOr )
            	    // InternalExplicitOperations.g:759:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
    // $ANTLR end "ruleImply"


    // $ANTLR start "entryRuleOr"
    // InternalExplicitOperations.g:781:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalExplicitOperations.g:781:43: (iv_ruleOr= ruleOr EOF )
            // InternalExplicitOperations.g:782:2: iv_ruleOr= ruleOr EOF
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
    // InternalExplicitOperations.g:788:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:794:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalExplicitOperations.g:795:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalExplicitOperations.g:795:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalExplicitOperations.g:796:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:804:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalExplicitOperations.g:805:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalExplicitOperations.g:805:4: ()
            	    // InternalExplicitOperations.g:806:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:816:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalExplicitOperations.g:817:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalExplicitOperations.g:817:5: (lv_right_3_0= ruleAnd )
            	    // InternalExplicitOperations.g:818:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalExplicitOperations.g:840:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalExplicitOperations.g:840:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalExplicitOperations.g:841:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalExplicitOperations.g:847:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:853:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalExplicitOperations.g:854:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalExplicitOperations.g:854:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalExplicitOperations.g:855:3: this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalExplicitOperations.g:863:3: ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExplicitOperations.g:864:4: () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalExplicitOperations.g:864:4: ()
            	    // InternalExplicitOperations.g:865:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalExplicitOperations.g:875:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalExplicitOperations.g:876:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalExplicitOperations.g:876:5: (lv_right_3_0= rulePrimary )
            	    // InternalExplicitOperations.g:877:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // InternalExplicitOperations.g:899:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalExplicitOperations.g:899:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalExplicitOperations.g:900:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalExplicitOperations.g:906:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
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
            // InternalExplicitOperations.g:912:2: ( ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalExplicitOperations.g:913:2: ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalExplicitOperations.g:913:2: ( (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalExplicitOperations.g:914:3: (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' )
                    {
                    // InternalExplicitOperations.g:914:3: (otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')' )
                    // InternalExplicitOperations.g:915:4: otherlv_0= '(' this_Proposition_1= ruleProposition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getPropositionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Proposition_1=ruleProposition();

                    state._fsp--;


                    				current = this_Proposition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExplicitOperations.g:933:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    {
                    // InternalExplicitOperations.g:933:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    // InternalExplicitOperations.g:934:4: () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) )
                    {
                    // InternalExplicitOperations.g:934:4: ()
                    // InternalExplicitOperations.g:935:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalExplicitOperations.g:945:4: ( (lv_next_5_0= rulePrimary ) )
                    // InternalExplicitOperations.g:946:5: (lv_next_5_0= rulePrimary )
                    {
                    // InternalExplicitOperations.g:946:5: (lv_next_5_0= rulePrimary )
                    // InternalExplicitOperations.g:947:6: lv_next_5_0= rulePrimary
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
                    // InternalExplicitOperations.g:966:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalExplicitOperations.g:966:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalExplicitOperations.g:967:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalExplicitOperations.g:967:4: ()
                    // InternalExplicitOperations.g:968:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVariableAction_2_0(),
                    						current);
                    				

                    }

                    // InternalExplicitOperations.g:974:4: ( (otherlv_7= RULE_ID ) )
                    // InternalExplicitOperations.g:975:5: (otherlv_7= RULE_ID )
                    {
                    // InternalExplicitOperations.g:975:5: (otherlv_7= RULE_ID )
                    // InternalExplicitOperations.g:976:6: otherlv_7= RULE_ID
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
    // InternalExplicitOperations.g:992:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalExplicitOperations.g:992:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalExplicitOperations.g:993:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalExplicitOperations.g:999:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) ) ;
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
            // InternalExplicitOperations.g:1005:2: ( (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) ) )
            // InternalExplicitOperations.g:1006:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) )
            {
            // InternalExplicitOperations.g:1006:2: (otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) ) )
            // InternalExplicitOperations.g:1007:3: otherlv_0= 'operation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'inputs' ( (lv_inputs_3_0= ruleOperationParameter ) )* otherlv_4= 'output' ( (lv_output_5_0= ruleOperationParameter ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalExplicitOperations.g:1011:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1012:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1012:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1013:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getInputsKeyword_2());
            		
            // InternalExplicitOperations.g:1033:3: ( (lv_inputs_3_0= ruleOperationParameter ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExplicitOperations.g:1034:4: (lv_inputs_3_0= ruleOperationParameter )
            	    {
            	    // InternalExplicitOperations.g:1034:4: (lv_inputs_3_0= ruleOperationParameter )
            	    // InternalExplicitOperations.g:1035:5: lv_inputs_3_0= ruleOperationParameter
            	    {

            	    					newCompositeNode(grammarAccess.getOperationAccess().getInputsOperationParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getOutputKeyword_4());
            		
            // InternalExplicitOperations.g:1056:3: ( (lv_output_5_0= ruleOperationParameter ) )
            // InternalExplicitOperations.g:1057:4: (lv_output_5_0= ruleOperationParameter )
            {
            // InternalExplicitOperations.g:1057:4: (lv_output_5_0= ruleOperationParameter )
            // InternalExplicitOperations.g:1058:5: lv_output_5_0= ruleOperationParameter
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
    // InternalExplicitOperations.g:1079:1: entryRuleOperationParameter returns [EObject current=null] : iv_ruleOperationParameter= ruleOperationParameter EOF ;
    public final EObject entryRuleOperationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationParameter = null;


        try {
            // InternalExplicitOperations.g:1079:59: (iv_ruleOperationParameter= ruleOperationParameter EOF )
            // InternalExplicitOperations.g:1080:2: iv_ruleOperationParameter= ruleOperationParameter EOF
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
    // InternalExplicitOperations.g:1086:1: ruleOperationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) ) ;
    public final EObject ruleOperationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_cardinality_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1092:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) ) )
            // InternalExplicitOperations.g:1093:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) )
            {
            // InternalExplicitOperations.g:1093:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) ) )
            // InternalExplicitOperations.g:1094:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( (lv_cardinality_3_0= ruleCardinality ) )
            {
            // InternalExplicitOperations.g:1094:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExplicitOperations.g:1095:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1095:4: (lv_name_0_0= RULE_ID )
            // InternalExplicitOperations.g:1096:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationParameterAccess().getColonKeyword_1());
            		
            // InternalExplicitOperations.g:1116:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1117:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1117:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1118:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationParameterRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getOperationParameterAccess().getTypeLanguageCrossReference_2_0());
            				

            }


            }

            // InternalExplicitOperations.g:1129:3: ( (lv_cardinality_3_0= ruleCardinality ) )
            // InternalExplicitOperations.g:1130:4: (lv_cardinality_3_0= ruleCardinality )
            {
            // InternalExplicitOperations.g:1130:4: (lv_cardinality_3_0= ruleCardinality )
            // InternalExplicitOperations.g:1131:5: lv_cardinality_3_0= ruleCardinality
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
    // InternalExplicitOperations.g:1152:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalExplicitOperations.g:1152:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalExplicitOperations.g:1153:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalExplicitOperations.g:1159:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_start_1_0 = null;

        EObject lv_stop_3_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1165:2: ( (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' ) )
            // InternalExplicitOperations.g:1166:2: (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' )
            {
            // InternalExplicitOperations.g:1166:2: (otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']' )
            // InternalExplicitOperations.g:1167:3: otherlv_0= '[' ( (lv_start_1_0= ruleCardVal ) ) otherlv_2= '..' ( (lv_stop_3_0= ruleCardVal ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalExplicitOperations.g:1171:3: ( (lv_start_1_0= ruleCardVal ) )
            // InternalExplicitOperations.g:1172:4: (lv_start_1_0= ruleCardVal )
            {
            // InternalExplicitOperations.g:1172:4: (lv_start_1_0= ruleCardVal )
            // InternalExplicitOperations.g:1173:5: lv_start_1_0= ruleCardVal
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getStartCardValParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2());
            		
            // InternalExplicitOperations.g:1194:3: ( (lv_stop_3_0= ruleCardVal ) )
            // InternalExplicitOperations.g:1195:4: (lv_stop_3_0= ruleCardVal )
            {
            // InternalExplicitOperations.g:1195:4: (lv_stop_3_0= ruleCardVal )
            // InternalExplicitOperations.g:1196:5: lv_stop_3_0= ruleCardVal
            {

            					newCompositeNode(grammarAccess.getCardinalityAccess().getStopCardValParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalExplicitOperations.g:1221:1: entryRuleCardVal returns [EObject current=null] : iv_ruleCardVal= ruleCardVal EOF ;
    public final EObject entryRuleCardVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardVal = null;


        try {
            // InternalExplicitOperations.g:1221:48: (iv_ruleCardVal= ruleCardVal EOF )
            // InternalExplicitOperations.g:1222:2: iv_ruleCardVal= ruleCardVal EOF
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
    // InternalExplicitOperations.g:1228:1: ruleCardVal returns [EObject current=null] : ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) ;
    public final EObject ruleCardVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1234:2: ( ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) )
            // InternalExplicitOperations.g:1235:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            {
            // InternalExplicitOperations.g:1235:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt17=1;
                }
                break;
            case 32:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalExplicitOperations.g:1236:3: ( () otherlv_1= '0' )
                    {
                    // InternalExplicitOperations.g:1236:3: ( () otherlv_1= '0' )
                    // InternalExplicitOperations.g:1237:4: () otherlv_1= '0'
                    {
                    // InternalExplicitOperations.g:1237:4: ()
                    // InternalExplicitOperations.g:1238:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardVal0Action_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardValAccess().getDigitZeroKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalExplicitOperations.g:1250:3: ( () otherlv_3= '1' )
                    {
                    // InternalExplicitOperations.g:1250:3: ( () otherlv_3= '1' )
                    // InternalExplicitOperations.g:1251:4: () otherlv_3= '1'
                    {
                    // InternalExplicitOperations.g:1251:4: ()
                    // InternalExplicitOperations.g:1252:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardVal1Action_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCardValAccess().getDigitOneKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalExplicitOperations.g:1264:3: ( () otherlv_5= '*' )
                    {
                    // InternalExplicitOperations.g:1264:3: ( () otherlv_5= '*' )
                    // InternalExplicitOperations.g:1265:4: () otherlv_5= '*'
                    {
                    // InternalExplicitOperations.g:1265:4: ()
                    // InternalExplicitOperations.g:1266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardValAccess().getCardValNAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalExplicitOperations.g:1281:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalExplicitOperations.g:1281:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalExplicitOperations.g:1282:2: iv_ruleLanguage= ruleLanguage EOF
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
    // InternalExplicitOperations.g:1288:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1294:2: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* ) )
            // InternalExplicitOperations.g:1295:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* )
            {
            // InternalExplicitOperations.g:1295:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )* )
            // InternalExplicitOperations.g:1296:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dependencies_2_0= ruleLanguageDependency ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
            		
            // InternalExplicitOperations.g:1300:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1301:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1301:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1302:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalExplicitOperations.g:1318:3: ( (lv_dependencies_2_0= ruleLanguageDependency ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExplicitOperations.g:1319:4: (lv_dependencies_2_0= ruleLanguageDependency )
            	    {
            	    // InternalExplicitOperations.g:1319:4: (lv_dependencies_2_0= ruleLanguageDependency )
            	    // InternalExplicitOperations.g:1320:5: lv_dependencies_2_0= ruleLanguageDependency
            	    {

            	    					newCompositeNode(grammarAccess.getLanguageAccess().getDependenciesLanguageDependencyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop18;
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
    // InternalExplicitOperations.g:1341:1: entryRuleLanguageDependency returns [EObject current=null] : iv_ruleLanguageDependency= ruleLanguageDependency EOF ;
    public final EObject entryRuleLanguageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageDependency = null;


        try {
            // InternalExplicitOperations.g:1341:59: (iv_ruleLanguageDependency= ruleLanguageDependency EOF )
            // InternalExplicitOperations.g:1342:2: iv_ruleLanguageDependency= ruleLanguageDependency EOF
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
    // InternalExplicitOperations.g:1348:1: ruleLanguageDependency returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLanguageDependency() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1354:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1355:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1356:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1356:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExplicitOperations.g:1357:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1357:4: (lv_name_0_0= RULE_ID )
            // InternalExplicitOperations.g:1358:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageDependencyAccess().getColonKeyword_1());
            		
            // InternalExplicitOperations.g:1378:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1379:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1379:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1380:5: otherlv_2= RULE_ID
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
    // InternalExplicitOperations.g:1395:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalExplicitOperations.g:1395:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalExplicitOperations.g:1396:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalExplicitOperations.g:1402:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? ) ;
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
            // InternalExplicitOperations.g:1408:2: ( (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? ) )
            // InternalExplicitOperations.g:1409:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? )
            {
            // InternalExplicitOperations.g:1409:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )? )
            // InternalExplicitOperations.g:1410:3: otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            // InternalExplicitOperations.g:1414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1415:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            // InternalExplicitOperations.g:1436:3: ( (otherlv_3= RULE_ID ) )
            // InternalExplicitOperations.g:1437:4: (otherlv_3= RULE_ID )
            {
            // InternalExplicitOperations.g:1437:4: (otherlv_3= RULE_ID )
            // InternalExplicitOperations.g:1438:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getTypeLanguageCrossReference_3_0());
            				

            }


            }

            // InternalExplicitOperations.g:1449:3: (otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalExplicitOperations.g:1450:4: otherlv_4= '[' ( (lv_parameters_5_0= ruleArtifactParameter ) )* otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalExplicitOperations.g:1454:4: ( (lv_parameters_5_0= ruleArtifactParameter ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalExplicitOperations.g:1455:5: (lv_parameters_5_0= ruleArtifactParameter )
                    	    {
                    	    // InternalExplicitOperations.g:1455:5: (lv_parameters_5_0= ruleArtifactParameter )
                    	    // InternalExplicitOperations.g:1456:6: lv_parameters_5_0= ruleArtifactParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getArtifactAccess().getParametersArtifactParameterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
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
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalExplicitOperations.g:1482:1: entryRuleArtifactParameter returns [EObject current=null] : iv_ruleArtifactParameter= ruleArtifactParameter EOF ;
    public final EObject entryRuleArtifactParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactParameter = null;


        try {
            // InternalExplicitOperations.g:1482:58: (iv_ruleArtifactParameter= ruleArtifactParameter EOF )
            // InternalExplicitOperations.g:1483:2: iv_ruleArtifactParameter= ruleArtifactParameter EOF
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
    // InternalExplicitOperations.g:1489:1: ruleArtifactParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleArtifactParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1495:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1496:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1496:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1497:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1497:3: ( (otherlv_0= RULE_ID ) )
            // InternalExplicitOperations.g:1498:4: (otherlv_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1498:4: (otherlv_0= RULE_ID )
            // InternalExplicitOperations.g:1499:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getArtifactParameterAccess().getNameLanguageDependencyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactParameterAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalExplicitOperations.g:1514:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1515:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1515:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1516:5: otherlv_2= RULE_ID
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
    // InternalExplicitOperations.g:1531:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalExplicitOperations.g:1531:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalExplicitOperations.g:1532:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalExplicitOperations.g:1538:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'activation' otherlv_5= '=' ( (lv_activation_6_0= ruleProposition ) ) otherlv_7= '[' ( (lv_parameters_8_0= ruleCompositionParameter ) )* otherlv_9= ']' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_activation_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalExplicitOperations.g:1544:2: ( (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'activation' otherlv_5= '=' ( (lv_activation_6_0= ruleProposition ) ) otherlv_7= '[' ( (lv_parameters_8_0= ruleCompositionParameter ) )* otherlv_9= ']' ) )
            // InternalExplicitOperations.g:1545:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'activation' otherlv_5= '=' ( (lv_activation_6_0= ruleProposition ) ) otherlv_7= '[' ( (lv_parameters_8_0= ruleCompositionParameter ) )* otherlv_9= ']' )
            {
            // InternalExplicitOperations.g:1545:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'activation' otherlv_5= '=' ( (lv_activation_6_0= ruleProposition ) ) otherlv_7= '[' ( (lv_parameters_8_0= ruleCompositionParameter ) )* otherlv_9= ']' )
            // InternalExplicitOperations.g:1546:3: otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '::' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'activation' otherlv_5= '=' ( (lv_activation_6_0= ruleProposition ) ) otherlv_7= '[' ( (lv_parameters_8_0= ruleCompositionParameter ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalExplicitOperations.g:1550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalExplicitOperations.g:1551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1551:4: (lv_name_1_0= RULE_ID )
            // InternalExplicitOperations.g:1552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getColonColonKeyword_2());
            		
            // InternalExplicitOperations.g:1572:3: ( (otherlv_3= RULE_ID ) )
            // InternalExplicitOperations.g:1573:4: (otherlv_3= RULE_ID )
            {
            // InternalExplicitOperations.g:1573:4: (otherlv_3= RULE_ID )
            // InternalExplicitOperations.g:1574:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getOperationOperationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getActivationKeyword_4());
            		
            otherlv_5=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getEqualsSignKeyword_5());
            		
            // InternalExplicitOperations.g:1593:3: ( (lv_activation_6_0= ruleProposition ) )
            // InternalExplicitOperations.g:1594:4: (lv_activation_6_0= ruleProposition )
            {
            // InternalExplicitOperations.g:1594:4: (lv_activation_6_0= ruleProposition )
            // InternalExplicitOperations.g:1595:5: lv_activation_6_0= ruleProposition
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getActivationPropositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_activation_6_0=ruleProposition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"activation",
            						lv_activation_6_0,
            						"fr.mleduc.ExplicitOperations.Proposition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalExplicitOperations.g:1616:3: ( (lv_parameters_8_0= ruleCompositionParameter ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalExplicitOperations.g:1617:4: (lv_parameters_8_0= ruleCompositionParameter )
            	    {
            	    // InternalExplicitOperations.g:1617:4: (lv_parameters_8_0= ruleCompositionParameter )
            	    // InternalExplicitOperations.g:1618:5: lv_parameters_8_0= ruleCompositionParameter
            	    {

            	    					newCompositeNode(grammarAccess.getCompositionAccess().getParametersCompositionParameterParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_parameters_8_0=ruleCompositionParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_8_0,
            	    						"fr.mleduc.ExplicitOperations.CompositionParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_9());
            		

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
    // InternalExplicitOperations.g:1643:1: entryRuleCompositionParameter returns [EObject current=null] : iv_ruleCompositionParameter= ruleCompositionParameter EOF ;
    public final EObject entryRuleCompositionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionParameter = null;


        try {
            // InternalExplicitOperations.g:1643:61: (iv_ruleCompositionParameter= ruleCompositionParameter EOF )
            // InternalExplicitOperations.g:1644:2: iv_ruleCompositionParameter= ruleCompositionParameter EOF
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
    // InternalExplicitOperations.g:1650:1: ruleCompositionParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleCompositionParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExplicitOperations.g:1656:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalExplicitOperations.g:1657:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalExplicitOperations.g:1657:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // InternalExplicitOperations.g:1658:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // InternalExplicitOperations.g:1658:3: ( (otherlv_0= RULE_ID ) )
            // InternalExplicitOperations.g:1659:4: (otherlv_0= RULE_ID )
            {
            // InternalExplicitOperations.g:1659:4: (otherlv_0= RULE_ID )
            // InternalExplicitOperations.g:1660:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_0, grammarAccess.getCompositionParameterAccess().getNameOperationParameterCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositionParameterAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalExplicitOperations.g:1675:3: ( (otherlv_2= RULE_ID ) )
            // InternalExplicitOperations.g:1676:4: (otherlv_2= RULE_ID )
            {
            // InternalExplicitOperations.g:1676:4: (otherlv_2= RULE_ID )
            // InternalExplicitOperations.g:1677:5: otherlv_2= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001C04001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000126000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A6000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});

}