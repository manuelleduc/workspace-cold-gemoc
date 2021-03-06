package cst;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface CstLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract cst.cstlangmt.exprconcern.ExprconcernFactory getExprconcernFactory();
  
  public abstract void save(final String uri) throws IOException;
}
