package abc.k3

//import abc.model.A
//import abc.model.B
//import abc.model.C

class Main {
	def static void main(String[] args) {
		val a = new A() => [
			val b1 = new B() => [
				val c1 = new C()
				val c2 = new C()
				cs.addAll(c1, c2)
			]
			val b2 = new B() => [
				val c1 = new C()
				val c2 = new C()
				cs.addAll(c1, c2)
			]
			val b3 = new B() => [
				val c1 = new C()
				val c2 = new C()
				cs.addAll(c1, c2)
			]
			bs.addAll(b1, b2, b3)
		]

//		a.assign
//
//		println('''
//			«FOR b : a.bs»
//				«b.cptr»
//				«b.assign»
//					«FOR c: b.cs»
//					«c.name»
//					«ENDFOR»
//			«ENDFOR»
//		''')
	}
}
