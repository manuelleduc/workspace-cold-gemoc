package multadd;

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
    	multadd.multaddlang.expr_cst_mult_add.Expr_cst_mult_addPackage.eNS_URI,
    	multadd.multaddlang.expr_cst_mult_add.Expr_cst_mult_addPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor multAddLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"multadd.MultAddLang", "", "http://multadd.multaddlang/expr_cst_mult_add/", "multadd.MultAddLangMT"
    );
    multAddLang.addAdapter("multadd.MultAddLangMT", multadd.multaddlang.adapters.multaddlangmt.MultAddLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"multadd.MultAddLang",
    	multAddLang
    );
    MelangeRegistry.ModelTypeDescriptor multAddLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"multadd.MultAddLangMT", "", "http://multadd.multaddlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"multadd.MultAddLangMT",
    	multAddLangMT
    );
  }
}
