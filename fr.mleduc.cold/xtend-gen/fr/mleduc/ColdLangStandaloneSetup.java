/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc;

import fr.mleduc.ColdLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ColdLangStandaloneSetup extends ColdLangStandaloneSetupGenerated {
  public static void doSetup() {
    ColdLangStandaloneSetup _coldLangStandaloneSetup = new ColdLangStandaloneSetup();
    _coldLangStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
