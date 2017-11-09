package varlang;

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
    	varlang.varlang.exprconcern.ExprconcernPackage.eNS_URI,
    	varlang.varlang.exprconcern.ExprconcernPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor varLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"varlang.VarLang", "", "http://varlang.varlang/exprconcern/", "varlang.VarLangMT"
    );
    varLang.addAdapter("varlang.VarLangMT", varlang.varlang.adapters.varlangmt.VarLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"varlang.VarLang",
    	varLang
    );
    MelangeRegistry.ModelTypeDescriptor varLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"varlang.VarLangMT", "", "http://varlang.varlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"varlang.VarLangMT",
    	varLangMT
    );
  }
}
