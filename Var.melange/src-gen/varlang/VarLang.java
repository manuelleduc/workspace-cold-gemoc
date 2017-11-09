package varlang;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import varlang.VarLangMT;

@SuppressWarnings("all")
public class VarLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static VarLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    VarLang mm = new VarLang();
    mm.setResource(res);
    return mm ;
  }
  
  public VarLangMT toVarLangMT() {
    varlang.varlang.adapters.varlangmt.VarLangAdapter adaptee = new varlang.varlang.adapters.varlangmt.VarLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
