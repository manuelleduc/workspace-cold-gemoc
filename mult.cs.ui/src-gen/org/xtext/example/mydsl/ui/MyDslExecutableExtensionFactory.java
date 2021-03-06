/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import mult.cs.ui.internal.CsActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CsActivator.getInstance().getInjector(CsActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSL);
	}
	
}
