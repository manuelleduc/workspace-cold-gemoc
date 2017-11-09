/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.mLang.InstanceVal#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.mLang.MLangPackage#getInstanceVal()
 * @model
 * @generated
 */
public interface InstanceVal extends Value
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Instance)
   * @see fr.mleduc.mLang.MLangPackage#getInstanceVal_Ref()
   * @model
   * @generated
   */
  Instance getRef();

  /**
   * Sets the value of the '{@link fr.mleduc.mLang.InstanceVal#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Instance value);

} // InstanceVal
