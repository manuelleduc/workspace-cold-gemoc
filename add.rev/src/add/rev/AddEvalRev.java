package add.rev;

import add.addlang.expr_cst_add.Add;
import add.addlang.expr_cst_add.Cst;
import eval.operation.EvalAdd;
import eval.operation.EvalCst;
import eval.operation.EvalExpr;

public interface AddEvalRev extends AddRev<EvalExpr, EvalCst, EvalAdd> {

	@Override
	default EvalCst cst(Cst it) {
		return new EvalCst(it, this);
	}

	@Override
	default EvalAdd add(Add it) {
		return new EvalAdd(it, this);
	}
	
}
