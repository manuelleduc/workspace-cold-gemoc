package fr.mleduc.lib.pl.revisitor.impl

import fr.mleduc.lib.pl.model.And
import fr.mleduc.lib.pl.model.Equivalent
import fr.mleduc.lib.pl.model.Imply
import fr.mleduc.lib.pl.model.Not
import fr.mleduc.lib.pl.model.Or
import fr.mleduc.lib.pl.model.Proposition
import fr.mleduc.lib.pl.model.True
import fr.mleduc.lib.pl.revisitor.PLRevisitor

interface PrettyPrint extends PLRevisitor<PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter> {
	override and(And i) {
		[ priority |
			val res = '''«$(i.left).print(i.priority())» && «$(i.right).print(i.priority())»'''
			if (i.priority > priority) '''(«res»)''' else
				res
		]
	}

	override equivalent(Equivalent i) {
		[ priority |
			val res = '''«$(i.left).print(i.priority())» <=> «$(i.right).print(i.priority())»'''
			if (i.priority > priority) '''(«res»)''' else
				res
		]

	}

	override imply(Imply i) {
		[ priority |
			val res = '''«$(i.left).print(i.priority())» => «$(i.right).print(i.priority())»'''
			if (i.priority > priority) '''(«res»)''' else
				res
		]
	}

	override not(Not i) {

		[
			val res = '''«$(i.inner).print(i.priority())»'''
			if (i.priority >= i.inner.priority) '''!(«res»)''' else '''!«res»'''
		]
	}

	override or(Or i) {
		[ priority |
			val res = '''«$(i.left).print(i.priority())» || «$(i.right).print(i.priority())»'''
			if (i.priority > priority) '''(«res»)''' else
				res
		]
	}

	override proposition(Proposition i) {
		[i.value.name]
	}

	override tru(True t) {
		['true']
	}

}
