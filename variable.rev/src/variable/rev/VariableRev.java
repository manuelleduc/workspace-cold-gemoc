package variable.rev;

import varlang.varlang.exprconcern.Expr;
import varlang.varlang.exprconcern.Variable;

public interface VariableRev<ExprT, VariableT extends ExprT> {
	VariableT variable(Variable it);

	public default ExprT $(Expr it) {
		return variable((Variable) it);
	}

	public default VariableT $(Variable it) {
		return variable(it);
	}
}
