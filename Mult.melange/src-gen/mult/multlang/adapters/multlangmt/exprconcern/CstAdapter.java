package mult.multlang.adapters.multlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory;
import mult.multlang.exprconcern.Cst;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class CstAdapter extends EObjectAdapter<Cst> implements mult.multlangmt.exprconcern.Cst {
  private MultLangMTAdaptersFactory adaptersFactory;
  
  public CstAdapter() {
    super(mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance());
    adaptersFactory = mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance();
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
    return mult.multlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getCst();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		return new java.lang.Long(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.CST__VALUE:
    		setValue(((java.lang.Long) newValue).longValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
