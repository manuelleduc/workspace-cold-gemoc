package fr.mleduc.lib.pl.revisitor

import fr.mleduc.coldLang.And
import fr.mleduc.coldLang.Condition
import fr.mleduc.coldLang.Equiv
import fr.mleduc.coldLang.Feature
import fr.mleduc.coldLang.Imply
import fr.mleduc.coldLang.Not
import fr.mleduc.coldLang.Or

interface ConditionRevisitor<ConditionT, 
	AndT extends ConditionT, 
	EquivT extends ConditionT, 
	ImplyT extends ConditionT, 
	NotT extends ConditionT, 
	OrT extends ConditionT, 
	FeatureT extends ConditionT> {
	def AndT and(And i)
	def EquivT equivalent(Equiv i)
	def ImplyT imply(Imply i)
	def NotT not(Not i)
	def OrT or(Or i)
	def FeatureT feature(Feature p)

	def ConditionT $(Condition i) {
		if(i instanceof And) return and(i)
		if(i instanceof Equiv) return equivalent(i)
		if(i instanceof Imply) return imply(i)
		if(i instanceof Not) return not(i)
		if(i instanceof Or) return or(i)
		if(i instanceof Feature) return feature(i)

	}
}
