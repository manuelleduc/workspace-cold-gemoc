package mult.multlang.adapters.multlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory;
import mult.multlang.exprconcern.Mult;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MultAdapter extends EObjectAdapter<Mult> implements mult.multlangmt.exprconcern.Mult {
  private MultLangMTAdaptersFactory adaptersFactory;
  
  public MultAdapter() {
    super(mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance());
    adaptersFactory = mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public mult.multlangmt.exprconcern.Expr getLeft() {
    return () adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final mult.multlangmt.exprconcern.Expr o) {
    if (o != null)
    	adaptee.setLeft(((mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public mult.multlangmt.exprconcern.Expr getRight() {
    return () adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final mult.multlangmt.exprconcern.Expr o) {
    if (o != null)
    	adaptee.setRight(((mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return mult.multlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getMult();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__LEFT:
    		return getLeft();
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__LEFT:
    		return getLeft() != null;
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__LEFT:
    		setLeft(
    		(mult.multlangmt.exprconcern.Expr)
    		 newValue);
    		return;
    	case mult.multlangmt.exprconcern.ExprconcernPackage.MULT__RIGHT:
    		setRight(
    		(mult.multlangmt.exprconcern.Expr)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
