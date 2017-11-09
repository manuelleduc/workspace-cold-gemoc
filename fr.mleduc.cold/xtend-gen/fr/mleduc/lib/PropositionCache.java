package fr.mleduc.lib;

import fr.mleduc.coldLang.Feature;
import fr.mleduc.coldLang.FeatureModel;
import fr.mleduc.coldLang.OneOf;
import fr.mleduc.coldLang.SomeOf;
import fr.mleduc.lib.pl.model.Proposition;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Generate propositions from COLD instances. Keep track of the produced objects in a cache.
 */
@SuppressWarnings("all")
public class PropositionCache {
  private final Map<EObject, Proposition> propositionCache = CollectionLiterals.<EObject, Proposition>newHashMap();
  
  protected Proposition _proposition(final Feature that) {
    Proposition _xblockexpression = null;
    {
      boolean _containsKey = this.propositionCache.containsKey(that);
      boolean _not = (!_containsKey);
      if (_not) {
        String _name = that.getName();
        String _plus = ("coldvmfeature_" + _name);
        Proposition _proposition = new Proposition(_plus);
        this.propositionCache.put(that, _proposition);
      }
      _xblockexpression = this.propositionCache.get(that);
    }
    return _xblockexpression;
  }
  
  protected Proposition _proposition(final OneOf that) {
    Proposition _xblockexpression = null;
    {
      boolean _containsKey = this.propositionCache.containsKey(that);
      boolean _not = (!_containsKey);
      if (_not) {
        String _name = that.getName();
        String _plus = ("coldvmoneof_" + _name);
        Proposition _proposition = new Proposition(_plus);
        this.propositionCache.put(that, _proposition);
      }
      _xblockexpression = this.propositionCache.get(that);
    }
    return _xblockexpression;
  }
  
  protected Proposition _proposition(final SomeOf that) {
    Proposition _xblockexpression = null;
    {
      boolean _containsKey = this.propositionCache.containsKey(that);
      boolean _not = (!_containsKey);
      if (_not) {
        String _name = that.getName();
        String _plus = ("coldvmsomeof_" + _name);
        Proposition _proposition = new Proposition(_plus);
        this.propositionCache.put(that, _proposition);
      }
      _xblockexpression = this.propositionCache.get(that);
    }
    return _xblockexpression;
  }
  
  public Proposition proposition(final FeatureModel that) {
    if (that instanceof Feature) {
      return _proposition((Feature)that);
    } else if (that instanceof OneOf) {
      return _proposition((OneOf)that);
    } else if (that instanceof SomeOf) {
      return _proposition((SomeOf)that);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(that).toString());
    }
  }
}
