/**
 * generated by Xtext 2.10.0
 */
package variable.cs;

import variable.cs.VarLangStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class VarLangStandaloneSetup extends VarLangStandaloneSetupGenerated {
  public static void doSetup() {
    VarLangStandaloneSetup _varLangStandaloneSetup = new VarLangStandaloneSetup();
    _varLangStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}