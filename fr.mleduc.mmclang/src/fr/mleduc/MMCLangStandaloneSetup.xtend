/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MMCLangStandaloneSetup extends MMCLangStandaloneSetupGenerated {

	def static void doSetup() {
		new MMCLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
