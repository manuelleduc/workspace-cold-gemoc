/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.A#getBs <em>Bs</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
	/**
	 * Returns the value of the '<em><b>Bs</b></em>' containment reference list.
	 * The list contents are of type {@link model.B}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bs</em>' containment reference list.
	 * @see model.ModelPackage#getA_Bs()
	 * @model containment="true"
	 * @generated
	 */
	EList<B> getBs();

} // A
