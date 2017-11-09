package fr.mleduc.generator;

import fr.mleduc.mMLang.Card;
import fr.mleduc.mMLang.Card0;
import fr.mleduc.mMLang.Card1;
import fr.mleduc.mMLang.CardInf;
import fr.mleduc.mMLang.Field;
import fr.mleduc.mMLang.Generic;
import fr.mleduc.mMLang.Metamodel;
import fr.mleduc.mMLang.Reference;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class PrettyPrint {
  protected CharSequence _print(final Metamodel m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isConcrete = m.isConcrete();
      if (_isConcrete) {
        _builder.append("concrete ");
      }
    }
    _builder.append("package ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<fr.mleduc.mMLang.Class> _classes = m.getClasses();
      final Function1<fr.mleduc.mMLang.Class, String> _function = (fr.mleduc.mMLang.Class it) -> {
        return it.getName();
      };
      List<fr.mleduc.mMLang.Class> _sortBy = IterableExtensions.<fr.mleduc.mMLang.Class, String>sortBy(_classes, _function);
      boolean _hasElements = false;
      for(final fr.mleduc.mMLang.Class cls : _sortBy) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        CharSequence _print = this.print(cls);
        _builder.append(_print, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _print(final Reference r) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = r.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _print(final fr.mleduc.mMLang.Class c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isAbstract = c.isAbstract();
      if (_isAbstract) {
        _builder.append("abstract ");
      }
    }
    _builder.append("class ");
    String _name = c.getName();
    _builder.append(_name, "");
    {
      EList<Generic> _generics = c.getGenerics();
      boolean _hasElements = false;
      for(final Generic g : _generics) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_1 = g.getName();
        _builder.append(_name_1, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    {
      EList<fr.mleduc.mMLang.Class> _parents = c.getParents();
      boolean _hasElements_1 = false;
      for(final fr.mleduc.mMLang.Class p : _parents) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append(" extends ", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_2 = p.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _fields = c.getFields();
      final Function1<Field, String> _function = (Field it) -> {
        return it.getName();
      };
      List<Field> _sortBy = IterableExtensions.<Field, String>sortBy(_fields, _function);
      for(final Field field : _sortBy) {
        _builder.append("  ");
        CharSequence _print = this.print(field);
        _builder.append(_print, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _print(final Generic g) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = g.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _print(final Field f) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isContainment = f.isContainment();
      if (_isContainment) {
        _builder.append("@");
      }
    }
    String _name = f.getName();
    _builder.append(_name, "");
    _builder.append(": ");
    Reference _type = f.getType();
    String _name_1 = _type.getName();
    _builder.append(_name_1, "");
    {
      EList<Reference> _generics = f.getGenerics();
      boolean _hasElements = false;
      for(final Reference g : _generics) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_2 = g.getName();
        _builder.append(_name_2, "");
      }
      if (_hasElements) {
        _builder.append(">", "");
      }
    }
    _builder.append(" [");
    Card _start_card = f.getStart_card();
    CharSequence _print = this.print(_start_card);
    _builder.append(_print, "");
    _builder.append("..");
    Card _stop_card = f.getStop_card();
    CharSequence _print_1 = this.print(_stop_card);
    _builder.append(_print_1, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _print(final Card0 c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("0");
    return _builder;
  }
  
  protected CharSequence _print(final Card1 c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("1");
    return _builder;
  }
  
  protected CharSequence _print(final CardInf c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*");
    return _builder;
  }
  
  public CharSequence print(final EObject c) {
    if (c instanceof Card0) {
      return _print((Card0)c);
    } else if (c instanceof Card1) {
      return _print((Card1)c);
    } else if (c instanceof CardInf) {
      return _print((CardInf)c);
    } else if (c instanceof fr.mleduc.mMLang.Class) {
      return _print((fr.mleduc.mMLang.Class)c);
    } else if (c instanceof Generic) {
      return _print((Generic)c);
    } else if (c instanceof Field) {
      return _print((Field)c);
    } else if (c instanceof Metamodel) {
      return _print((Metamodel)c);
    } else if (c instanceof Reference) {
      return _print((Reference)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
