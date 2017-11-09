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
import fr.mleduc.services.MLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'model'", "'metamodel'", "'instance'", "':'", "'{'", "'}'", "'='", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalMLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMLang.g"; }



     	private MLangGrammarAccess grammarAccess;

        public InternalMLangParser(TokenStream input, MLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMLang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMLang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMLang.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMLang.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (otherlv_3= RULE_ID ) ) ( (lv_instances_4_0= ruleInstance ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_instances_4_0 = null;



        	enterRule();

        try {
            // InternalMLang.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (otherlv_3= RULE_ID ) ) ( (lv_instances_4_0= ruleInstance ) )* ) )
            // InternalMLang.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (otherlv_3= RULE_ID ) ) ( (lv_instances_4_0= ruleInstance ) )* )
            {
            // InternalMLang.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (otherlv_3= RULE_ID ) ) ( (lv_instances_4_0= ruleInstance ) )* )
            // InternalMLang.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (otherlv_3= RULE_ID ) ) ( (lv_instances_4_0= ruleInstance ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalMLang.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLang.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLang.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMLang.g:85:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getMetamodelKeyword_2());
            		
            // InternalMLang.g:105:3: ( (otherlv_3= RULE_ID ) )
            // InternalMLang.g:106:4: (otherlv_3= RULE_ID )
            {
            // InternalMLang.g:106:4: (otherlv_3= RULE_ID )
            // InternalMLang.g:107:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getMetamodelMetamodelCrossReference_3_0());
            				

            }


            }

            // InternalMLang.g:118:3: ( (lv_instances_4_0= ruleInstance ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMLang.g:119:4: (lv_instances_4_0= ruleInstance )
            	    {
            	    // InternalMLang.g:119:4: (lv_instances_4_0= ruleInstance )
            	    // InternalMLang.g:120:5: lv_instances_4_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_instances_4_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instances",
            	    						lv_instances_4_0,
            	    						"fr.mleduc.MLang.Instance");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstance"
    // InternalMLang.g:141:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalMLang.g:141:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalMLang.g:142:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalMLang.g:148:1: ruleInstance returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;



        	enterRule();

        try {
            // InternalMLang.g:154:2: ( (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // InternalMLang.g:155:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // InternalMLang.g:155:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // InternalMLang.g:156:3: otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
            		
            // InternalMLang.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLang.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLang.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalMLang.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
            		
            // InternalMLang.g:182:3: ( (otherlv_3= RULE_ID ) )
            // InternalMLang.g:183:4: (otherlv_3= RULE_ID )
            {
            // InternalMLang.g:183:4: (otherlv_3= RULE_ID )
            // InternalMLang.g:184:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getTypeClassCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMLang.g:199:3: ( (lv_fields_5_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMLang.g:200:4: (lv_fields_5_0= ruleField )
            	    {
            	    // InternalMLang.g:200:4: (lv_fields_5_0= ruleField )
            	    // InternalMLang.g:201:5: lv_fields_5_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getInstanceAccess().getFieldsFieldParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInstanceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_5_0,
            	    						"fr.mleduc.MLang.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleField"
    // InternalMLang.g:226:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMLang.g:226:46: (iv_ruleField= ruleField EOF )
            // InternalMLang.g:227:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMLang.g:233:1: ruleField returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMLang.g:239:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMLang.g:240:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMLang.g:240:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalMLang.g:241:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMLang.g:241:3: ( (otherlv_0= RULE_ID ) )
            // InternalMLang.g:242:4: (otherlv_0= RULE_ID )
            {
            // InternalMLang.g:242:4: (otherlv_0= RULE_ID )
            // InternalMLang.g:243:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getKeyFieldCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEqualsSignKeyword_1());
            		
            // InternalMLang.g:258:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMLang.g:259:4: (lv_value_2_0= ruleValue )
            {
            // InternalMLang.g:259:4: (lv_value_2_0= ruleValue )
            // InternalMLang.g:260:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"fr.mleduc.MLang.Value");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleValue"
    // InternalMLang.g:281:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMLang.g:281:46: (iv_ruleValue= ruleValue EOF )
            // InternalMLang.g:282:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMLang.g:288:1: ruleValue returns [EObject current=null] : ( ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) ) | ( () ( (lv_val_3_0= RULE_STRING ) ) ) | ( () ( (lv_val_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' ) | ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_3_0=null;
        Token lv_val_5_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_vals_10_0 = null;

        EObject lv_vals_14_0 = null;



        	enterRule();

        try {
            // InternalMLang.g:294:2: ( ( ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) ) | ( () ( (lv_val_3_0= RULE_STRING ) ) ) | ( () ( (lv_val_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' ) | ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' ) ) )
            // InternalMLang.g:295:2: ( ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) ) | ( () ( (lv_val_3_0= RULE_STRING ) ) ) | ( () ( (lv_val_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' ) | ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' ) )
            {
            // InternalMLang.g:295:2: ( ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) ) | ( () ( (lv_val_3_0= RULE_STRING ) ) ) | ( () ( (lv_val_5_0= RULE_INT ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) | ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' ) | ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 15:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMLang.g:296:3: ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) )
                    {
                    // InternalMLang.g:296:3: ( () ( (lv_val_1_0= RULE_ANY_OTHER ) ) )
                    // InternalMLang.g:297:4: () ( (lv_val_1_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMLang.g:297:4: ()
                    // InternalMLang.g:298:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getFreeValAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMLang.g:304:4: ( (lv_val_1_0= RULE_ANY_OTHER ) )
                    // InternalMLang.g:305:5: (lv_val_1_0= RULE_ANY_OTHER )
                    {
                    // InternalMLang.g:305:5: (lv_val_1_0= RULE_ANY_OTHER )
                    // InternalMLang.g:306:6: lv_val_1_0= RULE_ANY_OTHER
                    {
                    lv_val_1_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    						newLeafNode(lv_val_1_0, grammarAccess.getValueAccess().getValANY_OTHERTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_1_0,
                    							"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMLang.g:324:3: ( () ( (lv_val_3_0= RULE_STRING ) ) )
                    {
                    // InternalMLang.g:324:3: ( () ( (lv_val_3_0= RULE_STRING ) ) )
                    // InternalMLang.g:325:4: () ( (lv_val_3_0= RULE_STRING ) )
                    {
                    // InternalMLang.g:325:4: ()
                    // InternalMLang.g:326:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getStringValAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMLang.g:332:4: ( (lv_val_3_0= RULE_STRING ) )
                    // InternalMLang.g:333:5: (lv_val_3_0= RULE_STRING )
                    {
                    // InternalMLang.g:333:5: (lv_val_3_0= RULE_STRING )
                    // InternalMLang.g:334:6: lv_val_3_0= RULE_STRING
                    {
                    lv_val_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getValueAccess().getValSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMLang.g:352:3: ( () ( (lv_val_5_0= RULE_INT ) ) )
                    {
                    // InternalMLang.g:352:3: ( () ( (lv_val_5_0= RULE_INT ) ) )
                    // InternalMLang.g:353:4: () ( (lv_val_5_0= RULE_INT ) )
                    {
                    // InternalMLang.g:353:4: ()
                    // InternalMLang.g:354:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getIntValAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMLang.g:360:4: ( (lv_val_5_0= RULE_INT ) )
                    // InternalMLang.g:361:5: (lv_val_5_0= RULE_INT )
                    {
                    // InternalMLang.g:361:5: (lv_val_5_0= RULE_INT )
                    // InternalMLang.g:362:6: lv_val_5_0= RULE_INT
                    {
                    lv_val_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_val_5_0, grammarAccess.getValueAccess().getValINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMLang.g:380:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalMLang.g:380:3: ( () ( (otherlv_7= RULE_ID ) ) )
                    // InternalMLang.g:381:4: () ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalMLang.g:381:4: ()
                    // InternalMLang.g:382:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getInstanceValAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMLang.g:388:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMLang.g:389:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMLang.g:389:5: (otherlv_7= RULE_ID )
                    // InternalMLang.g:390:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getValueRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getValueAccess().getRefInstanceCrossReference_3_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMLang.g:403:3: ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' )
                    {
                    // InternalMLang.g:403:3: ( () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']' )
                    // InternalMLang.g:404:4: () otherlv_9= '[' ( (lv_vals_10_0= ruleValue ) )* otherlv_11= ']'
                    {
                    // InternalMLang.g:404:4: ()
                    // InternalMLang.g:405:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getListValAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getValueAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalMLang.g:415:4: ( (lv_vals_10_0= ruleValue ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==15||LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMLang.g:416:5: (lv_vals_10_0= ruleValue )
                    	    {
                    	    // InternalMLang.g:416:5: (lv_vals_10_0= ruleValue )
                    	    // InternalMLang.g:417:6: lv_vals_10_0= ruleValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getValueAccess().getValsValueParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_vals_10_0=ruleValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vals",
                    	    							lv_vals_10_0,
                    	    							"fr.mleduc.MLang.Value");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getValueAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMLang.g:440:3: ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' )
                    {
                    // InternalMLang.g:440:3: ( () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}' )
                    // InternalMLang.g:441:4: () otherlv_13= '{' ( (lv_vals_14_0= ruleValue ) )* otherlv_15= '}'
                    {
                    // InternalMLang.g:441:4: ()
                    // InternalMLang.g:442:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getValueAccess().getSetValAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMLang.g:452:4: ( (lv_vals_14_0= ruleValue ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==15||LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMLang.g:453:5: (lv_vals_14_0= ruleValue )
                    	    {
                    	    // InternalMLang.g:453:5: (lv_vals_14_0= ruleValue )
                    	    // InternalMLang.g:454:6: lv_vals_14_0= ruleValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getValueAccess().getValsValueParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_vals_14_0=ruleValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vals",
                    	    							lv_vals_14_0,
                    	    							"fr.mleduc.MLang.Value");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000480F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C80F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000580F0L});

}