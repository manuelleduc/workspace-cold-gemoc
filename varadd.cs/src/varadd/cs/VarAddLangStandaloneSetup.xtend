/*
 * generated by Xtext 2.10.0
 */
package varadd.cs


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class VarAddLangStandaloneSetup extends VarAddLangStandaloneSetupGenerated {

	def static void doSetup() {
		new VarAddLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}