package fr.mleduc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.mleduc.services.MLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLangParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMLang.g:54:1: ( ruleModel EOF )
            // InternalMLang.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLang.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMLang.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMLang.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMLang.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMLang.g:69:3: ( rule__Model__Group__0 )
            // InternalMLang.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstance"
    // InternalMLang.g:78:1: entryRuleInstance : ruleInstance EOF ;
    public final void entryRuleInstance() throws RecognitionException {
        try {
            // InternalMLang.g:79:1: ( ruleInstance EOF )
            // InternalMLang.g:80:1: ruleInstance EOF
            {
             before(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalMLang.g:87:1: ruleInstance : ( ( rule__Instance__Group__0 ) ) ;
    public final void ruleInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:91:2: ( ( ( rule__Instance__Group__0 ) ) )
            // InternalMLang.g:92:2: ( ( rule__Instance__Group__0 ) )
            {
            // InternalMLang.g:92:2: ( ( rule__Instance__Group__0 ) )
            // InternalMLang.g:93:3: ( rule__Instance__Group__0 )
            {
             before(grammarAccess.getInstanceAccess().getGroup()); 
            // InternalMLang.g:94:3: ( rule__Instance__Group__0 )
            // InternalMLang.g:94:4: rule__Instance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleField"
    // InternalMLang.g:103:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMLang.g:104:1: ( ruleField EOF )
            // InternalMLang.g:105:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMLang.g:112:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:116:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMLang.g:117:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMLang.g:117:2: ( ( rule__Field__Group__0 ) )
            // InternalMLang.g:118:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalMLang.g:119:3: ( rule__Field__Group__0 )
            // InternalMLang.g:119:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleValue"
    // InternalMLang.g:128:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMLang.g:129:1: ( ruleValue EOF )
            // InternalMLang.g:130:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMLang.g:137:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:141:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMLang.g:142:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMLang.g:142:2: ( ( rule__Value__Alternatives ) )
            // InternalMLang.g:143:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMLang.g:144:3: ( rule__Value__Alternatives )
            // InternalMLang.g:144:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMLang.g:152:1: rule__Value__Alternatives : ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__Group_1__0 ) ) | ( ( rule__Value__Group_2__0 ) ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:156:1: ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__Group_1__0 ) ) | ( ( rule__Value__Group_2__0 ) ) | ( ( rule__Value__Group_3__0 ) ) | ( ( rule__Value__Group_4__0 ) ) | ( ( rule__Value__Group_5__0 ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            case 18:
                {
                alt1=5;
                }
                break;
            case 15:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMLang.g:157:2: ( ( rule__Value__Group_0__0 ) )
                    {
                    // InternalMLang.g:157:2: ( ( rule__Value__Group_0__0 ) )
                    // InternalMLang.g:158:3: ( rule__Value__Group_0__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_0()); 
                    // InternalMLang.g:159:3: ( rule__Value__Group_0__0 )
                    // InternalMLang.g:159:4: rule__Value__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMLang.g:163:2: ( ( rule__Value__Group_1__0 ) )
                    {
                    // InternalMLang.g:163:2: ( ( rule__Value__Group_1__0 ) )
                    // InternalMLang.g:164:3: ( rule__Value__Group_1__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_1()); 
                    // InternalMLang.g:165:3: ( rule__Value__Group_1__0 )
                    // InternalMLang.g:165:4: rule__Value__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMLang.g:169:2: ( ( rule__Value__Group_2__0 ) )
                    {
                    // InternalMLang.g:169:2: ( ( rule__Value__Group_2__0 ) )
                    // InternalMLang.g:170:3: ( rule__Value__Group_2__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_2()); 
                    // InternalMLang.g:171:3: ( rule__Value__Group_2__0 )
                    // InternalMLang.g:171:4: rule__Value__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMLang.g:175:2: ( ( rule__Value__Group_3__0 ) )
                    {
                    // InternalMLang.g:175:2: ( ( rule__Value__Group_3__0 ) )
                    // InternalMLang.g:176:3: ( rule__Value__Group_3__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_3()); 
                    // InternalMLang.g:177:3: ( rule__Value__Group_3__0 )
                    // InternalMLang.g:177:4: rule__Value__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMLang.g:181:2: ( ( rule__Value__Group_4__0 ) )
                    {
                    // InternalMLang.g:181:2: ( ( rule__Value__Group_4__0 ) )
                    // InternalMLang.g:182:3: ( rule__Value__Group_4__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_4()); 
                    // InternalMLang.g:183:3: ( rule__Value__Group_4__0 )
                    // InternalMLang.g:183:4: rule__Value__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMLang.g:187:2: ( ( rule__Value__Group_5__0 ) )
                    {
                    // InternalMLang.g:187:2: ( ( rule__Value__Group_5__0 ) )
                    // InternalMLang.g:188:3: ( rule__Value__Group_5__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_5()); 
                    // InternalMLang.g:189:3: ( rule__Value__Group_5__0 )
                    // InternalMLang.g:189:4: rule__Value__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMLang.g:197:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:201:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMLang.g:202:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMLang.g:209:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:213:1: ( ( 'model' ) )
            // InternalMLang.g:214:1: ( 'model' )
            {
            // InternalMLang.g:214:1: ( 'model' )
            // InternalMLang.g:215:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMLang.g:224:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:228:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMLang.g:229:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMLang.g:236:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:240:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalMLang.g:241:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalMLang.g:241:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalMLang.g:242:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalMLang.g:243:2: ( rule__Model__NameAssignment_1 )
            // InternalMLang.g:243:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMLang.g:251:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:255:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMLang.g:256:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMLang.g:263:1: rule__Model__Group__2__Impl : ( 'metamodel' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:267:1: ( ( 'metamodel' ) )
            // InternalMLang.g:268:1: ( 'metamodel' )
            {
            // InternalMLang.g:268:1: ( 'metamodel' )
            // InternalMLang.g:269:2: 'metamodel'
            {
             before(grammarAccess.getModelAccess().getMetamodelKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getMetamodelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMLang.g:278:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:282:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMLang.g:283:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMLang.g:290:1: rule__Model__Group__3__Impl : ( ( rule__Model__MetamodelAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:294:1: ( ( ( rule__Model__MetamodelAssignment_3 ) ) )
            // InternalMLang.g:295:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            {
            // InternalMLang.g:295:1: ( ( rule__Model__MetamodelAssignment_3 ) )
            // InternalMLang.g:296:2: ( rule__Model__MetamodelAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 
            // InternalMLang.g:297:2: ( rule__Model__MetamodelAssignment_3 )
            // InternalMLang.g:297:3: rule__Model__MetamodelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__MetamodelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMetamodelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMLang.g:305:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:309:1: ( rule__Model__Group__4__Impl )
            // InternalMLang.g:310:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMLang.g:316:1: rule__Model__Group__4__Impl : ( ( rule__Model__InstancesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:320:1: ( ( ( rule__Model__InstancesAssignment_4 )* ) )
            // InternalMLang.g:321:1: ( ( rule__Model__InstancesAssignment_4 )* )
            {
            // InternalMLang.g:321:1: ( ( rule__Model__InstancesAssignment_4 )* )
            // InternalMLang.g:322:2: ( rule__Model__InstancesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getInstancesAssignment_4()); 
            // InternalMLang.g:323:2: ( rule__Model__InstancesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMLang.g:323:3: rule__Model__InstancesAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__InstancesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInstancesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Instance__Group__0"
    // InternalMLang.g:332:1: rule__Instance__Group__0 : rule__Instance__Group__0__Impl rule__Instance__Group__1 ;
    public final void rule__Instance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:336:1: ( rule__Instance__Group__0__Impl rule__Instance__Group__1 )
            // InternalMLang.g:337:2: rule__Instance__Group__0__Impl rule__Instance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0"


    // $ANTLR start "rule__Instance__Group__0__Impl"
    // InternalMLang.g:344:1: rule__Instance__Group__0__Impl : ( 'instance' ) ;
    public final void rule__Instance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:348:1: ( ( 'instance' ) )
            // InternalMLang.g:349:1: ( 'instance' )
            {
            // InternalMLang.g:349:1: ( 'instance' )
            // InternalMLang.g:350:2: 'instance'
            {
             before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__0__Impl"


    // $ANTLR start "rule__Instance__Group__1"
    // InternalMLang.g:359:1: rule__Instance__Group__1 : rule__Instance__Group__1__Impl rule__Instance__Group__2 ;
    public final void rule__Instance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:363:1: ( rule__Instance__Group__1__Impl rule__Instance__Group__2 )
            // InternalMLang.g:364:2: rule__Instance__Group__1__Impl rule__Instance__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Instance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1"


    // $ANTLR start "rule__Instance__Group__1__Impl"
    // InternalMLang.g:371:1: rule__Instance__Group__1__Impl : ( ( rule__Instance__NameAssignment_1 ) ) ;
    public final void rule__Instance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:375:1: ( ( ( rule__Instance__NameAssignment_1 ) ) )
            // InternalMLang.g:376:1: ( ( rule__Instance__NameAssignment_1 ) )
            {
            // InternalMLang.g:376:1: ( ( rule__Instance__NameAssignment_1 ) )
            // InternalMLang.g:377:2: ( rule__Instance__NameAssignment_1 )
            {
             before(grammarAccess.getInstanceAccess().getNameAssignment_1()); 
            // InternalMLang.g:378:2: ( rule__Instance__NameAssignment_1 )
            // InternalMLang.g:378:3: rule__Instance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__1__Impl"


    // $ANTLR start "rule__Instance__Group__2"
    // InternalMLang.g:386:1: rule__Instance__Group__2 : rule__Instance__Group__2__Impl rule__Instance__Group__3 ;
    public final void rule__Instance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:390:1: ( rule__Instance__Group__2__Impl rule__Instance__Group__3 )
            // InternalMLang.g:391:2: rule__Instance__Group__2__Impl rule__Instance__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Instance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2"


    // $ANTLR start "rule__Instance__Group__2__Impl"
    // InternalMLang.g:398:1: rule__Instance__Group__2__Impl : ( ':' ) ;
    public final void rule__Instance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:402:1: ( ( ':' ) )
            // InternalMLang.g:403:1: ( ':' )
            {
            // InternalMLang.g:403:1: ( ':' )
            // InternalMLang.g:404:2: ':'
            {
             before(grammarAccess.getInstanceAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__2__Impl"


    // $ANTLR start "rule__Instance__Group__3"
    // InternalMLang.g:413:1: rule__Instance__Group__3 : rule__Instance__Group__3__Impl rule__Instance__Group__4 ;
    public final void rule__Instance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:417:1: ( rule__Instance__Group__3__Impl rule__Instance__Group__4 )
            // InternalMLang.g:418:2: rule__Instance__Group__3__Impl rule__Instance__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Instance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3"


    // $ANTLR start "rule__Instance__Group__3__Impl"
    // InternalMLang.g:425:1: rule__Instance__Group__3__Impl : ( ( rule__Instance__TypeAssignment_3 ) ) ;
    public final void rule__Instance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:429:1: ( ( ( rule__Instance__TypeAssignment_3 ) ) )
            // InternalMLang.g:430:1: ( ( rule__Instance__TypeAssignment_3 ) )
            {
            // InternalMLang.g:430:1: ( ( rule__Instance__TypeAssignment_3 ) )
            // InternalMLang.g:431:2: ( rule__Instance__TypeAssignment_3 )
            {
             before(grammarAccess.getInstanceAccess().getTypeAssignment_3()); 
            // InternalMLang.g:432:2: ( rule__Instance__TypeAssignment_3 )
            // InternalMLang.g:432:3: rule__Instance__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Instance__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstanceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__3__Impl"


    // $ANTLR start "rule__Instance__Group__4"
    // InternalMLang.g:440:1: rule__Instance__Group__4 : rule__Instance__Group__4__Impl rule__Instance__Group__5 ;
    public final void rule__Instance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:444:1: ( rule__Instance__Group__4__Impl rule__Instance__Group__5 )
            // InternalMLang.g:445:2: rule__Instance__Group__4__Impl rule__Instance__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Instance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4"


    // $ANTLR start "rule__Instance__Group__4__Impl"
    // InternalMLang.g:452:1: rule__Instance__Group__4__Impl : ( '{' ) ;
    public final void rule__Instance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:456:1: ( ( '{' ) )
            // InternalMLang.g:457:1: ( '{' )
            {
            // InternalMLang.g:457:1: ( '{' )
            // InternalMLang.g:458:2: '{'
            {
             before(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__4__Impl"


    // $ANTLR start "rule__Instance__Group__5"
    // InternalMLang.g:467:1: rule__Instance__Group__5 : rule__Instance__Group__5__Impl rule__Instance__Group__6 ;
    public final void rule__Instance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:471:1: ( rule__Instance__Group__5__Impl rule__Instance__Group__6 )
            // InternalMLang.g:472:2: rule__Instance__Group__5__Impl rule__Instance__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Instance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5"


    // $ANTLR start "rule__Instance__Group__5__Impl"
    // InternalMLang.g:479:1: rule__Instance__Group__5__Impl : ( ( rule__Instance__FieldsAssignment_5 )* ) ;
    public final void rule__Instance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:483:1: ( ( ( rule__Instance__FieldsAssignment_5 )* ) )
            // InternalMLang.g:484:1: ( ( rule__Instance__FieldsAssignment_5 )* )
            {
            // InternalMLang.g:484:1: ( ( rule__Instance__FieldsAssignment_5 )* )
            // InternalMLang.g:485:2: ( rule__Instance__FieldsAssignment_5 )*
            {
             before(grammarAccess.getInstanceAccess().getFieldsAssignment_5()); 
            // InternalMLang.g:486:2: ( rule__Instance__FieldsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMLang.g:486:3: rule__Instance__FieldsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Instance__FieldsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getInstanceAccess().getFieldsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__5__Impl"


    // $ANTLR start "rule__Instance__Group__6"
    // InternalMLang.g:494:1: rule__Instance__Group__6 : rule__Instance__Group__6__Impl ;
    public final void rule__Instance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:498:1: ( rule__Instance__Group__6__Impl )
            // InternalMLang.g:499:2: rule__Instance__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instance__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6"


    // $ANTLR start "rule__Instance__Group__6__Impl"
    // InternalMLang.g:505:1: rule__Instance__Group__6__Impl : ( '}' ) ;
    public final void rule__Instance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:509:1: ( ( '}' ) )
            // InternalMLang.g:510:1: ( '}' )
            {
            // InternalMLang.g:510:1: ( '}' )
            // InternalMLang.g:511:2: '}'
            {
             before(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMLang.g:521:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:525:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMLang.g:526:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMLang.g:533:1: rule__Field__Group__0__Impl : ( ( rule__Field__KeyAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:537:1: ( ( ( rule__Field__KeyAssignment_0 ) ) )
            // InternalMLang.g:538:1: ( ( rule__Field__KeyAssignment_0 ) )
            {
            // InternalMLang.g:538:1: ( ( rule__Field__KeyAssignment_0 ) )
            // InternalMLang.g:539:2: ( rule__Field__KeyAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getKeyAssignment_0()); 
            // InternalMLang.g:540:2: ( rule__Field__KeyAssignment_0 )
            // InternalMLang.g:540:3: rule__Field__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMLang.g:548:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:552:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMLang.g:553:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMLang.g:560:1: rule__Field__Group__1__Impl : ( '=' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:564:1: ( ( '=' ) )
            // InternalMLang.g:565:1: ( '=' )
            {
            // InternalMLang.g:565:1: ( '=' )
            // InternalMLang.g:566:2: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMLang.g:575:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:579:1: ( rule__Field__Group__2__Impl )
            // InternalMLang.g:580:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMLang.g:586:1: rule__Field__Group__2__Impl : ( ( rule__Field__ValueAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:590:1: ( ( ( rule__Field__ValueAssignment_2 ) ) )
            // InternalMLang.g:591:1: ( ( rule__Field__ValueAssignment_2 ) )
            {
            // InternalMLang.g:591:1: ( ( rule__Field__ValueAssignment_2 ) )
            // InternalMLang.g:592:2: ( rule__Field__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2()); 
            // InternalMLang.g:593:2: ( rule__Field__ValueAssignment_2 )
            // InternalMLang.g:593:3: rule__Field__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Value__Group_0__0"
    // InternalMLang.g:602:1: rule__Value__Group_0__0 : rule__Value__Group_0__0__Impl rule__Value__Group_0__1 ;
    public final void rule__Value__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:606:1: ( rule__Value__Group_0__0__Impl rule__Value__Group_0__1 )
            // InternalMLang.g:607:2: rule__Value__Group_0__0__Impl rule__Value__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Value__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0"


    // $ANTLR start "rule__Value__Group_0__0__Impl"
    // InternalMLang.g:614:1: rule__Value__Group_0__0__Impl : ( () ) ;
    public final void rule__Value__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:618:1: ( ( () ) )
            // InternalMLang.g:619:1: ( () )
            {
            // InternalMLang.g:619:1: ( () )
            // InternalMLang.g:620:2: ()
            {
             before(grammarAccess.getValueAccess().getFreeValAction_0_0()); 
            // InternalMLang.g:621:2: ()
            // InternalMLang.g:621:3: 
            {
            }

             after(grammarAccess.getValueAccess().getFreeValAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0__Impl"


    // $ANTLR start "rule__Value__Group_0__1"
    // InternalMLang.g:629:1: rule__Value__Group_0__1 : rule__Value__Group_0__1__Impl ;
    public final void rule__Value__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:633:1: ( rule__Value__Group_0__1__Impl )
            // InternalMLang.g:634:2: rule__Value__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1"


    // $ANTLR start "rule__Value__Group_0__1__Impl"
    // InternalMLang.g:640:1: rule__Value__Group_0__1__Impl : ( ( rule__Value__ValAssignment_0_1 ) ) ;
    public final void rule__Value__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:644:1: ( ( ( rule__Value__ValAssignment_0_1 ) ) )
            // InternalMLang.g:645:1: ( ( rule__Value__ValAssignment_0_1 ) )
            {
            // InternalMLang.g:645:1: ( ( rule__Value__ValAssignment_0_1 ) )
            // InternalMLang.g:646:2: ( rule__Value__ValAssignment_0_1 )
            {
             before(grammarAccess.getValueAccess().getValAssignment_0_1()); 
            // InternalMLang.g:647:2: ( rule__Value__ValAssignment_0_1 )
            // InternalMLang.g:647:3: rule__Value__ValAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1__Impl"


    // $ANTLR start "rule__Value__Group_1__0"
    // InternalMLang.g:656:1: rule__Value__Group_1__0 : rule__Value__Group_1__0__Impl rule__Value__Group_1__1 ;
    public final void rule__Value__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:660:1: ( rule__Value__Group_1__0__Impl rule__Value__Group_1__1 )
            // InternalMLang.g:661:2: rule__Value__Group_1__0__Impl rule__Value__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Value__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__0"


    // $ANTLR start "rule__Value__Group_1__0__Impl"
    // InternalMLang.g:668:1: rule__Value__Group_1__0__Impl : ( () ) ;
    public final void rule__Value__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:672:1: ( ( () ) )
            // InternalMLang.g:673:1: ( () )
            {
            // InternalMLang.g:673:1: ( () )
            // InternalMLang.g:674:2: ()
            {
             before(grammarAccess.getValueAccess().getStringValAction_1_0()); 
            // InternalMLang.g:675:2: ()
            // InternalMLang.g:675:3: 
            {
            }

             after(grammarAccess.getValueAccess().getStringValAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__0__Impl"


    // $ANTLR start "rule__Value__Group_1__1"
    // InternalMLang.g:683:1: rule__Value__Group_1__1 : rule__Value__Group_1__1__Impl ;
    public final void rule__Value__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:687:1: ( rule__Value__Group_1__1__Impl )
            // InternalMLang.g:688:2: rule__Value__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__1"


    // $ANTLR start "rule__Value__Group_1__1__Impl"
    // InternalMLang.g:694:1: rule__Value__Group_1__1__Impl : ( ( rule__Value__ValAssignment_1_1 ) ) ;
    public final void rule__Value__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:698:1: ( ( ( rule__Value__ValAssignment_1_1 ) ) )
            // InternalMLang.g:699:1: ( ( rule__Value__ValAssignment_1_1 ) )
            {
            // InternalMLang.g:699:1: ( ( rule__Value__ValAssignment_1_1 ) )
            // InternalMLang.g:700:2: ( rule__Value__ValAssignment_1_1 )
            {
             before(grammarAccess.getValueAccess().getValAssignment_1_1()); 
            // InternalMLang.g:701:2: ( rule__Value__ValAssignment_1_1 )
            // InternalMLang.g:701:3: rule__Value__ValAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_1__1__Impl"


    // $ANTLR start "rule__Value__Group_2__0"
    // InternalMLang.g:710:1: rule__Value__Group_2__0 : rule__Value__Group_2__0__Impl rule__Value__Group_2__1 ;
    public final void rule__Value__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:714:1: ( rule__Value__Group_2__0__Impl rule__Value__Group_2__1 )
            // InternalMLang.g:715:2: rule__Value__Group_2__0__Impl rule__Value__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Value__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__0"


    // $ANTLR start "rule__Value__Group_2__0__Impl"
    // InternalMLang.g:722:1: rule__Value__Group_2__0__Impl : ( () ) ;
    public final void rule__Value__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:726:1: ( ( () ) )
            // InternalMLang.g:727:1: ( () )
            {
            // InternalMLang.g:727:1: ( () )
            // InternalMLang.g:728:2: ()
            {
             before(grammarAccess.getValueAccess().getIntValAction_2_0()); 
            // InternalMLang.g:729:2: ()
            // InternalMLang.g:729:3: 
            {
            }

             after(grammarAccess.getValueAccess().getIntValAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__0__Impl"


    // $ANTLR start "rule__Value__Group_2__1"
    // InternalMLang.g:737:1: rule__Value__Group_2__1 : rule__Value__Group_2__1__Impl ;
    public final void rule__Value__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:741:1: ( rule__Value__Group_2__1__Impl )
            // InternalMLang.g:742:2: rule__Value__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__1"


    // $ANTLR start "rule__Value__Group_2__1__Impl"
    // InternalMLang.g:748:1: rule__Value__Group_2__1__Impl : ( ( rule__Value__ValAssignment_2_1 ) ) ;
    public final void rule__Value__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:752:1: ( ( ( rule__Value__ValAssignment_2_1 ) ) )
            // InternalMLang.g:753:1: ( ( rule__Value__ValAssignment_2_1 ) )
            {
            // InternalMLang.g:753:1: ( ( rule__Value__ValAssignment_2_1 ) )
            // InternalMLang.g:754:2: ( rule__Value__ValAssignment_2_1 )
            {
             before(grammarAccess.getValueAccess().getValAssignment_2_1()); 
            // InternalMLang.g:755:2: ( rule__Value__ValAssignment_2_1 )
            // InternalMLang.g:755:3: rule__Value__ValAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_2__1__Impl"


    // $ANTLR start "rule__Value__Group_3__0"
    // InternalMLang.g:764:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:768:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalMLang.g:769:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Value__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0"


    // $ANTLR start "rule__Value__Group_3__0__Impl"
    // InternalMLang.g:776:1: rule__Value__Group_3__0__Impl : ( () ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:780:1: ( ( () ) )
            // InternalMLang.g:781:1: ( () )
            {
            // InternalMLang.g:781:1: ( () )
            // InternalMLang.g:782:2: ()
            {
             before(grammarAccess.getValueAccess().getInstanceValAction_3_0()); 
            // InternalMLang.g:783:2: ()
            // InternalMLang.g:783:3: 
            {
            }

             after(grammarAccess.getValueAccess().getInstanceValAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3__1"
    // InternalMLang.g:791:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:795:1: ( rule__Value__Group_3__1__Impl )
            // InternalMLang.g:796:2: rule__Value__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1"


    // $ANTLR start "rule__Value__Group_3__1__Impl"
    // InternalMLang.g:802:1: rule__Value__Group_3__1__Impl : ( ( rule__Value__RefAssignment_3_1 ) ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:806:1: ( ( ( rule__Value__RefAssignment_3_1 ) ) )
            // InternalMLang.g:807:1: ( ( rule__Value__RefAssignment_3_1 ) )
            {
            // InternalMLang.g:807:1: ( ( rule__Value__RefAssignment_3_1 ) )
            // InternalMLang.g:808:2: ( rule__Value__RefAssignment_3_1 )
            {
             before(grammarAccess.getValueAccess().getRefAssignment_3_1()); 
            // InternalMLang.g:809:2: ( rule__Value__RefAssignment_3_1 )
            // InternalMLang.g:809:3: rule__Value__RefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Value__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1__Impl"


    // $ANTLR start "rule__Value__Group_4__0"
    // InternalMLang.g:818:1: rule__Value__Group_4__0 : rule__Value__Group_4__0__Impl rule__Value__Group_4__1 ;
    public final void rule__Value__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:822:1: ( rule__Value__Group_4__0__Impl rule__Value__Group_4__1 )
            // InternalMLang.g:823:2: rule__Value__Group_4__0__Impl rule__Value__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0"


    // $ANTLR start "rule__Value__Group_4__0__Impl"
    // InternalMLang.g:830:1: rule__Value__Group_4__0__Impl : ( () ) ;
    public final void rule__Value__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:834:1: ( ( () ) )
            // InternalMLang.g:835:1: ( () )
            {
            // InternalMLang.g:835:1: ( () )
            // InternalMLang.g:836:2: ()
            {
             before(grammarAccess.getValueAccess().getListValAction_4_0()); 
            // InternalMLang.g:837:2: ()
            // InternalMLang.g:837:3: 
            {
            }

             after(grammarAccess.getValueAccess().getListValAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__0__Impl"


    // $ANTLR start "rule__Value__Group_4__1"
    // InternalMLang.g:845:1: rule__Value__Group_4__1 : rule__Value__Group_4__1__Impl rule__Value__Group_4__2 ;
    public final void rule__Value__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:849:1: ( rule__Value__Group_4__1__Impl rule__Value__Group_4__2 )
            // InternalMLang.g:850:2: rule__Value__Group_4__1__Impl rule__Value__Group_4__2
            {
            pushFollow(FOLLOW_17);
            rule__Value__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1"


    // $ANTLR start "rule__Value__Group_4__1__Impl"
    // InternalMLang.g:857:1: rule__Value__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Value__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:861:1: ( ( '[' ) )
            // InternalMLang.g:862:1: ( '[' )
            {
            // InternalMLang.g:862:1: ( '[' )
            // InternalMLang.g:863:2: '['
            {
             before(grammarAccess.getValueAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__1__Impl"


    // $ANTLR start "rule__Value__Group_4__2"
    // InternalMLang.g:872:1: rule__Value__Group_4__2 : rule__Value__Group_4__2__Impl rule__Value__Group_4__3 ;
    public final void rule__Value__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:876:1: ( rule__Value__Group_4__2__Impl rule__Value__Group_4__3 )
            // InternalMLang.g:877:2: rule__Value__Group_4__2__Impl rule__Value__Group_4__3
            {
            pushFollow(FOLLOW_17);
            rule__Value__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__2"


    // $ANTLR start "rule__Value__Group_4__2__Impl"
    // InternalMLang.g:884:1: rule__Value__Group_4__2__Impl : ( ( rule__Value__ValsAssignment_4_2 )* ) ;
    public final void rule__Value__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:888:1: ( ( ( rule__Value__ValsAssignment_4_2 )* ) )
            // InternalMLang.g:889:1: ( ( rule__Value__ValsAssignment_4_2 )* )
            {
            // InternalMLang.g:889:1: ( ( rule__Value__ValsAssignment_4_2 )* )
            // InternalMLang.g:890:2: ( rule__Value__ValsAssignment_4_2 )*
            {
             before(grammarAccess.getValueAccess().getValsAssignment_4_2()); 
            // InternalMLang.g:891:2: ( rule__Value__ValsAssignment_4_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_INT)||LA4_0==15||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMLang.g:891:3: rule__Value__ValsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Value__ValsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getValsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__2__Impl"


    // $ANTLR start "rule__Value__Group_4__3"
    // InternalMLang.g:899:1: rule__Value__Group_4__3 : rule__Value__Group_4__3__Impl ;
    public final void rule__Value__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:903:1: ( rule__Value__Group_4__3__Impl )
            // InternalMLang.g:904:2: rule__Value__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__3"


    // $ANTLR start "rule__Value__Group_4__3__Impl"
    // InternalMLang.g:910:1: rule__Value__Group_4__3__Impl : ( ']' ) ;
    public final void rule__Value__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:914:1: ( ( ']' ) )
            // InternalMLang.g:915:1: ( ']' )
            {
            // InternalMLang.g:915:1: ( ']' )
            // InternalMLang.g:916:2: ']'
            {
             before(grammarAccess.getValueAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_4__3__Impl"


    // $ANTLR start "rule__Value__Group_5__0"
    // InternalMLang.g:926:1: rule__Value__Group_5__0 : rule__Value__Group_5__0__Impl rule__Value__Group_5__1 ;
    public final void rule__Value__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:930:1: ( rule__Value__Group_5__0__Impl rule__Value__Group_5__1 )
            // InternalMLang.g:931:2: rule__Value__Group_5__0__Impl rule__Value__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Value__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0"


    // $ANTLR start "rule__Value__Group_5__0__Impl"
    // InternalMLang.g:938:1: rule__Value__Group_5__0__Impl : ( () ) ;
    public final void rule__Value__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:942:1: ( ( () ) )
            // InternalMLang.g:943:1: ( () )
            {
            // InternalMLang.g:943:1: ( () )
            // InternalMLang.g:944:2: ()
            {
             before(grammarAccess.getValueAccess().getSetValAction_5_0()); 
            // InternalMLang.g:945:2: ()
            // InternalMLang.g:945:3: 
            {
            }

             after(grammarAccess.getValueAccess().getSetValAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__0__Impl"


    // $ANTLR start "rule__Value__Group_5__1"
    // InternalMLang.g:953:1: rule__Value__Group_5__1 : rule__Value__Group_5__1__Impl rule__Value__Group_5__2 ;
    public final void rule__Value__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:957:1: ( rule__Value__Group_5__1__Impl rule__Value__Group_5__2 )
            // InternalMLang.g:958:2: rule__Value__Group_5__1__Impl rule__Value__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Value__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1"


    // $ANTLR start "rule__Value__Group_5__1__Impl"
    // InternalMLang.g:965:1: rule__Value__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Value__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:969:1: ( ( '{' ) )
            // InternalMLang.g:970:1: ( '{' )
            {
            // InternalMLang.g:970:1: ( '{' )
            // InternalMLang.g:971:2: '{'
            {
             before(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__1__Impl"


    // $ANTLR start "rule__Value__Group_5__2"
    // InternalMLang.g:980:1: rule__Value__Group_5__2 : rule__Value__Group_5__2__Impl rule__Value__Group_5__3 ;
    public final void rule__Value__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:984:1: ( rule__Value__Group_5__2__Impl rule__Value__Group_5__3 )
            // InternalMLang.g:985:2: rule__Value__Group_5__2__Impl rule__Value__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__Value__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2"


    // $ANTLR start "rule__Value__Group_5__2__Impl"
    // InternalMLang.g:992:1: rule__Value__Group_5__2__Impl : ( ( rule__Value__ValsAssignment_5_2 )* ) ;
    public final void rule__Value__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:996:1: ( ( ( rule__Value__ValsAssignment_5_2 )* ) )
            // InternalMLang.g:997:1: ( ( rule__Value__ValsAssignment_5_2 )* )
            {
            // InternalMLang.g:997:1: ( ( rule__Value__ValsAssignment_5_2 )* )
            // InternalMLang.g:998:2: ( rule__Value__ValsAssignment_5_2 )*
            {
             before(grammarAccess.getValueAccess().getValsAssignment_5_2()); 
            // InternalMLang.g:999:2: ( rule__Value__ValsAssignment_5_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)||LA5_0==15||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMLang.g:999:3: rule__Value__ValsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Value__ValsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getValueAccess().getValsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__2__Impl"


    // $ANTLR start "rule__Value__Group_5__3"
    // InternalMLang.g:1007:1: rule__Value__Group_5__3 : rule__Value__Group_5__3__Impl ;
    public final void rule__Value__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1011:1: ( rule__Value__Group_5__3__Impl )
            // InternalMLang.g:1012:2: rule__Value__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3"


    // $ANTLR start "rule__Value__Group_5__3__Impl"
    // InternalMLang.g:1018:1: rule__Value__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Value__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1022:1: ( ( '}' ) )
            // InternalMLang.g:1023:1: ( '}' )
            {
            // InternalMLang.g:1023:1: ( '}' )
            // InternalMLang.g:1024:2: '}'
            {
             before(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_5__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalMLang.g:1034:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1038:1: ( ( RULE_ID ) )
            // InternalMLang.g:1039:2: ( RULE_ID )
            {
            // InternalMLang.g:1039:2: ( RULE_ID )
            // InternalMLang.g:1040:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__MetamodelAssignment_3"
    // InternalMLang.g:1049:1: rule__Model__MetamodelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Model__MetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1053:1: ( ( ( RULE_ID ) ) )
            // InternalMLang.g:1054:2: ( ( RULE_ID ) )
            {
            // InternalMLang.g:1054:2: ( ( RULE_ID ) )
            // InternalMLang.g:1055:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelCrossReference_3_0()); 
            // InternalMLang.g:1056:3: ( RULE_ID )
            // InternalMLang.g:1057:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getMetamodelMetamodelIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getMetamodelMetamodelIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getModelAccess().getMetamodelMetamodelCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelAssignment_3"


    // $ANTLR start "rule__Model__InstancesAssignment_4"
    // InternalMLang.g:1068:1: rule__Model__InstancesAssignment_4 : ( ruleInstance ) ;
    public final void rule__Model__InstancesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1072:1: ( ( ruleInstance ) )
            // InternalMLang.g:1073:2: ( ruleInstance )
            {
            // InternalMLang.g:1073:2: ( ruleInstance )
            // InternalMLang.g:1074:3: ruleInstance
            {
             before(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstance();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInstancesInstanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InstancesAssignment_4"


    // $ANTLR start "rule__Instance__NameAssignment_1"
    // InternalMLang.g:1083:1: rule__Instance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Instance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1087:1: ( ( RULE_ID ) )
            // InternalMLang.g:1088:2: ( RULE_ID )
            {
            // InternalMLang.g:1088:2: ( RULE_ID )
            // InternalMLang.g:1089:3: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__NameAssignment_1"


    // $ANTLR start "rule__Instance__TypeAssignment_3"
    // InternalMLang.g:1098:1: rule__Instance__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Instance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1102:1: ( ( ( RULE_ID ) ) )
            // InternalMLang.g:1103:2: ( ( RULE_ID ) )
            {
            // InternalMLang.g:1103:2: ( ( RULE_ID ) )
            // InternalMLang.g:1104:3: ( RULE_ID )
            {
             before(grammarAccess.getInstanceAccess().getTypeClassCrossReference_3_0()); 
            // InternalMLang.g:1105:3: ( RULE_ID )
            // InternalMLang.g:1106:4: RULE_ID
            {
             before(grammarAccess.getInstanceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceAccess().getTypeClassIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInstanceAccess().getTypeClassCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__TypeAssignment_3"


    // $ANTLR start "rule__Instance__FieldsAssignment_5"
    // InternalMLang.g:1117:1: rule__Instance__FieldsAssignment_5 : ( ruleField ) ;
    public final void rule__Instance__FieldsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1121:1: ( ( ruleField ) )
            // InternalMLang.g:1122:2: ( ruleField )
            {
            // InternalMLang.g:1122:2: ( ruleField )
            // InternalMLang.g:1123:3: ruleField
            {
             before(grammarAccess.getInstanceAccess().getFieldsFieldParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getInstanceAccess().getFieldsFieldParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instance__FieldsAssignment_5"


    // $ANTLR start "rule__Field__KeyAssignment_0"
    // InternalMLang.g:1132:1: rule__Field__KeyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Field__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1136:1: ( ( ( RULE_ID ) ) )
            // InternalMLang.g:1137:2: ( ( RULE_ID ) )
            {
            // InternalMLang.g:1137:2: ( ( RULE_ID ) )
            // InternalMLang.g:1138:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getKeyFieldCrossReference_0_0()); 
            // InternalMLang.g:1139:3: ( RULE_ID )
            // InternalMLang.g:1140:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getKeyFieldIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getKeyFieldIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getKeyFieldCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__KeyAssignment_0"


    // $ANTLR start "rule__Field__ValueAssignment_2"
    // InternalMLang.g:1151:1: rule__Field__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Field__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1155:1: ( ( ruleValue ) )
            // InternalMLang.g:1156:2: ( ruleValue )
            {
            // InternalMLang.g:1156:2: ( ruleValue )
            // InternalMLang.g:1157:3: ruleValue
            {
             before(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment_2"


    // $ANTLR start "rule__Value__ValAssignment_0_1"
    // InternalMLang.g:1166:1: rule__Value__ValAssignment_0_1 : ( RULE_ANY_OTHER ) ;
    public final void rule__Value__ValAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1170:1: ( ( RULE_ANY_OTHER ) )
            // InternalMLang.g:1171:2: ( RULE_ANY_OTHER )
            {
            // InternalMLang.g:1171:2: ( RULE_ANY_OTHER )
            // InternalMLang.g:1172:3: RULE_ANY_OTHER
            {
             before(grammarAccess.getValueAccess().getValANY_OTHERTerminalRuleCall_0_1_0()); 
            match(input,RULE_ANY_OTHER,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValANY_OTHERTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValAssignment_0_1"


    // $ANTLR start "rule__Value__ValAssignment_1_1"
    // InternalMLang.g:1181:1: rule__Value__ValAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Value__ValAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1185:1: ( ( RULE_STRING ) )
            // InternalMLang.g:1186:2: ( RULE_STRING )
            {
            // InternalMLang.g:1186:2: ( RULE_STRING )
            // InternalMLang.g:1187:3: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getValSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValAssignment_1_1"


    // $ANTLR start "rule__Value__ValAssignment_2_1"
    // InternalMLang.g:1196:1: rule__Value__ValAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Value__ValAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1200:1: ( ( RULE_INT ) )
            // InternalMLang.g:1201:2: ( RULE_INT )
            {
            // InternalMLang.g:1201:2: ( RULE_INT )
            // InternalMLang.g:1202:3: RULE_INT
            {
             before(grammarAccess.getValueAccess().getValINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValAssignment_2_1"


    // $ANTLR start "rule__Value__RefAssignment_3_1"
    // InternalMLang.g:1211:1: rule__Value__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Value__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1215:1: ( ( ( RULE_ID ) ) )
            // InternalMLang.g:1216:2: ( ( RULE_ID ) )
            {
            // InternalMLang.g:1216:2: ( ( RULE_ID ) )
            // InternalMLang.g:1217:3: ( RULE_ID )
            {
             before(grammarAccess.getValueAccess().getRefInstanceCrossReference_3_1_0()); 
            // InternalMLang.g:1218:3: ( RULE_ID )
            // InternalMLang.g:1219:4: RULE_ID
            {
             before(grammarAccess.getValueAccess().getRefInstanceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRefInstanceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getValueAccess().getRefInstanceCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__RefAssignment_3_1"


    // $ANTLR start "rule__Value__ValsAssignment_4_2"
    // InternalMLang.g:1230:1: rule__Value__ValsAssignment_4_2 : ( ruleValue ) ;
    public final void rule__Value__ValsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1234:1: ( ( ruleValue ) )
            // InternalMLang.g:1235:2: ( ruleValue )
            {
            // InternalMLang.g:1235:2: ( ruleValue )
            // InternalMLang.g:1236:3: ruleValue
            {
             before(grammarAccess.getValueAccess().getValsValueParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValsValueParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValsAssignment_4_2"


    // $ANTLR start "rule__Value__ValsAssignment_5_2"
    // InternalMLang.g:1245:1: rule__Value__ValsAssignment_5_2 : ( ruleValue ) ;
    public final void rule__Value__ValsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMLang.g:1249:1: ( ( ruleValue ) )
            // InternalMLang.g:1250:2: ( ruleValue )
            {
            // InternalMLang.g:1250:2: ( ruleValue )
            // InternalMLang.g:1251:3: ruleValue
            {
             before(grammarAccess.getValueAccess().getValsValueParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueAccess().getValsValueParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValsAssignment_5_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000480F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C80F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000480F2L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000580F0L});

}