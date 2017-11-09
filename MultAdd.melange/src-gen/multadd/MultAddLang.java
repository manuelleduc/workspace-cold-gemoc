package multadd;

import fr.inria.diverse.melange.lib.IMetamodel;
import multadd.MultAddLangMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MultAddLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MultAddLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MultAddLang mm = new MultAddLang();
    mm.setResource(res);
    return mm ;
  }
  
  public MultAddLangMT toMultAddLangMT() {
    multadd.multaddlang.adapters.multaddlangmt.MultAddLangAdapter adaptee = new multadd.multaddlang.adapters.multaddlangmt.MultAddLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
