package cst.rev;

import cst.cstlang.exprconcern.Cst;
import cst.cstlang.exprconcern.Expr;

public interface CstRev<ExprT, CstT extends ExprT> {
	CstT cst(Cst it);

	public default ExprT $(Expr it) {
		return cst((Cst) it);
	}
	
	public default CstT $(Cst it) {
		return cst(it);
	}
}
