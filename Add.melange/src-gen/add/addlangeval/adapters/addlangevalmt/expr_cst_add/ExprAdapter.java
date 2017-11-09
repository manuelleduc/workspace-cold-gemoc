package add.addlangeval.adapters.addlangevalmt.expr_cst_add;

import add.addlangeval.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements add.addlangevalmt.expr_cst_add.Expr {
  private add.addlangeval.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(add.addlangeval.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlangeval.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getExpr();
  }
}
