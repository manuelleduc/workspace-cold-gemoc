package cst;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	cst.cstlang.exprconcern.ExprconcernPackage.eNS_URI,
    	cst.cstlang.exprconcern.ExprconcernPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor cstLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"cst.CstLang", "", "http://cst.cstlang/exprconcern/", "cst.CstLangMT"
    );
    cstLang.addAdapter("cst.CstLangMT", cst.cstlang.adapters.cstlangmt.CstLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"cst.CstLang",
    	cstLang
    );
    MelangeRegistry.ModelTypeDescriptor cstLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"cst.CstLangMT", "", "http://cst.cstlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"cst.CstLangMT",
    	cstLangMT
    );
  }
}
