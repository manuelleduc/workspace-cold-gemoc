package varadd.varaddlang.adapters.varaddlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory;
import varadd.varaddlang.exprconcern.Add;
import varadd.varaddlangmt.exprconcern.Expr;

@SuppressWarnings("all")
public class AddAdapter extends EObjectAdapter<Add> implements varadd.varaddlangmt.exprconcern.Add {
  private VarAddLangMTAdaptersFactory adaptersFactory;
  
  public AddAdapter() {
    super(varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public Expr getLeft() {
    return (Expr) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final Expr o) {
    if (o != null)
    	adaptee.setLeft(((varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public Expr getRight() {
    return (Expr) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final Expr o) {
    if (o != null)
    	adaptee.setRight(((varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return varadd.varaddlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getAdd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__LEFT:
    		return getLeft();
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__LEFT:
    		return getLeft() != null;
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__LEFT:
    		setLeft(
    		(varadd.varaddlangmt.exprconcern.Expr)
    		 newValue);
    		return;
    	case varadd.varaddlangmt.exprconcern.ExprconcernPackage.ADD__RIGHT:
    		setRight(
    		(varadd.varaddlangmt.exprconcern.Expr)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
