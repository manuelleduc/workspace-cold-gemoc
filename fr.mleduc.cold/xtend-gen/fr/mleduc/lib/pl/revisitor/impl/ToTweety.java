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
import net.sf.tweety.logics.pl.syntax.Conjunction;
import net.sf.tweety.logics.pl.syntax.Disjunction;
import net.sf.tweety.logics.pl.syntax.Negation;
import net.sf.tweety.logics.pl.syntax.PropositionalFormula;
import net.sf.tweety.logics.pl.syntax.Tautology;

@SuppressWarnings("all")
public interface ToTweety extends PLRevisitor<PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, PropositionalFormula, Tautology> {
  public default Conjunction andB(final PropositionalFormula a, final PropositionalFormula b) {
    return new Conjunction(a, b);
  }
  
  public default Disjunction orB(final PropositionalFormula a, final PropositionalFormula b) {
    return new Disjunction(a, b);
  }
  
  public default Disjunction implyB(final PropositionalFormula a, final PropositionalFormula b) {
    Negation _notB = this.notB(a);
    return this.orB(_notB, b);
  }
  
  public default Conjunction equivalentB(final PropositionalFormula a, final PropositionalFormula b) {
    Disjunction _implyB = this.implyB(a, b);
    Disjunction _implyB_1 = this.implyB(b, a);
    return this.andB(_implyB, _implyB_1);
  }
  
  public default Negation notB(final PropositionalFormula a) {
    return new Negation(a);
  }
  
  @Override
  public default PropositionalFormula and(final And i) {
    Operator _left = i.getLeft();
    PropositionalFormula _$ = this.$(_left);
    Operator _right = i.getRight();
    PropositionalFormula _$_1 = this.$(_right);
    return this.andB(_$, _$_1);
  }
  
  @Override
  public default PropositionalFormula equivalent(final Equivalent i) {
    Operator _left = i.getLeft();
    PropositionalFormula _$ = this.$(_left);
    Operator _right = i.getRight();
    PropositionalFormula _$_1 = this.$(_right);
    return this.equivalentB(_$, _$_1);
  }
  
  @Override
  public default PropositionalFormula imply(final Imply i) {
    Operator _left = i.getLeft();
    PropositionalFormula _$ = this.$(_left);
    Operator _right = i.getRight();
    PropositionalFormula _$_1 = this.$(_right);
    return this.implyB(_$, _$_1);
  }
  
  @Override
  public default PropositionalFormula not(final Not not) {
    Operator _inner = not.getInner();
    PropositionalFormula _$ = this.$(_inner);
    return this.notB(_$);
  }
  
  @Override
  public default PropositionalFormula or(final Or i) {
    Operator _left = i.getLeft();
    PropositionalFormula _$ = this.$(_left);
    Operator _right = i.getRight();
    PropositionalFormula _$_1 = this.$(_right);
    return this.orB(_$, _$_1);
  }
  
  @Override
  public default PropositionalFormula proposition(final Proposition i) {
    return i.getValue();
  }
  
  @Override
  public default Tautology tru(final True i) {
    return new Tautology();
  }
}
