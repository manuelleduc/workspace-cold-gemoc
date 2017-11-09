package fr.mleduc.lib.pl.revisitor.impl

import fr.mleduc.lib.pl.model.And
import fr.mleduc.lib.pl.model.Equivalent
import fr.mleduc.lib.pl.model.Imply
import fr.mleduc.lib.pl.model.Not
import fr.mleduc.lib.pl.model.Or
import fr.mleduc.lib.pl.model.Proposition
import fr.mleduc.lib.pl.model.True
import fr.mleduc.lib.pl.revisitor.PLRevisitor
import net.sf.tweety.logics.pl.syntax.Conjunction
import net.sf.tweety.logics.pl.syntax.Disjunction
import net.sf.tweety.logics.pl.syntax.Negation
import net.sf.tweety.logics.pl.syntax.PropositionalFormula
import net.sf.tweety.logics.pl.syntax.Tautology

interface ToTweety extends PLRevisitor<PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, Tautology> {

	def andB(PropositionalFormula a, PropositionalFormula b) {
		new Conjunction(a, b)
	}

	def orB(PropositionalFormula a, PropositionalFormula b) {
		new Disjunction(a, b)
	}

	def implyB(PropositionalFormula a, PropositionalFormula b) {
		a.notB.orB(b)
	}

	def equivalentB(PropositionalFormula a, PropositionalFormula b) {
		a.implyB(b).andB(b.implyB(a))
	}

	def notB(PropositionalFormula a) {
		new Negation(a)
	}

	override and(And i) {
		andB($(i.left), $(i.right))
	}

	override equivalent(Equivalent i) {
		equivalentB($(i.left), $(i.right))
	}

	override imply(Imply i) {
		implyB($(i.left), $(i.right))
	}

	override not(Not not) {
		notB($(not.inner))
	}

	override or(Or i) {
		orB($(i.left), $(i.right))
	}

	override proposition(Proposition i) {
		i.value
	}

	override tru(True i) {
		new Tautology
	}

}
