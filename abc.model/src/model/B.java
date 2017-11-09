/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.B#getCs <em>Cs</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference list.
	 * The list contents are of type {@link model.C}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference list.
	 * @see model.ModelPackage#getB_Cs()
	 * @model containment="true"
	 * @generated
	 */
	EList<C> getCs();

} // B
