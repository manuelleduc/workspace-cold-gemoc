package fr.mleduc.lib.pl.model

import org.eclipse.xtend.lib.annotations.Accessors

class Not extends Operator {
	@Accessors Operator inner

	new(Operator operator) {
		this.inner = operator
	}

	override priority() { 1L }

}
