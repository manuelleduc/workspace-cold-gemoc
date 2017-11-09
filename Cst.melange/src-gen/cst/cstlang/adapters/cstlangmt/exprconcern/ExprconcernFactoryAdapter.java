package cst.cstlang.adapters.cstlangmt.exprconcern;

import cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory;
import cst.cstlang.exprconcern.ExprconcernFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ExprconcernFactoryAdapter extends EFactoryImpl implements cst.cstlangmt.exprconcern.ExprconcernFactory {
  private CstLangMTAdaptersFactory adaptersFactory = cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance();
  
  private ExprconcernFactory exprconcernAdaptee = cst.cstlang.exprconcern.ExprconcernFactory.eINSTANCE;
  
  @Override
  public cst.cstlangmt.exprconcern.Cst createCst() {
    return adaptersFactory.createCstAdapter(exprconcernAdaptee.createCst(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExprconcernPackage();
  }
  
  public cst.cstlangmt.exprconcern.ExprconcernPackage getExprconcernPackage() {
    return cst.cstlangmt.exprconcern.ExprconcernPackage.eINSTANCE;
  }
}
