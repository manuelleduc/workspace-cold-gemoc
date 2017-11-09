package mult.multlang.adapters.multlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import mult.multlang.adapters.multlangmt.exprconcern.CstAdapter;
import mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter;
import mult.multlang.adapters.multlangmt.exprconcern.MultAdapter;
import mult.multlang.exprconcern.Cst;
import mult.multlang.exprconcern.Expr;
import mult.multlang.exprconcern.Mult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MultLangMTAdaptersFactory implements AdaptersFactory {
  private static MultLangMTAdaptersFactory instance;
  
  public static MultLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new mult.multlang.adapters.multlangmt.MultLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MultLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof mult.multlang.exprconcern.Mult){
    	return createMultAdapter((mult.multlang.exprconcern.Mult) o, res);
    }
    if (o instanceof mult.multlang.exprconcern.Cst){
    	return createCstAdapter((mult.multlang.exprconcern.Cst) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter) adapter;
    else {
    	adapter = new mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (mult.multlang.adapters.multlangmt.exprconcern.ExprAdapter) adapter;
    }
  }
  
  public MultAdapter createMultAdapter(final Mult adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (mult.multlang.adapters.multlangmt.exprconcern.MultAdapter) adapter;
    else {
    	adapter = new mult.multlang.adapters.multlangmt.exprconcern.MultAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (mult.multlang.adapters.multlangmt.exprconcern.MultAdapter) adapter;
    }
  }
  
  public CstAdapter createCstAdapter(final Cst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (mult.multlang.adapters.multlangmt.exprconcern.CstAdapter) adapter;
    else {
    	adapter = new mult.multlang.adapters.multlangmt.exprconcern.CstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (mult.multlang.adapters.multlangmt.exprconcern.CstAdapter) adapter;
    }
  }
}
