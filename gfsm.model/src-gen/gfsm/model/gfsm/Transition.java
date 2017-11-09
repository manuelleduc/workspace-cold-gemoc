/**
 */
package gfsm.model.gfsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gfsm.model.gfsm.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link gfsm.model.gfsm.Transition#getTo <em>To</em>}</li>
 *   <li>{@link gfsm.model.gfsm.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link gfsm.model.gfsm.Transition#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see gfsm.model.gfsm.GfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gfsm.model.gfsm.State#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see gfsm.model.gfsm.GfsmPackage#getTransition_From()
	 * @see gfsm.model.gfsm.State#getOutgoings
	 * @model opposite="outgoings" required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link gfsm.model.gfsm.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gfsm.model.gfsm.State#getIncommings <em>Incommings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see gfsm.model.gfsm.GfsmPackage#getTransition_To()
	 * @see gfsm.model.gfsm.State#getIncommings
	 * @model opposite="incommings" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link gfsm.model.gfsm.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see gfsm.model.gfsm.GfsmPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link gfsm.model.gfsm.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see gfsm.model.gfsm.GfsmPackage#getTransition_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link gfsm.model.gfsm.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

} // Transition
