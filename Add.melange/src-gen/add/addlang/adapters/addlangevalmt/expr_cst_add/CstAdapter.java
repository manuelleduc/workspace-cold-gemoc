package add.addlang.adapters.addlangevalmt.expr_cst_add;

import add.addlang.expr_cst_add.Cst;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class CstAdapter extends EObjectAdapter<Cst> implements add.addlangevalmt.expr_cst_add.Cst {
  private add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory adaptersFactory;
  
  public CstAdapter() {
    super(add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance();
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
    return add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getCst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.CST__VALUE:
    		return new java.lang.Long(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.CST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.CST__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
