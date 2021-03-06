/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.serializer;

import com.google.inject.Inject;
import fr.mleduc.mLang.Field;
import fr.mleduc.mLang.FreeVal;
import fr.mleduc.mLang.Instance;
import fr.mleduc.mLang.InstanceVal;
import fr.mleduc.mLang.IntVal;
import fr.mleduc.mLang.ListVal;
import fr.mleduc.mLang.MLangPackage;
import fr.mleduc.mLang.Model;
import fr.mleduc.mLang.SetVal;
import fr.mleduc.mLang.StringVal;
import fr.mleduc.services.MLangGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MLangPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case MLangPackage.FREE_VAL:
				sequence_Value(context, (FreeVal) semanticObject); 
				return; 
			case MLangPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case MLangPackage.INSTANCE_VAL:
				sequence_Value(context, (InstanceVal) semanticObject); 
				return; 
			case MLangPackage.INT_VAL:
				sequence_Value(context, (IntVal) semanticObject); 
				return; 
			case MLangPackage.LIST_VAL:
				sequence_Value(context, (ListVal) semanticObject); 
				return; 
			case MLangPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MLangPackage.SET_VAL:
				sequence_Value(context, (SetVal) semanticObject); 
				return; 
			case MLangPackage.STRING_VAL:
				sequence_Value(context, (StringVal) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (key=[Field|ID] value=Value)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.FIELD__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.FIELD__KEY));
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getKeyFieldIDTerminalRuleCall_0_0_1(), semanticObject.getKey());
		feeder.accept(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (name=ID type=[Class|ID] fields+=Field*)
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID metamodel=[Metamodel|ID] instances+=Instance*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns FreeVal
	 *
	 * Constraint:
	 *     val=ANY_OTHER
	 */
	protected void sequence_Value(ISerializationContext context, FreeVal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.FREE_VAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.FREE_VAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getValANY_OTHERTerminalRuleCall_0_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns InstanceVal
	 *
	 * Constraint:
	 *     ref=[Instance|ID]
	 */
	protected void sequence_Value(ISerializationContext context, InstanceVal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.INSTANCE_VAL__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.INSTANCE_VAL__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getRefInstanceIDTerminalRuleCall_3_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntVal
	 *
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Value(ISerializationContext context, IntVal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.INT_VAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.INT_VAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getValINTTerminalRuleCall_2_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns ListVal
	 *
	 * Constraint:
	 *     vals+=Value*
	 */
	protected void sequence_Value(ISerializationContext context, ListVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns SetVal
	 *
	 * Constraint:
	 *     vals+=Value*
	 */
	protected void sequence_Value(ISerializationContext context, SetVal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns StringVal
	 *
	 * Constraint:
	 *     val=STRING
	 */
	protected void sequence_Value(ISerializationContext context, StringVal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MLangPackage.Literals.STRING_VAL__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MLangPackage.Literals.STRING_VAL__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueAccess().getValSTRINGTerminalRuleCall_1_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
}
