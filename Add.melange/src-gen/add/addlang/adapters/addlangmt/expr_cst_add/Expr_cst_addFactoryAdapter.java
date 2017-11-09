package add.addlang.adapters.addlangmt.expr_cst_add;

import add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory;
import add.addlang.expr_cst_add.Expr_cst_addFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class Expr_cst_addFactoryAdapter extends EFactoryImpl implements add.addlangmt.expr_cst_add.Expr_cst_addFactory {
  private AddLangMTAdaptersFactory adaptersFactory = add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance();
  
  private Expr_cst_addFactory expr_cst_addAdaptee = add.addlang.expr_cst_add.Expr_cst_addFactory.eINSTANCE;
  
  @Override
  public add.addlangmt.expr_cst_add.Add createAdd() {
    return adaptersFactory.createAddAdapter(expr_cst_addAdaptee.createAdd(), null);
  }
  
  @Override
  public add.addlangmt.expr_cst_add.Cst createCst() {
    return adaptersFactory.createCstAdapter(expr_cst_addAdaptee.createCst(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExpr_cst_addPackage();
  }
  
  public add.addlangmt.expr_cst_add.Expr_cst_addPackage getExpr_cst_addPackage() {
    return add.addlangmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE;
  }
}
