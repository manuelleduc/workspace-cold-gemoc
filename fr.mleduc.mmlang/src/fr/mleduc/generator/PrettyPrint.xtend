package fr.mleduc.generator

import fr.mleduc.mMLang.Card0
import fr.mleduc.mMLang.Card1
import fr.mleduc.mMLang.Class
import fr.mleduc.mMLang.Field
import fr.mleduc.mMLang.Generic
import fr.mleduc.mMLang.Metamodel
import fr.mleduc.mMLang.Reference
import fr.mleduc.mMLang.CardInf

class PrettyPrint {
	def dispatch CharSequence print(Metamodel m) {
		'''
			«IF m.concrete»concrete «ENDIF»package «m.name»
			
			«FOR cls : m.classes.sortBy[name] SEPARATOR "\n"»
				«cls.print»
			«ENDFOR»	
		'''
	}

	def dispatch CharSequence print(Reference r) {
		'''«r.name»'''
	}

	def dispatch CharSequence print(Class c) {
		'''
			«IF c.abstract»abstract «ENDIF»class «c.name»«
			»«FOR g : c.generics BEFORE '<' SEPARATOR ', ' AFTER '>'»«g.name»«ENDFOR»«
			»«FOR p : c.parents BEFORE ' extends ' SEPARATOR ', '»«p.name»«ENDFOR» {
			  «FOR field : c.fields.sortBy[name]»
			  	«field.print»
			  «ENDFOR»
			}
		'''
	}

	def dispatch CharSequence print(Generic g) {
		'''«g.name»'''
	}

	def dispatch CharSequence print(
		Field f) {
		'''«IF f.containment»@«ENDIF»«f.name»: «f.type.name»«FOR g : f.generics BEFORE '<' SEPARATOR ', ' AFTER '>'»«g.name»«ENDFOR» [«f.start_card.print»..«f.stop_card.print»]'''
	}

	def dispatch CharSequence print(Card0 c) {
		'''0'''
	}

	def dispatch CharSequence print(Card1 c) {
		'''1'''
	}

	def dispatch CharSequence print(CardInf c) {
		'''*'''
	}
}
