package varadd;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import varadd.VarAddLangMT;

@SuppressWarnings("all")
public class VarAddLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static VarAddLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    VarAddLang mm = new VarAddLang();
    mm.setResource(res);
    return mm ;
  }
  
  public VarAddLangMT toVarAddLangMT() {
    varadd.varaddlang.adapters.varaddlangmt.VarAddLangAdapter adaptee = new varadd.varaddlang.adapters.varaddlangmt.VarAddLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
