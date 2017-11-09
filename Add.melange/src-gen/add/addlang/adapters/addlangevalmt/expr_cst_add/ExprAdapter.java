package add.addlang.adapters.addlangevalmt.expr_cst_add;

import add.addlang.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements add.addlangevalmt.expr_cst_add.Expr {
  private add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance());
    adaptersFactory = add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return add.addlangevalmt.expr_cst_add.Expr_cst_addPackage.eINSTANCE.getExpr();
  }
}
