package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'*'", "'('", "')'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExpr"
    // InternalMyDsl.g:53:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleExpr EOF )
            // InternalMyDsl.g:55:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMyDsl.g:62:1: ruleExpr : ( ruleAdd ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ruleAdd ) )
            // InternalMyDsl.g:67:2: ( ruleAdd )
            {
            // InternalMyDsl.g:67:2: ( ruleAdd )
            // InternalMyDsl.g:68:3: ruleAdd
            {
             before(grammarAccess.getExprAccess().getAddParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getExprAccess().getAddParserRuleCall()); 

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:78:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAdd EOF )
            // InternalMyDsl.g:80:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:87:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Add__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Add__Group__0 )
            // InternalMyDsl.g:94:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMult"
    // InternalMyDsl.g:103:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMult EOF )
            // InternalMyDsl.g:105:1: ruleMult EOF
            {
             before(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultRule()); 
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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalMyDsl.g:112:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Mult__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Mult__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Mult__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Mult__Group__0 )
            // InternalMyDsl.g:119:4: rule__Mult__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getGroup()); 

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
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:128:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePrimary EOF )
            // InternalMyDsl.g:130:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:137:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:144:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleCst"
    // InternalMyDsl.g:153:1: entryRuleCst : ruleCst EOF ;
    public final void entryRuleCst() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCst EOF )
            // InternalMyDsl.g:155:1: ruleCst EOF
            {
             before(grammarAccess.getCstRule()); 
            pushFollow(FOLLOW_1);
            ruleCst();

            state._fsp--;

             after(grammarAccess.getCstRule()); 
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
    // $ANTLR end "entryRuleCst"


    // $ANTLR start "ruleCst"
    // InternalMyDsl.g:162:1: ruleCst : ( ( rule__Cst__Group__0 ) ) ;
    public final void ruleCst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Cst__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Cst__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Cst__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Cst__Group__0 )
            {
             before(grammarAccess.getCstAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Cst__Group__0 )
            // InternalMyDsl.g:169:4: rule__Cst__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cst__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCstAccess().getGroup()); 

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
    // $ANTLR end "ruleCst"


    // $ANTLR start "entryRuleELong"
    // InternalMyDsl.g:178:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleELong EOF )
            // InternalMyDsl.g:180:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalMyDsl.g:187:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__ELong__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__ELong__Group__0 )
            // InternalMyDsl.g:194:4: rule__ELong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongAccess().getGroup()); 

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:202:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleCst ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleCst ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT||LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:207:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:208:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:209:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:209:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( ruleCst )
                    {
                    // InternalMyDsl.g:213:2: ( ruleCst )
                    // InternalMyDsl.g:214:3: ruleCst
                    {
                     before(grammarAccess.getPrimaryAccess().getCstParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCst();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getCstParserRuleCall_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMyDsl.g:223:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDsl.g:228:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMyDsl.g:235:1: rule__Add__Group__0__Impl : ( ruleMult ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( ( ruleMult ) )
            // InternalMyDsl.g:240:1: ( ruleMult )
            {
            // InternalMyDsl.g:240:1: ( ruleMult )
            // InternalMyDsl.g:241:2: ruleMult
            {
             before(grammarAccess.getAddAccess().getMultParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getAddAccess().getMultParserRuleCall_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMyDsl.g:250:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:254:1: ( rule__Add__Group__1__Impl )
            // InternalMyDsl.g:255:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__1__Impl();

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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMyDsl.g:261:1: rule__Add__Group__1__Impl : ( ( rule__Add__Group_1__0 )* ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:265:1: ( ( ( rule__Add__Group_1__0 )* ) )
            // InternalMyDsl.g:266:1: ( ( rule__Add__Group_1__0 )* )
            {
            // InternalMyDsl.g:266:1: ( ( rule__Add__Group_1__0 )* )
            // InternalMyDsl.g:267:2: ( rule__Add__Group_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1()); 
            // InternalMyDsl.g:268:2: ( rule__Add__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:268:3: rule__Add__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Add__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group_1__0"
    // InternalMyDsl.g:277:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // InternalMyDsl.g:282:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Add__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_1__1();

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
    // $ANTLR end "rule__Add__Group_1__0"


    // $ANTLR start "rule__Add__Group_1__0__Impl"
    // InternalMyDsl.g:289:1: rule__Add__Group_1__0__Impl : ( () ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( () ) )
            // InternalMyDsl.g:294:1: ( () )
            {
            // InternalMyDsl.g:294:1: ( () )
            // InternalMyDsl.g:295:2: ()
            {
             before(grammarAccess.getAddAccess().getAddLeftAction_1_0()); 
            // InternalMyDsl.g:296:2: ()
            // InternalMyDsl.g:296:3: 
            {
            }

             after(grammarAccess.getAddAccess().getAddLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__0__Impl"


    // $ANTLR start "rule__Add__Group_1__1"
    // InternalMyDsl.g:304:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl rule__Add__Group_1__2 ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( rule__Add__Group_1__1__Impl rule__Add__Group_1__2 )
            // InternalMyDsl.g:309:2: rule__Add__Group_1__1__Impl rule__Add__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Add__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_1__2();

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
    // $ANTLR end "rule__Add__Group_1__1"


    // $ANTLR start "rule__Add__Group_1__1__Impl"
    // InternalMyDsl.g:316:1: rule__Add__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( '+' ) )
            // InternalMyDsl.g:321:1: ( '+' )
            {
            // InternalMyDsl.g:321:1: ( '+' )
            // InternalMyDsl.g:322:2: '+'
            {
             before(grammarAccess.getAddAccess().getPlusSignKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getPlusSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Add__Group_1__1__Impl"


    // $ANTLR start "rule__Add__Group_1__2"
    // InternalMyDsl.g:331:1: rule__Add__Group_1__2 : rule__Add__Group_1__2__Impl ;
    public final void rule__Add__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__Add__Group_1__2__Impl )
            // InternalMyDsl.g:336:2: rule__Add__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_1__2__Impl();

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
    // $ANTLR end "rule__Add__Group_1__2"


    // $ANTLR start "rule__Add__Group_1__2__Impl"
    // InternalMyDsl.g:342:1: rule__Add__Group_1__2__Impl : ( ( rule__Add__RightAssignment_1_2 ) ) ;
    public final void rule__Add__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:346:1: ( ( ( rule__Add__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:347:1: ( ( rule__Add__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:347:1: ( ( rule__Add__RightAssignment_1_2 ) )
            // InternalMyDsl.g:348:2: ( rule__Add__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:349:2: ( rule__Add__RightAssignment_1_2 )
            // InternalMyDsl.g:349:3: rule__Add__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Add__Group_1__2__Impl"


    // $ANTLR start "rule__Mult__Group__0"
    // InternalMyDsl.g:358:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // InternalMyDsl.g:363:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mult__Group__1();

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
    // $ANTLR end "rule__Mult__Group__0"


    // $ANTLR start "rule__Mult__Group__0__Impl"
    // InternalMyDsl.g:370:1: rule__Mult__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:375:1: ( rulePrimary )
            {
            // InternalMyDsl.g:375:1: ( rulePrimary )
            // InternalMyDsl.g:376:2: rulePrimary
            {
             before(grammarAccess.getMultAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Mult__Group__0__Impl"


    // $ANTLR start "rule__Mult__Group__1"
    // InternalMyDsl.g:385:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__Mult__Group__1__Impl )
            // InternalMyDsl.g:390:2: rule__Mult__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mult__Group__1__Impl();

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
    // $ANTLR end "rule__Mult__Group__1"


    // $ANTLR start "rule__Mult__Group__1__Impl"
    // InternalMyDsl.g:396:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__Group_1__0 )* ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( ( rule__Mult__Group_1__0 )* ) )
            // InternalMyDsl.g:401:1: ( ( rule__Mult__Group_1__0 )* )
            {
            // InternalMyDsl.g:401:1: ( ( rule__Mult__Group_1__0 )* )
            // InternalMyDsl.g:402:2: ( rule__Mult__Group_1__0 )*
            {
             before(grammarAccess.getMultAccess().getGroup_1()); 
            // InternalMyDsl.g:403:2: ( rule__Mult__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:403:3: rule__Mult__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mult__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMultAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Mult__Group__1__Impl"


    // $ANTLR start "rule__Mult__Group_1__0"
    // InternalMyDsl.g:412:1: rule__Mult__Group_1__0 : rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 ;
    public final void rule__Mult__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 )
            // InternalMyDsl.g:417:2: rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Mult__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mult__Group_1__1();

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
    // $ANTLR end "rule__Mult__Group_1__0"


    // $ANTLR start "rule__Mult__Group_1__0__Impl"
    // InternalMyDsl.g:424:1: rule__Mult__Group_1__0__Impl : ( () ) ;
    public final void rule__Mult__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( () ) )
            // InternalMyDsl.g:429:1: ( () )
            {
            // InternalMyDsl.g:429:1: ( () )
            // InternalMyDsl.g:430:2: ()
            {
             before(grammarAccess.getMultAccess().getMultLeftAction_1_0()); 
            // InternalMyDsl.g:431:2: ()
            // InternalMyDsl.g:431:3: 
            {
            }

             after(grammarAccess.getMultAccess().getMultLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group_1__0__Impl"


    // $ANTLR start "rule__Mult__Group_1__1"
    // InternalMyDsl.g:439:1: rule__Mult__Group_1__1 : rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2 ;
    public final void rule__Mult__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2 )
            // InternalMyDsl.g:444:2: rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Mult__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mult__Group_1__2();

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
    // $ANTLR end "rule__Mult__Group_1__1"


    // $ANTLR start "rule__Mult__Group_1__1__Impl"
    // InternalMyDsl.g:451:1: rule__Mult__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Mult__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( '*' ) )
            // InternalMyDsl.g:456:1: ( '*' )
            {
            // InternalMyDsl.g:456:1: ( '*' )
            // InternalMyDsl.g:457:2: '*'
            {
             before(grammarAccess.getMultAccess().getAsteriskKeyword_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMultAccess().getAsteriskKeyword_1_1()); 

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
    // $ANTLR end "rule__Mult__Group_1__1__Impl"


    // $ANTLR start "rule__Mult__Group_1__2"
    // InternalMyDsl.g:466:1: rule__Mult__Group_1__2 : rule__Mult__Group_1__2__Impl ;
    public final void rule__Mult__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__Mult__Group_1__2__Impl )
            // InternalMyDsl.g:471:2: rule__Mult__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mult__Group_1__2__Impl();

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
    // $ANTLR end "rule__Mult__Group_1__2"


    // $ANTLR start "rule__Mult__Group_1__2__Impl"
    // InternalMyDsl.g:477:1: rule__Mult__Group_1__2__Impl : ( ( rule__Mult__RightAssignment_1_2 ) ) ;
    public final void rule__Mult__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ( rule__Mult__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:482:1: ( ( rule__Mult__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:482:1: ( ( rule__Mult__RightAssignment_1_2 ) )
            // InternalMyDsl.g:483:2: ( rule__Mult__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:484:2: ( rule__Mult__RightAssignment_1_2 )
            // InternalMyDsl.g:484:3: rule__Mult__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Mult__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Mult__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:493:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:498:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:505:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( ( '(' ) )
            // InternalMyDsl.g:510:1: ( '(' )
            {
            // InternalMyDsl.g:510:1: ( '(' )
            // InternalMyDsl.g:511:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:520:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:525:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:532:1: rule__Primary__Group_0__1__Impl : ( ruleExpr ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( ( ruleExpr ) )
            // InternalMyDsl.g:537:1: ( ruleExpr )
            {
            // InternalMyDsl.g:537:1: ( ruleExpr )
            // InternalMyDsl.g:538:2: ruleExpr
            {
             before(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExprParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMyDsl.g:547:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:552:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMyDsl.g:558:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( ')' ) )
            // InternalMyDsl.g:563:1: ( ')' )
            {
            // InternalMyDsl.g:563:1: ( ')' )
            // InternalMyDsl.g:564:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Cst__Group__0"
    // InternalMyDsl.g:574:1: rule__Cst__Group__0 : rule__Cst__Group__0__Impl rule__Cst__Group__1 ;
    public final void rule__Cst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__Cst__Group__0__Impl rule__Cst__Group__1 )
            // InternalMyDsl.g:579:2: rule__Cst__Group__0__Impl rule__Cst__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cst__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cst__Group__1();

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
    // $ANTLR end "rule__Cst__Group__0"


    // $ANTLR start "rule__Cst__Group__0__Impl"
    // InternalMyDsl.g:586:1: rule__Cst__Group__0__Impl : ( () ) ;
    public final void rule__Cst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( ( () ) )
            // InternalMyDsl.g:591:1: ( () )
            {
            // InternalMyDsl.g:591:1: ( () )
            // InternalMyDsl.g:592:2: ()
            {
             before(grammarAccess.getCstAccess().getCstAction_0()); 
            // InternalMyDsl.g:593:2: ()
            // InternalMyDsl.g:593:3: 
            {
            }

             after(grammarAccess.getCstAccess().getCstAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cst__Group__0__Impl"


    // $ANTLR start "rule__Cst__Group__1"
    // InternalMyDsl.g:601:1: rule__Cst__Group__1 : rule__Cst__Group__1__Impl ;
    public final void rule__Cst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__Cst__Group__1__Impl )
            // InternalMyDsl.g:606:2: rule__Cst__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cst__Group__1__Impl();

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
    // $ANTLR end "rule__Cst__Group__1"


    // $ANTLR start "rule__Cst__Group__1__Impl"
    // InternalMyDsl.g:612:1: rule__Cst__Group__1__Impl : ( ( rule__Cst__ValueAssignment_1 ) ) ;
    public final void rule__Cst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ( rule__Cst__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:617:1: ( ( rule__Cst__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:617:1: ( ( rule__Cst__ValueAssignment_1 ) )
            // InternalMyDsl.g:618:2: ( rule__Cst__ValueAssignment_1 )
            {
             before(grammarAccess.getCstAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:619:2: ( rule__Cst__ValueAssignment_1 )
            // InternalMyDsl.g:619:3: rule__Cst__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cst__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCstAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Cst__Group__1__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // InternalMyDsl.g:628:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalMyDsl.g:633:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ELong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELong__Group__1();

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
    // $ANTLR end "rule__ELong__Group__0"


    // $ANTLR start "rule__ELong__Group__0__Impl"
    // InternalMyDsl.g:640:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:645:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:645:1: ( ( '-' )? )
            // InternalMyDsl.g:646:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:647:2: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:647:3: '-'
                    {
                    match(input,15,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ELong__Group__0__Impl"


    // $ANTLR start "rule__ELong__Group__1"
    // InternalMyDsl.g:655:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__ELong__Group__1__Impl )
            // InternalMyDsl.g:660:2: rule__ELong__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__1__Impl();

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
    // $ANTLR end "rule__ELong__Group__1"


    // $ANTLR start "rule__ELong__Group__1__Impl"
    // InternalMyDsl.g:666:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:671:1: ( RULE_INT )
            {
            // InternalMyDsl.g:671:1: ( RULE_INT )
            // InternalMyDsl.g:672:2: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ELong__Group__1__Impl"


    // $ANTLR start "rule__Add__RightAssignment_1_2"
    // InternalMyDsl.g:682:1: rule__Add__RightAssignment_1_2 : ( ruleAdd ) ;
    public final void rule__Add__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( ruleAdd ) )
            // InternalMyDsl.g:687:2: ( ruleAdd )
            {
            // InternalMyDsl.g:687:2: ( ruleAdd )
            // InternalMyDsl.g:688:3: ruleAdd
            {
             before(grammarAccess.getAddAccess().getRightAddParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddAccess().getRightAddParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Add__RightAssignment_1_2"


    // $ANTLR start "rule__Mult__RightAssignment_1_2"
    // InternalMyDsl.g:697:1: rule__Mult__RightAssignment_1_2 : ( ruleMult ) ;
    public final void rule__Mult__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( ( ruleMult ) )
            // InternalMyDsl.g:702:2: ( ruleMult )
            {
            // InternalMyDsl.g:702:2: ( ruleMult )
            // InternalMyDsl.g:703:3: ruleMult
            {
             before(grammarAccess.getMultAccess().getRightMultParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultAccess().getRightMultParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Mult__RightAssignment_1_2"


    // $ANTLR start "rule__Cst__ValueAssignment_1"
    // InternalMyDsl.g:712:1: rule__Cst__ValueAssignment_1 : ( ruleELong ) ;
    public final void rule__Cst__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:1: ( ( ruleELong ) )
            // InternalMyDsl.g:717:2: ( ruleELong )
            {
            // InternalMyDsl.g:717:2: ( ruleELong )
            // InternalMyDsl.g:718:3: ruleELong
            {
             before(grammarAccess.getCstAccess().getValueELongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getCstAccess().getValueELongParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cst__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});

}