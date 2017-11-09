package varlang.varlang.adapters.varlangmt.exprconcern;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory;
import varlang.varlangmt.exprconcern.ExprconcernFactory;
import varlang.varlangmt.exprconcern.ExprconcernPackage;
import varlang.varlangmt.exprconcern.Variable;

@SuppressWarnings("all")
public class ExprconcernFactoryAdapter extends EFactoryImpl implements ExprconcernFactory {
  private VarLangMTAdaptersFactory adaptersFactory = varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance();
  
  private varlang.varlang.exprconcern.ExprconcernFactory exprconcernAdaptee = varlang.varlang.exprconcern.ExprconcernFactory.eINSTANCE;
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(exprconcernAdaptee.createVariable(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExprconcernPackage();
  }
  
  public ExprconcernPackage getExprconcernPackage() {
    return varlang.varlangmt.exprconcern.ExprconcernPackage.eINSTANCE;
  }
}
