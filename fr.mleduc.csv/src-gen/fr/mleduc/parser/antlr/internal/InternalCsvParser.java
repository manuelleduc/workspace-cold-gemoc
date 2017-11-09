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
import fr.mleduc.services.CsvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_STRING", "RULE_FREE_CELL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_FREE_CELL=6;
    public static final int T__13=13;
    public static final int RULE_NL=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCsvParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCsvParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCsvParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCsv.g"; }



     	private CsvGrammarAccess grammarAccess;

        public InternalCsvParser(TokenStream input, CsvGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CsvGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCsv.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCsv.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCsv.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalCsv.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_lines_0_0= ruleLine ) ) (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )* )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_NL_1=null;
        EObject lv_lines_0_0 = null;

        EObject lv_lines_2_0 = null;



        	enterRule();

        try {
            // InternalCsv.g:77:2: ( ( ( (lv_lines_0_0= ruleLine ) ) (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )* )? )
            // InternalCsv.g:78:2: ( ( (lv_lines_0_0= ruleLine ) ) (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )* )?
            {
            // InternalCsv.g:78:2: ( ( (lv_lines_0_0= ruleLine ) ) (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_FREE_CELL)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCsv.g:79:3: ( (lv_lines_0_0= ruleLine ) ) (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )*
                    {
                    // InternalCsv.g:79:3: ( (lv_lines_0_0= ruleLine ) )
                    // InternalCsv.g:80:4: (lv_lines_0_0= ruleLine )
                    {
                    // InternalCsv.g:80:4: (lv_lines_0_0= ruleLine )
                    // InternalCsv.g:81:5: lv_lines_0_0= ruleLine
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getLinesLineParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_lines_0_0=ruleLine();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"lines",
                    						lv_lines_0_0,
                    						"fr.mleduc.Csv.Line");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    // InternalCsv.g:98:3: (this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_NL) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCsv.g:99:4: this_NL_1= RULE_NL ( (lv_lines_2_0= ruleLine ) )
                    	    {
                    	    this_NL_1=(Token)match(input,RULE_NL,FOLLOW_4); 

                    	    				newLeafNode(this_NL_1, grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0());
                    	    			
                    	    // InternalCsv.g:103:4: ( (lv_lines_2_0= ruleLine ) )
                    	    // InternalCsv.g:104:5: (lv_lines_2_0= ruleLine )
                    	    {
                    	    // InternalCsv.g:104:5: (lv_lines_2_0= ruleLine )
                    	    // InternalCsv.g:105:6: lv_lines_2_0= ruleLine
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getLinesLineParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_lines_2_0=ruleLine();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lines",
                    	    							lv_lines_2_0,
                    	    							"fr.mleduc.Csv.Line");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLine"
    // InternalCsv.g:127:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalCsv.g:127:45: (iv_ruleLine= ruleLine EOF )
            // InternalCsv.g:128:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCsv.g:134:1: ruleLine returns [EObject current=null] : ( ( (lv_cells_0_0= ruleCell ) ) (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )* ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cells_0_0 = null;

        EObject lv_cells_2_0 = null;



        	enterRule();

        try {
            // InternalCsv.g:140:2: ( ( ( (lv_cells_0_0= ruleCell ) ) (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )* ) )
            // InternalCsv.g:141:2: ( ( (lv_cells_0_0= ruleCell ) ) (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )* )
            {
            // InternalCsv.g:141:2: ( ( (lv_cells_0_0= ruleCell ) ) (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )* )
            // InternalCsv.g:142:3: ( (lv_cells_0_0= ruleCell ) ) (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )*
            {
            // InternalCsv.g:142:3: ( (lv_cells_0_0= ruleCell ) )
            // InternalCsv.g:143:4: (lv_cells_0_0= ruleCell )
            {
            // InternalCsv.g:143:4: (lv_cells_0_0= ruleCell )
            // InternalCsv.g:144:5: lv_cells_0_0= ruleCell
            {

            					newCompositeNode(grammarAccess.getLineAccess().getCellsCellParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_cells_0_0=ruleCell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLineRule());
            					}
            					add(
            						current,
            						"cells",
            						lv_cells_0_0,
            						"fr.mleduc.Csv.Cell");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsv.g:161:3: (otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCsv.g:162:4: otherlv_1= ',' ( (lv_cells_2_0= ruleCell ) )?
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLineAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalCsv.g:166:4: ( (lv_cells_2_0= ruleCell ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_FREE_CELL)) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalCsv.g:167:5: (lv_cells_2_0= ruleCell )
            	            {
            	            // InternalCsv.g:167:5: (lv_cells_2_0= ruleCell )
            	            // InternalCsv.g:168:6: lv_cells_2_0= ruleCell
            	            {

            	            						newCompositeNode(grammarAccess.getLineAccess().getCellsCellParserRuleCall_1_1_0());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_cells_2_0=ruleCell();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getLineRule());
            	            						}
            	            						add(
            	            							current,
            	            							"cells",
            	            							lv_cells_2_0,
            	            							"fr.mleduc.Csv.Cell");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleCell"
    // InternalCsv.g:190:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalCsv.g:190:45: (iv_ruleCell= ruleCell EOF )
            // InternalCsv.g:191:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalCsv.g:197:1: ruleCell returns [EObject current=null] : ( ( () ( (lv_content_1_0= RULE_STRING ) ) ) | ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token lv_content_1_0=null;
        Token lv_content_3_0=null;


        	enterRule();

        try {
            // InternalCsv.g:203:2: ( ( ( () ( (lv_content_1_0= RULE_STRING ) ) ) | ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) ) ) )
            // InternalCsv.g:204:2: ( ( () ( (lv_content_1_0= RULE_STRING ) ) ) | ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) ) )
            {
            // InternalCsv.g:204:2: ( ( () ( (lv_content_1_0= RULE_STRING ) ) ) | ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_FREE_CELL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsv.g:205:3: ( () ( (lv_content_1_0= RULE_STRING ) ) )
                    {
                    // InternalCsv.g:205:3: ( () ( (lv_content_1_0= RULE_STRING ) ) )
                    // InternalCsv.g:206:4: () ( (lv_content_1_0= RULE_STRING ) )
                    {
                    // InternalCsv.g:206:4: ()
                    // InternalCsv.g:207:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCellAccess().getStringCellAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCsv.g:213:4: ( (lv_content_1_0= RULE_STRING ) )
                    // InternalCsv.g:214:5: (lv_content_1_0= RULE_STRING )
                    {
                    // InternalCsv.g:214:5: (lv_content_1_0= RULE_STRING )
                    // InternalCsv.g:215:6: lv_content_1_0= RULE_STRING
                    {
                    lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_content_1_0, grammarAccess.getCellAccess().getContentSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCsv.g:233:3: ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) )
                    {
                    // InternalCsv.g:233:3: ( () ( (lv_content_3_0= RULE_FREE_CELL ) ) )
                    // InternalCsv.g:234:4: () ( (lv_content_3_0= RULE_FREE_CELL ) )
                    {
                    // InternalCsv.g:234:4: ()
                    // InternalCsv.g:235:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCellAccess().getFreeCellAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCsv.g:241:4: ( (lv_content_3_0= RULE_FREE_CELL ) )
                    // InternalCsv.g:242:5: (lv_content_3_0= RULE_FREE_CELL )
                    {
                    // InternalCsv.g:242:5: (lv_content_3_0= RULE_FREE_CELL )
                    // InternalCsv.g:243:6: lv_content_3_0= RULE_FREE_CELL
                    {
                    lv_content_3_0=(Token)match(input,RULE_FREE_CELL,FOLLOW_2); 

                    						newLeafNode(lv_content_3_0, grammarAccess.getCellAccess().getContentFREE_CELLTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCellRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"content",
                    							lv_content_3_0,
                    							"fr.mleduc.Csv.FREE_CELL");
                    					

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
    // $ANTLR end "ruleCell"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002062L});

}