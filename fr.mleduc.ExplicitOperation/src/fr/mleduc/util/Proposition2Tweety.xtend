package fr.mleduc.util

import fr.mleduc.explicitOperations.And
import fr.mleduc.explicitOperations.Equiv
import fr.mleduc.explicitOperations.Imply
import fr.mleduc.explicitOperations.Not
import fr.mleduc.explicitOperations.Or
import fr.mleduc.explicitOperations.Variable
import net.sf.tweety.logics.pl.syntax.Conjunction
import net.sf.tweety.logics.pl.syntax.Disjunction
import net.sf.tweety.logics.pl.syntax.Negation
import net.sf.tweety.logics.pl.syntax.Proposition
import net.sf.tweety.logics.pl.syntax.PropositionalFormula

class Proposition2Tweety {
	def dispatch PropositionalFormula toTweety(And and) {
		new Conjunction(and.left.toTweety, and.right.toTweety)
	}

	def dispatch PropositionalFormula toTweety(Equiv and) {
		// (!a v b) & (!b v a)
		val a = and.left.toTweety
		val b = and.right.toTweety
		
		val l = new Disjunction(new Negation(a), b)
		val r = new Disjunction(new Negation(b), a)
		new Conjunction(l, r) 
	}

	def dispatch PropositionalFormula toTweety(Imply and) {
		val a = and.left.toTweety
		val b = and.right.toTweety
		
		new Disjunction(new Negation(a), b)
	}

	def dispatch PropositionalFormula toTweety(Not and) {
		new Negation(and.next.toTweety)
	}

	def dispatch PropositionalFormula toTweety(Or and) {
		new Disjunction(and.left.toTweety, and.right.toTweety)
	}

	def dispatch PropositionalFormula toTweety(Variable and) {
		new Proposition(and.ref.name)
	}
}
