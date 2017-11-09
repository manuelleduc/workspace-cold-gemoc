package multadd.rev;

import eval.operation.EvalAdd;
import eval.operation.EvalCst;
import eval.operation.EvalExpr;
import eval.operation.EvalMult;
import multadd.multaddlang.expr_cst_mult_add.Add;
import multadd.multaddlang.expr_cst_mult_add.Cst;
import multadd.multaddlang.expr_cst_mult_add.Mult;

public interface MultAddEvalRev extends MultAddRev<EvalExpr, EvalCst, EvalAdd, EvalMult> {

	@Override
	default EvalCst cst(Cst it) {
		return new EvalCst(it, this);
	}

	@Override
	default EvalAdd add(Add it) {
		return new EvalAdd(it, this);

	}

	@Override
	default EvalMult mult(Mult it) {
		return new EvalMult(it, this);
	}
}
