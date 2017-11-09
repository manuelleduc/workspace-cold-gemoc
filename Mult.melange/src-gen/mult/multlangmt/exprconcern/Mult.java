/**
 */
package mult.multlangmt.exprconcern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mult.multlangmt.exprconcern.Mult#getLeft <em>Left</em>}</li>
 *   <li>{@link mult.multlangmt.exprconcern.Mult#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mult.multlangmt.exprconcern.ExprconcernPackage#getMult()
 * @model
 * @generated
 */
public interface Mult extends Expr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expr)
	 * @see mult.multlangmt.exprconcern.ExprconcernPackage#getMult_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getLeft();

	/**
	 * Sets the value of the '{@link mult.multlangmt.exprconcern.Mult#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expr value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expr)
	 * @see mult.multlangmt.exprconcern.ExprconcernPackage#getMult_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getRight();

	/**
	 * Sets the value of the '{@link mult.multlangmt.exprconcern.Mult#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expr value);

} // Mult
