/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.cold.ui.internal.ColdActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ColdLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ColdActivator.getInstance().getInjector("fr.mleduc.ColdLang");
	}

}
