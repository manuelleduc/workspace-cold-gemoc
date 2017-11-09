package fr.mleduc.lib

import org.eclipse.xtext.xbase.lib.Functions.Function2

/**
 * Functional programming mini lib.
 */
class FPLib {
	
	/**
	 * fold the list l = [n0...nx] by intersecting every elements with the f function
	 * 
	 * the returned value is f(nx ... f(n1, f(n0, n1)))
	 * 
	 * if l is size zero, d est returned
	 * if l is zied one, l.head is return 
	 */
	def <R, T extends R> R fold1(Iterable<T> l, Function2<? super R, ? super T, ? extends R> f, R d) {
		val lt = l.length
		if(lt == 1) l.head
		else if(lt > 1) l.tail.fold(l.head, f)
		else d
	}
}
