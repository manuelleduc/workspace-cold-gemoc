package eval.operation

class EvalAdd implements EvalExpr {

	def it
	def rev

	def EvalAdd(it, rev) {
		this.it = it
		this.rev = rev
	}

	def Long eval() {
		this.add(this.rev.$(this.it.left).eval(), this.rev.$(this.it.right).eval())
	}
	
	def Long add(Long a, Long b) {
		return a + b;
	}
}
