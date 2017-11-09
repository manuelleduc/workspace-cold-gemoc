package fr.mleduc.lib.pl.model

import org.eclipse.xtend.lib.annotations.Accessors
import net.sf.tweety.logics.pl.syntax.PropositionalFormula

class Equivalent extends Operator {
	@Accessors Operator left
	@Accessors Operator right

	new(Operator left, Operator right) {
		this.left = left
		this.right = right
	}

	override priority() { 5L }
}
