/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.mLang.FreeVal#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.mLang.MLangPackage#getFreeVal()
 * @model
 * @generated
 */
public interface FreeVal extends Value
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see fr.mleduc.mLang.MLangPackage#getFreeVal_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link fr.mleduc.mLang.FreeVal#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

} // FreeVal
