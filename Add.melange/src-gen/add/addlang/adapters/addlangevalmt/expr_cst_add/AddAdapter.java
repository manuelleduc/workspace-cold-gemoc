package add.addlang.adapters.addlangevalmt.expr_cst_add;

import add.addlang.expr_cst_add.Add;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class AddAdapter extends EObjectAdapter<Add> implements add.addlangevalmt.expr_cst_add.Add {
  private add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory adaptersFactory;
  
  public AddAdapter() {
    super(add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance();
  }
  
  @Override
  public add.addlangevalmt.expr_cst_add.Expr getLeft() {
    return () adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final add.addlangevalmt.expr_cst_add.Expr o) {
    if (o != null)
    	adaptee.setLeft(((add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public add.addlangevalmt.expr_cst_add.Expr getRight() {
    return () adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final add.addlangevalmt.expr_cst_add.Expr o) {
    if (o != null)
    	adaptee.setRight(((add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getAdd();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		return getLeft();
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		return getLeft() != null;
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__LEFT:
    		setLeft(
    		(add.addlangevalmt.expr_cst_add.Expr)
    		 newValue);
    		return;
    	case add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.ADD__RIGHT:
    		setRight(
    		(add.addlangevalmt.expr_cst_add.Expr)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
