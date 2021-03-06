/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.ide.contentassist.antlr.internal.InternalMMCLangParser;
import fr.mleduc.services.MMCLangGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class MMCLangParser extends AbstractContentAssistParser {

	@Inject
	private MMCLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMMCLangParser createParser() {
		InternalMMCLangParser result = new InternalMMCLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getCompositionAccess().getGroup(), "rule__Composition__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_0(), "rule__Operation__Group_0__0");
					put(grammarAccess.getOperationAccess().getGroup_0_3(), "rule__Operation__Group_0_3__0");
					put(grammarAccess.getOperationAccess().getGroup_1(), "rule__Operation__Group_1__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getCompositionAccess().getNameAssignment_1(), "rule__Composition__NameAssignment_1");
					put(grammarAccess.getCompositionAccess().getOperationsAssignment_2(), "rule__Composition__OperationsAssignment_2");
					put(grammarAccess.getOperationAccess().getMetamodelAssignment_0_2(), "rule__Operation__MetamodelAssignment_0_2");
					put(grammarAccess.getOperationAccess().getPairsAssignment_0_3_1(), "rule__Operation__PairsAssignment_0_3_1");
					put(grammarAccess.getOperationAccess().getMetamodelAssignment_1_2(), "rule__Operation__MetamodelAssignment_1_2");
					put(grammarAccess.getOperationAccess().getTargetsAssignment_1_4(), "rule__Operation__TargetsAssignment_1_4");
					put(grammarAccess.getPairAccess().getFromAssignment_0(), "rule__Pair__FromAssignment_0");
					put(grammarAccess.getPairAccess().getNameAssignment_2(), "rule__Pair__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMMCLangParser typedParser = (InternalMMCLangParser) parser;
			typedParser.entryRuleComposition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MMCLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MMCLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
