package mult;

import fr.inria.diverse.melange.lib.IMetamodel;
import mult.MultLangMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MultLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MultLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MultLang mm = new MultLang();
    mm.setResource(res);
    return mm ;
  }
  
  public MultLangMT toMultLangMT() {
    mult.multlang.adapters.multlangmt.MultLangAdapter adaptee = new mult.multlang.adapters.multlangmt.MultLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
