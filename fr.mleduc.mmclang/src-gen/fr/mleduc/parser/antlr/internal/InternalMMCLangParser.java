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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMCLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'merge'", "'renaming'", "'slice'", "'on'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMMCLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMMCLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMMCLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMMCLang.g"; }



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




    // $ANTLR start "entryRuleComposition"
    // InternalMMCLang.g:64:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalMMCLang.g:64:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalMMCLang.g:65:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalMMCLang.g:71:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operations_2_0= ruleOperation ) )* ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_operations_2_0 = null;



        	enterRule();

        try {
            // InternalMMCLang.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operations_2_0= ruleOperation ) )* ) )
            // InternalMMCLang.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operations_2_0= ruleOperation ) )* )
            {
            // InternalMMCLang.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operations_2_0= ruleOperation ) )* )
            // InternalMMCLang.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operations_2_0= ruleOperation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getPackageKeyword_0());
            		
            // InternalMMCLang.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMMCLang.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMMCLang.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMMCLang.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            // InternalMMCLang.g:101:3: ( (lv_operations_2_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMMCLang.g:102:4: (lv_operations_2_0= ruleOperation )
            	    {
            	    // InternalMMCLang.g:102:4: (lv_operations_2_0= ruleOperation )
            	    // InternalMMCLang.g:103:5: lv_operations_2_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getCompositionAccess().getOperationsOperationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_operations_2_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompositionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_2_0,
            	    						"fr.mleduc.MMCLang.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleOperation"
    // InternalMMCLang.g:124:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMMCLang.g:124:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMMCLang.g:125:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalMMCLang.g:131:1: ruleOperation returns [EObject current=null] : ( ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? ) | ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_pairs_4_0 = null;



        	enterRule();

        try {
            // InternalMMCLang.g:137:2: ( ( ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? ) | ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* ) ) )
            // InternalMMCLang.g:138:2: ( ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? ) | ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* ) )
            {
            // InternalMMCLang.g:138:2: ( ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? ) | ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMMCLang.g:139:3: ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? )
                    {
                    // InternalMMCLang.g:139:3: ( () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )? )
                    // InternalMMCLang.g:140:4: () otherlv_1= 'merge' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )?
                    {
                    // InternalMMCLang.g:140:4: ()
                    // InternalMMCLang.g:141:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperationAccess().getMergeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getMergeKeyword_0_1());
                    			
                    // InternalMMCLang.g:151:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMMCLang.g:152:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMMCLang.g:152:5: (otherlv_2= RULE_ID )
                    // InternalMMCLang.g:153:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_0_2_0());
                    					

                    }


                    }

                    // InternalMMCLang.g:164:4: (otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==13) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMMCLang.g:165:5: otherlv_3= 'renaming' ( (lv_pairs_4_0= rulePair ) )
                            {
                            otherlv_3=(Token)match(input,13,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getRenamingKeyword_0_3_0());
                            				
                            // InternalMMCLang.g:169:5: ( (lv_pairs_4_0= rulePair ) )
                            // InternalMMCLang.g:170:6: (lv_pairs_4_0= rulePair )
                            {
                            // InternalMMCLang.g:170:6: (lv_pairs_4_0= rulePair )
                            // InternalMMCLang.g:171:7: lv_pairs_4_0= rulePair
                            {

                            							newCompositeNode(grammarAccess.getOperationAccess().getPairsPairParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_pairs_4_0=rulePair();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getOperationRule());
                            							}
                            							add(
                            								current,
                            								"pairs",
                            								lv_pairs_4_0,
                            								"fr.mleduc.MMCLang.Pair");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMMCLang.g:191:3: ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* )
                    {
                    // InternalMMCLang.g:191:3: ( () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )* )
                    // InternalMMCLang.g:192:4: () otherlv_6= 'slice' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'on' ( (otherlv_9= RULE_ID ) )*
                    {
                    // InternalMMCLang.g:192:4: ()
                    // InternalMMCLang.g:193:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOperationAccess().getSliceAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getSliceKeyword_1_1());
                    			
                    // InternalMMCLang.g:203:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMMCLang.g:204:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMMCLang.g:204:5: (otherlv_7= RULE_ID )
                    // InternalMMCLang.g:205:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_1_2_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getOnKeyword_1_3());
                    			
                    // InternalMMCLang.g:220:4: ( (otherlv_9= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMMCLang.g:221:5: (otherlv_9= RULE_ID )
                    	    {
                    	    // InternalMMCLang.g:221:5: (otherlv_9= RULE_ID )
                    	    // InternalMMCLang.g:222:6: otherlv_9= RULE_ID
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getOperationRule());
                    	    						}
                    	    					
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getTargetsClassCrossReference_1_4_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRulePair"
    // InternalMMCLang.g:238:1: entryRulePair returns [EObject current=null] : iv_rulePair= rulePair EOF ;
    public final EObject entryRulePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePair = null;


        try {
            // InternalMMCLang.g:238:45: (iv_rulePair= rulePair EOF )
            // InternalMMCLang.g:239:2: iv_rulePair= rulePair EOF
            {
             newCompositeNode(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePair=rulePair();

            state._fsp--;

             current =iv_rulePair; 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalMMCLang.g:245:1: rulePair returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMMCLang.g:251:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMMCLang.g:252:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMMCLang.g:252:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMMCLang.g:253:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalMMCLang.g:253:3: ( (otherlv_0= RULE_ID ) )
            // InternalMMCLang.g:254:4: (otherlv_0= RULE_ID )
            {
            // InternalMMCLang.g:254:4: (otherlv_0= RULE_ID )
            // InternalMMCLang.g:255:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getPairAccess().getFromClassCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPairAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalMMCLang.g:270:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMMCLang.g:271:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMMCLang.g:271:4: (lv_name_2_0= RULE_ID )
            // InternalMMCLang.g:272:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPairAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "rulePair"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}