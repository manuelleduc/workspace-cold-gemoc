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
import fr.mleduc.services.CsvGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(CsvGrammarAccess grammarAccess) {
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
    // InternalCsv.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCsv.g:54:1: ( ruleModel EOF )
            // InternalCsv.g:55:1: ruleModel EOF
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
    // InternalCsv.g:62:1: ruleModel : ( ( rule__Model__Group__0 )? ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:66:2: ( ( ( rule__Model__Group__0 )? ) )
            // InternalCsv.g:67:2: ( ( rule__Model__Group__0 )? )
            {
            // InternalCsv.g:67:2: ( ( rule__Model__Group__0 )? )
            // InternalCsv.g:68:3: ( rule__Model__Group__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalCsv.g:69:3: ( rule__Model__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_FREE_CELL)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCsv.g:69:4: rule__Model__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group__0();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "entryRuleLine"
    // InternalCsv.g:78:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalCsv.g:79:1: ( ruleLine EOF )
            // InternalCsv.g:80:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCsv.g:87:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:91:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalCsv.g:92:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalCsv.g:92:2: ( ( rule__Line__Group__0 ) )
            // InternalCsv.g:93:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalCsv.g:94:3: ( rule__Line__Group__0 )
            // InternalCsv.g:94:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleCell"
    // InternalCsv.g:103:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalCsv.g:104:1: ( ruleCell EOF )
            // InternalCsv.g:105:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalCsv.g:112:1: ruleCell : ( ( rule__Cell__Alternatives ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:116:2: ( ( ( rule__Cell__Alternatives ) ) )
            // InternalCsv.g:117:2: ( ( rule__Cell__Alternatives ) )
            {
            // InternalCsv.g:117:2: ( ( rule__Cell__Alternatives ) )
            // InternalCsv.g:118:3: ( rule__Cell__Alternatives )
            {
             before(grammarAccess.getCellAccess().getAlternatives()); 
            // InternalCsv.g:119:3: ( rule__Cell__Alternatives )
            // InternalCsv.g:119:4: rule__Cell__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCell"


    // $ANTLR start "rule__Cell__Alternatives"
    // InternalCsv.g:127:1: rule__Cell__Alternatives : ( ( ( rule__Cell__Group_0__0 ) ) | ( ( rule__Cell__Group_1__0 ) ) );
    public final void rule__Cell__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:131:1: ( ( ( rule__Cell__Group_0__0 ) ) | ( ( rule__Cell__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_FREE_CELL) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCsv.g:132:2: ( ( rule__Cell__Group_0__0 ) )
                    {
                    // InternalCsv.g:132:2: ( ( rule__Cell__Group_0__0 ) )
                    // InternalCsv.g:133:3: ( rule__Cell__Group_0__0 )
                    {
                     before(grammarAccess.getCellAccess().getGroup_0()); 
                    // InternalCsv.g:134:3: ( rule__Cell__Group_0__0 )
                    // InternalCsv.g:134:4: rule__Cell__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cell__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsv.g:138:2: ( ( rule__Cell__Group_1__0 ) )
                    {
                    // InternalCsv.g:138:2: ( ( rule__Cell__Group_1__0 ) )
                    // InternalCsv.g:139:3: ( rule__Cell__Group_1__0 )
                    {
                     before(grammarAccess.getCellAccess().getGroup_1()); 
                    // InternalCsv.g:140:3: ( rule__Cell__Group_1__0 )
                    // InternalCsv.g:140:4: rule__Cell__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cell__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Cell__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalCsv.g:148:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:152:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalCsv.g:153:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalCsv.g:160:1: rule__Model__Group__0__Impl : ( ( rule__Model__LinesAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:164:1: ( ( ( rule__Model__LinesAssignment_0 ) ) )
            // InternalCsv.g:165:1: ( ( rule__Model__LinesAssignment_0 ) )
            {
            // InternalCsv.g:165:1: ( ( rule__Model__LinesAssignment_0 ) )
            // InternalCsv.g:166:2: ( rule__Model__LinesAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getLinesAssignment_0()); 
            // InternalCsv.g:167:2: ( rule__Model__LinesAssignment_0 )
            // InternalCsv.g:167:3: rule__Model__LinesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__LinesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getLinesAssignment_0()); 

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
    // InternalCsv.g:175:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:179:1: ( rule__Model__Group__1__Impl )
            // InternalCsv.g:180:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // InternalCsv.g:186:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:190:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // InternalCsv.g:191:1: ( ( rule__Model__Group_1__0 )* )
            {
            // InternalCsv.g:191:1: ( ( rule__Model__Group_1__0 )* )
            // InternalCsv.g:192:2: ( rule__Model__Group_1__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_1()); 
            // InternalCsv.g:193:2: ( rule__Model__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCsv.g:193:3: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalCsv.g:202:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:206:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalCsv.g:207:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalCsv.g:214:1: rule__Model__Group_1__0__Impl : ( RULE_NL ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:218:1: ( ( RULE_NL ) )
            // InternalCsv.g:219:1: ( RULE_NL )
            {
            // InternalCsv.g:219:1: ( RULE_NL )
            // InternalCsv.g:220:2: RULE_NL
            {
             before(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalCsv.g:229:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:233:1: ( rule__Model__Group_1__1__Impl )
            // InternalCsv.g:234:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1__Impl();

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalCsv.g:240:1: rule__Model__Group_1__1__Impl : ( ( rule__Model__LinesAssignment_1_1 ) ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:244:1: ( ( ( rule__Model__LinesAssignment_1_1 ) ) )
            // InternalCsv.g:245:1: ( ( rule__Model__LinesAssignment_1_1 ) )
            {
            // InternalCsv.g:245:1: ( ( rule__Model__LinesAssignment_1_1 ) )
            // InternalCsv.g:246:2: ( rule__Model__LinesAssignment_1_1 )
            {
             before(grammarAccess.getModelAccess().getLinesAssignment_1_1()); 
            // InternalCsv.g:247:2: ( rule__Model__LinesAssignment_1_1 )
            // InternalCsv.g:247:3: rule__Model__LinesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__LinesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getLinesAssignment_1_1()); 

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
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalCsv.g:256:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:260:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalCsv.g:261:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

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
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalCsv.g:268:1: rule__Line__Group__0__Impl : ( ( rule__Line__CellsAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:272:1: ( ( ( rule__Line__CellsAssignment_0 ) ) )
            // InternalCsv.g:273:1: ( ( rule__Line__CellsAssignment_0 ) )
            {
            // InternalCsv.g:273:1: ( ( rule__Line__CellsAssignment_0 ) )
            // InternalCsv.g:274:2: ( rule__Line__CellsAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getCellsAssignment_0()); 
            // InternalCsv.g:275:2: ( rule__Line__CellsAssignment_0 )
            // InternalCsv.g:275:3: rule__Line__CellsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Line__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getCellsAssignment_0()); 

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
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalCsv.g:283:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:287:1: ( rule__Line__Group__1__Impl )
            // InternalCsv.g:288:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__1__Impl();

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
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalCsv.g:294:1: rule__Line__Group__1__Impl : ( ( rule__Line__Group_1__0 )* ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:298:1: ( ( ( rule__Line__Group_1__0 )* ) )
            // InternalCsv.g:299:1: ( ( rule__Line__Group_1__0 )* )
            {
            // InternalCsv.g:299:1: ( ( rule__Line__Group_1__0 )* )
            // InternalCsv.g:300:2: ( rule__Line__Group_1__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_1()); 
            // InternalCsv.g:301:2: ( rule__Line__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCsv.g:301:3: rule__Line__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Line__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group_1__0"
    // InternalCsv.g:310:1: rule__Line__Group_1__0 : rule__Line__Group_1__0__Impl rule__Line__Group_1__1 ;
    public final void rule__Line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:314:1: ( rule__Line__Group_1__0__Impl rule__Line__Group_1__1 )
            // InternalCsv.g:315:2: rule__Line__Group_1__0__Impl rule__Line__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_1__1();

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
    // $ANTLR end "rule__Line__Group_1__0"


    // $ANTLR start "rule__Line__Group_1__0__Impl"
    // InternalCsv.g:322:1: rule__Line__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:326:1: ( ( ',' ) )
            // InternalCsv.g:327:1: ( ',' )
            {
            // InternalCsv.g:327:1: ( ',' )
            // InternalCsv.g:328:2: ','
            {
             before(grammarAccess.getLineAccess().getCommaKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Line__Group_1__0__Impl"


    // $ANTLR start "rule__Line__Group_1__1"
    // InternalCsv.g:337:1: rule__Line__Group_1__1 : rule__Line__Group_1__1__Impl ;
    public final void rule__Line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:341:1: ( rule__Line__Group_1__1__Impl )
            // InternalCsv.g:342:2: rule__Line__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_1__1__Impl();

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
    // $ANTLR end "rule__Line__Group_1__1"


    // $ANTLR start "rule__Line__Group_1__1__Impl"
    // InternalCsv.g:348:1: rule__Line__Group_1__1__Impl : ( ( rule__Line__CellsAssignment_1_1 )? ) ;
    public final void rule__Line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:352:1: ( ( ( rule__Line__CellsAssignment_1_1 )? ) )
            // InternalCsv.g:353:1: ( ( rule__Line__CellsAssignment_1_1 )? )
            {
            // InternalCsv.g:353:1: ( ( rule__Line__CellsAssignment_1_1 )? )
            // InternalCsv.g:354:2: ( rule__Line__CellsAssignment_1_1 )?
            {
             before(grammarAccess.getLineAccess().getCellsAssignment_1_1()); 
            // InternalCsv.g:355:2: ( rule__Line__CellsAssignment_1_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_FREE_CELL)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsv.g:355:3: rule__Line__CellsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__CellsAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getCellsAssignment_1_1()); 

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
    // $ANTLR end "rule__Line__Group_1__1__Impl"


    // $ANTLR start "rule__Cell__Group_0__0"
    // InternalCsv.g:364:1: rule__Cell__Group_0__0 : rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1 ;
    public final void rule__Cell__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:368:1: ( rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1 )
            // InternalCsv.g:369:2: rule__Cell__Group_0__0__Impl rule__Cell__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Cell__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__1();

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
    // $ANTLR end "rule__Cell__Group_0__0"


    // $ANTLR start "rule__Cell__Group_0__0__Impl"
    // InternalCsv.g:376:1: rule__Cell__Group_0__0__Impl : ( () ) ;
    public final void rule__Cell__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:380:1: ( ( () ) )
            // InternalCsv.g:381:1: ( () )
            {
            // InternalCsv.g:381:1: ( () )
            // InternalCsv.g:382:2: ()
            {
             before(grammarAccess.getCellAccess().getStringCellAction_0_0()); 
            // InternalCsv.g:383:2: ()
            // InternalCsv.g:383:3: 
            {
            }

             after(grammarAccess.getCellAccess().getStringCellAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_0__0__Impl"


    // $ANTLR start "rule__Cell__Group_0__1"
    // InternalCsv.g:391:1: rule__Cell__Group_0__1 : rule__Cell__Group_0__1__Impl ;
    public final void rule__Cell__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:395:1: ( rule__Cell__Group_0__1__Impl )
            // InternalCsv.g:396:2: rule__Cell__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group_0__1__Impl();

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
    // $ANTLR end "rule__Cell__Group_0__1"


    // $ANTLR start "rule__Cell__Group_0__1__Impl"
    // InternalCsv.g:402:1: rule__Cell__Group_0__1__Impl : ( ( rule__Cell__ContentAssignment_0_1 ) ) ;
    public final void rule__Cell__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:406:1: ( ( ( rule__Cell__ContentAssignment_0_1 ) ) )
            // InternalCsv.g:407:1: ( ( rule__Cell__ContentAssignment_0_1 ) )
            {
            // InternalCsv.g:407:1: ( ( rule__Cell__ContentAssignment_0_1 ) )
            // InternalCsv.g:408:2: ( rule__Cell__ContentAssignment_0_1 )
            {
             before(grammarAccess.getCellAccess().getContentAssignment_0_1()); 
            // InternalCsv.g:409:2: ( rule__Cell__ContentAssignment_0_1 )
            // InternalCsv.g:409:3: rule__Cell__ContentAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__ContentAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getContentAssignment_0_1()); 

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
    // $ANTLR end "rule__Cell__Group_0__1__Impl"


    // $ANTLR start "rule__Cell__Group_1__0"
    // InternalCsv.g:418:1: rule__Cell__Group_1__0 : rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1 ;
    public final void rule__Cell__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:422:1: ( rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1 )
            // InternalCsv.g:423:2: rule__Cell__Group_1__0__Impl rule__Cell__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Cell__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group_1__1();

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
    // $ANTLR end "rule__Cell__Group_1__0"


    // $ANTLR start "rule__Cell__Group_1__0__Impl"
    // InternalCsv.g:430:1: rule__Cell__Group_1__0__Impl : ( () ) ;
    public final void rule__Cell__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:434:1: ( ( () ) )
            // InternalCsv.g:435:1: ( () )
            {
            // InternalCsv.g:435:1: ( () )
            // InternalCsv.g:436:2: ()
            {
             before(grammarAccess.getCellAccess().getFreeCellAction_1_0()); 
            // InternalCsv.g:437:2: ()
            // InternalCsv.g:437:3: 
            {
            }

             after(grammarAccess.getCellAccess().getFreeCellAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group_1__0__Impl"


    // $ANTLR start "rule__Cell__Group_1__1"
    // InternalCsv.g:445:1: rule__Cell__Group_1__1 : rule__Cell__Group_1__1__Impl ;
    public final void rule__Cell__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:449:1: ( rule__Cell__Group_1__1__Impl )
            // InternalCsv.g:450:2: rule__Cell__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group_1__1__Impl();

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
    // $ANTLR end "rule__Cell__Group_1__1"


    // $ANTLR start "rule__Cell__Group_1__1__Impl"
    // InternalCsv.g:456:1: rule__Cell__Group_1__1__Impl : ( ( rule__Cell__ContentAssignment_1_1 ) ) ;
    public final void rule__Cell__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:460:1: ( ( ( rule__Cell__ContentAssignment_1_1 ) ) )
            // InternalCsv.g:461:1: ( ( rule__Cell__ContentAssignment_1_1 ) )
            {
            // InternalCsv.g:461:1: ( ( rule__Cell__ContentAssignment_1_1 ) )
            // InternalCsv.g:462:2: ( rule__Cell__ContentAssignment_1_1 )
            {
             before(grammarAccess.getCellAccess().getContentAssignment_1_1()); 
            // InternalCsv.g:463:2: ( rule__Cell__ContentAssignment_1_1 )
            // InternalCsv.g:463:3: rule__Cell__ContentAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__ContentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getContentAssignment_1_1()); 

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
    // $ANTLR end "rule__Cell__Group_1__1__Impl"


    // $ANTLR start "rule__Model__LinesAssignment_0"
    // InternalCsv.g:472:1: rule__Model__LinesAssignment_0 : ( ruleLine ) ;
    public final void rule__Model__LinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:476:1: ( ( ruleLine ) )
            // InternalCsv.g:477:2: ( ruleLine )
            {
            // InternalCsv.g:477:2: ( ruleLine )
            // InternalCsv.g:478:3: ruleLine
            {
             before(grammarAccess.getModelAccess().getLinesLineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLinesLineParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__LinesAssignment_0"


    // $ANTLR start "rule__Model__LinesAssignment_1_1"
    // InternalCsv.g:487:1: rule__Model__LinesAssignment_1_1 : ( ruleLine ) ;
    public final void rule__Model__LinesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:491:1: ( ( ruleLine ) )
            // InternalCsv.g:492:2: ( ruleLine )
            {
            // InternalCsv.g:492:2: ( ruleLine )
            // InternalCsv.g:493:3: ruleLine
            {
             before(grammarAccess.getModelAccess().getLinesLineParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLinesLineParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Model__LinesAssignment_1_1"


    // $ANTLR start "rule__Line__CellsAssignment_0"
    // InternalCsv.g:502:1: rule__Line__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Line__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:506:1: ( ( ruleCell ) )
            // InternalCsv.g:507:2: ( ruleCell )
            {
            // InternalCsv.g:507:2: ( ruleCell )
            // InternalCsv.g:508:3: ruleCell
            {
             before(grammarAccess.getLineAccess().getCellsCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCellsCellParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Line__CellsAssignment_0"


    // $ANTLR start "rule__Line__CellsAssignment_1_1"
    // InternalCsv.g:517:1: rule__Line__CellsAssignment_1_1 : ( ruleCell ) ;
    public final void rule__Line__CellsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:521:1: ( ( ruleCell ) )
            // InternalCsv.g:522:2: ( ruleCell )
            {
            // InternalCsv.g:522:2: ( ruleCell )
            // InternalCsv.g:523:3: ruleCell
            {
             before(grammarAccess.getLineAccess().getCellsCellParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getLineAccess().getCellsCellParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Line__CellsAssignment_1_1"


    // $ANTLR start "rule__Cell__ContentAssignment_0_1"
    // InternalCsv.g:532:1: rule__Cell__ContentAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Cell__ContentAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:536:1: ( ( RULE_STRING ) )
            // InternalCsv.g:537:2: ( RULE_STRING )
            {
            // InternalCsv.g:537:2: ( RULE_STRING )
            // InternalCsv.g:538:3: RULE_STRING
            {
             before(grammarAccess.getCellAccess().getContentSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getContentSTRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Cell__ContentAssignment_0_1"


    // $ANTLR start "rule__Cell__ContentAssignment_1_1"
    // InternalCsv.g:547:1: rule__Cell__ContentAssignment_1_1 : ( RULE_FREE_CELL ) ;
    public final void rule__Cell__ContentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsv.g:551:1: ( ( RULE_FREE_CELL ) )
            // InternalCsv.g:552:2: ( RULE_FREE_CELL )
            {
            // InternalCsv.g:552:2: ( RULE_FREE_CELL )
            // InternalCsv.g:553:3: RULE_FREE_CELL
            {
             before(grammarAccess.getCellAccess().getContentFREE_CELLTerminalRuleCall_1_1_0()); 
            match(input,RULE_FREE_CELL,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getContentFREE_CELLTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Cell__ContentAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});

}