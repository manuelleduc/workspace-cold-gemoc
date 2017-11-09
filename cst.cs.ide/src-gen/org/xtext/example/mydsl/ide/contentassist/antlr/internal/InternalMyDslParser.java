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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
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



    // $ANTLR start "entryRuleCst"
    // InternalMyDsl.g:53:1: entryRuleCst : ruleCst EOF ;
    public final void entryRuleCst() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCst EOF )
            // InternalMyDsl.g:55:1: ruleCst EOF
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
    // InternalMyDsl.g:62:1: ruleCst : ( ( rule__Cst__Group__0 ) ) ;
    public final void ruleCst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Cst__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Cst__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Cst__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Cst__Group__0 )
            {
             before(grammarAccess.getCstAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Cst__Group__0 )
            // InternalMyDsl.g:69:4: rule__Cst__Group__0
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
    // InternalMyDsl.g:78:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleELong EOF )
            // InternalMyDsl.g:80:1: ruleELong EOF
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
    // InternalMyDsl.g:87:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ELong__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__ELong__Group__0 )
            // InternalMyDsl.g:94:4: rule__ELong__Group__0
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


    // $ANTLR start "rule__Cst__Group__0"
    // InternalMyDsl.g:102:1: rule__Cst__Group__0 : rule__Cst__Group__0__Impl rule__Cst__Group__1 ;
    public final void rule__Cst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:106:1: ( rule__Cst__Group__0__Impl rule__Cst__Group__1 )
            // InternalMyDsl.g:107:2: rule__Cst__Group__0__Impl rule__Cst__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:114:1: rule__Cst__Group__0__Impl : ( () ) ;
    public final void rule__Cst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:118:1: ( ( () ) )
            // InternalMyDsl.g:119:1: ( () )
            {
            // InternalMyDsl.g:119:1: ( () )
            // InternalMyDsl.g:120:2: ()
            {
             before(grammarAccess.getCstAccess().getCstAction_0()); 
            // InternalMyDsl.g:121:2: ()
            // InternalMyDsl.g:121:3: 
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
    // InternalMyDsl.g:129:1: rule__Cst__Group__1 : rule__Cst__Group__1__Impl ;
    public final void rule__Cst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:133:1: ( rule__Cst__Group__1__Impl )
            // InternalMyDsl.g:134:2: rule__Cst__Group__1__Impl
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
    // InternalMyDsl.g:140:1: rule__Cst__Group__1__Impl : ( ( rule__Cst__ValueAssignment_1 ) ) ;
    public final void rule__Cst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:144:1: ( ( ( rule__Cst__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:145:1: ( ( rule__Cst__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:145:1: ( ( rule__Cst__ValueAssignment_1 ) )
            // InternalMyDsl.g:146:2: ( rule__Cst__ValueAssignment_1 )
            {
             before(grammarAccess.getCstAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:147:2: ( rule__Cst__ValueAssignment_1 )
            // InternalMyDsl.g:147:3: rule__Cst__ValueAssignment_1
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
    // InternalMyDsl.g:156:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:160:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalMyDsl.g:161:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:168:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:172:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:173:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:173:1: ( ( '-' )? )
            // InternalMyDsl.g:174:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:175:2: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:175:3: '-'
                    {
                    match(input,11,FOLLOW_2); 

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
    // InternalMyDsl.g:183:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:187:1: ( rule__ELong__Group__1__Impl )
            // InternalMyDsl.g:188:2: rule__ELong__Group__1__Impl
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
    // InternalMyDsl.g:194:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:199:1: ( RULE_INT )
            {
            // InternalMyDsl.g:199:1: ( RULE_INT )
            // InternalMyDsl.g:200:2: RULE_INT
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


    // $ANTLR start "rule__Cst__ValueAssignment_1"
    // InternalMyDsl.g:210:1: rule__Cst__ValueAssignment_1 : ( ruleELong ) ;
    public final void rule__Cst__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( ruleELong ) )
            // InternalMyDsl.g:215:2: ( ruleELong )
            {
            // InternalMyDsl.g:215:2: ( ruleELong )
            // InternalMyDsl.g:216:3: ruleELong
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000810L});

}