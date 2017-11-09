package multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory;
import multadd.multaddlang.expr_cst_mult_add.Expr;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements multadd.multaddlangmt.expr_cst_mult_add.Expr {
  private MultAddLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage.eINSTANCE.getExpr();
  }
}
