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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalColdLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'concern'", "'{'", "'import'", "'}'", "'?'", "'oneOf'", "'['", "'-'", "']'", "'someOf'", "'feature'", "'language'", "':'", "'=>'", "'perspective'", "'facet'", "'activation'", "'('", "','", "')'", "'artifact'", "'<=>'", "'or'", "'and'", "'!'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_INT=6;
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


        public InternalColdLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalColdLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalColdLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalColdLang.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalColdLang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalColdLang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalColdLang.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalColdLang.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_concerns_0_0= ruleConcern ) ) | ( (lv_languages_1_0= ruleLanguage ) ) | ( (lv_perspectives_2_0= rulePerspective ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_concerns_0_0 = null;

        EObject lv_languages_1_0 = null;

        EObject lv_perspectives_2_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:77:2: ( ( ( (lv_concerns_0_0= ruleConcern ) ) | ( (lv_languages_1_0= ruleLanguage ) ) | ( (lv_perspectives_2_0= rulePerspective ) ) )* )
            // InternalColdLang.g:78:2: ( ( (lv_concerns_0_0= ruleConcern ) ) | ( (lv_languages_1_0= ruleLanguage ) ) | ( (lv_perspectives_2_0= rulePerspective ) ) )*
            {
            // InternalColdLang.g:78:2: ( ( (lv_concerns_0_0= ruleConcern ) ) | ( (lv_languages_1_0= ruleLanguage ) ) | ( (lv_perspectives_2_0= rulePerspective ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 22:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalColdLang.g:79:3: ( (lv_concerns_0_0= ruleConcern ) )
            	    {
            	    // InternalColdLang.g:79:3: ( (lv_concerns_0_0= ruleConcern ) )
            	    // InternalColdLang.g:80:4: (lv_concerns_0_0= ruleConcern )
            	    {
            	    // InternalColdLang.g:80:4: (lv_concerns_0_0= ruleConcern )
            	    // InternalColdLang.g:81:5: lv_concerns_0_0= ruleConcern
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConcernsConcernParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_concerns_0_0=ruleConcern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concerns",
            	    						lv_concerns_0_0,
            	    						"fr.mleduc.ColdLang.Concern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalColdLang.g:99:3: ( (lv_languages_1_0= ruleLanguage ) )
            	    {
            	    // InternalColdLang.g:99:3: ( (lv_languages_1_0= ruleLanguage ) )
            	    // InternalColdLang.g:100:4: (lv_languages_1_0= ruleLanguage )
            	    {
            	    // InternalColdLang.g:100:4: (lv_languages_1_0= ruleLanguage )
            	    // InternalColdLang.g:101:5: lv_languages_1_0= ruleLanguage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLanguagesLanguageParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_languages_1_0=ruleLanguage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"languages",
            	    						lv_languages_1_0,
            	    						"fr.mleduc.ColdLang.Language");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalColdLang.g:119:3: ( (lv_perspectives_2_0= rulePerspective ) )
            	    {
            	    // InternalColdLang.g:119:3: ( (lv_perspectives_2_0= rulePerspective ) )
            	    // InternalColdLang.g:120:4: (lv_perspectives_2_0= rulePerspective )
            	    {
            	    // InternalColdLang.g:120:4: (lv_perspectives_2_0= rulePerspective )
            	    // InternalColdLang.g:121:5: lv_perspectives_2_0= rulePerspective
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPerspectivesPerspectiveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_perspectives_2_0=rulePerspective();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"perspectives",
            	    						lv_perspectives_2_0,
            	    						"fr.mleduc.ColdLang.Perspective");
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


    // $ANTLR start "entryRuleConcern"
    // InternalColdLang.g:142:1: entryRuleConcern returns [EObject current=null] : iv_ruleConcern= ruleConcern EOF ;
    public final EObject entryRuleConcern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcern = null;


        try {
            // InternalColdLang.g:142:48: (iv_ruleConcern= ruleConcern EOF )
            // InternalColdLang.g:143:2: iv_ruleConcern= ruleConcern EOF
            {
             newCompositeNode(grammarAccess.getConcernRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcern=ruleConcern();

            state._fsp--;

             current =iv_ruleConcern; 
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
    // $ANTLR end "entryRuleConcern"


    // $ANTLR start "ruleConcern"
    // InternalColdLang.g:149:1: ruleConcern returns [EObject current=null] : (otherlv_0= 'concern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )* ( (lv_fm_7_0= ruleFeatureModel ) ) otherlv_8= '}' ) ;
    public final EObject ruleConcern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_facets_5_0 = null;

        EObject lv_artifact_6_0 = null;

        EObject lv_fm_7_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:155:2: ( (otherlv_0= 'concern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )* ( (lv_fm_7_0= ruleFeatureModel ) ) otherlv_8= '}' ) )
            // InternalColdLang.g:156:2: (otherlv_0= 'concern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )* ( (lv_fm_7_0= ruleFeatureModel ) ) otherlv_8= '}' )
            {
            // InternalColdLang.g:156:2: (otherlv_0= 'concern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )* ( (lv_fm_7_0= ruleFeatureModel ) ) otherlv_8= '}' )
            // InternalColdLang.g:157:3: otherlv_0= 'concern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )? ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )* ( (lv_fm_7_0= ruleFeatureModel ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConcernAccess().getConcernKeyword_0());
            		
            // InternalColdLang.g:161:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalColdLang.g:162:4: (lv_name_1_0= RULE_ID )
            {
            // InternalColdLang.g:162:4: (lv_name_1_0= RULE_ID )
            // InternalColdLang.g:163:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcernRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalColdLang.g:183:3: (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalColdLang.g:184:4: otherlv_3= 'import' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getConcernAccess().getImportKeyword_3_0());
                    			
                    // InternalColdLang.g:188:4: ( (otherlv_4= RULE_ID ) )
                    // InternalColdLang.g:189:5: (otherlv_4= RULE_ID )
                    {
                    // InternalColdLang.g:189:5: (otherlv_4= RULE_ID )
                    // InternalColdLang.g:190:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcernRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_4, grammarAccess.getConcernAccess().getImportedPerspectiveCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalColdLang.g:202:3: ( ( (lv_facets_5_0= ruleFacet ) ) | ( (lv_artifact_6_0= ruleArtifact ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }
                else if ( (LA3_0==31) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalColdLang.g:203:4: ( (lv_facets_5_0= ruleFacet ) )
            	    {
            	    // InternalColdLang.g:203:4: ( (lv_facets_5_0= ruleFacet ) )
            	    // InternalColdLang.g:204:5: (lv_facets_5_0= ruleFacet )
            	    {
            	    // InternalColdLang.g:204:5: (lv_facets_5_0= ruleFacet )
            	    // InternalColdLang.g:205:6: lv_facets_5_0= ruleFacet
            	    {

            	    						newCompositeNode(grammarAccess.getConcernAccess().getFacetsFacetParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_facets_5_0=ruleFacet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcernRule());
            	    						}
            	    						add(
            	    							current,
            	    							"facets",
            	    							lv_facets_5_0,
            	    							"fr.mleduc.ColdLang.Facet");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalColdLang.g:223:4: ( (lv_artifact_6_0= ruleArtifact ) )
            	    {
            	    // InternalColdLang.g:223:4: ( (lv_artifact_6_0= ruleArtifact ) )
            	    // InternalColdLang.g:224:5: (lv_artifact_6_0= ruleArtifact )
            	    {
            	    // InternalColdLang.g:224:5: (lv_artifact_6_0= ruleArtifact )
            	    // InternalColdLang.g:225:6: lv_artifact_6_0= ruleArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getConcernAccess().getArtifactArtifactParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_artifact_6_0=ruleArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcernRule());
            	    						}
            	    						add(
            	    							current,
            	    							"artifact",
            	    							lv_artifact_6_0,
            	    							"fr.mleduc.ColdLang.Artifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalColdLang.g:243:3: ( (lv_fm_7_0= ruleFeatureModel ) )
            // InternalColdLang.g:244:4: (lv_fm_7_0= ruleFeatureModel )
            {
            // InternalColdLang.g:244:4: (lv_fm_7_0= ruleFeatureModel )
            // InternalColdLang.g:245:5: lv_fm_7_0= ruleFeatureModel
            {

            					newCompositeNode(grammarAccess.getConcernAccess().getFmFeatureModelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_fm_7_0=ruleFeatureModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConcernRule());
            					}
            					set(
            						current,
            						"fm",
            						lv_fm_7_0,
            						"fr.mleduc.ColdLang.FeatureModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleConcern"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalColdLang.g:270:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalColdLang.g:270:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalColdLang.g:271:2: iv_ruleFeatureModel= ruleFeatureModel EOF
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
    // InternalColdLang.g:277:1: ruleFeatureModel returns [EObject current=null] : (this_OneOf_0= ruleOneOf | this_SomeOf_1= ruleSomeOf | this_Feature_2= ruleFeature ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject this_OneOf_0 = null;

        EObject this_SomeOf_1 = null;

        EObject this_Feature_2 = null;



        	enterRule();

        try {
            // InternalColdLang.g:283:2: ( (this_OneOf_0= ruleOneOf | this_SomeOf_1= ruleSomeOf | this_Feature_2= ruleFeature ) )
            // InternalColdLang.g:284:2: (this_OneOf_0= ruleOneOf | this_SomeOf_1= ruleSomeOf | this_Feature_2= ruleFeature )
            {
            // InternalColdLang.g:284:2: (this_OneOf_0= ruleOneOf | this_SomeOf_1= ruleSomeOf | this_Feature_2= ruleFeature )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt4=2;
                    }
                    break;
                case 21:
                    {
                    alt4=3;
                    }
                    break;
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 16:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalColdLang.g:285:3: this_OneOf_0= ruleOneOf
                    {

                    			newCompositeNode(grammarAccess.getFeatureModelAccess().getOneOfParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OneOf_0=ruleOneOf();

                    state._fsp--;


                    			current = this_OneOf_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalColdLang.g:294:3: this_SomeOf_1= ruleSomeOf
                    {

                    			newCompositeNode(grammarAccess.getFeatureModelAccess().getSomeOfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SomeOf_1=ruleSomeOf();

                    state._fsp--;


                    			current = this_SomeOf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalColdLang.g:303:3: this_Feature_2= ruleFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureModelAccess().getFeatureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Feature_2=ruleFeature();

                    state._fsp--;


                    			current = this_Feature_2;
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
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleOneOf"
    // InternalColdLang.g:315:1: entryRuleOneOf returns [EObject current=null] : iv_ruleOneOf= ruleOneOf EOF ;
    public final EObject entryRuleOneOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneOf = null;


        try {
            // InternalColdLang.g:315:46: (iv_ruleOneOf= ruleOneOf EOF )
            // InternalColdLang.g:316:2: iv_ruleOneOf= ruleOneOf EOF
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
    // InternalColdLang.g:322:1: ruleOneOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? ) ;
    public final EObject ruleOneOf() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_children_6_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:328:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? ) )
            // InternalColdLang.g:329:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? )
            {
            // InternalColdLang.g:329:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? )
            // InternalColdLang.g:330:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'oneOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )?
            {
            // InternalColdLang.g:330:3: ()
            // InternalColdLang.g:331:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOneOfAccess().getOneOfAction_0(),
            					current);
            			

            }

            // InternalColdLang.g:337:3: ( (lv_optional_1_0= '?' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalColdLang.g:338:4: (lv_optional_1_0= '?' )
                    {
                    // InternalColdLang.g:338:4: (lv_optional_1_0= '?' )
                    // InternalColdLang.g:339:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOneOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOneOfAccess().getOneOfKeyword_2());
            		
            // InternalColdLang.g:355:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalColdLang.g:356:4: (lv_name_3_0= RULE_ID )
            {
            // InternalColdLang.g:356:4: (lv_name_3_0= RULE_ID )
            // InternalColdLang.g:357:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalColdLang.g:377:3: (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalColdLang.g:378:4: otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getOneOfAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalColdLang.g:382:4: ( (lv_children_6_0= ruleFeatureModel ) )
            	    // InternalColdLang.g:383:5: (lv_children_6_0= ruleFeatureModel )
            	    {
            	    // InternalColdLang.g:383:5: (lv_children_6_0= ruleFeatureModel )
            	    // InternalColdLang.g:384:6: lv_children_6_0= ruleFeatureModel
            	    {

            	    						newCompositeNode(grammarAccess.getOneOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_children_6_0=ruleFeatureModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOneOfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_6_0,
            	    							"fr.mleduc.ColdLang.FeatureModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalColdLang.g:406:3: ( (lv_condition_8_0= ruleCondition ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==28||LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalColdLang.g:407:4: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalColdLang.g:407:4: (lv_condition_8_0= ruleCondition )
                    // InternalColdLang.g:408:5: lv_condition_8_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getOneOfAccess().getConditionConditionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOneOfRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_8_0,
                    						"fr.mleduc.ColdLang.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // InternalColdLang.g:429:1: entryRuleSomeOf returns [EObject current=null] : iv_ruleSomeOf= ruleSomeOf EOF ;
    public final EObject entryRuleSomeOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeOf = null;


        try {
            // InternalColdLang.g:429:47: (iv_ruleSomeOf= ruleSomeOf EOF )
            // InternalColdLang.g:430:2: iv_ruleSomeOf= ruleSomeOf EOF
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
    // InternalColdLang.g:436:1: ruleSomeOf returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? ) ;
    public final EObject ruleSomeOf() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_children_6_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:442:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? ) )
            // InternalColdLang.g:443:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? )
            {
            // InternalColdLang.g:443:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )? )
            // InternalColdLang.g:444:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'someOf' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '[' (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )* otherlv_7= ']' ( (lv_condition_8_0= ruleCondition ) )?
            {
            // InternalColdLang.g:444:3: ()
            // InternalColdLang.g:445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSomeOfAccess().getSomeOfAction_0(),
            					current);
            			

            }

            // InternalColdLang.g:451:3: ( (lv_optional_1_0= '?' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalColdLang.g:452:4: (lv_optional_1_0= '?' )
                    {
                    // InternalColdLang.g:452:4: (lv_optional_1_0= '?' )
                    // InternalColdLang.g:453:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_12); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSomeOfRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSomeOfAccess().getSomeOfKeyword_2());
            		
            // InternalColdLang.g:469:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalColdLang.g:470:4: (lv_name_3_0= RULE_ID )
            {
            // InternalColdLang.g:470:4: (lv_name_3_0= RULE_ID )
            // InternalColdLang.g:471:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalColdLang.g:491:3: (otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalColdLang.g:492:4: otherlv_5= '-' ( (lv_children_6_0= ruleFeatureModel ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSomeOfAccess().getHyphenMinusKeyword_5_0());
            	    			
            	    // InternalColdLang.g:496:4: ( (lv_children_6_0= ruleFeatureModel ) )
            	    // InternalColdLang.g:497:5: (lv_children_6_0= ruleFeatureModel )
            	    {
            	    // InternalColdLang.g:497:5: (lv_children_6_0= ruleFeatureModel )
            	    // InternalColdLang.g:498:6: lv_children_6_0= ruleFeatureModel
            	    {

            	    						newCompositeNode(grammarAccess.getSomeOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_children_6_0=ruleFeatureModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSomeOfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"children",
            	    							lv_children_6_0,
            	    							"fr.mleduc.ColdLang.FeatureModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6());
            		
            // InternalColdLang.g:520:3: ( (lv_condition_8_0= ruleCondition ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==28||LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalColdLang.g:521:4: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalColdLang.g:521:4: (lv_condition_8_0= ruleCondition )
                    // InternalColdLang.g:522:5: lv_condition_8_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getSomeOfAccess().getConditionConditionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSomeOfRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_8_0,
                    						"fr.mleduc.ColdLang.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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


    // $ANTLR start "entryRuleFeature"
    // InternalColdLang.g:543:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalColdLang.g:543:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalColdLang.g:544:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalColdLang.g:550:1: ruleFeature returns [EObject current=null] : ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) ( (lv_condition_4_0= ruleCondition ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:556:2: ( ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) ( (lv_condition_4_0= ruleCondition ) )? ) )
            // InternalColdLang.g:557:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) ( (lv_condition_4_0= ruleCondition ) )? )
            {
            // InternalColdLang.g:557:2: ( () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) ( (lv_condition_4_0= ruleCondition ) )? )
            // InternalColdLang.g:558:3: () ( (lv_optional_1_0= '?' ) )? otherlv_2= 'feature' ( (lv_name_3_0= RULE_ID ) ) ( (lv_condition_4_0= ruleCondition ) )?
            {
            // InternalColdLang.g:558:3: ()
            // InternalColdLang.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            // InternalColdLang.g:565:3: ( (lv_optional_1_0= '?' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalColdLang.g:566:4: (lv_optional_1_0= '?' )
                    {
                    // InternalColdLang.g:566:4: (lv_optional_1_0= '?' )
                    // InternalColdLang.g:567:5: lv_optional_1_0= '?'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_13); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "optional", true, "?");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
            		
            // InternalColdLang.g:583:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalColdLang.g:584:4: (lv_name_3_0= RULE_ID )
            {
            // InternalColdLang.g:584:4: (lv_name_3_0= RULE_ID )
            // InternalColdLang.g:585:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalColdLang.g:601:3: ( (lv_condition_4_0= ruleCondition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==28||LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalColdLang.g:602:4: (lv_condition_4_0= ruleCondition )
                    {
                    // InternalColdLang.g:602:4: (lv_condition_4_0= ruleCondition )
                    // InternalColdLang.g:603:5: lv_condition_4_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getFeatureAccess().getConditionConditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_4_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_4_0,
                    						"fr.mleduc.ColdLang.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleLanguage"
    // InternalColdLang.g:624:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalColdLang.g:624:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalColdLang.g:625:2: iv_ruleLanguage= ruleLanguage EOF
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
    // InternalColdLang.g:631:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operators_3_0= ruleLanguageOperator ) )* otherlv_4= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_operators_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:637:2: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operators_3_0= ruleLanguageOperator ) )* otherlv_4= '}' ) )
            // InternalColdLang.g:638:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operators_3_0= ruleLanguageOperator ) )* otherlv_4= '}' )
            {
            // InternalColdLang.g:638:2: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operators_3_0= ruleLanguageOperator ) )* otherlv_4= '}' )
            // InternalColdLang.g:639:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_operators_3_0= ruleLanguageOperator ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
            		
            // InternalColdLang.g:643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalColdLang.g:644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalColdLang.g:644:4: (lv_name_1_0= RULE_ID )
            // InternalColdLang.g:645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalColdLang.g:665:3: ( (lv_operators_3_0= ruleLanguageOperator ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalColdLang.g:666:4: (lv_operators_3_0= ruleLanguageOperator )
            	    {
            	    // InternalColdLang.g:666:4: (lv_operators_3_0= ruleLanguageOperator )
            	    // InternalColdLang.g:667:5: lv_operators_3_0= ruleLanguageOperator
            	    {

            	    					newCompositeNode(grammarAccess.getLanguageAccess().getOperatorsLanguageOperatorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_operators_3_0=ruleLanguageOperator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operators",
            	    						lv_operators_3_0,
            	    						"fr.mleduc.ColdLang.LanguageOperator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleLanguageOperator"
    // InternalColdLang.g:692:1: entryRuleLanguageOperator returns [EObject current=null] : iv_ruleLanguageOperator= ruleLanguageOperator EOF ;
    public final EObject entryRuleLanguageOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageOperator = null;


        try {
            // InternalColdLang.g:692:57: (iv_ruleLanguageOperator= ruleLanguageOperator EOF )
            // InternalColdLang.g:693:2: iv_ruleLanguageOperator= ruleLanguageOperator EOF
            {
             newCompositeNode(grammarAccess.getLanguageOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageOperator=ruleLanguageOperator();

            state._fsp--;

             current =iv_ruleLanguageOperator; 
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
    // $ANTLR end "entryRuleLanguageOperator"


    // $ANTLR start "ruleLanguageOperator"
    // InternalColdLang.g:699:1: ruleLanguageOperator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '[' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ']' ) ;
    public final EObject ruleLanguageOperator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalColdLang.g:705:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '[' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ']' ) )
            // InternalColdLang.g:706:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '[' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ']' )
            {
            // InternalColdLang.g:706:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '[' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ']' )
            // InternalColdLang.g:707:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '[' ( (lv_description_6_0= RULE_STRING ) ) otherlv_7= ']'
            {
            // InternalColdLang.g:707:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalColdLang.g:708:4: (lv_name_0_0= RULE_ID )
            {
            // InternalColdLang.g:708:4: (lv_name_0_0= RULE_ID )
            // InternalColdLang.g:709:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLanguageOperatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageOperatorAccess().getColonKeyword_1());
            		
            // InternalColdLang.g:729:3: ( (otherlv_2= RULE_ID ) )
            // InternalColdLang.g:730:4: (otherlv_2= RULE_ID )
            {
            // InternalColdLang.g:730:4: (otherlv_2= RULE_ID )
            // InternalColdLang.g:731:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageOperatorRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_2, grammarAccess.getLanguageOperatorAccess().getTypeLanguageCrossReference_2_0());
            				

            }


            }

            // InternalColdLang.g:742:3: (otherlv_3= '=>' ( (otherlv_4= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalColdLang.g:743:4: otherlv_3= '=>' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getLanguageOperatorAccess().getEqualsSignGreaterThanSignKeyword_3_0());
            	    			
            	    // InternalColdLang.g:747:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalColdLang.g:748:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalColdLang.g:748:5: (otherlv_4= RULE_ID )
            	    // InternalColdLang.g:749:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLanguageOperatorRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_4, grammarAccess.getLanguageOperatorAccess().getTypesLanguageCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getLanguageOperatorAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalColdLang.g:765:3: ( (lv_description_6_0= RULE_STRING ) )
            // InternalColdLang.g:766:4: (lv_description_6_0= RULE_STRING )
            {
            // InternalColdLang.g:766:4: (lv_description_6_0= RULE_STRING )
            // InternalColdLang.g:767:5: lv_description_6_0= RULE_STRING
            {
            lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_description_6_0, grammarAccess.getLanguageOperatorAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageOperatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLanguageOperatorAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLanguageOperator"


    // $ANTLR start "entryRulePerspective"
    // InternalColdLang.g:791:1: entryRulePerspective returns [EObject current=null] : iv_rulePerspective= rulePerspective EOF ;
    public final EObject entryRulePerspective() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspective = null;


        try {
            // InternalColdLang.g:791:52: (iv_rulePerspective= rulePerspective EOF )
            // InternalColdLang.g:792:2: iv_rulePerspective= rulePerspective EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerspective=rulePerspective();

            state._fsp--;

             current =iv_rulePerspective; 
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
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // InternalColdLang.g:798:1: rulePerspective returns [EObject current=null] : (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_languages_3_0= rulePerspectiveLanguage ) )* otherlv_4= '}' ) ;
    public final EObject rulePerspective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_languages_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:804:2: ( (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_languages_3_0= rulePerspectiveLanguage ) )* otherlv_4= '}' ) )
            // InternalColdLang.g:805:2: (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_languages_3_0= rulePerspectiveLanguage ) )* otherlv_4= '}' )
            {
            // InternalColdLang.g:805:2: (otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_languages_3_0= rulePerspectiveLanguage ) )* otherlv_4= '}' )
            // InternalColdLang.g:806:3: otherlv_0= 'perspective' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_languages_3_0= rulePerspectiveLanguage ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0());
            		
            // InternalColdLang.g:810:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalColdLang.g:811:4: (lv_name_1_0= RULE_ID )
            {
            // InternalColdLang.g:811:4: (lv_name_1_0= RULE_ID )
            // InternalColdLang.g:812:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerspectiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalColdLang.g:832:3: ( (lv_languages_3_0= rulePerspectiveLanguage ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalColdLang.g:833:4: (lv_languages_3_0= rulePerspectiveLanguage )
            	    {
            	    // InternalColdLang.g:833:4: (lv_languages_3_0= rulePerspectiveLanguage )
            	    // InternalColdLang.g:834:5: lv_languages_3_0= rulePerspectiveLanguage
            	    {

            	    					newCompositeNode(grammarAccess.getPerspectiveAccess().getLanguagesPerspectiveLanguageParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_languages_3_0=rulePerspectiveLanguage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPerspectiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"languages",
            	    						lv_languages_3_0,
            	    						"fr.mleduc.ColdLang.PerspectiveLanguage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRulePerspectiveLanguage"
    // InternalColdLang.g:859:1: entryRulePerspectiveLanguage returns [EObject current=null] : iv_rulePerspectiveLanguage= rulePerspectiveLanguage EOF ;
    public final EObject entryRulePerspectiveLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerspectiveLanguage = null;


        try {
            // InternalColdLang.g:859:60: (iv_rulePerspectiveLanguage= rulePerspectiveLanguage EOF )
            // InternalColdLang.g:860:2: iv_rulePerspectiveLanguage= rulePerspectiveLanguage EOF
            {
             newCompositeNode(grammarAccess.getPerspectiveLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerspectiveLanguage=rulePerspectiveLanguage();

            state._fsp--;

             current =iv_rulePerspectiveLanguage; 
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
    // $ANTLR end "entryRulePerspectiveLanguage"


    // $ANTLR start "rulePerspectiveLanguage"
    // InternalColdLang.g:866:1: rulePerspectiveLanguage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )? ) ;
    public final EObject rulePerspectiveLanguage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalColdLang.g:872:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )? ) )
            // InternalColdLang.g:873:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )? )
            {
            // InternalColdLang.g:873:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )? )
            // InternalColdLang.g:874:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )?
            {
            // InternalColdLang.g:874:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalColdLang.g:875:4: (lv_name_0_0= RULE_ID )
            {
            // InternalColdLang.g:875:4: (lv_name_0_0= RULE_ID )
            // InternalColdLang.g:876:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPerspectiveLanguageAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPerspectiveLanguageAccess().getColonKeyword_1());
            		
            // InternalColdLang.g:896:3: ( (otherlv_2= RULE_ID ) )
            // InternalColdLang.g:897:4: (otherlv_2= RULE_ID )
            {
            // InternalColdLang.g:897:4: (otherlv_2= RULE_ID )
            // InternalColdLang.g:898:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_2, grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageCrossReference_2_0());
            				

            }


            }

            // InternalColdLang.g:909:3: ( ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalColdLang.g:910:4: ( (otherlv_3= RULE_ID ) ) ( ( ruleIDS ) )
                    {
                    // InternalColdLang.g:910:4: ( (otherlv_3= RULE_ID ) )
                    // InternalColdLang.g:911:5: (otherlv_3= RULE_ID )
                    {
                    // InternalColdLang.g:911:5: (otherlv_3= RULE_ID )
                    // InternalColdLang.g:912:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_3, grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorCrossReference_3_0_0());
                    					

                    }


                    }

                    // InternalColdLang.g:923:4: ( ( ruleIDS ) )
                    // InternalColdLang.g:924:5: ( ruleIDS )
                    {
                    // InternalColdLang.g:924:5: ( ruleIDS )
                    // InternalColdLang.g:925:6: ruleIDS
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerspectiveLanguageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleIDS();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePerspectiveLanguage"


    // $ANTLR start "entryRuleFacet"
    // InternalColdLang.g:944:1: entryRuleFacet returns [EObject current=null] : iv_ruleFacet= ruleFacet EOF ;
    public final EObject entryRuleFacet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacet = null;


        try {
            // InternalColdLang.g:944:46: (iv_ruleFacet= ruleFacet EOF )
            // InternalColdLang.g:945:2: iv_ruleFacet= ruleFacet EOF
            {
             newCompositeNode(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacet=ruleFacet();

            state._fsp--;

             current =iv_ruleFacet; 
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
    // $ANTLR end "entryRuleFacet"


    // $ANTLR start "ruleFacet"
    // InternalColdLang.g:951:1: ruleFacet returns [EObject current=null] : (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'activation' ( (lv_activation_6_0= ruleCondition ) ) ( (lv_compositions_7_0= ruleFacetComposition ) )* otherlv_8= '}' ) ;
    public final EObject ruleFacet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_activation_6_0 = null;

        EObject lv_compositions_7_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:957:2: ( (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'activation' ( (lv_activation_6_0= ruleCondition ) ) ( (lv_compositions_7_0= ruleFacetComposition ) )* otherlv_8= '}' ) )
            // InternalColdLang.g:958:2: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'activation' ( (lv_activation_6_0= ruleCondition ) ) ( (lv_compositions_7_0= ruleFacetComposition ) )* otherlv_8= '}' )
            {
            // InternalColdLang.g:958:2: (otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'activation' ( (lv_activation_6_0= ruleCondition ) ) ( (lv_compositions_7_0= ruleFacetComposition ) )* otherlv_8= '}' )
            // InternalColdLang.g:959:3: otherlv_0= 'facet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'activation' ( (lv_activation_6_0= ruleCondition ) ) ( (lv_compositions_7_0= ruleFacetComposition ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetAccess().getFacetKeyword_0());
            		
            // InternalColdLang.g:963:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalColdLang.g:964:4: (lv_name_1_0= RULE_ID )
            {
            // InternalColdLang.g:964:4: (lv_name_1_0= RULE_ID )
            // InternalColdLang.g:965:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetAccess().getColonKeyword_2());
            		
            // InternalColdLang.g:985:3: ( (otherlv_3= RULE_ID ) )
            // InternalColdLang.g:986:4: (otherlv_3= RULE_ID )
            {
            // InternalColdLang.g:986:4: (otherlv_3= RULE_ID )
            // InternalColdLang.g:987:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetAccess().getPerspectivePerspectiveCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getFacetAccess().getActivationKeyword_5());
            		
            // InternalColdLang.g:1006:3: ( (lv_activation_6_0= ruleCondition ) )
            // InternalColdLang.g:1007:4: (lv_activation_6_0= ruleCondition )
            {
            // InternalColdLang.g:1007:4: (lv_activation_6_0= ruleCondition )
            // InternalColdLang.g:1008:5: lv_activation_6_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getFacetAccess().getActivationConditionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_activation_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetRule());
            					}
            					set(
            						current,
            						"activation",
            						lv_activation_6_0,
            						"fr.mleduc.ColdLang.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalColdLang.g:1025:3: ( (lv_compositions_7_0= ruleFacetComposition ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalColdLang.g:1026:4: (lv_compositions_7_0= ruleFacetComposition )
            	    {
            	    // InternalColdLang.g:1026:4: (lv_compositions_7_0= ruleFacetComposition )
            	    // InternalColdLang.g:1027:5: lv_compositions_7_0= ruleFacetComposition
            	    {

            	    					newCompositeNode(grammarAccess.getFacetAccess().getCompositionsFacetCompositionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_compositions_7_0=ruleFacetComposition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFacetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"compositions",
            	    						lv_compositions_7_0,
            	    						"fr.mleduc.ColdLang.FacetComposition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFacet"


    // $ANTLR start "entryRuleFacetComposition"
    // InternalColdLang.g:1052:1: entryRuleFacetComposition returns [EObject current=null] : iv_ruleFacetComposition= ruleFacetComposition EOF ;
    public final EObject entryRuleFacetComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetComposition = null;


        try {
            // InternalColdLang.g:1052:57: (iv_ruleFacetComposition= ruleFacetComposition EOF )
            // InternalColdLang.g:1053:2: iv_ruleFacetComposition= ruleFacetComposition EOF
            {
             newCompositeNode(grammarAccess.getFacetCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetComposition=ruleFacetComposition();

            state._fsp--;

             current =iv_ruleFacetComposition; 
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
    // $ANTLR end "entryRuleFacetComposition"


    // $ANTLR start "ruleFacetComposition"
    // InternalColdLang.g:1059:1: ruleFacetComposition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_application_2_0= ruleApplication ) ) ) ;
    public final EObject ruleFacetComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_application_2_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1065:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_application_2_0= ruleApplication ) ) ) )
            // InternalColdLang.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_application_2_0= ruleApplication ) ) )
            {
            // InternalColdLang.g:1066:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_application_2_0= ruleApplication ) ) )
            // InternalColdLang.g:1067:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_application_2_0= ruleApplication ) )
            {
            // InternalColdLang.g:1067:3: ( (otherlv_0= RULE_ID ) )
            // InternalColdLang.g:1068:4: (otherlv_0= RULE_ID )
            {
            // InternalColdLang.g:1068:4: (otherlv_0= RULE_ID )
            // InternalColdLang.g:1069:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetCompositionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetCompositionAccess().getColonKeyword_1());
            		
            // InternalColdLang.g:1084:3: ( (lv_application_2_0= ruleApplication ) )
            // InternalColdLang.g:1085:4: (lv_application_2_0= ruleApplication )
            {
            // InternalColdLang.g:1085:4: (lv_application_2_0= ruleApplication )
            // InternalColdLang.g:1086:5: lv_application_2_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getFacetCompositionAccess().getApplicationApplicationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_application_2_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetCompositionRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_2_0,
            						"fr.mleduc.ColdLang.Application");
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
    // $ANTLR end "ruleFacetComposition"


    // $ANTLR start "entryRuleApplication"
    // InternalColdLang.g:1107:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalColdLang.g:1107:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalColdLang.g:1108:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalColdLang.g:1114:1: ruleApplication returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_applications_5_0 = null;

        EObject lv_applications_7_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1120:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' ) ) )
            // InternalColdLang.g:1121:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' ) )
            {
            // InternalColdLang.g:1121:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==28) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==RULE_ID||LA19_1==14||(LA19_1>=29 && LA19_1<=30)) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalColdLang.g:1122:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalColdLang.g:1122:3: ( () ( (otherlv_1= RULE_ID ) ) )
                    // InternalColdLang.g:1123:4: () ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalColdLang.g:1123:4: ()
                    // InternalColdLang.g:1124:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getApplicationAccess().getArtifactRefAction_0_0(),
                    						current);
                    				

                    }

                    // InternalColdLang.g:1130:4: ( (otherlv_1= RULE_ID ) )
                    // InternalColdLang.g:1131:5: (otherlv_1= RULE_ID )
                    {
                    // InternalColdLang.g:1131:5: (otherlv_1= RULE_ID )
                    // InternalColdLang.g:1132:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getArtifactArtifactCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:1145:3: ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' )
                    {
                    // InternalColdLang.g:1145:3: ( () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')' )
                    // InternalColdLang.g:1146:4: () ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_applications_5_0= ruleApplication ) ) (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )* otherlv_8= ')'
                    {
                    // InternalColdLang.g:1146:4: ()
                    // InternalColdLang.g:1147:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getApplicationAccess().getApplicationAction_1_0(),
                    						current);
                    				

                    }

                    // InternalColdLang.g:1153:4: ( (otherlv_3= RULE_ID ) )
                    // InternalColdLang.g:1154:5: (otherlv_3= RULE_ID )
                    {
                    // InternalColdLang.g:1154:5: (otherlv_3= RULE_ID )
                    // InternalColdLang.g:1155:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalColdLang.g:1170:4: ( (lv_applications_5_0= ruleApplication ) )
                    // InternalColdLang.g:1171:5: (lv_applications_5_0= ruleApplication )
                    {
                    // InternalColdLang.g:1171:5: (lv_applications_5_0= ruleApplication )
                    // InternalColdLang.g:1172:6: lv_applications_5_0= ruleApplication
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_applications_5_0=ruleApplication();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"applications",
                    							lv_applications_5_0,
                    							"fr.mleduc.ColdLang.Application");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalColdLang.g:1189:4: (otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==29) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalColdLang.g:1190:5: otherlv_6= ',' ( (lv_applications_7_0= ruleApplication ) )
                    	    {
                    	    otherlv_6=(Token)match(input,29,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalColdLang.g:1194:5: ( (lv_applications_7_0= ruleApplication ) )
                    	    // InternalColdLang.g:1195:6: (lv_applications_7_0= ruleApplication )
                    	    {
                    	    // InternalColdLang.g:1195:6: (lv_applications_7_0= ruleApplication )
                    	    // InternalColdLang.g:1196:7: lv_applications_7_0= ruleApplication
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_applications_7_0=ruleApplication();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"applications",
                    	    								lv_applications_7_0,
                    	    								"fr.mleduc.ColdLang.Application");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleArtifact"
    // InternalColdLang.g:1223:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalColdLang.g:1223:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalColdLang.g:1224:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalColdLang.g:1230:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalColdLang.g:1236:2: ( (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalColdLang.g:1237:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalColdLang.g:1237:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalColdLang.g:1238:3: otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            // InternalColdLang.g:1242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalColdLang.g:1243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalColdLang.g:1243:4: (lv_name_1_0= RULE_ID )
            // InternalColdLang.g:1244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            // InternalColdLang.g:1264:3: ( (otherlv_3= RULE_ID ) )
            // InternalColdLang.g:1265:4: (otherlv_3= RULE_ID )
            {
            // InternalColdLang.g:1265:4: (otherlv_3= RULE_ID )
            // InternalColdLang.g:1266:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLanguageLanguageCrossReference_3_0());
            				

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleCondition"
    // InternalColdLang.g:1281:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalColdLang.g:1281:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalColdLang.g:1282:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalColdLang.g:1288:1: ruleCondition returns [EObject current=null] : this_Equiv_0= ruleEquiv ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Equiv_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1294:2: (this_Equiv_0= ruleEquiv )
            // InternalColdLang.g:1295:2: this_Equiv_0= ruleEquiv
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getEquivParserRuleCall());
            	
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEquiv"
    // InternalColdLang.g:1306:1: entryRuleEquiv returns [EObject current=null] : iv_ruleEquiv= ruleEquiv EOF ;
    public final EObject entryRuleEquiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquiv = null;


        try {
            // InternalColdLang.g:1306:46: (iv_ruleEquiv= ruleEquiv EOF )
            // InternalColdLang.g:1307:2: iv_ruleEquiv= ruleEquiv EOF
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
    // InternalColdLang.g:1313:1: ruleEquiv returns [EObject current=null] : (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) ;
    public final EObject ruleEquiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Imply_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1319:2: ( (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* ) )
            // InternalColdLang.g:1320:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            {
            // InternalColdLang.g:1320:2: (this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )* )
            // InternalColdLang.g:1321:3: this_Imply_0= ruleImply ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquivAccess().getImplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_Imply_0=ruleImply();

            state._fsp--;


            			current = this_Imply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalColdLang.g:1329:3: ( () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalColdLang.g:1330:4: () otherlv_2= '<=>' ( (lv_right_3_0= ruleImply ) )
            	    {
            	    // InternalColdLang.g:1330:4: ()
            	    // InternalColdLang.g:1331:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquivAccess().getEquivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalColdLang.g:1341:4: ( (lv_right_3_0= ruleImply ) )
            	    // InternalColdLang.g:1342:5: (lv_right_3_0= ruleImply )
            	    {
            	    // InternalColdLang.g:1342:5: (lv_right_3_0= ruleImply )
            	    // InternalColdLang.g:1343:6: lv_right_3_0= ruleImply
            	    {

            	    						newCompositeNode(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleImply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ColdLang.Imply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalColdLang.g:1365:1: entryRuleImply returns [EObject current=null] : iv_ruleImply= ruleImply EOF ;
    public final EObject entryRuleImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImply = null;


        try {
            // InternalColdLang.g:1365:46: (iv_ruleImply= ruleImply EOF )
            // InternalColdLang.g:1366:2: iv_ruleImply= ruleImply EOF
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
    // InternalColdLang.g:1372:1: ruleImply returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) ;
    public final EObject ruleImply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Or_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1378:2: ( (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* ) )
            // InternalColdLang.g:1379:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            {
            // InternalColdLang.g:1379:2: (this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )* )
            // InternalColdLang.g:1380:3: this_Or_0= ruleOr ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            {

            			newCompositeNode(grammarAccess.getImplyAccess().getOrParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Or_0=ruleOr();

            state._fsp--;


            			current = this_Or_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalColdLang.g:1388:3: ( () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalColdLang.g:1389:4: () otherlv_2= '=>' ( (lv_right_3_0= ruleOr ) )
            	    {
            	    // InternalColdLang.g:1389:4: ()
            	    // InternalColdLang.g:1390:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getImplyAccess().getImplyLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	    			
            	    // InternalColdLang.g:1400:4: ( (lv_right_3_0= ruleOr ) )
            	    // InternalColdLang.g:1401:5: (lv_right_3_0= ruleOr )
            	    {
            	    // InternalColdLang.g:1401:5: (lv_right_3_0= ruleOr )
            	    // InternalColdLang.g:1402:6: lv_right_3_0= ruleOr
            	    {

            	    						newCompositeNode(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ColdLang.Or");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalColdLang.g:1424:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalColdLang.g:1424:43: (iv_ruleOr= ruleOr EOF )
            // InternalColdLang.g:1425:2: iv_ruleOr= ruleOr EOF
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
    // InternalColdLang.g:1431:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1437:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalColdLang.g:1438:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalColdLang.g:1438:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalColdLang.g:1439:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalColdLang.g:1447:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalColdLang.g:1448:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalColdLang.g:1448:4: ()
            	    // InternalColdLang.g:1449:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalColdLang.g:1459:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalColdLang.g:1460:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalColdLang.g:1460:5: (lv_right_3_0= ruleAnd )
            	    // InternalColdLang.g:1461:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ColdLang.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalColdLang.g:1483:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalColdLang.g:1483:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalColdLang.g:1484:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalColdLang.g:1490:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1496:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalColdLang.g:1497:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalColdLang.g:1497:2: (this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalColdLang.g:1498:3: this_Primary_0= rulePrimary ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalColdLang.g:1506:3: ( () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalColdLang.g:1507:4: () otherlv_2= 'and' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalColdLang.g:1507:4: ()
            	    // InternalColdLang.g:1508:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalColdLang.g:1518:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalColdLang.g:1519:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalColdLang.g:1519:5: (lv_right_3_0= rulePrimary )
            	    // InternalColdLang.g:1520:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"fr.mleduc.ColdLang.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalColdLang.g:1542:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalColdLang.g:1542:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalColdLang.g:1543:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalColdLang.g:1549:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Condition_1 = null;

        EObject lv_next_5_0 = null;



        	enterRule();

        try {
            // InternalColdLang.g:1555:2: ( ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalColdLang.g:1556:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalColdLang.g:1556:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalColdLang.g:1557:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    {
                    // InternalColdLang.g:1557:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    // InternalColdLang.g:1558:4: otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getConditionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                    				current = this_Condition_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:1576:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    {
                    // InternalColdLang.g:1576:3: ( () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) ) )
                    // InternalColdLang.g:1577:4: () otherlv_4= '!' ( (lv_next_5_0= rulePrimary ) )
                    {
                    // InternalColdLang.g:1577:4: ()
                    // InternalColdLang.g:1578:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalColdLang.g:1588:4: ( (lv_next_5_0= rulePrimary ) )
                    // InternalColdLang.g:1589:5: (lv_next_5_0= rulePrimary )
                    {
                    // InternalColdLang.g:1589:5: (lv_next_5_0= rulePrimary )
                    // InternalColdLang.g:1590:6: lv_next_5_0= rulePrimary
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
                    							"fr.mleduc.ColdLang.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalColdLang.g:1609:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalColdLang.g:1609:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalColdLang.g:1610:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalColdLang.g:1610:4: ()
                    // InternalColdLang.g:1611:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVariableAction_2_0(),
                    						current);
                    				

                    }

                    // InternalColdLang.g:1617:4: ( (otherlv_7= RULE_ID ) )
                    // InternalColdLang.g:1618:5: (otherlv_7= RULE_ID )
                    {
                    // InternalColdLang.g:1618:5: (otherlv_7= RULE_ID )
                    // InternalColdLang.g:1619:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getPrimaryAccess().getRefFeatureModelCrossReference_2_1_0());
                    					

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


    // $ANTLR start "entryRuleIDS"
    // InternalColdLang.g:1635:1: entryRuleIDS returns [String current=null] : iv_ruleIDS= ruleIDS EOF ;
    public final String entryRuleIDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDS = null;


        try {
            // InternalColdLang.g:1635:43: (iv_ruleIDS= ruleIDS EOF )
            // InternalColdLang.g:1636:2: iv_ruleIDS= ruleIDS EOF
            {
             newCompositeNode(grammarAccess.getIDSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDS=ruleIDS();

            state._fsp--;

             current =iv_ruleIDS.getText(); 
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
    // $ANTLR end "entryRuleIDS"


    // $ANTLR start "ruleIDS"
    // InternalColdLang.g:1642:1: ruleIDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleIDS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalColdLang.g:1648:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalColdLang.g:1649:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalColdLang.g:1649:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalColdLang.g:1650:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIDSAccess().getIDTerminalRuleCall_0());
            		
            // InternalColdLang.g:1657:3: (kw= '.' this_ID_2= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalColdLang.g:1658:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getIDSAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getIDSAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleIDS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002400802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000008431A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000810000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000810000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});

}