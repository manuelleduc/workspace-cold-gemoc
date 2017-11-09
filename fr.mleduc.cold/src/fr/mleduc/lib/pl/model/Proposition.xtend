package fr.mleduc.lib.pl.model

import org.eclipse.xtend.lib.annotations.Accessors

class Proposition extends Operator {
	@Accessors net.sf.tweety.logics.pl.syntax.Proposition value

	new(String string) {
		this.value = new net.sf.tweety.logics.pl.syntax.Proposition(string)
	}

	override priority() { 6L }

}
