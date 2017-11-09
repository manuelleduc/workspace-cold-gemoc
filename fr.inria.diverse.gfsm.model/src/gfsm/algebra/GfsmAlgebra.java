package gfsm.algebra;

import gfsm.BooleanAnd;
import gfsm.BooleanEqual;
import gfsm.BooleanExpression;
import gfsm.BooleanGreaterThan;
import gfsm.BooleanOr;
import gfsm.ConstExpr;
import gfsm.FSM;
import gfsm.FinalState;
import gfsm.GfsmPackage;
import gfsm.InitialState;
import gfsm.IntAdd;
import gfsm.IntBlock;
import gfsm.IntExpression;
import gfsm.IntMult;
import gfsm.IntNeg;
import gfsm.IntOperation;
import gfsm.IntVarAssign;
import gfsm.IntVarRef;
import gfsm.State;
import gfsm.Transition;

public interface GfsmAlgebra<A, B, C, D, E, F> {

	A booleanAnd(final BooleanAnd booleanAnd);

	A booleanEqual(final BooleanEqual booleanEqual);

	A booleanGreaterThan(final BooleanGreaterThan booleanGreaterThan);

	A booleanOr(final BooleanOr booleanOr);

	B constExpr(final ConstExpr constExpr);

	C fSM(final FSM fSM);

	D finalState(final FinalState finalState);

	D initialState(final InitialState initialState);

	B intAdd(final IntAdd intAdd);

	E intBlock(final IntBlock intBlock);

	B intMult(final IntMult intMult);

	B intNeg(final IntNeg intNeg);

	E intVarAssign(final IntVarAssign intVarAssign);

	B intVarRef(final IntVarRef intVarRef);

	D state(final State state);

	F transition(final Transition transition);

	public default A $(final BooleanExpression booleanExpression) {
		final A ret;
		if (booleanExpression.eClass().getClassifierID() == GfsmPackage.BOOLEAN_AND) {
			ret = this.booleanAnd((BooleanAnd) booleanExpression);
		} else if (booleanExpression.eClass().getClassifierID() == GfsmPackage.BOOLEAN_EQUAL) {
			ret = this.booleanEqual((BooleanEqual) booleanExpression);
		} else if (booleanExpression.eClass().getClassifierID() == GfsmPackage.BOOLEAN_GREATER_THAN) {
			ret = this.booleanGreaterThan((BooleanGreaterThan) booleanExpression);
		} else if (booleanExpression.eClass().getClassifierID() == GfsmPackage.BOOLEAN_OR) {
			ret = this.booleanOr((BooleanOr) booleanExpression);
		} else {
			throw new RuntimeException("Unknow BooleanExpression " + booleanExpression);
		}
		return ret;
	}
	public default B $(final IntExpression intExpression) {
		final B ret;
		if (intExpression.eClass().getClassifierID() == GfsmPackage.CONST_EXPR) {
			ret = this.constExpr((ConstExpr) intExpression);
		} else if (intExpression.eClass().getClassifierID() == GfsmPackage.INT_ADD) {
			ret = this.intAdd((IntAdd) intExpression);
		} else if (intExpression.eClass().getClassifierID() == GfsmPackage.INT_MULT) {
			ret = this.intMult((IntMult) intExpression);
		} else if (intExpression.eClass().getClassifierID() == GfsmPackage.INT_NEG) {
			ret = this.intNeg((IntNeg) intExpression);
		} else if (intExpression.eClass().getClassifierID() == GfsmPackage.INT_VAR_REF) {
			ret = this.intVarRef((IntVarRef) intExpression);
		} else {
			throw new RuntimeException("Unknow IntExpression " + intExpression);
		}
		return ret;
	}
	public default C $(final FSM fSM) {
		final C ret;
		if (fSM.eClass().getClassifierID() == GfsmPackage.FSM) {
			ret = this.fSM((FSM) fSM);
		} else {
			throw new RuntimeException("Unknow FSM " + fSM);
		}
		return ret;
	}
	public default D $(final State state) {
		final D ret;
		if (state.eClass().getClassifierID() == GfsmPackage.FINAL_STATE) {
			ret = this.finalState((FinalState) state);
		} else if (state.eClass().getClassifierID() == GfsmPackage.INITIAL_STATE) {
			ret = this.initialState((InitialState) state);
		} else if (state.eClass().getClassifierID() == GfsmPackage.STATE) {
			ret = this.state((State) state);
		} else {
			throw new RuntimeException("Unknow State " + state);
		}
		return ret;
	}
	public default E $(final IntOperation intOperation) {
		final E ret;
		if (intOperation.eClass().getClassifierID() == GfsmPackage.INT_BLOCK) {
			ret = this.intBlock((IntBlock) intOperation);
		} else if (intOperation.eClass().getClassifierID() == GfsmPackage.INT_VAR_ASSIGN) {
			ret = this.intVarAssign((IntVarAssign) intOperation);
		} else {
			throw new RuntimeException("Unknow IntOperation " + intOperation);
		}
		return ret;
	}
	public default F $(final Transition transition) {
		final F ret;
		if (transition.eClass().getClassifierID() == GfsmPackage.TRANSITION) {
			ret = this.transition((Transition) transition);
		} else {
			throw new RuntimeException("Unknow Transition " + transition);
		}
		return ret;
	}
}