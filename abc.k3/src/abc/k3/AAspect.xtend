package abc.k3

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

//import static extension abc.k3.AAspect.*
//import static extension abc.k3.BAspect.*
//import static extension abc.k3.CAspect.*

//@Aspect(className=typeof(A))
//class AAspect {
//	def void assign() {
//		var Long i = 0L
//		for (b : _self.bs) {
//			b.cptr = i
//			b.assign
//			i = i + 1
//		}
//	}
//}
//
//@Aspect(className=B)
//class BAspect {
//	public var Long cptr = 0L
//
//	def void assign() {
//		_self.cs.forEach [
//			name = '''«IF _self.cptr%2 == 0»A«ELSE»B«ENDIF»«_self.cptr»'''
//		]
//	}
//
//}
//
//@Aspect(className=C)
//class CAspect {
//	public var String name
//}
//
//
//@Aspect(className=C)
//class C2Aspect {
//	public var String name
//}