package fr.mleduc.util

import fr.mleduc.explicitOperations.And
import fr.mleduc.explicitOperations.Equiv
import fr.mleduc.explicitOperations.Imply
import fr.mleduc.explicitOperations.Not
import fr.mleduc.explicitOperations.Or
import fr.mleduc.explicitOperations.Variable

class PrettyPrintProposition {
	def dispatch String pretty(And p, int priority) {
		val localPriority = 2
		val res = '''«p.left?.pretty(localPriority)» and «p.right?.pretty(localPriority)»'''
		if (localPriority > priority) '''(«res»)''' else
			res
	}

	def dispatch String pretty(Equiv p, int priority) {
		val localPriority = 5
		val res = '''«p.left?.pretty(localPriority)» <=> «p.right?.pretty(localPriority)»'''
		if (localPriority > priority) '''(«res»)''' else
			res
	}

	def dispatch String pretty(Imply p, int priority) {
		val localPriority = 4
		val res = '''«p.left?.pretty(localPriority)?:""» => «p.right?.pretty(localPriority)?:""»'''
		if (localPriority > priority) '''(«res»)''' else
			res
	}

	def dispatch String pretty(Not p, int priority) {
		val localPriority = 1
		val res = '''«p.next?.pretty(localPriority)»'''
		if (localPriority > priority) '''!(«res»)''' else '''!«res»'''
	}

	def dispatch String pretty(Or p, int priority) {
		val localPriority = 3
		val res = '''«p.left?.pretty(localPriority)» or «p.right?.pretty(localPriority)»'''
		if (localPriority > priority) '''(«res»)''' else
			res
	}

	def dispatch String pretty(Variable p, int priority) {
		p.ref.name
	}
}
