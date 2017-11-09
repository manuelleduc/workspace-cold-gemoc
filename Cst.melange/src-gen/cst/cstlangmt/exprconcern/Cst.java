/**
 */
package cst.cstlangmt.exprconcern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cst.cstlangmt.exprconcern.Cst#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see cst.cstlangmt.exprconcern.ExprconcernPackage#getCst()
 * @model
 * @generated
 */
public interface Cst extends Expr {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see cst.cstlangmt.exprconcern.ExprconcernPackage#getCst_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link cst.cstlangmt.exprconcern.Cst#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // Cst
