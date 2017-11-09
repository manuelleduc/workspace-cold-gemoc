package fr.mleduc.lib.pl.model;

@SuppressWarnings("all")
public abstract class Operator {
  /**
   * https://cs.stackexchange.com/questions/43856/operator-precedence-in-propositional-logic
   */
  public abstract Long priority();
}
