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
    // InternalMyDsl.g:62:1: ruleExpr : ( ruleMult ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ruleMult ) )
            // InternalMyDsl.g:67:2: ( ruleMult )
            {
            // InternalMyDsl.g:67:2: ( ruleMult )
            // InternalMyDsl.g:68:3: ruleMult
            {
             before(grammarAccess.getExprAccess().getMultParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getExprAccess().getMultParserRuleCall()); 

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


    // $ANTLR start "entryRuleMult"
    // InternalMyDsl.g:78:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMult EOF )
            // InternalMyDsl.g:80:1: ruleMult EOF
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
    // InternalMyDsl.g:87:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Mult__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Mult__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Mult__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Mult__Group__0 )
            // InternalMyDsl.g:94:4: rule__Mult__Group__0
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


    // $ANTLR start "entryRuleCst"
    // InternalMyDsl.g:103:1: entryRuleCst : ruleCst EOF ;
    public final void entryRuleCst() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCst EOF )
            // InternalMyDsl.g:105:1: ruleCst EOF
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
    // InternalMyDsl.g:112:1: ruleCst : ( ( rule__Cst__Group__0 ) ) ;
    public final void ruleCst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Cst__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Cst__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Cst__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Cst__Group__0 )
            {
             before(grammarAccess.getCstAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Cst__Group__0 )
            // InternalMyDsl.g:119:4: rule__Cst__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleELong EOF )
            // InternalMyDsl.g:130:1: ruleELong EOF
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
    // InternalMyDsl.g:137:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ELong__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ELong__Group__0 )
            // InternalMyDsl.g:144:4: rule__ELong__Group__0
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


    // $ANTLR start "rule__Mult__Group__0"
    // InternalMyDsl.g:152:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // InternalMyDsl.g:157:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:164:1: rule__Mult__Group__0__Impl : ( ruleCst ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ruleCst ) )
            // InternalMyDsl.g:169:1: ( ruleCst )
            {
            // InternalMyDsl.g:169:1: ( ruleCst )
            // InternalMyDsl.g:170:2: ruleCst
            {
             before(grammarAccess.getMultAccess().getCstParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCst();

            state._fsp--;

             after(grammarAccess.getMultAccess().getCstParserRuleCall_0()); 

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
    // InternalMyDsl.g:179:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Mult__Group__1__Impl )
            // InternalMyDsl.g:184:2: rule__Mult__Group__1__Impl
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
    // InternalMyDsl.g:190:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__Group_1__0 )* ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:194:1: ( ( ( rule__Mult__Group_1__0 )* ) )
            // InternalMyDsl.g:195:1: ( ( rule__Mult__Group_1__0 )* )
            {
            // InternalMyDsl.g:195:1: ( ( rule__Mult__Group_1__0 )* )
            // InternalMyDsl.g:196:2: ( rule__Mult__Group_1__0 )*
            {
             before(grammarAccess.getMultAccess().getGroup_1()); 
            // InternalMyDsl.g:197:2: ( rule__Mult__Group_1__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:197:3: rule__Mult__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Mult__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalMyDsl.g:206:1: rule__Mult__Group_1__0 : rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 ;
    public final void rule__Mult__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 )
            // InternalMyDsl.g:211:2: rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:218:1: rule__Mult__Group_1__0__Impl : ( () ) ;
    public final void rule__Mult__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( () ) )
            // InternalMyDsl.g:223:1: ( () )
            {
            // InternalMyDsl.g:223:1: ( () )
            // InternalMyDsl.g:224:2: ()
            {
             before(grammarAccess.getMultAccess().getMultLeftAction_1_0()); 
            // InternalMyDsl.g:225:2: ()
            // InternalMyDsl.g:225:3: 
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
    // InternalMyDsl.g:233:1: rule__Mult__Group_1__1 : rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2 ;
    public final void rule__Mult__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2 )
            // InternalMyDsl.g:238:2: rule__Mult__Group_1__1__Impl rule__Mult__Group_1__2
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
    // InternalMyDsl.g:245:1: rule__Mult__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Mult__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:249:1: ( ( '*' ) )
            // InternalMyDsl.g:250:1: ( '*' )
            {
            // InternalMyDsl.g:250:1: ( '*' )
            // InternalMyDsl.g:251:2: '*'
            {
             before(grammarAccess.getMultAccess().getAsteriskKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMyDsl.g:260:1: rule__Mult__Group_1__2 : rule__Mult__Group_1__2__Impl ;
    public final void rule__Mult__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Mult__Group_1__2__Impl )
            // InternalMyDsl.g:265:2: rule__Mult__Group_1__2__Impl
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
    // InternalMyDsl.g:271:1: rule__Mult__Group_1__2__Impl : ( ( rule__Mult__RightAssignment_1_2 ) ) ;
    public final void rule__Mult__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( ( ( rule__Mult__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:276:1: ( ( rule__Mult__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:276:1: ( ( rule__Mult__RightAssignment_1_2 ) )
            // InternalMyDsl.g:277:2: ( rule__Mult__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:278:2: ( rule__Mult__RightAssignment_1_2 )
            // InternalMyDsl.g:278:3: rule__Mult__RightAssignment_1_2
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


    // $ANTLR start "rule__Cst__Group__0"
    // InternalMyDsl.g:287:1: rule__Cst__Group__0 : rule__Cst__Group__0__Impl rule__Cst__Group__1 ;
    public final void rule__Cst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Cst__Group__0__Impl rule__Cst__Group__1 )
            // InternalMyDsl.g:292:2: rule__Cst__Group__0__Impl rule__Cst__Group__1
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
    // InternalMyDsl.g:299:1: rule__Cst__Group__0__Impl : ( () ) ;
    public final void rule__Cst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( () ) )
            // InternalMyDsl.g:304:1: ( () )
            {
            // InternalMyDsl.g:304:1: ( () )
            // InternalMyDsl.g:305:2: ()
            {
             before(grammarAccess.getCstAccess().getCstAction_0()); 
            // InternalMyDsl.g:306:2: ()
            // InternalMyDsl.g:306:3: 
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
    // InternalMyDsl.g:314:1: rule__Cst__Group__1 : rule__Cst__Group__1__Impl ;
    public final void rule__Cst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Cst__Group__1__Impl )
            // InternalMyDsl.g:319:2: rule__Cst__Group__1__Impl
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
    // InternalMyDsl.g:325:1: rule__Cst__Group__1__Impl : ( ( rule__Cst__ValueAssignment_1 ) ) ;
    public final void rule__Cst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( ( ( rule__Cst__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:330:1: ( ( rule__Cst__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:330:1: ( ( rule__Cst__ValueAssignment_1 ) )
            // InternalMyDsl.g:331:2: ( rule__Cst__ValueAssignment_1 )
            {
             before(grammarAccess.getCstAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:332:2: ( rule__Cst__ValueAssignment_1 )
            // InternalMyDsl.g:332:3: rule__Cst__ValueAssignment_1
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
    // InternalMyDsl.g:341:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalMyDsl.g:346:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
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
    // InternalMyDsl.g:353:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:358:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:358:1: ( ( '-' )? )
            // InternalMyDsl.g:359:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:360:2: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:360:3: '-'
                    {
                    match(input,12,FOLLOW_2); 

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
    // InternalMyDsl.g:368:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__ELong__Group__1__Impl )
            // InternalMyDsl.g:373:2: rule__ELong__Group__1__Impl
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
    // InternalMyDsl.g:379:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:384:1: ( RULE_INT )
            {
            // InternalMyDsl.g:384:1: ( RULE_INT )
            // InternalMyDsl.g:385:2: RULE_INT
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


    // $ANTLR start "rule__Mult__RightAssignment_1_2"
    // InternalMyDsl.g:395:1: rule__Mult__RightAssignment_1_2 : ( ruleMult ) ;
    public final void rule__Mult__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( ruleMult ) )
            // InternalMyDsl.g:400:2: ( ruleMult )
            {
            // InternalMyDsl.g:400:2: ( ruleMult )
            // InternalMyDsl.g:401:3: ruleMult
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
    // InternalMyDsl.g:410:1: rule__Cst__ValueAssignment_1 : ( ruleELong ) ;
    public final void rule__Cst__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( ( ruleELong ) )
            // InternalMyDsl.g:415:2: ( ruleELong )
            {
            // InternalMyDsl.g:415:2: ( ruleELong )
            // InternalMyDsl.g:416:3: ruleELong
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});

}