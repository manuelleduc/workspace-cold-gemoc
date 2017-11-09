package eval.operation

import java.util.Map


/**
 * Not way to lift from EvalAdd so far
 * @author mleduc
 *
 */
class EvalCAdd extends EvalAdd implements EvalCExpr  {

	def it
	def rev

	def EvalCAdd(it, rev) {
		this.it = it
		this.rev = rev
	}
	
	@Override
	public Long eval(Map<String, Long> ctx) {
		this.add(this.rev.$(this.it.left).eval(ctx), this.rev.$(this.it.right).eval(ctx))
	}
}
