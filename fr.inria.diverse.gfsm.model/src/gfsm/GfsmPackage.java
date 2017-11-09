/**
 */
package gfsm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gfsm.GfsmFactory
 * @model kind="package"
 * @generated
 */
public interface GfsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gfsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://diverse.inria.fr/gfsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gfsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GfsmPackage eINSTANCE = gfsm.impl.GfsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link gfsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.TransitionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = 0;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FSM = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.StateImpl
	 * @see gfsm.impl.GfsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IN_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUT_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FSM = 3;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGTRANSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMMINGTRANSITIONS = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.FinalStateImpl
	 * @see gfsm.impl.GfsmPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IN_EXPRESSION = STATE__IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUT_EXPRESSION = STATE__OUT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__FSM = STATE__FSM;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOINGTRANSITIONS = STATE__OUTGOINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMMINGTRANSITIONS = STATE__INCOMMINGTRANSITIONS;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.InitialStateImpl
	 * @see gfsm.impl.GfsmPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__IN_EXPRESSION = STATE__IN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Out Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUT_EXPRESSION = STATE__OUT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Fsm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__FSM = STATE__FSM;

	/**
	 * The feature id for the '<em><b>Outgoingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__OUTGOINGTRANSITIONS = STATE__OUTGOINGTRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incommingtransitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__INCOMMINGTRANSITIONS = STATE__INCOMMINGTRANSITIONS;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.FSMImpl
	 * @see gfsm.impl.GfsmPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIALSTATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__CURRENT_STATE = 4;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntExpressionImpl <em>Int Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntExpressionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntExpression()
	 * @generated
	 */
	int INT_EXPRESSION = 21;

	/**
	 * The number of structural features of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Int Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntBinaryExpressionImpl <em>Int Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntBinaryExpressionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntBinaryExpression()
	 * @generated
	 */
	int INT_BINARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_EXPRESSION__EXPRESSION1 = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_EXPRESSION__EXPRESSION2 = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_EXPRESSION_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BINARY_EXPRESSION_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntAddImpl <em>Int Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntAddImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntAdd()
	 * @generated
	 */
	int INT_ADD = 6;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ADD__EXPRESSION1 = INT_BINARY_EXPRESSION__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ADD__EXPRESSION2 = INT_BINARY_EXPRESSION__EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Int Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ADD_FEATURE_COUNT = INT_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ADD_OPERATION_COUNT = INT_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntMultImpl <em>Int Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntMultImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntMult()
	 * @generated
	 */
	int INT_MULT = 7;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_MULT__EXPRESSION1 = INT_BINARY_EXPRESSION__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_MULT__EXPRESSION2 = INT_BINARY_EXPRESSION__EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Int Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_MULT_FEATURE_COUNT = INT_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_MULT_OPERATION_COUNT = INT_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntNegImpl <em>Int Neg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntNegImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntNeg()
	 * @generated
	 */
	int INT_NEG = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_NEG__EXPRESSION = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_NEG_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Neg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_NEG_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntVarRefImpl <em>Int Var Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntVarRefImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntVarRef()
	 * @generated
	 */
	int INT_VAR_REF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_REF__NAME = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_REF_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Var Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_REF_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.ConstExprImpl <em>Const Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.ConstExprImpl
	 * @see gfsm.impl.GfsmPackageImpl#getConstExpr()
	 * @generated
	 */
	int CONST_EXPR = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR__VALUE = INT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_FEATURE_COUNT = INT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_EXPR_OPERATION_COUNT = INT_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanExpressionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntOperationImpl <em>Int Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntOperationImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntOperation()
	 * @generated
	 */
	int INT_OPERATION = 12;

	/**
	 * The number of structural features of the '<em>Int Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Int Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntVarAssignImpl <em>Int Var Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntVarAssignImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntVarAssign()
	 * @generated
	 */
	int INT_VAR_ASSIGN = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ASSIGN__NAME = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ASSIGN__EXPRESSION = INT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Var Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ASSIGN_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Var Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VAR_ASSIGN_OPERATION_COUNT = INT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.IntBlockImpl <em>Int Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.IntBlockImpl
	 * @see gfsm.impl.GfsmPackageImpl#getIntBlock()
	 * @generated
	 */
	int INT_BLOCK = 14;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BLOCK__OPERATIONS = INT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BLOCK_FEATURE_COUNT = INT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_BLOCK_OPERATION_COUNT = INT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanCompareExpressionImpl <em>Boolean Compare Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanCompareExpressionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanCompareExpression()
	 * @generated
	 */
	int BOOLEAN_COMPARE_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMPARE_EXPRESSION__EXPRESSION1 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMPARE_EXPRESSION__EXPRESSION2 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMPARE_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_COMPARE_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanEqualImpl <em>Boolean Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanEqualImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanEqual()
	 * @generated
	 */
	int BOOLEAN_EQUAL = 15;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUAL__EXPRESSION1 = BOOLEAN_COMPARE_EXPRESSION__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUAL__EXPRESSION2 = BOOLEAN_COMPARE_EXPRESSION__EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Boolean Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUAL_FEATURE_COUNT = BOOLEAN_COMPARE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EQUAL_OPERATION_COUNT = BOOLEAN_COMPARE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanBinaryExpressionImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanBinaryExpression()
	 * @generated
	 */
	int BOOLEAN_BINARY_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Bool Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2 = BOOLEAN_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanOrImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanOr()
	 * @generated
	 */
	int BOOLEAN_OR = 16;

	/**
	 * The feature id for the '<em><b>Bool Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__BOOL_EXPRESSION1 = BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Bool Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR__BOOL_EXPRESSION2 = BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OR_OPERATION_COUNT = BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanAndImpl <em>Boolean And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanAndImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanAnd()
	 * @generated
	 */
	int BOOLEAN_AND = 17;

	/**
	 * The feature id for the '<em><b>Bool Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__BOOL_EXPRESSION1 = BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Bool Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND__BOOL_EXPRESSION2 = BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_FEATURE_COUNT = BOOLEAN_BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_AND_OPERATION_COUNT = BOOLEAN_BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gfsm.impl.BooleanGreaterThanImpl <em>Boolean Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gfsm.impl.BooleanGreaterThanImpl
	 * @see gfsm.impl.GfsmPackageImpl#getBooleanGreaterThan()
	 * @generated
	 */
	int BOOLEAN_GREATER_THAN = 18;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GREATER_THAN__EXPRESSION1 = BOOLEAN_COMPARE_EXPRESSION__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GREATER_THAN__EXPRESSION2 = BOOLEAN_COMPARE_EXPRESSION__EXPRESSION2;

	/**
	 * The number of structural features of the '<em>Boolean Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GREATER_THAN_FEATURE_COUNT = BOOLEAN_COMPARE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GREATER_THAN_OPERATION_COUNT = BOOLEAN_COMPARE_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link gfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see gfsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see gfsm.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the container reference '{@link gfsm.Transition#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fsm</em>'.
	 * @see gfsm.Transition#getFsm()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Fsm();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see gfsm.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link gfsm.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see gfsm.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link gfsm.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see gfsm.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for class '{@link gfsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see gfsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.State#getInExpression <em>In Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Expression</em>'.
	 * @see gfsm.State#getInExpression()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_InExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.State#getOutExpression <em>Out Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Expression</em>'.
	 * @see gfsm.State#getOutExpression()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutExpression();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gfsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the container reference '{@link gfsm.State#getFsm <em>Fsm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Fsm</em>'.
	 * @see gfsm.State#getFsm()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Fsm();

	/**
	 * Returns the meta object for the reference list '{@link gfsm.State#getOutgoingtransitions <em>Outgoingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingtransitions</em>'.
	 * @see gfsm.State#getOutgoingtransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoingtransitions();

	/**
	 * Returns the meta object for the reference list '{@link gfsm.State#getIncommingtransitions <em>Incommingtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incommingtransitions</em>'.
	 * @see gfsm.State#getIncommingtransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incommingtransitions();

	/**
	 * Returns the meta object for class '{@link gfsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see gfsm.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link gfsm.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see gfsm.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link gfsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see gfsm.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link gfsm.FSM#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see gfsm.FSM#getStates()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_States();

	/**
	 * Returns the meta object for the containment reference list '{@link gfsm.FSM#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see gfsm.FSM#getTransitions()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Transitions();

	/**
	 * Returns the meta object for the reference '{@link gfsm.FSM#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see gfsm.FSM#getInitialstate()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_Initialstate();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.FSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gfsm.FSM#getName()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_Name();

	/**
	 * Returns the meta object for the reference '{@link gfsm.FSM#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current State</em>'.
	 * @see gfsm.FSM#getCurrentState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_CurrentState();

	/**
	 * Returns the meta object for class '{@link gfsm.IntBinaryExpression <em>Int Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Binary Expression</em>'.
	 * @see gfsm.IntBinaryExpression
	 * @generated
	 */
	EClass getIntBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.IntBinaryExpression#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see gfsm.IntBinaryExpression#getExpression1()
	 * @see #getIntBinaryExpression()
	 * @generated
	 */
	EReference getIntBinaryExpression_Expression1();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.IntBinaryExpression#getExpression2 <em>Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression2</em>'.
	 * @see gfsm.IntBinaryExpression#getExpression2()
	 * @see #getIntBinaryExpression()
	 * @generated
	 */
	EReference getIntBinaryExpression_Expression2();

	/**
	 * Returns the meta object for class '{@link gfsm.IntAdd <em>Int Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Add</em>'.
	 * @see gfsm.IntAdd
	 * @generated
	 */
	EClass getIntAdd();

	/**
	 * Returns the meta object for class '{@link gfsm.IntMult <em>Int Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Mult</em>'.
	 * @see gfsm.IntMult
	 * @generated
	 */
	EClass getIntMult();

	/**
	 * Returns the meta object for class '{@link gfsm.IntNeg <em>Int Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Neg</em>'.
	 * @see gfsm.IntNeg
	 * @generated
	 */
	EClass getIntNeg();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.IntNeg#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gfsm.IntNeg#getExpression()
	 * @see #getIntNeg()
	 * @generated
	 */
	EReference getIntNeg_Expression();

	/**
	 * Returns the meta object for class '{@link gfsm.IntVarRef <em>Int Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Var Ref</em>'.
	 * @see gfsm.IntVarRef
	 * @generated
	 */
	EClass getIntVarRef();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.IntVarRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gfsm.IntVarRef#getName()
	 * @see #getIntVarRef()
	 * @generated
	 */
	EAttribute getIntVarRef_Name();

	/**
	 * Returns the meta object for class '{@link gfsm.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Expr</em>'.
	 * @see gfsm.ConstExpr
	 * @generated
	 */
	EClass getConstExpr();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.ConstExpr#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gfsm.ConstExpr#getValue()
	 * @see #getConstExpr()
	 * @generated
	 */
	EAttribute getConstExpr_Value();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see gfsm.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link gfsm.IntOperation <em>Int Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Operation</em>'.
	 * @see gfsm.IntOperation
	 * @generated
	 */
	EClass getIntOperation();

	/**
	 * Returns the meta object for class '{@link gfsm.IntVarAssign <em>Int Var Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Var Assign</em>'.
	 * @see gfsm.IntVarAssign
	 * @generated
	 */
	EClass getIntVarAssign();

	/**
	 * Returns the meta object for the attribute '{@link gfsm.IntVarAssign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gfsm.IntVarAssign#getName()
	 * @see #getIntVarAssign()
	 * @generated
	 */
	EAttribute getIntVarAssign_Name();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.IntVarAssign#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gfsm.IntVarAssign#getExpression()
	 * @see #getIntVarAssign()
	 * @generated
	 */
	EReference getIntVarAssign_Expression();

	/**
	 * Returns the meta object for class '{@link gfsm.IntBlock <em>Int Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Block</em>'.
	 * @see gfsm.IntBlock
	 * @generated
	 */
	EClass getIntBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link gfsm.IntBlock#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see gfsm.IntBlock#getOperations()
	 * @see #getIntBlock()
	 * @generated
	 */
	EReference getIntBlock_Operations();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanEqual <em>Boolean Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Equal</em>'.
	 * @see gfsm.BooleanEqual
	 * @generated
	 */
	EClass getBooleanEqual();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanOr <em>Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Or</em>'.
	 * @see gfsm.BooleanOr
	 * @generated
	 */
	EClass getBooleanOr();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanAnd <em>Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean And</em>'.
	 * @see gfsm.BooleanAnd
	 * @generated
	 */
	EClass getBooleanAnd();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanGreaterThan <em>Boolean Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Greater Than</em>'.
	 * @see gfsm.BooleanGreaterThan
	 * @generated
	 */
	EClass getBooleanGreaterThan();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Binary Expression</em>'.
	 * @see gfsm.BooleanBinaryExpression
	 * @generated
	 */
	EClass getBooleanBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.BooleanBinaryExpression#getBoolExpression1 <em>Bool Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Expression1</em>'.
	 * @see gfsm.BooleanBinaryExpression#getBoolExpression1()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_BoolExpression1();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.BooleanBinaryExpression#getBoolExpression2 <em>Bool Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool Expression2</em>'.
	 * @see gfsm.BooleanBinaryExpression#getBoolExpression2()
	 * @see #getBooleanBinaryExpression()
	 * @generated
	 */
	EReference getBooleanBinaryExpression_BoolExpression2();

	/**
	 * Returns the meta object for class '{@link gfsm.BooleanCompareExpression <em>Boolean Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Compare Expression</em>'.
	 * @see gfsm.BooleanCompareExpression
	 * @generated
	 */
	EClass getBooleanCompareExpression();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.BooleanCompareExpression#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see gfsm.BooleanCompareExpression#getExpression1()
	 * @see #getBooleanCompareExpression()
	 * @generated
	 */
	EReference getBooleanCompareExpression_Expression1();

	/**
	 * Returns the meta object for the containment reference '{@link gfsm.BooleanCompareExpression#getExpression2 <em>Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression2</em>'.
	 * @see gfsm.BooleanCompareExpression#getExpression2()
	 * @see #getBooleanCompareExpression()
	 * @generated
	 */
	EReference getBooleanCompareExpression_Expression2();

	/**
	 * Returns the meta object for class '{@link gfsm.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Expression</em>'.
	 * @see gfsm.IntExpression
	 * @generated
	 */
	EClass getIntExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GfsmFactory getGfsmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gfsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.TransitionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FSM = eINSTANCE.getTransition_Fsm();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '{@link gfsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.StateImpl
		 * @see gfsm.impl.GfsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>In Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__IN_EXPRESSION = eINSTANCE.getState_InExpression();

		/**
		 * The meta object literal for the '<em><b>Out Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUT_EXPRESSION = eINSTANCE.getState_OutExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Fsm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FSM = eINSTANCE.getState_Fsm();

		/**
		 * The meta object literal for the '<em><b>Outgoingtransitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGTRANSITIONS = eINSTANCE.getState_Outgoingtransitions();

		/**
		 * The meta object literal for the '<em><b>Incommingtransitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMMINGTRANSITIONS = eINSTANCE.getState_Incommingtransitions();

		/**
		 * The meta object literal for the '{@link gfsm.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.FinalStateImpl
		 * @see gfsm.impl.GfsmPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link gfsm.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.InitialStateImpl
		 * @see gfsm.impl.GfsmPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link gfsm.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.FSMImpl
		 * @see gfsm.impl.GfsmPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__STATES = eINSTANCE.getFSM_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__TRANSITIONS = eINSTANCE.getFSM_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__INITIALSTATE = eINSTANCE.getFSM_Initialstate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__NAME = eINSTANCE.getFSM_Name();

		/**
		 * The meta object literal for the '<em><b>Current State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__CURRENT_STATE = eINSTANCE.getFSM_CurrentState();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntBinaryExpressionImpl <em>Int Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntBinaryExpressionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntBinaryExpression()
		 * @generated
		 */
		EClass INT_BINARY_EXPRESSION = eINSTANCE.getIntBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BINARY_EXPRESSION__EXPRESSION1 = eINSTANCE.getIntBinaryExpression_Expression1();

		/**
		 * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BINARY_EXPRESSION__EXPRESSION2 = eINSTANCE.getIntBinaryExpression_Expression2();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntAddImpl <em>Int Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntAddImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntAdd()
		 * @generated
		 */
		EClass INT_ADD = eINSTANCE.getIntAdd();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntMultImpl <em>Int Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntMultImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntMult()
		 * @generated
		 */
		EClass INT_MULT = eINSTANCE.getIntMult();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntNegImpl <em>Int Neg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntNegImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntNeg()
		 * @generated
		 */
		EClass INT_NEG = eINSTANCE.getIntNeg();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_NEG__EXPRESSION = eINSTANCE.getIntNeg_Expression();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntVarRefImpl <em>Int Var Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntVarRefImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntVarRef()
		 * @generated
		 */
		EClass INT_VAR_REF = eINSTANCE.getIntVarRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VAR_REF__NAME = eINSTANCE.getIntVarRef_Name();

		/**
		 * The meta object literal for the '{@link gfsm.impl.ConstExprImpl <em>Const Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.ConstExprImpl
		 * @see gfsm.impl.GfsmPackageImpl#getConstExpr()
		 * @generated
		 */
		EClass CONST_EXPR = eINSTANCE.getConstExpr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONST_EXPR__VALUE = eINSTANCE.getConstExpr_Value();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanExpressionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntOperationImpl <em>Int Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntOperationImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntOperation()
		 * @generated
		 */
		EClass INT_OPERATION = eINSTANCE.getIntOperation();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntVarAssignImpl <em>Int Var Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntVarAssignImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntVarAssign()
		 * @generated
		 */
		EClass INT_VAR_ASSIGN = eINSTANCE.getIntVarAssign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VAR_ASSIGN__NAME = eINSTANCE.getIntVarAssign_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_VAR_ASSIGN__EXPRESSION = eINSTANCE.getIntVarAssign_Expression();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntBlockImpl <em>Int Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntBlockImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntBlock()
		 * @generated
		 */
		EClass INT_BLOCK = eINSTANCE.getIntBlock();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_BLOCK__OPERATIONS = eINSTANCE.getIntBlock_Operations();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanEqualImpl <em>Boolean Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanEqualImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanEqual()
		 * @generated
		 */
		EClass BOOLEAN_EQUAL = eINSTANCE.getBooleanEqual();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanOrImpl <em>Boolean Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanOrImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanOr()
		 * @generated
		 */
		EClass BOOLEAN_OR = eINSTANCE.getBooleanOr();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanAndImpl <em>Boolean And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanAndImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanAnd()
		 * @generated
		 */
		EClass BOOLEAN_AND = eINSTANCE.getBooleanAnd();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanGreaterThanImpl <em>Boolean Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanGreaterThanImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanGreaterThan()
		 * @generated
		 */
		EClass BOOLEAN_GREATER_THAN = eINSTANCE.getBooleanGreaterThan();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanBinaryExpressionImpl <em>Boolean Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanBinaryExpressionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanBinaryExpression()
		 * @generated
		 */
		EClass BOOLEAN_BINARY_EXPRESSION = eINSTANCE.getBooleanBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Bool Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1 = eINSTANCE.getBooleanBinaryExpression_BoolExpression1();

		/**
		 * The meta object literal for the '<em><b>Bool Expression2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2 = eINSTANCE.getBooleanBinaryExpression_BoolExpression2();

		/**
		 * The meta object literal for the '{@link gfsm.impl.BooleanCompareExpressionImpl <em>Boolean Compare Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.BooleanCompareExpressionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getBooleanCompareExpression()
		 * @generated
		 */
		EClass BOOLEAN_COMPARE_EXPRESSION = eINSTANCE.getBooleanCompareExpression();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COMPARE_EXPRESSION__EXPRESSION1 = eINSTANCE.getBooleanCompareExpression_Expression1();

		/**
		 * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_COMPARE_EXPRESSION__EXPRESSION2 = eINSTANCE.getBooleanCompareExpression_Expression2();

		/**
		 * The meta object literal for the '{@link gfsm.impl.IntExpressionImpl <em>Int Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gfsm.impl.IntExpressionImpl
		 * @see gfsm.impl.GfsmPackageImpl#getIntExpression()
		 * @generated
		 */
		EClass INT_EXPRESSION = eINSTANCE.getIntExpression();

	}

} //GfsmPackage
