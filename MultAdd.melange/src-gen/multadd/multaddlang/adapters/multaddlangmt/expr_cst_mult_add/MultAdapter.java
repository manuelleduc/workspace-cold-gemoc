package multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory;
import multadd.multaddlang.expr_cst_mult_add.Mult;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class MultAdapter extends EObjectAdapter<Mult> implements multadd.multaddlangmt.expr_cst_mult_add.Mult {
  private MultAddLangMTAdaptersFactory adaptersFactory;
  
  public MultAdapter() {
    super(multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Expr getLeft() {
    return () adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final multadd.multaddlangmt.expr_cst_mult_add.Expr o) {
    if (o != null)
    	adaptee.setLeft(((multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Expr getRight() {
    return () adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final multadd.multaddlangmt.expr_cst_mult_add.Expr o) {
    if (o != null)
    	adaptee.setRight(((multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public EClass eClass() {
    return multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.eINSTANCE.getMult();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__LEFT:
    		return getLeft();
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__RIGHT:
    		return getRight();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__LEFT:
    		return getLeft() != null;
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__RIGHT:
    		return getRight() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__LEFT:
    		setLeft(
    		(multadd.multaddlangmt.expr_cst_mult_add.Expr)
    		 newValue);
    		return;
    	case multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.MULT__RIGHT:
    		setRight(
    		(multadd.multaddlangmt.expr_cst_mult_add.Expr)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
