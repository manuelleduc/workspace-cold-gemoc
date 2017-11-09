/**
 */
package gfsm.util;

import gfsm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gfsm.GfsmPackage
 * @generated
 */
public class GfsmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GfsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GfsmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GfsmSwitch<Adapter> modelSwitch =
		new GfsmSwitch<Adapter>() {
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseFinalState(FinalState object) {
				return createFinalStateAdapter();
			}
			@Override
			public Adapter caseInitialState(InitialState object) {
				return createInitialStateAdapter();
			}
			@Override
			public Adapter caseFSM(FSM object) {
				return createFSMAdapter();
			}
			@Override
			public Adapter caseIntBinaryExpression(IntBinaryExpression object) {
				return createIntBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseIntAdd(IntAdd object) {
				return createIntAddAdapter();
			}
			@Override
			public Adapter caseIntMult(IntMult object) {
				return createIntMultAdapter();
			}
			@Override
			public Adapter caseIntNeg(IntNeg object) {
				return createIntNegAdapter();
			}
			@Override
			public Adapter caseIntVarRef(IntVarRef object) {
				return createIntVarRefAdapter();
			}
			@Override
			public Adapter caseConstExpr(ConstExpr object) {
				return createConstExprAdapter();
			}
			@Override
			public Adapter caseBooleanExpression(BooleanExpression object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public Adapter caseIntOperation(IntOperation object) {
				return createIntOperationAdapter();
			}
			@Override
			public Adapter caseIntVarAssign(IntVarAssign object) {
				return createIntVarAssignAdapter();
			}
			@Override
			public Adapter caseIntBlock(IntBlock object) {
				return createIntBlockAdapter();
			}
			@Override
			public Adapter caseBooleanEqual(BooleanEqual object) {
				return createBooleanEqualAdapter();
			}
			@Override
			public Adapter caseBooleanOr(BooleanOr object) {
				return createBooleanOrAdapter();
			}
			@Override
			public Adapter caseBooleanAnd(BooleanAnd object) {
				return createBooleanAndAdapter();
			}
			@Override
			public Adapter caseBooleanGreaterThan(BooleanGreaterThan object) {
				return createBooleanGreaterThanAdapter();
			}
			@Override
			public Adapter caseBooleanBinaryExpression(BooleanBinaryExpression object) {
				return createBooleanBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseBooleanCompareExpression(BooleanCompareExpression object) {
				return createBooleanCompareExpressionAdapter();
			}
			@Override
			public Adapter caseIntExpression(IntExpression object) {
				return createIntExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gfsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.FinalState
	 * @generated
	 */
	public Adapter createFinalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.InitialState
	 * @generated
	 */
	public Adapter createInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.FSM
	 * @generated
	 */
	public Adapter createFSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntBinaryExpression <em>Int Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntBinaryExpression
	 * @generated
	 */
	public Adapter createIntBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntAdd <em>Int Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntAdd
	 * @generated
	 */
	public Adapter createIntAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntMult <em>Int Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntMult
	 * @generated
	 */
	public Adapter createIntMultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntNeg <em>Int Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntNeg
	 * @generated
	 */
	public Adapter createIntNegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntVarRef <em>Int Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntVarRef
	 * @generated
	 */
	public Adapter createIntVarRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.ConstExpr <em>Const Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.ConstExpr
	 * @generated
	 */
	public Adapter createConstExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntOperation <em>Int Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntOperation
	 * @generated
	 */
	public Adapter createIntOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntVarAssign <em>Int Var Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntVarAssign
	 * @generated
	 */
	public Adapter createIntVarAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntBlock <em>Int Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntBlock
	 * @generated
	 */
	public Adapter createIntBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanEqual <em>Boolean Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanEqual
	 * @generated
	 */
	public Adapter createBooleanEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanOr <em>Boolean Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanOr
	 * @generated
	 */
	public Adapter createBooleanOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanAnd <em>Boolean And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanAnd
	 * @generated
	 */
	public Adapter createBooleanAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanGreaterThan <em>Boolean Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanGreaterThan
	 * @generated
	 */
	public Adapter createBooleanGreaterThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanBinaryExpression <em>Boolean Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanBinaryExpression
	 * @generated
	 */
	public Adapter createBooleanBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.BooleanCompareExpression <em>Boolean Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.BooleanCompareExpression
	 * @generated
	 */
	public Adapter createBooleanCompareExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gfsm.IntExpression <em>Int Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gfsm.IntExpression
	 * @generated
	 */
	public Adapter createIntExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GfsmAdapterFactory
