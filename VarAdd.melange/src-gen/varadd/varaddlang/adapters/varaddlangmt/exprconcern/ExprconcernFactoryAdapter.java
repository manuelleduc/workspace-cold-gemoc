package varadd.varaddlang.adapters.varaddlangmt.exprconcern;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory;
import varadd.varaddlangmt.exprconcern.Add;
import varadd.varaddlangmt.exprconcern.ExprconcernFactory;
import varadd.varaddlangmt.exprconcern.ExprconcernPackage;
import varadd.varaddlangmt.exprconcern.Variable;

@SuppressWarnings("all")
public class ExprconcernFactoryAdapter extends EFactoryImpl implements ExprconcernFactory {
  private VarAddLangMTAdaptersFactory adaptersFactory = varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance();
  
  private varadd.varaddlang.exprconcern.ExprconcernFactory exprconcernAdaptee = varadd.varaddlang.exprconcern.ExprconcernFactory.eINSTANCE;
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(exprconcernAdaptee.createVariable(), null);
  }
  
  @Override
  public Add createAdd() {
    return adaptersFactory.createAddAdapter(exprconcernAdaptee.createAdd(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExprconcernPackage();
  }
  
  public ExprconcernPackage getExprconcernPackage() {
    return varadd.varaddlangmt.exprconcern.ExprconcernPackage.eINSTANCE;
  }
}
