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
import fr.mleduc.services.MMLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'concrete'", "'package'", "'abstract'", "'class'", "'extends'", "','", "'<'", "'>'", "'{'", "'}'", "'@'", "':'", "'['", "'..'", "']'", "'0'", "'1'", "'*'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMMLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMMLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMMLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMMLang.g"; }



     	private MMLangGrammarAccess grammarAccess;

        public InternalMMLangParser(TokenStream input, MMLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Metamodel";
       	}

       	@Override
       	protected MMLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMetamodel"
    // InternalMMLang.g:64:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalMMLang.g:64:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalMMLang.g:65:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalMMLang.g:71:1: ruleMetamodel returns [EObject current=null] : ( ( (lv_concrete_0_0= 'concrete' ) )? otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_classes_3_0= ruleClass ) )* ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_concrete_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_classes_3_0 = null;



        	enterRule();

        try {
            // InternalMMLang.g:77:2: ( ( ( (lv_concrete_0_0= 'concrete' ) )? otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_classes_3_0= ruleClass ) )* ) )
            // InternalMMLang.g:78:2: ( ( (lv_concrete_0_0= 'concrete' ) )? otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_classes_3_0= ruleClass ) )* )
            {
            // InternalMMLang.g:78:2: ( ( (lv_concrete_0_0= 'concrete' ) )? otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_classes_3_0= ruleClass ) )* )
            // InternalMMLang.g:79:3: ( (lv_concrete_0_0= 'concrete' ) )? otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) ( (lv_classes_3_0= ruleClass ) )*
            {
            // InternalMMLang.g:79:3: ( (lv_concrete_0_0= 'concrete' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMMLang.g:80:4: (lv_concrete_0_0= 'concrete' )
                    {
                    // InternalMMLang.g:80:4: (lv_concrete_0_0= 'concrete' )
                    // InternalMMLang.g:81:5: lv_concrete_0_0= 'concrete'
                    {
                    lv_concrete_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_concrete_0_0, grammarAccess.getMetamodelAccess().getConcreteConcreteKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMetamodelRule());
                    					}
                    					setWithLastConsumed(current, "concrete", true, "concrete");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMetamodelAccess().getPackageKeyword_1());
            		
            // InternalMMLang.g:97:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMMLang.g:98:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMMLang.g:98:4: (lv_name_2_0= RULE_ID )
            // InternalMMLang.g:99:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetamodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMMLang.g:115:3: ( (lv_classes_3_0= ruleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMMLang.g:116:4: (lv_classes_3_0= ruleClass )
            	    {
            	    // InternalMMLang.g:116:4: (lv_classes_3_0= ruleClass )
            	    // InternalMMLang.g:117:5: lv_classes_3_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getMetamodelAccess().getClassesClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_classes_3_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetamodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_3_0,
            	    						"fr.mleduc.MMLang.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleClass"
    // InternalMMLang.g:138:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalMMLang.g:138:46: (iv_ruleClass= ruleClass EOF )
            // InternalMMLang.g:139:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMMLang.g:145:1: ruleClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )? otherlv_12= '{' ( (lv_fields_13_0= ruleField ) )* otherlv_14= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_generics_8_0 = null;

        EObject lv_generics_10_0 = null;

        EObject lv_fields_13_0 = null;



        	enterRule();

        try {
            // InternalMMLang.g:151:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )? otherlv_12= '{' ( (lv_fields_13_0= ruleField ) )* otherlv_14= '}' ) )
            // InternalMMLang.g:152:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )? otherlv_12= '{' ( (lv_fields_13_0= ruleField ) )* otherlv_14= '}' )
            {
            // InternalMMLang.g:152:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )? otherlv_12= '{' ( (lv_fields_13_0= ruleField ) )* otherlv_14= '}' )
            // InternalMMLang.g:153:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )? otherlv_12= '{' ( (lv_fields_13_0= ruleField ) )* otherlv_14= '}'
            {
            // InternalMMLang.g:153:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMMLang.g:154:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalMMLang.g:154:4: (lv_abstract_0_0= 'abstract' )
                    // InternalMMLang.g:155:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalMMLang.g:171:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMMLang.g:172:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMMLang.g:172:4: (lv_name_2_0= RULE_ID )
            // InternalMMLang.g:173:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMMLang.g:189:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMMLang.g:190:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalMMLang.g:194:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMMLang.g:195:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMMLang.g:195:5: (otherlv_4= RULE_ID )
                    // InternalMMLang.g:196:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_4, grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalMMLang.g:207:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMMLang.g:208:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getClassAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMMLang.g:212:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalMMLang.g:213:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalMMLang.g:213:6: (otherlv_6= RULE_ID )
                    	    // InternalMMLang.g:214:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMMLang.g:227:3: (otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMMLang.g:228:4: otherlv_7= '<' ( (lv_generics_8_0= ruleGeneric ) ) (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )* otherlv_11= '>'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLessThanSignKeyword_4_0());
                    			
                    // InternalMMLang.g:232:4: ( (lv_generics_8_0= ruleGeneric ) )
                    // InternalMMLang.g:233:5: (lv_generics_8_0= ruleGeneric )
                    {
                    // InternalMMLang.g:233:5: (lv_generics_8_0= ruleGeneric )
                    // InternalMMLang.g:234:6: lv_generics_8_0= ruleGeneric
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_generics_8_0=ruleGeneric();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"generics",
                    							lv_generics_8_0,
                    							"fr.mleduc.MMLang.Generic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMMLang.g:251:4: (otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMMLang.g:252:5: otherlv_9= ',' ( (lv_generics_10_0= ruleGeneric ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMMLang.g:256:5: ( (lv_generics_10_0= ruleGeneric ) )
                    	    // InternalMMLang.g:257:6: (lv_generics_10_0= ruleGeneric )
                    	    {
                    	    // InternalMMLang.g:257:6: (lv_generics_10_0= ruleGeneric )
                    	    // InternalMMLang.g:258:7: lv_generics_10_0= ruleGeneric
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_generics_10_0=ruleGeneric();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"generics",
                    	    								lv_generics_10_0,
                    	    								"fr.mleduc.MMLang.Generic");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getGreaterThanSignKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMMLang.g:285:3: ( (lv_fields_13_0= ruleField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMMLang.g:286:4: (lv_fields_13_0= ruleField )
            	    {
            	    // InternalMMLang.g:286:4: (lv_fields_13_0= ruleField )
            	    // InternalMMLang.g:287:5: lv_fields_13_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_fields_13_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_13_0,
            	    						"fr.mleduc.MMLang.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGeneric"
    // InternalMMLang.g:312:1: entryRuleGeneric returns [EObject current=null] : iv_ruleGeneric= ruleGeneric EOF ;
    public final EObject entryRuleGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneric = null;


        try {
            // InternalMMLang.g:312:48: (iv_ruleGeneric= ruleGeneric EOF )
            // InternalMMLang.g:313:2: iv_ruleGeneric= ruleGeneric EOF
            {
             newCompositeNode(grammarAccess.getGenericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneric=ruleGeneric();

            state._fsp--;

             current =iv_ruleGeneric; 
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
    // $ANTLR end "entryRuleGeneric"


    // $ANTLR start "ruleGeneric"
    // InternalMMLang.g:319:1: ruleGeneric returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGeneric() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMMLang.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMMLang.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMMLang.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMMLang.g:327:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMMLang.g:327:3: (lv_name_0_0= RULE_ID )
            // InternalMMLang.g:328:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGenericAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGenericRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleGeneric"


    // $ANTLR start "entryRuleField"
    // InternalMMLang.g:347:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMMLang.g:347:46: (iv_ruleField= ruleField EOF )
            // InternalMMLang.g:348:2: iv_ruleField= ruleField EOF
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
    // InternalMMLang.g:354:1: ruleField returns [EObject current=null] : ( ( (lv_containment_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )? otherlv_9= '[' ( (lv_start_card_10_0= ruleCard ) ) otherlv_11= '..' ( (lv_stop_card_12_0= ruleCard ) ) otherlv_13= ']' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_containment_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_start_card_10_0 = null;

        EObject lv_stop_card_12_0 = null;



        	enterRule();

        try {
            // InternalMMLang.g:360:2: ( ( ( (lv_containment_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )? otherlv_9= '[' ( (lv_start_card_10_0= ruleCard ) ) otherlv_11= '..' ( (lv_stop_card_12_0= ruleCard ) ) otherlv_13= ']' ) )
            // InternalMMLang.g:361:2: ( ( (lv_containment_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )? otherlv_9= '[' ( (lv_start_card_10_0= ruleCard ) ) otherlv_11= '..' ( (lv_stop_card_12_0= ruleCard ) ) otherlv_13= ']' )
            {
            // InternalMMLang.g:361:2: ( ( (lv_containment_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )? otherlv_9= '[' ( (lv_start_card_10_0= ruleCard ) ) otherlv_11= '..' ( (lv_stop_card_12_0= ruleCard ) ) otherlv_13= ']' )
            // InternalMMLang.g:362:3: ( (lv_containment_0_0= '@' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )? otherlv_9= '[' ( (lv_start_card_10_0= ruleCard ) ) otherlv_11= '..' ( (lv_stop_card_12_0= ruleCard ) ) otherlv_13= ']'
            {
            // InternalMMLang.g:362:3: ( (lv_containment_0_0= '@' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMMLang.g:363:4: (lv_containment_0_0= '@' )
                    {
                    // InternalMMLang.g:363:4: (lv_containment_0_0= '@' )
                    // InternalMMLang.g:364:5: lv_containment_0_0= '@'
                    {
                    lv_containment_0_0=(Token)match(input,21,FOLLOW_4); 

                    					newLeafNode(lv_containment_0_0, grammarAccess.getFieldAccess().getContainmentCommercialAtKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "@");
                    				

                    }


                    }
                    break;

            }

            // InternalMMLang.g:376:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMMLang.g:377:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMMLang.g:377:4: (lv_name_1_0= RULE_ID )
            // InternalMMLang.g:378:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
            		
            // InternalMMLang.g:398:3: ( (otherlv_3= RULE_ID ) )
            // InternalMMLang.g:399:4: (otherlv_3= RULE_ID )
            {
            // InternalMMLang.g:399:4: (otherlv_3= RULE_ID )
            // InternalMMLang.g:400:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getTypeReferenceCrossReference_3_0());
            				

            }


            }

            // InternalMMLang.g:411:3: (otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMMLang.g:412:4: otherlv_4= '<' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getLessThanSignKeyword_4_0());
                    			
                    // InternalMMLang.g:416:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMMLang.g:417:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMMLang.g:417:5: (otherlv_5= RULE_ID )
                    // InternalMMLang.g:418:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_5, grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalMMLang.g:429:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMMLang.g:430:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMMLang.g:434:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalMMLang.g:435:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalMMLang.g:435:6: (otherlv_7= RULE_ID )
                    	    // InternalMMLang.g:436:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFieldRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4_3());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalMMLang.g:457:3: ( (lv_start_card_10_0= ruleCard ) )
            // InternalMMLang.g:458:4: (lv_start_card_10_0= ruleCard )
            {
            // InternalMMLang.g:458:4: (lv_start_card_10_0= ruleCard )
            // InternalMMLang.g:459:5: lv_start_card_10_0= ruleCard
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getStart_cardCardParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_start_card_10_0=ruleCard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"start_card",
            						lv_start_card_10_0,
            						"fr.mleduc.MMLang.Card");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getFullStopFullStopKeyword_7());
            		
            // InternalMMLang.g:480:3: ( (lv_stop_card_12_0= ruleCard ) )
            // InternalMMLang.g:481:4: (lv_stop_card_12_0= ruleCard )
            {
            // InternalMMLang.g:481:4: (lv_stop_card_12_0= ruleCard )
            // InternalMMLang.g:482:5: lv_stop_card_12_0= ruleCard
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getStop_cardCardParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_stop_card_12_0=ruleCard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"stop_card",
            						lv_stop_card_12_0,
            						"fr.mleduc.MMLang.Card");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getFieldAccess().getRightSquareBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleCard"
    // InternalMMLang.g:507:1: entryRuleCard returns [EObject current=null] : iv_ruleCard= ruleCard EOF ;
    public final EObject entryRuleCard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCard = null;


        try {
            // InternalMMLang.g:507:45: (iv_ruleCard= ruleCard EOF )
            // InternalMMLang.g:508:2: iv_ruleCard= ruleCard EOF
            {
             newCompositeNode(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCard=ruleCard();

            state._fsp--;

             current =iv_ruleCard; 
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
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalMMLang.g:514:1: ruleCard returns [EObject current=null] : ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) ;
    public final EObject ruleCard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMMLang.g:520:2: ( ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) ) )
            // InternalMMLang.g:521:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            {
            // InternalMMLang.g:521:2: ( ( () otherlv_1= '0' ) | ( () otherlv_3= '1' ) | ( () otherlv_5= '*' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMMLang.g:522:3: ( () otherlv_1= '0' )
                    {
                    // InternalMMLang.g:522:3: ( () otherlv_1= '0' )
                    // InternalMMLang.g:523:4: () otherlv_1= '0'
                    {
                    // InternalMMLang.g:523:4: ()
                    // InternalMMLang.g:524:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardAccess().getCard0Action_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardAccess().getDigitZeroKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMMLang.g:536:3: ( () otherlv_3= '1' )
                    {
                    // InternalMMLang.g:536:3: ( () otherlv_3= '1' )
                    // InternalMMLang.g:537:4: () otherlv_3= '1'
                    {
                    // InternalMMLang.g:537:4: ()
                    // InternalMMLang.g:538:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardAccess().getCard1Action_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCardAccess().getDigitOneKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMMLang.g:550:3: ( () otherlv_5= '*' )
                    {
                    // InternalMMLang.g:550:3: ( () otherlv_5= '*' )
                    // InternalMMLang.g:551:4: () otherlv_5= '*'
                    {
                    // InternalMMLang.g:551:4: ()
                    // InternalMMLang.g:552:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCardAccess().getCardInfAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCardAccess().getAsteriskKeyword_2_1());
                    			

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
    // $ANTLR end "ruleCard"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});

}