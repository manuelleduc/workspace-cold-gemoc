/*
 * generated by Xtext 2.10.0
 */
package varadd.cs.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import varadd.cs.ide.contentassist.antlr.internal.InternalVarAddLangParser;
import varadd.cs.services.VarAddLangGrammarAccess;

public class VarAddLangParser extends AbstractContentAssistParser {

	@Inject
	private VarAddLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalVarAddLangParser createParser() {
		InternalVarAddLangParser result = new InternalVarAddLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
					put(grammarAccess.getAddAccess().getGroup_1(), "rule__Add__Group_1__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getAddAccess().getRightAssignment_1_2(), "rule__Add__RightAssignment_1_2");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalVarAddLangParser typedParser = (InternalVarAddLangParser) parser;
			typedParser.entryRuleExpr();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VarAddLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VarAddLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}