package add.addlangeval.adapters.addlangmt.expr_cst_add;

import add.addlangeval.expr_cst_add.Add;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AddAdapter extends EObjectAdapter<Add> implements add.addlangmt.expr_cst_add.Add {
  private add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory adaptersFactory;
  
  public AddAdapter() {
    super(add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public add.addlangmt.expr_cst_add.Expr getLeft() {
    return () adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final add.addlangmt.expr_cst_add.Expr o) {
    if (o != null)
    	adaptee.setLeft(((add.addlangeval.adapters.addlangmt.expr_cst_add.ExprAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public add.addlangmt.expr_cst_add.Expr getRight() {
    return () adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final add.addlangmt.expr_cst_add.Expr o) {
    if (o != null)
    	adaptee.setRight(((add.addlangeval.adapters.addlangmt.expr_cst_add.ExprAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return add.addlangmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getAdd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		return getLeft();
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		return getLeft() != null;
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		setLeft(
    		(add.addlangmt.expr_cst_add.Expr)
    		 newValue);
    		return;
    	case add.addlangmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		setRight(
    		(add.addlangmt.expr_cst_add.Expr)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
