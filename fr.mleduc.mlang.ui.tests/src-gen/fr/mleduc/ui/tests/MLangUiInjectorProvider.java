/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.mlang.ui.internal.MlangActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class MLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MlangActivator.getInstance().getInjector("fr.mleduc.MLang");
	}

}
