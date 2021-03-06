/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.parser.antlr;

import com.google.inject.Inject;
import fr.mleduc.parser.antlr.internal.InternalMLangParser;
import fr.mleduc.services.MLangGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MLangParser extends AbstractAntlrParser {

	@Inject
	private MLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMLangParser createParser(XtextTokenStream stream) {
		return new InternalMLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
