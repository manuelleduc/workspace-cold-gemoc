/**
 */
package gfsm;

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
 *   <li>{@link gfsm.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link gfsm.Transition#getFsm <em>Fsm</em>}</li>
 *   <li>{@link gfsm.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link gfsm.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link gfsm.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see gfsm.GfsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(BooleanExpression)
	 * @see gfsm.GfsmPackage#getTransition_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BooleanExpression getGuard();

	/**
	 * Sets the value of the '{@link gfsm.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(BooleanExpression value);

	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gfsm.FSM#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' container reference.
	 * @see #setFsm(FSM)
	 * @see gfsm.GfsmPackage#getTransition_Fsm()
	 * @see gfsm.FSM#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link gfsm.Transition#getFsm <em>Fsm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' container reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

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
	 * @see gfsm.GfsmPackage#getTransition_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link gfsm.Transition#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gfsm.State#getOutgoingtransitions <em>Outgoingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(State)
	 * @see gfsm.GfsmPackage#getTransition_From()
	 * @see gfsm.State#getOutgoingtransitions
	 * @model opposite="outgoingtransitions" required="true"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link gfsm.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gfsm.State#getIncommingtransitions <em>Incommingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see gfsm.GfsmPackage#getTransition_To()
	 * @see gfsm.State#getIncommingtransitions
	 * @model opposite="incommingtransitions" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link gfsm.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

} // Transition
