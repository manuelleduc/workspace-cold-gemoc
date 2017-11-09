/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.ide.contentassist.antlr.internal.InternalMLangParser;
import fr.mleduc.services.MLangGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class MLangParser extends AbstractContentAssistParser {

	@Inject
	private MLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMLangParser createParser() {
		InternalMLangParser result = new InternalMLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getValueAccess().getGroup_0(), "rule__Value__Group_0__0");
					put(grammarAccess.getValueAccess().getGroup_1(), "rule__Value__Group_1__0");
					put(grammarAccess.getValueAccess().getGroup_2(), "rule__Value__Group_2__0");
					put(grammarAccess.getValueAccess().getGroup_3(), "rule__Value__Group_3__0");
					put(grammarAccess.getValueAccess().getGroup_4(), "rule__Value__Group_4__0");
					put(grammarAccess.getValueAccess().getGroup_5(), "rule__Value__Group_5__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getMetamodelAssignment_3(), "rule__Model__MetamodelAssignment_3");
					put(grammarAccess.getModelAccess().getInstancesAssignment_4(), "rule__Model__InstancesAssignment_4");
					put(grammarAccess.getInstanceAccess().getNameAssignment_1(), "rule__Instance__NameAssignment_1");
					put(grammarAccess.getInstanceAccess().getTypeAssignment_3(), "rule__Instance__TypeAssignment_3");
					put(grammarAccess.getInstanceAccess().getFieldsAssignment_5(), "rule__Instance__FieldsAssignment_5");
					put(grammarAccess.getFieldAccess().getKeyAssignment_0(), "rule__Field__KeyAssignment_0");
					put(grammarAccess.getFieldAccess().getValueAssignment_2(), "rule__Field__ValueAssignment_2");
					put(grammarAccess.getValueAccess().getValAssignment_0_1(), "rule__Value__ValAssignment_0_1");
					put(grammarAccess.getValueAccess().getValAssignment_1_1(), "rule__Value__ValAssignment_1_1");
					put(grammarAccess.getValueAccess().getValAssignment_2_1(), "rule__Value__ValAssignment_2_1");
					put(grammarAccess.getValueAccess().getRefAssignment_3_1(), "rule__Value__RefAssignment_3_1");
					put(grammarAccess.getValueAccess().getValsAssignment_4_2(), "rule__Value__ValsAssignment_4_2");
					put(grammarAccess.getValueAccess().getValsAssignment_5_2(), "rule__Value__ValsAssignment_5_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMLangParser typedParser = (InternalMLangParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}