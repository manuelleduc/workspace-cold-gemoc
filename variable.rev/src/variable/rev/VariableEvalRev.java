package variable.rev;

import eval.operation.EvalCExpr;
import eval.operation.EvalCVariable;
import varlang.varlang.exprconcern.Variable;

public interface VariableEvalRev extends VariableRev<EvalCExpr, EvalCVariable> {

	@Override
	default EvalCVariable variable(Variable it) {
		return new EvalCVariable(it, this);
	}

}
