package add.addlang.adapters.addlangevalmt.expr_cst_add;

import add.addlang.expr_cst_add.Expr_cst_addFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class Expr_cst_addFactoryAdapter extends EFactoryImpl implements add.addlangevalmt.expr_cst_add.Expr_cst_addFactory {
  private add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory adaptersFactory = add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance();
  
  private Expr_cst_addFactory expr_cst_addAdaptee = add.addlang.expr_cst_add.Expr_cst_addFactory.eINSTANCE;
  
  @Override
  public add.addlangevalmt.expr_cst_add.Add createAdd() {
    return adaptersFactory.createAddAdapter(expr_cst_addAdaptee.createAdd(), null);
  }
  
  @Override
  public add.addlangevalmt.expr_cst_add.Cst createCst() {
    return adaptersFactory.createCstAdapter(expr_cst_addAdaptee.createCst(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExpr_cst_addPackage();
  }
  
  public add.addlangevalmt.expr_cst_add.Expr_cst_addPackage getExpr_cst_addPackage() {
    return add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE;
  }
}
