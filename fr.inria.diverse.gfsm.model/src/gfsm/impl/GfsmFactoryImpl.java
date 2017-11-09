/**
 */
package gfsm.impl;

import gfsm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GfsmFactoryImpl extends EFactoryImpl implements GfsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GfsmFactory init() {
		try {
			GfsmFactory theGfsmFactory = (GfsmFactory)EPackage.Registry.INSTANCE.getEFactory(GfsmPackage.eNS_URI);
			if (theGfsmFactory != null) {
				return theGfsmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GfsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GfsmPackage.TRANSITION: return createTransition();
			case GfsmPackage.STATE: return createState();
			case GfsmPackage.FINAL_STATE: return createFinalState();
			case GfsmPackage.INITIAL_STATE: return createInitialState();
			case GfsmPackage.FSM: return createFSM();
			case GfsmPackage.INT_ADD: return createIntAdd();
			case GfsmPackage.INT_MULT: return createIntMult();
			case GfsmPackage.INT_NEG: return createIntNeg();
			case GfsmPackage.INT_VAR_REF: return createIntVarRef();
			case GfsmPackage.CONST_EXPR: return createConstExpr();
			case GfsmPackage.INT_VAR_ASSIGN: return createIntVarAssign();
			case GfsmPackage.INT_BLOCK: return createIntBlock();
			case GfsmPackage.BOOLEAN_EQUAL: return createBooleanEqual();
			case GfsmPackage.BOOLEAN_OR: return createBooleanOr();
			case GfsmPackage.BOOLEAN_AND: return createBooleanAnd();
			case GfsmPackage.BOOLEAN_GREATER_THAN: return createBooleanGreaterThan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM createFSM() {
		FSMImpl fsm = new FSMImpl();
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAdd createIntAdd() {
		IntAddImpl intAdd = new IntAddImpl();
		return intAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntMult createIntMult() {
		IntMultImpl intMult = new IntMultImpl();
		return intMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntNeg createIntNeg() {
		IntNegImpl intNeg = new IntNegImpl();
		return intNeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarRef createIntVarRef() {
		IntVarRefImpl intVarRef = new IntVarRefImpl();
		return intVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpr createConstExpr() {
		ConstExprImpl constExpr = new ConstExprImpl();
		return constExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntVarAssign createIntVarAssign() {
		IntVarAssignImpl intVarAssign = new IntVarAssignImpl();
		return intVarAssign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntBlock createIntBlock() {
		IntBlockImpl intBlock = new IntBlockImpl();
		return intBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanEqual createBooleanEqual() {
		BooleanEqualImpl booleanEqual = new BooleanEqualImpl();
		return booleanEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOr createBooleanOr() {
		BooleanOrImpl booleanOr = new BooleanOrImpl();
		return booleanOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnd createBooleanAnd() {
		BooleanAndImpl booleanAnd = new BooleanAndImpl();
		return booleanAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGreaterThan createBooleanGreaterThan() {
		BooleanGreaterThanImpl booleanGreaterThan = new BooleanGreaterThanImpl();
		return booleanGreaterThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmPackage getGfsmPackage() {
		return (GfsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GfsmPackage getPackage() {
		return GfsmPackage.eINSTANCE;
	}

} //GfsmFactoryImpl
