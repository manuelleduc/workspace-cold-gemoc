package fr.mleduc.lib

import fr.mleduc.lib.pl.model.And
import fr.mleduc.lib.pl.model.Equivalent
import fr.mleduc.lib.pl.model.Imply
import fr.mleduc.lib.pl.model.Not
import fr.mleduc.lib.pl.model.Operator
import fr.mleduc.lib.pl.model.Or
import net.sf.tweety.logics.pl.semantics.PossibleWorld
import net.sf.tweety.logics.pl.semantics.PossibleWorldIterator
import net.sf.tweety.logics.pl.syntax.PropositionalFormula

/**
 * Mini fluent propositional logic API.  
 */
class PLLib {
	def imply(Operator a, Operator b) {
		new Imply(a, b)
	}

	def and(Operator a, Operator b) {
		new And(a, b)
	}

	def or(Operator a, Operator b) {
		new Or(a, b)
	}

	def equivalent(Operator a, Operator b) {
		new Equivalent(a, b)
	}

	def not(Operator a) {
		new Not(a)
	}

	def long count(PropositionalFormula formula) {
		val signature = formula.getSignature();
		val pwi = new PossibleWorldIterator(signature);

		var satisfiesCount = 0;
		while (pwi.hasNext()) {
			val PossibleWorld next = pwi.next();
			val boolean satisfies = next.satisfies(formula);
			if (satisfies) {
				satisfiesCount++;
			}
		}

		satisfiesCount
	}

}
