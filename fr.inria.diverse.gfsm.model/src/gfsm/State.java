/**
 */
package gfsm;

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
 *   <li>{@link gfsm.State#getInExpression <em>In Expression</em>}</li>
 *   <li>{@link gfsm.State#getOutExpression <em>Out Expression</em>}</li>
 *   <li>{@link gfsm.State#getName <em>Name</em>}</li>
 *   <li>{@link gfsm.State#getFsm <em>Fsm</em>}</li>
 *   <li>{@link gfsm.State#getOutgoingtransitions <em>Outgoingtransitions</em>}</li>
 *   <li>{@link gfsm.State#getIncommingtransitions <em>Incommingtransitions</em>}</li>
 * </ul>
 *
 * @see gfsm.GfsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Expression</em>' containment reference.
	 * @see #setInExpression(IntOperation)
	 * @see gfsm.GfsmPackage#getState_InExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntOperation getInExpression();

	/**
	 * Sets the value of the '{@link gfsm.State#getInExpression <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Expression</em>' containment reference.
	 * @see #getInExpression()
	 * @generated
	 */
	void setInExpression(IntOperation value);

	/**
	 * Returns the value of the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Expression</em>' containment reference.
	 * @see #setOutExpression(IntOperation)
	 * @see gfsm.GfsmPackage#getState_OutExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntOperation getOutExpression();

	/**
	 * Sets the value of the '{@link gfsm.State#getOutExpression <em>Out Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Expression</em>' containment reference.
	 * @see #getOutExpression()
	 * @generated
	 */
	void setOutExpression(IntOperation value);

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
	 * @see gfsm.GfsmPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gfsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fsm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gfsm.FSM#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fsm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fsm</em>' container reference.
	 * @see #setFsm(FSM)
	 * @see gfsm.GfsmPackage#getState_Fsm()
	 * @see gfsm.FSM#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	FSM getFsm();

	/**
	 * Sets the value of the '{@link gfsm.State#getFsm <em>Fsm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fsm</em>' container reference.
	 * @see #getFsm()
	 * @generated
	 */
	void setFsm(FSM value);

	/**
	 * Returns the value of the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * The list contents are of type {@link gfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link gfsm.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingtransitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingtransitions</em>' reference list.
	 * @see gfsm.GfsmPackage#getState_Outgoingtransitions()
	 * @see gfsm.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoingtransitions();

	/**
	 * Returns the value of the '<em><b>Incommingtransitions</b></em>' reference list.
	 * The list contents are of type {@link gfsm.Transition}.
	 * It is bidirectional and its opposite is '{@link gfsm.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incommingtransitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incommingtransitions</em>' reference list.
	 * @see gfsm.GfsmPackage#getState_Incommingtransitions()
	 * @see gfsm.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncommingtransitions();

} // State
