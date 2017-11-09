package add;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface AddLangEvalMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract add.addlangevalmt.expr_cst_add.Expr_cst_addFactory getExpr_cst_addFactory();
  
  public abstract void save(final String uri) throws IOException;
}
