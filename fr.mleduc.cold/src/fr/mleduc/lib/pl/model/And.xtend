package fr.mleduc.lib.pl.model

import org.eclipse.xtend.lib.annotations.Accessors

class And extends Operator {
	@Accessors Operator left
	@Accessors Operator right

	new(Operator operator, Operator operator2) {
		left = operator
		right = operator2
	}

	override priority() { 2L }

}
