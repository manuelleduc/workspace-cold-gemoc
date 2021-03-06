package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expr";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpr"
    // InternalMyDsl.g:64:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMyDsl.g:65:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalMyDsl.g:71:1: ruleExpr returns [EObject current=null] : this_Mult_0= ruleMult ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Mult_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: (this_Mult_0= ruleMult )
            // InternalMyDsl.g:78:2: this_Mult_0= ruleMult
            {

            		newCompositeNode(grammarAccess.getExprAccess().getMultParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Mult_0=ruleMult();

            state._fsp--;


            		current = this_Mult_0;
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


    // $ANTLR start "entryRuleMult"
    // InternalMyDsl.g:89:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalMyDsl.g:89:45: (iv_ruleMult= ruleMult EOF )
            // InternalMyDsl.g:90:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalMyDsl.g:96:1: ruleMult returns [EObject current=null] : (this_Cst_0= ruleCst ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )* ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Cst_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:102:2: ( (this_Cst_0= ruleCst ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )* ) )
            // InternalMyDsl.g:103:2: (this_Cst_0= ruleCst ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )* )
            {
            // InternalMyDsl.g:103:2: (this_Cst_0= ruleCst ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )* )
            // InternalMyDsl.g:104:3: this_Cst_0= ruleCst ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultAccess().getCstParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Cst_0=ruleCst();

            state._fsp--;


            			current = this_Cst_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:112:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:113:4: () otherlv_2= '*' ( (lv_right_3_0= ruleMult ) )
            	    {
            	    // InternalMyDsl.g:113:4: ()
            	    // InternalMyDsl.g:114:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultAccess().getMultLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:124:4: ( (lv_right_3_0= ruleMult ) )
            	    // InternalMyDsl.g:125:5: (lv_right_3_0= ruleMult )
            	    {
            	    // InternalMyDsl.g:125:5: (lv_right_3_0= ruleMult )
            	    // InternalMyDsl.g:126:6: lv_right_3_0= ruleMult
            	    {

            	    						newCompositeNode(grammarAccess.getMultAccess().getRightMultParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_right_3_0=ruleMult();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Mult");
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
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleCst"
    // InternalMyDsl.g:148:1: entryRuleCst returns [EObject current=null] : iv_ruleCst= ruleCst EOF ;
    public final EObject entryRuleCst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCst = null;


        try {
            // InternalMyDsl.g:148:44: (iv_ruleCst= ruleCst EOF )
            // InternalMyDsl.g:149:2: iv_ruleCst= ruleCst EOF
            {
             newCompositeNode(grammarAccess.getCstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCst=ruleCst();

            state._fsp--;

             current =iv_ruleCst; 
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
    // $ANTLR end "entryRuleCst"


    // $ANTLR start "ruleCst"
    // InternalMyDsl.g:155:1: ruleCst returns [EObject current=null] : ( () ( (lv_value_1_0= ruleELong ) ) ) ;
    public final EObject ruleCst() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:161:2: ( ( () ( (lv_value_1_0= ruleELong ) ) ) )
            // InternalMyDsl.g:162:2: ( () ( (lv_value_1_0= ruleELong ) ) )
            {
            // InternalMyDsl.g:162:2: ( () ( (lv_value_1_0= ruleELong ) ) )
            // InternalMyDsl.g:163:3: () ( (lv_value_1_0= ruleELong ) )
            {
            // InternalMyDsl.g:163:3: ()
            // InternalMyDsl.g:164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCstAccess().getCstAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:170:3: ( (lv_value_1_0= ruleELong ) )
            // InternalMyDsl.g:171:4: (lv_value_1_0= ruleELong )
            {
            // InternalMyDsl.g:171:4: (lv_value_1_0= ruleELong )
            // InternalMyDsl.g:172:5: lv_value_1_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getCstAccess().getValueELongParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCstRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.ELong");
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
    // $ANTLR end "ruleCst"


    // $ANTLR start "entryRuleELong"
    // InternalMyDsl.g:193:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalMyDsl.g:193:45: (iv_ruleELong= ruleELong EOF )
            // InternalMyDsl.g:194:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalMyDsl.g:200:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:206:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:207:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:207:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:208:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:208:3: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:209:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELong"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}