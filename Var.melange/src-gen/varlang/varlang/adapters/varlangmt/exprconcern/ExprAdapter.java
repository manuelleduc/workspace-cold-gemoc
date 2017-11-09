package varlang.varlang.adapters.varlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory;
import varlang.varlang.exprconcern.Expr;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements varlang.varlangmt.exprconcern.Expr {
  private VarLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance());
    adaptersFactory = varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return varlang.varlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getExpr();
  }
}
