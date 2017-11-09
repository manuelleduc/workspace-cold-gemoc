package eval.operation

import java.util.Map

class EvalCVariable implements EvalCExpr {

	def it
	def rev

	def EvalCVariable(it, rev) {
		this.it = it
		this.rev = rev
	}
	
	@Override
	public Long eval(Map<String, Long> ctx) {
		return ctx.get(this.it.name);
	}

}
