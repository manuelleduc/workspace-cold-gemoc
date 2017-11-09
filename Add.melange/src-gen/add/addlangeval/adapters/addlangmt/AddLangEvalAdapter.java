package add.addlangeval.adapters.addlangmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class AddLangEvalAdapter extends ResourceAdapter implements add.AddLangMT {
  public AddLangEvalAdapter() {
    super(add.addlangeval.adapters.addlangmt.AddLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public add.addlangmt.expr_cst_add.Expr_cst_addFactory getExpr_cst_addFactory() {
    return new add.addlangeval.adapters.addlangmt.expr_cst_add.Expr_cst_addFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getExpr_cst_addFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
