package add;

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
    	add.addlang.expr_cst_add.Expr_cst_addPackage.eNS_URI,
    	add.addlang.expr_cst_add.Expr_cst_addPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor addLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"add.AddLang", "", "http://add.addlang/expr_cst_add/", "add.AddLangMT"
    );
    addLang.addAdapter("add.AddLangMT", add.addlang.adapters.addlangmt.AddLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"add.AddLang",
    	addLang
    );
    MelangeRegistry.ModelTypeDescriptor addLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"add.AddLangMT", "", "http://add.addlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"add.AddLangMT",
    	addLangMT
    );
  }
}
