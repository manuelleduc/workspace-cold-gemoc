package varadd.cs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import varadd.cs.services.VarAddLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVarAddLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalVarAddLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVarAddLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVarAddLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVarAddLang.g"; }



     	private VarAddLangGrammarAccess grammarAccess;

        public InternalVarAddLangParser(TokenStream input, VarAddLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expr";
       	}

       	@Override
       	protected VarAddLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpr"
    // InternalVarAddLang.g:64:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalVarAddLang.g:64:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalVarAddLang.g:65:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalVarAddLang.g:71:1: ruleExpr returns [EObject current=null] : this_Add_0= ruleAdd ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;



        	enterRule();

        try {
            // InternalVarAddLang.g:77:2: (this_Add_0= ruleAdd )
            // InternalVarAddLang.g:78:2: this_Add_0= ruleAdd
            {

            		newCompositeNode(grammarAccess.getExprAccess().getAddParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Add_0=ruleAdd();

            state._fsp--;


            		current = this_Add_0;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAdd"
    // InternalVarAddLang.g:89:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalVarAddLang.g:89:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalVarAddLang.g:90:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalVarAddLang.g:96:1: ruleAdd returns [EObject current=null] : (this_Variable_0= ruleVariable ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )* ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVarAddLang.g:102:2: ( (this_Variable_0= ruleVariable ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )* ) )
            // InternalVarAddLang.g:103:2: (this_Variable_0= ruleVariable ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )* )
            {
            // InternalVarAddLang.g:103:2: (this_Variable_0= ruleVariable ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )* )
            // InternalVarAddLang.g:104:3: this_Variable_0= ruleVariable ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddAccess().getVariableParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Variable_0=ruleVariable();

            state._fsp--;


            			current = this_Variable_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalVarAddLang.g:112:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVarAddLang.g:113:4: () otherlv_2= '+' ( (lv_right_3_0= ruleAdd ) )
            	    {
            	    // InternalVarAddLang.g:113:4: ()
            	    // InternalVarAddLang.g:114:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddAccess().getAddLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalVarAddLang.g:124:4: ( (lv_right_3_0= ruleAdd ) )
            	    // InternalVarAddLang.g:125:5: (lv_right_3_0= ruleAdd )
            	    {
            	    // InternalVarAddLang.g:125:5: (lv_right_3_0= ruleAdd )
            	    // InternalVarAddLang.g:126:6: lv_right_3_0= ruleAdd
            	    {

            	    						newCompositeNode(grammarAccess.getAddAccess().getRightAddParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_right_3_0=ruleAdd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"varadd.cs.VarAddLang.Add");
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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleVariable"
    // InternalVarAddLang.g:148:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVarAddLang.g:148:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVarAddLang.g:149:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVarAddLang.g:155:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalVarAddLang.g:161:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalVarAddLang.g:162:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalVarAddLang.g:162:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalVarAddLang.g:163:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalVarAddLang.g:163:3: ()
            // InternalVarAddLang.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalVarAddLang.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVarAddLang.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVarAddLang.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalVarAddLang.g:172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});

}