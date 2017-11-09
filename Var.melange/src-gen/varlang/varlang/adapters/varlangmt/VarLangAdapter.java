package varlang.varlang.adapters.varlangmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import varlang.VarLangMT;
import varlang.varlangmt.exprconcern.ExprconcernFactory;

@SuppressWarnings("all")
public class VarLangAdapter extends ResourceAdapter implements VarLangMT {
  public VarLangAdapter() {
    super(varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ExprconcernFactory getExprconcernFactory() {
    return new varlang.varlang.adapters.varlangmt.exprconcern.ExprconcernFactoryAdapter();
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
