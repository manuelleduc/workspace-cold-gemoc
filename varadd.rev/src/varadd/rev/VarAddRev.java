package varadd.rev;

import varadd.varaddlang.exprconcern.Add;
import varadd.varaddlang.exprconcern.Expr;
import varadd.varaddlang.exprconcern.Variable;

public interface VarAddRev<ExprT, VarT extends ExprT, AddT extends ExprT> {
	AddT add(Add it);

	VarT variable(Variable it);

	public default ExprT $(Expr it) {
		if (it instanceof Variable)
			return variable((Variable) it);
		if (it instanceof Add)
			return add((Add) it);
		return null;
	}

	public default AddT $(Add it) {
		return add(it);
	}

	public default VarT $(Variable it) {
		return variable(it);
	}
}
