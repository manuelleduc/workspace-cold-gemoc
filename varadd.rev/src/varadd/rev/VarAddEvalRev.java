package varadd.rev;

import eval.operation.EvalCAdd;
import eval.operation.EvalCExpr;
import eval.operation.EvalCVariable;
import varadd.varaddlang.exprconcern.Add;
import varadd.varaddlang.exprconcern.Variable;

public interface VarAddEvalRev extends VarAddRev<EvalCExpr, EvalCVariable, EvalCAdd> {

	@Override
	default EvalCAdd add(Add it) {
		return new EvalCAdd(it, this);
	}

	@Override
	default EvalCVariable variable(Variable it) {
		return new EvalCVariable(it, this);
	}

}
