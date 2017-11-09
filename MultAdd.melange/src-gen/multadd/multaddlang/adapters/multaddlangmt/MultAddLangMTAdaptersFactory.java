package multadd.multaddlang.adapters.multaddlangmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.AddAdapter;
import multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.CstAdapter;
import multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter;
import multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.MultAdapter;
import multadd.multaddlang.expr_cst_mult_add.Add;
import multadd.multaddlang.expr_cst_mult_add.Cst;
import multadd.multaddlang.expr_cst_mult_add.Expr;
import multadd.multaddlang.expr_cst_mult_add.Mult;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MultAddLangMTAdaptersFactory implements AdaptersFactory {
  private static MultAddLangMTAdaptersFactory instance;
  
  public static MultAddLangMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new multadd.multaddlang.adapters.multaddlangmt.MultAddLangMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MultAddLangMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof multadd.multaddlang.expr_cst_mult_add.Add){
    	return createAddAdapter((multadd.multaddlang.expr_cst_mult_add.Add) o, res);
    }
    if (o instanceof multadd.multaddlang.expr_cst_mult_add.Mult){
    	return createMultAdapter((multadd.multaddlang.expr_cst_mult_add.Mult) o, res);
    }
    if (o instanceof multadd.multaddlang.expr_cst_mult_add.Cst){
    	return createCstAdapter((multadd.multaddlang.expr_cst_mult_add.Cst) o, res);
    }
    
    return null;
  }
  
  public ExprAdapter createExprAdapter(final Expr adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter) adapter;
    else {
    	adapter = new multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.ExprAdapter) adapter;
    }
  }
  
  public AddAdapter createAddAdapter(final Add adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.AddAdapter) adapter;
    else {
    	adapter = new multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.AddAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.AddAdapter) adapter;
    }
  }
  
  public MultAdapter createMultAdapter(final Mult adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.MultAdapter) adapter;
    else {
    	adapter = new multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.MultAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.MultAdapter) adapter;
    }
  }
  
  public CstAdapter createCstAdapter(final Cst adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.CstAdapter) adapter;
    else {
    	adapter = new multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.CstAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (multadd.multaddlang.adapters.multaddlangmt.expr_cst_mult_add.CstAdapter) adapter;
    }
  }
}
