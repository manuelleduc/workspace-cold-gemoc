/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ui;

import com.google.inject.Injector;
import fr.mleduc.cold.ui.internal.ColdActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ColdLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ColdActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ColdActivator.getInstance().getInjector(ColdActivator.FR_MLEDUC_COLDLANG);
	}
	
}
