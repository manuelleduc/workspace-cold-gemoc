package varlang.varlang.adapters.varlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory;
import varlang.varlang.exprconcern.Var;

@SuppressWarnings("all")
public class VarAdapter extends EObjectAdapter<Var> implements varlang.varlangmt.exprconcern.Var {
  private VarLangMTAdaptersFactory adaptersFactory;
  
  public VarAdapter() {
    super(varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance());
    adaptersFactory = varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return varlang.varlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case varlang.varlangmt.exprconcern.ExprconcernPackage.VAR__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case varlang.varlangmt.exprconcern.ExprconcernPackage.VAR__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case varlang.varlangmt.exprconcern.ExprconcernPackage.VAR__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
