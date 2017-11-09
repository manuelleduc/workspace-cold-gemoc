/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.validation;

import fr.mleduc.coldLang.FeatureModel;
import fr.mleduc.validation.AbstractColdLangValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ColdLangValidator extends AbstractColdLangValidator {
  /**
   * Test if at least a single solution exists for the SPL.
   */
  @Check
  public Object testSPLValidity(final FeatureModel fm) {
    return null;
  }
}