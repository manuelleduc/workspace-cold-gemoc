package cst.cstlang.adapters.cstlangmt.exprconcern;

import cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory;
import cst.cstlang.exprconcern.Cst;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class CstAdapter extends EObjectAdapter<Cst> implements cst.cstlangmt.exprconcern.Cst {
  private CstLangMTAdaptersFactory adaptersFactory;
  
  public CstAdapter() {
    super(cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance());
    adaptersFactory = cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance();
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
    return cst.cstlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getCst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case cst.cstlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		return new java.lang.Long(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case cst.cstlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case cst.cstlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
