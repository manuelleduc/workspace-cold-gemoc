package mult.rev;

import mult.multlang.exprconcern.Cst;
import mult.multlang.exprconcern.Expr;
import mult.multlang.exprconcern.Mult;

public interface MultRev<ExprT, CstT extends ExprT, MultT extends ExprT> {
	CstT cst(Cst it);

	MultT mult(Mult it);

	public default ExprT $(Expr it) {
		if (it instanceof Cst)
			return cst((Cst) it);
		if (it instanceof Mult)
			return mult((Mult) it);
		return null;
	}

	public default CstT $(Cst it) {
		return cst(it);
	}

	public default MultT $(Mult it) {
		return mult(it);
	}
}