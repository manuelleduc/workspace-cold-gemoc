package mult.multlang.adapters.multlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory;
import mult.multlang.exprconcern.Expr;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements mult.multlangmt.exprconcern.Expr {
  private MultLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance());
    adaptersFactory = mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return mult.multlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getExpr();
  }
}
