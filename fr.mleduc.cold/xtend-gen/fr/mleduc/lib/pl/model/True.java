package fr.mleduc.lib.pl.model;

import fr.mleduc.lib.pl.model.Operator;

@SuppressWarnings("all")
public class True extends Operator {
  @Override
  public Long priority() {
    return Long.valueOf(6L);
  }
}
