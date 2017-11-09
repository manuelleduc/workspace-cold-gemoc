package fr.mleduc.lib;

import fr.mleduc.lib.pl.model.And;
import fr.mleduc.lib.pl.model.Equivalent;
import fr.mleduc.lib.pl.model.Imply;
import fr.mleduc.lib.pl.model.Not;
import fr.mleduc.lib.pl.model.Operator;
import fr.mleduc.lib.pl.model.Or;
import net.sf.tweety.logics.pl.semantics.PossibleWorld;
import net.sf.tweety.logics.pl.semantics.PossibleWorldIterator;
import net.sf.tweety.logics.pl.syntax.PropositionalFormula;
import net.sf.tweety.logics.pl.syntax.PropositionalSignature;

/**
 * Mini fluent propositional logic API.
 */
@SuppressWarnings("all")
public class PLLib {
  public Imply imply(final Operator a, final Operator b) {
    return new Imply(a, b);
  }
  
  public And and(final Operator a, final Operator b) {
    return new And(a, b);
  }
  
  public Or or(final Operator a, final Operator b) {
    return new Or(a, b);
  }
  
  public Equivalent equivalent(final Operator a, final Operator b) {
    return new Equivalent(a, b);
  }
  
  public Not not(final Operator a) {
    return new Not(a);
  }
  
  public long count(final PropositionalFormula formula) {
    int _xblockexpression = (int) 0;
    {
      final PropositionalSignature signature = formula.getSignature();
      final PossibleWorldIterator pwi = new PossibleWorldIterator(signature);
      int satisfiesCount = 0;
      while (pwi.hasNext()) {
        {
          final PossibleWorld next = pwi.next();
          final boolean satisfies = next.satisfies(formula);
          if (satisfies) {
            satisfiesCount++;
          }
        }
      }
      _xblockexpression = satisfiesCount;
    }
    return _xblockexpression;
  }
}
