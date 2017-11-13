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
import net.sf.tweety.logics.pl.syntax.Conjunction;
import net.sf.tweety.logics.pl.syntax.Disjunction;
import net.sf.tweety.logics.pl.syntax.Negation;
import net.sf.tweety.logics.pl.syntax.PropositionalFormula;

@SuppressWarnings("all")
public class Proposition2Tweety {
  protected PropositionalFormula _toTweety(final And and) {
    Proposition _left = and.getLeft();
    PropositionalFormula _tweety = this.toTweety(_left);
    Proposition _right = and.getRight();
    PropositionalFormula _tweety_1 = this.toTweety(_right);
    return new Conjunction(_tweety, _tweety_1);
  }
  
  protected PropositionalFormula _toTweety(final Equiv and) {
    Conjunction _xblockexpression = null;
    {
      Proposition _left = and.getLeft();
      final PropositionalFormula a = this.toTweety(_left);
      Proposition _right = and.getRight();
      final PropositionalFormula b = this.toTweety(_right);
      Negation _negation = new Negation(a);
      final Disjunction l = new Disjunction(_negation, b);
      Negation _negation_1 = new Negation(b);
      final Disjunction r = new Disjunction(_negation_1, a);
      _xblockexpression = new Conjunction(l, r);
    }
    return _xblockexpression;
  }
  
  protected PropositionalFormula _toTweety(final Imply and) {
    Disjunction _xblockexpression = null;
    {
      Proposition _left = and.getLeft();
      final PropositionalFormula a = this.toTweety(_left);
      Proposition _right = and.getRight();
      final PropositionalFormula b = this.toTweety(_right);
      Negation _negation = new Negation(a);
      _xblockexpression = new Disjunction(_negation, b);
    }
    return _xblockexpression;
  }
  
  protected PropositionalFormula _toTweety(final Not and) {
    Proposition _next = and.getNext();
    PropositionalFormula _tweety = this.toTweety(_next);
    return new Negation(_tweety);
  }
  
  protected PropositionalFormula _toTweety(final Or and) {
    Proposition _left = and.getLeft();
    PropositionalFormula _tweety = this.toTweety(_left);
    Proposition _right = and.getRight();
    PropositionalFormula _tweety_1 = this.toTweety(_right);
    return new Disjunction(_tweety, _tweety_1);
  }
  
  protected PropositionalFormula _toTweety(final Variable and) {
    Feature _ref = and.getRef();
    String _name = _ref.getName();
    return new net.sf.tweety.logics.pl.syntax.Proposition(_name);
  }
  
  public PropositionalFormula toTweety(final Proposition and) {
    if (and instanceof And) {
      return _toTweety((And)and);
    } else if (and instanceof Equiv) {
      return _toTweety((Equiv)and);
    } else if (and instanceof Imply) {
      return _toTweety((Imply)and);
    } else if (and instanceof Not) {
      return _toTweety((Not)and);
    } else if (and instanceof Or) {
      return _toTweety((Or)and);
    } else if (and instanceof Variable) {
      return _toTweety((Variable)and);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and).toString());
    }
  }
}
