package varlang.varlang.adapters.varlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import varlang.varlang.adapters.varlangmt.exprconcern.ExprAdapter;
import varlang.varlang.adapters.varlangmt.exprconcern.VariableAdapter;
import varlang.varlang.exprconcern.Expr;
import varlang.varlang.exprconcern.Variable;

@SuppressWarnings("all")
public class VarLangMTAdaptersFactory implements AdaptersFactory {
  private static VarLangMTAdaptersFactory instance;
  
  public static VarLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new varlang.varlang.adapters.varlangmt.VarLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public VarLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof varlang.varlang.exprconcern.Variable){
    	return createVariableAdapter((varlang.varlang.exprconcern.Variable) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (varlang.varlang.adapters.varlangmt.exprconcern.ExprAdapter) adapter;
    else {
    	adapter = new varlang.varlang.adapters.varlangmt.exprconcern.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (varlang.varlang.adapters.varlangmt.exprconcern.ExprAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (varlang.varlang.adapters.varlangmt.exprconcern.VariableAdapter) adapter;
    else {
    	adapter = new varlang.varlang.adapters.varlangmt.exprconcern.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (varlang.varlang.adapters.varlangmt.exprconcern.VariableAdapter) adapter;
    }
  }
}
