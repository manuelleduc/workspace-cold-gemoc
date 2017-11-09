package mult;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MultLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract mult.multlangmt.exprconcern.ExprconcernFactory getExprconcernFactory();
  
  public abstract void save(final String uri) throws IOException;
}
