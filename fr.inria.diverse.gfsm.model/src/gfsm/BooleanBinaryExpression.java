/**
 */
package gfsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gfsm.BooleanBinaryExpression#getBoolExpression1 <em>Bool Expression1</em>}</li>
 *   <li>{@link gfsm.BooleanBinaryExpression#getBoolExpression2 <em>Bool Expression2</em>}</li>
 * </ul>
 *
 * @see gfsm.GfsmPackage#getBooleanBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BooleanBinaryExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Bool Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Expression1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Expression1</em>' containment reference.
	 * @see #setBoolExpression1(BooleanExpression)
	 * @see gfsm.GfsmPackage#getBooleanBinaryExpression_BoolExpression1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBoolExpression1();

	/**
	 * Sets the value of the '{@link gfsm.BooleanBinaryExpression#getBoolExpression1 <em>Bool Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Expression1</em>' containment reference.
	 * @see #getBoolExpression1()
	 * @generated
	 */
	void setBoolExpression1(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Bool Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Expression2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Expression2</em>' containment reference.
	 * @see #setBoolExpression2(BooleanExpression)
	 * @see gfsm.GfsmPackage#getBooleanBinaryExpression_BoolExpression2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getBoolExpression2();

	/**
	 * Sets the value of the '{@link gfsm.BooleanBinaryExpression#getBoolExpression2 <em>Bool Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool Expression2</em>' containment reference.
	 * @see #getBoolExpression2()
	 * @generated
	 */
	void setBoolExpression2(BooleanExpression value);

} // BooleanBinaryExpression
