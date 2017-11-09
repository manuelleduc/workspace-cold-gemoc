package varadd;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import varadd.varaddlangmt.exprconcern.ExprconcernFactory;

@SuppressWarnings("all")
public interface VarAddLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ExprconcernFactory getExprconcernFactory();
  
  public abstract void save(final String uri) throws IOException;
}
