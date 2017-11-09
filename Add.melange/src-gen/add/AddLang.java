package add;

import add.AddLangMT;
import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class AddLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static AddLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    AddLang mm = new AddLang();
    mm.setResource(res);
    return mm ;
  }
  
  public AddLangMT toAddLangMT() {
    add.addlang.adapters.addlangmt.AddLangAdapter adaptee = new add.addlang.adapters.addlangmt.AddLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
