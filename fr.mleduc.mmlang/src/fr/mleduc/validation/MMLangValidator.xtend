/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.validation

import fr.mleduc.mMLang.Class
import fr.mleduc.mMLang.MMLangPackage
import fr.mleduc.mMLang.Metamodel
import java.util.List
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.EcoreUtil2

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MMLangValidator extends AbstractMMLangValidator {

	String CIRCULAR_CLASS_HIERARCHY = "CIRCULAR_CLASS_HIERARCHY"
	String UNSOUND_CONCRETE_METAMODEL = "UNSOUND_CONCRETE_METAMODEL"
	String CLASS_NAME_CONFLICT = "CLASS_NAME_CONFLICT"

	def void parents(Class c, List<Class> l) {
		c.parents.forEach [
			if (!l.contains(it)) {
				l.add(it)
				it.parents(l)
			}
		]
	}

	def List<Class> parent(Class c) {
		val l = newArrayList()
		c.parents(l)
		l
	}

	@Check
	def nonCircularHierarchy(Class c) {
		if (c.parents.contains(c)) {
			error('Circular class hierarchy', MMLangPackage.Literals::CLASS__PARENTS, CIRCULAR_CLASS_HIERARCHY)
		}
	}

	@Check
	def checkConcreteMMIsComplete(Metamodel m) {

		/*
		 * Check if every abstract class has at least a non abstract child
		 */
		if (m.concrete) {
			val abstractClassesWithNoChildren = m.classes.filter[abstract].filter [ c1 |
				!m.classes.filter[!abstract].exists[c2|c2.parents.contains(c1)]
			].sortBy[name]

			if (!abstractClassesWithNoChildren.
				empty) {
				error('''Classes «FOR c : abstractClassesWithNoChildren SEPARATOR ', '»«c.name»«ENDFOR» don't have concrete child.''',
					MMLangPackage.Literals::METAMODEL__NAME, UNSOUND_CONCRETE_METAMODEL)
			}
		}
	}
	
	@Check
	def checkClassesNames(Class a) {
		val mm =  EcoreUtil2.getRootContainer(a) as Metamodel
		if(!mm.classes.filter[it !== a && it.name == a.name].empty) {
			error('''Another class exists with the same name''', a, MMLangPackage.Literals.REFERENCE__NAME, CLASS_NAME_CONFLICT)
		}
	}

}
 