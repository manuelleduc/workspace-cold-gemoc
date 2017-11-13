package fr.mleduc.util

import net.sf.tweety.logics.pl.semantics.PossibleWorld
import net.sf.tweety.logics.pl.semantics.PossibleWorldIterator
import net.sf.tweety.logics.pl.syntax.PropositionalFormula

class TweetyUtil {
	def long count(PropositionalFormula formula) {
		val signature = formula.getSignature();
		val pwi = new PossibleWorldIterator(signature);

		var satisfiesCount = 0;
		while (pwi.hasNext()) {
			val PossibleWorld next = pwi.next();
			val boolean satisfies = next.satisfies(formula);
			if (satisfies && !next.empty) {
				satisfiesCount++;
			}
		}

		satisfiesCount
	}

}
