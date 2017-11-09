package fr.mleduc.lib.pl.revisitor;

import fr.mleduc.coldLang.Feature;
import fr.mleduc.coldLang.FeatureModel;
import fr.mleduc.coldLang.OneOf;
import fr.mleduc.coldLang.SomeOf;

@SuppressWarnings("all")
public interface FeatureModelRevisitor<FeatureModelT extends Object, FeatureT extends FeatureModelT, OneOfT extends FeatureModelT, SomeOfT extends FeatureModelT> {
  public abstract FeatureT feature(final Feature i);
  
  public abstract OneOfT oneOf(final OneOf i);
  
  public abstract SomeOfT someOf(final SomeOf i);
  
  public default Object $(final FeatureModel i) {
    if ((i instanceof Feature)) {
      return this.feature(((Feature)i));
    }
    if ((i instanceof OneOf)) {
      return this.oneOf(((OneOf)i));
    }
    if ((i instanceof SomeOf)) {
      return this.someOf(((SomeOf)i));
    }
    return null;
  }
}
