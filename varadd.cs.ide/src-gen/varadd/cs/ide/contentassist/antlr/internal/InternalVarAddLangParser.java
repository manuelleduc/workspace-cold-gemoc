package varadd.cs.ide.contentassist.antlr.internal;

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
import varadd.cs.services.VarAddLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVarAddLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalVarAddLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVarAddLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVarAddLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVarAddLang.g"; }


    	private VarAddLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(VarAddLangGrammarAccess grammarAccess) {
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
    // InternalVarAddLang.g:53:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalVarAddLang.g:54:1: ( ruleExpr EOF )
            // InternalVarAddLang.g:55:1: ruleExpr EOF
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
    // InternalVarAddLang.g:62:1: ruleExpr : ( ruleAdd ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:66:2: ( ( ruleAdd ) )
            // InternalVarAddLang.g:67:2: ( ruleAdd )
            {
            // InternalVarAddLang.g:67:2: ( ruleAdd )
            // InternalVarAddLang.g:68:3: ruleAdd
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
    // InternalVarAddLang.g:78:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalVarAddLang.g:79:1: ( ruleAdd EOF )
            // InternalVarAddLang.g:80:1: ruleAdd EOF
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
    // InternalVarAddLang.g:87:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:91:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalVarAddLang.g:92:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalVarAddLang.g:92:2: ( ( rule__Add__Group__0 ) )
            // InternalVarAddLang.g:93:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalVarAddLang.g:94:3: ( rule__Add__Group__0 )
            // InternalVarAddLang.g:94:4: rule__Add__Group__0
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


    // $ANTLR start "entryRuleVariable"
    // InternalVarAddLang.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalVarAddLang.g:104:1: ( ruleVariable EOF )
            // InternalVarAddLang.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVarAddLang.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalVarAddLang.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalVarAddLang.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalVarAddLang.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalVarAddLang.g:119:3: ( rule__Variable__Group__0 )
            // InternalVarAddLang.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Add__Group__0"
    // InternalVarAddLang.g:127:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:131:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalVarAddLang.g:132:2: rule__Add__Group__0__Impl rule__Add__Group__1
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
    // InternalVarAddLang.g:139:1: rule__Add__Group__0__Impl : ( ruleVariable ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:143:1: ( ( ruleVariable ) )
            // InternalVarAddLang.g:144:1: ( ruleVariable )
            {
            // InternalVarAddLang.g:144:1: ( ruleVariable )
            // InternalVarAddLang.g:145:2: ruleVariable
            {
             before(grammarAccess.getAddAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAddAccess().getVariableParserRuleCall_0()); 

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
    // InternalVarAddLang.g:154:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:158:1: ( rule__Add__Group__1__Impl )
            // InternalVarAddLang.g:159:2: rule__Add__Group__1__Impl
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
    // InternalVarAddLang.g:165:1: rule__Add__Group__1__Impl : ( ( rule__Add__Group_1__0 )* ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:169:1: ( ( ( rule__Add__Group_1__0 )* ) )
            // InternalVarAddLang.g:170:1: ( ( rule__Add__Group_1__0 )* )
            {
            // InternalVarAddLang.g:170:1: ( ( rule__Add__Group_1__0 )* )
            // InternalVarAddLang.g:171:2: ( rule__Add__Group_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1()); 
            // InternalVarAddLang.g:172:2: ( rule__Add__Group_1__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVarAddLang.g:172:3: rule__Add__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Add__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalVarAddLang.g:181:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:185:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // InternalVarAddLang.g:186:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
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
    // InternalVarAddLang.g:193:1: rule__Add__Group_1__0__Impl : ( () ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:197:1: ( ( () ) )
            // InternalVarAddLang.g:198:1: ( () )
            {
            // InternalVarAddLang.g:198:1: ( () )
            // InternalVarAddLang.g:199:2: ()
            {
             before(grammarAccess.getAddAccess().getAddLeftAction_1_0()); 
            // InternalVarAddLang.g:200:2: ()
            // InternalVarAddLang.g:200:3: 
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
    // InternalVarAddLang.g:208:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl rule__Add__Group_1__2 ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:212:1: ( rule__Add__Group_1__1__Impl rule__Add__Group_1__2 )
            // InternalVarAddLang.g:213:2: rule__Add__Group_1__1__Impl rule__Add__Group_1__2
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
    // InternalVarAddLang.g:220:1: rule__Add__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:224:1: ( ( '+' ) )
            // InternalVarAddLang.g:225:1: ( '+' )
            {
            // InternalVarAddLang.g:225:1: ( '+' )
            // InternalVarAddLang.g:226:2: '+'
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
    // InternalVarAddLang.g:235:1: rule__Add__Group_1__2 : rule__Add__Group_1__2__Impl ;
    public final void rule__Add__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:239:1: ( rule__Add__Group_1__2__Impl )
            // InternalVarAddLang.g:240:2: rule__Add__Group_1__2__Impl
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
    // InternalVarAddLang.g:246:1: rule__Add__Group_1__2__Impl : ( ( rule__Add__RightAssignment_1_2 ) ) ;
    public final void rule__Add__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:250:1: ( ( ( rule__Add__RightAssignment_1_2 ) ) )
            // InternalVarAddLang.g:251:1: ( ( rule__Add__RightAssignment_1_2 ) )
            {
            // InternalVarAddLang.g:251:1: ( ( rule__Add__RightAssignment_1_2 ) )
            // InternalVarAddLang.g:252:2: ( rule__Add__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddAccess().getRightAssignment_1_2()); 
            // InternalVarAddLang.g:253:2: ( rule__Add__RightAssignment_1_2 )
            // InternalVarAddLang.g:253:3: rule__Add__RightAssignment_1_2
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalVarAddLang.g:262:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:266:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalVarAddLang.g:267:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalVarAddLang.g:274:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:278:1: ( ( () ) )
            // InternalVarAddLang.g:279:1: ( () )
            {
            // InternalVarAddLang.g:279:1: ( () )
            // InternalVarAddLang.g:280:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalVarAddLang.g:281:2: ()
            // InternalVarAddLang.g:281:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalVarAddLang.g:289:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:293:1: ( rule__Variable__Group__1__Impl )
            // InternalVarAddLang.g:294:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalVarAddLang.g:300:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:304:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalVarAddLang.g:305:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalVarAddLang.g:305:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalVarAddLang.g:306:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalVarAddLang.g:307:2: ( rule__Variable__NameAssignment_1 )
            // InternalVarAddLang.g:307:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Add__RightAssignment_1_2"
    // InternalVarAddLang.g:316:1: rule__Add__RightAssignment_1_2 : ( ruleAdd ) ;
    public final void rule__Add__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:320:1: ( ( ruleAdd ) )
            // InternalVarAddLang.g:321:2: ( ruleAdd )
            {
            // InternalVarAddLang.g:321:2: ( ruleAdd )
            // InternalVarAddLang.g:322:3: ruleAdd
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalVarAddLang.g:331:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVarAddLang.g:335:1: ( ( RULE_ID ) )
            // InternalVarAddLang.g:336:2: ( RULE_ID )
            {
            // InternalVarAddLang.g:336:2: ( RULE_ID )
            // InternalVarAddLang.g:337:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}