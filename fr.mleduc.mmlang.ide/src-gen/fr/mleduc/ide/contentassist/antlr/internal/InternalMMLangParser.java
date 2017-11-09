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
import fr.mleduc.services.MMLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'class'", "'{'", "'}'", "'extends'", "','", "'<'", "'>'", "':'", "'['", "'..'", "']'", "'0'", "'1'", "'*'", "'concrete'", "'abstract'", "'@'"
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

    	public void setGrammarAccess(MMLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMetamodel"
    // InternalMMLang.g:53:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // InternalMMLang.g:54:1: ( ruleMetamodel EOF )
            // InternalMMLang.g:55:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalMMLang.g:62:1: ruleMetamodel : ( ( rule__Metamodel__Group__0 ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:66:2: ( ( ( rule__Metamodel__Group__0 ) ) )
            // InternalMMLang.g:67:2: ( ( rule__Metamodel__Group__0 ) )
            {
            // InternalMMLang.g:67:2: ( ( rule__Metamodel__Group__0 ) )
            // InternalMMLang.g:68:3: ( rule__Metamodel__Group__0 )
            {
             before(grammarAccess.getMetamodelAccess().getGroup()); 
            // InternalMMLang.g:69:3: ( rule__Metamodel__Group__0 )
            // InternalMMLang.g:69:4: rule__Metamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getGroup()); 

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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleClass"
    // InternalMMLang.g:78:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalMMLang.g:79:1: ( ruleClass EOF )
            // InternalMMLang.g:80:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalMMLang.g:87:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:91:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalMMLang.g:92:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalMMLang.g:92:2: ( ( rule__Class__Group__0 ) )
            // InternalMMLang.g:93:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalMMLang.g:94:3: ( rule__Class__Group__0 )
            // InternalMMLang.g:94:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleGeneric"
    // InternalMMLang.g:103:1: entryRuleGeneric : ruleGeneric EOF ;
    public final void entryRuleGeneric() throws RecognitionException {
        try {
            // InternalMMLang.g:104:1: ( ruleGeneric EOF )
            // InternalMMLang.g:105:1: ruleGeneric EOF
            {
             before(grammarAccess.getGenericRule()); 
            pushFollow(FOLLOW_1);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getGenericRule()); 
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
    // $ANTLR end "entryRuleGeneric"


    // $ANTLR start "ruleGeneric"
    // InternalMMLang.g:112:1: ruleGeneric : ( ( rule__Generic__NameAssignment ) ) ;
    public final void ruleGeneric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:116:2: ( ( ( rule__Generic__NameAssignment ) ) )
            // InternalMMLang.g:117:2: ( ( rule__Generic__NameAssignment ) )
            {
            // InternalMMLang.g:117:2: ( ( rule__Generic__NameAssignment ) )
            // InternalMMLang.g:118:3: ( rule__Generic__NameAssignment )
            {
             before(grammarAccess.getGenericAccess().getNameAssignment()); 
            // InternalMMLang.g:119:3: ( rule__Generic__NameAssignment )
            // InternalMMLang.g:119:4: rule__Generic__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Generic__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGenericAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleGeneric"


    // $ANTLR start "entryRuleField"
    // InternalMMLang.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMMLang.g:129:1: ( ruleField EOF )
            // InternalMMLang.g:130:1: ruleField EOF
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
    // InternalMMLang.g:137:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:141:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMMLang.g:142:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMMLang.g:142:2: ( ( rule__Field__Group__0 ) )
            // InternalMMLang.g:143:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalMMLang.g:144:3: ( rule__Field__Group__0 )
            // InternalMMLang.g:144:4: rule__Field__Group__0
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


    // $ANTLR start "entryRuleCard"
    // InternalMMLang.g:153:1: entryRuleCard : ruleCard EOF ;
    public final void entryRuleCard() throws RecognitionException {
        try {
            // InternalMMLang.g:154:1: ( ruleCard EOF )
            // InternalMMLang.g:155:1: ruleCard EOF
            {
             before(grammarAccess.getCardRule()); 
            pushFollow(FOLLOW_1);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getCardRule()); 
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
    // $ANTLR end "entryRuleCard"


    // $ANTLR start "ruleCard"
    // InternalMMLang.g:162:1: ruleCard : ( ( rule__Card__Alternatives ) ) ;
    public final void ruleCard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:166:2: ( ( ( rule__Card__Alternatives ) ) )
            // InternalMMLang.g:167:2: ( ( rule__Card__Alternatives ) )
            {
            // InternalMMLang.g:167:2: ( ( rule__Card__Alternatives ) )
            // InternalMMLang.g:168:3: ( rule__Card__Alternatives )
            {
             before(grammarAccess.getCardAccess().getAlternatives()); 
            // InternalMMLang.g:169:3: ( rule__Card__Alternatives )
            // InternalMMLang.g:169:4: rule__Card__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Card__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCard"


    // $ANTLR start "rule__Card__Alternatives"
    // InternalMMLang.g:177:1: rule__Card__Alternatives : ( ( ( rule__Card__Group_0__0 ) ) | ( ( rule__Card__Group_1__0 ) ) | ( ( rule__Card__Group_2__0 ) ) );
    public final void rule__Card__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:181:1: ( ( ( rule__Card__Group_0__0 ) ) | ( ( rule__Card__Group_1__0 ) ) | ( ( rule__Card__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMMLang.g:182:2: ( ( rule__Card__Group_0__0 ) )
                    {
                    // InternalMMLang.g:182:2: ( ( rule__Card__Group_0__0 ) )
                    // InternalMMLang.g:183:3: ( rule__Card__Group_0__0 )
                    {
                     before(grammarAccess.getCardAccess().getGroup_0()); 
                    // InternalMMLang.g:184:3: ( rule__Card__Group_0__0 )
                    // InternalMMLang.g:184:4: rule__Card__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Card__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMMLang.g:188:2: ( ( rule__Card__Group_1__0 ) )
                    {
                    // InternalMMLang.g:188:2: ( ( rule__Card__Group_1__0 ) )
                    // InternalMMLang.g:189:3: ( rule__Card__Group_1__0 )
                    {
                     before(grammarAccess.getCardAccess().getGroup_1()); 
                    // InternalMMLang.g:190:3: ( rule__Card__Group_1__0 )
                    // InternalMMLang.g:190:4: rule__Card__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Card__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMMLang.g:194:2: ( ( rule__Card__Group_2__0 ) )
                    {
                    // InternalMMLang.g:194:2: ( ( rule__Card__Group_2__0 ) )
                    // InternalMMLang.g:195:3: ( rule__Card__Group_2__0 )
                    {
                     before(grammarAccess.getCardAccess().getGroup_2()); 
                    // InternalMMLang.g:196:3: ( rule__Card__Group_2__0 )
                    // InternalMMLang.g:196:4: rule__Card__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Card__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Card__Alternatives"


    // $ANTLR start "rule__Metamodel__Group__0"
    // InternalMMLang.g:204:1: rule__Metamodel__Group__0 : rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 ;
    public final void rule__Metamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:208:1: ( rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 )
            // InternalMMLang.g:209:2: rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Metamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__1();

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
    // $ANTLR end "rule__Metamodel__Group__0"


    // $ANTLR start "rule__Metamodel__Group__0__Impl"
    // InternalMMLang.g:216:1: rule__Metamodel__Group__0__Impl : ( ( rule__Metamodel__ConcreteAssignment_0 )? ) ;
    public final void rule__Metamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:220:1: ( ( ( rule__Metamodel__ConcreteAssignment_0 )? ) )
            // InternalMMLang.g:221:1: ( ( rule__Metamodel__ConcreteAssignment_0 )? )
            {
            // InternalMMLang.g:221:1: ( ( rule__Metamodel__ConcreteAssignment_0 )? )
            // InternalMMLang.g:222:2: ( rule__Metamodel__ConcreteAssignment_0 )?
            {
             before(grammarAccess.getMetamodelAccess().getConcreteAssignment_0()); 
            // InternalMMLang.g:223:2: ( rule__Metamodel__ConcreteAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMMLang.g:223:3: rule__Metamodel__ConcreteAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Metamodel__ConcreteAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetamodelAccess().getConcreteAssignment_0()); 

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
    // $ANTLR end "rule__Metamodel__Group__0__Impl"


    // $ANTLR start "rule__Metamodel__Group__1"
    // InternalMMLang.g:231:1: rule__Metamodel__Group__1 : rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 ;
    public final void rule__Metamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:235:1: ( rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2 )
            // InternalMMLang.g:236:2: rule__Metamodel__Group__1__Impl rule__Metamodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Metamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__2();

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
    // $ANTLR end "rule__Metamodel__Group__1"


    // $ANTLR start "rule__Metamodel__Group__1__Impl"
    // InternalMMLang.g:243:1: rule__Metamodel__Group__1__Impl : ( 'package' ) ;
    public final void rule__Metamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:247:1: ( ( 'package' ) )
            // InternalMMLang.g:248:1: ( 'package' )
            {
            // InternalMMLang.g:248:1: ( 'package' )
            // InternalMMLang.g:249:2: 'package'
            {
             before(grammarAccess.getMetamodelAccess().getPackageKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMetamodelAccess().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__Metamodel__Group__1__Impl"


    // $ANTLR start "rule__Metamodel__Group__2"
    // InternalMMLang.g:258:1: rule__Metamodel__Group__2 : rule__Metamodel__Group__2__Impl rule__Metamodel__Group__3 ;
    public final void rule__Metamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:262:1: ( rule__Metamodel__Group__2__Impl rule__Metamodel__Group__3 )
            // InternalMMLang.g:263:2: rule__Metamodel__Group__2__Impl rule__Metamodel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Metamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__3();

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
    // $ANTLR end "rule__Metamodel__Group__2"


    // $ANTLR start "rule__Metamodel__Group__2__Impl"
    // InternalMMLang.g:270:1: rule__Metamodel__Group__2__Impl : ( ( rule__Metamodel__NameAssignment_2 ) ) ;
    public final void rule__Metamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:274:1: ( ( ( rule__Metamodel__NameAssignment_2 ) ) )
            // InternalMMLang.g:275:1: ( ( rule__Metamodel__NameAssignment_2 ) )
            {
            // InternalMMLang.g:275:1: ( ( rule__Metamodel__NameAssignment_2 ) )
            // InternalMMLang.g:276:2: ( rule__Metamodel__NameAssignment_2 )
            {
             before(grammarAccess.getMetamodelAccess().getNameAssignment_2()); 
            // InternalMMLang.g:277:2: ( rule__Metamodel__NameAssignment_2 )
            // InternalMMLang.g:277:3: rule__Metamodel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Metamodel__Group__2__Impl"


    // $ANTLR start "rule__Metamodel__Group__3"
    // InternalMMLang.g:285:1: rule__Metamodel__Group__3 : rule__Metamodel__Group__3__Impl ;
    public final void rule__Metamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:289:1: ( rule__Metamodel__Group__3__Impl )
            // InternalMMLang.g:290:2: rule__Metamodel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__3__Impl();

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
    // $ANTLR end "rule__Metamodel__Group__3"


    // $ANTLR start "rule__Metamodel__Group__3__Impl"
    // InternalMMLang.g:296:1: rule__Metamodel__Group__3__Impl : ( ( rule__Metamodel__ClassesAssignment_3 )* ) ;
    public final void rule__Metamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:300:1: ( ( ( rule__Metamodel__ClassesAssignment_3 )* ) )
            // InternalMMLang.g:301:1: ( ( rule__Metamodel__ClassesAssignment_3 )* )
            {
            // InternalMMLang.g:301:1: ( ( rule__Metamodel__ClassesAssignment_3 )* )
            // InternalMMLang.g:302:2: ( rule__Metamodel__ClassesAssignment_3 )*
            {
             before(grammarAccess.getMetamodelAccess().getClassesAssignment_3()); 
            // InternalMMLang.g:303:2: ( rule__Metamodel__ClassesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMMLang.g:303:3: rule__Metamodel__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Metamodel__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMetamodelAccess().getClassesAssignment_3()); 

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
    // $ANTLR end "rule__Metamodel__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalMMLang.g:312:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:316:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalMMLang.g:317:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

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
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalMMLang.g:324:1: rule__Class__Group__0__Impl : ( ( rule__Class__AbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:328:1: ( ( ( rule__Class__AbstractAssignment_0 )? ) )
            // InternalMMLang.g:329:1: ( ( rule__Class__AbstractAssignment_0 )? )
            {
            // InternalMMLang.g:329:1: ( ( rule__Class__AbstractAssignment_0 )? )
            // InternalMMLang.g:330:2: ( rule__Class__AbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_0()); 
            // InternalMMLang.g:331:2: ( rule__Class__AbstractAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMMLang.g:331:3: rule__Class__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalMMLang.g:339:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:343:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalMMLang.g:344:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

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
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalMMLang.g:351:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:355:1: ( ( 'class' ) )
            // InternalMMLang.g:356:1: ( 'class' )
            {
            // InternalMMLang.g:356:1: ( 'class' )
            // InternalMMLang.g:357:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

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
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalMMLang.g:366:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:370:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalMMLang.g:371:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

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
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalMMLang.g:378:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:382:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalMMLang.g:383:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalMMLang.g:383:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalMMLang.g:384:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalMMLang.g:385:2: ( rule__Class__NameAssignment_2 )
            // InternalMMLang.g:385:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalMMLang.g:393:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:397:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalMMLang.g:398:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

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
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalMMLang.g:405:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:409:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalMMLang.g:410:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalMMLang.g:410:1: ( ( rule__Class__Group_3__0 )? )
            // InternalMMLang.g:411:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalMMLang.g:412:2: ( rule__Class__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMMLang.g:412:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalMMLang.g:420:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:424:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalMMLang.g:425:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

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
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalMMLang.g:432:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:436:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalMMLang.g:437:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalMMLang.g:437:1: ( ( rule__Class__Group_4__0 )? )
            // InternalMMLang.g:438:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalMMLang.g:439:2: ( rule__Class__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMMLang.g:439:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalMMLang.g:447:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:451:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalMMLang.g:452:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

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
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalMMLang.g:459:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:463:1: ( ( '{' ) )
            // InternalMMLang.g:464:1: ( '{' )
            {
            // InternalMMLang.g:464:1: ( '{' )
            // InternalMMLang.g:465:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalMMLang.g:474:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:478:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalMMLang.g:479:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

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
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalMMLang.g:486:1: rule__Class__Group__6__Impl : ( ( rule__Class__FieldsAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:490:1: ( ( ( rule__Class__FieldsAssignment_6 )* ) )
            // InternalMMLang.g:491:1: ( ( rule__Class__FieldsAssignment_6 )* )
            {
            // InternalMMLang.g:491:1: ( ( rule__Class__FieldsAssignment_6 )* )
            // InternalMMLang.g:492:2: ( rule__Class__FieldsAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getFieldsAssignment_6()); 
            // InternalMMLang.g:493:2: ( rule__Class__FieldsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMMLang.g:493:3: rule__Class__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Class__FieldsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getFieldsAssignment_6()); 

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
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalMMLang.g:501:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:505:1: ( rule__Class__Group__7__Impl )
            // InternalMMLang.g:506:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

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
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalMMLang.g:512:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:516:1: ( ( '}' ) )
            // InternalMMLang.g:517:1: ( '}' )
            {
            // InternalMMLang.g:517:1: ( '}' )
            // InternalMMLang.g:518:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalMMLang.g:528:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:532:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalMMLang.g:533:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

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
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalMMLang.g:540:1: rule__Class__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:544:1: ( ( 'extends' ) )
            // InternalMMLang.g:545:1: ( 'extends' )
            {
            // InternalMMLang.g:545:1: ( 'extends' )
            // InternalMMLang.g:546:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalMMLang.g:555:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl rule__Class__Group_3__2 ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:559:1: ( rule__Class__Group_3__1__Impl rule__Class__Group_3__2 )
            // InternalMMLang.g:560:2: rule__Class__Group_3__1__Impl rule__Class__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2();

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
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalMMLang.g:567:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__ParentsAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:571:1: ( ( ( rule__Class__ParentsAssignment_3_1 ) ) )
            // InternalMMLang.g:572:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            {
            // InternalMMLang.g:572:1: ( ( rule__Class__ParentsAssignment_3_1 ) )
            // InternalMMLang.g:573:2: ( rule__Class__ParentsAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_1()); 
            // InternalMMLang.g:574:2: ( rule__Class__ParentsAssignment_3_1 )
            // InternalMMLang.g:574:3: rule__Class__ParentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_3_1()); 

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
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_3__2"
    // InternalMMLang.g:582:1: rule__Class__Group_3__2 : rule__Class__Group_3__2__Impl ;
    public final void rule__Class__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:586:1: ( rule__Class__Group_3__2__Impl )
            // InternalMMLang.g:587:2: rule__Class__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__2__Impl();

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
    // $ANTLR end "rule__Class__Group_3__2"


    // $ANTLR start "rule__Class__Group_3__2__Impl"
    // InternalMMLang.g:593:1: rule__Class__Group_3__2__Impl : ( ( rule__Class__Group_3_2__0 )* ) ;
    public final void rule__Class__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:597:1: ( ( ( rule__Class__Group_3_2__0 )* ) )
            // InternalMMLang.g:598:1: ( ( rule__Class__Group_3_2__0 )* )
            {
            // InternalMMLang.g:598:1: ( ( rule__Class__Group_3_2__0 )* )
            // InternalMMLang.g:599:2: ( rule__Class__Group_3_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_3_2()); 
            // InternalMMLang.g:600:2: ( rule__Class__Group_3_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMMLang.g:600:3: rule__Class__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Class__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group_3_2__0"
    // InternalMMLang.g:609:1: rule__Class__Group_3_2__0 : rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 ;
    public final void rule__Class__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:613:1: ( rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1 )
            // InternalMMLang.g:614:2: rule__Class__Group_3_2__0__Impl rule__Class__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3_2__1();

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
    // $ANTLR end "rule__Class__Group_3_2__0"


    // $ANTLR start "rule__Class__Group_3_2__0__Impl"
    // InternalMMLang.g:621:1: rule__Class__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:625:1: ( ( ',' ) )
            // InternalMMLang.g:626:1: ( ',' )
            {
            // InternalMMLang.g:626:1: ( ',' )
            // InternalMMLang.g:627:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_3_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Class__Group_3_2__0__Impl"


    // $ANTLR start "rule__Class__Group_3_2__1"
    // InternalMMLang.g:636:1: rule__Class__Group_3_2__1 : rule__Class__Group_3_2__1__Impl ;
    public final void rule__Class__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:640:1: ( rule__Class__Group_3_2__1__Impl )
            // InternalMMLang.g:641:2: rule__Class__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Class__Group_3_2__1"


    // $ANTLR start "rule__Class__Group_3_2__1__Impl"
    // InternalMMLang.g:647:1: rule__Class__Group_3_2__1__Impl : ( ( rule__Class__ParentsAssignment_3_2_1 ) ) ;
    public final void rule__Class__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:651:1: ( ( ( rule__Class__ParentsAssignment_3_2_1 ) ) )
            // InternalMMLang.g:652:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            {
            // InternalMMLang.g:652:1: ( ( rule__Class__ParentsAssignment_3_2_1 ) )
            // InternalMMLang.g:653:2: ( rule__Class__ParentsAssignment_3_2_1 )
            {
             before(grammarAccess.getClassAccess().getParentsAssignment_3_2_1()); 
            // InternalMMLang.g:654:2: ( rule__Class__ParentsAssignment_3_2_1 )
            // InternalMMLang.g:654:3: rule__Class__ParentsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Class__Group_3_2__1__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalMMLang.g:663:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:667:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalMMLang.g:668:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

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
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalMMLang.g:675:1: rule__Class__Group_4__0__Impl : ( '<' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:679:1: ( ( '<' ) )
            // InternalMMLang.g:680:1: ( '<' )
            {
            // InternalMMLang.g:680:1: ( '<' )
            // InternalMMLang.g:681:2: '<'
            {
             before(grammarAccess.getClassAccess().getLessThanSignKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLessThanSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalMMLang.g:690:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:694:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalMMLang.g:695:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2();

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
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalMMLang.g:702:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__GenericsAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:706:1: ( ( ( rule__Class__GenericsAssignment_4_1 ) ) )
            // InternalMMLang.g:707:1: ( ( rule__Class__GenericsAssignment_4_1 ) )
            {
            // InternalMMLang.g:707:1: ( ( rule__Class__GenericsAssignment_4_1 ) )
            // InternalMMLang.g:708:2: ( rule__Class__GenericsAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getGenericsAssignment_4_1()); 
            // InternalMMLang.g:709:2: ( rule__Class__GenericsAssignment_4_1 )
            // InternalMMLang.g:709:3: rule__Class__GenericsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__GenericsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGenericsAssignment_4_1()); 

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
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_4__2"
    // InternalMMLang.g:717:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl rule__Class__Group_4__3 ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:721:1: ( rule__Class__Group_4__2__Impl rule__Class__Group_4__3 )
            // InternalMMLang.g:722:2: rule__Class__Group_4__2__Impl rule__Class__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__3();

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
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // InternalMMLang.g:729:1: rule__Class__Group_4__2__Impl : ( ( rule__Class__Group_4_2__0 )* ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:733:1: ( ( ( rule__Class__Group_4_2__0 )* ) )
            // InternalMMLang.g:734:1: ( ( rule__Class__Group_4_2__0 )* )
            {
            // InternalMMLang.g:734:1: ( ( rule__Class__Group_4_2__0 )* )
            // InternalMMLang.g:735:2: ( rule__Class__Group_4_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_4_2()); 
            // InternalMMLang.g:736:2: ( rule__Class__Group_4_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMMLang.g:736:3: rule__Class__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Class__Group_4__3"
    // InternalMMLang.g:744:1: rule__Class__Group_4__3 : rule__Class__Group_4__3__Impl ;
    public final void rule__Class__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:748:1: ( rule__Class__Group_4__3__Impl )
            // InternalMMLang.g:749:2: rule__Class__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__3__Impl();

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
    // $ANTLR end "rule__Class__Group_4__3"


    // $ANTLR start "rule__Class__Group_4__3__Impl"
    // InternalMMLang.g:755:1: rule__Class__Group_4__3__Impl : ( '>' ) ;
    public final void rule__Class__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:759:1: ( ( '>' ) )
            // InternalMMLang.g:760:1: ( '>' )
            {
            // InternalMMLang.g:760:1: ( '>' )
            // InternalMMLang.g:761:2: '>'
            {
             before(grammarAccess.getClassAccess().getGreaterThanSignKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getGreaterThanSignKeyword_4_3()); 

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
    // $ANTLR end "rule__Class__Group_4__3__Impl"


    // $ANTLR start "rule__Class__Group_4_2__0"
    // InternalMMLang.g:771:1: rule__Class__Group_4_2__0 : rule__Class__Group_4_2__0__Impl rule__Class__Group_4_2__1 ;
    public final void rule__Class__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:775:1: ( rule__Class__Group_4_2__0__Impl rule__Class__Group_4_2__1 )
            // InternalMMLang.g:776:2: rule__Class__Group_4_2__0__Impl rule__Class__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4_2__1();

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
    // $ANTLR end "rule__Class__Group_4_2__0"


    // $ANTLR start "rule__Class__Group_4_2__0__Impl"
    // InternalMMLang.g:783:1: rule__Class__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:787:1: ( ( ',' ) )
            // InternalMMLang.g:788:1: ( ',' )
            {
            // InternalMMLang.g:788:1: ( ',' )
            // InternalMMLang.g:789:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Class__Group_4_2__0__Impl"


    // $ANTLR start "rule__Class__Group_4_2__1"
    // InternalMMLang.g:798:1: rule__Class__Group_4_2__1 : rule__Class__Group_4_2__1__Impl ;
    public final void rule__Class__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:802:1: ( rule__Class__Group_4_2__1__Impl )
            // InternalMMLang.g:803:2: rule__Class__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Class__Group_4_2__1"


    // $ANTLR start "rule__Class__Group_4_2__1__Impl"
    // InternalMMLang.g:809:1: rule__Class__Group_4_2__1__Impl : ( ( rule__Class__GenericsAssignment_4_2_1 ) ) ;
    public final void rule__Class__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:813:1: ( ( ( rule__Class__GenericsAssignment_4_2_1 ) ) )
            // InternalMMLang.g:814:1: ( ( rule__Class__GenericsAssignment_4_2_1 ) )
            {
            // InternalMMLang.g:814:1: ( ( rule__Class__GenericsAssignment_4_2_1 ) )
            // InternalMMLang.g:815:2: ( rule__Class__GenericsAssignment_4_2_1 )
            {
             before(grammarAccess.getClassAccess().getGenericsAssignment_4_2_1()); 
            // InternalMMLang.g:816:2: ( rule__Class__GenericsAssignment_4_2_1 )
            // InternalMMLang.g:816:3: rule__Class__GenericsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__GenericsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGenericsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Class__Group_4_2__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMMLang.g:825:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:829:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMMLang.g:830:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMMLang.g:837:1: rule__Field__Group__0__Impl : ( ( rule__Field__ContainmentAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:841:1: ( ( ( rule__Field__ContainmentAssignment_0 )? ) )
            // InternalMMLang.g:842:1: ( ( rule__Field__ContainmentAssignment_0 )? )
            {
            // InternalMMLang.g:842:1: ( ( rule__Field__ContainmentAssignment_0 )? )
            // InternalMMLang.g:843:2: ( rule__Field__ContainmentAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getContainmentAssignment_0()); 
            // InternalMMLang.g:844:2: ( rule__Field__ContainmentAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMMLang.g:844:3: rule__Field__ContainmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__ContainmentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getContainmentAssignment_0()); 

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
    // InternalMMLang.g:852:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:856:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMMLang.g:857:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMMLang.g:864:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:868:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalMMLang.g:869:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalMMLang.g:869:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalMMLang.g:870:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalMMLang.g:871:2: ( rule__Field__NameAssignment_1 )
            // InternalMMLang.g:871:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // InternalMMLang.g:879:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:883:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalMMLang.g:884:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // InternalMMLang.g:891:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:895:1: ( ( ':' ) )
            // InternalMMLang.g:896:1: ( ':' )
            {
            // InternalMMLang.g:896:1: ( ':' )
            // InternalMMLang.g:897:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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


    // $ANTLR start "rule__Field__Group__3"
    // InternalMMLang.g:906:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:910:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalMMLang.g:911:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalMMLang.g:918:1: rule__Field__Group__3__Impl : ( ( rule__Field__TypeAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:922:1: ( ( ( rule__Field__TypeAssignment_3 ) ) )
            // InternalMMLang.g:923:1: ( ( rule__Field__TypeAssignment_3 ) )
            {
            // InternalMMLang.g:923:1: ( ( rule__Field__TypeAssignment_3 ) )
            // InternalMMLang.g:924:2: ( rule__Field__TypeAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_3()); 
            // InternalMMLang.g:925:2: ( rule__Field__TypeAssignment_3 )
            // InternalMMLang.g:925:3: rule__Field__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalMMLang.g:933:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:937:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalMMLang.g:938:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalMMLang.g:945:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:949:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // InternalMMLang.g:950:1: ( ( rule__Field__Group_4__0 )? )
            {
            // InternalMMLang.g:950:1: ( ( rule__Field__Group_4__0 )? )
            // InternalMMLang.g:951:2: ( rule__Field__Group_4__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_4()); 
            // InternalMMLang.g:952:2: ( rule__Field__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMMLang.g:952:3: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalMMLang.g:960:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:964:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // InternalMMLang.g:965:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__6();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalMMLang.g:972:1: rule__Field__Group__5__Impl : ( '[' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:976:1: ( ( '[' ) )
            // InternalMMLang.g:977:1: ( '[' )
            {
            // InternalMMLang.g:977:1: ( '[' )
            // InternalMMLang.g:978:2: '['
            {
             before(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // InternalMMLang.g:987:1: rule__Field__Group__6 : rule__Field__Group__6__Impl rule__Field__Group__7 ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:991:1: ( rule__Field__Group__6__Impl rule__Field__Group__7 )
            // InternalMMLang.g:992:2: rule__Field__Group__6__Impl rule__Field__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Field__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__7();

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
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // InternalMMLang.g:999:1: rule__Field__Group__6__Impl : ( ( rule__Field__Start_cardAssignment_6 ) ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1003:1: ( ( ( rule__Field__Start_cardAssignment_6 ) ) )
            // InternalMMLang.g:1004:1: ( ( rule__Field__Start_cardAssignment_6 ) )
            {
            // InternalMMLang.g:1004:1: ( ( rule__Field__Start_cardAssignment_6 ) )
            // InternalMMLang.g:1005:2: ( rule__Field__Start_cardAssignment_6 )
            {
             before(grammarAccess.getFieldAccess().getStart_cardAssignment_6()); 
            // InternalMMLang.g:1006:2: ( rule__Field__Start_cardAssignment_6 )
            // InternalMMLang.g:1006:3: rule__Field__Start_cardAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Field__Start_cardAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getStart_cardAssignment_6()); 

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
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__Field__Group__7"
    // InternalMMLang.g:1014:1: rule__Field__Group__7 : rule__Field__Group__7__Impl rule__Field__Group__8 ;
    public final void rule__Field__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1018:1: ( rule__Field__Group__7__Impl rule__Field__Group__8 )
            // InternalMMLang.g:1019:2: rule__Field__Group__7__Impl rule__Field__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__8();

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
    // $ANTLR end "rule__Field__Group__7"


    // $ANTLR start "rule__Field__Group__7__Impl"
    // InternalMMLang.g:1026:1: rule__Field__Group__7__Impl : ( '..' ) ;
    public final void rule__Field__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1030:1: ( ( '..' ) )
            // InternalMMLang.g:1031:1: ( '..' )
            {
            // InternalMMLang.g:1031:1: ( '..' )
            // InternalMMLang.g:1032:2: '..'
            {
             before(grammarAccess.getFieldAccess().getFullStopFullStopKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFullStopFullStopKeyword_7()); 

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
    // $ANTLR end "rule__Field__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__8"
    // InternalMMLang.g:1041:1: rule__Field__Group__8 : rule__Field__Group__8__Impl rule__Field__Group__9 ;
    public final void rule__Field__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1045:1: ( rule__Field__Group__8__Impl rule__Field__Group__9 )
            // InternalMMLang.g:1046:2: rule__Field__Group__8__Impl rule__Field__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Field__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__9();

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
    // $ANTLR end "rule__Field__Group__8"


    // $ANTLR start "rule__Field__Group__8__Impl"
    // InternalMMLang.g:1053:1: rule__Field__Group__8__Impl : ( ( rule__Field__Stop_cardAssignment_8 ) ) ;
    public final void rule__Field__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1057:1: ( ( ( rule__Field__Stop_cardAssignment_8 ) ) )
            // InternalMMLang.g:1058:1: ( ( rule__Field__Stop_cardAssignment_8 ) )
            {
            // InternalMMLang.g:1058:1: ( ( rule__Field__Stop_cardAssignment_8 ) )
            // InternalMMLang.g:1059:2: ( rule__Field__Stop_cardAssignment_8 )
            {
             before(grammarAccess.getFieldAccess().getStop_cardAssignment_8()); 
            // InternalMMLang.g:1060:2: ( rule__Field__Stop_cardAssignment_8 )
            // InternalMMLang.g:1060:3: rule__Field__Stop_cardAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Field__Stop_cardAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getStop_cardAssignment_8()); 

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
    // $ANTLR end "rule__Field__Group__8__Impl"


    // $ANTLR start "rule__Field__Group__9"
    // InternalMMLang.g:1068:1: rule__Field__Group__9 : rule__Field__Group__9__Impl ;
    public final void rule__Field__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1072:1: ( rule__Field__Group__9__Impl )
            // InternalMMLang.g:1073:2: rule__Field__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__9__Impl();

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
    // $ANTLR end "rule__Field__Group__9"


    // $ANTLR start "rule__Field__Group__9__Impl"
    // InternalMMLang.g:1079:1: rule__Field__Group__9__Impl : ( ']' ) ;
    public final void rule__Field__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1083:1: ( ( ']' ) )
            // InternalMMLang.g:1084:1: ( ']' )
            {
            // InternalMMLang.g:1084:1: ( ']' )
            // InternalMMLang.g:1085:2: ']'
            {
             before(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Field__Group__9__Impl"


    // $ANTLR start "rule__Field__Group_4__0"
    // InternalMMLang.g:1095:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1099:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // InternalMMLang.g:1100:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1();

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
    // $ANTLR end "rule__Field__Group_4__0"


    // $ANTLR start "rule__Field__Group_4__0__Impl"
    // InternalMMLang.g:1107:1: rule__Field__Group_4__0__Impl : ( '<' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1111:1: ( ( '<' ) )
            // InternalMMLang.g:1112:1: ( '<' )
            {
            // InternalMMLang.g:1112:1: ( '<' )
            // InternalMMLang.g:1113:2: '<'
            {
             before(grammarAccess.getFieldAccess().getLessThanSignKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLessThanSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Field__Group_4__0__Impl"


    // $ANTLR start "rule__Field__Group_4__1"
    // InternalMMLang.g:1122:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl rule__Field__Group_4__2 ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1126:1: ( rule__Field__Group_4__1__Impl rule__Field__Group_4__2 )
            // InternalMMLang.g:1127:2: rule__Field__Group_4__1__Impl rule__Field__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__2();

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
    // $ANTLR end "rule__Field__Group_4__1"


    // $ANTLR start "rule__Field__Group_4__1__Impl"
    // InternalMMLang.g:1134:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__GenericsAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1138:1: ( ( ( rule__Field__GenericsAssignment_4_1 ) ) )
            // InternalMMLang.g:1139:1: ( ( rule__Field__GenericsAssignment_4_1 ) )
            {
            // InternalMMLang.g:1139:1: ( ( rule__Field__GenericsAssignment_4_1 ) )
            // InternalMMLang.g:1140:2: ( rule__Field__GenericsAssignment_4_1 )
            {
             before(grammarAccess.getFieldAccess().getGenericsAssignment_4_1()); 
            // InternalMMLang.g:1141:2: ( rule__Field__GenericsAssignment_4_1 )
            // InternalMMLang.g:1141:3: rule__Field__GenericsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__GenericsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGenericsAssignment_4_1()); 

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
    // $ANTLR end "rule__Field__Group_4__1__Impl"


    // $ANTLR start "rule__Field__Group_4__2"
    // InternalMMLang.g:1149:1: rule__Field__Group_4__2 : rule__Field__Group_4__2__Impl rule__Field__Group_4__3 ;
    public final void rule__Field__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1153:1: ( rule__Field__Group_4__2__Impl rule__Field__Group_4__3 )
            // InternalMMLang.g:1154:2: rule__Field__Group_4__2__Impl rule__Field__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__3();

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
    // $ANTLR end "rule__Field__Group_4__2"


    // $ANTLR start "rule__Field__Group_4__2__Impl"
    // InternalMMLang.g:1161:1: rule__Field__Group_4__2__Impl : ( ( rule__Field__Group_4_2__0 )* ) ;
    public final void rule__Field__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1165:1: ( ( ( rule__Field__Group_4_2__0 )* ) )
            // InternalMMLang.g:1166:1: ( ( rule__Field__Group_4_2__0 )* )
            {
            // InternalMMLang.g:1166:1: ( ( rule__Field__Group_4_2__0 )* )
            // InternalMMLang.g:1167:2: ( rule__Field__Group_4_2__0 )*
            {
             before(grammarAccess.getFieldAccess().getGroup_4_2()); 
            // InternalMMLang.g:1168:2: ( rule__Field__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMMLang.g:1168:3: rule__Field__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Field__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFieldAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__Field__Group_4__2__Impl"


    // $ANTLR start "rule__Field__Group_4__3"
    // InternalMMLang.g:1176:1: rule__Field__Group_4__3 : rule__Field__Group_4__3__Impl ;
    public final void rule__Field__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1180:1: ( rule__Field__Group_4__3__Impl )
            // InternalMMLang.g:1181:2: rule__Field__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_4__3__Impl();

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
    // $ANTLR end "rule__Field__Group_4__3"


    // $ANTLR start "rule__Field__Group_4__3__Impl"
    // InternalMMLang.g:1187:1: rule__Field__Group_4__3__Impl : ( '>' ) ;
    public final void rule__Field__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1191:1: ( ( '>' ) )
            // InternalMMLang.g:1192:1: ( '>' )
            {
            // InternalMMLang.g:1192:1: ( '>' )
            // InternalMMLang.g:1193:2: '>'
            {
             before(grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getGreaterThanSignKeyword_4_3()); 

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
    // $ANTLR end "rule__Field__Group_4__3__Impl"


    // $ANTLR start "rule__Field__Group_4_2__0"
    // InternalMMLang.g:1203:1: rule__Field__Group_4_2__0 : rule__Field__Group_4_2__0__Impl rule__Field__Group_4_2__1 ;
    public final void rule__Field__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1207:1: ( rule__Field__Group_4_2__0__Impl rule__Field__Group_4_2__1 )
            // InternalMMLang.g:1208:2: rule__Field__Group_4_2__0__Impl rule__Field__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4_2__1();

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
    // $ANTLR end "rule__Field__Group_4_2__0"


    // $ANTLR start "rule__Field__Group_4_2__0__Impl"
    // InternalMMLang.g:1215:1: rule__Field__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Field__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1219:1: ( ( ',' ) )
            // InternalMMLang.g:1220:1: ( ',' )
            {
            // InternalMMLang.g:1220:1: ( ',' )
            // InternalMMLang.g:1221:2: ','
            {
             before(grammarAccess.getFieldAccess().getCommaKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__Field__Group_4_2__0__Impl"


    // $ANTLR start "rule__Field__Group_4_2__1"
    // InternalMMLang.g:1230:1: rule__Field__Group_4_2__1 : rule__Field__Group_4_2__1__Impl ;
    public final void rule__Field__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1234:1: ( rule__Field__Group_4_2__1__Impl )
            // InternalMMLang.g:1235:2: rule__Field__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Field__Group_4_2__1"


    // $ANTLR start "rule__Field__Group_4_2__1__Impl"
    // InternalMMLang.g:1241:1: rule__Field__Group_4_2__1__Impl : ( ( rule__Field__GenericsAssignment_4_2_1 ) ) ;
    public final void rule__Field__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1245:1: ( ( ( rule__Field__GenericsAssignment_4_2_1 ) ) )
            // InternalMMLang.g:1246:1: ( ( rule__Field__GenericsAssignment_4_2_1 ) )
            {
            // InternalMMLang.g:1246:1: ( ( rule__Field__GenericsAssignment_4_2_1 ) )
            // InternalMMLang.g:1247:2: ( rule__Field__GenericsAssignment_4_2_1 )
            {
             before(grammarAccess.getFieldAccess().getGenericsAssignment_4_2_1()); 
            // InternalMMLang.g:1248:2: ( rule__Field__GenericsAssignment_4_2_1 )
            // InternalMMLang.g:1248:3: rule__Field__GenericsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__GenericsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGenericsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Field__Group_4_2__1__Impl"


    // $ANTLR start "rule__Card__Group_0__0"
    // InternalMMLang.g:1257:1: rule__Card__Group_0__0 : rule__Card__Group_0__0__Impl rule__Card__Group_0__1 ;
    public final void rule__Card__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1261:1: ( rule__Card__Group_0__0__Impl rule__Card__Group_0__1 )
            // InternalMMLang.g:1262:2: rule__Card__Group_0__0__Impl rule__Card__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Card__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_0__1();

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
    // $ANTLR end "rule__Card__Group_0__0"


    // $ANTLR start "rule__Card__Group_0__0__Impl"
    // InternalMMLang.g:1269:1: rule__Card__Group_0__0__Impl : ( () ) ;
    public final void rule__Card__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1273:1: ( ( () ) )
            // InternalMMLang.g:1274:1: ( () )
            {
            // InternalMMLang.g:1274:1: ( () )
            // InternalMMLang.g:1275:2: ()
            {
             before(grammarAccess.getCardAccess().getCard0Action_0_0()); 
            // InternalMMLang.g:1276:2: ()
            // InternalMMLang.g:1276:3: 
            {
            }

             after(grammarAccess.getCardAccess().getCard0Action_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_0__0__Impl"


    // $ANTLR start "rule__Card__Group_0__1"
    // InternalMMLang.g:1284:1: rule__Card__Group_0__1 : rule__Card__Group_0__1__Impl ;
    public final void rule__Card__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1288:1: ( rule__Card__Group_0__1__Impl )
            // InternalMMLang.g:1289:2: rule__Card__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_0__1__Impl();

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
    // $ANTLR end "rule__Card__Group_0__1"


    // $ANTLR start "rule__Card__Group_0__1__Impl"
    // InternalMMLang.g:1295:1: rule__Card__Group_0__1__Impl : ( '0' ) ;
    public final void rule__Card__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1299:1: ( ( '0' ) )
            // InternalMMLang.g:1300:1: ( '0' )
            {
            // InternalMMLang.g:1300:1: ( '0' )
            // InternalMMLang.g:1301:2: '0'
            {
             before(grammarAccess.getCardAccess().getDigitZeroKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getDigitZeroKeyword_0_1()); 

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
    // $ANTLR end "rule__Card__Group_0__1__Impl"


    // $ANTLR start "rule__Card__Group_1__0"
    // InternalMMLang.g:1311:1: rule__Card__Group_1__0 : rule__Card__Group_1__0__Impl rule__Card__Group_1__1 ;
    public final void rule__Card__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1315:1: ( rule__Card__Group_1__0__Impl rule__Card__Group_1__1 )
            // InternalMMLang.g:1316:2: rule__Card__Group_1__0__Impl rule__Card__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Card__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_1__1();

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
    // $ANTLR end "rule__Card__Group_1__0"


    // $ANTLR start "rule__Card__Group_1__0__Impl"
    // InternalMMLang.g:1323:1: rule__Card__Group_1__0__Impl : ( () ) ;
    public final void rule__Card__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1327:1: ( ( () ) )
            // InternalMMLang.g:1328:1: ( () )
            {
            // InternalMMLang.g:1328:1: ( () )
            // InternalMMLang.g:1329:2: ()
            {
             before(grammarAccess.getCardAccess().getCard1Action_1_0()); 
            // InternalMMLang.g:1330:2: ()
            // InternalMMLang.g:1330:3: 
            {
            }

             after(grammarAccess.getCardAccess().getCard1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_1__0__Impl"


    // $ANTLR start "rule__Card__Group_1__1"
    // InternalMMLang.g:1338:1: rule__Card__Group_1__1 : rule__Card__Group_1__1__Impl ;
    public final void rule__Card__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1342:1: ( rule__Card__Group_1__1__Impl )
            // InternalMMLang.g:1343:2: rule__Card__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_1__1__Impl();

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
    // $ANTLR end "rule__Card__Group_1__1"


    // $ANTLR start "rule__Card__Group_1__1__Impl"
    // InternalMMLang.g:1349:1: rule__Card__Group_1__1__Impl : ( '1' ) ;
    public final void rule__Card__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1353:1: ( ( '1' ) )
            // InternalMMLang.g:1354:1: ( '1' )
            {
            // InternalMMLang.g:1354:1: ( '1' )
            // InternalMMLang.g:1355:2: '1'
            {
             before(grammarAccess.getCardAccess().getDigitOneKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getDigitOneKeyword_1_1()); 

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
    // $ANTLR end "rule__Card__Group_1__1__Impl"


    // $ANTLR start "rule__Card__Group_2__0"
    // InternalMMLang.g:1365:1: rule__Card__Group_2__0 : rule__Card__Group_2__0__Impl rule__Card__Group_2__1 ;
    public final void rule__Card__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1369:1: ( rule__Card__Group_2__0__Impl rule__Card__Group_2__1 )
            // InternalMMLang.g:1370:2: rule__Card__Group_2__0__Impl rule__Card__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Card__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Card__Group_2__1();

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
    // $ANTLR end "rule__Card__Group_2__0"


    // $ANTLR start "rule__Card__Group_2__0__Impl"
    // InternalMMLang.g:1377:1: rule__Card__Group_2__0__Impl : ( () ) ;
    public final void rule__Card__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1381:1: ( ( () ) )
            // InternalMMLang.g:1382:1: ( () )
            {
            // InternalMMLang.g:1382:1: ( () )
            // InternalMMLang.g:1383:2: ()
            {
             before(grammarAccess.getCardAccess().getCardInfAction_2_0()); 
            // InternalMMLang.g:1384:2: ()
            // InternalMMLang.g:1384:3: 
            {
            }

             after(grammarAccess.getCardAccess().getCardInfAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Card__Group_2__0__Impl"


    // $ANTLR start "rule__Card__Group_2__1"
    // InternalMMLang.g:1392:1: rule__Card__Group_2__1 : rule__Card__Group_2__1__Impl ;
    public final void rule__Card__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1396:1: ( rule__Card__Group_2__1__Impl )
            // InternalMMLang.g:1397:2: rule__Card__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Card__Group_2__1__Impl();

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
    // $ANTLR end "rule__Card__Group_2__1"


    // $ANTLR start "rule__Card__Group_2__1__Impl"
    // InternalMMLang.g:1403:1: rule__Card__Group_2__1__Impl : ( '*' ) ;
    public final void rule__Card__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1407:1: ( ( '*' ) )
            // InternalMMLang.g:1408:1: ( '*' )
            {
            // InternalMMLang.g:1408:1: ( '*' )
            // InternalMMLang.g:1409:2: '*'
            {
             before(grammarAccess.getCardAccess().getAsteriskKeyword_2_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCardAccess().getAsteriskKeyword_2_1()); 

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
    // $ANTLR end "rule__Card__Group_2__1__Impl"


    // $ANTLR start "rule__Metamodel__ConcreteAssignment_0"
    // InternalMMLang.g:1419:1: rule__Metamodel__ConcreteAssignment_0 : ( ( 'concrete' ) ) ;
    public final void rule__Metamodel__ConcreteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1423:1: ( ( ( 'concrete' ) ) )
            // InternalMMLang.g:1424:2: ( ( 'concrete' ) )
            {
            // InternalMMLang.g:1424:2: ( ( 'concrete' ) )
            // InternalMMLang.g:1425:3: ( 'concrete' )
            {
             before(grammarAccess.getMetamodelAccess().getConcreteConcreteKeyword_0_0()); 
            // InternalMMLang.g:1426:3: ( 'concrete' )
            // InternalMMLang.g:1427:4: 'concrete'
            {
             before(grammarAccess.getMetamodelAccess().getConcreteConcreteKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMetamodelAccess().getConcreteConcreteKeyword_0_0()); 

            }

             after(grammarAccess.getMetamodelAccess().getConcreteConcreteKeyword_0_0()); 

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
    // $ANTLR end "rule__Metamodel__ConcreteAssignment_0"


    // $ANTLR start "rule__Metamodel__NameAssignment_2"
    // InternalMMLang.g:1438:1: rule__Metamodel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1442:1: ( ( RULE_ID ) )
            // InternalMMLang.g:1443:2: ( RULE_ID )
            {
            // InternalMMLang.g:1443:2: ( RULE_ID )
            // InternalMMLang.g:1444:3: RULE_ID
            {
             before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Metamodel__NameAssignment_2"


    // $ANTLR start "rule__Metamodel__ClassesAssignment_3"
    // InternalMMLang.g:1453:1: rule__Metamodel__ClassesAssignment_3 : ( ruleClass ) ;
    public final void rule__Metamodel__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1457:1: ( ( ruleClass ) )
            // InternalMMLang.g:1458:2: ( ruleClass )
            {
            // InternalMMLang.g:1458:2: ( ruleClass )
            // InternalMMLang.g:1459:3: ruleClass
            {
             before(grammarAccess.getMetamodelAccess().getClassesClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getMetamodelAccess().getClassesClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Metamodel__ClassesAssignment_3"


    // $ANTLR start "rule__Class__AbstractAssignment_0"
    // InternalMMLang.g:1468:1: rule__Class__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1472:1: ( ( ( 'abstract' ) ) )
            // InternalMMLang.g:1473:2: ( ( 'abstract' ) )
            {
            // InternalMMLang.g:1473:2: ( ( 'abstract' ) )
            // InternalMMLang.g:1474:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalMMLang.g:1475:3: ( 'abstract' )
            // InternalMMLang.g:1476:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__Class__AbstractAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalMMLang.g:1487:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1491:1: ( ( RULE_ID ) )
            // InternalMMLang.g:1492:2: ( RULE_ID )
            {
            // InternalMMLang.g:1492:2: ( RULE_ID )
            // InternalMMLang.g:1493:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__ParentsAssignment_3_1"
    // InternalMMLang.g:1502:1: rule__Class__ParentsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1506:1: ( ( ( RULE_ID ) ) )
            // InternalMMLang.g:1507:2: ( ( RULE_ID ) )
            {
            // InternalMMLang.g:1507:2: ( ( RULE_ID ) )
            // InternalMMLang.g:1508:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0()); 
            // InternalMMLang.g:1509:3: ( RULE_ID )
            // InternalMMLang.g:1510:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Class__ParentsAssignment_3_1"


    // $ANTLR start "rule__Class__ParentsAssignment_3_2_1"
    // InternalMMLang.g:1521:1: rule__Class__ParentsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1525:1: ( ( ( RULE_ID ) ) )
            // InternalMMLang.g:1526:2: ( ( RULE_ID ) )
            {
            // InternalMMLang.g:1526:2: ( ( RULE_ID ) )
            // InternalMMLang.g:1527:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0()); 
            // InternalMMLang.g:1528:3: ( RULE_ID )
            // InternalMMLang.g:1529:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentsClassIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentsClassCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__Class__ParentsAssignment_3_2_1"


    // $ANTLR start "rule__Class__GenericsAssignment_4_1"
    // InternalMMLang.g:1540:1: rule__Class__GenericsAssignment_4_1 : ( ruleGeneric ) ;
    public final void rule__Class__GenericsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1544:1: ( ( ruleGeneric ) )
            // InternalMMLang.g:1545:2: ( ruleGeneric )
            {
            // InternalMMLang.g:1545:2: ( ruleGeneric )
            // InternalMMLang.g:1546:3: ruleGeneric
            {
             before(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Class__GenericsAssignment_4_1"


    // $ANTLR start "rule__Class__GenericsAssignment_4_2_1"
    // InternalMMLang.g:1555:1: rule__Class__GenericsAssignment_4_2_1 : ( ruleGeneric ) ;
    public final void rule__Class__GenericsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1559:1: ( ( ruleGeneric ) )
            // InternalMMLang.g:1560:2: ( ruleGeneric )
            {
            // InternalMMLang.g:1560:2: ( ruleGeneric )
            // InternalMMLang.g:1561:3: ruleGeneric
            {
             before(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGeneric();

            state._fsp--;

             after(grammarAccess.getClassAccess().getGenericsGenericParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__Class__GenericsAssignment_4_2_1"


    // $ANTLR start "rule__Class__FieldsAssignment_6"
    // InternalMMLang.g:1570:1: rule__Class__FieldsAssignment_6 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1574:1: ( ( ruleField ) )
            // InternalMMLang.g:1575:2: ( ruleField )
            {
            // InternalMMLang.g:1575:2: ( ruleField )
            // InternalMMLang.g:1576:3: ruleField
            {
             before(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Class__FieldsAssignment_6"


    // $ANTLR start "rule__Generic__NameAssignment"
    // InternalMMLang.g:1585:1: rule__Generic__NameAssignment : ( RULE_ID ) ;
    public final void rule__Generic__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1589:1: ( ( RULE_ID ) )
            // InternalMMLang.g:1590:2: ( RULE_ID )
            {
            // InternalMMLang.g:1590:2: ( RULE_ID )
            // InternalMMLang.g:1591:3: RULE_ID
            {
             before(grammarAccess.getGenericAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGenericAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Generic__NameAssignment"


    // $ANTLR start "rule__Field__ContainmentAssignment_0"
    // InternalMMLang.g:1600:1: rule__Field__ContainmentAssignment_0 : ( ( '@' ) ) ;
    public final void rule__Field__ContainmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1604:1: ( ( ( '@' ) ) )
            // InternalMMLang.g:1605:2: ( ( '@' ) )
            {
            // InternalMMLang.g:1605:2: ( ( '@' ) )
            // InternalMMLang.g:1606:3: ( '@' )
            {
             before(grammarAccess.getFieldAccess().getContainmentCommercialAtKeyword_0_0()); 
            // InternalMMLang.g:1607:3: ( '@' )
            // InternalMMLang.g:1608:4: '@'
            {
             before(grammarAccess.getFieldAccess().getContainmentCommercialAtKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getContainmentCommercialAtKeyword_0_0()); 

            }

             after(grammarAccess.getFieldAccess().getContainmentCommercialAtKeyword_0_0()); 

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
    // $ANTLR end "rule__Field__ContainmentAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalMMLang.g:1619:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1623:1: ( ( RULE_ID ) )
            // InternalMMLang.g:1624:2: ( RULE_ID )
            {
            // InternalMMLang.g:1624:2: ( RULE_ID )
            // InternalMMLang.g:1625:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_3"
    // InternalMMLang.g:1634:1: rule__Field__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Field__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1638:1: ( ( ( RULE_ID ) ) )
            // InternalMMLang.g:1639:2: ( ( RULE_ID ) )
            {
            // InternalMMLang.g:1639:2: ( ( RULE_ID ) )
            // InternalMMLang.g:1640:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getTypeReferenceCrossReference_3_0()); 
            // InternalMMLang.g:1641:3: ( RULE_ID )
            // InternalMMLang.g:1642:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getTypeReferenceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeReferenceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeReferenceCrossReference_3_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_3"


    // $ANTLR start "rule__Field__GenericsAssignment_4_1"
    // InternalMMLang.g:1653:1: rule__Field__GenericsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__GenericsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1657:1: ( ( ( RULE_ID ) ) )
            // InternalMMLang.g:1658:2: ( ( RULE_ID ) )
            {
            // InternalMMLang.g:1658:2: ( ( RULE_ID ) )
            // InternalMMLang.g:1659:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_1_0()); 
            // InternalMMLang.g:1660:3: ( RULE_ID )
            // InternalMMLang.g:1661:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getGenericsReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getGenericsReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Field__GenericsAssignment_4_1"


    // $ANTLR start "rule__Field__GenericsAssignment_4_2_1"
    // InternalMMLang.g:1672:1: rule__Field__GenericsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Field__GenericsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1676:1: ( ( ( RULE_ID ) ) )
            // InternalMMLang.g:1677:2: ( ( RULE_ID ) )
            {
            // InternalMMLang.g:1677:2: ( ( RULE_ID ) )
            // InternalMMLang.g:1678:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_2_1_0()); 
            // InternalMMLang.g:1679:3: ( RULE_ID )
            // InternalMMLang.g:1680:4: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getGenericsReferenceIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getGenericsReferenceIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getGenericsReferenceCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__Field__GenericsAssignment_4_2_1"


    // $ANTLR start "rule__Field__Start_cardAssignment_6"
    // InternalMMLang.g:1691:1: rule__Field__Start_cardAssignment_6 : ( ruleCard ) ;
    public final void rule__Field__Start_cardAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1695:1: ( ( ruleCard ) )
            // InternalMMLang.g:1696:2: ( ruleCard )
            {
            // InternalMMLang.g:1696:2: ( ruleCard )
            // InternalMMLang.g:1697:3: ruleCard
            {
             before(grammarAccess.getFieldAccess().getStart_cardCardParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getStart_cardCardParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Field__Start_cardAssignment_6"


    // $ANTLR start "rule__Field__Stop_cardAssignment_8"
    // InternalMMLang.g:1706:1: rule__Field__Stop_cardAssignment_8 : ( ruleCard ) ;
    public final void rule__Field__Stop_cardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMLang.g:1710:1: ( ( ruleCard ) )
            // InternalMMLang.g:1711:2: ( ruleCard )
            {
            // InternalMMLang.g:1711:2: ( ruleCard )
            // InternalMMLang.g:1712:3: ruleCard
            {
             before(grammarAccess.getFieldAccess().getStop_cardCardParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCard();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getStop_cardCardParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Field__Stop_cardAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});

}