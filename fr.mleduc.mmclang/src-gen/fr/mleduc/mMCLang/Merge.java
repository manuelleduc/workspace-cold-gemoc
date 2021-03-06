/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mMCLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.mMCLang.Merge#getPairs <em>Pairs</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.mMCLang.MMCLangPackage#getMerge()
 * @model
 * @generated
 */
public interface Merge extends Operation
{
  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.mMCLang.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see fr.mleduc.mMCLang.MMCLangPackage#getMerge_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getPairs();

} // Merge
