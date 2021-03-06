/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MMLangGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MetamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Metamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConcreteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cConcreteConcreteKeyword_0_0 = (Keyword)cConcreteAssignment_0.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cClassesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassesClassParserRuleCall_3_0 = (RuleCall)cClassesAssignment_3.eContents().get(0);
		
		//Metamodel:
		//	concrete?='concrete'? 'package' name=ID
		//	//	(composition+=Composition)*
		//	classes+=Class*;
		@Override public ParserRule getRule() { return rule; }
		
		//concrete?='concrete'? 'package' name=ID //	(composition+=Composition)*
		//classes+=Class*
		public Group getGroup() { return cGroup; }
		
		//concrete?='concrete'?
		public Assignment getConcreteAssignment_0() { return cConcreteAssignment_0; }
		
		//'concrete'
		public Keyword getConcreteConcreteKeyword_0_0() { return cConcreteConcreteKeyword_0_0; }
		
		//'package'
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		////	(composition+=Composition)*
		//classes+=Class*
		public Assignment getClassesAssignment_3() { return cClassesAssignment_3; }
		
		//Class
		public RuleCall getClassesClassParserRuleCall_3_0() { return cClassesClassParserRuleCall_3_0; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Reference");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGenericParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Reference:
		//	Generic | Class
		//	//	| Pair
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Generic | Class
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Generic
		public RuleCall getGenericParserRuleCall_0() { return cGenericParserRuleCall_0; }
		
		//Class
		public RuleCall getClassParserRuleCall_1() { return cClassParserRuleCall_1; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_0 = (Keyword)cAbstractAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParentsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cParentsClassCrossReference_3_1_0 = (CrossReference)cParentsAssignment_3_1.eContents().get(0);
		private final RuleCall cParentsClassIDTerminalRuleCall_3_1_0_1 = (RuleCall)cParentsClassCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cParentsAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cParentsClassCrossReference_3_2_1_0 = (CrossReference)cParentsAssignment_3_2_1.eContents().get(0);
		private final RuleCall cParentsClassIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cParentsClassCrossReference_3_2_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLessThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cGenericsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cGenericsGenericParserRuleCall_4_1_0 = (RuleCall)cGenericsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cGenericsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cGenericsGenericParserRuleCall_4_2_1_0 = (RuleCall)cGenericsAssignment_4_2_1.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFieldsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFieldsFieldParserRuleCall_6_0 = (RuleCall)cFieldsAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Class:
		//	abstract?='abstract'? 'class' name=ID ('extends' parents+=[Class] (',' parents+=[Class])*)? ('<'
		//	generics+=Generic (','
		//	generics+=Generic)*
		//	'>')? '{' fields+=Field* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//abstract?='abstract'? 'class' name=ID ('extends' parents+=[Class] (',' parents+=[Class])*)? ('<' generics+=Generic (','
		//generics+=Generic)* '>')? '{' fields+=Field* '}'
		public Group getGroup() { return cGroup; }
		
		//abstract?='abstract'?
		public Assignment getAbstractAssignment_0() { return cAbstractAssignment_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_0() { return cAbstractAbstractKeyword_0_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('extends' parents+=[Class] (',' parents+=[Class])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//parents+=[Class]
		public Assignment getParentsAssignment_3_1() { return cParentsAssignment_3_1; }
		
		//[Class]
		public CrossReference getParentsClassCrossReference_3_1_0() { return cParentsClassCrossReference_3_1_0; }
		
		//ID
		public RuleCall getParentsClassIDTerminalRuleCall_3_1_0_1() { return cParentsClassIDTerminalRuleCall_3_1_0_1; }
		
		//(',' parents+=[Class])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//','
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//parents+=[Class]
		public Assignment getParentsAssignment_3_2_1() { return cParentsAssignment_3_2_1; }
		
		//[Class]
		public CrossReference getParentsClassCrossReference_3_2_1_0() { return cParentsClassCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getParentsClassIDTerminalRuleCall_3_2_1_0_1() { return cParentsClassIDTerminalRuleCall_3_2_1_0_1; }
		
		//('<' generics+=Generic (',' generics+=Generic)* '>')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'<'
		public Keyword getLessThanSignKeyword_4_0() { return cLessThanSignKeyword_4_0; }
		
		//generics+=Generic
		public Assignment getGenericsAssignment_4_1() { return cGenericsAssignment_4_1; }
		
		//Generic
		public RuleCall getGenericsGenericParserRuleCall_4_1_0() { return cGenericsGenericParserRuleCall_4_1_0; }
		
		//(',' generics+=Generic)*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//generics+=Generic
		public Assignment getGenericsAssignment_4_2_1() { return cGenericsAssignment_4_2_1; }
		
		//Generic
		public RuleCall getGenericsGenericParserRuleCall_4_2_1_0() { return cGenericsGenericParserRuleCall_4_2_1_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4_3() { return cGreaterThanSignKeyword_4_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//fields+=Field*
		public Assignment getFieldsAssignment_6() { return cFieldsAssignment_6; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_6_0() { return cFieldsFieldParserRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class GenericElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Generic");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Generic:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cContainmentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cContainmentCommercialAtKeyword_0_0 = (Keyword)cContainmentAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeReferenceCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeReferenceIDTerminalRuleCall_3_0_1 = (RuleCall)cTypeReferenceCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLessThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cGenericsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cGenericsReferenceCrossReference_4_1_0 = (CrossReference)cGenericsAssignment_4_1.eContents().get(0);
		private final RuleCall cGenericsReferenceIDTerminalRuleCall_4_1_0_1 = (RuleCall)cGenericsReferenceCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cGenericsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cGenericsReferenceCrossReference_4_2_1_0 = (CrossReference)cGenericsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cGenericsReferenceIDTerminalRuleCall_4_2_1_0_1 = (RuleCall)cGenericsReferenceCrossReference_4_2_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStart_cardAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStart_cardCardParserRuleCall_6_0 = (RuleCall)cStart_cardAssignment_6.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cStop_cardAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cStop_cardCardParserRuleCall_8_0 = (RuleCall)cStop_cardAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Field:
		//	containment?='@'? name=ID ':' type=[Reference] ('<' generics+=[Reference] (',' generics+=[Reference])* '>')?
		//	'[' start_card=Card '..' stop_card=Card ']';
		@Override public ParserRule getRule() { return rule; }
		
		//containment?='@'? name=ID ':' type=[Reference] ('<' generics+=[Reference] (',' generics+=[Reference])* '>')? '['
		//start_card=Card '..' stop_card=Card ']'
		public Group getGroup() { return cGroup; }
		
		//containment?='@'?
		public Assignment getContainmentAssignment_0() { return cContainmentAssignment_0; }
		
		//'@'
		public Keyword getContainmentCommercialAtKeyword_0_0() { return cContainmentCommercialAtKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[Reference]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[Reference]
		public CrossReference getTypeReferenceCrossReference_3_0() { return cTypeReferenceCrossReference_3_0; }
		
		//ID
		public RuleCall getTypeReferenceIDTerminalRuleCall_3_0_1() { return cTypeReferenceIDTerminalRuleCall_3_0_1; }
		
		//('<' generics+=[Reference] (',' generics+=[Reference])* '>')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'<'
		public Keyword getLessThanSignKeyword_4_0() { return cLessThanSignKeyword_4_0; }
		
		//generics+=[Reference]
		public Assignment getGenericsAssignment_4_1() { return cGenericsAssignment_4_1; }
		
		//[Reference]
		public CrossReference getGenericsReferenceCrossReference_4_1_0() { return cGenericsReferenceCrossReference_4_1_0; }
		
		//ID
		public RuleCall getGenericsReferenceIDTerminalRuleCall_4_1_0_1() { return cGenericsReferenceIDTerminalRuleCall_4_1_0_1; }
		
		//(',' generics+=[Reference])*
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//','
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }
		
		//generics+=[Reference]
		public Assignment getGenericsAssignment_4_2_1() { return cGenericsAssignment_4_2_1; }
		
		//[Reference]
		public CrossReference getGenericsReferenceCrossReference_4_2_1_0() { return cGenericsReferenceCrossReference_4_2_1_0; }
		
		//ID
		public RuleCall getGenericsReferenceIDTerminalRuleCall_4_2_1_0_1() { return cGenericsReferenceIDTerminalRuleCall_4_2_1_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4_3() { return cGreaterThanSignKeyword_4_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_5() { return cLeftSquareBracketKeyword_5; }
		
		//start_card=Card
		public Assignment getStart_cardAssignment_6() { return cStart_cardAssignment_6; }
		
		//Card
		public RuleCall getStart_cardCardParserRuleCall_6_0() { return cStart_cardCardParserRuleCall_6_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_7() { return cFullStopFullStopKeyword_7; }
		
		//stop_card=Card
		public Assignment getStop_cardAssignment_8() { return cStop_cardAssignment_8; }
		
		//Card
		public RuleCall getStop_cardCardParserRuleCall_8_0() { return cStop_cardCardParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
	}
	public class CardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.mleduc.MMLang.Card");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cCard0Action_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cDigitZeroKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cCard1Action_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cDigitOneKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cCardInfAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cAsteriskKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//Card:
		//	{Card0} '0' | {Card1} '1' | {CardInf} '*';
		@Override public ParserRule getRule() { return rule; }
		
		//{Card0} '0' | {Card1} '1' | {CardInf} '*'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Card0} '0'
		public Group getGroup_0() { return cGroup_0; }
		
		//{Card0}
		public Action getCard0Action_0_0() { return cCard0Action_0_0; }
		
		//'0'
		public Keyword getDigitZeroKeyword_0_1() { return cDigitZeroKeyword_0_1; }
		
		//{Card1} '1'
		public Group getGroup_1() { return cGroup_1; }
		
		//{Card1}
		public Action getCard1Action_1_0() { return cCard1Action_1_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_1_1() { return cDigitOneKeyword_1_1; }
		
		//{CardInf} '*'
		public Group getGroup_2() { return cGroup_2; }
		
		//{CardInf}
		public Action getCardInfAction_2_0() { return cCardInfAction_2_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_2_1() { return cAsteriskKeyword_2_1; }
	}
	
	
	private final MetamodelElements pMetamodel;
	private final ReferenceElements pReference;
	private final ClassElements pClass;
	private final GenericElements pGeneric;
	private final FieldElements pField;
	private final CardElements pCard;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MMLangGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMetamodel = new MetamodelElements();
		this.pReference = new ReferenceElements();
		this.pClass = new ClassElements();
		this.pGeneric = new GenericElements();
		this.pField = new FieldElements();
		this.pCard = new CardElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.mleduc.MMLang".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Metamodel:
	//	concrete?='concrete'? 'package' name=ID
	//	//	(composition+=Composition)*
	//	classes+=Class*;
	public MetamodelElements getMetamodelAccess() {
		return pMetamodel;
	}
	
	public ParserRule getMetamodelRule() {
		return getMetamodelAccess().getRule();
	}
	
	//Reference:
	//	Generic | Class
	//	//	| Pair
	//;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//Class:
	//	abstract?='abstract'? 'class' name=ID ('extends' parents+=[Class] (',' parents+=[Class])*)? ('<'
	//	generics+=Generic (','
	//	generics+=Generic)*
	//	'>')? '{' fields+=Field* '}';
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Generic:
	//	name=ID;
	public GenericElements getGenericAccess() {
		return pGeneric;
	}
	
	public ParserRule getGenericRule() {
		return getGenericAccess().getRule();
	}
	
	//Field:
	//	containment?='@'? name=ID ':' type=[Reference] ('<' generics+=[Reference] (',' generics+=[Reference])* '>')?
	//	'[' start_card=Card '..' stop_card=Card ']';
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//Card:
	//	{Card0} '0' | {Card1} '1' | {CardInf} '*';
	public CardElements getCardAccess() {
		return pCard;
	}
	
	public ParserRule getCardRule() {
		return getCardAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
