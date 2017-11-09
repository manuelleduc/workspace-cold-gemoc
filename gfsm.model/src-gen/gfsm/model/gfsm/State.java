/**
 */
package gfsm.model.gfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gfsm.model.gfsm.State#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link gfsm.model.gfsm.State#getIncommings <em>Incommings</em>}</li>
 *   <li>{@link gfsm.model.gfsm.State#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gfsm.model.gfsm.GfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' reference list.
	 * The list contents are of type {@link gfsm.model.gfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link gfsm.model.gfsm.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' reference list.
	 * @see gfsm.model.gfsm.GfsmPackage#getState_Outgoings()
	 * @see gfsm.model.gfsm.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoings();

	/**
	 * Returns the value of the '<em><b>Incommings</b></em>' reference list.
	 * The list contents are of type {@link gfsm.model.gfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link gfsm.model.gfsm.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incommings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incommings</em>' reference list.
	 * @see gfsm.model.gfsm.GfsmPackage#getState_Incommings()
	 * @see gfsm.model.gfsm.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncommings();

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
	 * @see gfsm.model.gfsm.GfsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gfsm.model.gfsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State
