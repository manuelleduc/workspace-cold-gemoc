package mult;

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
    	mult.multlang.exprconcern.ExprconcernPackage.eNS_URI,
    	mult.multlang.exprconcern.ExprconcernPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor multLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"mult.MultLang", "", "http://mult.multlang/exprconcern/", "mult.MultLangMT"
    );
    multLang.addAdapter("mult.MultLangMT", mult.multlang.adapters.multlangmt.MultLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"mult.MultLang",
    	multLang
    );
    MelangeRegistry.ModelTypeDescriptor multLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"mult.MultLangMT", "", "http://mult.multlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"mult.MultLangMT",
    	multLangMT
    );
  }
}
