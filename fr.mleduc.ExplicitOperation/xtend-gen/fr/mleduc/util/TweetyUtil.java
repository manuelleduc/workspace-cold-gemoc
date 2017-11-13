package fr.mleduc.util;

import net.sf.tweety.logics.pl.semantics.PossibleWorld;
import net.sf.tweety.logics.pl.semantics.PossibleWorldIterator;
import net.sf.tweety.logics.pl.syntax.PropositionalFormula;
import net.sf.tweety.logics.pl.syntax.PropositionalSignature;

@SuppressWarnings("all")
public class TweetyUtil {
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
          if ((satisfies && (!next.isEmpty()))) {
            satisfiesCount++;
          }
        }
      }
      _xblockexpression = satisfiesCount;
    }
    return _xblockexpression;
  }
}
