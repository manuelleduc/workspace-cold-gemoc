package fr.mleduc.tests;

import com.google.inject.Injector;
import fr.mleduc.tests.MLangInjectorProvider;
import fr.mleduc.tests.MMLangInjectorProvider;

@SuppressWarnings("all")
public class NewInjector extends MMLangInjectorProvider {
  @Override
  protected Injector internalCreateInjector() {
    MLangInjectorProvider _mLangInjectorProvider = new MLangInjectorProvider();
    _mLangInjectorProvider.getInjector();
    return super.internalCreateInjector();
  }
}
