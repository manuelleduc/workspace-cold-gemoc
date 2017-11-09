package fr.mleduc.lib.pl.revisitor

import fr.mleduc.lib.pl.model.And
import fr.mleduc.lib.pl.model.Equivalent
import fr.mleduc.lib.pl.model.Imply
import fr.mleduc.lib.pl.model.Not
import fr.mleduc.lib.pl.model.Operator
import fr.mleduc.lib.pl.model.Or
import fr.mleduc.lib.pl.model.Proposition
import fr.mleduc.lib.pl.model.True

interface PLRevisitor<OperatorT, AndT extends OperatorT, EquivalentT extends OperatorT, ImplyT extends OperatorT, NotT extends OperatorT, OrT extends OperatorT, PropositionT extends OperatorT, TrueT extends OperatorT> {
	def AndT and(And i)

	def EquivalentT equivalent(Equivalent i)

	def ImplyT imply(Imply i)

	def NotT not(Not i)

	def OrT or(Or i)

	def PropositionT proposition(Proposition p)

	def TrueT tru(True t)

	def OperatorT $(Operator i) {
		if(i instanceof And) return and(i)
		if(i instanceof Equivalent) return equivalent(i)
		if(i instanceof Imply) return imply(i)
		if(i instanceof Not) return not(i)
		if(i instanceof Or) return or(i)
		if(i instanceof Proposition) return proposition(i)
		if(i instanceof True) return tru(i)

	}
}
