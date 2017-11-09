package cst.cstlang.adapters.cstlangmt;

import cst.CstLangMT;
import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class CstLangAdapter extends ResourceAdapter implements CstLangMT {
  public CstLangAdapter() {
    super(cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public cst.cstlangmt.exprconcern.ExprconcernFactory getExprconcernFactory() {
    return new cst.cstlang.adapters.cstlangmt.exprconcern.ExprconcernFactoryAdapter();
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
