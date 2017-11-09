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
import fr.mleduc.services.ColdLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalColdLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'concern'", "'{'", "'}'", "'import'", "'oneOf'", "'['", "']'", "'-'", "'someOf'", "'feature'", "'language'", "':'", "'=>'", "'perspective'", "'facet'", "'activation'", "'('", "')'", "','", "'artifact'", "'<=>'", "'or'", "'and'", "'!'", "'.'", "'?'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalColdLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalColdLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalColdLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalColdLang.g"; }


    	private ColdLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(ColdLangGrammarAccess grammarAccess) {
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
    // InternalColdLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalColdLang.g:54:1: ( ruleModel EOF )
            // InternalColdLang.g:55:1: ruleModel EOF
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
    // InternalColdLang.g:62:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:66:2: ( ( ( rule__Model__Alternatives )* ) )
            // InternalColdLang.g:67:2: ( ( rule__Model__Alternatives )* )
            {
            // InternalColdLang.g:67:2: ( ( rule__Model__Alternatives )* )
            // InternalColdLang.g:68:3: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalColdLang.g:69:3: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalColdLang.g:69:4: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleConcern"
    // InternalColdLang.g:78:1: entryRuleConcern : ruleConcern EOF ;
    public final void entryRuleConcern() throws RecognitionException {
        try {
            // InternalColdLang.g:79:1: ( ruleConcern EOF )
            // InternalColdLang.g:80:1: ruleConcern EOF
            {
             before(grammarAccess.getConcernRule()); 
            pushFollow(FOLLOW_1);
            ruleConcern();

            state._fsp--;

             after(grammarAccess.getConcernRule()); 
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
    // $ANTLR end "entryRuleConcern"


    // $ANTLR start "ruleConcern"
    // InternalColdLang.g:87:1: ruleConcern : ( ( rule__Concern__Group__0 ) ) ;
    public final void ruleConcern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:91:2: ( ( ( rule__Concern__Group__0 ) ) )
            // InternalColdLang.g:92:2: ( ( rule__Concern__Group__0 ) )
            {
            // InternalColdLang.g:92:2: ( ( rule__Concern__Group__0 ) )
            // InternalColdLang.g:93:3: ( rule__Concern__Group__0 )
            {
             before(grammarAccess.getConcernAccess().getGroup()); 
            // InternalColdLang.g:94:3: ( rule__Concern__Group__0 )
            // InternalColdLang.g:94:4: rule__Concern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getGroup()); 

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
    // $ANTLR end "ruleConcern"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalColdLang.g:103:1: entryRuleFeatureModel : ruleFeatureModel EOF ;
    public final void entryRuleFeatureModel() throws RecognitionException {
        try {
            // InternalColdLang.g:104:1: ( ruleFeatureModel EOF )
            // InternalColdLang.g:105:1: ruleFeatureModel EOF
            {
             before(grammarAccess.getFeatureModelRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getFeatureModelRule()); 
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
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalColdLang.g:112:1: ruleFeatureModel : ( ( rule__FeatureModel__Alternatives ) ) ;
    public final void ruleFeatureModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:116:2: ( ( ( rule__FeatureModel__Alternatives ) ) )
            // InternalColdLang.g:117:2: ( ( rule__FeatureModel__Alternatives ) )
            {
            // InternalColdLang.g:117:2: ( ( rule__FeatureModel__Alternatives ) )
            // InternalColdLang.g:118:3: ( rule__FeatureModel__Alternatives )
            {
             before(grammarAccess.getFeatureModelAccess().getAlternatives()); 
            // InternalColdLang.g:119:3: ( rule__FeatureModel__Alternatives )
            // InternalColdLang.g:119:4: rule__FeatureModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureModelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleOneOf"
    // InternalColdLang.g:128:1: entryRuleOneOf : ruleOneOf EOF ;
    public final void entryRuleOneOf() throws RecognitionException {
        try {
            // InternalColdLang.g:129:1: ( ruleOneOf EOF )
            // InternalColdLang.g:130:1: ruleOneOf EOF
            {
             before(grammarAccess.getOneOfRule()); 
            pushFollow(FOLLOW_1);
            ruleOneOf();

            state._fsp--;

             after(grammarAccess.getOneOfRule()); 
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
    // $ANTLR end "entryRuleOneOf"


    // $ANTLR start "ruleOneOf"
    // InternalColdLang.g:137:1: ruleOneOf : ( ( rule__OneOf__Group__0 ) ) ;
    public final void ruleOneOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:141:2: ( ( ( rule__OneOf__Group__0 ) ) )
            // InternalColdLang.g:142:2: ( ( rule__OneOf__Group__0 ) )
            {
            // InternalColdLang.g:142:2: ( ( rule__OneOf__Group__0 ) )
            // InternalColdLang.g:143:3: ( rule__OneOf__Group__0 )
            {
             before(grammarAccess.getOneOfAccess().getGroup()); 
            // InternalColdLang.g:144:3: ( rule__OneOf__Group__0 )
            // InternalColdLang.g:144:4: rule__OneOf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OneOf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOneOfAccess().getGroup()); 

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
    // $ANTLR end "ruleOneOf"


    // $ANTLR start "entryRuleSomeOf"
    // InternalColdLang.g:153:1: entryRuleSomeOf : ruleSomeOf EOF ;
    public final void entryRuleSomeOf() throws RecognitionException {
        try {
            // InternalColdLang.g:154:1: ( ruleSomeOf EOF )
            // InternalColdLang.g:155:1: ruleSomeOf EOF
            {
             before(grammarAccess.getSomeOfRule()); 
            pushFollow(FOLLOW_1);
            ruleSomeOf();

            state._fsp--;

             after(grammarAccess.getSomeOfRule()); 
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
    // $ANTLR end "entryRuleSomeOf"


    // $ANTLR start "ruleSomeOf"
    // InternalColdLang.g:162:1: ruleSomeOf : ( ( rule__SomeOf__Group__0 ) ) ;
    public final void ruleSomeOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:166:2: ( ( ( rule__SomeOf__Group__0 ) ) )
            // InternalColdLang.g:167:2: ( ( rule__SomeOf__Group__0 ) )
            {
            // InternalColdLang.g:167:2: ( ( rule__SomeOf__Group__0 ) )
            // InternalColdLang.g:168:3: ( rule__SomeOf__Group__0 )
            {
             before(grammarAccess.getSomeOfAccess().getGroup()); 
            // InternalColdLang.g:169:3: ( rule__SomeOf__Group__0 )
            // InternalColdLang.g:169:4: rule__SomeOf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSomeOfAccess().getGroup()); 

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
    // $ANTLR end "ruleSomeOf"


    // $ANTLR start "entryRuleFeature"
    // InternalColdLang.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalColdLang.g:179:1: ( ruleFeature EOF )
            // InternalColdLang.g:180:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalColdLang.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalColdLang.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalColdLang.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalColdLang.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalColdLang.g:194:3: ( rule__Feature__Group__0 )
            // InternalColdLang.g:194:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleLanguage"
    // InternalColdLang.g:203:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalColdLang.g:204:1: ( ruleLanguage EOF )
            // InternalColdLang.g:205:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalColdLang.g:212:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:216:2: ( ( ( rule__Language__Group__0 ) ) )
            // InternalColdLang.g:217:2: ( ( rule__Language__Group__0 ) )
            {
            // InternalColdLang.g:217:2: ( ( rule__Language__Group__0 ) )
            // InternalColdLang.g:218:3: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // InternalColdLang.g:219:3: ( rule__Language__Group__0 )
            // InternalColdLang.g:219:4: rule__Language__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleLanguageOperator"
    // InternalColdLang.g:228:1: entryRuleLanguageOperator : ruleLanguageOperator EOF ;
    public final void entryRuleLanguageOperator() throws RecognitionException {
        try {
            // InternalColdLang.g:229:1: ( ruleLanguageOperator EOF )
            // InternalColdLang.g:230:1: ruleLanguageOperator EOF
            {
             before(grammarAccess.getLanguageOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageOperator();

            state._fsp--;

             after(grammarAccess.getLanguageOperatorRule()); 
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
    // $ANTLR end "entryRuleLanguageOperator"


    // $ANTLR start "ruleLanguageOperator"
    // InternalColdLang.g:237:1: ruleLanguageOperator : ( ( rule__LanguageOperator__Group__0 ) ) ;
    public final void ruleLanguageOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:241:2: ( ( ( rule__LanguageOperator__Group__0 ) ) )
            // InternalColdLang.g:242:2: ( ( rule__LanguageOperator__Group__0 ) )
            {
            // InternalColdLang.g:242:2: ( ( rule__LanguageOperator__Group__0 ) )
            // InternalColdLang.g:243:3: ( rule__LanguageOperator__Group__0 )
            {
             before(grammarAccess.getLanguageOperatorAccess().getGroup()); 
            // InternalColdLang.g:244:3: ( rule__LanguageOperator__Group__0 )
            // InternalColdLang.g:244:4: rule__LanguageOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOperatorAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguageOperator"


    // $ANTLR start "entryRulePerspective"
    // InternalColdLang.g:253:1: entryRulePerspective : rulePerspective EOF ;
    public final void entryRulePerspective() throws RecognitionException {
        try {
            // InternalColdLang.g:254:1: ( rulePerspective EOF )
            // InternalColdLang.g:255:1: rulePerspective EOF
            {
             before(grammarAccess.getPerspectiveRule()); 
            pushFollow(FOLLOW_1);
            rulePerspective();

            state._fsp--;

             after(grammarAccess.getPerspectiveRule()); 
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
    // $ANTLR end "entryRulePerspective"


    // $ANTLR start "rulePerspective"
    // InternalColdLang.g:262:1: rulePerspective : ( ( rule__Perspective__Group__0 ) ) ;
    public final void rulePerspective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:266:2: ( ( ( rule__Perspective__Group__0 ) ) )
            // InternalColdLang.g:267:2: ( ( rule__Perspective__Group__0 ) )
            {
            // InternalColdLang.g:267:2: ( ( rule__Perspective__Group__0 ) )
            // InternalColdLang.g:268:3: ( rule__Perspective__Group__0 )
            {
             before(grammarAccess.getPerspectiveAccess().getGroup()); 
            // InternalColdLang.g:269:3: ( rule__Perspective__Group__0 )
            // InternalColdLang.g:269:4: rule__Perspective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getGroup()); 

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
    // $ANTLR end "rulePerspective"


    // $ANTLR start "entryRulePerspectiveLanguage"
    // InternalColdLang.g:278:1: entryRulePerspectiveLanguage : rulePerspectiveLanguage EOF ;
    public final void entryRulePerspectiveLanguage() throws RecognitionException {
        try {
            // InternalColdLang.g:279:1: ( rulePerspectiveLanguage EOF )
            // InternalColdLang.g:280:1: rulePerspectiveLanguage EOF
            {
             before(grammarAccess.getPerspectiveLanguageRule()); 
            pushFollow(FOLLOW_1);
            rulePerspectiveLanguage();

            state._fsp--;

             after(grammarAccess.getPerspectiveLanguageRule()); 
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
    // $ANTLR end "entryRulePerspectiveLanguage"


    // $ANTLR start "rulePerspectiveLanguage"
    // InternalColdLang.g:287:1: rulePerspectiveLanguage : ( ( rule__PerspectiveLanguage__Group__0 ) ) ;
    public final void rulePerspectiveLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:291:2: ( ( ( rule__PerspectiveLanguage__Group__0 ) ) )
            // InternalColdLang.g:292:2: ( ( rule__PerspectiveLanguage__Group__0 ) )
            {
            // InternalColdLang.g:292:2: ( ( rule__PerspectiveLanguage__Group__0 ) )
            // InternalColdLang.g:293:3: ( rule__PerspectiveLanguage__Group__0 )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getGroup()); 
            // InternalColdLang.g:294:3: ( rule__PerspectiveLanguage__Group__0 )
            // InternalColdLang.g:294:4: rule__PerspectiveLanguage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveLanguageAccess().getGroup()); 

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
    // $ANTLR end "rulePerspectiveLanguage"


    // $ANTLR start "entryRuleFacet"
    // InternalColdLang.g:303:1: entryRuleFacet : ruleFacet EOF ;
    public final void entryRuleFacet() throws RecognitionException {
        try {
            // InternalColdLang.g:304:1: ( ruleFacet EOF )
            // InternalColdLang.g:305:1: ruleFacet EOF
            {
             before(grammarAccess.getFacetRule()); 
            pushFollow(FOLLOW_1);
            ruleFacet();

            state._fsp--;

             after(grammarAccess.getFacetRule()); 
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
    // $ANTLR end "entryRuleFacet"


    // $ANTLR start "ruleFacet"
    // InternalColdLang.g:312:1: ruleFacet : ( ( rule__Facet__Group__0 ) ) ;
    public final void ruleFacet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:316:2: ( ( ( rule__Facet__Group__0 ) ) )
            // InternalColdLang.g:317:2: ( ( rule__Facet__Group__0 ) )
            {
            // InternalColdLang.g:317:2: ( ( rule__Facet__Group__0 ) )
            // InternalColdLang.g:318:3: ( rule__Facet__Group__0 )
            {
             before(grammarAccess.getFacetAccess().getGroup()); 
            // InternalColdLang.g:319:3: ( rule__Facet__Group__0 )
            // InternalColdLang.g:319:4: rule__Facet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Facet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFacetAccess().getGroup()); 

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
    // $ANTLR end "ruleFacet"


    // $ANTLR start "entryRuleFacetComposition"
    // InternalColdLang.g:328:1: entryRuleFacetComposition : ruleFacetComposition EOF ;
    public final void entryRuleFacetComposition() throws RecognitionException {
        try {
            // InternalColdLang.g:329:1: ( ruleFacetComposition EOF )
            // InternalColdLang.g:330:1: ruleFacetComposition EOF
            {
             before(grammarAccess.getFacetCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleFacetComposition();

            state._fsp--;

             after(grammarAccess.getFacetCompositionRule()); 
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
    // $ANTLR end "entryRuleFacetComposition"


    // $ANTLR start "ruleFacetComposition"
    // InternalColdLang.g:337:1: ruleFacetComposition : ( ( rule__FacetComposition__Group__0 ) ) ;
    public final void ruleFacetComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:341:2: ( ( ( rule__FacetComposition__Group__0 ) ) )
            // InternalColdLang.g:342:2: ( ( rule__FacetComposition__Group__0 ) )
            {
            // InternalColdLang.g:342:2: ( ( rule__FacetComposition__Group__0 ) )
            // InternalColdLang.g:343:3: ( rule__FacetComposition__Group__0 )
            {
             before(grammarAccess.getFacetCompositionAccess().getGroup()); 
            // InternalColdLang.g:344:3: ( rule__FacetComposition__Group__0 )
            // InternalColdLang.g:344:4: rule__FacetComposition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FacetComposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFacetCompositionAccess().getGroup()); 

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
    // $ANTLR end "ruleFacetComposition"


    // $ANTLR start "entryRuleApplication"
    // InternalColdLang.g:353:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalColdLang.g:354:1: ( ruleApplication EOF )
            // InternalColdLang.g:355:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalColdLang.g:362:1: ruleApplication : ( ( rule__Application__Alternatives ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:366:2: ( ( ( rule__Application__Alternatives ) ) )
            // InternalColdLang.g:367:2: ( ( rule__Application__Alternatives ) )
            {
            // InternalColdLang.g:367:2: ( ( rule__Application__Alternatives ) )
            // InternalColdLang.g:368:3: ( rule__Application__Alternatives )
            {
             before(grammarAccess.getApplicationAccess().getAlternatives()); 
            // InternalColdLang.g:369:3: ( rule__Application__Alternatives )
            // InternalColdLang.g:369:4: rule__Application__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Application__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleArtifact"
    // InternalColdLang.g:378:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // InternalColdLang.g:379:1: ( ruleArtifact EOF )
            // InternalColdLang.g:380:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalColdLang.g:387:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:391:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // InternalColdLang.g:392:2: ( ( rule__Artifact__Group__0 ) )
            {
            // InternalColdLang.g:392:2: ( ( rule__Artifact__Group__0 ) )
            // InternalColdLang.g:393:3: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // InternalColdLang.g:394:3: ( rule__Artifact__Group__0 )
            // InternalColdLang.g:394:4: rule__Artifact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getGroup()); 

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleCondition"
    // InternalColdLang.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalColdLang.g:404:1: ( ruleCondition EOF )
            // InternalColdLang.g:405:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalColdLang.g:412:1: ruleCondition : ( ruleEquiv ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:416:2: ( ( ruleEquiv ) )
            // InternalColdLang.g:417:2: ( ruleEquiv )
            {
            // InternalColdLang.g:417:2: ( ruleEquiv )
            // InternalColdLang.g:418:3: ruleEquiv
            {
             before(grammarAccess.getConditionAccess().getEquivParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleEquiv();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getEquivParserRuleCall()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEquiv"
    // InternalColdLang.g:428:1: entryRuleEquiv : ruleEquiv EOF ;
    public final void entryRuleEquiv() throws RecognitionException {
        try {
            // InternalColdLang.g:429:1: ( ruleEquiv EOF )
            // InternalColdLang.g:430:1: ruleEquiv EOF
            {
             before(grammarAccess.getEquivRule()); 
            pushFollow(FOLLOW_1);
            ruleEquiv();

            state._fsp--;

             after(grammarAccess.getEquivRule()); 
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
    // $ANTLR end "entryRuleEquiv"


    // $ANTLR start "ruleEquiv"
    // InternalColdLang.g:437:1: ruleEquiv : ( ( rule__Equiv__Group__0 ) ) ;
    public final void ruleEquiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:441:2: ( ( ( rule__Equiv__Group__0 ) ) )
            // InternalColdLang.g:442:2: ( ( rule__Equiv__Group__0 ) )
            {
            // InternalColdLang.g:442:2: ( ( rule__Equiv__Group__0 ) )
            // InternalColdLang.g:443:3: ( rule__Equiv__Group__0 )
            {
             before(grammarAccess.getEquivAccess().getGroup()); 
            // InternalColdLang.g:444:3: ( rule__Equiv__Group__0 )
            // InternalColdLang.g:444:4: rule__Equiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEquivAccess().getGroup()); 

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
    // $ANTLR end "ruleEquiv"


    // $ANTLR start "entryRuleImply"
    // InternalColdLang.g:453:1: entryRuleImply : ruleImply EOF ;
    public final void entryRuleImply() throws RecognitionException {
        try {
            // InternalColdLang.g:454:1: ( ruleImply EOF )
            // InternalColdLang.g:455:1: ruleImply EOF
            {
             before(grammarAccess.getImplyRule()); 
            pushFollow(FOLLOW_1);
            ruleImply();

            state._fsp--;

             after(grammarAccess.getImplyRule()); 
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
    // $ANTLR end "entryRuleImply"


    // $ANTLR start "ruleImply"
    // InternalColdLang.g:462:1: ruleImply : ( ( rule__Imply__Group__0 ) ) ;
    public final void ruleImply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:466:2: ( ( ( rule__Imply__Group__0 ) ) )
            // InternalColdLang.g:467:2: ( ( rule__Imply__Group__0 ) )
            {
            // InternalColdLang.g:467:2: ( ( rule__Imply__Group__0 ) )
            // InternalColdLang.g:468:3: ( rule__Imply__Group__0 )
            {
             before(grammarAccess.getImplyAccess().getGroup()); 
            // InternalColdLang.g:469:3: ( rule__Imply__Group__0 )
            // InternalColdLang.g:469:4: rule__Imply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Imply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplyAccess().getGroup()); 

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
    // $ANTLR end "ruleImply"


    // $ANTLR start "entryRuleOr"
    // InternalColdLang.g:478:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalColdLang.g:479:1: ( ruleOr EOF )
            // InternalColdLang.g:480:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalColdLang.g:487:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:491:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalColdLang.g:492:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalColdLang.g:492:2: ( ( rule__Or__Group__0 ) )
            // InternalColdLang.g:493:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalColdLang.g:494:3: ( rule__Or__Group__0 )
            // InternalColdLang.g:494:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalColdLang.g:503:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalColdLang.g:504:1: ( ruleAnd EOF )
            // InternalColdLang.g:505:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalColdLang.g:512:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:516:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalColdLang.g:517:2: ( ( rule__And__Group__0 ) )
            {
            // InternalColdLang.g:517:2: ( ( rule__And__Group__0 ) )
            // InternalColdLang.g:518:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalColdLang.g:519:3: ( rule__And__Group__0 )
            // InternalColdLang.g:519:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // InternalColdLang.g:528:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalColdLang.g:529:1: ( rulePrimary EOF )
            // InternalColdLang.g:530:1: rulePrimary EOF
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
    // InternalColdLang.g:537:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:541:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalColdLang.g:542:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalColdLang.g:542:2: ( ( rule__Primary__Alternatives ) )
            // InternalColdLang.g:543:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalColdLang.g:544:3: ( rule__Primary__Alternatives )
            // InternalColdLang.g:544:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleIDS"
    // InternalColdLang.g:553:1: entryRuleIDS : ruleIDS EOF ;
    public final void entryRuleIDS() throws RecognitionException {
        try {
            // InternalColdLang.g:554:1: ( ruleIDS EOF )
            // InternalColdLang.g:555:1: ruleIDS EOF
            {
             before(grammarAccess.getIDSRule()); 
            pushFollow(FOLLOW_1);
            ruleIDS();

            state._fsp--;

             after(grammarAccess.getIDSRule()); 
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
    // $ANTLR end "entryRuleIDS"


    // $ANTLR start "ruleIDS"
    // InternalColdLang.g:562:1: ruleIDS : ( ( rule__IDS__Group__0 ) ) ;
    public final void ruleIDS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:566:2: ( ( ( rule__IDS__Group__0 ) ) )
            // InternalColdLang.g:567:2: ( ( rule__IDS__Group__0 ) )
            {
            // InternalColdLang.g:567:2: ( ( rule__IDS__Group__0 ) )
            // InternalColdLang.g:568:3: ( rule__IDS__Group__0 )
            {
             before(grammarAccess.getIDSAccess().getGroup()); 
            // InternalColdLang.g:569:3: ( rule__IDS__Group__0 )
            // InternalColdLang.g:569:4: rule__IDS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IDS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIDSAccess().getGroup()); 

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
    // $ANTLR end "ruleIDS"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalColdLang.g:577:1: rule__Model__Alternatives : ( ( ( rule__Model__ConcernsAssignment_0 ) ) | ( ( rule__Model__LanguagesAssignment_1 ) ) | ( ( rule__Model__PerspectivesAssignment_2 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:581:1: ( ( ( rule__Model__ConcernsAssignment_0 ) ) | ( ( rule__Model__LanguagesAssignment_1 ) ) | ( ( rule__Model__PerspectivesAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalColdLang.g:582:2: ( ( rule__Model__ConcernsAssignment_0 ) )
                    {
                    // InternalColdLang.g:582:2: ( ( rule__Model__ConcernsAssignment_0 ) )
                    // InternalColdLang.g:583:3: ( rule__Model__ConcernsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getConcernsAssignment_0()); 
                    // InternalColdLang.g:584:3: ( rule__Model__ConcernsAssignment_0 )
                    // InternalColdLang.g:584:4: rule__Model__ConcernsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConcernsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getConcernsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:588:2: ( ( rule__Model__LanguagesAssignment_1 ) )
                    {
                    // InternalColdLang.g:588:2: ( ( rule__Model__LanguagesAssignment_1 ) )
                    // InternalColdLang.g:589:3: ( rule__Model__LanguagesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getLanguagesAssignment_1()); 
                    // InternalColdLang.g:590:3: ( rule__Model__LanguagesAssignment_1 )
                    // InternalColdLang.g:590:4: rule__Model__LanguagesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__LanguagesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getLanguagesAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalColdLang.g:594:2: ( ( rule__Model__PerspectivesAssignment_2 ) )
                    {
                    // InternalColdLang.g:594:2: ( ( rule__Model__PerspectivesAssignment_2 ) )
                    // InternalColdLang.g:595:3: ( rule__Model__PerspectivesAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getPerspectivesAssignment_2()); 
                    // InternalColdLang.g:596:3: ( rule__Model__PerspectivesAssignment_2 )
                    // InternalColdLang.g:596:4: rule__Model__PerspectivesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PerspectivesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPerspectivesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Concern__Alternatives_4"
    // InternalColdLang.g:604:1: rule__Concern__Alternatives_4 : ( ( ( rule__Concern__FacetsAssignment_4_0 ) ) | ( ( rule__Concern__ArtifactAssignment_4_1 ) ) );
    public final void rule__Concern__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:608:1: ( ( ( rule__Concern__FacetsAssignment_4_0 ) ) | ( ( rule__Concern__ArtifactAssignment_4_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalColdLang.g:609:2: ( ( rule__Concern__FacetsAssignment_4_0 ) )
                    {
                    // InternalColdLang.g:609:2: ( ( rule__Concern__FacetsAssignment_4_0 ) )
                    // InternalColdLang.g:610:3: ( rule__Concern__FacetsAssignment_4_0 )
                    {
                     before(grammarAccess.getConcernAccess().getFacetsAssignment_4_0()); 
                    // InternalColdLang.g:611:3: ( rule__Concern__FacetsAssignment_4_0 )
                    // InternalColdLang.g:611:4: rule__Concern__FacetsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__FacetsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getFacetsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:615:2: ( ( rule__Concern__ArtifactAssignment_4_1 ) )
                    {
                    // InternalColdLang.g:615:2: ( ( rule__Concern__ArtifactAssignment_4_1 ) )
                    // InternalColdLang.g:616:3: ( rule__Concern__ArtifactAssignment_4_1 )
                    {
                     before(grammarAccess.getConcernAccess().getArtifactAssignment_4_1()); 
                    // InternalColdLang.g:617:3: ( rule__Concern__ArtifactAssignment_4_1 )
                    // InternalColdLang.g:617:4: rule__Concern__ArtifactAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__ArtifactAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcernAccess().getArtifactAssignment_4_1()); 

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
    // $ANTLR end "rule__Concern__Alternatives_4"


    // $ANTLR start "rule__FeatureModel__Alternatives"
    // InternalColdLang.g:625:1: rule__FeatureModel__Alternatives : ( ( ruleOneOf ) | ( ruleSomeOf ) | ( ruleFeature ) );
    public final void rule__FeatureModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:629:1: ( ( ruleOneOf ) | ( ruleSomeOf ) | ( ruleFeature ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 15:
                    {
                    alt4=1;
                    }
                    break;
                case 19:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 15:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalColdLang.g:630:2: ( ruleOneOf )
                    {
                    // InternalColdLang.g:630:2: ( ruleOneOf )
                    // InternalColdLang.g:631:3: ruleOneOf
                    {
                     before(grammarAccess.getFeatureModelAccess().getOneOfParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOneOf();

                    state._fsp--;

                     after(grammarAccess.getFeatureModelAccess().getOneOfParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:636:2: ( ruleSomeOf )
                    {
                    // InternalColdLang.g:636:2: ( ruleSomeOf )
                    // InternalColdLang.g:637:3: ruleSomeOf
                    {
                     before(grammarAccess.getFeatureModelAccess().getSomeOfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSomeOf();

                    state._fsp--;

                     after(grammarAccess.getFeatureModelAccess().getSomeOfParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalColdLang.g:642:2: ( ruleFeature )
                    {
                    // InternalColdLang.g:642:2: ( ruleFeature )
                    // InternalColdLang.g:643:3: ruleFeature
                    {
                     before(grammarAccess.getFeatureModelAccess().getFeatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureModelAccess().getFeatureParserRuleCall_2()); 

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
    // $ANTLR end "rule__FeatureModel__Alternatives"


    // $ANTLR start "rule__Application__Alternatives"
    // InternalColdLang.g:652:1: rule__Application__Alternatives : ( ( ( rule__Application__Group_0__0 ) ) | ( ( rule__Application__Group_1__0 ) ) );
    public final void rule__Application__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:656:1: ( ( ( rule__Application__Group_0__0 ) ) | ( ( rule__Application__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==13||(LA5_1>=28 && LA5_1<=29)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==27) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalColdLang.g:657:2: ( ( rule__Application__Group_0__0 ) )
                    {
                    // InternalColdLang.g:657:2: ( ( rule__Application__Group_0__0 ) )
                    // InternalColdLang.g:658:3: ( rule__Application__Group_0__0 )
                    {
                     before(grammarAccess.getApplicationAccess().getGroup_0()); 
                    // InternalColdLang.g:659:3: ( rule__Application__Group_0__0 )
                    // InternalColdLang.g:659:4: rule__Application__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplicationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalColdLang.g:663:2: ( ( rule__Application__Group_1__0 ) )
                    {
                    // InternalColdLang.g:663:2: ( ( rule__Application__Group_1__0 ) )
                    // InternalColdLang.g:664:3: ( rule__Application__Group_1__0 )
                    {
                     before(grammarAccess.getApplicationAccess().getGroup_1()); 
                    // InternalColdLang.g:665:3: ( rule__Application__Group_1__0 )
                    // InternalColdLang.g:665:4: rule__Application__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getApplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Application__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalColdLang.g:673:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:677:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalColdLang.g:678:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalColdLang.g:678:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalColdLang.g:679:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalColdLang.g:680:3: ( rule__Primary__Group_0__0 )
                    // InternalColdLang.g:680:4: rule__Primary__Group_0__0
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
                    // InternalColdLang.g:684:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalColdLang.g:684:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalColdLang.g:685:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalColdLang.g:686:3: ( rule__Primary__Group_1__0 )
                    // InternalColdLang.g:686:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalColdLang.g:690:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalColdLang.g:690:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalColdLang.g:691:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalColdLang.g:692:3: ( rule__Primary__Group_2__0 )
                    // InternalColdLang.g:692:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Concern__Group__0"
    // InternalColdLang.g:700:1: rule__Concern__Group__0 : rule__Concern__Group__0__Impl rule__Concern__Group__1 ;
    public final void rule__Concern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:704:1: ( rule__Concern__Group__0__Impl rule__Concern__Group__1 )
            // InternalColdLang.g:705:2: rule__Concern__Group__0__Impl rule__Concern__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Concern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__1();

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
    // $ANTLR end "rule__Concern__Group__0"


    // $ANTLR start "rule__Concern__Group__0__Impl"
    // InternalColdLang.g:712:1: rule__Concern__Group__0__Impl : ( 'concern' ) ;
    public final void rule__Concern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:716:1: ( ( 'concern' ) )
            // InternalColdLang.g:717:1: ( 'concern' )
            {
            // InternalColdLang.g:717:1: ( 'concern' )
            // InternalColdLang.g:718:2: 'concern'
            {
             before(grammarAccess.getConcernAccess().getConcernKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getConcernKeyword_0()); 

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
    // $ANTLR end "rule__Concern__Group__0__Impl"


    // $ANTLR start "rule__Concern__Group__1"
    // InternalColdLang.g:727:1: rule__Concern__Group__1 : rule__Concern__Group__1__Impl rule__Concern__Group__2 ;
    public final void rule__Concern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:731:1: ( rule__Concern__Group__1__Impl rule__Concern__Group__2 )
            // InternalColdLang.g:732:2: rule__Concern__Group__1__Impl rule__Concern__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Concern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__2();

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
    // $ANTLR end "rule__Concern__Group__1"


    // $ANTLR start "rule__Concern__Group__1__Impl"
    // InternalColdLang.g:739:1: rule__Concern__Group__1__Impl : ( ( rule__Concern__NameAssignment_1 ) ) ;
    public final void rule__Concern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:743:1: ( ( ( rule__Concern__NameAssignment_1 ) ) )
            // InternalColdLang.g:744:1: ( ( rule__Concern__NameAssignment_1 ) )
            {
            // InternalColdLang.g:744:1: ( ( rule__Concern__NameAssignment_1 ) )
            // InternalColdLang.g:745:2: ( rule__Concern__NameAssignment_1 )
            {
             before(grammarAccess.getConcernAccess().getNameAssignment_1()); 
            // InternalColdLang.g:746:2: ( rule__Concern__NameAssignment_1 )
            // InternalColdLang.g:746:3: rule__Concern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Concern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Concern__Group__1__Impl"


    // $ANTLR start "rule__Concern__Group__2"
    // InternalColdLang.g:754:1: rule__Concern__Group__2 : rule__Concern__Group__2__Impl rule__Concern__Group__3 ;
    public final void rule__Concern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:758:1: ( rule__Concern__Group__2__Impl rule__Concern__Group__3 )
            // InternalColdLang.g:759:2: rule__Concern__Group__2__Impl rule__Concern__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Concern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__3();

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
    // $ANTLR end "rule__Concern__Group__2"


    // $ANTLR start "rule__Concern__Group__2__Impl"
    // InternalColdLang.g:766:1: rule__Concern__Group__2__Impl : ( '{' ) ;
    public final void rule__Concern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:770:1: ( ( '{' ) )
            // InternalColdLang.g:771:1: ( '{' )
            {
            // InternalColdLang.g:771:1: ( '{' )
            // InternalColdLang.g:772:2: '{'
            {
             before(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Concern__Group__2__Impl"


    // $ANTLR start "rule__Concern__Group__3"
    // InternalColdLang.g:781:1: rule__Concern__Group__3 : rule__Concern__Group__3__Impl rule__Concern__Group__4 ;
    public final void rule__Concern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:785:1: ( rule__Concern__Group__3__Impl rule__Concern__Group__4 )
            // InternalColdLang.g:786:2: rule__Concern__Group__3__Impl rule__Concern__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Concern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__4();

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
    // $ANTLR end "rule__Concern__Group__3"


    // $ANTLR start "rule__Concern__Group__3__Impl"
    // InternalColdLang.g:793:1: rule__Concern__Group__3__Impl : ( ( rule__Concern__Group_3__0 )? ) ;
    public final void rule__Concern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:797:1: ( ( ( rule__Concern__Group_3__0 )? ) )
            // InternalColdLang.g:798:1: ( ( rule__Concern__Group_3__0 )? )
            {
            // InternalColdLang.g:798:1: ( ( rule__Concern__Group_3__0 )? )
            // InternalColdLang.g:799:2: ( rule__Concern__Group_3__0 )?
            {
             before(grammarAccess.getConcernAccess().getGroup_3()); 
            // InternalColdLang.g:800:2: ( rule__Concern__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalColdLang.g:800:3: rule__Concern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concern__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcernAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Concern__Group__3__Impl"


    // $ANTLR start "rule__Concern__Group__4"
    // InternalColdLang.g:808:1: rule__Concern__Group__4 : rule__Concern__Group__4__Impl rule__Concern__Group__5 ;
    public final void rule__Concern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:812:1: ( rule__Concern__Group__4__Impl rule__Concern__Group__5 )
            // InternalColdLang.g:813:2: rule__Concern__Group__4__Impl rule__Concern__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Concern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__5();

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
    // $ANTLR end "rule__Concern__Group__4"


    // $ANTLR start "rule__Concern__Group__4__Impl"
    // InternalColdLang.g:820:1: rule__Concern__Group__4__Impl : ( ( rule__Concern__Alternatives_4 )* ) ;
    public final void rule__Concern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:824:1: ( ( ( rule__Concern__Alternatives_4 )* ) )
            // InternalColdLang.g:825:1: ( ( rule__Concern__Alternatives_4 )* )
            {
            // InternalColdLang.g:825:1: ( ( rule__Concern__Alternatives_4 )* )
            // InternalColdLang.g:826:2: ( rule__Concern__Alternatives_4 )*
            {
             before(grammarAccess.getConcernAccess().getAlternatives_4()); 
            // InternalColdLang.g:827:2: ( rule__Concern__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalColdLang.g:827:3: rule__Concern__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Concern__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConcernAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Concern__Group__4__Impl"


    // $ANTLR start "rule__Concern__Group__5"
    // InternalColdLang.g:835:1: rule__Concern__Group__5 : rule__Concern__Group__5__Impl rule__Concern__Group__6 ;
    public final void rule__Concern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:839:1: ( rule__Concern__Group__5__Impl rule__Concern__Group__6 )
            // InternalColdLang.g:840:2: rule__Concern__Group__5__Impl rule__Concern__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Concern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group__6();

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
    // $ANTLR end "rule__Concern__Group__5"


    // $ANTLR start "rule__Concern__Group__5__Impl"
    // InternalColdLang.g:847:1: rule__Concern__Group__5__Impl : ( ( rule__Concern__FmAssignment_5 ) ) ;
    public final void rule__Concern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:851:1: ( ( ( rule__Concern__FmAssignment_5 ) ) )
            // InternalColdLang.g:852:1: ( ( rule__Concern__FmAssignment_5 ) )
            {
            // InternalColdLang.g:852:1: ( ( rule__Concern__FmAssignment_5 ) )
            // InternalColdLang.g:853:2: ( rule__Concern__FmAssignment_5 )
            {
             before(grammarAccess.getConcernAccess().getFmAssignment_5()); 
            // InternalColdLang.g:854:2: ( rule__Concern__FmAssignment_5 )
            // InternalColdLang.g:854:3: rule__Concern__FmAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Concern__FmAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getFmAssignment_5()); 

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
    // $ANTLR end "rule__Concern__Group__5__Impl"


    // $ANTLR start "rule__Concern__Group__6"
    // InternalColdLang.g:862:1: rule__Concern__Group__6 : rule__Concern__Group__6__Impl ;
    public final void rule__Concern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:866:1: ( rule__Concern__Group__6__Impl )
            // InternalColdLang.g:867:2: rule__Concern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group__6__Impl();

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
    // $ANTLR end "rule__Concern__Group__6"


    // $ANTLR start "rule__Concern__Group__6__Impl"
    // InternalColdLang.g:873:1: rule__Concern__Group__6__Impl : ( '}' ) ;
    public final void rule__Concern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:877:1: ( ( '}' ) )
            // InternalColdLang.g:878:1: ( '}' )
            {
            // InternalColdLang.g:878:1: ( '}' )
            // InternalColdLang.g:879:2: '}'
            {
             before(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Concern__Group__6__Impl"


    // $ANTLR start "rule__Concern__Group_3__0"
    // InternalColdLang.g:889:1: rule__Concern__Group_3__0 : rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 ;
    public final void rule__Concern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:893:1: ( rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1 )
            // InternalColdLang.g:894:2: rule__Concern__Group_3__0__Impl rule__Concern__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Concern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__1();

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
    // $ANTLR end "rule__Concern__Group_3__0"


    // $ANTLR start "rule__Concern__Group_3__0__Impl"
    // InternalColdLang.g:901:1: rule__Concern__Group_3__0__Impl : ( 'import' ) ;
    public final void rule__Concern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:905:1: ( ( 'import' ) )
            // InternalColdLang.g:906:1: ( 'import' )
            {
            // InternalColdLang.g:906:1: ( 'import' )
            // InternalColdLang.g:907:2: 'import'
            {
             before(grammarAccess.getConcernAccess().getImportKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getImportKeyword_3_0()); 

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
    // $ANTLR end "rule__Concern__Group_3__0__Impl"


    // $ANTLR start "rule__Concern__Group_3__1"
    // InternalColdLang.g:916:1: rule__Concern__Group_3__1 : rule__Concern__Group_3__1__Impl ;
    public final void rule__Concern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:920:1: ( rule__Concern__Group_3__1__Impl )
            // InternalColdLang.g:921:2: rule__Concern__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concern__Group_3__1__Impl();

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
    // $ANTLR end "rule__Concern__Group_3__1"


    // $ANTLR start "rule__Concern__Group_3__1__Impl"
    // InternalColdLang.g:927:1: rule__Concern__Group_3__1__Impl : ( ( rule__Concern__ImportedAssignment_3_1 ) ) ;
    public final void rule__Concern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:931:1: ( ( ( rule__Concern__ImportedAssignment_3_1 ) ) )
            // InternalColdLang.g:932:1: ( ( rule__Concern__ImportedAssignment_3_1 ) )
            {
            // InternalColdLang.g:932:1: ( ( rule__Concern__ImportedAssignment_3_1 ) )
            // InternalColdLang.g:933:2: ( rule__Concern__ImportedAssignment_3_1 )
            {
             before(grammarAccess.getConcernAccess().getImportedAssignment_3_1()); 
            // InternalColdLang.g:934:2: ( rule__Concern__ImportedAssignment_3_1 )
            // InternalColdLang.g:934:3: rule__Concern__ImportedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Concern__ImportedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConcernAccess().getImportedAssignment_3_1()); 

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
    // $ANTLR end "rule__Concern__Group_3__1__Impl"


    // $ANTLR start "rule__OneOf__Group__0"
    // InternalColdLang.g:943:1: rule__OneOf__Group__0 : rule__OneOf__Group__0__Impl rule__OneOf__Group__1 ;
    public final void rule__OneOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:947:1: ( rule__OneOf__Group__0__Impl rule__OneOf__Group__1 )
            // InternalColdLang.g:948:2: rule__OneOf__Group__0__Impl rule__OneOf__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OneOf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__1();

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
    // $ANTLR end "rule__OneOf__Group__0"


    // $ANTLR start "rule__OneOf__Group__0__Impl"
    // InternalColdLang.g:955:1: rule__OneOf__Group__0__Impl : ( () ) ;
    public final void rule__OneOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:959:1: ( ( () ) )
            // InternalColdLang.g:960:1: ( () )
            {
            // InternalColdLang.g:960:1: ( () )
            // InternalColdLang.g:961:2: ()
            {
             before(grammarAccess.getOneOfAccess().getOneOfAction_0()); 
            // InternalColdLang.g:962:2: ()
            // InternalColdLang.g:962:3: 
            {
            }

             after(grammarAccess.getOneOfAccess().getOneOfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OneOf__Group__0__Impl"


    // $ANTLR start "rule__OneOf__Group__1"
    // InternalColdLang.g:970:1: rule__OneOf__Group__1 : rule__OneOf__Group__1__Impl rule__OneOf__Group__2 ;
    public final void rule__OneOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:974:1: ( rule__OneOf__Group__1__Impl rule__OneOf__Group__2 )
            // InternalColdLang.g:975:2: rule__OneOf__Group__1__Impl rule__OneOf__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__OneOf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__2();

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
    // $ANTLR end "rule__OneOf__Group__1"


    // $ANTLR start "rule__OneOf__Group__1__Impl"
    // InternalColdLang.g:982:1: rule__OneOf__Group__1__Impl : ( ( rule__OneOf__OptionalAssignment_1 )? ) ;
    public final void rule__OneOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:986:1: ( ( ( rule__OneOf__OptionalAssignment_1 )? ) )
            // InternalColdLang.g:987:1: ( ( rule__OneOf__OptionalAssignment_1 )? )
            {
            // InternalColdLang.g:987:1: ( ( rule__OneOf__OptionalAssignment_1 )? )
            // InternalColdLang.g:988:2: ( rule__OneOf__OptionalAssignment_1 )?
            {
             before(grammarAccess.getOneOfAccess().getOptionalAssignment_1()); 
            // InternalColdLang.g:989:2: ( rule__OneOf__OptionalAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalColdLang.g:989:3: rule__OneOf__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneOf__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOneOfAccess().getOptionalAssignment_1()); 

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
    // $ANTLR end "rule__OneOf__Group__1__Impl"


    // $ANTLR start "rule__OneOf__Group__2"
    // InternalColdLang.g:997:1: rule__OneOf__Group__2 : rule__OneOf__Group__2__Impl rule__OneOf__Group__3 ;
    public final void rule__OneOf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1001:1: ( rule__OneOf__Group__2__Impl rule__OneOf__Group__3 )
            // InternalColdLang.g:1002:2: rule__OneOf__Group__2__Impl rule__OneOf__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OneOf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__3();

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
    // $ANTLR end "rule__OneOf__Group__2"


    // $ANTLR start "rule__OneOf__Group__2__Impl"
    // InternalColdLang.g:1009:1: rule__OneOf__Group__2__Impl : ( 'oneOf' ) ;
    public final void rule__OneOf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1013:1: ( ( 'oneOf' ) )
            // InternalColdLang.g:1014:1: ( 'oneOf' )
            {
            // InternalColdLang.g:1014:1: ( 'oneOf' )
            // InternalColdLang.g:1015:2: 'oneOf'
            {
             before(grammarAccess.getOneOfAccess().getOneOfKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getOneOfKeyword_2()); 

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
    // $ANTLR end "rule__OneOf__Group__2__Impl"


    // $ANTLR start "rule__OneOf__Group__3"
    // InternalColdLang.g:1024:1: rule__OneOf__Group__3 : rule__OneOf__Group__3__Impl rule__OneOf__Group__4 ;
    public final void rule__OneOf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1028:1: ( rule__OneOf__Group__3__Impl rule__OneOf__Group__4 )
            // InternalColdLang.g:1029:2: rule__OneOf__Group__3__Impl rule__OneOf__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__OneOf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__4();

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
    // $ANTLR end "rule__OneOf__Group__3"


    // $ANTLR start "rule__OneOf__Group__3__Impl"
    // InternalColdLang.g:1036:1: rule__OneOf__Group__3__Impl : ( ( rule__OneOf__NameAssignment_3 ) ) ;
    public final void rule__OneOf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1040:1: ( ( ( rule__OneOf__NameAssignment_3 ) ) )
            // InternalColdLang.g:1041:1: ( ( rule__OneOf__NameAssignment_3 ) )
            {
            // InternalColdLang.g:1041:1: ( ( rule__OneOf__NameAssignment_3 ) )
            // InternalColdLang.g:1042:2: ( rule__OneOf__NameAssignment_3 )
            {
             before(grammarAccess.getOneOfAccess().getNameAssignment_3()); 
            // InternalColdLang.g:1043:2: ( rule__OneOf__NameAssignment_3 )
            // InternalColdLang.g:1043:3: rule__OneOf__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OneOf__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOneOfAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__OneOf__Group__3__Impl"


    // $ANTLR start "rule__OneOf__Group__4"
    // InternalColdLang.g:1051:1: rule__OneOf__Group__4 : rule__OneOf__Group__4__Impl rule__OneOf__Group__5 ;
    public final void rule__OneOf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1055:1: ( rule__OneOf__Group__4__Impl rule__OneOf__Group__5 )
            // InternalColdLang.g:1056:2: rule__OneOf__Group__4__Impl rule__OneOf__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__OneOf__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__5();

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
    // $ANTLR end "rule__OneOf__Group__4"


    // $ANTLR start "rule__OneOf__Group__4__Impl"
    // InternalColdLang.g:1063:1: rule__OneOf__Group__4__Impl : ( '[' ) ;
    public final void rule__OneOf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1067:1: ( ( '[' ) )
            // InternalColdLang.g:1068:1: ( '[' )
            {
            // InternalColdLang.g:1068:1: ( '[' )
            // InternalColdLang.g:1069:2: '['
            {
             before(grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__OneOf__Group__4__Impl"


    // $ANTLR start "rule__OneOf__Group__5"
    // InternalColdLang.g:1078:1: rule__OneOf__Group__5 : rule__OneOf__Group__5__Impl rule__OneOf__Group__6 ;
    public final void rule__OneOf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1082:1: ( rule__OneOf__Group__5__Impl rule__OneOf__Group__6 )
            // InternalColdLang.g:1083:2: rule__OneOf__Group__5__Impl rule__OneOf__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__OneOf__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__6();

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
    // $ANTLR end "rule__OneOf__Group__5"


    // $ANTLR start "rule__OneOf__Group__5__Impl"
    // InternalColdLang.g:1090:1: rule__OneOf__Group__5__Impl : ( ( rule__OneOf__Group_5__0 )* ) ;
    public final void rule__OneOf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1094:1: ( ( ( rule__OneOf__Group_5__0 )* ) )
            // InternalColdLang.g:1095:1: ( ( rule__OneOf__Group_5__0 )* )
            {
            // InternalColdLang.g:1095:1: ( ( rule__OneOf__Group_5__0 )* )
            // InternalColdLang.g:1096:2: ( rule__OneOf__Group_5__0 )*
            {
             before(grammarAccess.getOneOfAccess().getGroup_5()); 
            // InternalColdLang.g:1097:2: ( rule__OneOf__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalColdLang.g:1097:3: rule__OneOf__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OneOf__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOneOfAccess().getGroup_5()); 

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
    // $ANTLR end "rule__OneOf__Group__5__Impl"


    // $ANTLR start "rule__OneOf__Group__6"
    // InternalColdLang.g:1105:1: rule__OneOf__Group__6 : rule__OneOf__Group__6__Impl rule__OneOf__Group__7 ;
    public final void rule__OneOf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1109:1: ( rule__OneOf__Group__6__Impl rule__OneOf__Group__7 )
            // InternalColdLang.g:1110:2: rule__OneOf__Group__6__Impl rule__OneOf__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__OneOf__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group__7();

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
    // $ANTLR end "rule__OneOf__Group__6"


    // $ANTLR start "rule__OneOf__Group__6__Impl"
    // InternalColdLang.g:1117:1: rule__OneOf__Group__6__Impl : ( ']' ) ;
    public final void rule__OneOf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1121:1: ( ( ']' ) )
            // InternalColdLang.g:1122:1: ( ']' )
            {
            // InternalColdLang.g:1122:1: ( ']' )
            // InternalColdLang.g:1123:2: ']'
            {
             before(grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__OneOf__Group__6__Impl"


    // $ANTLR start "rule__OneOf__Group__7"
    // InternalColdLang.g:1132:1: rule__OneOf__Group__7 : rule__OneOf__Group__7__Impl ;
    public final void rule__OneOf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1136:1: ( rule__OneOf__Group__7__Impl )
            // InternalColdLang.g:1137:2: rule__OneOf__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneOf__Group__7__Impl();

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
    // $ANTLR end "rule__OneOf__Group__7"


    // $ANTLR start "rule__OneOf__Group__7__Impl"
    // InternalColdLang.g:1143:1: rule__OneOf__Group__7__Impl : ( ( rule__OneOf__ConditionAssignment_7 )? ) ;
    public final void rule__OneOf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1147:1: ( ( ( rule__OneOf__ConditionAssignment_7 )? ) )
            // InternalColdLang.g:1148:1: ( ( rule__OneOf__ConditionAssignment_7 )? )
            {
            // InternalColdLang.g:1148:1: ( ( rule__OneOf__ConditionAssignment_7 )? )
            // InternalColdLang.g:1149:2: ( rule__OneOf__ConditionAssignment_7 )?
            {
             before(grammarAccess.getOneOfAccess().getConditionAssignment_7()); 
            // InternalColdLang.g:1150:2: ( rule__OneOf__ConditionAssignment_7 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==27||LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalColdLang.g:1150:3: rule__OneOf__ConditionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__OneOf__ConditionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOneOfAccess().getConditionAssignment_7()); 

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
    // $ANTLR end "rule__OneOf__Group__7__Impl"


    // $ANTLR start "rule__OneOf__Group_5__0"
    // InternalColdLang.g:1159:1: rule__OneOf__Group_5__0 : rule__OneOf__Group_5__0__Impl rule__OneOf__Group_5__1 ;
    public final void rule__OneOf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1163:1: ( rule__OneOf__Group_5__0__Impl rule__OneOf__Group_5__1 )
            // InternalColdLang.g:1164:2: rule__OneOf__Group_5__0__Impl rule__OneOf__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__OneOf__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OneOf__Group_5__1();

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
    // $ANTLR end "rule__OneOf__Group_5__0"


    // $ANTLR start "rule__OneOf__Group_5__0__Impl"
    // InternalColdLang.g:1171:1: rule__OneOf__Group_5__0__Impl : ( '-' ) ;
    public final void rule__OneOf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1175:1: ( ( '-' ) )
            // InternalColdLang.g:1176:1: ( '-' )
            {
            // InternalColdLang.g:1176:1: ( '-' )
            // InternalColdLang.g:1177:2: '-'
            {
             before(grammarAccess.getOneOfAccess().getHyphenMinusKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getHyphenMinusKeyword_5_0()); 

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
    // $ANTLR end "rule__OneOf__Group_5__0__Impl"


    // $ANTLR start "rule__OneOf__Group_5__1"
    // InternalColdLang.g:1186:1: rule__OneOf__Group_5__1 : rule__OneOf__Group_5__1__Impl ;
    public final void rule__OneOf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1190:1: ( rule__OneOf__Group_5__1__Impl )
            // InternalColdLang.g:1191:2: rule__OneOf__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OneOf__Group_5__1__Impl();

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
    // $ANTLR end "rule__OneOf__Group_5__1"


    // $ANTLR start "rule__OneOf__Group_5__1__Impl"
    // InternalColdLang.g:1197:1: rule__OneOf__Group_5__1__Impl : ( ( rule__OneOf__ChildrenAssignment_5_1 ) ) ;
    public final void rule__OneOf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1201:1: ( ( ( rule__OneOf__ChildrenAssignment_5_1 ) ) )
            // InternalColdLang.g:1202:1: ( ( rule__OneOf__ChildrenAssignment_5_1 ) )
            {
            // InternalColdLang.g:1202:1: ( ( rule__OneOf__ChildrenAssignment_5_1 ) )
            // InternalColdLang.g:1203:2: ( rule__OneOf__ChildrenAssignment_5_1 )
            {
             before(grammarAccess.getOneOfAccess().getChildrenAssignment_5_1()); 
            // InternalColdLang.g:1204:2: ( rule__OneOf__ChildrenAssignment_5_1 )
            // InternalColdLang.g:1204:3: rule__OneOf__ChildrenAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__OneOf__ChildrenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOneOfAccess().getChildrenAssignment_5_1()); 

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
    // $ANTLR end "rule__OneOf__Group_5__1__Impl"


    // $ANTLR start "rule__SomeOf__Group__0"
    // InternalColdLang.g:1213:1: rule__SomeOf__Group__0 : rule__SomeOf__Group__0__Impl rule__SomeOf__Group__1 ;
    public final void rule__SomeOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1217:1: ( rule__SomeOf__Group__0__Impl rule__SomeOf__Group__1 )
            // InternalColdLang.g:1218:2: rule__SomeOf__Group__0__Impl rule__SomeOf__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SomeOf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__1();

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
    // $ANTLR end "rule__SomeOf__Group__0"


    // $ANTLR start "rule__SomeOf__Group__0__Impl"
    // InternalColdLang.g:1225:1: rule__SomeOf__Group__0__Impl : ( () ) ;
    public final void rule__SomeOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1229:1: ( ( () ) )
            // InternalColdLang.g:1230:1: ( () )
            {
            // InternalColdLang.g:1230:1: ( () )
            // InternalColdLang.g:1231:2: ()
            {
             before(grammarAccess.getSomeOfAccess().getSomeOfAction_0()); 
            // InternalColdLang.g:1232:2: ()
            // InternalColdLang.g:1232:3: 
            {
            }

             after(grammarAccess.getSomeOfAccess().getSomeOfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeOf__Group__0__Impl"


    // $ANTLR start "rule__SomeOf__Group__1"
    // InternalColdLang.g:1240:1: rule__SomeOf__Group__1 : rule__SomeOf__Group__1__Impl rule__SomeOf__Group__2 ;
    public final void rule__SomeOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1244:1: ( rule__SomeOf__Group__1__Impl rule__SomeOf__Group__2 )
            // InternalColdLang.g:1245:2: rule__SomeOf__Group__1__Impl rule__SomeOf__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SomeOf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__2();

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
    // $ANTLR end "rule__SomeOf__Group__1"


    // $ANTLR start "rule__SomeOf__Group__1__Impl"
    // InternalColdLang.g:1252:1: rule__SomeOf__Group__1__Impl : ( ( rule__SomeOf__OptionalAssignment_1 )? ) ;
    public final void rule__SomeOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1256:1: ( ( ( rule__SomeOf__OptionalAssignment_1 )? ) )
            // InternalColdLang.g:1257:1: ( ( rule__SomeOf__OptionalAssignment_1 )? )
            {
            // InternalColdLang.g:1257:1: ( ( rule__SomeOf__OptionalAssignment_1 )? )
            // InternalColdLang.g:1258:2: ( rule__SomeOf__OptionalAssignment_1 )?
            {
             before(grammarAccess.getSomeOfAccess().getOptionalAssignment_1()); 
            // InternalColdLang.g:1259:2: ( rule__SomeOf__OptionalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalColdLang.g:1259:3: rule__SomeOf__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeOf__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeOfAccess().getOptionalAssignment_1()); 

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
    // $ANTLR end "rule__SomeOf__Group__1__Impl"


    // $ANTLR start "rule__SomeOf__Group__2"
    // InternalColdLang.g:1267:1: rule__SomeOf__Group__2 : rule__SomeOf__Group__2__Impl rule__SomeOf__Group__3 ;
    public final void rule__SomeOf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1271:1: ( rule__SomeOf__Group__2__Impl rule__SomeOf__Group__3 )
            // InternalColdLang.g:1272:2: rule__SomeOf__Group__2__Impl rule__SomeOf__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SomeOf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__3();

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
    // $ANTLR end "rule__SomeOf__Group__2"


    // $ANTLR start "rule__SomeOf__Group__2__Impl"
    // InternalColdLang.g:1279:1: rule__SomeOf__Group__2__Impl : ( 'someOf' ) ;
    public final void rule__SomeOf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1283:1: ( ( 'someOf' ) )
            // InternalColdLang.g:1284:1: ( 'someOf' )
            {
            // InternalColdLang.g:1284:1: ( 'someOf' )
            // InternalColdLang.g:1285:2: 'someOf'
            {
             before(grammarAccess.getSomeOfAccess().getSomeOfKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getSomeOfKeyword_2()); 

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
    // $ANTLR end "rule__SomeOf__Group__2__Impl"


    // $ANTLR start "rule__SomeOf__Group__3"
    // InternalColdLang.g:1294:1: rule__SomeOf__Group__3 : rule__SomeOf__Group__3__Impl rule__SomeOf__Group__4 ;
    public final void rule__SomeOf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1298:1: ( rule__SomeOf__Group__3__Impl rule__SomeOf__Group__4 )
            // InternalColdLang.g:1299:2: rule__SomeOf__Group__3__Impl rule__SomeOf__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SomeOf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__4();

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
    // $ANTLR end "rule__SomeOf__Group__3"


    // $ANTLR start "rule__SomeOf__Group__3__Impl"
    // InternalColdLang.g:1306:1: rule__SomeOf__Group__3__Impl : ( ( rule__SomeOf__NameAssignment_3 ) ) ;
    public final void rule__SomeOf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1310:1: ( ( ( rule__SomeOf__NameAssignment_3 ) ) )
            // InternalColdLang.g:1311:1: ( ( rule__SomeOf__NameAssignment_3 ) )
            {
            // InternalColdLang.g:1311:1: ( ( rule__SomeOf__NameAssignment_3 ) )
            // InternalColdLang.g:1312:2: ( rule__SomeOf__NameAssignment_3 )
            {
             before(grammarAccess.getSomeOfAccess().getNameAssignment_3()); 
            // InternalColdLang.g:1313:2: ( rule__SomeOf__NameAssignment_3 )
            // InternalColdLang.g:1313:3: rule__SomeOf__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SomeOf__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSomeOfAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__SomeOf__Group__3__Impl"


    // $ANTLR start "rule__SomeOf__Group__4"
    // InternalColdLang.g:1321:1: rule__SomeOf__Group__4 : rule__SomeOf__Group__4__Impl rule__SomeOf__Group__5 ;
    public final void rule__SomeOf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1325:1: ( rule__SomeOf__Group__4__Impl rule__SomeOf__Group__5 )
            // InternalColdLang.g:1326:2: rule__SomeOf__Group__4__Impl rule__SomeOf__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SomeOf__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__5();

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
    // $ANTLR end "rule__SomeOf__Group__4"


    // $ANTLR start "rule__SomeOf__Group__4__Impl"
    // InternalColdLang.g:1333:1: rule__SomeOf__Group__4__Impl : ( '[' ) ;
    public final void rule__SomeOf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1337:1: ( ( '[' ) )
            // InternalColdLang.g:1338:1: ( '[' )
            {
            // InternalColdLang.g:1338:1: ( '[' )
            // InternalColdLang.g:1339:2: '['
            {
             before(grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__SomeOf__Group__4__Impl"


    // $ANTLR start "rule__SomeOf__Group__5"
    // InternalColdLang.g:1348:1: rule__SomeOf__Group__5 : rule__SomeOf__Group__5__Impl rule__SomeOf__Group__6 ;
    public final void rule__SomeOf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1352:1: ( rule__SomeOf__Group__5__Impl rule__SomeOf__Group__6 )
            // InternalColdLang.g:1353:2: rule__SomeOf__Group__5__Impl rule__SomeOf__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SomeOf__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__6();

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
    // $ANTLR end "rule__SomeOf__Group__5"


    // $ANTLR start "rule__SomeOf__Group__5__Impl"
    // InternalColdLang.g:1360:1: rule__SomeOf__Group__5__Impl : ( ( rule__SomeOf__Group_5__0 )* ) ;
    public final void rule__SomeOf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1364:1: ( ( ( rule__SomeOf__Group_5__0 )* ) )
            // InternalColdLang.g:1365:1: ( ( rule__SomeOf__Group_5__0 )* )
            {
            // InternalColdLang.g:1365:1: ( ( rule__SomeOf__Group_5__0 )* )
            // InternalColdLang.g:1366:2: ( rule__SomeOf__Group_5__0 )*
            {
             before(grammarAccess.getSomeOfAccess().getGroup_5()); 
            // InternalColdLang.g:1367:2: ( rule__SomeOf__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalColdLang.g:1367:3: rule__SomeOf__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SomeOf__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSomeOfAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SomeOf__Group__5__Impl"


    // $ANTLR start "rule__SomeOf__Group__6"
    // InternalColdLang.g:1375:1: rule__SomeOf__Group__6 : rule__SomeOf__Group__6__Impl rule__SomeOf__Group__7 ;
    public final void rule__SomeOf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1379:1: ( rule__SomeOf__Group__6__Impl rule__SomeOf__Group__7 )
            // InternalColdLang.g:1380:2: rule__SomeOf__Group__6__Impl rule__SomeOf__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__SomeOf__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__7();

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
    // $ANTLR end "rule__SomeOf__Group__6"


    // $ANTLR start "rule__SomeOf__Group__6__Impl"
    // InternalColdLang.g:1387:1: rule__SomeOf__Group__6__Impl : ( ']' ) ;
    public final void rule__SomeOf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1391:1: ( ( ']' ) )
            // InternalColdLang.g:1392:1: ( ']' )
            {
            // InternalColdLang.g:1392:1: ( ']' )
            // InternalColdLang.g:1393:2: ']'
            {
             before(grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__SomeOf__Group__6__Impl"


    // $ANTLR start "rule__SomeOf__Group__7"
    // InternalColdLang.g:1402:1: rule__SomeOf__Group__7 : rule__SomeOf__Group__7__Impl ;
    public final void rule__SomeOf__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1406:1: ( rule__SomeOf__Group__7__Impl )
            // InternalColdLang.g:1407:2: rule__SomeOf__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeOf__Group__7__Impl();

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
    // $ANTLR end "rule__SomeOf__Group__7"


    // $ANTLR start "rule__SomeOf__Group__7__Impl"
    // InternalColdLang.g:1413:1: rule__SomeOf__Group__7__Impl : ( ( rule__SomeOf__ConditionAssignment_7 )? ) ;
    public final void rule__SomeOf__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1417:1: ( ( ( rule__SomeOf__ConditionAssignment_7 )? ) )
            // InternalColdLang.g:1418:1: ( ( rule__SomeOf__ConditionAssignment_7 )? )
            {
            // InternalColdLang.g:1418:1: ( ( rule__SomeOf__ConditionAssignment_7 )? )
            // InternalColdLang.g:1419:2: ( rule__SomeOf__ConditionAssignment_7 )?
            {
             before(grammarAccess.getSomeOfAccess().getConditionAssignment_7()); 
            // InternalColdLang.g:1420:2: ( rule__SomeOf__ConditionAssignment_7 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==27||LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalColdLang.g:1420:3: rule__SomeOf__ConditionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__SomeOf__ConditionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSomeOfAccess().getConditionAssignment_7()); 

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
    // $ANTLR end "rule__SomeOf__Group__7__Impl"


    // $ANTLR start "rule__SomeOf__Group_5__0"
    // InternalColdLang.g:1429:1: rule__SomeOf__Group_5__0 : rule__SomeOf__Group_5__0__Impl rule__SomeOf__Group_5__1 ;
    public final void rule__SomeOf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1433:1: ( rule__SomeOf__Group_5__0__Impl rule__SomeOf__Group_5__1 )
            // InternalColdLang.g:1434:2: rule__SomeOf__Group_5__0__Impl rule__SomeOf__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__SomeOf__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SomeOf__Group_5__1();

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
    // $ANTLR end "rule__SomeOf__Group_5__0"


    // $ANTLR start "rule__SomeOf__Group_5__0__Impl"
    // InternalColdLang.g:1441:1: rule__SomeOf__Group_5__0__Impl : ( '-' ) ;
    public final void rule__SomeOf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1445:1: ( ( '-' ) )
            // InternalColdLang.g:1446:1: ( '-' )
            {
            // InternalColdLang.g:1446:1: ( '-' )
            // InternalColdLang.g:1447:2: '-'
            {
             before(grammarAccess.getSomeOfAccess().getHyphenMinusKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getHyphenMinusKeyword_5_0()); 

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
    // $ANTLR end "rule__SomeOf__Group_5__0__Impl"


    // $ANTLR start "rule__SomeOf__Group_5__1"
    // InternalColdLang.g:1456:1: rule__SomeOf__Group_5__1 : rule__SomeOf__Group_5__1__Impl ;
    public final void rule__SomeOf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1460:1: ( rule__SomeOf__Group_5__1__Impl )
            // InternalColdLang.g:1461:2: rule__SomeOf__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SomeOf__Group_5__1__Impl();

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
    // $ANTLR end "rule__SomeOf__Group_5__1"


    // $ANTLR start "rule__SomeOf__Group_5__1__Impl"
    // InternalColdLang.g:1467:1: rule__SomeOf__Group_5__1__Impl : ( ( rule__SomeOf__ChildrenAssignment_5_1 ) ) ;
    public final void rule__SomeOf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1471:1: ( ( ( rule__SomeOf__ChildrenAssignment_5_1 ) ) )
            // InternalColdLang.g:1472:1: ( ( rule__SomeOf__ChildrenAssignment_5_1 ) )
            {
            // InternalColdLang.g:1472:1: ( ( rule__SomeOf__ChildrenAssignment_5_1 ) )
            // InternalColdLang.g:1473:2: ( rule__SomeOf__ChildrenAssignment_5_1 )
            {
             before(grammarAccess.getSomeOfAccess().getChildrenAssignment_5_1()); 
            // InternalColdLang.g:1474:2: ( rule__SomeOf__ChildrenAssignment_5_1 )
            // InternalColdLang.g:1474:3: rule__SomeOf__ChildrenAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SomeOf__ChildrenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSomeOfAccess().getChildrenAssignment_5_1()); 

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
    // $ANTLR end "rule__SomeOf__Group_5__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalColdLang.g:1483:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1487:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalColdLang.g:1488:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalColdLang.g:1495:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1499:1: ( ( () ) )
            // InternalColdLang.g:1500:1: ( () )
            {
            // InternalColdLang.g:1500:1: ( () )
            // InternalColdLang.g:1501:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalColdLang.g:1502:2: ()
            // InternalColdLang.g:1502:3: 
            {
            }

             after(grammarAccess.getFeatureAccess().getFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalColdLang.g:1510:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1514:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalColdLang.g:1515:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalColdLang.g:1522:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OptionalAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1526:1: ( ( ( rule__Feature__OptionalAssignment_1 )? ) )
            // InternalColdLang.g:1527:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            {
            // InternalColdLang.g:1527:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            // InternalColdLang.g:1528:2: ( rule__Feature__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); 
            // InternalColdLang.g:1529:2: ( rule__Feature__OptionalAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalColdLang.g:1529:3: rule__Feature__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalColdLang.g:1537:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1541:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalColdLang.g:1542:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalColdLang.g:1549:1: rule__Feature__Group__2__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1553:1: ( ( 'feature' ) )
            // InternalColdLang.g:1554:1: ( 'feature' )
            {
            // InternalColdLang.g:1554:1: ( 'feature' )
            // InternalColdLang.g:1555:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalColdLang.g:1564:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1568:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalColdLang.g:1569:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalColdLang.g:1576:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__NameAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1580:1: ( ( ( rule__Feature__NameAssignment_3 ) ) )
            // InternalColdLang.g:1581:1: ( ( rule__Feature__NameAssignment_3 ) )
            {
            // InternalColdLang.g:1581:1: ( ( rule__Feature__NameAssignment_3 ) )
            // InternalColdLang.g:1582:2: ( rule__Feature__NameAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3()); 
            // InternalColdLang.g:1583:2: ( rule__Feature__NameAssignment_3 )
            // InternalColdLang.g:1583:3: rule__Feature__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalColdLang.g:1591:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1595:1: ( rule__Feature__Group__4__Impl )
            // InternalColdLang.g:1596:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalColdLang.g:1602:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__ConditionAssignment_4 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1606:1: ( ( ( rule__Feature__ConditionAssignment_4 )? ) )
            // InternalColdLang.g:1607:1: ( ( rule__Feature__ConditionAssignment_4 )? )
            {
            // InternalColdLang.g:1607:1: ( ( rule__Feature__ConditionAssignment_4 )? )
            // InternalColdLang.g:1608:2: ( rule__Feature__ConditionAssignment_4 )?
            {
             before(grammarAccess.getFeatureAccess().getConditionAssignment_4()); 
            // InternalColdLang.g:1609:2: ( rule__Feature__ConditionAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==27||LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalColdLang.g:1609:3: rule__Feature__ConditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ConditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getConditionAssignment_4()); 

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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // InternalColdLang.g:1618:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1622:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // InternalColdLang.g:1623:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__1();

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
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // InternalColdLang.g:1630:1: rule__Language__Group__0__Impl : ( 'language' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1634:1: ( ( 'language' ) )
            // InternalColdLang.g:1635:1: ( 'language' )
            {
            // InternalColdLang.g:1635:1: ( 'language' )
            // InternalColdLang.g:1636:2: 'language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 

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
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // InternalColdLang.g:1645:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1649:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // InternalColdLang.g:1650:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__2();

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
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // InternalColdLang.g:1657:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1661:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // InternalColdLang.g:1662:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // InternalColdLang.g:1662:1: ( ( rule__Language__NameAssignment_1 ) )
            // InternalColdLang.g:1663:2: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // InternalColdLang.g:1664:2: ( rule__Language__NameAssignment_1 )
            // InternalColdLang.g:1664:3: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Language__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__Language__Group__2"
    // InternalColdLang.g:1672:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1676:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // InternalColdLang.g:1677:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__3();

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
    // $ANTLR end "rule__Language__Group__2"


    // $ANTLR start "rule__Language__Group__2__Impl"
    // InternalColdLang.g:1684:1: rule__Language__Group__2__Impl : ( '{' ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1688:1: ( ( '{' ) )
            // InternalColdLang.g:1689:1: ( '{' )
            {
            // InternalColdLang.g:1689:1: ( '{' )
            // InternalColdLang.g:1690:2: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Language__Group__2__Impl"


    // $ANTLR start "rule__Language__Group__3"
    // InternalColdLang.g:1699:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1703:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // InternalColdLang.g:1704:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Language__Group__4();

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
    // $ANTLR end "rule__Language__Group__3"


    // $ANTLR start "rule__Language__Group__3__Impl"
    // InternalColdLang.g:1711:1: rule__Language__Group__3__Impl : ( ( rule__Language__OperatorsAssignment_3 )* ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1715:1: ( ( ( rule__Language__OperatorsAssignment_3 )* ) )
            // InternalColdLang.g:1716:1: ( ( rule__Language__OperatorsAssignment_3 )* )
            {
            // InternalColdLang.g:1716:1: ( ( rule__Language__OperatorsAssignment_3 )* )
            // InternalColdLang.g:1717:2: ( rule__Language__OperatorsAssignment_3 )*
            {
             before(grammarAccess.getLanguageAccess().getOperatorsAssignment_3()); 
            // InternalColdLang.g:1718:2: ( rule__Language__OperatorsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalColdLang.g:1718:3: rule__Language__OperatorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Language__OperatorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getLanguageAccess().getOperatorsAssignment_3()); 

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
    // $ANTLR end "rule__Language__Group__3__Impl"


    // $ANTLR start "rule__Language__Group__4"
    // InternalColdLang.g:1726:1: rule__Language__Group__4 : rule__Language__Group__4__Impl ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1730:1: ( rule__Language__Group__4__Impl )
            // InternalColdLang.g:1731:2: rule__Language__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Language__Group__4__Impl();

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
    // $ANTLR end "rule__Language__Group__4"


    // $ANTLR start "rule__Language__Group__4__Impl"
    // InternalColdLang.g:1737:1: rule__Language__Group__4__Impl : ( '}' ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1741:1: ( ( '}' ) )
            // InternalColdLang.g:1742:1: ( '}' )
            {
            // InternalColdLang.g:1742:1: ( '}' )
            // InternalColdLang.g:1743:2: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Language__Group__4__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__0"
    // InternalColdLang.g:1753:1: rule__LanguageOperator__Group__0 : rule__LanguageOperator__Group__0__Impl rule__LanguageOperator__Group__1 ;
    public final void rule__LanguageOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1757:1: ( rule__LanguageOperator__Group__0__Impl rule__LanguageOperator__Group__1 )
            // InternalColdLang.g:1758:2: rule__LanguageOperator__Group__0__Impl rule__LanguageOperator__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LanguageOperator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__1();

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
    // $ANTLR end "rule__LanguageOperator__Group__0"


    // $ANTLR start "rule__LanguageOperator__Group__0__Impl"
    // InternalColdLang.g:1765:1: rule__LanguageOperator__Group__0__Impl : ( ( rule__LanguageOperator__NameAssignment_0 ) ) ;
    public final void rule__LanguageOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1769:1: ( ( ( rule__LanguageOperator__NameAssignment_0 ) ) )
            // InternalColdLang.g:1770:1: ( ( rule__LanguageOperator__NameAssignment_0 ) )
            {
            // InternalColdLang.g:1770:1: ( ( rule__LanguageOperator__NameAssignment_0 ) )
            // InternalColdLang.g:1771:2: ( rule__LanguageOperator__NameAssignment_0 )
            {
             before(grammarAccess.getLanguageOperatorAccess().getNameAssignment_0()); 
            // InternalColdLang.g:1772:2: ( rule__LanguageOperator__NameAssignment_0 )
            // InternalColdLang.g:1772:3: rule__LanguageOperator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOperatorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__0__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__1"
    // InternalColdLang.g:1780:1: rule__LanguageOperator__Group__1 : rule__LanguageOperator__Group__1__Impl rule__LanguageOperator__Group__2 ;
    public final void rule__LanguageOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1784:1: ( rule__LanguageOperator__Group__1__Impl rule__LanguageOperator__Group__2 )
            // InternalColdLang.g:1785:2: rule__LanguageOperator__Group__1__Impl rule__LanguageOperator__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LanguageOperator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__2();

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
    // $ANTLR end "rule__LanguageOperator__Group__1"


    // $ANTLR start "rule__LanguageOperator__Group__1__Impl"
    // InternalColdLang.g:1792:1: rule__LanguageOperator__Group__1__Impl : ( ':' ) ;
    public final void rule__LanguageOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1796:1: ( ( ':' ) )
            // InternalColdLang.g:1797:1: ( ':' )
            {
            // InternalColdLang.g:1797:1: ( ':' )
            // InternalColdLang.g:1798:2: ':'
            {
             before(grammarAccess.getLanguageOperatorAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__1__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__2"
    // InternalColdLang.g:1807:1: rule__LanguageOperator__Group__2 : rule__LanguageOperator__Group__2__Impl rule__LanguageOperator__Group__3 ;
    public final void rule__LanguageOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1811:1: ( rule__LanguageOperator__Group__2__Impl rule__LanguageOperator__Group__3 )
            // InternalColdLang.g:1812:2: rule__LanguageOperator__Group__2__Impl rule__LanguageOperator__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__LanguageOperator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__3();

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
    // $ANTLR end "rule__LanguageOperator__Group__2"


    // $ANTLR start "rule__LanguageOperator__Group__2__Impl"
    // InternalColdLang.g:1819:1: rule__LanguageOperator__Group__2__Impl : ( ( rule__LanguageOperator__TypeAssignment_2 ) ) ;
    public final void rule__LanguageOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1823:1: ( ( ( rule__LanguageOperator__TypeAssignment_2 ) ) )
            // InternalColdLang.g:1824:1: ( ( rule__LanguageOperator__TypeAssignment_2 ) )
            {
            // InternalColdLang.g:1824:1: ( ( rule__LanguageOperator__TypeAssignment_2 ) )
            // InternalColdLang.g:1825:2: ( rule__LanguageOperator__TypeAssignment_2 )
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypeAssignment_2()); 
            // InternalColdLang.g:1826:2: ( rule__LanguageOperator__TypeAssignment_2 )
            // InternalColdLang.g:1826:3: rule__LanguageOperator__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOperatorAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__2__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__3"
    // InternalColdLang.g:1834:1: rule__LanguageOperator__Group__3 : rule__LanguageOperator__Group__3__Impl rule__LanguageOperator__Group__4 ;
    public final void rule__LanguageOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1838:1: ( rule__LanguageOperator__Group__3__Impl rule__LanguageOperator__Group__4 )
            // InternalColdLang.g:1839:2: rule__LanguageOperator__Group__3__Impl rule__LanguageOperator__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__LanguageOperator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__4();

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
    // $ANTLR end "rule__LanguageOperator__Group__3"


    // $ANTLR start "rule__LanguageOperator__Group__3__Impl"
    // InternalColdLang.g:1846:1: rule__LanguageOperator__Group__3__Impl : ( ( rule__LanguageOperator__Group_3__0 )* ) ;
    public final void rule__LanguageOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1850:1: ( ( ( rule__LanguageOperator__Group_3__0 )* ) )
            // InternalColdLang.g:1851:1: ( ( rule__LanguageOperator__Group_3__0 )* )
            {
            // InternalColdLang.g:1851:1: ( ( rule__LanguageOperator__Group_3__0 )* )
            // InternalColdLang.g:1852:2: ( rule__LanguageOperator__Group_3__0 )*
            {
             before(grammarAccess.getLanguageOperatorAccess().getGroup_3()); 
            // InternalColdLang.g:1853:2: ( rule__LanguageOperator__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalColdLang.g:1853:3: rule__LanguageOperator__Group_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__LanguageOperator__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLanguageOperatorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__3__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__4"
    // InternalColdLang.g:1861:1: rule__LanguageOperator__Group__4 : rule__LanguageOperator__Group__4__Impl rule__LanguageOperator__Group__5 ;
    public final void rule__LanguageOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1865:1: ( rule__LanguageOperator__Group__4__Impl rule__LanguageOperator__Group__5 )
            // InternalColdLang.g:1866:2: rule__LanguageOperator__Group__4__Impl rule__LanguageOperator__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__LanguageOperator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__5();

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
    // $ANTLR end "rule__LanguageOperator__Group__4"


    // $ANTLR start "rule__LanguageOperator__Group__4__Impl"
    // InternalColdLang.g:1873:1: rule__LanguageOperator__Group__4__Impl : ( '[' ) ;
    public final void rule__LanguageOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1877:1: ( ( '[' ) )
            // InternalColdLang.g:1878:1: ( '[' )
            {
            // InternalColdLang.g:1878:1: ( '[' )
            // InternalColdLang.g:1879:2: '['
            {
             before(grammarAccess.getLanguageOperatorAccess().getLeftSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__4__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__5"
    // InternalColdLang.g:1888:1: rule__LanguageOperator__Group__5 : rule__LanguageOperator__Group__5__Impl rule__LanguageOperator__Group__6 ;
    public final void rule__LanguageOperator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1892:1: ( rule__LanguageOperator__Group__5__Impl rule__LanguageOperator__Group__6 )
            // InternalColdLang.g:1893:2: rule__LanguageOperator__Group__5__Impl rule__LanguageOperator__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__LanguageOperator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__6();

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
    // $ANTLR end "rule__LanguageOperator__Group__5"


    // $ANTLR start "rule__LanguageOperator__Group__5__Impl"
    // InternalColdLang.g:1900:1: rule__LanguageOperator__Group__5__Impl : ( ( rule__LanguageOperator__DescriptionAssignment_5 ) ) ;
    public final void rule__LanguageOperator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1904:1: ( ( ( rule__LanguageOperator__DescriptionAssignment_5 ) ) )
            // InternalColdLang.g:1905:1: ( ( rule__LanguageOperator__DescriptionAssignment_5 ) )
            {
            // InternalColdLang.g:1905:1: ( ( rule__LanguageOperator__DescriptionAssignment_5 ) )
            // InternalColdLang.g:1906:2: ( rule__LanguageOperator__DescriptionAssignment_5 )
            {
             before(grammarAccess.getLanguageOperatorAccess().getDescriptionAssignment_5()); 
            // InternalColdLang.g:1907:2: ( rule__LanguageOperator__DescriptionAssignment_5 )
            // InternalColdLang.g:1907:3: rule__LanguageOperator__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOperatorAccess().getDescriptionAssignment_5()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__5__Impl"


    // $ANTLR start "rule__LanguageOperator__Group__6"
    // InternalColdLang.g:1915:1: rule__LanguageOperator__Group__6 : rule__LanguageOperator__Group__6__Impl ;
    public final void rule__LanguageOperator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1919:1: ( rule__LanguageOperator__Group__6__Impl )
            // InternalColdLang.g:1920:2: rule__LanguageOperator__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group__6__Impl();

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
    // $ANTLR end "rule__LanguageOperator__Group__6"


    // $ANTLR start "rule__LanguageOperator__Group__6__Impl"
    // InternalColdLang.g:1926:1: rule__LanguageOperator__Group__6__Impl : ( ']' ) ;
    public final void rule__LanguageOperator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1930:1: ( ( ']' ) )
            // InternalColdLang.g:1931:1: ( ']' )
            {
            // InternalColdLang.g:1931:1: ( ']' )
            // InternalColdLang.g:1932:2: ']'
            {
             before(grammarAccess.getLanguageOperatorAccess().getRightSquareBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__LanguageOperator__Group__6__Impl"


    // $ANTLR start "rule__LanguageOperator__Group_3__0"
    // InternalColdLang.g:1942:1: rule__LanguageOperator__Group_3__0 : rule__LanguageOperator__Group_3__0__Impl rule__LanguageOperator__Group_3__1 ;
    public final void rule__LanguageOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1946:1: ( rule__LanguageOperator__Group_3__0__Impl rule__LanguageOperator__Group_3__1 )
            // InternalColdLang.g:1947:2: rule__LanguageOperator__Group_3__0__Impl rule__LanguageOperator__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__LanguageOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group_3__1();

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
    // $ANTLR end "rule__LanguageOperator__Group_3__0"


    // $ANTLR start "rule__LanguageOperator__Group_3__0__Impl"
    // InternalColdLang.g:1954:1: rule__LanguageOperator__Group_3__0__Impl : ( '=>' ) ;
    public final void rule__LanguageOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1958:1: ( ( '=>' ) )
            // InternalColdLang.g:1959:1: ( '=>' )
            {
            // InternalColdLang.g:1959:1: ( '=>' )
            // InternalColdLang.g:1960:2: '=>'
            {
             before(grammarAccess.getLanguageOperatorAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 

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
    // $ANTLR end "rule__LanguageOperator__Group_3__0__Impl"


    // $ANTLR start "rule__LanguageOperator__Group_3__1"
    // InternalColdLang.g:1969:1: rule__LanguageOperator__Group_3__1 : rule__LanguageOperator__Group_3__1__Impl ;
    public final void rule__LanguageOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1973:1: ( rule__LanguageOperator__Group_3__1__Impl )
            // InternalColdLang.g:1974:2: rule__LanguageOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__Group_3__1__Impl();

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
    // $ANTLR end "rule__LanguageOperator__Group_3__1"


    // $ANTLR start "rule__LanguageOperator__Group_3__1__Impl"
    // InternalColdLang.g:1980:1: rule__LanguageOperator__Group_3__1__Impl : ( ( rule__LanguageOperator__TypesAssignment_3_1 ) ) ;
    public final void rule__LanguageOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:1984:1: ( ( ( rule__LanguageOperator__TypesAssignment_3_1 ) ) )
            // InternalColdLang.g:1985:1: ( ( rule__LanguageOperator__TypesAssignment_3_1 ) )
            {
            // InternalColdLang.g:1985:1: ( ( rule__LanguageOperator__TypesAssignment_3_1 ) )
            // InternalColdLang.g:1986:2: ( rule__LanguageOperator__TypesAssignment_3_1 )
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypesAssignment_3_1()); 
            // InternalColdLang.g:1987:2: ( rule__LanguageOperator__TypesAssignment_3_1 )
            // InternalColdLang.g:1987:3: rule__LanguageOperator__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageOperator__TypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageOperatorAccess().getTypesAssignment_3_1()); 

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
    // $ANTLR end "rule__LanguageOperator__Group_3__1__Impl"


    // $ANTLR start "rule__Perspective__Group__0"
    // InternalColdLang.g:1996:1: rule__Perspective__Group__0 : rule__Perspective__Group__0__Impl rule__Perspective__Group__1 ;
    public final void rule__Perspective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2000:1: ( rule__Perspective__Group__0__Impl rule__Perspective__Group__1 )
            // InternalColdLang.g:2001:2: rule__Perspective__Group__0__Impl rule__Perspective__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Perspective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__1();

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
    // $ANTLR end "rule__Perspective__Group__0"


    // $ANTLR start "rule__Perspective__Group__0__Impl"
    // InternalColdLang.g:2008:1: rule__Perspective__Group__0__Impl : ( 'perspective' ) ;
    public final void rule__Perspective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2012:1: ( ( 'perspective' ) )
            // InternalColdLang.g:2013:1: ( 'perspective' )
            {
            // InternalColdLang.g:2013:1: ( 'perspective' )
            // InternalColdLang.g:2014:2: 'perspective'
            {
             before(grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getPerspectiveKeyword_0()); 

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
    // $ANTLR end "rule__Perspective__Group__0__Impl"


    // $ANTLR start "rule__Perspective__Group__1"
    // InternalColdLang.g:2023:1: rule__Perspective__Group__1 : rule__Perspective__Group__1__Impl rule__Perspective__Group__2 ;
    public final void rule__Perspective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2027:1: ( rule__Perspective__Group__1__Impl rule__Perspective__Group__2 )
            // InternalColdLang.g:2028:2: rule__Perspective__Group__1__Impl rule__Perspective__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Perspective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__2();

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
    // $ANTLR end "rule__Perspective__Group__1"


    // $ANTLR start "rule__Perspective__Group__1__Impl"
    // InternalColdLang.g:2035:1: rule__Perspective__Group__1__Impl : ( ( rule__Perspective__NameAssignment_1 ) ) ;
    public final void rule__Perspective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2039:1: ( ( ( rule__Perspective__NameAssignment_1 ) ) )
            // InternalColdLang.g:2040:1: ( ( rule__Perspective__NameAssignment_1 ) )
            {
            // InternalColdLang.g:2040:1: ( ( rule__Perspective__NameAssignment_1 ) )
            // InternalColdLang.g:2041:2: ( rule__Perspective__NameAssignment_1 )
            {
             before(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 
            // InternalColdLang.g:2042:2: ( rule__Perspective__NameAssignment_1 )
            // InternalColdLang.g:2042:3: rule__Perspective__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Perspective__Group__1__Impl"


    // $ANTLR start "rule__Perspective__Group__2"
    // InternalColdLang.g:2050:1: rule__Perspective__Group__2 : rule__Perspective__Group__2__Impl rule__Perspective__Group__3 ;
    public final void rule__Perspective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2054:1: ( rule__Perspective__Group__2__Impl rule__Perspective__Group__3 )
            // InternalColdLang.g:2055:2: rule__Perspective__Group__2__Impl rule__Perspective__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Perspective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__3();

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
    // $ANTLR end "rule__Perspective__Group__2"


    // $ANTLR start "rule__Perspective__Group__2__Impl"
    // InternalColdLang.g:2062:1: rule__Perspective__Group__2__Impl : ( '{' ) ;
    public final void rule__Perspective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2066:1: ( ( '{' ) )
            // InternalColdLang.g:2067:1: ( '{' )
            {
            // InternalColdLang.g:2067:1: ( '{' )
            // InternalColdLang.g:2068:2: '{'
            {
             before(grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Perspective__Group__2__Impl"


    // $ANTLR start "rule__Perspective__Group__3"
    // InternalColdLang.g:2077:1: rule__Perspective__Group__3 : rule__Perspective__Group__3__Impl rule__Perspective__Group__4 ;
    public final void rule__Perspective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2081:1: ( rule__Perspective__Group__3__Impl rule__Perspective__Group__4 )
            // InternalColdLang.g:2082:2: rule__Perspective__Group__3__Impl rule__Perspective__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Perspective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perspective__Group__4();

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
    // $ANTLR end "rule__Perspective__Group__3"


    // $ANTLR start "rule__Perspective__Group__3__Impl"
    // InternalColdLang.g:2089:1: rule__Perspective__Group__3__Impl : ( ( rule__Perspective__LanguagesAssignment_3 )* ) ;
    public final void rule__Perspective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2093:1: ( ( ( rule__Perspective__LanguagesAssignment_3 )* ) )
            // InternalColdLang.g:2094:1: ( ( rule__Perspective__LanguagesAssignment_3 )* )
            {
            // InternalColdLang.g:2094:1: ( ( rule__Perspective__LanguagesAssignment_3 )* )
            // InternalColdLang.g:2095:2: ( rule__Perspective__LanguagesAssignment_3 )*
            {
             before(grammarAccess.getPerspectiveAccess().getLanguagesAssignment_3()); 
            // InternalColdLang.g:2096:2: ( rule__Perspective__LanguagesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalColdLang.g:2096:3: rule__Perspective__LanguagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Perspective__LanguagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPerspectiveAccess().getLanguagesAssignment_3()); 

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
    // $ANTLR end "rule__Perspective__Group__3__Impl"


    // $ANTLR start "rule__Perspective__Group__4"
    // InternalColdLang.g:2104:1: rule__Perspective__Group__4 : rule__Perspective__Group__4__Impl ;
    public final void rule__Perspective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2108:1: ( rule__Perspective__Group__4__Impl )
            // InternalColdLang.g:2109:2: rule__Perspective__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perspective__Group__4__Impl();

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
    // $ANTLR end "rule__Perspective__Group__4"


    // $ANTLR start "rule__Perspective__Group__4__Impl"
    // InternalColdLang.g:2115:1: rule__Perspective__Group__4__Impl : ( '}' ) ;
    public final void rule__Perspective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2119:1: ( ( '}' ) )
            // InternalColdLang.g:2120:1: ( '}' )
            {
            // InternalColdLang.g:2120:1: ( '}' )
            // InternalColdLang.g:2121:2: '}'
            {
             before(grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Perspective__Group__4__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group__0"
    // InternalColdLang.g:2131:1: rule__PerspectiveLanguage__Group__0 : rule__PerspectiveLanguage__Group__0__Impl rule__PerspectiveLanguage__Group__1 ;
    public final void rule__PerspectiveLanguage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2135:1: ( rule__PerspectiveLanguage__Group__0__Impl rule__PerspectiveLanguage__Group__1 )
            // InternalColdLang.g:2136:2: rule__PerspectiveLanguage__Group__0__Impl rule__PerspectiveLanguage__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__PerspectiveLanguage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group__1();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__0"


    // $ANTLR start "rule__PerspectiveLanguage__Group__0__Impl"
    // InternalColdLang.g:2143:1: rule__PerspectiveLanguage__Group__0__Impl : ( ( rule__PerspectiveLanguage__NameAssignment_0 ) ) ;
    public final void rule__PerspectiveLanguage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2147:1: ( ( ( rule__PerspectiveLanguage__NameAssignment_0 ) ) )
            // InternalColdLang.g:2148:1: ( ( rule__PerspectiveLanguage__NameAssignment_0 ) )
            {
            // InternalColdLang.g:2148:1: ( ( rule__PerspectiveLanguage__NameAssignment_0 ) )
            // InternalColdLang.g:2149:2: ( rule__PerspectiveLanguage__NameAssignment_0 )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getNameAssignment_0()); 
            // InternalColdLang.g:2150:2: ( rule__PerspectiveLanguage__NameAssignment_0 )
            // InternalColdLang.g:2150:3: rule__PerspectiveLanguage__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveLanguageAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__0__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group__1"
    // InternalColdLang.g:2158:1: rule__PerspectiveLanguage__Group__1 : rule__PerspectiveLanguage__Group__1__Impl rule__PerspectiveLanguage__Group__2 ;
    public final void rule__PerspectiveLanguage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2162:1: ( rule__PerspectiveLanguage__Group__1__Impl rule__PerspectiveLanguage__Group__2 )
            // InternalColdLang.g:2163:2: rule__PerspectiveLanguage__Group__1__Impl rule__PerspectiveLanguage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PerspectiveLanguage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group__2();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__1"


    // $ANTLR start "rule__PerspectiveLanguage__Group__1__Impl"
    // InternalColdLang.g:2170:1: rule__PerspectiveLanguage__Group__1__Impl : ( ':' ) ;
    public final void rule__PerspectiveLanguage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2174:1: ( ( ':' ) )
            // InternalColdLang.g:2175:1: ( ':' )
            {
            // InternalColdLang.g:2175:1: ( ':' )
            // InternalColdLang.g:2176:2: ':'
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPerspectiveLanguageAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__1__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group__2"
    // InternalColdLang.g:2185:1: rule__PerspectiveLanguage__Group__2 : rule__PerspectiveLanguage__Group__2__Impl rule__PerspectiveLanguage__Group__3 ;
    public final void rule__PerspectiveLanguage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2189:1: ( rule__PerspectiveLanguage__Group__2__Impl rule__PerspectiveLanguage__Group__3 )
            // InternalColdLang.g:2190:2: rule__PerspectiveLanguage__Group__2__Impl rule__PerspectiveLanguage__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PerspectiveLanguage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group__3();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__2"


    // $ANTLR start "rule__PerspectiveLanguage__Group__2__Impl"
    // InternalColdLang.g:2197:1: rule__PerspectiveLanguage__Group__2__Impl : ( ( rule__PerspectiveLanguage__LanguageAssignment_2 ) ) ;
    public final void rule__PerspectiveLanguage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2201:1: ( ( ( rule__PerspectiveLanguage__LanguageAssignment_2 ) ) )
            // InternalColdLang.g:2202:1: ( ( rule__PerspectiveLanguage__LanguageAssignment_2 ) )
            {
            // InternalColdLang.g:2202:1: ( ( rule__PerspectiveLanguage__LanguageAssignment_2 ) )
            // InternalColdLang.g:2203:2: ( rule__PerspectiveLanguage__LanguageAssignment_2 )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getLanguageAssignment_2()); 
            // InternalColdLang.g:2204:2: ( rule__PerspectiveLanguage__LanguageAssignment_2 )
            // InternalColdLang.g:2204:3: rule__PerspectiveLanguage__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveLanguageAccess().getLanguageAssignment_2()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__2__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group__3"
    // InternalColdLang.g:2212:1: rule__PerspectiveLanguage__Group__3 : rule__PerspectiveLanguage__Group__3__Impl ;
    public final void rule__PerspectiveLanguage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2216:1: ( rule__PerspectiveLanguage__Group__3__Impl )
            // InternalColdLang.g:2217:2: rule__PerspectiveLanguage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group__3__Impl();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__3"


    // $ANTLR start "rule__PerspectiveLanguage__Group__3__Impl"
    // InternalColdLang.g:2223:1: rule__PerspectiveLanguage__Group__3__Impl : ( ( rule__PerspectiveLanguage__Group_3__0 )? ) ;
    public final void rule__PerspectiveLanguage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2227:1: ( ( ( rule__PerspectiveLanguage__Group_3__0 )? ) )
            // InternalColdLang.g:2228:1: ( ( rule__PerspectiveLanguage__Group_3__0 )? )
            {
            // InternalColdLang.g:2228:1: ( ( rule__PerspectiveLanguage__Group_3__0 )? )
            // InternalColdLang.g:2229:2: ( rule__PerspectiveLanguage__Group_3__0 )?
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getGroup_3()); 
            // InternalColdLang.g:2230:2: ( rule__PerspectiveLanguage__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalColdLang.g:2230:3: rule__PerspectiveLanguage__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PerspectiveLanguage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerspectiveLanguageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group__3__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group_3__0"
    // InternalColdLang.g:2239:1: rule__PerspectiveLanguage__Group_3__0 : rule__PerspectiveLanguage__Group_3__0__Impl rule__PerspectiveLanguage__Group_3__1 ;
    public final void rule__PerspectiveLanguage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2243:1: ( rule__PerspectiveLanguage__Group_3__0__Impl rule__PerspectiveLanguage__Group_3__1 )
            // InternalColdLang.g:2244:2: rule__PerspectiveLanguage__Group_3__0__Impl rule__PerspectiveLanguage__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__PerspectiveLanguage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group_3__1();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group_3__0"


    // $ANTLR start "rule__PerspectiveLanguage__Group_3__0__Impl"
    // InternalColdLang.g:2251:1: rule__PerspectiveLanguage__Group_3__0__Impl : ( ( rule__PerspectiveLanguage__OperatorAssignment_3_0 ) ) ;
    public final void rule__PerspectiveLanguage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2255:1: ( ( ( rule__PerspectiveLanguage__OperatorAssignment_3_0 ) ) )
            // InternalColdLang.g:2256:1: ( ( rule__PerspectiveLanguage__OperatorAssignment_3_0 ) )
            {
            // InternalColdLang.g:2256:1: ( ( rule__PerspectiveLanguage__OperatorAssignment_3_0 ) )
            // InternalColdLang.g:2257:2: ( rule__PerspectiveLanguage__OperatorAssignment_3_0 )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getOperatorAssignment_3_0()); 
            // InternalColdLang.g:2258:2: ( rule__PerspectiveLanguage__OperatorAssignment_3_0 )
            // InternalColdLang.g:2258:3: rule__PerspectiveLanguage__OperatorAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__OperatorAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveLanguageAccess().getOperatorAssignment_3_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group_3__0__Impl"


    // $ANTLR start "rule__PerspectiveLanguage__Group_3__1"
    // InternalColdLang.g:2266:1: rule__PerspectiveLanguage__Group_3__1 : rule__PerspectiveLanguage__Group_3__1__Impl ;
    public final void rule__PerspectiveLanguage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2270:1: ( rule__PerspectiveLanguage__Group_3__1__Impl )
            // InternalColdLang.g:2271:2: rule__PerspectiveLanguage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__Group_3__1__Impl();

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
    // $ANTLR end "rule__PerspectiveLanguage__Group_3__1"


    // $ANTLR start "rule__PerspectiveLanguage__Group_3__1__Impl"
    // InternalColdLang.g:2277:1: rule__PerspectiveLanguage__Group_3__1__Impl : ( ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 ) ) ;
    public final void rule__PerspectiveLanguage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2281:1: ( ( ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 ) ) )
            // InternalColdLang.g:2282:1: ( ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 ) )
            {
            // InternalColdLang.g:2282:1: ( ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 ) )
            // InternalColdLang.g:2283:2: ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getPerspectiveAssignment_3_1()); 
            // InternalColdLang.g:2284:2: ( rule__PerspectiveLanguage__PerspectiveAssignment_3_1 )
            // InternalColdLang.g:2284:3: rule__PerspectiveLanguage__PerspectiveAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PerspectiveLanguage__PerspectiveAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPerspectiveLanguageAccess().getPerspectiveAssignment_3_1()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__Group_3__1__Impl"


    // $ANTLR start "rule__Facet__Group__0"
    // InternalColdLang.g:2293:1: rule__Facet__Group__0 : rule__Facet__Group__0__Impl rule__Facet__Group__1 ;
    public final void rule__Facet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2297:1: ( rule__Facet__Group__0__Impl rule__Facet__Group__1 )
            // InternalColdLang.g:2298:2: rule__Facet__Group__0__Impl rule__Facet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Facet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__1();

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
    // $ANTLR end "rule__Facet__Group__0"


    // $ANTLR start "rule__Facet__Group__0__Impl"
    // InternalColdLang.g:2305:1: rule__Facet__Group__0__Impl : ( 'facet' ) ;
    public final void rule__Facet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2309:1: ( ( 'facet' ) )
            // InternalColdLang.g:2310:1: ( 'facet' )
            {
            // InternalColdLang.g:2310:1: ( 'facet' )
            // InternalColdLang.g:2311:2: 'facet'
            {
             before(grammarAccess.getFacetAccess().getFacetKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getFacetKeyword_0()); 

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
    // $ANTLR end "rule__Facet__Group__0__Impl"


    // $ANTLR start "rule__Facet__Group__1"
    // InternalColdLang.g:2320:1: rule__Facet__Group__1 : rule__Facet__Group__1__Impl rule__Facet__Group__2 ;
    public final void rule__Facet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2324:1: ( rule__Facet__Group__1__Impl rule__Facet__Group__2 )
            // InternalColdLang.g:2325:2: rule__Facet__Group__1__Impl rule__Facet__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Facet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__2();

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
    // $ANTLR end "rule__Facet__Group__1"


    // $ANTLR start "rule__Facet__Group__1__Impl"
    // InternalColdLang.g:2332:1: rule__Facet__Group__1__Impl : ( ( rule__Facet__NameAssignment_1 ) ) ;
    public final void rule__Facet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2336:1: ( ( ( rule__Facet__NameAssignment_1 ) ) )
            // InternalColdLang.g:2337:1: ( ( rule__Facet__NameAssignment_1 ) )
            {
            // InternalColdLang.g:2337:1: ( ( rule__Facet__NameAssignment_1 ) )
            // InternalColdLang.g:2338:2: ( rule__Facet__NameAssignment_1 )
            {
             before(grammarAccess.getFacetAccess().getNameAssignment_1()); 
            // InternalColdLang.g:2339:2: ( rule__Facet__NameAssignment_1 )
            // InternalColdLang.g:2339:3: rule__Facet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Facet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFacetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Facet__Group__1__Impl"


    // $ANTLR start "rule__Facet__Group__2"
    // InternalColdLang.g:2347:1: rule__Facet__Group__2 : rule__Facet__Group__2__Impl rule__Facet__Group__3 ;
    public final void rule__Facet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2351:1: ( rule__Facet__Group__2__Impl rule__Facet__Group__3 )
            // InternalColdLang.g:2352:2: rule__Facet__Group__2__Impl rule__Facet__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Facet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__3();

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
    // $ANTLR end "rule__Facet__Group__2"


    // $ANTLR start "rule__Facet__Group__2__Impl"
    // InternalColdLang.g:2359:1: rule__Facet__Group__2__Impl : ( ':' ) ;
    public final void rule__Facet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2363:1: ( ( ':' ) )
            // InternalColdLang.g:2364:1: ( ':' )
            {
            // InternalColdLang.g:2364:1: ( ':' )
            // InternalColdLang.g:2365:2: ':'
            {
             before(grammarAccess.getFacetAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Facet__Group__2__Impl"


    // $ANTLR start "rule__Facet__Group__3"
    // InternalColdLang.g:2374:1: rule__Facet__Group__3 : rule__Facet__Group__3__Impl rule__Facet__Group__4 ;
    public final void rule__Facet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2378:1: ( rule__Facet__Group__3__Impl rule__Facet__Group__4 )
            // InternalColdLang.g:2379:2: rule__Facet__Group__3__Impl rule__Facet__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Facet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__4();

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
    // $ANTLR end "rule__Facet__Group__3"


    // $ANTLR start "rule__Facet__Group__3__Impl"
    // InternalColdLang.g:2386:1: rule__Facet__Group__3__Impl : ( ( rule__Facet__PerspectiveAssignment_3 ) ) ;
    public final void rule__Facet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2390:1: ( ( ( rule__Facet__PerspectiveAssignment_3 ) ) )
            // InternalColdLang.g:2391:1: ( ( rule__Facet__PerspectiveAssignment_3 ) )
            {
            // InternalColdLang.g:2391:1: ( ( rule__Facet__PerspectiveAssignment_3 ) )
            // InternalColdLang.g:2392:2: ( rule__Facet__PerspectiveAssignment_3 )
            {
             before(grammarAccess.getFacetAccess().getPerspectiveAssignment_3()); 
            // InternalColdLang.g:2393:2: ( rule__Facet__PerspectiveAssignment_3 )
            // InternalColdLang.g:2393:3: rule__Facet__PerspectiveAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Facet__PerspectiveAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFacetAccess().getPerspectiveAssignment_3()); 

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
    // $ANTLR end "rule__Facet__Group__3__Impl"


    // $ANTLR start "rule__Facet__Group__4"
    // InternalColdLang.g:2401:1: rule__Facet__Group__4 : rule__Facet__Group__4__Impl rule__Facet__Group__5 ;
    public final void rule__Facet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2405:1: ( rule__Facet__Group__4__Impl rule__Facet__Group__5 )
            // InternalColdLang.g:2406:2: rule__Facet__Group__4__Impl rule__Facet__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Facet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__5();

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
    // $ANTLR end "rule__Facet__Group__4"


    // $ANTLR start "rule__Facet__Group__4__Impl"
    // InternalColdLang.g:2413:1: rule__Facet__Group__4__Impl : ( '{' ) ;
    public final void rule__Facet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2417:1: ( ( '{' ) )
            // InternalColdLang.g:2418:1: ( '{' )
            {
            // InternalColdLang.g:2418:1: ( '{' )
            // InternalColdLang.g:2419:2: '{'
            {
             before(grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Facet__Group__4__Impl"


    // $ANTLR start "rule__Facet__Group__5"
    // InternalColdLang.g:2428:1: rule__Facet__Group__5 : rule__Facet__Group__5__Impl rule__Facet__Group__6 ;
    public final void rule__Facet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2432:1: ( rule__Facet__Group__5__Impl rule__Facet__Group__6 )
            // InternalColdLang.g:2433:2: rule__Facet__Group__5__Impl rule__Facet__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Facet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__6();

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
    // $ANTLR end "rule__Facet__Group__5"


    // $ANTLR start "rule__Facet__Group__5__Impl"
    // InternalColdLang.g:2440:1: rule__Facet__Group__5__Impl : ( 'activation' ) ;
    public final void rule__Facet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2444:1: ( ( 'activation' ) )
            // InternalColdLang.g:2445:1: ( 'activation' )
            {
            // InternalColdLang.g:2445:1: ( 'activation' )
            // InternalColdLang.g:2446:2: 'activation'
            {
             before(grammarAccess.getFacetAccess().getActivationKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getActivationKeyword_5()); 

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
    // $ANTLR end "rule__Facet__Group__5__Impl"


    // $ANTLR start "rule__Facet__Group__6"
    // InternalColdLang.g:2455:1: rule__Facet__Group__6 : rule__Facet__Group__6__Impl rule__Facet__Group__7 ;
    public final void rule__Facet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2459:1: ( rule__Facet__Group__6__Impl rule__Facet__Group__7 )
            // InternalColdLang.g:2460:2: rule__Facet__Group__6__Impl rule__Facet__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Facet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__7();

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
    // $ANTLR end "rule__Facet__Group__6"


    // $ANTLR start "rule__Facet__Group__6__Impl"
    // InternalColdLang.g:2467:1: rule__Facet__Group__6__Impl : ( ( rule__Facet__ActivationAssignment_6 ) ) ;
    public final void rule__Facet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2471:1: ( ( ( rule__Facet__ActivationAssignment_6 ) ) )
            // InternalColdLang.g:2472:1: ( ( rule__Facet__ActivationAssignment_6 ) )
            {
            // InternalColdLang.g:2472:1: ( ( rule__Facet__ActivationAssignment_6 ) )
            // InternalColdLang.g:2473:2: ( rule__Facet__ActivationAssignment_6 )
            {
             before(grammarAccess.getFacetAccess().getActivationAssignment_6()); 
            // InternalColdLang.g:2474:2: ( rule__Facet__ActivationAssignment_6 )
            // InternalColdLang.g:2474:3: rule__Facet__ActivationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Facet__ActivationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFacetAccess().getActivationAssignment_6()); 

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
    // $ANTLR end "rule__Facet__Group__6__Impl"


    // $ANTLR start "rule__Facet__Group__7"
    // InternalColdLang.g:2482:1: rule__Facet__Group__7 : rule__Facet__Group__7__Impl rule__Facet__Group__8 ;
    public final void rule__Facet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2486:1: ( rule__Facet__Group__7__Impl rule__Facet__Group__8 )
            // InternalColdLang.g:2487:2: rule__Facet__Group__7__Impl rule__Facet__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Facet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Facet__Group__8();

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
    // $ANTLR end "rule__Facet__Group__7"


    // $ANTLR start "rule__Facet__Group__7__Impl"
    // InternalColdLang.g:2494:1: rule__Facet__Group__7__Impl : ( ( rule__Facet__CompositionsAssignment_7 )* ) ;
    public final void rule__Facet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2498:1: ( ( ( rule__Facet__CompositionsAssignment_7 )* ) )
            // InternalColdLang.g:2499:1: ( ( rule__Facet__CompositionsAssignment_7 )* )
            {
            // InternalColdLang.g:2499:1: ( ( rule__Facet__CompositionsAssignment_7 )* )
            // InternalColdLang.g:2500:2: ( rule__Facet__CompositionsAssignment_7 )*
            {
             before(grammarAccess.getFacetAccess().getCompositionsAssignment_7()); 
            // InternalColdLang.g:2501:2: ( rule__Facet__CompositionsAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalColdLang.g:2501:3: rule__Facet__CompositionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Facet__CompositionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFacetAccess().getCompositionsAssignment_7()); 

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
    // $ANTLR end "rule__Facet__Group__7__Impl"


    // $ANTLR start "rule__Facet__Group__8"
    // InternalColdLang.g:2509:1: rule__Facet__Group__8 : rule__Facet__Group__8__Impl ;
    public final void rule__Facet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2513:1: ( rule__Facet__Group__8__Impl )
            // InternalColdLang.g:2514:2: rule__Facet__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Facet__Group__8__Impl();

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
    // $ANTLR end "rule__Facet__Group__8"


    // $ANTLR start "rule__Facet__Group__8__Impl"
    // InternalColdLang.g:2520:1: rule__Facet__Group__8__Impl : ( '}' ) ;
    public final void rule__Facet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2524:1: ( ( '}' ) )
            // InternalColdLang.g:2525:1: ( '}' )
            {
            // InternalColdLang.g:2525:1: ( '}' )
            // InternalColdLang.g:2526:2: '}'
            {
             before(grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Facet__Group__8__Impl"


    // $ANTLR start "rule__FacetComposition__Group__0"
    // InternalColdLang.g:2536:1: rule__FacetComposition__Group__0 : rule__FacetComposition__Group__0__Impl rule__FacetComposition__Group__1 ;
    public final void rule__FacetComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2540:1: ( rule__FacetComposition__Group__0__Impl rule__FacetComposition__Group__1 )
            // InternalColdLang.g:2541:2: rule__FacetComposition__Group__0__Impl rule__FacetComposition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FacetComposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FacetComposition__Group__1();

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
    // $ANTLR end "rule__FacetComposition__Group__0"


    // $ANTLR start "rule__FacetComposition__Group__0__Impl"
    // InternalColdLang.g:2548:1: rule__FacetComposition__Group__0__Impl : ( ( rule__FacetComposition__PerspectiveLanguageAssignment_0 ) ) ;
    public final void rule__FacetComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2552:1: ( ( ( rule__FacetComposition__PerspectiveLanguageAssignment_0 ) ) )
            // InternalColdLang.g:2553:1: ( ( rule__FacetComposition__PerspectiveLanguageAssignment_0 ) )
            {
            // InternalColdLang.g:2553:1: ( ( rule__FacetComposition__PerspectiveLanguageAssignment_0 ) )
            // InternalColdLang.g:2554:2: ( rule__FacetComposition__PerspectiveLanguageAssignment_0 )
            {
             before(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguageAssignment_0()); 
            // InternalColdLang.g:2555:2: ( rule__FacetComposition__PerspectiveLanguageAssignment_0 )
            // InternalColdLang.g:2555:3: rule__FacetComposition__PerspectiveLanguageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FacetComposition__PerspectiveLanguageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguageAssignment_0()); 

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
    // $ANTLR end "rule__FacetComposition__Group__0__Impl"


    // $ANTLR start "rule__FacetComposition__Group__1"
    // InternalColdLang.g:2563:1: rule__FacetComposition__Group__1 : rule__FacetComposition__Group__1__Impl rule__FacetComposition__Group__2 ;
    public final void rule__FacetComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2567:1: ( rule__FacetComposition__Group__1__Impl rule__FacetComposition__Group__2 )
            // InternalColdLang.g:2568:2: rule__FacetComposition__Group__1__Impl rule__FacetComposition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FacetComposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FacetComposition__Group__2();

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
    // $ANTLR end "rule__FacetComposition__Group__1"


    // $ANTLR start "rule__FacetComposition__Group__1__Impl"
    // InternalColdLang.g:2575:1: rule__FacetComposition__Group__1__Impl : ( ':' ) ;
    public final void rule__FacetComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2579:1: ( ( ':' ) )
            // InternalColdLang.g:2580:1: ( ':' )
            {
            // InternalColdLang.g:2580:1: ( ':' )
            // InternalColdLang.g:2581:2: ':'
            {
             before(grammarAccess.getFacetCompositionAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFacetCompositionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FacetComposition__Group__1__Impl"


    // $ANTLR start "rule__FacetComposition__Group__2"
    // InternalColdLang.g:2590:1: rule__FacetComposition__Group__2 : rule__FacetComposition__Group__2__Impl ;
    public final void rule__FacetComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2594:1: ( rule__FacetComposition__Group__2__Impl )
            // InternalColdLang.g:2595:2: rule__FacetComposition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FacetComposition__Group__2__Impl();

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
    // $ANTLR end "rule__FacetComposition__Group__2"


    // $ANTLR start "rule__FacetComposition__Group__2__Impl"
    // InternalColdLang.g:2601:1: rule__FacetComposition__Group__2__Impl : ( ( rule__FacetComposition__ApplicationAssignment_2 ) ) ;
    public final void rule__FacetComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2605:1: ( ( ( rule__FacetComposition__ApplicationAssignment_2 ) ) )
            // InternalColdLang.g:2606:1: ( ( rule__FacetComposition__ApplicationAssignment_2 ) )
            {
            // InternalColdLang.g:2606:1: ( ( rule__FacetComposition__ApplicationAssignment_2 ) )
            // InternalColdLang.g:2607:2: ( rule__FacetComposition__ApplicationAssignment_2 )
            {
             before(grammarAccess.getFacetCompositionAccess().getApplicationAssignment_2()); 
            // InternalColdLang.g:2608:2: ( rule__FacetComposition__ApplicationAssignment_2 )
            // InternalColdLang.g:2608:3: rule__FacetComposition__ApplicationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FacetComposition__ApplicationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFacetCompositionAccess().getApplicationAssignment_2()); 

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
    // $ANTLR end "rule__FacetComposition__Group__2__Impl"


    // $ANTLR start "rule__Application__Group_0__0"
    // InternalColdLang.g:2617:1: rule__Application__Group_0__0 : rule__Application__Group_0__0__Impl rule__Application__Group_0__1 ;
    public final void rule__Application__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2621:1: ( rule__Application__Group_0__0__Impl rule__Application__Group_0__1 )
            // InternalColdLang.g:2622:2: rule__Application__Group_0__0__Impl rule__Application__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_0__1();

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
    // $ANTLR end "rule__Application__Group_0__0"


    // $ANTLR start "rule__Application__Group_0__0__Impl"
    // InternalColdLang.g:2629:1: rule__Application__Group_0__0__Impl : ( () ) ;
    public final void rule__Application__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2633:1: ( ( () ) )
            // InternalColdLang.g:2634:1: ( () )
            {
            // InternalColdLang.g:2634:1: ( () )
            // InternalColdLang.g:2635:2: ()
            {
             before(grammarAccess.getApplicationAccess().getArtifactRefAction_0_0()); 
            // InternalColdLang.g:2636:2: ()
            // InternalColdLang.g:2636:3: 
            {
            }

             after(grammarAccess.getApplicationAccess().getArtifactRefAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_0__0__Impl"


    // $ANTLR start "rule__Application__Group_0__1"
    // InternalColdLang.g:2644:1: rule__Application__Group_0__1 : rule__Application__Group_0__1__Impl ;
    public final void rule__Application__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2648:1: ( rule__Application__Group_0__1__Impl )
            // InternalColdLang.g:2649:2: rule__Application__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_0__1__Impl();

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
    // $ANTLR end "rule__Application__Group_0__1"


    // $ANTLR start "rule__Application__Group_0__1__Impl"
    // InternalColdLang.g:2655:1: rule__Application__Group_0__1__Impl : ( ( rule__Application__ArtifactAssignment_0_1 ) ) ;
    public final void rule__Application__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2659:1: ( ( ( rule__Application__ArtifactAssignment_0_1 ) ) )
            // InternalColdLang.g:2660:1: ( ( rule__Application__ArtifactAssignment_0_1 ) )
            {
            // InternalColdLang.g:2660:1: ( ( rule__Application__ArtifactAssignment_0_1 ) )
            // InternalColdLang.g:2661:2: ( rule__Application__ArtifactAssignment_0_1 )
            {
             before(grammarAccess.getApplicationAccess().getArtifactAssignment_0_1()); 
            // InternalColdLang.g:2662:2: ( rule__Application__ArtifactAssignment_0_1 )
            // InternalColdLang.g:2662:3: rule__Application__ArtifactAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ArtifactAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getArtifactAssignment_0_1()); 

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
    // $ANTLR end "rule__Application__Group_0__1__Impl"


    // $ANTLR start "rule__Application__Group_1__0"
    // InternalColdLang.g:2671:1: rule__Application__Group_1__0 : rule__Application__Group_1__0__Impl rule__Application__Group_1__1 ;
    public final void rule__Application__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2675:1: ( rule__Application__Group_1__0__Impl rule__Application__Group_1__1 )
            // InternalColdLang.g:2676:2: rule__Application__Group_1__0__Impl rule__Application__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1__1();

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
    // $ANTLR end "rule__Application__Group_1__0"


    // $ANTLR start "rule__Application__Group_1__0__Impl"
    // InternalColdLang.g:2683:1: rule__Application__Group_1__0__Impl : ( () ) ;
    public final void rule__Application__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2687:1: ( ( () ) )
            // InternalColdLang.g:2688:1: ( () )
            {
            // InternalColdLang.g:2688:1: ( () )
            // InternalColdLang.g:2689:2: ()
            {
             before(grammarAccess.getApplicationAccess().getApplicationAction_1_0()); 
            // InternalColdLang.g:2690:2: ()
            // InternalColdLang.g:2690:3: 
            {
            }

             after(grammarAccess.getApplicationAccess().getApplicationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_1__0__Impl"


    // $ANTLR start "rule__Application__Group_1__1"
    // InternalColdLang.g:2698:1: rule__Application__Group_1__1 : rule__Application__Group_1__1__Impl rule__Application__Group_1__2 ;
    public final void rule__Application__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2702:1: ( rule__Application__Group_1__1__Impl rule__Application__Group_1__2 )
            // InternalColdLang.g:2703:2: rule__Application__Group_1__1__Impl rule__Application__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Application__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1__2();

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
    // $ANTLR end "rule__Application__Group_1__1"


    // $ANTLR start "rule__Application__Group_1__1__Impl"
    // InternalColdLang.g:2710:1: rule__Application__Group_1__1__Impl : ( ( rule__Application__LanguageOperatorAssignment_1_1 ) ) ;
    public final void rule__Application__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2714:1: ( ( ( rule__Application__LanguageOperatorAssignment_1_1 ) ) )
            // InternalColdLang.g:2715:1: ( ( rule__Application__LanguageOperatorAssignment_1_1 ) )
            {
            // InternalColdLang.g:2715:1: ( ( rule__Application__LanguageOperatorAssignment_1_1 ) )
            // InternalColdLang.g:2716:2: ( rule__Application__LanguageOperatorAssignment_1_1 )
            {
             before(grammarAccess.getApplicationAccess().getLanguageOperatorAssignment_1_1()); 
            // InternalColdLang.g:2717:2: ( rule__Application__LanguageOperatorAssignment_1_1 )
            // InternalColdLang.g:2717:3: rule__Application__LanguageOperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__LanguageOperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getLanguageOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Application__Group_1__1__Impl"


    // $ANTLR start "rule__Application__Group_1__2"
    // InternalColdLang.g:2725:1: rule__Application__Group_1__2 : rule__Application__Group_1__2__Impl rule__Application__Group_1__3 ;
    public final void rule__Application__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2729:1: ( rule__Application__Group_1__2__Impl rule__Application__Group_1__3 )
            // InternalColdLang.g:2730:2: rule__Application__Group_1__2__Impl rule__Application__Group_1__3
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1__3();

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
    // $ANTLR end "rule__Application__Group_1__2"


    // $ANTLR start "rule__Application__Group_1__2__Impl"
    // InternalColdLang.g:2737:1: rule__Application__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Application__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2741:1: ( ( '(' ) )
            // InternalColdLang.g:2742:1: ( '(' )
            {
            // InternalColdLang.g:2742:1: ( '(' )
            // InternalColdLang.g:2743:2: '('
            {
             before(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Application__Group_1__2__Impl"


    // $ANTLR start "rule__Application__Group_1__3"
    // InternalColdLang.g:2752:1: rule__Application__Group_1__3 : rule__Application__Group_1__3__Impl rule__Application__Group_1__4 ;
    public final void rule__Application__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2756:1: ( rule__Application__Group_1__3__Impl rule__Application__Group_1__4 )
            // InternalColdLang.g:2757:2: rule__Application__Group_1__3__Impl rule__Application__Group_1__4
            {
            pushFollow(FOLLOW_24);
            rule__Application__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1__4();

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
    // $ANTLR end "rule__Application__Group_1__3"


    // $ANTLR start "rule__Application__Group_1__3__Impl"
    // InternalColdLang.g:2764:1: rule__Application__Group_1__3__Impl : ( ( rule__Application__ApplicationsAssignment_1_3 ) ) ;
    public final void rule__Application__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2768:1: ( ( ( rule__Application__ApplicationsAssignment_1_3 ) ) )
            // InternalColdLang.g:2769:1: ( ( rule__Application__ApplicationsAssignment_1_3 ) )
            {
            // InternalColdLang.g:2769:1: ( ( rule__Application__ApplicationsAssignment_1_3 ) )
            // InternalColdLang.g:2770:2: ( rule__Application__ApplicationsAssignment_1_3 )
            {
             before(grammarAccess.getApplicationAccess().getApplicationsAssignment_1_3()); 
            // InternalColdLang.g:2771:2: ( rule__Application__ApplicationsAssignment_1_3 )
            // InternalColdLang.g:2771:3: rule__Application__ApplicationsAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__ApplicationsAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApplicationsAssignment_1_3()); 

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
    // $ANTLR end "rule__Application__Group_1__3__Impl"


    // $ANTLR start "rule__Application__Group_1__4"
    // InternalColdLang.g:2779:1: rule__Application__Group_1__4 : rule__Application__Group_1__4__Impl rule__Application__Group_1__5 ;
    public final void rule__Application__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2783:1: ( rule__Application__Group_1__4__Impl rule__Application__Group_1__5 )
            // InternalColdLang.g:2784:2: rule__Application__Group_1__4__Impl rule__Application__Group_1__5
            {
            pushFollow(FOLLOW_24);
            rule__Application__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1__5();

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
    // $ANTLR end "rule__Application__Group_1__4"


    // $ANTLR start "rule__Application__Group_1__4__Impl"
    // InternalColdLang.g:2791:1: rule__Application__Group_1__4__Impl : ( ( rule__Application__Group_1_4__0 )* ) ;
    public final void rule__Application__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2795:1: ( ( ( rule__Application__Group_1_4__0 )* ) )
            // InternalColdLang.g:2796:1: ( ( rule__Application__Group_1_4__0 )* )
            {
            // InternalColdLang.g:2796:1: ( ( rule__Application__Group_1_4__0 )* )
            // InternalColdLang.g:2797:2: ( rule__Application__Group_1_4__0 )*
            {
             before(grammarAccess.getApplicationAccess().getGroup_1_4()); 
            // InternalColdLang.g:2798:2: ( rule__Application__Group_1_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalColdLang.g:2798:3: rule__Application__Group_1_4__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Application__Group_1_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getGroup_1_4()); 

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
    // $ANTLR end "rule__Application__Group_1__4__Impl"


    // $ANTLR start "rule__Application__Group_1__5"
    // InternalColdLang.g:2806:1: rule__Application__Group_1__5 : rule__Application__Group_1__5__Impl ;
    public final void rule__Application__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2810:1: ( rule__Application__Group_1__5__Impl )
            // InternalColdLang.g:2811:2: rule__Application__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_1__5__Impl();

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
    // $ANTLR end "rule__Application__Group_1__5"


    // $ANTLR start "rule__Application__Group_1__5__Impl"
    // InternalColdLang.g:2817:1: rule__Application__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Application__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2821:1: ( ( ')' ) )
            // InternalColdLang.g:2822:1: ( ')' )
            {
            // InternalColdLang.g:2822:1: ( ')' )
            // InternalColdLang.g:2823:2: ')'
            {
             before(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_1_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__Application__Group_1__5__Impl"


    // $ANTLR start "rule__Application__Group_1_4__0"
    // InternalColdLang.g:2833:1: rule__Application__Group_1_4__0 : rule__Application__Group_1_4__0__Impl rule__Application__Group_1_4__1 ;
    public final void rule__Application__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2837:1: ( rule__Application__Group_1_4__0__Impl rule__Application__Group_1_4__1 )
            // InternalColdLang.g:2838:2: rule__Application__Group_1_4__0__Impl rule__Application__Group_1_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_1_4__1();

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
    // $ANTLR end "rule__Application__Group_1_4__0"


    // $ANTLR start "rule__Application__Group_1_4__0__Impl"
    // InternalColdLang.g:2845:1: rule__Application__Group_1_4__0__Impl : ( ',' ) ;
    public final void rule__Application__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2849:1: ( ( ',' ) )
            // InternalColdLang.g:2850:1: ( ',' )
            {
            // InternalColdLang.g:2850:1: ( ',' )
            // InternalColdLang.g:2851:2: ','
            {
             before(grammarAccess.getApplicationAccess().getCommaKeyword_1_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getCommaKeyword_1_4_0()); 

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
    // $ANTLR end "rule__Application__Group_1_4__0__Impl"


    // $ANTLR start "rule__Application__Group_1_4__1"
    // InternalColdLang.g:2860:1: rule__Application__Group_1_4__1 : rule__Application__Group_1_4__1__Impl ;
    public final void rule__Application__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2864:1: ( rule__Application__Group_1_4__1__Impl )
            // InternalColdLang.g:2865:2: rule__Application__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_1_4__1__Impl();

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
    // $ANTLR end "rule__Application__Group_1_4__1"


    // $ANTLR start "rule__Application__Group_1_4__1__Impl"
    // InternalColdLang.g:2871:1: rule__Application__Group_1_4__1__Impl : ( ( rule__Application__ApplicationsAssignment_1_4_1 ) ) ;
    public final void rule__Application__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2875:1: ( ( ( rule__Application__ApplicationsAssignment_1_4_1 ) ) )
            // InternalColdLang.g:2876:1: ( ( rule__Application__ApplicationsAssignment_1_4_1 ) )
            {
            // InternalColdLang.g:2876:1: ( ( rule__Application__ApplicationsAssignment_1_4_1 ) )
            // InternalColdLang.g:2877:2: ( rule__Application__ApplicationsAssignment_1_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getApplicationsAssignment_1_4_1()); 
            // InternalColdLang.g:2878:2: ( rule__Application__ApplicationsAssignment_1_4_1 )
            // InternalColdLang.g:2878:3: rule__Application__ApplicationsAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ApplicationsAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getApplicationsAssignment_1_4_1()); 

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
    // $ANTLR end "rule__Application__Group_1_4__1__Impl"


    // $ANTLR start "rule__Artifact__Group__0"
    // InternalColdLang.g:2887:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2891:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // InternalColdLang.g:2892:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__1();

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
    // $ANTLR end "rule__Artifact__Group__0"


    // $ANTLR start "rule__Artifact__Group__0__Impl"
    // InternalColdLang.g:2899:1: rule__Artifact__Group__0__Impl : ( 'artifact' ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2903:1: ( ( 'artifact' ) )
            // InternalColdLang.g:2904:1: ( 'artifact' )
            {
            // InternalColdLang.g:2904:1: ( 'artifact' )
            // InternalColdLang.g:2905:2: 'artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 

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
    // $ANTLR end "rule__Artifact__Group__0__Impl"


    // $ANTLR start "rule__Artifact__Group__1"
    // InternalColdLang.g:2914:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2918:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // InternalColdLang.g:2919:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__2();

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
    // $ANTLR end "rule__Artifact__Group__1"


    // $ANTLR start "rule__Artifact__Group__1__Impl"
    // InternalColdLang.g:2926:1: rule__Artifact__Group__1__Impl : ( ( rule__Artifact__NameAssignment_1 ) ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2930:1: ( ( ( rule__Artifact__NameAssignment_1 ) ) )
            // InternalColdLang.g:2931:1: ( ( rule__Artifact__NameAssignment_1 ) )
            {
            // InternalColdLang.g:2931:1: ( ( rule__Artifact__NameAssignment_1 ) )
            // InternalColdLang.g:2932:2: ( rule__Artifact__NameAssignment_1 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_1()); 
            // InternalColdLang.g:2933:2: ( rule__Artifact__NameAssignment_1 )
            // InternalColdLang.g:2933:3: rule__Artifact__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Artifact__Group__1__Impl"


    // $ANTLR start "rule__Artifact__Group__2"
    // InternalColdLang.g:2941:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2945:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // InternalColdLang.g:2946:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__3();

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
    // $ANTLR end "rule__Artifact__Group__2"


    // $ANTLR start "rule__Artifact__Group__2__Impl"
    // InternalColdLang.g:2953:1: rule__Artifact__Group__2__Impl : ( ':' ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2957:1: ( ( ':' ) )
            // InternalColdLang.g:2958:1: ( ':' )
            {
            // InternalColdLang.g:2958:1: ( ':' )
            // InternalColdLang.g:2959:2: ':'
            {
             before(grammarAccess.getArtifactAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Artifact__Group__2__Impl"


    // $ANTLR start "rule__Artifact__Group__3"
    // InternalColdLang.g:2968:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2972:1: ( rule__Artifact__Group__3__Impl )
            // InternalColdLang.g:2973:2: rule__Artifact__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__3__Impl();

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
    // $ANTLR end "rule__Artifact__Group__3"


    // $ANTLR start "rule__Artifact__Group__3__Impl"
    // InternalColdLang.g:2979:1: rule__Artifact__Group__3__Impl : ( ( rule__Artifact__LanguageAssignment_3 ) ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2983:1: ( ( ( rule__Artifact__LanguageAssignment_3 ) ) )
            // InternalColdLang.g:2984:1: ( ( rule__Artifact__LanguageAssignment_3 ) )
            {
            // InternalColdLang.g:2984:1: ( ( rule__Artifact__LanguageAssignment_3 ) )
            // InternalColdLang.g:2985:2: ( rule__Artifact__LanguageAssignment_3 )
            {
             before(grammarAccess.getArtifactAccess().getLanguageAssignment_3()); 
            // InternalColdLang.g:2986:2: ( rule__Artifact__LanguageAssignment_3 )
            // InternalColdLang.g:2986:3: rule__Artifact__LanguageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getLanguageAssignment_3()); 

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
    // $ANTLR end "rule__Artifact__Group__3__Impl"


    // $ANTLR start "rule__Equiv__Group__0"
    // InternalColdLang.g:2995:1: rule__Equiv__Group__0 : rule__Equiv__Group__0__Impl rule__Equiv__Group__1 ;
    public final void rule__Equiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:2999:1: ( rule__Equiv__Group__0__Impl rule__Equiv__Group__1 )
            // InternalColdLang.g:3000:2: rule__Equiv__Group__0__Impl rule__Equiv__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Equiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equiv__Group__1();

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
    // $ANTLR end "rule__Equiv__Group__0"


    // $ANTLR start "rule__Equiv__Group__0__Impl"
    // InternalColdLang.g:3007:1: rule__Equiv__Group__0__Impl : ( ruleImply ) ;
    public final void rule__Equiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3011:1: ( ( ruleImply ) )
            // InternalColdLang.g:3012:1: ( ruleImply )
            {
            // InternalColdLang.g:3012:1: ( ruleImply )
            // InternalColdLang.g:3013:2: ruleImply
            {
             before(grammarAccess.getEquivAccess().getImplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImply();

            state._fsp--;

             after(grammarAccess.getEquivAccess().getImplyParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equiv__Group__0__Impl"


    // $ANTLR start "rule__Equiv__Group__1"
    // InternalColdLang.g:3022:1: rule__Equiv__Group__1 : rule__Equiv__Group__1__Impl ;
    public final void rule__Equiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3026:1: ( rule__Equiv__Group__1__Impl )
            // InternalColdLang.g:3027:2: rule__Equiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equiv__Group__1__Impl();

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
    // $ANTLR end "rule__Equiv__Group__1"


    // $ANTLR start "rule__Equiv__Group__1__Impl"
    // InternalColdLang.g:3033:1: rule__Equiv__Group__1__Impl : ( ( rule__Equiv__Group_1__0 )* ) ;
    public final void rule__Equiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3037:1: ( ( ( rule__Equiv__Group_1__0 )* ) )
            // InternalColdLang.g:3038:1: ( ( rule__Equiv__Group_1__0 )* )
            {
            // InternalColdLang.g:3038:1: ( ( rule__Equiv__Group_1__0 )* )
            // InternalColdLang.g:3039:2: ( rule__Equiv__Group_1__0 )*
            {
             before(grammarAccess.getEquivAccess().getGroup_1()); 
            // InternalColdLang.g:3040:2: ( rule__Equiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalColdLang.g:3040:3: rule__Equiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Equiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEquivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equiv__Group__1__Impl"


    // $ANTLR start "rule__Equiv__Group_1__0"
    // InternalColdLang.g:3049:1: rule__Equiv__Group_1__0 : rule__Equiv__Group_1__0__Impl rule__Equiv__Group_1__1 ;
    public final void rule__Equiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3053:1: ( rule__Equiv__Group_1__0__Impl rule__Equiv__Group_1__1 )
            // InternalColdLang.g:3054:2: rule__Equiv__Group_1__0__Impl rule__Equiv__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Equiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equiv__Group_1__1();

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
    // $ANTLR end "rule__Equiv__Group_1__0"


    // $ANTLR start "rule__Equiv__Group_1__0__Impl"
    // InternalColdLang.g:3061:1: rule__Equiv__Group_1__0__Impl : ( () ) ;
    public final void rule__Equiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3065:1: ( ( () ) )
            // InternalColdLang.g:3066:1: ( () )
            {
            // InternalColdLang.g:3066:1: ( () )
            // InternalColdLang.g:3067:2: ()
            {
             before(grammarAccess.getEquivAccess().getEquivLeftAction_1_0()); 
            // InternalColdLang.g:3068:2: ()
            // InternalColdLang.g:3068:3: 
            {
            }

             after(grammarAccess.getEquivAccess().getEquivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equiv__Group_1__0__Impl"


    // $ANTLR start "rule__Equiv__Group_1__1"
    // InternalColdLang.g:3076:1: rule__Equiv__Group_1__1 : rule__Equiv__Group_1__1__Impl rule__Equiv__Group_1__2 ;
    public final void rule__Equiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3080:1: ( rule__Equiv__Group_1__1__Impl rule__Equiv__Group_1__2 )
            // InternalColdLang.g:3081:2: rule__Equiv__Group_1__1__Impl rule__Equiv__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Equiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equiv__Group_1__2();

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
    // $ANTLR end "rule__Equiv__Group_1__1"


    // $ANTLR start "rule__Equiv__Group_1__1__Impl"
    // InternalColdLang.g:3088:1: rule__Equiv__Group_1__1__Impl : ( '<=>' ) ;
    public final void rule__Equiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3092:1: ( ( '<=>' ) )
            // InternalColdLang.g:3093:1: ( '<=>' )
            {
            // InternalColdLang.g:3093:1: ( '<=>' )
            // InternalColdLang.g:3094:2: '<=>'
            {
             before(grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEquivAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Equiv__Group_1__1__Impl"


    // $ANTLR start "rule__Equiv__Group_1__2"
    // InternalColdLang.g:3103:1: rule__Equiv__Group_1__2 : rule__Equiv__Group_1__2__Impl ;
    public final void rule__Equiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3107:1: ( rule__Equiv__Group_1__2__Impl )
            // InternalColdLang.g:3108:2: rule__Equiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equiv__Group_1__2"


    // $ANTLR start "rule__Equiv__Group_1__2__Impl"
    // InternalColdLang.g:3114:1: rule__Equiv__Group_1__2__Impl : ( ( rule__Equiv__RightAssignment_1_2 ) ) ;
    public final void rule__Equiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3118:1: ( ( ( rule__Equiv__RightAssignment_1_2 ) ) )
            // InternalColdLang.g:3119:1: ( ( rule__Equiv__RightAssignment_1_2 ) )
            {
            // InternalColdLang.g:3119:1: ( ( rule__Equiv__RightAssignment_1_2 ) )
            // InternalColdLang.g:3120:2: ( rule__Equiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getEquivAccess().getRightAssignment_1_2()); 
            // InternalColdLang.g:3121:2: ( rule__Equiv__RightAssignment_1_2 )
            // InternalColdLang.g:3121:3: rule__Equiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEquivAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equiv__Group_1__2__Impl"


    // $ANTLR start "rule__Imply__Group__0"
    // InternalColdLang.g:3130:1: rule__Imply__Group__0 : rule__Imply__Group__0__Impl rule__Imply__Group__1 ;
    public final void rule__Imply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3134:1: ( rule__Imply__Group__0__Impl rule__Imply__Group__1 )
            // InternalColdLang.g:3135:2: rule__Imply__Group__0__Impl rule__Imply__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Imply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imply__Group__1();

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
    // $ANTLR end "rule__Imply__Group__0"


    // $ANTLR start "rule__Imply__Group__0__Impl"
    // InternalColdLang.g:3142:1: rule__Imply__Group__0__Impl : ( ruleOr ) ;
    public final void rule__Imply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3146:1: ( ( ruleOr ) )
            // InternalColdLang.g:3147:1: ( ruleOr )
            {
            // InternalColdLang.g:3147:1: ( ruleOr )
            // InternalColdLang.g:3148:2: ruleOr
            {
             before(grammarAccess.getImplyAccess().getOrParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplyAccess().getOrParserRuleCall_0()); 

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
    // $ANTLR end "rule__Imply__Group__0__Impl"


    // $ANTLR start "rule__Imply__Group__1"
    // InternalColdLang.g:3157:1: rule__Imply__Group__1 : rule__Imply__Group__1__Impl ;
    public final void rule__Imply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3161:1: ( rule__Imply__Group__1__Impl )
            // InternalColdLang.g:3162:2: rule__Imply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imply__Group__1__Impl();

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
    // $ANTLR end "rule__Imply__Group__1"


    // $ANTLR start "rule__Imply__Group__1__Impl"
    // InternalColdLang.g:3168:1: rule__Imply__Group__1__Impl : ( ( rule__Imply__Group_1__0 )* ) ;
    public final void rule__Imply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3172:1: ( ( ( rule__Imply__Group_1__0 )* ) )
            // InternalColdLang.g:3173:1: ( ( rule__Imply__Group_1__0 )* )
            {
            // InternalColdLang.g:3173:1: ( ( rule__Imply__Group_1__0 )* )
            // InternalColdLang.g:3174:2: ( rule__Imply__Group_1__0 )*
            {
             before(grammarAccess.getImplyAccess().getGroup_1()); 
            // InternalColdLang.g:3175:2: ( rule__Imply__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalColdLang.g:3175:3: rule__Imply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Imply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getImplyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Imply__Group__1__Impl"


    // $ANTLR start "rule__Imply__Group_1__0"
    // InternalColdLang.g:3184:1: rule__Imply__Group_1__0 : rule__Imply__Group_1__0__Impl rule__Imply__Group_1__1 ;
    public final void rule__Imply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3188:1: ( rule__Imply__Group_1__0__Impl rule__Imply__Group_1__1 )
            // InternalColdLang.g:3189:2: rule__Imply__Group_1__0__Impl rule__Imply__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Imply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imply__Group_1__1();

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
    // $ANTLR end "rule__Imply__Group_1__0"


    // $ANTLR start "rule__Imply__Group_1__0__Impl"
    // InternalColdLang.g:3196:1: rule__Imply__Group_1__0__Impl : ( () ) ;
    public final void rule__Imply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3200:1: ( ( () ) )
            // InternalColdLang.g:3201:1: ( () )
            {
            // InternalColdLang.g:3201:1: ( () )
            // InternalColdLang.g:3202:2: ()
            {
             before(grammarAccess.getImplyAccess().getImplyLeftAction_1_0()); 
            // InternalColdLang.g:3203:2: ()
            // InternalColdLang.g:3203:3: 
            {
            }

             after(grammarAccess.getImplyAccess().getImplyLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Imply__Group_1__0__Impl"


    // $ANTLR start "rule__Imply__Group_1__1"
    // InternalColdLang.g:3211:1: rule__Imply__Group_1__1 : rule__Imply__Group_1__1__Impl rule__Imply__Group_1__2 ;
    public final void rule__Imply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3215:1: ( rule__Imply__Group_1__1__Impl rule__Imply__Group_1__2 )
            // InternalColdLang.g:3216:2: rule__Imply__Group_1__1__Impl rule__Imply__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Imply__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Imply__Group_1__2();

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
    // $ANTLR end "rule__Imply__Group_1__1"


    // $ANTLR start "rule__Imply__Group_1__1__Impl"
    // InternalColdLang.g:3223:1: rule__Imply__Group_1__1__Impl : ( '=>' ) ;
    public final void rule__Imply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3227:1: ( ( '=>' ) )
            // InternalColdLang.g:3228:1: ( '=>' )
            {
            // InternalColdLang.g:3228:1: ( '=>' )
            // InternalColdLang.g:3229:2: '=>'
            {
             before(grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Imply__Group_1__1__Impl"


    // $ANTLR start "rule__Imply__Group_1__2"
    // InternalColdLang.g:3238:1: rule__Imply__Group_1__2 : rule__Imply__Group_1__2__Impl ;
    public final void rule__Imply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3242:1: ( rule__Imply__Group_1__2__Impl )
            // InternalColdLang.g:3243:2: rule__Imply__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Imply__Group_1__2__Impl();

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
    // $ANTLR end "rule__Imply__Group_1__2"


    // $ANTLR start "rule__Imply__Group_1__2__Impl"
    // InternalColdLang.g:3249:1: rule__Imply__Group_1__2__Impl : ( ( rule__Imply__RightAssignment_1_2 ) ) ;
    public final void rule__Imply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3253:1: ( ( ( rule__Imply__RightAssignment_1_2 ) ) )
            // InternalColdLang.g:3254:1: ( ( rule__Imply__RightAssignment_1_2 ) )
            {
            // InternalColdLang.g:3254:1: ( ( rule__Imply__RightAssignment_1_2 ) )
            // InternalColdLang.g:3255:2: ( rule__Imply__RightAssignment_1_2 )
            {
             before(grammarAccess.getImplyAccess().getRightAssignment_1_2()); 
            // InternalColdLang.g:3256:2: ( rule__Imply__RightAssignment_1_2 )
            // InternalColdLang.g:3256:3: rule__Imply__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Imply__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getImplyAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Imply__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalColdLang.g:3265:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3269:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalColdLang.g:3270:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalColdLang.g:3277:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3281:1: ( ( ruleAnd ) )
            // InternalColdLang.g:3282:1: ( ruleAnd )
            {
            // InternalColdLang.g:3282:1: ( ruleAnd )
            // InternalColdLang.g:3283:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalColdLang.g:3292:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3296:1: ( rule__Or__Group__1__Impl )
            // InternalColdLang.g:3297:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalColdLang.g:3303:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3307:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalColdLang.g:3308:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalColdLang.g:3308:1: ( ( rule__Or__Group_1__0 )* )
            // InternalColdLang.g:3309:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalColdLang.g:3310:2: ( rule__Or__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalColdLang.g:3310:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalColdLang.g:3319:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3323:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalColdLang.g:3324:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalColdLang.g:3331:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3335:1: ( ( () ) )
            // InternalColdLang.g:3336:1: ( () )
            {
            // InternalColdLang.g:3336:1: ( () )
            // InternalColdLang.g:3337:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalColdLang.g:3338:2: ()
            // InternalColdLang.g:3338:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalColdLang.g:3346:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3350:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalColdLang.g:3351:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalColdLang.g:3358:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3362:1: ( ( 'or' ) )
            // InternalColdLang.g:3363:1: ( 'or' )
            {
            // InternalColdLang.g:3363:1: ( 'or' )
            // InternalColdLang.g:3364:2: 'or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 

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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalColdLang.g:3373:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3377:1: ( rule__Or__Group_1__2__Impl )
            // InternalColdLang.g:3378:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalColdLang.g:3384:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3388:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalColdLang.g:3389:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalColdLang.g:3389:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalColdLang.g:3390:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalColdLang.g:3391:2: ( rule__Or__RightAssignment_1_2 )
            // InternalColdLang.g:3391:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalColdLang.g:3400:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3404:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalColdLang.g:3405:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalColdLang.g:3412:1: rule__And__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3416:1: ( ( rulePrimary ) )
            // InternalColdLang.g:3417:1: ( rulePrimary )
            {
            // InternalColdLang.g:3417:1: ( rulePrimary )
            // InternalColdLang.g:3418:2: rulePrimary
            {
             before(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalColdLang.g:3427:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3431:1: ( rule__And__Group__1__Impl )
            // InternalColdLang.g:3432:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalColdLang.g:3438:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3442:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalColdLang.g:3443:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalColdLang.g:3443:1: ( ( rule__And__Group_1__0 )* )
            // InternalColdLang.g:3444:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalColdLang.g:3445:2: ( rule__And__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalColdLang.g:3445:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalColdLang.g:3454:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3458:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalColdLang.g:3459:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalColdLang.g:3466:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3470:1: ( ( () ) )
            // InternalColdLang.g:3471:1: ( () )
            {
            // InternalColdLang.g:3471:1: ( () )
            // InternalColdLang.g:3472:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalColdLang.g:3473:2: ()
            // InternalColdLang.g:3473:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalColdLang.g:3481:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3485:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalColdLang.g:3486:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalColdLang.g:3493:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3497:1: ( ( 'and' ) )
            // InternalColdLang.g:3498:1: ( 'and' )
            {
            // InternalColdLang.g:3498:1: ( 'and' )
            // InternalColdLang.g:3499:2: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalColdLang.g:3508:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3512:1: ( rule__And__Group_1__2__Impl )
            // InternalColdLang.g:3513:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalColdLang.g:3519:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3523:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalColdLang.g:3524:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalColdLang.g:3524:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalColdLang.g:3525:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalColdLang.g:3526:2: ( rule__And__RightAssignment_1_2 )
            // InternalColdLang.g:3526:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalColdLang.g:3535:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3539:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalColdLang.g:3540:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalColdLang.g:3547:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3551:1: ( ( '(' ) )
            // InternalColdLang.g:3552:1: ( '(' )
            {
            // InternalColdLang.g:3552:1: ( '(' )
            // InternalColdLang.g:3553:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalColdLang.g:3562:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3566:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalColdLang.g:3567:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalColdLang.g:3574:1: rule__Primary__Group_0__1__Impl : ( ruleCondition ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3578:1: ( ( ruleCondition ) )
            // InternalColdLang.g:3579:1: ( ruleCondition )
            {
            // InternalColdLang.g:3579:1: ( ruleCondition )
            // InternalColdLang.g:3580:2: ruleCondition
            {
             before(grammarAccess.getPrimaryAccess().getConditionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getConditionParserRuleCall_0_1()); 

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
    // InternalColdLang.g:3589:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3593:1: ( rule__Primary__Group_0__2__Impl )
            // InternalColdLang.g:3594:2: rule__Primary__Group_0__2__Impl
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
    // InternalColdLang.g:3600:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3604:1: ( ( ')' ) )
            // InternalColdLang.g:3605:1: ( ')' )
            {
            // InternalColdLang.g:3605:1: ( ')' )
            // InternalColdLang.g:3606:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalColdLang.g:3616:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3620:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalColdLang.g:3621:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalColdLang.g:3628:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3632:1: ( ( () ) )
            // InternalColdLang.g:3633:1: ( () )
            {
            // InternalColdLang.g:3633:1: ( () )
            // InternalColdLang.g:3634:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalColdLang.g:3635:2: ()
            // InternalColdLang.g:3635:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalColdLang.g:3643:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3647:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalColdLang.g:3648:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalColdLang.g:3655:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3659:1: ( ( '!' ) )
            // InternalColdLang.g:3660:1: ( '!' )
            {
            // InternalColdLang.g:3660:1: ( '!' )
            // InternalColdLang.g:3661:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalColdLang.g:3670:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3674:1: ( rule__Primary__Group_1__2__Impl )
            // InternalColdLang.g:3675:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalColdLang.g:3681:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__NextAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3685:1: ( ( ( rule__Primary__NextAssignment_1_2 ) ) )
            // InternalColdLang.g:3686:1: ( ( rule__Primary__NextAssignment_1_2 ) )
            {
            // InternalColdLang.g:3686:1: ( ( rule__Primary__NextAssignment_1_2 ) )
            // InternalColdLang.g:3687:2: ( rule__Primary__NextAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getNextAssignment_1_2()); 
            // InternalColdLang.g:3688:2: ( rule__Primary__NextAssignment_1_2 )
            // InternalColdLang.g:3688:3: rule__Primary__NextAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__NextAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getNextAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalColdLang.g:3697:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3701:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalColdLang.g:3702:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalColdLang.g:3709:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3713:1: ( ( () ) )
            // InternalColdLang.g:3714:1: ( () )
            {
            // InternalColdLang.g:3714:1: ( () )
            // InternalColdLang.g:3715:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getVariableAction_2_0()); 
            // InternalColdLang.g:3716:2: ()
            // InternalColdLang.g:3716:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getVariableAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalColdLang.g:3724:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3728:1: ( rule__Primary__Group_2__1__Impl )
            // InternalColdLang.g:3729:2: rule__Primary__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalColdLang.g:3735:1: rule__Primary__Group_2__1__Impl : ( ( rule__Primary__RefAssignment_2_1 ) ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3739:1: ( ( ( rule__Primary__RefAssignment_2_1 ) ) )
            // InternalColdLang.g:3740:1: ( ( rule__Primary__RefAssignment_2_1 ) )
            {
            // InternalColdLang.g:3740:1: ( ( rule__Primary__RefAssignment_2_1 ) )
            // InternalColdLang.g:3741:2: ( rule__Primary__RefAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryAccess().getRefAssignment_2_1()); 
            // InternalColdLang.g:3742:2: ( rule__Primary__RefAssignment_2_1 )
            // InternalColdLang.g:3742:3: rule__Primary__RefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getRefAssignment_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__IDS__Group__0"
    // InternalColdLang.g:3751:1: rule__IDS__Group__0 : rule__IDS__Group__0__Impl rule__IDS__Group__1 ;
    public final void rule__IDS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3755:1: ( rule__IDS__Group__0__Impl rule__IDS__Group__1 )
            // InternalColdLang.g:3756:2: rule__IDS__Group__0__Impl rule__IDS__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__IDS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDS__Group__1();

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
    // $ANTLR end "rule__IDS__Group__0"


    // $ANTLR start "rule__IDS__Group__0__Impl"
    // InternalColdLang.g:3763:1: rule__IDS__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__IDS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3767:1: ( ( RULE_ID ) )
            // InternalColdLang.g:3768:1: ( RULE_ID )
            {
            // InternalColdLang.g:3768:1: ( RULE_ID )
            // InternalColdLang.g:3769:2: RULE_ID
            {
             before(grammarAccess.getIDSAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIDSAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IDS__Group__0__Impl"


    // $ANTLR start "rule__IDS__Group__1"
    // InternalColdLang.g:3778:1: rule__IDS__Group__1 : rule__IDS__Group__1__Impl ;
    public final void rule__IDS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3782:1: ( rule__IDS__Group__1__Impl )
            // InternalColdLang.g:3783:2: rule__IDS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IDS__Group__1__Impl();

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
    // $ANTLR end "rule__IDS__Group__1"


    // $ANTLR start "rule__IDS__Group__1__Impl"
    // InternalColdLang.g:3789:1: rule__IDS__Group__1__Impl : ( ( rule__IDS__Group_1__0 )* ) ;
    public final void rule__IDS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3793:1: ( ( ( rule__IDS__Group_1__0 )* ) )
            // InternalColdLang.g:3794:1: ( ( rule__IDS__Group_1__0 )* )
            {
            // InternalColdLang.g:3794:1: ( ( rule__IDS__Group_1__0 )* )
            // InternalColdLang.g:3795:2: ( rule__IDS__Group_1__0 )*
            {
             before(grammarAccess.getIDSAccess().getGroup_1()); 
            // InternalColdLang.g:3796:2: ( rule__IDS__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==35) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalColdLang.g:3796:3: rule__IDS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__IDS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getIDSAccess().getGroup_1()); 

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
    // $ANTLR end "rule__IDS__Group__1__Impl"


    // $ANTLR start "rule__IDS__Group_1__0"
    // InternalColdLang.g:3805:1: rule__IDS__Group_1__0 : rule__IDS__Group_1__0__Impl rule__IDS__Group_1__1 ;
    public final void rule__IDS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3809:1: ( rule__IDS__Group_1__0__Impl rule__IDS__Group_1__1 )
            // InternalColdLang.g:3810:2: rule__IDS__Group_1__0__Impl rule__IDS__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__IDS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IDS__Group_1__1();

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
    // $ANTLR end "rule__IDS__Group_1__0"


    // $ANTLR start "rule__IDS__Group_1__0__Impl"
    // InternalColdLang.g:3817:1: rule__IDS__Group_1__0__Impl : ( '.' ) ;
    public final void rule__IDS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3821:1: ( ( '.' ) )
            // InternalColdLang.g:3822:1: ( '.' )
            {
            // InternalColdLang.g:3822:1: ( '.' )
            // InternalColdLang.g:3823:2: '.'
            {
             before(grammarAccess.getIDSAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIDSAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__IDS__Group_1__0__Impl"


    // $ANTLR start "rule__IDS__Group_1__1"
    // InternalColdLang.g:3832:1: rule__IDS__Group_1__1 : rule__IDS__Group_1__1__Impl ;
    public final void rule__IDS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3836:1: ( rule__IDS__Group_1__1__Impl )
            // InternalColdLang.g:3837:2: rule__IDS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IDS__Group_1__1__Impl();

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
    // $ANTLR end "rule__IDS__Group_1__1"


    // $ANTLR start "rule__IDS__Group_1__1__Impl"
    // InternalColdLang.g:3843:1: rule__IDS__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__IDS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3847:1: ( ( RULE_ID ) )
            // InternalColdLang.g:3848:1: ( RULE_ID )
            {
            // InternalColdLang.g:3848:1: ( RULE_ID )
            // InternalColdLang.g:3849:2: RULE_ID
            {
             before(grammarAccess.getIDSAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIDSAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__IDS__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ConcernsAssignment_0"
    // InternalColdLang.g:3859:1: rule__Model__ConcernsAssignment_0 : ( ruleConcern ) ;
    public final void rule__Model__ConcernsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3863:1: ( ( ruleConcern ) )
            // InternalColdLang.g:3864:2: ( ruleConcern )
            {
            // InternalColdLang.g:3864:2: ( ruleConcern )
            // InternalColdLang.g:3865:3: ruleConcern
            {
             before(grammarAccess.getModelAccess().getConcernsConcernParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConcern();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConcernsConcernParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ConcernsAssignment_0"


    // $ANTLR start "rule__Model__LanguagesAssignment_1"
    // InternalColdLang.g:3874:1: rule__Model__LanguagesAssignment_1 : ( ruleLanguage ) ;
    public final void rule__Model__LanguagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3878:1: ( ( ruleLanguage ) )
            // InternalColdLang.g:3879:2: ( ruleLanguage )
            {
            // InternalColdLang.g:3879:2: ( ruleLanguage )
            // InternalColdLang.g:3880:3: ruleLanguage
            {
             before(grammarAccess.getModelAccess().getLanguagesLanguageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLanguagesLanguageParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__LanguagesAssignment_1"


    // $ANTLR start "rule__Model__PerspectivesAssignment_2"
    // InternalColdLang.g:3889:1: rule__Model__PerspectivesAssignment_2 : ( rulePerspective ) ;
    public final void rule__Model__PerspectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3893:1: ( ( rulePerspective ) )
            // InternalColdLang.g:3894:2: ( rulePerspective )
            {
            // InternalColdLang.g:3894:2: ( rulePerspective )
            // InternalColdLang.g:3895:3: rulePerspective
            {
             before(grammarAccess.getModelAccess().getPerspectivesPerspectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerspective();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPerspectivesPerspectiveParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__PerspectivesAssignment_2"


    // $ANTLR start "rule__Concern__NameAssignment_1"
    // InternalColdLang.g:3904:1: rule__Concern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Concern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3908:1: ( ( RULE_ID ) )
            // InternalColdLang.g:3909:2: ( RULE_ID )
            {
            // InternalColdLang.g:3909:2: ( RULE_ID )
            // InternalColdLang.g:3910:3: RULE_ID
            {
             before(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Concern__NameAssignment_1"


    // $ANTLR start "rule__Concern__ImportedAssignment_3_1"
    // InternalColdLang.g:3919:1: rule__Concern__ImportedAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Concern__ImportedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3923:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:3924:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:3924:2: ( ( RULE_ID ) )
            // InternalColdLang.g:3925:3: ( RULE_ID )
            {
             before(grammarAccess.getConcernAccess().getImportedPerspectiveCrossReference_3_1_0()); 
            // InternalColdLang.g:3926:3: ( RULE_ID )
            // InternalColdLang.g:3927:4: RULE_ID
            {
             before(grammarAccess.getConcernAccess().getImportedPerspectiveIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcernAccess().getImportedPerspectiveIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConcernAccess().getImportedPerspectiveCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Concern__ImportedAssignment_3_1"


    // $ANTLR start "rule__Concern__FacetsAssignment_4_0"
    // InternalColdLang.g:3938:1: rule__Concern__FacetsAssignment_4_0 : ( ruleFacet ) ;
    public final void rule__Concern__FacetsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3942:1: ( ( ruleFacet ) )
            // InternalColdLang.g:3943:2: ( ruleFacet )
            {
            // InternalColdLang.g:3943:2: ( ruleFacet )
            // InternalColdLang.g:3944:3: ruleFacet
            {
             before(grammarAccess.getConcernAccess().getFacetsFacetParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFacet();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getFacetsFacetParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Concern__FacetsAssignment_4_0"


    // $ANTLR start "rule__Concern__ArtifactAssignment_4_1"
    // InternalColdLang.g:3953:1: rule__Concern__ArtifactAssignment_4_1 : ( ruleArtifact ) ;
    public final void rule__Concern__ArtifactAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3957:1: ( ( ruleArtifact ) )
            // InternalColdLang.g:3958:2: ( ruleArtifact )
            {
            // InternalColdLang.g:3958:2: ( ruleArtifact )
            // InternalColdLang.g:3959:3: ruleArtifact
            {
             before(grammarAccess.getConcernAccess().getArtifactArtifactParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getArtifactArtifactParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Concern__ArtifactAssignment_4_1"


    // $ANTLR start "rule__Concern__FmAssignment_5"
    // InternalColdLang.g:3968:1: rule__Concern__FmAssignment_5 : ( ruleFeatureModel ) ;
    public final void rule__Concern__FmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3972:1: ( ( ruleFeatureModel ) )
            // InternalColdLang.g:3973:2: ( ruleFeatureModel )
            {
            // InternalColdLang.g:3973:2: ( ruleFeatureModel )
            // InternalColdLang.g:3974:3: ruleFeatureModel
            {
             before(grammarAccess.getConcernAccess().getFmFeatureModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getConcernAccess().getFmFeatureModelParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Concern__FmAssignment_5"


    // $ANTLR start "rule__OneOf__OptionalAssignment_1"
    // InternalColdLang.g:3983:1: rule__OneOf__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__OneOf__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:3987:1: ( ( ( '?' ) ) )
            // InternalColdLang.g:3988:2: ( ( '?' ) )
            {
            // InternalColdLang.g:3988:2: ( ( '?' ) )
            // InternalColdLang.g:3989:3: ( '?' )
            {
             before(grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0()); 
            // InternalColdLang.g:3990:3: ( '?' )
            // InternalColdLang.g:3991:4: '?'
            {
             before(grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0()); 

            }

             after(grammarAccess.getOneOfAccess().getOptionalQuestionMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__OneOf__OptionalAssignment_1"


    // $ANTLR start "rule__OneOf__NameAssignment_3"
    // InternalColdLang.g:4002:1: rule__OneOf__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__OneOf__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4006:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4007:2: ( RULE_ID )
            {
            // InternalColdLang.g:4007:2: ( RULE_ID )
            // InternalColdLang.g:4008:3: RULE_ID
            {
             before(grammarAccess.getOneOfAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOneOfAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__OneOf__NameAssignment_3"


    // $ANTLR start "rule__OneOf__ChildrenAssignment_5_1"
    // InternalColdLang.g:4017:1: rule__OneOf__ChildrenAssignment_5_1 : ( ruleFeatureModel ) ;
    public final void rule__OneOf__ChildrenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4021:1: ( ( ruleFeatureModel ) )
            // InternalColdLang.g:4022:2: ( ruleFeatureModel )
            {
            // InternalColdLang.g:4022:2: ( ruleFeatureModel )
            // InternalColdLang.g:4023:3: ruleFeatureModel
            {
             before(grammarAccess.getOneOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getOneOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__OneOf__ChildrenAssignment_5_1"


    // $ANTLR start "rule__OneOf__ConditionAssignment_7"
    // InternalColdLang.g:4032:1: rule__OneOf__ConditionAssignment_7 : ( ruleCondition ) ;
    public final void rule__OneOf__ConditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4036:1: ( ( ruleCondition ) )
            // InternalColdLang.g:4037:2: ( ruleCondition )
            {
            // InternalColdLang.g:4037:2: ( ruleCondition )
            // InternalColdLang.g:4038:3: ruleCondition
            {
             before(grammarAccess.getOneOfAccess().getConditionConditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getOneOfAccess().getConditionConditionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__OneOf__ConditionAssignment_7"


    // $ANTLR start "rule__SomeOf__OptionalAssignment_1"
    // InternalColdLang.g:4047:1: rule__SomeOf__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__SomeOf__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4051:1: ( ( ( '?' ) ) )
            // InternalColdLang.g:4052:2: ( ( '?' ) )
            {
            // InternalColdLang.g:4052:2: ( ( '?' ) )
            // InternalColdLang.g:4053:3: ( '?' )
            {
             before(grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0()); 
            // InternalColdLang.g:4054:3: ( '?' )
            // InternalColdLang.g:4055:4: '?'
            {
             before(grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0()); 

            }

             after(grammarAccess.getSomeOfAccess().getOptionalQuestionMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__SomeOf__OptionalAssignment_1"


    // $ANTLR start "rule__SomeOf__NameAssignment_3"
    // InternalColdLang.g:4066:1: rule__SomeOf__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SomeOf__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4070:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4071:2: ( RULE_ID )
            {
            // InternalColdLang.g:4071:2: ( RULE_ID )
            // InternalColdLang.g:4072:3: RULE_ID
            {
             before(grammarAccess.getSomeOfAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSomeOfAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SomeOf__NameAssignment_3"


    // $ANTLR start "rule__SomeOf__ChildrenAssignment_5_1"
    // InternalColdLang.g:4081:1: rule__SomeOf__ChildrenAssignment_5_1 : ( ruleFeatureModel ) ;
    public final void rule__SomeOf__ChildrenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4085:1: ( ( ruleFeatureModel ) )
            // InternalColdLang.g:4086:2: ( ruleFeatureModel )
            {
            // InternalColdLang.g:4086:2: ( ruleFeatureModel )
            // InternalColdLang.g:4087:3: ruleFeatureModel
            {
             before(grammarAccess.getSomeOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getSomeOfAccess().getChildrenFeatureModelParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SomeOf__ChildrenAssignment_5_1"


    // $ANTLR start "rule__SomeOf__ConditionAssignment_7"
    // InternalColdLang.g:4096:1: rule__SomeOf__ConditionAssignment_7 : ( ruleCondition ) ;
    public final void rule__SomeOf__ConditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4100:1: ( ( ruleCondition ) )
            // InternalColdLang.g:4101:2: ( ruleCondition )
            {
            // InternalColdLang.g:4101:2: ( ruleCondition )
            // InternalColdLang.g:4102:3: ruleCondition
            {
             before(grammarAccess.getSomeOfAccess().getConditionConditionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSomeOfAccess().getConditionConditionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SomeOf__ConditionAssignment_7"


    // $ANTLR start "rule__Feature__OptionalAssignment_1"
    // InternalColdLang.g:4111:1: rule__Feature__OptionalAssignment_1 : ( ( '?' ) ) ;
    public final void rule__Feature__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4115:1: ( ( ( '?' ) ) )
            // InternalColdLang.g:4116:2: ( ( '?' ) )
            {
            // InternalColdLang.g:4116:2: ( ( '?' ) )
            // InternalColdLang.g:4117:3: ( '?' )
            {
             before(grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0()); 
            // InternalColdLang.g:4118:3: ( '?' )
            // InternalColdLang.g:4119:4: '?'
            {
             before(grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getOptionalQuestionMarkKeyword_1_0()); 

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
    // $ANTLR end "rule__Feature__OptionalAssignment_1"


    // $ANTLR start "rule__Feature__NameAssignment_3"
    // InternalColdLang.g:4130:1: rule__Feature__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4134:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4135:2: ( RULE_ID )
            {
            // InternalColdLang.g:4135:2: ( RULE_ID )
            // InternalColdLang.g:4136:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_3"


    // $ANTLR start "rule__Feature__ConditionAssignment_4"
    // InternalColdLang.g:4145:1: rule__Feature__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Feature__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4149:1: ( ( ruleCondition ) )
            // InternalColdLang.g:4150:2: ( ruleCondition )
            {
            // InternalColdLang.g:4150:2: ( ruleCondition )
            // InternalColdLang.g:4151:3: ruleCondition
            {
             before(grammarAccess.getFeatureAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getConditionConditionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Feature__ConditionAssignment_4"


    // $ANTLR start "rule__Language__NameAssignment_1"
    // InternalColdLang.g:4160:1: rule__Language__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4164:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4165:2: ( RULE_ID )
            {
            // InternalColdLang.g:4165:2: ( RULE_ID )
            // InternalColdLang.g:4166:3: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Language__NameAssignment_1"


    // $ANTLR start "rule__Language__OperatorsAssignment_3"
    // InternalColdLang.g:4175:1: rule__Language__OperatorsAssignment_3 : ( ruleLanguageOperator ) ;
    public final void rule__Language__OperatorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4179:1: ( ( ruleLanguageOperator ) )
            // InternalColdLang.g:4180:2: ( ruleLanguageOperator )
            {
            // InternalColdLang.g:4180:2: ( ruleLanguageOperator )
            // InternalColdLang.g:4181:3: ruleLanguageOperator
            {
             before(grammarAccess.getLanguageAccess().getOperatorsLanguageOperatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageOperator();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getOperatorsLanguageOperatorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Language__OperatorsAssignment_3"


    // $ANTLR start "rule__LanguageOperator__NameAssignment_0"
    // InternalColdLang.g:4190:1: rule__LanguageOperator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LanguageOperator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4194:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4195:2: ( RULE_ID )
            {
            // InternalColdLang.g:4195:2: ( RULE_ID )
            // InternalColdLang.g:4196:3: RULE_ID
            {
             before(grammarAccess.getLanguageOperatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__LanguageOperator__NameAssignment_0"


    // $ANTLR start "rule__LanguageOperator__TypeAssignment_2"
    // InternalColdLang.g:4205:1: rule__LanguageOperator__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LanguageOperator__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4209:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4210:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4210:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4211:3: ( RULE_ID )
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypeLanguageCrossReference_2_0()); 
            // InternalColdLang.g:4212:3: ( RULE_ID )
            // InternalColdLang.g:4213:4: RULE_ID
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypeLanguageIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getTypeLanguageIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLanguageOperatorAccess().getTypeLanguageCrossReference_2_0()); 

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
    // $ANTLR end "rule__LanguageOperator__TypeAssignment_2"


    // $ANTLR start "rule__LanguageOperator__TypesAssignment_3_1"
    // InternalColdLang.g:4224:1: rule__LanguageOperator__TypesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__LanguageOperator__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4228:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4229:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4229:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4230:3: ( RULE_ID )
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypesLanguageCrossReference_3_1_0()); 
            // InternalColdLang.g:4231:3: ( RULE_ID )
            // InternalColdLang.g:4232:4: RULE_ID
            {
             before(grammarAccess.getLanguageOperatorAccess().getTypesLanguageIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getTypesLanguageIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLanguageOperatorAccess().getTypesLanguageCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__LanguageOperator__TypesAssignment_3_1"


    // $ANTLR start "rule__LanguageOperator__DescriptionAssignment_5"
    // InternalColdLang.g:4243:1: rule__LanguageOperator__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LanguageOperator__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4247:1: ( ( RULE_STRING ) )
            // InternalColdLang.g:4248:2: ( RULE_STRING )
            {
            // InternalColdLang.g:4248:2: ( RULE_STRING )
            // InternalColdLang.g:4249:3: RULE_STRING
            {
             before(grammarAccess.getLanguageOperatorAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageOperatorAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__LanguageOperator__DescriptionAssignment_5"


    // $ANTLR start "rule__Perspective__NameAssignment_1"
    // InternalColdLang.g:4258:1: rule__Perspective__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Perspective__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4262:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4263:2: ( RULE_ID )
            {
            // InternalColdLang.g:4263:2: ( RULE_ID )
            // InternalColdLang.g:4264:3: RULE_ID
            {
             before(grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Perspective__NameAssignment_1"


    // $ANTLR start "rule__Perspective__LanguagesAssignment_3"
    // InternalColdLang.g:4273:1: rule__Perspective__LanguagesAssignment_3 : ( rulePerspectiveLanguage ) ;
    public final void rule__Perspective__LanguagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4277:1: ( ( rulePerspectiveLanguage ) )
            // InternalColdLang.g:4278:2: ( rulePerspectiveLanguage )
            {
            // InternalColdLang.g:4278:2: ( rulePerspectiveLanguage )
            // InternalColdLang.g:4279:3: rulePerspectiveLanguage
            {
             before(grammarAccess.getPerspectiveAccess().getLanguagesPerspectiveLanguageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerspectiveLanguage();

            state._fsp--;

             after(grammarAccess.getPerspectiveAccess().getLanguagesPerspectiveLanguageParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Perspective__LanguagesAssignment_3"


    // $ANTLR start "rule__PerspectiveLanguage__NameAssignment_0"
    // InternalColdLang.g:4288:1: rule__PerspectiveLanguage__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__PerspectiveLanguage__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4292:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4293:2: ( RULE_ID )
            {
            // InternalColdLang.g:4293:2: ( RULE_ID )
            // InternalColdLang.g:4294:3: RULE_ID
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveLanguageAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__NameAssignment_0"


    // $ANTLR start "rule__PerspectiveLanguage__LanguageAssignment_2"
    // InternalColdLang.g:4303:1: rule__PerspectiveLanguage__LanguageAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PerspectiveLanguage__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4307:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4308:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4308:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4309:3: ( RULE_ID )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageCrossReference_2_0()); 
            // InternalColdLang.g:4310:3: ( RULE_ID )
            // InternalColdLang.g:4311:4: RULE_ID
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPerspectiveLanguageAccess().getLanguageLanguageCrossReference_2_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__LanguageAssignment_2"


    // $ANTLR start "rule__PerspectiveLanguage__OperatorAssignment_3_0"
    // InternalColdLang.g:4322:1: rule__PerspectiveLanguage__OperatorAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__PerspectiveLanguage__OperatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4326:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4327:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4327:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4328:3: ( RULE_ID )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorCrossReference_3_0_0()); 
            // InternalColdLang.g:4329:3: ( RULE_ID )
            // InternalColdLang.g:4330:4: RULE_ID
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getPerspectiveLanguageAccess().getOperatorLanguageOperatorCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__OperatorAssignment_3_0"


    // $ANTLR start "rule__PerspectiveLanguage__PerspectiveAssignment_3_1"
    // InternalColdLang.g:4341:1: rule__PerspectiveLanguage__PerspectiveAssignment_3_1 : ( ( ruleIDS ) ) ;
    public final void rule__PerspectiveLanguage__PerspectiveAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4345:1: ( ( ( ruleIDS ) ) )
            // InternalColdLang.g:4346:2: ( ( ruleIDS ) )
            {
            // InternalColdLang.g:4346:2: ( ( ruleIDS ) )
            // InternalColdLang.g:4347:3: ( ruleIDS )
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageCrossReference_3_1_0()); 
            // InternalColdLang.g:4348:3: ( ruleIDS )
            // InternalColdLang.g:4349:4: ruleIDS
            {
             before(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageIDSParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleIDS();

            state._fsp--;

             after(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageIDSParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPerspectiveLanguageAccess().getPerspectivePerspectiveLanguageCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__PerspectiveLanguage__PerspectiveAssignment_3_1"


    // $ANTLR start "rule__Facet__NameAssignment_1"
    // InternalColdLang.g:4360:1: rule__Facet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Facet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4364:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4365:2: ( RULE_ID )
            {
            // InternalColdLang.g:4365:2: ( RULE_ID )
            // InternalColdLang.g:4366:3: RULE_ID
            {
             before(grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Facet__NameAssignment_1"


    // $ANTLR start "rule__Facet__PerspectiveAssignment_3"
    // InternalColdLang.g:4375:1: rule__Facet__PerspectiveAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Facet__PerspectiveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4379:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4380:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4380:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4381:3: ( RULE_ID )
            {
             before(grammarAccess.getFacetAccess().getPerspectivePerspectiveCrossReference_3_0()); 
            // InternalColdLang.g:4382:3: ( RULE_ID )
            // InternalColdLang.g:4383:4: RULE_ID
            {
             before(grammarAccess.getFacetAccess().getPerspectivePerspectiveIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFacetAccess().getPerspectivePerspectiveIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFacetAccess().getPerspectivePerspectiveCrossReference_3_0()); 

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
    // $ANTLR end "rule__Facet__PerspectiveAssignment_3"


    // $ANTLR start "rule__Facet__ActivationAssignment_6"
    // InternalColdLang.g:4394:1: rule__Facet__ActivationAssignment_6 : ( ruleCondition ) ;
    public final void rule__Facet__ActivationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4398:1: ( ( ruleCondition ) )
            // InternalColdLang.g:4399:2: ( ruleCondition )
            {
            // InternalColdLang.g:4399:2: ( ruleCondition )
            // InternalColdLang.g:4400:3: ruleCondition
            {
             before(grammarAccess.getFacetAccess().getActivationConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getFacetAccess().getActivationConditionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Facet__ActivationAssignment_6"


    // $ANTLR start "rule__Facet__CompositionsAssignment_7"
    // InternalColdLang.g:4409:1: rule__Facet__CompositionsAssignment_7 : ( ruleFacetComposition ) ;
    public final void rule__Facet__CompositionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4413:1: ( ( ruleFacetComposition ) )
            // InternalColdLang.g:4414:2: ( ruleFacetComposition )
            {
            // InternalColdLang.g:4414:2: ( ruleFacetComposition )
            // InternalColdLang.g:4415:3: ruleFacetComposition
            {
             before(grammarAccess.getFacetAccess().getCompositionsFacetCompositionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFacetComposition();

            state._fsp--;

             after(grammarAccess.getFacetAccess().getCompositionsFacetCompositionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Facet__CompositionsAssignment_7"


    // $ANTLR start "rule__FacetComposition__PerspectiveLanguageAssignment_0"
    // InternalColdLang.g:4424:1: rule__FacetComposition__PerspectiveLanguageAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FacetComposition__PerspectiveLanguageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4428:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4429:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4429:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4430:3: ( RULE_ID )
            {
             before(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageCrossReference_0_0()); 
            // InternalColdLang.g:4431:3: ( RULE_ID )
            // InternalColdLang.g:4432:4: RULE_ID
            {
             before(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFacetCompositionAccess().getPerspectiveLanguagePerspectiveLanguageCrossReference_0_0()); 

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
    // $ANTLR end "rule__FacetComposition__PerspectiveLanguageAssignment_0"


    // $ANTLR start "rule__FacetComposition__ApplicationAssignment_2"
    // InternalColdLang.g:4443:1: rule__FacetComposition__ApplicationAssignment_2 : ( ruleApplication ) ;
    public final void rule__FacetComposition__ApplicationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4447:1: ( ( ruleApplication ) )
            // InternalColdLang.g:4448:2: ( ruleApplication )
            {
            // InternalColdLang.g:4448:2: ( ruleApplication )
            // InternalColdLang.g:4449:3: ruleApplication
            {
             before(grammarAccess.getFacetCompositionAccess().getApplicationApplicationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getFacetCompositionAccess().getApplicationApplicationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FacetComposition__ApplicationAssignment_2"


    // $ANTLR start "rule__Application__ArtifactAssignment_0_1"
    // InternalColdLang.g:4458:1: rule__Application__ArtifactAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Application__ArtifactAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4462:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4463:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4463:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4464:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getArtifactArtifactCrossReference_0_1_0()); 
            // InternalColdLang.g:4465:3: ( RULE_ID )
            // InternalColdLang.g:4466:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getArtifactArtifactIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getArtifactArtifactIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getArtifactArtifactCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__Application__ArtifactAssignment_0_1"


    // $ANTLR start "rule__Application__LanguageOperatorAssignment_1_1"
    // InternalColdLang.g:4477:1: rule__Application__LanguageOperatorAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Application__LanguageOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4481:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4482:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4482:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4483:3: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorCrossReference_1_1_0()); 
            // InternalColdLang.g:4484:3: ( RULE_ID )
            // InternalColdLang.g:4485:4: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getLanguageOperatorLanguageOperatorCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Application__LanguageOperatorAssignment_1_1"


    // $ANTLR start "rule__Application__ApplicationsAssignment_1_3"
    // InternalColdLang.g:4496:1: rule__Application__ApplicationsAssignment_1_3 : ( ruleApplication ) ;
    public final void rule__Application__ApplicationsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4500:1: ( ( ruleApplication ) )
            // InternalColdLang.g:4501:2: ( ruleApplication )
            {
            // InternalColdLang.g:4501:2: ( ruleApplication )
            // InternalColdLang.g:4502:3: ruleApplication
            {
             before(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Application__ApplicationsAssignment_1_3"


    // $ANTLR start "rule__Application__ApplicationsAssignment_1_4_1"
    // InternalColdLang.g:4511:1: rule__Application__ApplicationsAssignment_1_4_1 : ( ruleApplication ) ;
    public final void rule__Application__ApplicationsAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4515:1: ( ( ruleApplication ) )
            // InternalColdLang.g:4516:2: ( ruleApplication )
            {
            // InternalColdLang.g:4516:2: ( ruleApplication )
            // InternalColdLang.g:4517:3: ruleApplication
            {
             before(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getApplicationsApplicationParserRuleCall_1_4_1_0()); 

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
    // $ANTLR end "rule__Application__ApplicationsAssignment_1_4_1"


    // $ANTLR start "rule__Artifact__NameAssignment_1"
    // InternalColdLang.g:4526:1: rule__Artifact__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Artifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4530:1: ( ( RULE_ID ) )
            // InternalColdLang.g:4531:2: ( RULE_ID )
            {
            // InternalColdLang.g:4531:2: ( RULE_ID )
            // InternalColdLang.g:4532:3: RULE_ID
            {
             before(grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Artifact__NameAssignment_1"


    // $ANTLR start "rule__Artifact__LanguageAssignment_3"
    // InternalColdLang.g:4541:1: rule__Artifact__LanguageAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Artifact__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4545:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4546:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4546:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4547:3: ( RULE_ID )
            {
             before(grammarAccess.getArtifactAccess().getLanguageLanguageCrossReference_3_0()); 
            // InternalColdLang.g:4548:3: ( RULE_ID )
            // InternalColdLang.g:4549:4: RULE_ID
            {
             before(grammarAccess.getArtifactAccess().getLanguageLanguageIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getLanguageLanguageIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArtifactAccess().getLanguageLanguageCrossReference_3_0()); 

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
    // $ANTLR end "rule__Artifact__LanguageAssignment_3"


    // $ANTLR start "rule__Equiv__RightAssignment_1_2"
    // InternalColdLang.g:4560:1: rule__Equiv__RightAssignment_1_2 : ( ruleImply ) ;
    public final void rule__Equiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4564:1: ( ( ruleImply ) )
            // InternalColdLang.g:4565:2: ( ruleImply )
            {
            // InternalColdLang.g:4565:2: ( ruleImply )
            // InternalColdLang.g:4566:3: ruleImply
            {
             before(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImply();

            state._fsp--;

             after(grammarAccess.getEquivAccess().getRightImplyParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equiv__RightAssignment_1_2"


    // $ANTLR start "rule__Imply__RightAssignment_1_2"
    // InternalColdLang.g:4575:1: rule__Imply__RightAssignment_1_2 : ( ruleOr ) ;
    public final void rule__Imply__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4579:1: ( ( ruleOr ) )
            // InternalColdLang.g:4580:2: ( ruleOr )
            {
            // InternalColdLang.g:4580:2: ( ruleOr )
            // InternalColdLang.g:4581:3: ruleOr
            {
             before(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getImplyAccess().getRightOrParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Imply__RightAssignment_1_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalColdLang.g:4590:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4594:1: ( ( ruleAnd ) )
            // InternalColdLang.g:4595:2: ( ruleAnd )
            {
            // InternalColdLang.g:4595:2: ( ruleAnd )
            // InternalColdLang.g:4596:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalColdLang.g:4605:1: rule__And__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4609:1: ( ( rulePrimary ) )
            // InternalColdLang.g:4610:2: ( rulePrimary )
            {
            // InternalColdLang.g:4610:2: ( rulePrimary )
            // InternalColdLang.g:4611:3: rulePrimary
            {
             before(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__NextAssignment_1_2"
    // InternalColdLang.g:4620:1: rule__Primary__NextAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4624:1: ( ( rulePrimary ) )
            // InternalColdLang.g:4625:2: ( rulePrimary )
            {
            // InternalColdLang.g:4625:2: ( rulePrimary )
            // InternalColdLang.g:4626:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getNextPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getNextPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__NextAssignment_1_2"


    // $ANTLR start "rule__Primary__RefAssignment_2_1"
    // InternalColdLang.g:4635:1: rule__Primary__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Primary__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalColdLang.g:4639:1: ( ( ( RULE_ID ) ) )
            // InternalColdLang.g:4640:2: ( ( RULE_ID ) )
            {
            // InternalColdLang.g:4640:2: ( ( RULE_ID ) )
            // InternalColdLang.g:4641:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryAccess().getRefFeatureModelCrossReference_2_1_0()); 
            // InternalColdLang.g:4642:3: ( RULE_ID )
            // InternalColdLang.g:4643:4: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getRefFeatureModelIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRefFeatureModelIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPrimaryAccess().getRefFeatureModelCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Primary__RefAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000104218C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000408000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000002L});

}