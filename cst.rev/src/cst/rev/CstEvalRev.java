package cst.rev;

import cst.cstlang.exprconcern.Cst;
import eval.operation.EvalCst;
import eval.operation.EvalExpr;

public interface CstEvalRev extends CstRev<EvalExpr, EvalCst> {

	@Override
	default EvalCst cst(Cst it) {
		return new EvalCst(it, this);
	}

}
