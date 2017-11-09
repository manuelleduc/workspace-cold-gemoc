package mult.multlang.adapters.multlangmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import mult.MultLangMT;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class MultLangAdapter extends ResourceAdapter implements MultLangMT {
  public MultLangAdapter() {
    super(mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory.getInstance());
  }
  
  @Override
  public mult.multlangmt.exprconcern.ExprconcernFactory getExprconcernFactory() {
    return new mult.multlang.adapters.multlangmt.exprconcern.ExprconcernFactoryAdapter();
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
