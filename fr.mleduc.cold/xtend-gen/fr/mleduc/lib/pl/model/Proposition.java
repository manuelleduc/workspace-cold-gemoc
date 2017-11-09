package fr.mleduc.lib.pl.model;

import fr.mleduc.lib.pl.model.Operator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Proposition extends Operator {
  @Accessors
  private net.sf.tweety.logics.pl.syntax.Proposition value;
  
  public Proposition(final String string) {
    net.sf.tweety.logics.pl.syntax.Proposition _proposition = new net.sf.tweety.logics.pl.syntax.Proposition(string);
    this.value = _proposition;
  }
  
  @Override
  public Long priority() {
    return Long.valueOf(6L);
  }
  
  @Pure
  public net.sf.tweety.logics.pl.syntax.Proposition getValue() {
    return this.value;
  }
  
  public void setValue(final net.sf.tweety.logics.pl.syntax.Proposition value) {
    this.value = value;
  }
}
