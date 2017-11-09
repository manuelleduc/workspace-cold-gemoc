package multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory;
import multadd.multaddlang.expr_cst_mult_add.Cst;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class CstAdapter extends EObjectAdapter<Cst> implements multadd.multaddlangmt.expr_cst_mult_add.Cst {
  private MultAddLangMTAdaptersFactory adaptersFactory;
  
  public CstAdapter() {
    super(multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public long getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final long o) {
    adaptee.setValue(o);
  }
  
  protected final static long VALUE_EDEFAULT = 0L;
  
  @Override
  public EClass eClass() {
    return multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.eINSTANCE.getCst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.CST__VALUE:
    		return new java.lang.Long(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.CST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.CST__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
