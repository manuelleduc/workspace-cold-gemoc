/**
 */
package gfsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gfsm.FSM#getStates <em>States</em>}</li>
 *   <li>{@link gfsm.FSM#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link gfsm.FSM#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link gfsm.FSM#getName <em>Name</em>}</li>
 *   <li>{@link gfsm.FSM#getCurrentState <em>Current State</em>}</li>
 * </ul>
 *
 * @see gfsm.GfsmPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link gfsm.State}.
	 * It is bidirectional and its opposite is '{@link gfsm.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see gfsm.GfsmPackage#getFSM_States()
	 * @see gfsm.State#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link gfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link gfsm.Transition#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see gfsm.GfsmPackage#getFSM_Transitions()
	 * @see gfsm.Transition#getFsm
	 * @model opposite="fsm" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(InitialState)
	 * @see gfsm.GfsmPackage#getFSM_Initialstate()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link gfsm.FSM#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gfsm.GfsmPackage#getFSM_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gfsm.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State</em>' reference.
	 * @see #setCurrentState(State)
	 * @see gfsm.GfsmPackage#getFSM_CurrentState()
	 * @model
	 * @generated
	 */
	State getCurrentState();

	/**
	 * Sets the value of the '{@link gfsm.FSM#getCurrentState <em>Current State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' reference.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(State value);

} // FSM
