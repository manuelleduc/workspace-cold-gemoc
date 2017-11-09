package eval.operation

interface EvalCExpr {
	def Long eval(Map<String, Long> ctx)
}
