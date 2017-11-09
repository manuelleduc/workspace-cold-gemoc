package add.addlang.adapters.addlangmt;

import add.addlang.adapters.addlangmt.expr_cst_add.AddAdapter;
import add.addlang.adapters.addlangmt.expr_cst_add.CstAdapter;
import add.addlang.adapters.addlangmt.expr_cst_add.ExprAdapter;
import add.addlang.expr_cst_add.Add;
import add.addlang.expr_cst_add.Cst;
import add.addlang.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class AddLangMTAdaptersFactory implements AdaptersFactory {
  private static AddLangMTAdaptersFactory instance;
  
  public static AddLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new add.addlang.adapters.addlangmt.AddLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public AddLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof add.addlang.expr_cst_add.Add){
    	return createAddAdapter((add.addlang.expr_cst_add.Add) o, res);
    }
    if (o instanceof add.addlang.expr_cst_add.Cst){
    	return createCstAdapter((add.addlang.expr_cst_add.Cst) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangmt.expr_cst_add.ExprAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangmt.expr_cst_add.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangmt.expr_cst_add.ExprAdapter) adapter;
    }
  }
  
  public AddAdapter createAddAdapter(final Add adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangmt.expr_cst_add.AddAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangmt.expr_cst_add.AddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangmt.expr_cst_add.AddAdapter) adapter;
    }
  }
  
  public CstAdapter createCstAdapter(final Cst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangmt.expr_cst_add.CstAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangmt.expr_cst_add.CstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangmt.expr_cst_add.CstAdapter) adapter;
    }
  }
}
