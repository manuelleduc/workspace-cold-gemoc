package fr.mleduc.util;

import com.google.common.base.Objects;
import fr.mleduc.explicitOperations.And;
import fr.mleduc.explicitOperations.AtomicFeature;
import fr.mleduc.explicitOperations.Equiv;
import fr.mleduc.explicitOperations.ExplicitOperationsFactory;
import fr.mleduc.explicitOperations.Feature;
import fr.mleduc.explicitOperations.Imply;
import fr.mleduc.explicitOperations.Not;
import fr.mleduc.explicitOperations.OneOf;
import fr.mleduc.explicitOperations.Or;
import fr.mleduc.explicitOperations.Proposition;
import fr.mleduc.explicitOperations.SomeOf;
import fr.mleduc.explicitOperations.Variable;
import fr.mleduc.util.PrettyPrintProposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FM2Proposition {
  @Inject
  @Extension
  private PrettyPrintProposition _prettyPrintProposition;
  
  public Variable proposition(final Feature p) {
    Variable _createVariable = ExplicitOperationsFactory.eINSTANCE.createVariable();
    final Procedure1<Variable> _function = (Variable it) -> {
      it.setRef(p);
    };
    return ObjectExtensions.<Variable>operator_doubleArrow(_createVariable, _function);
  }
  
  public Not not(final Proposition p) {
    Not _createNot = ExplicitOperationsFactory.eINSTANCE.createNot();
    final Procedure1<Not> _function = (Not it) -> {
      it.setNext(p);
    };
    return ObjectExtensions.<Not>operator_doubleArrow(_createNot, _function);
  }
  
  public Imply imply(final Proposition p, final Proposition p1) {
    Imply _createImply = ExplicitOperationsFactory.eINSTANCE.createImply();
    final Procedure1<Imply> _function = (Imply it) -> {
      it.setLeft(p);
      it.setRight(p1);
    };
    return ObjectExtensions.<Imply>operator_doubleArrow(_createImply, _function);
  }
  
  public Equiv equivalent(final Proposition p, final Proposition p1) {
    Equiv _createEquiv = ExplicitOperationsFactory.eINSTANCE.createEquiv();
    final Procedure1<Equiv> _function = (Equiv it) -> {
      it.setLeft(p);
      it.setRight(p1);
    };
    return ObjectExtensions.<Equiv>operator_doubleArrow(_createEquiv, _function);
  }
  
  public And and(final Proposition p, final Proposition p1) {
    And _xblockexpression = null;
    {
      InputOutput.<Proposition>println(p1);
      And _createAnd = ExplicitOperationsFactory.eINSTANCE.createAnd();
      final Procedure1<And> _function = (And it) -> {
        it.setLeft(p);
        it.setRight(p1);
      };
      _xblockexpression = ObjectExtensions.<And>operator_doubleArrow(_createAnd, _function);
    }
    return _xblockexpression;
  }
  
  public Or or(final Proposition p, final Proposition p1) {
    Or _createOr = ExplicitOperationsFactory.eINSTANCE.createOr();
    final Procedure1<Or> _function = (Or it) -> {
      it.setLeft(p);
      it.setRight(p1);
    };
    return ObjectExtensions.<Or>operator_doubleArrow(_createOr, _function);
  }
  
  public <R extends Object, T extends R> R fold1(final Iterable<T> lb, final Function2<? super R, ? super T, ? extends R> f, final R d) {
    R _xblockexpression = null;
    {
      final Iterable<T> l = IterableExtensions.<T>filterNull(lb);
      final int lt = ((Object[])Conversions.unwrapArray(l, Object.class)).length;
      R _xifexpression = null;
      if ((lt == 1)) {
        _xifexpression = IterableExtensions.<T>head(l);
      } else {
        R _xifexpression_1 = null;
        if ((lt > 1)) {
          Iterable<T> _tail = IterableExtensions.<T>tail(l);
          T _head = IterableExtensions.<T>head(l);
          _xifexpression_1 = IterableExtensions.<T, R>fold(_tail, _head, f);
        } else {
          _xifexpression_1 = d;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected Proposition _toProposition(final AtomicFeature that) {
    Imply _xblockexpression = null;
    {
      Variable _createVariable = ExplicitOperationsFactory.eINSTANCE.createVariable();
      final Procedure1<Variable> _function = (Variable it) -> {
        it.setRef(that);
      };
      final Variable v = ObjectExtensions.<Variable>operator_doubleArrow(_createVariable, _function);
      Imply _xifexpression = null;
      Proposition _constraints = that.getConstraints();
      boolean _notEquals = (!Objects.equal(_constraints, null));
      if (_notEquals) {
        Variable _copy = EcoreUtil2.<Variable>copy(v);
        Proposition _constraints_1 = that.getConstraints();
        Proposition _copy_1 = EcoreUtil2.<Proposition>copy(_constraints_1);
        _xifexpression = this.imply(_copy, _copy_1);
      } else {
        _xifexpression = null;
      }
      final Imply ret = _xifexpression;
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  protected Proposition _toProposition(final OneOf that) {
    And _xblockexpression = null;
    {
      final EList<Feature> subs = that.getChildren();
      final List<Proposition> ret = CollectionLiterals.<Proposition>newArrayList();
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(subs, Object.class)).length); i++) {
        {
          final ArrayList<Proposition> innerL = CollectionLiterals.<Proposition>newArrayList();
          for (int j = 0; (j < ((Object[])Conversions.unwrapArray(subs, Object.class)).length); j++) {
            if ((i != j)) {
              Feature _get = subs.get(j);
              Variable _proposition = this.proposition(_get);
              Not _not = this.not(_proposition);
              innerL.add(_not);
            } else {
              Feature _get_1 = subs.get(j);
              Variable _proposition_1 = this.proposition(_get_1);
              innerL.add(_proposition_1);
            }
          }
          final Function2<Proposition, Proposition, Proposition> _function = (Proposition p1, Proposition p2) -> {
            return this.and(p1, p2);
          };
          Proposition _fold1 = this.<Proposition, Proposition>fold1(innerL, _function, null);
          ret.add(_fold1);
        }
      }
      final Function1<Feature, Imply> _function = (Feature it) -> {
        Variable _proposition = this.proposition(it);
        Variable _proposition_1 = this.proposition(that);
        return this.imply(_proposition, _proposition_1);
      };
      List<Imply> _map = ListExtensions.<Feature, Imply>map(subs, _function);
      final Function2<Proposition, Proposition, Proposition> _function_1 = (Proposition p1, Proposition p2) -> {
        return this.and(p1, p2);
      };
      final Proposition childParent = this.<Proposition, Imply>fold1(_map, _function_1, null);
      Variable _proposition = this.proposition(that);
      final Function2<Proposition, Proposition, Proposition> _function_2 = (Proposition p1, Proposition p2) -> {
        return this.or(p1, p2);
      };
      Proposition _fold1 = this.<Proposition, Proposition>fold1(ret, _function_2, null);
      final Imply xorGroup = this.imply(_proposition, _fold1);
      EList<Feature> _children = that.getChildren();
      final Function1<Feature, Proposition> _function_3 = (Feature it) -> {
        return this.toProposition(it);
      };
      List<Proposition> _map_1 = ListExtensions.<Feature, Proposition>map(_children, _function_3);
      final Function2<Proposition, Proposition, Proposition> _function_4 = (Proposition p1, Proposition p2) -> {
        return this.and(p1, p2);
      };
      final Proposition children = this.<Proposition, Proposition>fold1(_map_1, _function_4, null);
      And _xifexpression = null;
      boolean _notEquals = (!Objects.equal(children, null));
      if (_notEquals) {
        And _and = this.and(childParent, xorGroup);
        _xifexpression = this.and(_and, children);
      } else {
        _xifexpression = this.and(childParent, xorGroup);
      }
      final And v = _xifexpression;
      And _xifexpression_1 = null;
      Proposition _constraints = that.getConstraints();
      boolean _notEquals_1 = (!Objects.equal(_constraints, null));
      if (_notEquals_1) {
        And _xblockexpression_1 = null;
        {
          final And vb = EcoreUtil2.<And>copy(v);
          Proposition _constraints_1 = that.getConstraints();
          Proposition _copy = EcoreUtil2.<Proposition>copy(_constraints_1);
          Imply _imply = this.imply(vb, _copy);
          _xblockexpression_1 = this.and(v, _imply);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        _xifexpression_1 = v;
      }
      _xblockexpression = _xifexpression_1;
    }
    return _xblockexpression;
  }
  
  protected Proposition _toProposition(final SomeOf that) {
    Proposition _xblockexpression = null;
    {
      final EList<Feature> subs = that.getChildren();
      final Function1<Feature, Proposition> _function = (Feature it) -> {
        return this.toProposition(it);
      };
      List<Proposition> _map = ListExtensions.<Feature, Proposition>map(subs, _function);
      final Function2<Proposition, Proposition, Proposition> _function_1 = (Proposition p1, Proposition p2) -> {
        return this.and(p1, p2);
      };
      final Proposition subPropositions = this.<Proposition, Proposition>fold1(_map, _function_1, null);
      EList<Feature> _children = that.getChildren();
      final Function1<Feature, Proposition> _function_2 = (Feature it) -> {
        Proposition _xifexpression = null;
        boolean _isOptional = it.isOptional();
        if (_isOptional) {
          Variable _proposition = this.proposition(it);
          Variable _proposition_1 = this.proposition(that);
          _xifexpression = this.imply(_proposition, _proposition_1);
        } else {
          Variable _proposition_2 = this.proposition(it);
          Variable _proposition_3 = this.proposition(that);
          _xifexpression = this.equivalent(_proposition_2, _proposition_3);
        }
        return _xifexpression;
      };
      List<Proposition> _map_1 = ListExtensions.<Feature, Proposition>map(_children, _function_2);
      Iterable<Proposition> _filterNull = IterableExtensions.<Proposition>filterNull(_map_1);
      final Function2<Proposition, Proposition, Proposition> _function_3 = (Proposition p1, Proposition p2) -> {
        return this.and(p1, p2);
      };
      final Proposition v0 = this.<Proposition, Proposition>fold1(_filterNull, _function_3, null);
      Proposition _xifexpression = null;
      boolean _equals = Objects.equal(subPropositions, null);
      if (_equals) {
        _xifexpression = v0;
      } else {
        _xifexpression = this.and(v0, subPropositions);
      }
      final Proposition v = _xifexpression;
      Proposition _xifexpression_1 = null;
      Proposition _constraints = that.getConstraints();
      boolean _notEquals = (!Objects.equal(_constraints, null));
      if (_notEquals) {
        And _xblockexpression_1 = null;
        {
          final Proposition vb = EcoreUtil2.<Proposition>copy(v);
          Proposition _constraints_1 = that.getConstraints();
          Proposition _copy = EcoreUtil2.<Proposition>copy(_constraints_1);
          Imply _imply = this.imply(vb, _copy);
          _xblockexpression_1 = this.and(v, _imply);
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        _xifexpression_1 = v;
      }
      _xblockexpression = _xifexpression_1;
    }
    return _xblockexpression;
  }
  
  public Proposition toProposition(final Feature that) {
    if (that instanceof AtomicFeature) {
      return _toProposition((AtomicFeature)that);
    } else if (that instanceof OneOf) {
      return _toProposition((OneOf)that);
    } else if (that instanceof SomeOf) {
      return _toProposition((SomeOf)that);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(that).toString());
    }
  }
}
