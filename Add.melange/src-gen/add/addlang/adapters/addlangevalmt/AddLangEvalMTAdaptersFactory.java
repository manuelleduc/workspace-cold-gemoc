package add.addlang.adapters.addlangevalmt;

import add.addlang.expr_cst_add.Add;
import add.addlang.expr_cst_add.Cst;
import add.addlang.expr_cst_add.Expr;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class AddLangEvalMTAdaptersFactory implements AdaptersFactory {
  private static add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory instance;
  
  public static add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new add.addlang.adapters.addlangevalmt.AddLangEvalMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public AddLangEvalMTAdaptersFactory() {
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
  
  public add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangevalmt.expr_cst_add.ExprAdapter) adapter;
    }
  }
  
  public add.addlang.adapters.addlangevalmt.expr_cst_add.AddAdapter createAddAdapter(final Add adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangevalmt.expr_cst_add.AddAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangevalmt.expr_cst_add.AddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangevalmt.expr_cst_add.AddAdapter) adapter;
    }
  }
  
  public add.addlang.adapters.addlangevalmt.expr_cst_add.CstAdapter createCstAdapter(final Cst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (add.addlang.adapters.addlangevalmt.expr_cst_add.CstAdapter) adapter;
    else {
    	adapter = new add.addlang.adapters.addlangevalmt.expr_cst_add.CstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (add.addlang.adapters.addlangevalmt.expr_cst_add.CstAdapter) adapter;
    }
  }
}
