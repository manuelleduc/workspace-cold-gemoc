/**
 */
package gfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gfsm.GfsmPackage
 * @generated
 */
public interface GfsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GfsmFactory eINSTANCE = gfsm.impl.GfsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
	FSM createFSM();

	/**
	 * Returns a new object of class '<em>Int Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Add</em>'.
	 * @generated
	 */
	IntAdd createIntAdd();

	/**
	 * Returns a new object of class '<em>Int Mult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Mult</em>'.
	 * @generated
	 */
	IntMult createIntMult();

	/**
	 * Returns a new object of class '<em>Int Neg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Neg</em>'.
	 * @generated
	 */
	IntNeg createIntNeg();

	/**
	 * Returns a new object of class '<em>Int Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Var Ref</em>'.
	 * @generated
	 */
	IntVarRef createIntVarRef();

	/**
	 * Returns a new object of class '<em>Const Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Expr</em>'.
	 * @generated
	 */
	ConstExpr createConstExpr();

	/**
	 * Returns a new object of class '<em>Int Var Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Var Assign</em>'.
	 * @generated
	 */
	IntVarAssign createIntVarAssign();

	/**
	 * Returns a new object of class '<em>Int Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Block</em>'.
	 * @generated
	 */
	IntBlock createIntBlock();

	/**
	 * Returns a new object of class '<em>Boolean Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Equal</em>'.
	 * @generated
	 */
	BooleanEqual createBooleanEqual();

	/**
	 * Returns a new object of class '<em>Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Or</em>'.
	 * @generated
	 */
	BooleanOr createBooleanOr();

	/**
	 * Returns a new object of class '<em>Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean And</em>'.
	 * @generated
	 */
	BooleanAnd createBooleanAnd();

	/**
	 * Returns a new object of class '<em>Boolean Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Greater Than</em>'.
	 * @generated
	 */
	BooleanGreaterThan createBooleanGreaterThan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GfsmPackage getGfsmPackage();

} //GfsmFactory
