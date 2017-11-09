package add;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class AddLangEval implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static add.AddLangEval load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    AddLangEval mm = new AddLangEval();
    mm.setResource(res);
    return mm ;
  }
  
  public add.AddLangMT toAddLangMT() {
    add.addlangeval.adapters.addlangmt.AddLangEvalAdapter adaptee = new add.addlangeval.adapters.addlangmt.AddLangEvalAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public add.AddLangEvalMT toAddLangEvalMT() {
    add.addlangeval.adapters.addlangevalmt.AddLangEvalAdapter adaptee = new add.addlangeval.adapters.addlangevalmt.AddLangEvalAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
