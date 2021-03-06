/*
 * generated by Xtext 2.10.0
 */
package varadd.cs.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import varadd.cs.ui.internal.CsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VarAddLangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CsActivator.getInstance().getInjector(CsActivator.VARADD_CS_VARADDLANG);
	}
	
}
