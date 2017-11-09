/**
 */
package gfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Neg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gfsm.IntNeg#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see gfsm.GfsmPackage#getIntNeg()
 * @model
 * @generated
 */
public interface IntNeg extends IntExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(IntExpression)
	 * @see gfsm.GfsmPackage#getIntNeg_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntExpression getExpression();

	/**
	 * Sets the value of the '{@link gfsm.IntNeg#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(IntExpression value);

} // IntNeg
