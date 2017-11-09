package varadd.varaddlang.adapters.varaddlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory;
import varadd.varaddlang.exprconcern.Variable;

@SuppressWarnings("all")
public class VariableAdapter extends EObjectAdapter<Variable> implements varadd.varaddlangmt.exprconcern.Variable {
  private VarAddLangMTAdaptersFactory adaptersFactory;
  
  public VariableAdapter() {
    super(varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance();
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
    return varadd.varaddlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getVariable();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.VARIABLE__NAME:
    		return getName();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.VARIABLE__NAME:
    		return getName() != NAME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.VARIABLE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
