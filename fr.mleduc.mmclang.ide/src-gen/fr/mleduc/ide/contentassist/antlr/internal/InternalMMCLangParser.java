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
import fr.mleduc.services.MMCLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMMCLangParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MMCLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComposition"
    // InternalMMCLang.g:53:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalMMCLang.g:54:1: ( ruleComposition EOF )
            // InternalMMCLang.g:55:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalMMCLang.g:62:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:66:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalMMCLang.g:67:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalMMCLang.g:67:2: ( ( rule__Composition__Group__0 ) )
            // InternalMMCLang.g:68:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalMMCLang.g:69:3: ( rule__Composition__Group__0 )
            // InternalMMCLang.g:69:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleOperation"
    // InternalMMCLang.g:78:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMMCLang.g:79:1: ( ruleOperation EOF )
            // InternalMMCLang.g:80:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMMCLang.g:87:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:91:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMMCLang.g:92:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMMCLang.g:92:2: ( ( rule__Operation__Alternatives ) )
            // InternalMMCLang.g:93:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMMCLang.g:94:3: ( rule__Operation__Alternatives )
            // InternalMMCLang.g:94:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRulePair"
    // InternalMMCLang.g:103:1: entryRulePair : rulePair EOF ;
    public final void entryRulePair() throws RecognitionException {
        try {
            // InternalMMCLang.g:104:1: ( rulePair EOF )
            // InternalMMCLang.g:105:1: rulePair EOF
            {
             before(grammarAccess.getPairRule()); 
            pushFollow(FOLLOW_1);
            rulePair();

            state._fsp--;

             after(grammarAccess.getPairRule()); 
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
    // $ANTLR end "entryRulePair"


    // $ANTLR start "rulePair"
    // InternalMMCLang.g:112:1: rulePair : ( ( rule__Pair__Group__0 ) ) ;
    public final void rulePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:116:2: ( ( ( rule__Pair__Group__0 ) ) )
            // InternalMMCLang.g:117:2: ( ( rule__Pair__Group__0 ) )
            {
            // InternalMMCLang.g:117:2: ( ( rule__Pair__Group__0 ) )
            // InternalMMCLang.g:118:3: ( rule__Pair__Group__0 )
            {
             before(grammarAccess.getPairAccess().getGroup()); 
            // InternalMMCLang.g:119:3: ( rule__Pair__Group__0 )
            // InternalMMCLang.g:119:4: rule__Pair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getGroup()); 

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
    // $ANTLR end "rulePair"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMMCLang.g:127:1: rule__Operation__Alternatives : ( ( ( rule__Operation__Group_0__0 ) ) | ( ( rule__Operation__Group_1__0 ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:131:1: ( ( ( rule__Operation__Group_0__0 ) ) | ( ( rule__Operation__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMMCLang.g:132:2: ( ( rule__Operation__Group_0__0 ) )
                    {
                    // InternalMMCLang.g:132:2: ( ( rule__Operation__Group_0__0 ) )
                    // InternalMMCLang.g:133:3: ( rule__Operation__Group_0__0 )
                    {
                     before(grammarAccess.getOperationAccess().getGroup_0()); 
                    // InternalMMCLang.g:134:3: ( rule__Operation__Group_0__0 )
                    // InternalMMCLang.g:134:4: rule__Operation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMMCLang.g:138:2: ( ( rule__Operation__Group_1__0 ) )
                    {
                    // InternalMMCLang.g:138:2: ( ( rule__Operation__Group_1__0 ) )
                    // InternalMMCLang.g:139:3: ( rule__Operation__Group_1__0 )
                    {
                     before(grammarAccess.getOperationAccess().getGroup_1()); 
                    // InternalMMCLang.g:140:3: ( rule__Operation__Group_1__0 )
                    // InternalMMCLang.g:140:4: rule__Operation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalMMCLang.g:148:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:152:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalMMCLang.g:153:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

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
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalMMCLang.g:160:1: rule__Composition__Group__0__Impl : ( 'package' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:164:1: ( ( 'package' ) )
            // InternalMMCLang.g:165:1: ( 'package' )
            {
            // InternalMMCLang.g:165:1: ( 'package' )
            // InternalMMCLang.g:166:2: 'package'
            {
             before(grammarAccess.getCompositionAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalMMCLang.g:175:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:179:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalMMCLang.g:180:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

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
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalMMCLang.g:187:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:191:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalMMCLang.g:192:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalMMCLang.g:192:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalMMCLang.g:193:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalMMCLang.g:194:2: ( rule__Composition__NameAssignment_1 )
            // InternalMMCLang.g:194:3: rule__Composition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalMMCLang.g:202:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:206:1: ( rule__Composition__Group__2__Impl )
            // InternalMMCLang.g:207:2: rule__Composition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__2__Impl();

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
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalMMCLang.g:213:1: rule__Composition__Group__2__Impl : ( ( rule__Composition__OperationsAssignment_2 )* ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:217:1: ( ( ( rule__Composition__OperationsAssignment_2 )* ) )
            // InternalMMCLang.g:218:1: ( ( rule__Composition__OperationsAssignment_2 )* )
            {
            // InternalMMCLang.g:218:1: ( ( rule__Composition__OperationsAssignment_2 )* )
            // InternalMMCLang.g:219:2: ( rule__Composition__OperationsAssignment_2 )*
            {
             before(grammarAccess.getCompositionAccess().getOperationsAssignment_2()); 
            // InternalMMCLang.g:220:2: ( rule__Composition__OperationsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMMCLang.g:220:3: rule__Composition__OperationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Composition__OperationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCompositionAccess().getOperationsAssignment_2()); 

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
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group_0__0"
    // InternalMMCLang.g:229:1: rule__Operation__Group_0__0 : rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1 ;
    public final void rule__Operation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:233:1: ( rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1 )
            // InternalMMCLang.g:234:2: rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__1();

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
    // $ANTLR end "rule__Operation__Group_0__0"


    // $ANTLR start "rule__Operation__Group_0__0__Impl"
    // InternalMMCLang.g:241:1: rule__Operation__Group_0__0__Impl : ( () ) ;
    public final void rule__Operation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:245:1: ( ( () ) )
            // InternalMMCLang.g:246:1: ( () )
            {
            // InternalMMCLang.g:246:1: ( () )
            // InternalMMCLang.g:247:2: ()
            {
             before(grammarAccess.getOperationAccess().getMergeAction_0_0()); 
            // InternalMMCLang.g:248:2: ()
            // InternalMMCLang.g:248:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getMergeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__0__Impl"


    // $ANTLR start "rule__Operation__Group_0__1"
    // InternalMMCLang.g:256:1: rule__Operation__Group_0__1 : rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2 ;
    public final void rule__Operation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:260:1: ( rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2 )
            // InternalMMCLang.g:261:2: rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__2();

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
    // $ANTLR end "rule__Operation__Group_0__1"


    // $ANTLR start "rule__Operation__Group_0__1__Impl"
    // InternalMMCLang.g:268:1: rule__Operation__Group_0__1__Impl : ( 'merge' ) ;
    public final void rule__Operation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:272:1: ( ( 'merge' ) )
            // InternalMMCLang.g:273:1: ( 'merge' )
            {
            // InternalMMCLang.g:273:1: ( 'merge' )
            // InternalMMCLang.g:274:2: 'merge'
            {
             before(grammarAccess.getOperationAccess().getMergeKeyword_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getMergeKeyword_0_1()); 

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
    // $ANTLR end "rule__Operation__Group_0__1__Impl"


    // $ANTLR start "rule__Operation__Group_0__2"
    // InternalMMCLang.g:283:1: rule__Operation__Group_0__2 : rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3 ;
    public final void rule__Operation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:287:1: ( rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3 )
            // InternalMMCLang.g:288:2: rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__3();

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
    // $ANTLR end "rule__Operation__Group_0__2"


    // $ANTLR start "rule__Operation__Group_0__2__Impl"
    // InternalMMCLang.g:295:1: rule__Operation__Group_0__2__Impl : ( ( rule__Operation__MetamodelAssignment_0_2 ) ) ;
    public final void rule__Operation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:299:1: ( ( ( rule__Operation__MetamodelAssignment_0_2 ) ) )
            // InternalMMCLang.g:300:1: ( ( rule__Operation__MetamodelAssignment_0_2 ) )
            {
            // InternalMMCLang.g:300:1: ( ( rule__Operation__MetamodelAssignment_0_2 ) )
            // InternalMMCLang.g:301:2: ( rule__Operation__MetamodelAssignment_0_2 )
            {
             before(grammarAccess.getOperationAccess().getMetamodelAssignment_0_2()); 
            // InternalMMCLang.g:302:2: ( rule__Operation__MetamodelAssignment_0_2 )
            // InternalMMCLang.g:302:3: rule__Operation__MetamodelAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__MetamodelAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getMetamodelAssignment_0_2()); 

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
    // $ANTLR end "rule__Operation__Group_0__2__Impl"


    // $ANTLR start "rule__Operation__Group_0__3"
    // InternalMMCLang.g:310:1: rule__Operation__Group_0__3 : rule__Operation__Group_0__3__Impl ;
    public final void rule__Operation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:314:1: ( rule__Operation__Group_0__3__Impl )
            // InternalMMCLang.g:315:2: rule__Operation__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__3__Impl();

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
    // $ANTLR end "rule__Operation__Group_0__3"


    // $ANTLR start "rule__Operation__Group_0__3__Impl"
    // InternalMMCLang.g:321:1: rule__Operation__Group_0__3__Impl : ( ( rule__Operation__Group_0_3__0 )? ) ;
    public final void rule__Operation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:325:1: ( ( ( rule__Operation__Group_0_3__0 )? ) )
            // InternalMMCLang.g:326:1: ( ( rule__Operation__Group_0_3__0 )? )
            {
            // InternalMMCLang.g:326:1: ( ( rule__Operation__Group_0_3__0 )? )
            // InternalMMCLang.g:327:2: ( rule__Operation__Group_0_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_0_3()); 
            // InternalMMCLang.g:328:2: ( rule__Operation__Group_0_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMMCLang.g:328:3: rule__Operation__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_0_3()); 

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
    // $ANTLR end "rule__Operation__Group_0__3__Impl"


    // $ANTLR start "rule__Operation__Group_0_3__0"
    // InternalMMCLang.g:337:1: rule__Operation__Group_0_3__0 : rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1 ;
    public final void rule__Operation__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:341:1: ( rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1 )
            // InternalMMCLang.g:342:2: rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3__1();

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
    // $ANTLR end "rule__Operation__Group_0_3__0"


    // $ANTLR start "rule__Operation__Group_0_3__0__Impl"
    // InternalMMCLang.g:349:1: rule__Operation__Group_0_3__0__Impl : ( 'renaming' ) ;
    public final void rule__Operation__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:353:1: ( ( 'renaming' ) )
            // InternalMMCLang.g:354:1: ( 'renaming' )
            {
            // InternalMMCLang.g:354:1: ( 'renaming' )
            // InternalMMCLang.g:355:2: 'renaming'
            {
             before(grammarAccess.getOperationAccess().getRenamingKeyword_0_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRenamingKeyword_0_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_0_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_0_3__1"
    // InternalMMCLang.g:364:1: rule__Operation__Group_0_3__1 : rule__Operation__Group_0_3__1__Impl ;
    public final void rule__Operation__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:368:1: ( rule__Operation__Group_0_3__1__Impl )
            // InternalMMCLang.g:369:2: rule__Operation__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_0_3__1"


    // $ANTLR start "rule__Operation__Group_0_3__1__Impl"
    // InternalMMCLang.g:375:1: rule__Operation__Group_0_3__1__Impl : ( ( rule__Operation__PairsAssignment_0_3_1 ) ) ;
    public final void rule__Operation__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:379:1: ( ( ( rule__Operation__PairsAssignment_0_3_1 ) ) )
            // InternalMMCLang.g:380:1: ( ( rule__Operation__PairsAssignment_0_3_1 ) )
            {
            // InternalMMCLang.g:380:1: ( ( rule__Operation__PairsAssignment_0_3_1 ) )
            // InternalMMCLang.g:381:2: ( rule__Operation__PairsAssignment_0_3_1 )
            {
             before(grammarAccess.getOperationAccess().getPairsAssignment_0_3_1()); 
            // InternalMMCLang.g:382:2: ( rule__Operation__PairsAssignment_0_3_1 )
            // InternalMMCLang.g:382:3: rule__Operation__PairsAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__PairsAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getPairsAssignment_0_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_0_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__0"
    // InternalMMCLang.g:391:1: rule__Operation__Group_1__0 : rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 ;
    public final void rule__Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:395:1: ( rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 )
            // InternalMMCLang.g:396:2: rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__1();

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
    // $ANTLR end "rule__Operation__Group_1__0"


    // $ANTLR start "rule__Operation__Group_1__0__Impl"
    // InternalMMCLang.g:403:1: rule__Operation__Group_1__0__Impl : ( () ) ;
    public final void rule__Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:407:1: ( ( () ) )
            // InternalMMCLang.g:408:1: ( () )
            {
            // InternalMMCLang.g:408:1: ( () )
            // InternalMMCLang.g:409:2: ()
            {
             before(grammarAccess.getOperationAccess().getSliceAction_1_0()); 
            // InternalMMCLang.g:410:2: ()
            // InternalMMCLang.g:410:3: 
            {
            }

             after(grammarAccess.getOperationAccess().getSliceAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_1__1"
    // InternalMMCLang.g:418:1: rule__Operation__Group_1__1 : rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 ;
    public final void rule__Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:422:1: ( rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 )
            // InternalMMCLang.g:423:2: rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__2();

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
    // $ANTLR end "rule__Operation__Group_1__1"


    // $ANTLR start "rule__Operation__Group_1__1__Impl"
    // InternalMMCLang.g:430:1: rule__Operation__Group_1__1__Impl : ( 'slice' ) ;
    public final void rule__Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:434:1: ( ( 'slice' ) )
            // InternalMMCLang.g:435:1: ( 'slice' )
            {
            // InternalMMCLang.g:435:1: ( 'slice' )
            // InternalMMCLang.g:436:2: 'slice'
            {
             before(grammarAccess.getOperationAccess().getSliceKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSliceKeyword_1_1()); 

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
    // $ANTLR end "rule__Operation__Group_1__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__2"
    // InternalMMCLang.g:445:1: rule__Operation__Group_1__2 : rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3 ;
    public final void rule__Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:449:1: ( rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3 )
            // InternalMMCLang.g:450:2: rule__Operation__Group_1__2__Impl rule__Operation__Group_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Operation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__3();

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
    // $ANTLR end "rule__Operation__Group_1__2"


    // $ANTLR start "rule__Operation__Group_1__2__Impl"
    // InternalMMCLang.g:457:1: rule__Operation__Group_1__2__Impl : ( ( rule__Operation__MetamodelAssignment_1_2 ) ) ;
    public final void rule__Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:461:1: ( ( ( rule__Operation__MetamodelAssignment_1_2 ) ) )
            // InternalMMCLang.g:462:1: ( ( rule__Operation__MetamodelAssignment_1_2 ) )
            {
            // InternalMMCLang.g:462:1: ( ( rule__Operation__MetamodelAssignment_1_2 ) )
            // InternalMMCLang.g:463:2: ( rule__Operation__MetamodelAssignment_1_2 )
            {
             before(grammarAccess.getOperationAccess().getMetamodelAssignment_1_2()); 
            // InternalMMCLang.g:464:2: ( rule__Operation__MetamodelAssignment_1_2 )
            // InternalMMCLang.g:464:3: rule__Operation__MetamodelAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__MetamodelAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getMetamodelAssignment_1_2()); 

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
    // $ANTLR end "rule__Operation__Group_1__2__Impl"


    // $ANTLR start "rule__Operation__Group_1__3"
    // InternalMMCLang.g:472:1: rule__Operation__Group_1__3 : rule__Operation__Group_1__3__Impl rule__Operation__Group_1__4 ;
    public final void rule__Operation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:476:1: ( rule__Operation__Group_1__3__Impl rule__Operation__Group_1__4 )
            // InternalMMCLang.g:477:2: rule__Operation__Group_1__3__Impl rule__Operation__Group_1__4
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__4();

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
    // $ANTLR end "rule__Operation__Group_1__3"


    // $ANTLR start "rule__Operation__Group_1__3__Impl"
    // InternalMMCLang.g:484:1: rule__Operation__Group_1__3__Impl : ( 'on' ) ;
    public final void rule__Operation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:488:1: ( ( 'on' ) )
            // InternalMMCLang.g:489:1: ( 'on' )
            {
            // InternalMMCLang.g:489:1: ( 'on' )
            // InternalMMCLang.g:490:2: 'on'
            {
             before(grammarAccess.getOperationAccess().getOnKeyword_1_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOnKeyword_1_3()); 

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
    // $ANTLR end "rule__Operation__Group_1__3__Impl"


    // $ANTLR start "rule__Operation__Group_1__4"
    // InternalMMCLang.g:499:1: rule__Operation__Group_1__4 : rule__Operation__Group_1__4__Impl ;
    public final void rule__Operation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:503:1: ( rule__Operation__Group_1__4__Impl )
            // InternalMMCLang.g:504:2: rule__Operation__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__4__Impl();

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
    // $ANTLR end "rule__Operation__Group_1__4"


    // $ANTLR start "rule__Operation__Group_1__4__Impl"
    // InternalMMCLang.g:510:1: rule__Operation__Group_1__4__Impl : ( ( rule__Operation__TargetsAssignment_1_4 )* ) ;
    public final void rule__Operation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:514:1: ( ( ( rule__Operation__TargetsAssignment_1_4 )* ) )
            // InternalMMCLang.g:515:1: ( ( rule__Operation__TargetsAssignment_1_4 )* )
            {
            // InternalMMCLang.g:515:1: ( ( rule__Operation__TargetsAssignment_1_4 )* )
            // InternalMMCLang.g:516:2: ( rule__Operation__TargetsAssignment_1_4 )*
            {
             before(grammarAccess.getOperationAccess().getTargetsAssignment_1_4()); 
            // InternalMMCLang.g:517:2: ( rule__Operation__TargetsAssignment_1_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMMCLang.g:517:3: rule__Operation__TargetsAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Operation__TargetsAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getTargetsAssignment_1_4()); 

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
    // $ANTLR end "rule__Operation__Group_1__4__Impl"


    // $ANTLR start "rule__Pair__Group__0"
    // InternalMMCLang.g:526:1: rule__Pair__Group__0 : rule__Pair__Group__0__Impl rule__Pair__Group__1 ;
    public final void rule__Pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:530:1: ( rule__Pair__Group__0__Impl rule__Pair__Group__1 )
            // InternalMMCLang.g:531:2: rule__Pair__Group__0__Impl rule__Pair__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__1();

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
    // $ANTLR end "rule__Pair__Group__0"


    // $ANTLR start "rule__Pair__Group__0__Impl"
    // InternalMMCLang.g:538:1: rule__Pair__Group__0__Impl : ( ( rule__Pair__FromAssignment_0 ) ) ;
    public final void rule__Pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:542:1: ( ( ( rule__Pair__FromAssignment_0 ) ) )
            // InternalMMCLang.g:543:1: ( ( rule__Pair__FromAssignment_0 ) )
            {
            // InternalMMCLang.g:543:1: ( ( rule__Pair__FromAssignment_0 ) )
            // InternalMMCLang.g:544:2: ( rule__Pair__FromAssignment_0 )
            {
             before(grammarAccess.getPairAccess().getFromAssignment_0()); 
            // InternalMMCLang.g:545:2: ( rule__Pair__FromAssignment_0 )
            // InternalMMCLang.g:545:3: rule__Pair__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Pair__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getFromAssignment_0()); 

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
    // $ANTLR end "rule__Pair__Group__0__Impl"


    // $ANTLR start "rule__Pair__Group__1"
    // InternalMMCLang.g:553:1: rule__Pair__Group__1 : rule__Pair__Group__1__Impl rule__Pair__Group__2 ;
    public final void rule__Pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:557:1: ( rule__Pair__Group__1__Impl rule__Pair__Group__2 )
            // InternalMMCLang.g:558:2: rule__Pair__Group__1__Impl rule__Pair__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pair__Group__2();

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
    // $ANTLR end "rule__Pair__Group__1"


    // $ANTLR start "rule__Pair__Group__1__Impl"
    // InternalMMCLang.g:565:1: rule__Pair__Group__1__Impl : ( '=>' ) ;
    public final void rule__Pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:569:1: ( ( '=>' ) )
            // InternalMMCLang.g:570:1: ( '=>' )
            {
            // InternalMMCLang.g:570:1: ( '=>' )
            // InternalMMCLang.g:571:2: '=>'
            {
             before(grammarAccess.getPairAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Pair__Group__1__Impl"


    // $ANTLR start "rule__Pair__Group__2"
    // InternalMMCLang.g:580:1: rule__Pair__Group__2 : rule__Pair__Group__2__Impl ;
    public final void rule__Pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:584:1: ( rule__Pair__Group__2__Impl )
            // InternalMMCLang.g:585:2: rule__Pair__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pair__Group__2__Impl();

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
    // $ANTLR end "rule__Pair__Group__2"


    // $ANTLR start "rule__Pair__Group__2__Impl"
    // InternalMMCLang.g:591:1: rule__Pair__Group__2__Impl : ( ( rule__Pair__NameAssignment_2 ) ) ;
    public final void rule__Pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:595:1: ( ( ( rule__Pair__NameAssignment_2 ) ) )
            // InternalMMCLang.g:596:1: ( ( rule__Pair__NameAssignment_2 ) )
            {
            // InternalMMCLang.g:596:1: ( ( rule__Pair__NameAssignment_2 ) )
            // InternalMMCLang.g:597:2: ( rule__Pair__NameAssignment_2 )
            {
             before(grammarAccess.getPairAccess().getNameAssignment_2()); 
            // InternalMMCLang.g:598:2: ( rule__Pair__NameAssignment_2 )
            // InternalMMCLang.g:598:3: rule__Pair__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pair__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPairAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Pair__Group__2__Impl"


    // $ANTLR start "rule__Composition__NameAssignment_1"
    // InternalMMCLang.g:607:1: rule__Composition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:611:1: ( ( RULE_ID ) )
            // InternalMMCLang.g:612:2: ( RULE_ID )
            {
            // InternalMMCLang.g:612:2: ( RULE_ID )
            // InternalMMCLang.g:613:3: RULE_ID
            {
             before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Composition__NameAssignment_1"


    // $ANTLR start "rule__Composition__OperationsAssignment_2"
    // InternalMMCLang.g:622:1: rule__Composition__OperationsAssignment_2 : ( ruleOperation ) ;
    public final void rule__Composition__OperationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:626:1: ( ( ruleOperation ) )
            // InternalMMCLang.g:627:2: ( ruleOperation )
            {
            // InternalMMCLang.g:627:2: ( ruleOperation )
            // InternalMMCLang.g:628:3: ruleOperation
            {
             before(grammarAccess.getCompositionAccess().getOperationsOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getOperationsOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Composition__OperationsAssignment_2"


    // $ANTLR start "rule__Operation__MetamodelAssignment_0_2"
    // InternalMMCLang.g:637:1: rule__Operation__MetamodelAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__MetamodelAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:641:1: ( ( ( RULE_ID ) ) )
            // InternalMMCLang.g:642:2: ( ( RULE_ID ) )
            {
            // InternalMMCLang.g:642:2: ( ( RULE_ID ) )
            // InternalMMCLang.g:643:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_0_2_0()); 
            // InternalMMCLang.g:644:3: ( RULE_ID )
            // InternalMMCLang.g:645:4: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getMetamodelMetamodelIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getMetamodelMetamodelIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__Operation__MetamodelAssignment_0_2"


    // $ANTLR start "rule__Operation__PairsAssignment_0_3_1"
    // InternalMMCLang.g:656:1: rule__Operation__PairsAssignment_0_3_1 : ( rulePair ) ;
    public final void rule__Operation__PairsAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:660:1: ( ( rulePair ) )
            // InternalMMCLang.g:661:2: ( rulePair )
            {
            // InternalMMCLang.g:661:2: ( rulePair )
            // InternalMMCLang.g:662:3: rulePair
            {
             before(grammarAccess.getOperationAccess().getPairsPairParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePair();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getPairsPairParserRuleCall_0_3_1_0()); 

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
    // $ANTLR end "rule__Operation__PairsAssignment_0_3_1"


    // $ANTLR start "rule__Operation__MetamodelAssignment_1_2"
    // InternalMMCLang.g:671:1: rule__Operation__MetamodelAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__MetamodelAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:675:1: ( ( ( RULE_ID ) ) )
            // InternalMMCLang.g:676:2: ( ( RULE_ID ) )
            {
            // InternalMMCLang.g:676:2: ( ( RULE_ID ) )
            // InternalMMCLang.g:677:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_1_2_0()); 
            // InternalMMCLang.g:678:3: ( RULE_ID )
            // InternalMMCLang.g:679:4: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getMetamodelMetamodelIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getMetamodelMetamodelIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getMetamodelMetamodelCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__Operation__MetamodelAssignment_1_2"


    // $ANTLR start "rule__Operation__TargetsAssignment_1_4"
    // InternalMMCLang.g:690:1: rule__Operation__TargetsAssignment_1_4 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__TargetsAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:694:1: ( ( ( RULE_ID ) ) )
            // InternalMMCLang.g:695:2: ( ( RULE_ID ) )
            {
            // InternalMMCLang.g:695:2: ( ( RULE_ID ) )
            // InternalMMCLang.g:696:3: ( RULE_ID )
            {
             before(grammarAccess.getOperationAccess().getTargetsClassCrossReference_1_4_0()); 
            // InternalMMCLang.g:697:3: ( RULE_ID )
            // InternalMMCLang.g:698:4: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getTargetsClassIDTerminalRuleCall_1_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getTargetsClassIDTerminalRuleCall_1_4_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getTargetsClassCrossReference_1_4_0()); 

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
    // $ANTLR end "rule__Operation__TargetsAssignment_1_4"


    // $ANTLR start "rule__Pair__FromAssignment_0"
    // InternalMMCLang.g:709:1: rule__Pair__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Pair__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:713:1: ( ( ( RULE_ID ) ) )
            // InternalMMCLang.g:714:2: ( ( RULE_ID ) )
            {
            // InternalMMCLang.g:714:2: ( ( RULE_ID ) )
            // InternalMMCLang.g:715:3: ( RULE_ID )
            {
             before(grammarAccess.getPairAccess().getFromClassCrossReference_0_0()); 
            // InternalMMCLang.g:716:3: ( RULE_ID )
            // InternalMMCLang.g:717:4: RULE_ID
            {
             before(grammarAccess.getPairAccess().getFromClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getFromClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPairAccess().getFromClassCrossReference_0_0()); 

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
    // $ANTLR end "rule__Pair__FromAssignment_0"


    // $ANTLR start "rule__Pair__NameAssignment_2"
    // InternalMMCLang.g:728:1: rule__Pair__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pair__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMMCLang.g:732:1: ( ( RULE_ID ) )
            // InternalMMCLang.g:733:2: ( RULE_ID )
            {
            // InternalMMCLang.g:733:2: ( RULE_ID )
            // InternalMMCLang.g:734:3: RULE_ID
            {
             before(grammarAccess.getPairAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPairAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Pair__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}