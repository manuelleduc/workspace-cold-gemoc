/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import cst.cstlang.exprconcern.Cst
import cst.cstlang.exprconcern.Expr
import cst.rev.CstEvalRev
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {

	@Inject
	ParseHelper<Cst> parseHelper

	@Test
	def void loadModel() {
		val Expr result = parseHelper.parse('''
			1
		''')
		Assert.assertNotNull(result)

		

		val res = new CstEvalRev() {}.$(result).eval()

		Assert.assertEquals(1L, res)

	}

}
