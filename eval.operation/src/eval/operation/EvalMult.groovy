package eval.operation

class EvalMult implements EvalExpr {

	def it
	def rev

	def EvalMult(it, rev) {
		this.it = it
		this.rev = rev
	}

	def Long eval() {
		this.rev.$(this.it.left).eval() * this.rev.$(this.it.right).eval()
	}
}
