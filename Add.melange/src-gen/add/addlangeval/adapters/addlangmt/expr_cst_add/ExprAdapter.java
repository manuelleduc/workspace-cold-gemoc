package add.addlangeval.adapters.addlangmt.expr_cst_add;

import add.addlangeval.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements add.addlangmt.expr_cst_add.Expr {
  private add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return add.addlangmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getExpr();
  }
}
