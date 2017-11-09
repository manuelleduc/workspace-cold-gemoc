package fr.mleduc.lib.pl.revisitor;

import fr.mleduc.coldLang.And;
import fr.mleduc.coldLang.Condition;
import fr.mleduc.coldLang.Equiv;
import fr.mleduc.coldLang.Feature;
import fr.mleduc.coldLang.Imply;
import fr.mleduc.coldLang.Not;
import fr.mleduc.coldLang.Or;

@SuppressWarnings("all")
public interface ConditionRevisitor<ConditionT extends Object, AndT extends ConditionT, EquivT extends ConditionT, ImplyT extends ConditionT, NotT extends ConditionT, OrT extends ConditionT, FeatureT extends ConditionT> {
  public abstract AndT and(final And i);
  
  public abstract EquivT equivalent(final Equiv i);
  
  public abstract ImplyT imply(final Imply i);
  
  public abstract NotT not(final Not i);
  
  public abstract OrT or(final Or i);
  
  public abstract FeatureT feature(final Feature p);
  
  public default ConditionT $(final Condition i) {
    if ((i instanceof And)) {
      return this.and(((And)i));
    }
    if ((i instanceof Equiv)) {
      return this.equivalent(((Equiv)i));
    }
    if ((i instanceof Imply)) {
      return this.imply(((Imply)i));
    }
    if ((i instanceof Not)) {
      return this.not(((Not)i));
    }
    if ((i instanceof Or)) {
      return this.or(((Or)i));
    }
    if ((i instanceof Feature)) {
      return this.feature(((Feature)i));
    }
    return null;
  }
}
