package add.rev;

import add.addlang.expr_cst_add.Add;
import add.addlang.expr_cst_add.Cst;
import add.addlang.expr_cst_add.Expr;

public interface AddRev<ExprT, CstT extends ExprT, AddT extends ExprT> {
	CstT cst(Cst it);

	AddT add(Add it);

	public default ExprT $(Expr it) {
		if (it instanceof Cst)
			return cst((Cst) it);
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
}
