/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mMCLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.mMCLang.Slice#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.mMCLang.MMCLangPackage#getSlice()
 * @model
 * @generated
 */
public interface Slice extends Operation
{
  /**
   * Returns the value of the '<em><b>Targets</b></em>' reference list.
   * The list contents are of type {@link fr.mleduc.mMLang.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' reference list.
   * @see fr.mleduc.mMCLang.MMCLangPackage#getSlice_Targets()
   * @model
   * @generated
   */
  EList<fr.mleduc.mMLang.Class> getTargets();

} // Slice
