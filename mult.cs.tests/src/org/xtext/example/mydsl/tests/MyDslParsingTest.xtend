/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import mult.multlang.exprconcern.Expr
import mult.rev.MultEvalRev
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest{

	@Inject
	ParseHelper<Expr> parseHelper

	@Test 
	def void load1() {
		val result = parseHelper.parse('''
			1
		''')
		Assert.assertNotNull(result)
		
		
		val rev = new MultEvalRev() {
		}
		val op = rev.$(result)
		val res = op.eval()
		Assert.assertEquals(1, res)
	}
	
	@Test 
	def void load12() {
		val result = parseHelper.parse('''
			1 * 2
		''')
		Assert.assertNotNull(result)
		val rev = new MultEvalRev() {
		}
		val op = rev.$(result)
		val res = op.eval()
		Assert.assertEquals(2, res)
	}
	
	
	@Test 
	def void load123() {
		val result = parseHelper.parse('''
			1 * 2 * 3 
		''')
		Assert.assertNotNull(result)
		val rev = new MultEvalRev() {
		}
		val op = rev.$(result)
		val res = op.eval()
		Assert.assertEquals(6, res)
	}

}