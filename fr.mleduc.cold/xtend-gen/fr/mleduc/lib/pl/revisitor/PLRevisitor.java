package fr.mleduc.lib.pl.revisitor;

import fr.mleduc.lib.pl.model.And;
import fr.mleduc.lib.pl.model.Equivalent;
import fr.mleduc.lib.pl.model.Imply;
import fr.mleduc.lib.pl.model.Not;
import fr.mleduc.lib.pl.model.Operator;
import fr.mleduc.lib.pl.model.Or;
import fr.mleduc.lib.pl.model.Proposition;
import fr.mleduc.lib.pl.model.True;

@SuppressWarnings("all")
public interface PLRevisitor<OperatorT extends Object, AndT extends OperatorT, EquivalentT extends OperatorT, ImplyT extends OperatorT, NotT extends OperatorT, OrT extends OperatorT, PropositionT extends OperatorT, TrueT extends OperatorT> {
  public abstract AndT and(final And i);
  
  public abstract EquivalentT equivalent(final Equivalent i);
  
  public abstract ImplyT imply(final Imply i);
  
  public abstract NotT not(final Not i);
  
  public abstract OrT or(final Or i);
  
  public abstract PropositionT proposition(final Proposition p);
  
  public abstract TrueT tru(final True t);
  
  public default OperatorT $(final Operator i) {
    if ((i instanceof And)) {
      return this.and(((And)i));
    }
    if ((i instanceof Equivalent)) {
      return this.equivalent(((Equivalent)i));
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
    if ((i instanceof Proposition)) {
      return this.proposition(((Proposition)i));
    }
    if ((i instanceof True)) {
      return this.tru(((True)i));
    }
    return null;
  }
}
