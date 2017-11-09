package cst.cstlang.adapters.cstlangmt;

import cst.cstlang.adapters.cstlangmt.exprconcern.CstAdapter;
import cst.cstlang.adapters.cstlangmt.exprconcern.ExprAdapter;
import cst.cstlang.exprconcern.Cst;
import cst.cstlang.exprconcern.Expr;
import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class CstLangMTAdaptersFactory implements AdaptersFactory {
  private static CstLangMTAdaptersFactory instance;
  
  public static CstLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new cst.cstlang.adapters.cstlangmt.CstLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public CstLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof cst.cstlang.exprconcern.Cst){
    	return createCstAdapter((cst.cstlang.exprconcern.Cst) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (cst.cstlang.adapters.cstlangmt.exprconcern.ExprAdapter) adapter;
    else {
    	adapter = new cst.cstlang.adapters.cstlangmt.exprconcern.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (cst.cstlang.adapters.cstlangmt.exprconcern.ExprAdapter) adapter;
    }
  }
  
  public CstAdapter createCstAdapter(final Cst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (cst.cstlang.adapters.cstlangmt.exprconcern.CstAdapter) adapter;
    else {
    	adapter = new cst.cstlang.adapters.cstlangmt.exprconcern.CstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (cst.cstlang.adapters.cstlangmt.exprconcern.CstAdapter) adapter;
    }
  }
}
