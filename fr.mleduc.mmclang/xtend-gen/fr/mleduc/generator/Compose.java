package fr.mleduc.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.mleduc.mMCLang.Composition;
import fr.mleduc.mMCLang.Merge;
import fr.mleduc.mMCLang.Operation;
import fr.mleduc.mMCLang.Pair;
import fr.mleduc.mMCLang.Slice;
import fr.mleduc.mMLang.Field;
import fr.mleduc.mMLang.Generic;
import fr.mleduc.mMLang.MMLangFactory;
import fr.mleduc.mMLang.Metamodel;
import fr.mleduc.mMLang.Reference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Compose {
  public Metamodel reduce(final Composition composition) {
    EList<Operation> _operations = composition.getOperations();
    Metamodel _createMetamodel = MMLangFactory.eINSTANCE.createMetamodel();
    final Function2<Metamodel, Operation, Metamodel> _function = (Metamodel m, Operation t) -> {
      return this.apply(t, m);
    };
    Metamodel _fold = IterableExtensions.<Operation, Metamodel>fold(_operations, _createMetamodel, _function);
    final Procedure1<Metamodel> _function_1 = (Metamodel it) -> {
      String _name = composition.getName();
      it.setName(_name);
    };
    return ObjectExtensions.<Metamodel>operator_doubleArrow(_fold, _function_1);
  }
  
  protected Metamodel _apply(final Merge merge, final Metamodel m) {
    Metamodel _xblockexpression = null;
    {
      final Metamodel red = merge.getMetamodel();
      EList<fr.mleduc.mMLang.Class> _classes = red.getClasses();
      final Consumer<fr.mleduc.mMLang.Class> _function = (fr.mleduc.mMLang.Class c) -> {
        EList<Pair> _pairs = merge.getPairs();
        final Function1<Pair, Boolean> _function_1 = (Pair it) -> {
          fr.mleduc.mMLang.Class _from = it.getFrom();
          String _name = _from.getName();
          String _name_1 = c.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        };
        Pair _findFirst = IterableExtensions.<Pair>findFirst(_pairs, _function_1);
        final Function1<Pair, String> _function_2 = (Pair it) -> {
          return it.getName();
        };
        String _name = c.getName();
        final String name = this.<Pair, String>orElse(_findFirst, _function_2, _name);
        this.merge(m, c, name);
      };
      _classes.forEach(_function);
      m.setConcrete(true);
      _xblockexpression = m;
    }
    return _xblockexpression;
  }
  
  protected Metamodel _apply(final Slice s, final Metamodel m) {
    Metamodel _xblockexpression = null;
    {
      final Metamodel red = s.getMetamodel();
      EList<fr.mleduc.mMLang.Class> _classes = red.getClasses();
      final Function1<fr.mleduc.mMLang.Class, Boolean> _function = (fr.mleduc.mMLang.Class it) -> {
        EList<fr.mleduc.mMLang.Class> _targets = s.getTargets();
        final Function1<fr.mleduc.mMLang.Class, String> _function_1 = (fr.mleduc.mMLang.Class it_1) -> {
          return it_1.getName();
        };
        List<String> _map = ListExtensions.<fr.mleduc.mMLang.Class, String>map(_targets, _function_1);
        String _name = it.getName();
        return Boolean.valueOf(_map.contains(_name));
      };
      final Iterable<fr.mleduc.mMLang.Class> targets = IterableExtensions.<fr.mleduc.mMLang.Class>filter(_classes, _function);
      final ArrayList<fr.mleduc.mMLang.Class> res = CollectionLiterals.<fr.mleduc.mMLang.Class>newArrayList();
      final Consumer<fr.mleduc.mMLang.Class> _function_1 = (fr.mleduc.mMLang.Class it) -> {
        this.addDependencies(it, res);
      };
      targets.forEach(_function_1);
      final Consumer<fr.mleduc.mMLang.Class> _function_2 = (fr.mleduc.mMLang.Class c) -> {
        String _name = c.getName();
        this.merge(m, c, _name);
      };
      res.forEach(_function_2);
      _xblockexpression = m;
    }
    return _xblockexpression;
  }
  
  public boolean merge(final Metamodel m, final fr.mleduc.mMLang.Class c0, final String nn) {
    boolean _xblockexpression = false;
    {
      final fr.mleduc.mMLang.Class c = EcoreUtil2.<fr.mleduc.mMLang.Class>copy(c0);
      c.setName(nn);
      boolean _xifexpression = false;
      EList<fr.mleduc.mMLang.Class> _classes = m.getClasses();
      final Function1<fr.mleduc.mMLang.Class, Boolean> _function = (fr.mleduc.mMLang.Class it) -> {
        String _name = it.getName();
        String _name_1 = c.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      };
      boolean _exists = IterableExtensions.<fr.mleduc.mMLang.Class>exists(_classes, _function);
      if (_exists) {
        boolean _xblockexpression_1 = false;
        {
          EList<fr.mleduc.mMLang.Class> _classes_1 = m.getClasses();
          final Function1<fr.mleduc.mMLang.Class, Boolean> _function_1 = (fr.mleduc.mMLang.Class it) -> {
            String _name = it.getName();
            String _name_1 = c.getName();
            return Boolean.valueOf(Objects.equal(_name, _name_1));
          };
          fr.mleduc.mMLang.Class _findFirst = IterableExtensions.<fr.mleduc.mMLang.Class>findFirst(_classes_1, _function_1);
          final fr.mleduc.mMLang.Class tmp = this.merge(c, _findFirst);
          EList<fr.mleduc.mMLang.Class> _classes_2 = m.getClasses();
          final Predicate<fr.mleduc.mMLang.Class> _function_2 = (fr.mleduc.mMLang.Class it) -> {
            String _name = it.getName();
            String _name_1 = c.getName();
            return Objects.equal(_name, _name_1);
          };
          _classes_2.removeIf(_function_2);
          EList<fr.mleduc.mMLang.Class> _classes_3 = m.getClasses();
          _xblockexpression_1 = _classes_3.add(tmp);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        EList<fr.mleduc.mMLang.Class> _classes_1 = m.getClasses();
        _xifexpression = _classes_1.add(c);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public <E extends Object, T extends Object> T orElse(final E x, final Function1<? super E, ? extends T> a, final T b) {
    T _xifexpression = null;
    boolean _notEquals = (!Objects.equal(x, null));
    if (_notEquals) {
      _xifexpression = a.apply(x);
    } else {
      _xifexpression = b;
    }
    return _xifexpression;
  }
  
  public void addDependencies(final fr.mleduc.mMLang.Class c, final List<fr.mleduc.mMLang.Class> added) {
    boolean _contains = added.contains(c);
    boolean _not = (!_contains);
    if (_not) {
      added.add(c);
      EList<fr.mleduc.mMLang.Class> _parents = c.getParents();
      final Consumer<fr.mleduc.mMLang.Class> _function = (fr.mleduc.mMLang.Class it) -> {
        this.addDependencies(it, added);
      };
      _parents.forEach(_function);
      EList<Field> _fields = c.getFields();
      final Function1<Field, Reference> _function_1 = (Field it) -> {
        return it.getType();
      };
      List<Reference> _map = ListExtensions.<Field, Reference>map(_fields, _function_1);
      Iterable<fr.mleduc.mMLang.Class> _filter = Iterables.<fr.mleduc.mMLang.Class>filter(_map, fr.mleduc.mMLang.Class.class);
      final Consumer<fr.mleduc.mMLang.Class> _function_2 = (fr.mleduc.mMLang.Class it) -> {
        this.addDependencies(it, added);
      };
      _filter.forEach(_function_2);
      EList<Field> _fields_1 = c.getFields();
      final Function1<Field, EList<Reference>> _function_3 = (Field it) -> {
        return it.getGenerics();
      };
      List<EList<Reference>> _map_1 = ListExtensions.<Field, EList<Reference>>map(_fields_1, _function_3);
      Iterable<Reference> _flatten = Iterables.<Reference>concat(_map_1);
      Iterable<fr.mleduc.mMLang.Class> _filter_1 = Iterables.<fr.mleduc.mMLang.Class>filter(_flatten, fr.mleduc.mMLang.Class.class);
      final Consumer<fr.mleduc.mMLang.Class> _function_4 = (fr.mleduc.mMLang.Class it) -> {
        this.addDependencies(it, added);
      };
      _filter_1.forEach(_function_4);
    }
  }
  
  public fr.mleduc.mMLang.Class merge(final fr.mleduc.mMLang.Class a, final fr.mleduc.mMLang.Class b) {
    fr.mleduc.mMLang.Class _createClass = MMLangFactory.eINSTANCE.createClass();
    final Procedure1<fr.mleduc.mMLang.Class> _function = (fr.mleduc.mMLang.Class nc) -> {
      String _name = a.getName();
      nc.setName(_name);
      EList<Generic> _generics = nc.getGenerics();
      EList<Generic> _generics_1 = a.getGenerics();
      _generics.addAll(_generics_1);
      EList<Field> _fields = nc.getFields();
      EList<Field> _fields_1 = a.getFields();
      _fields.addAll(_fields_1);
      EList<Field> _fields_2 = b.getFields();
      final Consumer<Field> _function_1 = (Field f) -> {
        EList<Field> _fields_3 = nc.getFields();
        final Predicate<Field> _function_2 = (Field it) -> {
          String _name_1 = it.getName();
          String _name_2 = f.getName();
          return Objects.equal(_name_1, _name_2);
        };
        _fields_3.removeIf(_function_2);
        EList<Field> _fields_4 = nc.getFields();
        Field _copy = EcoreUtil2.<Field>copy(f);
        _fields_4.add(_copy);
      };
      _fields_2.forEach(_function_1);
    };
    return ObjectExtensions.<fr.mleduc.mMLang.Class>operator_doubleArrow(_createClass, _function);
  }
  
  public Metamodel apply(final Operation merge, final Metamodel m) {
    if (merge instanceof Merge) {
      return _apply((Merge)merge, m);
    } else if (merge instanceof Slice) {
      return _apply((Slice)merge, m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(merge, m).toString());
    }
  }
}
