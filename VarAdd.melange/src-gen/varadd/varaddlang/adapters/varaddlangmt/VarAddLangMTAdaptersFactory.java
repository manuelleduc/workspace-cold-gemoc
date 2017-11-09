package varadd.varaddlang.adapters.varaddlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import varadd.varaddlang.adapters.varaddlangmt.exprconcern.AddAdapter;
import varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter;
import varadd.varaddlang.adapters.varaddlangmt.exprconcern.VariableAdapter;
import varadd.varaddlang.exprconcern.Add;
import varadd.varaddlang.exprconcern.Expr;
import varadd.varaddlang.exprconcern.Variable;

@SuppressWarnings("all")
public class VarAddLangMTAdaptersFactory implements AdaptersFactory {
  private static VarAddLangMTAdaptersFactory instance;
  
  public static VarAddLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new varadd.varaddlang.adapters.varaddlangmt.VarAddLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public VarAddLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof varadd.varaddlang.exprconcern.Variable){
    	return createVariableAdapter((varadd.varaddlang.exprconcern.Variable) o, res);
    }
    if (o instanceof varadd.varaddlang.exprconcern.Add){
    	return createAddAdapter((varadd.varaddlang.exprconcern.Add) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter) adapter;
    else {
    	adapter = new varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.ExprAdapter) adapter;
    }
  }
  
  public VariableAdapter createVariableAdapter(final Variable adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.VariableAdapter) adapter;
    else {
    	adapter = new varadd.varaddlang.adapters.varaddlangmt.exprconcern.VariableAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.VariableAdapter) adapter;
    }
  }
  
  public AddAdapter createAddAdapter(final Add adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.AddAdapter) adapter;
    else {
    	adapter = new varadd.varaddlang.adapters.varaddlangmt.exprconcern.AddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (varadd.varaddlang.adapters.varaddlangmt.exprconcern.AddAdapter) adapter;
    }
  }
}
