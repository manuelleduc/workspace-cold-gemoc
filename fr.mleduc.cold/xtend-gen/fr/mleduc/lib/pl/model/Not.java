package fr.mleduc.lib.pl.model;

import fr.mleduc.lib.pl.model.Operator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Not extends Operator {
  @Accessors
  private Operator inner;
  
  public Not(final Operator operator) {
    this.inner = operator;
  }
  
  @Override
  public Long priority() {
    return Long.valueOf(1L);
  }
  
  @Pure
  public Operator getInner() {
    return this.inner;
  }
  
  public void setInner(final Operator inner) {
    this.inner = inner;
  }
}
