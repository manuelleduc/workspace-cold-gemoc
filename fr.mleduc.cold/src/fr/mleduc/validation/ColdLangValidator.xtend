/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.validation

import fr.mleduc.coldLang.FeatureModel
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ColdLangValidator extends AbstractColdLangValidator {

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					ColdLangPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	/**
	 * Check languages relationship
	 * Check FM has at least one solution (display nbr of combinations?)
	 * Check perspectives are valid in regard of languages relationships
	 * Check perspectives are properly activated
	 * Check composition operators on artifacts are valid
	 * Define build plan of the language
	 * 
	 * Maybe todo
	 * Gather a set of languages as a language workbench.
	 */
	/**
	 * Test if at least a single solution exists for the SPL.
	 */
	@Check
	def testSPLValidity(FeatureModel fm) {
//		new ColdVMToMM() {}.$(fm)
	}

}
