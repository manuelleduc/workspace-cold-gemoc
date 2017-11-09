package varadd.varaddlang.adapters.varaddlangmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import varadd.VarAddLangMT;
import varadd.varaddlangmt.exprconcern.ExprconcernFactory;

@SuppressWarnings("all")
public class VarAddLangAdapter extends ResourceAdapter implements VarAddLangMT {
  public VarAddLangAdapter() {
    super(varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ExprconcernFactory getExprconcernFactory() {
    return new varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprconcernFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getExprconcernFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
