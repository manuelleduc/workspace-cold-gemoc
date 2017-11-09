package multadd.multaddlang.adapters.multaddlangmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import multadd.MultAddLangMT;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class MultAddLangAdapter extends ResourceAdapter implements MultAddLangMT {
  public MultAddLangAdapter() {
    super(multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addFactory getExpr_cst_mult_addFactory() {
    return new multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getExpr_cst_mult_addFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
