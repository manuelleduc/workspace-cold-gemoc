package multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add;

import multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory;
import multadd.multaddlang.expr_cst_mult_add.Expr_cst_mult_addFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class Expr_cst_mult_addFactoryAdapter extends EFactoryImpl implements multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addFactory {
  private MultAddLangMTAdaptersFactory adaptersFactory = multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance();
  
  private Expr_cst_mult_addFactory expr_cst_mult_addAdaptee = multadd.multaddlang.expr_cst_mult_add.Expr_cst_mult_addFactory.eINSTANCE;
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Add createAdd() {
    return adaptersFactory.createAddAdapter(expr_cst_mult_addAdaptee.createAdd(), null);
  }
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Mult createMult() {
    return adaptersFactory.createMultAdapter(expr_cst_mult_addAdaptee.createMult(), null);
  }
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Cst createCst() {
    return adaptersFactory.createCstAdapter(expr_cst_mult_addAdaptee.createCst(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getExpr_cst_mult_addPackage();
  }
  
  public multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage getExpr_cst_mult_addPackage() {
    return multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.eINSTANCE;
  }
}
