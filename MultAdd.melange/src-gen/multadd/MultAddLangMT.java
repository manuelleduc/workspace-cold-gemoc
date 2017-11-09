package multadd;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MultAddLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addFactory getExpr_cst_mult_addFactory();
  
  public abstract void save(final String uri) throws IOException;
}
