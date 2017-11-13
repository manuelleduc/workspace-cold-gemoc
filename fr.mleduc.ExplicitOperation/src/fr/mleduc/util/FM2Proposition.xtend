package fr.mleduc.util

import fr.mleduc.explicitOperations.And
import fr.mleduc.explicitOperations.AtomicFeature
import fr.mleduc.explicitOperations.Equiv
import fr.mleduc.explicitOperations.ExplicitOperationsFactory
import fr.mleduc.explicitOperations.Feature
import fr.mleduc.explicitOperations.Imply
import fr.mleduc.explicitOperations.Not
import fr.mleduc.explicitOperations.OneOf
import fr.mleduc.explicitOperations.Or
import fr.mleduc.explicitOperations.Proposition
import fr.mleduc.explicitOperations.SomeOf
import fr.mleduc.explicitOperations.Variable
import java.util.List
import javax.inject.Inject
import org.eclipse.xtext.xbase.lib.Functions.Function2
import org.eclipse.xtext.EcoreUtil2

class FM2Proposition {

	@Inject extension PrettyPrintProposition

	def Variable proposition(Feature p) {
		ExplicitOperationsFactory::eINSTANCE.createVariable => [
			ref = p
		]
	}

	def Not not(Proposition p) {
		ExplicitOperationsFactory::eINSTANCE.createNot => [
			next = p
		]
	}

	def Imply imply(Proposition p, Proposition p1) {
		ExplicitOperationsFactory::eINSTANCE.createImply => [
			left = p
			right = p1
		]
	}

	def Equiv equivalent(Proposition p, Proposition p1) {
		ExplicitOperationsFactory::eINSTANCE.createEquiv => [
			left = p
			right = p1
		]
	}

	def And and(Proposition p, Proposition p1) {
		println(p1)
		ExplicitOperationsFactory::eINSTANCE.createAnd => [
			left = p
			right = p1
		]
	}

	def Or or(Proposition p, Proposition p1) {
		ExplicitOperationsFactory::eINSTANCE.createOr => [
			left = p
			right = p1
		]
	}

	def <R, T extends R> R fold1(Iterable<T> lb, Function2<? super R, ? super T, ? extends R> f, R d) {
		val l = lb.filterNull
		val lt = l.length
		if (lt == 1)
			l.head
		else if(lt > 1) l.tail.fold(l.head, f) else d
	}

	def dispatch Proposition toProposition(AtomicFeature that) {
		val v = ExplicitOperationsFactory::eINSTANCE.createVariable => [
			ref = that
		]
		val ret = if (that.constraints != null)
				EcoreUtil2.copy(v).imply(EcoreUtil2.copy(that.constraints))
			else
				null
		ret
	}

	def dispatch Proposition toProposition(OneOf that) {
		val subs = that.children

		val List<Proposition> ret = newArrayList
		for (var i = 0; i < subs.length; i++) {
			val innerL = newArrayList()

			for (var j = 0; j < subs.length; j++) {
				if (i != j) {
					innerL.add(subs.get(j).proposition.not)
				} else {
					innerL.add(subs.get(j).proposition)
				}

			}

			// !a&&!b&...&c
			ret.add(innerL.fold1([ Proposition p1, Proposition p2 |p1.and(p2)], null))
		}

		// child-parent relations
		val childParent = subs.map[it.proposition.imply(that.proposition)].fold1([Proposition p1, p2|p1.and(p2)], null)
		// xor-group
		val xorGroup = that.proposition.imply(ret.fold1([Proposition p1, p2|p1.or(p2)], null))

		val children = that.children.map[toProposition].fold1([Proposition p1, p2|p1.and(p2)], null)

		val v = if(children != null) childParent.and(xorGroup).and(children) else childParent.and(xorGroup) 
		if (that.constraints != null) {
			val vb = EcoreUtil2.copy(v)
			v.and(vb.imply(EcoreUtil2.copy(that.constraints)))
		} else
			v
	}

	def dispatch Proposition toProposition(SomeOf that) {
		val subs = that.children

		val subPropositions = subs.map[it.toProposition].fold1([Proposition p1, p2|p1.and(p2)], null)

		// all the subfeature can be freely selected, except the mandatory (non optional) one that should be selected as soon as the someOf feature is selected  
		val v0 = that.children.map [
			if (it.isOptional)
				it.proposition.imply(that.proposition)
			else
				it.proposition.equivalent(that.proposition)
		].filterNull.fold1([Proposition p1, p2|p1.and(p2)], null)
		
		val v = if(subPropositions == null) v0 else v0.and(subPropositions)

		if (that.constraints != null) {
			val vb = EcoreUtil2.copy(v)
			v.and(vb.imply(EcoreUtil2.copy(that.constraints)))
		} else
			v

	}

}
