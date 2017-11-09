/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.Variable#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Proposition
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
   * @see #setRef(Feature)
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getVariable_Ref()
   * @model
   * @generated
   */
  Feature getRef();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.Variable#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Feature value);

} // Variable
