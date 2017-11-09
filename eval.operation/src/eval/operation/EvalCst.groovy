package eval.operation

class EvalCst implements EvalExpr {
	
	def it	
	def rev
	
	def EvalCst(it, rev) {
		this.it = it
		this.rev = rev
	}
	
	def Long eval() {
		this.it.value
	}
}
