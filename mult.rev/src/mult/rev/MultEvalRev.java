package mult.rev;

import eval.operation.EvalCst;
import eval.operation.EvalExpr;
import eval.operation.EvalMult;
import mult.multlang.exprconcern.Cst;
import mult.multlang.exprconcern.Mult;

public interface MultEvalRev extends MultRev<EvalExpr, EvalCst, EvalMult> {
	@Override
	default EvalCst cst(Cst it) {
		return new EvalCst(it, this);
	}

	@Override
	default EvalMult mult(Mult it) {
		return new EvalMult(it, this);
	}
}
