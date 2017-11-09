package cst.cstlang.adapters.cstlangmt.exprconcern;

import cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory;
import cst.cstlang.exprconcern.Expr;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements cst.cstlangmt.exprconcern.Expr {
  private CstLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance());
    adaptersFactory = cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return cst.cstlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getExpr();
  }
}
