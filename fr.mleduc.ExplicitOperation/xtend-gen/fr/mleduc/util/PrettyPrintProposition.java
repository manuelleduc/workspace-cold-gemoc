package fr.mleduc.util;

import fr.mleduc.explicitOperations.And;
import fr.mleduc.explicitOperations.Equiv;
import fr.mleduc.explicitOperations.Feature;
import fr.mleduc.explicitOperations.Imply;
import fr.mleduc.explicitOperations.Not;
import fr.mleduc.explicitOperations.Or;
import fr.mleduc.explicitOperations.Proposition;
import fr.mleduc.explicitOperations.Variable;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PrettyPrintProposition {
  protected String _pretty(final And p, final int priority) {
    String _xblockexpression = null;
    {
      final int localPriority = 2;
      StringConcatenation _builder = new StringConcatenation();
      Proposition _left = p.getLeft();
      String _pretty = null;
      if (_left!=null) {
        _pretty=this.pretty(_left, localPriority);
      }
      _builder.append(_pretty, "");
      _builder.append(" and ");
      Proposition _right = p.getRight();
      String _pretty_1 = null;
      if (_right!=null) {
        _pretty_1=this.pretty(_right, localPriority);
      }
      _builder.append(_pretty_1, "");
      final String res = _builder.toString();
      String _xifexpression = null;
      if ((localPriority > priority)) {
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
  }
  
  protected String _pretty(final Equiv p, final int priority) {
    String _xblockexpression = null;
    {
      final int localPriority = 5;
      StringConcatenation _builder = new StringConcatenation();
      Proposition _left = p.getLeft();
      String _pretty = null;
      if (_left!=null) {
        _pretty=this.pretty(_left, localPriority);
      }
      _builder.append(_pretty, "");
      _builder.append(" <=> ");
      Proposition _right = p.getRight();
      String _pretty_1 = null;
      if (_right!=null) {
        _pretty_1=this.pretty(_right, localPriority);
      }
      _builder.append(_pretty_1, "");
      final String res = _builder.toString();
      String _xifexpression = null;
      if ((localPriority > priority)) {
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
  }
  
  protected String _pretty(final Imply p, final int priority) {
    String _xblockexpression = null;
    {
      final int localPriority = 4;
      StringConcatenation _builder = new StringConcatenation();
      String _elvis = null;
      Proposition _left = p.getLeft();
      String _pretty = null;
      if (_left!=null) {
        _pretty=this.pretty(_left, localPriority);
      }
      if (_pretty != null) {
        _elvis = _pretty;
      } else {
        _elvis = "";
      }
      _builder.append(_elvis, "");
      _builder.append(" => ");
      String _elvis_1 = null;
      Proposition _right = p.getRight();
      String _pretty_1 = null;
      if (_right!=null) {
        _pretty_1=this.pretty(_right, localPriority);
      }
      if (_pretty_1 != null) {
        _elvis_1 = _pretty_1;
      } else {
        _elvis_1 = "";
      }
      _builder.append(_elvis_1, "");
      final String res = _builder.toString();
      String _xifexpression = null;
      if ((localPriority > priority)) {
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
  }
  
  protected String _pretty(final Not p, final int priority) {
    String _xblockexpression = null;
    {
      final int localPriority = 1;
      StringConcatenation _builder = new StringConcatenation();
      Proposition _next = p.getNext();
      String _pretty = null;
      if (_next!=null) {
        _pretty=this.pretty(_next, localPriority);
      }
      _builder.append(_pretty, "");
      final String res = _builder.toString();
      String _xifexpression = null;
      if ((localPriority > priority)) {
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
  }
  
  protected String _pretty(final Or p, final int priority) {
    String _xblockexpression = null;
    {
      final int localPriority = 3;
      StringConcatenation _builder = new StringConcatenation();
      Proposition _left = p.getLeft();
      String _pretty = null;
      if (_left!=null) {
        _pretty=this.pretty(_left, localPriority);
      }
      _builder.append(_pretty, "");
      _builder.append(" or ");
      Proposition _right = p.getRight();
      String _pretty_1 = null;
      if (_right!=null) {
        _pretty_1=this.pretty(_right, localPriority);
      }
      _builder.append(_pretty_1, "");
      final String res = _builder.toString();
      String _xifexpression = null;
      if ((localPriority > priority)) {
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
  }
  
  protected String _pretty(final Variable p, final int priority) {
    Feature _ref = p.getRef();
    return _ref.getName();
  }
  
  public String pretty(final Proposition p, final int priority) {
    if (p instanceof And) {
      return _pretty((And)p, priority);
    } else if (p instanceof Equiv) {
      return _pretty((Equiv)p, priority);
    } else if (p instanceof Imply) {
      return _pretty((Imply)p, priority);
    } else if (p instanceof Not) {
      return _pretty((Not)p, priority);
    } else if (p instanceof Or) {
      return _pretty((Or)p, priority);
    } else if (p instanceof Variable) {
      return _pretty((Variable)p, priority);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p, priority).toString());
    }
  }
}
