/**
 */
package varlang.varlangmt.exprconcern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link varlang.varlangmt.exprconcern.Var#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see varlang.varlangmt.exprconcern.ExprconcernPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends Expr {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see varlang.varlangmt.exprconcern.ExprconcernPackage#getVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link varlang.varlangmt.exprconcern.Var#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Var