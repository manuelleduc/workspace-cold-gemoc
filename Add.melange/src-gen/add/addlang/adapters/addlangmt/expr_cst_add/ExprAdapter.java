package add.addlang.adapters.addlangmt.expr_cst_add;

import add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory;
import add.addlang.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements add.addlangmt.expr_cst_add.Expr {
  private AddLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return add.addlangmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getExpr();
  }
}
