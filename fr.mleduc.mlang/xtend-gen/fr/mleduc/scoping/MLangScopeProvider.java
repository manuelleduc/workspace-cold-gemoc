/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.scoping;

import com.google.common.base.Objects;
import fr.mleduc.mLang.Instance;
import fr.mleduc.mLang.MLangPackage;
import fr.mleduc.mLang.Model;
import fr.mleduc.mMLang.Field;
import fr.mleduc.mMLang.Metamodel;
import fr.mleduc.scoping.AbstractMLangScopeProvider;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MLangScopeProvider extends AbstractMLangScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    EReference _instance_Type = MLangPackage.eINSTANCE.getInstance_Type();
    boolean _equals = Objects.equal(reference, _instance_Type);
    if (_equals) {
      IScope _xblockexpression = null;
      {
        EObject _rootContainer = EcoreUtil2.getRootContainer(context);
        Metamodel _metamodel = ((Model) _rootContainer).getMetamodel();
        EList<fr.mleduc.mMLang.Class> _classes = _metamodel.getClasses();
        final Function1<fr.mleduc.mMLang.Class, IEObjectDescription> _function = (fr.mleduc.mMLang.Class it) -> {
          String _name = it.getName();
          return EObjectDescription.create(_name, it);
        };
        final List<IEObjectDescription> types = ListExtensions.<fr.mleduc.mMLang.Class, IEObjectDescription>map(_classes, _function);
        IScope _scope = super.getScope(context, reference);
        _xblockexpression = MapBasedScope.createScope(_scope, types);
      }
      _xifexpression = _xblockexpression;
    } else {
      IScope _xifexpression_1 = null;
      EReference _field_Key = MLangPackage.eINSTANCE.getField_Key();
      boolean _equals_1 = Objects.equal(reference, _field_Key);
      if (_equals_1) {
        IScope _xblockexpression_1 = null;
        {
          EObject _eContainer = context.eContainer();
          fr.mleduc.mMLang.Class _type = ((Instance) _eContainer).getType();
          EList<Field> _fields = _type.getFields();
          final Function1<Field, IEObjectDescription> _function = (Field it) -> {
            String _name = it.getName();
            return EObjectDescription.create(_name, it);
          };
          final List<IEObjectDescription> fields = ListExtensions.<Field, IEObjectDescription>map(_fields, _function);
          IScope _scope = super.getScope(context, reference);
          _xblockexpression_1 = MapBasedScope.createScope(_scope, fields);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        _xifexpression_1 = super.getScope(context, reference);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
