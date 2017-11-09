package fr.mleduc.lib.pl.revisitor.impl;

import fr.mleduc.coldLang.Condition;
import fr.mleduc.coldLang.Equiv;
import fr.mleduc.coldLang.Feature;
import fr.mleduc.lib.PropositionCache;
import fr.mleduc.lib.pl.model.And;
import fr.mleduc.lib.pl.model.Equivalent;
import fr.mleduc.lib.pl.model.Imply;
import fr.mleduc.lib.pl.model.Not;
import fr.mleduc.lib.pl.model.Operator;
import fr.mleduc.lib.pl.model.Or;
import fr.mleduc.lib.pl.model.Proposition;
import fr.mleduc.lib.pl.revisitor.ConditionRevisitor;
import fr.mleduc.lib.pl.revisitor.impl.ColdVMToMMOperation;

@SuppressWarnings("all")
public interface ColdVMToMM extends ConditionRevisitor<ColdVMToMMOperation<? extends Operator>, ColdVMToMMOperation<And>, ColdVMToMMOperation<Equivalent>, ColdVMToMMOperation<Imply>, ColdVMToMMOperation<Not>, ColdVMToMMOperation<Or>, ColdVMToMMOperation<Proposition>> {
  @Override
  public default ColdVMToMMOperation<And> and(final fr.mleduc.coldLang.And i) {
    final ColdVMToMMOperation<And> _function = (PropositionCache it) -> {
      Condition _left = i.getLeft();
      ColdVMToMMOperation<? extends Operator> _$ = this.$(_left);
      Operator _produce = _$.produce(it);
      Condition _right = i.getRight();
      ColdVMToMMOperation<? extends Operator> _$_1 = this.$(_right);
      Operator _produce_1 = _$_1.produce(it);
      return new And(_produce, _produce_1);
    };
    return _function;
  }
  
  @Override
  public default ColdVMToMMOperation<Equivalent> equivalent(final Equiv i) {
    final ColdVMToMMOperation<Equivalent> _function = (PropositionCache it) -> {
      Condition _left = i.getLeft();
      ColdVMToMMOperation<? extends Operator> _$ = this.$(_left);
      Operator _produce = _$.produce(it);
      Condition _right = i.getRight();
      ColdVMToMMOperation<? extends Operator> _$_1 = this.$(_right);
      Operator _produce_1 = _$_1.produce(it);
      return new Equivalent(_produce, _produce_1);
    };
    return _function;
  }
  
  @Override
  public default ColdVMToMMOperation<Imply> imply(final fr.mleduc.coldLang.Imply i) {
    final ColdVMToMMOperation<Imply> _function = (PropositionCache it) -> {
      Condition _left = i.getLeft();
      ColdVMToMMOperation<? extends Operator> _$ = this.$(_left);
      Operator _produce = _$.produce(it);
      Condition _right = i.getRight();
      ColdVMToMMOperation<? extends Operator> _$_1 = this.$(_right);
      Operator _produce_1 = _$_1.produce(it);
      return new Imply(_produce, _produce_1);
    };
    return _function;
  }
  
  @Override
  public default ColdVMToMMOperation<Not> not(final fr.mleduc.coldLang.Not i) {
    final ColdVMToMMOperation<Not> _function = (PropositionCache it) -> {
      Condition _next = i.getNext();
      ColdVMToMMOperation<? extends Operator> _$ = this.$(_next);
      Operator _produce = _$.produce(it);
      return new Not(_produce);
    };
    return _function;
  }
  
  @Override
  public default ColdVMToMMOperation<Or> or(final fr.mleduc.coldLang.Or i) {
    final ColdVMToMMOperation<Or> _function = (PropositionCache it) -> {
      Condition _left = i.getLeft();
      ColdVMToMMOperation<? extends Operator> _$ = this.$(_left);
      Operator _produce = _$.produce(it);
      Condition _right = i.getRight();
      ColdVMToMMOperation<? extends Operator> _$_1 = this.$(_right);
      Operator _produce_1 = _$_1.produce(it);
      return new Or(_produce, _produce_1);
    };
    return _function;
  }
  
  @Override
  public default ColdVMToMMOperation<Proposition> feature(final Feature p) {
    final ColdVMToMMOperation<Proposition> _function = (PropositionCache it) -> {
      return it.proposition(p);
    };
    return _function;
  }
}
