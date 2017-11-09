/**
 */
package gfsm.util;

import gfsm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gfsm.GfsmPackage
 * @generated
 */
public class GfsmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GfsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GfsmSwitch() {
		if (modelPackage == null) {
			modelPackage = GfsmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GfsmPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.FINAL_STATE: {
				FinalState finalState = (FinalState)theEObject;
				T result = caseFinalState(finalState);
				if (result == null) result = caseState(finalState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INITIAL_STATE: {
				InitialState initialState = (InitialState)theEObject;
				T result = caseInitialState(initialState);
				if (result == null) result = caseState(initialState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.FSM: {
				FSM fsm = (FSM)theEObject;
				T result = caseFSM(fsm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_BINARY_EXPRESSION: {
				IntBinaryExpression intBinaryExpression = (IntBinaryExpression)theEObject;
				T result = caseIntBinaryExpression(intBinaryExpression);
				if (result == null) result = caseIntExpression(intBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_ADD: {
				IntAdd intAdd = (IntAdd)theEObject;
				T result = caseIntAdd(intAdd);
				if (result == null) result = caseIntBinaryExpression(intAdd);
				if (result == null) result = caseIntExpression(intAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_MULT: {
				IntMult intMult = (IntMult)theEObject;
				T result = caseIntMult(intMult);
				if (result == null) result = caseIntBinaryExpression(intMult);
				if (result == null) result = caseIntExpression(intMult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_NEG: {
				IntNeg intNeg = (IntNeg)theEObject;
				T result = caseIntNeg(intNeg);
				if (result == null) result = caseIntExpression(intNeg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_VAR_REF: {
				IntVarRef intVarRef = (IntVarRef)theEObject;
				T result = caseIntVarRef(intVarRef);
				if (result == null) result = caseIntExpression(intVarRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.CONST_EXPR: {
				ConstExpr constExpr = (ConstExpr)theEObject;
				T result = caseConstExpr(constExpr);
				if (result == null) result = caseIntExpression(constExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_OPERATION: {
				IntOperation intOperation = (IntOperation)theEObject;
				T result = caseIntOperation(intOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_VAR_ASSIGN: {
				IntVarAssign intVarAssign = (IntVarAssign)theEObject;
				T result = caseIntVarAssign(intVarAssign);
				if (result == null) result = caseIntOperation(intVarAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_BLOCK: {
				IntBlock intBlock = (IntBlock)theEObject;
				T result = caseIntBlock(intBlock);
				if (result == null) result = caseIntOperation(intBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_EQUAL: {
				BooleanEqual booleanEqual = (BooleanEqual)theEObject;
				T result = caseBooleanEqual(booleanEqual);
				if (result == null) result = caseBooleanCompareExpression(booleanEqual);
				if (result == null) result = caseBooleanExpression(booleanEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_OR: {
				BooleanOr booleanOr = (BooleanOr)theEObject;
				T result = caseBooleanOr(booleanOr);
				if (result == null) result = caseBooleanBinaryExpression(booleanOr);
				if (result == null) result = caseBooleanExpression(booleanOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_AND: {
				BooleanAnd booleanAnd = (BooleanAnd)theEObject;
				T result = caseBooleanAnd(booleanAnd);
				if (result == null) result = caseBooleanBinaryExpression(booleanAnd);
				if (result == null) result = caseBooleanExpression(booleanAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_GREATER_THAN: {
				BooleanGreaterThan booleanGreaterThan = (BooleanGreaterThan)theEObject;
				T result = caseBooleanGreaterThan(booleanGreaterThan);
				if (result == null) result = caseBooleanCompareExpression(booleanGreaterThan);
				if (result == null) result = caseBooleanExpression(booleanGreaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION: {
				BooleanBinaryExpression booleanBinaryExpression = (BooleanBinaryExpression)theEObject;
				T result = caseBooleanBinaryExpression(booleanBinaryExpression);
				if (result == null) result = caseBooleanExpression(booleanBinaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.BOOLEAN_COMPARE_EXPRESSION: {
				BooleanCompareExpression booleanCompareExpression = (BooleanCompareExpression)theEObject;
				T result = caseBooleanCompareExpression(booleanCompareExpression);
				if (result == null) result = caseBooleanExpression(booleanCompareExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GfsmPackage.INT_EXPRESSION: {
				IntExpression intExpression = (IntExpression)theEObject;
				T result = caseIntExpression(intExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalState(FinalState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialState(InitialState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFSM(FSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntBinaryExpression(IntBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntAdd(IntAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Mult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Mult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntMult(IntMult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Neg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Neg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntNeg(IntNeg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Var Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntVarRef(IntVarRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstExpr(ConstExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntOperation(IntOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Var Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Var Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntVarAssign(IntVarAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntBlock(IntBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanEqual(BooleanEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOr(BooleanOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAnd(BooleanAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanGreaterThan(BooleanGreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinaryExpression(BooleanBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Compare Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Compare Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCompareExpression(BooleanCompareExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntExpression(IntExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GfsmSwitch
