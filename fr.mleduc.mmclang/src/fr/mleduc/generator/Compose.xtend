package fr.mleduc.generator

import fr.mleduc.mMCLang.Composition
import fr.mleduc.mMCLang.Merge
import fr.mleduc.mMCLang.Slice
import fr.mleduc.mMLang.Class
import fr.mleduc.mMLang.MMLangFactory
import fr.mleduc.mMLang.Metamodel
import java.util.List
import org.eclipse.xtext.EcoreUtil2

class Compose {

	def reduce(Composition composition) {
		composition.operations.fold(MMLangFactory::eINSTANCE.createMetamodel, [m, t|t.apply(m)]) => [
			name = composition.name
		]
	}

	def dispatch Metamodel apply(Merge merge, Metamodel m) {
		val red = merge.metamodel
		red.classes.forEach [ c |
			val name = merge.pairs.findFirst[it.from.name == c.name].orElse([it.name], c.name)
			merge(m, c, name)
		]
		m.concrete = true
		m
	}

	def dispatch Metamodel apply(Slice s, Metamodel m) {
		val red = s.metamodel
		val targets = red.classes.filter[s.targets.map[name].contains(it.name)]
		val res = newArrayList()
		targets.forEach[it.addDependencies(res)]
		res.forEach[c|merge(m, c, c.name)]
		m

	}

//	/**
//	 * When reducing, we assume everything have been typechecked
//	 */
//	def Metamodel reduce(Metamodel mr) {
//		val m = MMLangFactory::eINSTANCE.createMetamodel
////		val m = mr.composition.fold(MMLangFactory::eINSTANCE.createMetamodel, [m, c|c.apply(m)])
//		mr.classes.forEach[merge(m, it, it.name)]
//		m.name = mr.name
//		m
//	}
//
	def merge(Metamodel m, Class c0, String nn) {
		val c = EcoreUtil2::copy(c0)
		c.name = nn
		if (m.classes.exists[it.name == c.name]) {
			val tmp = c.merge(m.classes.findFirst[it.name == c.name])
			m.classes.removeIf[it.name == c.name]
			m.classes.add(tmp)
		} else
			m.classes.add(c)
	}

//
	def <E, T> T orElse(E x, (E)=>T a, T b) {
		if(x != null) a.apply(x) else b
	}

//
////	def dispatch Metamodel apply(Merge merge, Metamodel m) {
////		val red = merge.metamodel.reduce
////		red.classes.forEach [ c |
////			val name = merge.pairs.findFirst[it.from.name == c.name].orElse([it.name], c.name)
////			merge(m, c, name)
////		]
////		m
////	}
////
////	def dispatch Metamodel apply(Slice s, Metamodel m) {
////		val red = s.metamodel.reduce
////		val targets = red.classes.filter[s.targets.map[name].contains(it.name)]
////		val res = newArrayList()
////		targets.forEach[it.addDependencies(res)]
////		res.forEach[c|merge(m, c, c.name)]
////		m
////
////	}
//
	def void addDependencies(Class c, List<Class> added) {
		if (!added.contains(c)) {
			added.add(c)
			c.parents.forEach[addDependencies(it, added)]
			c.fields.map[type].filter(Class).forEach[addDependencies(it, added)]
			c.fields.map[generics].flatten.filter(Class).forEach[addDependencies(it, added)]
		}
	}

//
//	/**
//	 * Merge the fields of a and b.
//	 * If a and b has fields with similar names, b is kept in the returned class. 
//	 */
	def Class merge(Class a, Class b) {
		MMLangFactory::eINSTANCE.createClass => [ nc |
			nc.name = a.name

			// I assume a and b have compatible generics
			nc.generics.addAll(a.generics)
			nc.fields.addAll(a.fields)
			// I assume a and b have compatible fields type
			b.fields.forEach [ f |
				nc.fields.removeIf[it.name == f.name]
				nc.fields.add(EcoreUtil2.copy(f))
			]
		]
	}
}
