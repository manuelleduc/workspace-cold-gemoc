package multadd.rev;

import multadd.multaddlang.expr_cst_mult_add.Add;
import multadd.multaddlang.expr_cst_mult_add.Cst;
import multadd.multaddlang.expr_cst_mult_add.Expr;
import multadd.multaddlang.expr_cst_mult_add.Mult;

public interface MultAddRev<ExprT, CstT extends ExprT, AddT extends ExprT, MultT extends ExprT> {
	CstT cst(Cst it);

	AddT add(Add it);

	MultT mult(Mult it);

	public default ExprT $(Expr it) {
		if (it instanceof Cst)
			return cst((Cst) it);
		if (it instanceof Mult)
			return mult((Mult) it);
		if (it instanceof Add)
			return add((Add) it);
		return null;
	}

	public default CstT $(Cst it) {
		return cst(it);
	}

	public default AddT $(Add it) {
		return add(it);
	}

	public default MultT $(Mult it) {
		return mult(it);
	}
}
