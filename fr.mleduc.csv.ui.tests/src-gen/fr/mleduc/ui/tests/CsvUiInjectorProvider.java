/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.csv.ui.internal.CsvActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class CsvUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CsvActivator.getInstance().getInjector("fr.mleduc.Csv");
	}

}
