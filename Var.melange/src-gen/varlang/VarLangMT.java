package varlang;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import varlang.varlangmt.exprconcern.ExprconcernFactory;

@SuppressWarnings("all")
public interface VarLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ExprconcernFactory getExprconcernFactory();
  
  public abstract void save(final String uri) throws IOException;
}
