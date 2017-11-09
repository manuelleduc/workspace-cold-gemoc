package fr.mleduc.lib;

import com.google.inject.Inject;
import fr.mleduc.coldLang.FeatureModel;
import fr.mleduc.coldLang.OneOf;
import fr.mleduc.coldLang.SomeOf;
import fr.mleduc.lib.FPLib;
import fr.mleduc.lib.PLLib;
import fr.mleduc.lib.PropositionCache;
import fr.mleduc.lib.pl.model.Operator;
import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ColdAsmToPL {
  @Inject
  @Extension
  private PropositionCache _propositionCache;
  
  @Inject
  @Extension
  private PLLib _pLLib;
  
  @Inject
  @Extension
  private FPLib _fPLib;
  
  protected Operator _variabilityToPL(final OneOf that) {
    return null;
  }
  
  protected Operator _variabilityToPL(final SomeOf that) {
    return null;
  }
  
  public Operator variabilityToPL(final FeatureModel that) {
    if (that instanceof OneOf) {
      return _variabilityToPL((OneOf)that);
    } else if (that instanceof SomeOf) {
      return _variabilityToPL((SomeOf)that);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(that).toString());
    }
  }
}
