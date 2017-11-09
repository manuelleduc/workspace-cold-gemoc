package fr.mleduc.lib.pl.model;

import fr.mleduc.lib.pl.model.Operator;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Imply extends Operator {
  @Accessors
  private Operator left;
  
  @Accessors
  private Operator right;
  
  public Imply(final Operator operator, final Operator operator2) {
    this.left = operator;
    this.right = operator2;
  }
  
  @Override
  public Long priority() {
    return Long.valueOf(4L);
  }
  
  @Pure
  public Operator getLeft() {
    return this.left;
  }
  
  public void setLeft(final Operator left) {
    this.left = left;
  }
  
  @Pure
  public Operator getRight() {
    return this.right;
  }
  
  public void setRight(final Operator right) {
    this.right = right;
  }
}
