package varadd.varaddlang.adapters.varaddlangmt.exprconcern;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory;
import varadd.varaddlang.exprconcern.Expr;

@SuppressWarnings("all")
public class ExprAdapter extends EObjectAdapter<Expr> implements varadd.varaddlangmt.exprconcern.Expr {
  private VarAddLangMTAdaptersFactory adaptersFactory;
  
  public ExprAdapter() {
    super(varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance());
    adaptersFactory = varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public EClass eClass() {
    return varadd.varaddlangmt.exprconcern.ExprconcernPackage.eINSTANCE.getExpr();
  }
}
