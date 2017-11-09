package mult.multlang.adapters.multlangmt.exprconcern;

import mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory;
import mult.multlang.exprconcern.ExprconcernFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ExprconcernFactoryAdapter extends EFactoryImpl implements mult.multlangmt.exprconcern.ExprconcernFactory {
  private MultLangMTAdaptersFactory adaptersFactory = mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance();
  
  private ExprconcernFactory exprconcernAdaptee = mult.multlang.exprconcern.ExprconcernFactory.eINSTANCE;
  
  @Override
  public mult.multlangmt.exprconcern.Mult createMult() {
    return adaptersFactory.createMultAdapter(exprconcernAdaptee.createMult(), null);
  }
  
  @Override
  public mult.multlangmt.exprconcern.Cst createCst() {
    return adaptersFactory.createCstAdapter(exprconcernAdaptee.createCst(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExprconcernPackage();
  }
  
  public mult.multlangmt.exprconcern.ExprconcernPackage getExprconcernPackage() {
    return mult.multlangmt.exprconcern.ExprconcernPackage.eINSTANCE;
  }
}
