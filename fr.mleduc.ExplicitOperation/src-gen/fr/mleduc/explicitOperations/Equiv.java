/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equiv</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.Equiv#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Equiv#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getEquiv()
 * @model
 * @generated
 */
public interface Equiv extends Proposition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Proposition)
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getEquiv_Left()
   * @model containment="true"
   * @generated
   */
  Proposition getLeft();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.Equiv#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Proposition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Proposition)
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getEquiv_Right()
   * @model containment="true"
   * @generated
   */
  Proposition getRight();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.Equiv#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Proposition value);

} // Equiv