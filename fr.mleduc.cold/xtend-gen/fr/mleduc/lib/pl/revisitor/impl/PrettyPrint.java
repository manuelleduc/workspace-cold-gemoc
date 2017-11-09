package fr.mleduc.lib.pl.revisitor.impl;

import fr.mleduc.lib.pl.model.And;
import fr.mleduc.lib.pl.model.Equivalent;
import fr.mleduc.lib.pl.model.Imply;
import fr.mleduc.lib.pl.model.Not;
import fr.mleduc.lib.pl.model.Operator;
import fr.mleduc.lib.pl.model.Or;
import fr.mleduc.lib.pl.model.Proposition;
import fr.mleduc.lib.pl.model.True;
import fr.mleduc.lib.pl.revisitor.PLRevisitor;
import fr.mleduc.lib.pl.revisitor.impl.PLPrinter;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public interface PrettyPrint extends PLRevisitor<PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter, PLPrinter> {
  @Override
  public default PLPrinter and(final And i) {
    final PLPrinter _function = (Long priority) -> {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        Operator _left = i.getLeft();
        PLPrinter _$ = this.$(_left);
        Long _priority = i.priority();
        String _print = _$.print(_priority);
        _builder.append(_print, "");
        _builder.append(" && ");
        Operator _right = i.getRight();
        PLPrinter _$_1 = this.$(_right);
        Long _priority_1 = i.priority();
        String _print_1 = _$_1.print(_priority_1);
        _builder.append(_print_1, "");
        final String res = _builder.toString();
        String _xifexpression = null;
        Long _priority_2 = i.priority();
        boolean _greaterThan = (_priority_2.compareTo(priority) > 0);
        if (_greaterThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(res, "");
          _builder_1.append(")");
          _xifexpression = _builder_1.toString();
        } else {
          _xifexpression = res;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return _function;
  }
  
  @Override
  public default PLPrinter equivalent(final Equivalent i) {
    final PLPrinter _function = (Long priority) -> {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        Operator _left = i.getLeft();
        PLPrinter _$ = this.$(_left);
        Long _priority = i.priority();
        String _print = _$.print(_priority);
        _builder.append(_print, "");
        _builder.append(" <=> ");
        Operator _right = i.getRight();
        PLPrinter _$_1 = this.$(_right);
        Long _priority_1 = i.priority();
        String _print_1 = _$_1.print(_priority_1);
        _builder.append(_print_1, "");
        final String res = _builder.toString();
        String _xifexpression = null;
        Long _priority_2 = i.priority();
        boolean _greaterThan = (_priority_2.compareTo(priority) > 0);
        if (_greaterThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(res, "");
          _builder_1.append(")");
          _xifexpression = _builder_1.toString();
        } else {
          _xifexpression = res;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return _function;
  }
  
  @Override
  public default PLPrinter imply(final Imply i) {
    final PLPrinter _function = (Long priority) -> {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        Operator _left = i.getLeft();
        PLPrinter _$ = this.$(_left);
        Long _priority = i.priority();
        String _print = _$.print(_priority);
        _builder.append(_print, "");
        _builder.append(" => ");
        Operator _right = i.getRight();
        PLPrinter _$_1 = this.$(_right);
        Long _priority_1 = i.priority();
        String _print_1 = _$_1.print(_priority_1);
        _builder.append(_print_1, "");
        final String res = _builder.toString();
        String _xifexpression = null;
        Long _priority_2 = i.priority();
        boolean _greaterThan = (_priority_2.compareTo(priority) > 0);
        if (_greaterThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(res, "");
          _builder_1.append(")");
          _xifexpression = _builder_1.toString();
        } else {
          _xifexpression = res;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return _function;
  }
  
  @Override
  public default PLPrinter not(final Not i) {
    final PLPrinter _function = (Long it) -> {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        Operator _inner = i.getInner();
        PLPrinter _$ = this.$(_inner);
        Long _priority = i.priority();
        String _print = _$.print(_priority);
        _builder.append(_print, "");
        final String res = _builder.toString();
        String _xifexpression = null;
        Long _priority_1 = i.priority();
        Operator _inner_1 = i.getInner();
        Long _priority_2 = _inner_1.priority();
        boolean _greaterEqualsThan = (_priority_1.compareTo(_priority_2) >= 0);
        if (_greaterEqualsThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("!(");
          _builder_1.append(res, "");
          _builder_1.append(")");
          _xifexpression = _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("!");
          _builder_2.append(res, "");
          _xifexpression = _builder_2.toString();
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return _function;
  }
  
  @Override
  public default PLPrinter or(final Or i) {
    final PLPrinter _function = (Long priority) -> {
      String _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        Operator _left = i.getLeft();
        PLPrinter _$ = this.$(_left);
        Long _priority = i.priority();
        String _print = _$.print(_priority);
        _builder.append(_print, "");
        _builder.append(" || ");
        Operator _right = i.getRight();
        PLPrinter _$_1 = this.$(_right);
        Long _priority_1 = i.priority();
        String _print_1 = _$_1.print(_priority_1);
        _builder.append(_print_1, "");
        final String res = _builder.toString();
        String _xifexpression = null;
        Long _priority_2 = i.priority();
        boolean _greaterThan = (_priority_2.compareTo(priority) > 0);
        if (_greaterThan) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("(");
          _builder_1.append(res, "");
          _builder_1.append(")");
          _xifexpression = _builder_1.toString();
        } else {
          _xifexpression = res;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return _function;
  }
  
  @Override
  public default PLPrinter proposition(final Proposition i) {
    final PLPrinter _function = (Long it) -> {
      net.sf.tweety.logics.pl.syntax.Proposition _value = i.getValue();
      return _value.getName();
    };
    return _function;
  }
  
  @Override
  public default PLPrinter tru(final True t) {
    final PLPrinter _function = (Long it) -> {
      return "true";
    };
    return _function;
  }
}
