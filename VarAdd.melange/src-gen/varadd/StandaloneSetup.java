package varadd;

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
    	varadd.varaddlang.exprconcern.ExprconcernPackage.eNS_URI,
    	varadd.varaddlang.exprconcern.ExprconcernPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor varAddLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"varadd.VarAddLang", "", "http://varadd.varaddlang/exprconcern/", "varadd.VarAddLangMT"
    );
    varAddLang.addAdapter("varadd.VarAddLangMT", varadd.varaddlang.adapters.varaddlangmt.VarAddLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"varadd.VarAddLang",
    	varAddLang
    );
    MelangeRegistry.ModelTypeDescriptor varAddLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"varadd.VarAddLangMT", "", "http://varadd.varaddlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"varadd.VarAddLangMT",
    	varAddLangMT
    );
  }
}
