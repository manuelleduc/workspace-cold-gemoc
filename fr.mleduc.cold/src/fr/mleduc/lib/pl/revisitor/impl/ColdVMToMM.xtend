package fr.mleduc.lib.pl.revisitor.impl

import fr.mleduc.coldLang.Equiv
import fr.mleduc.coldLang.Feature
import fr.mleduc.lib.pl.model.And
import fr.mleduc.lib.pl.model.Equivalent
import fr.mleduc.lib.pl.model.Imply
import fr.mleduc.lib.pl.model.Not
import fr.mleduc.lib.pl.model.Operator
import fr.mleduc.lib.pl.model.Or
import fr.mleduc.lib.pl.model.Proposition
import fr.mleduc.lib.pl.revisitor.ConditionRevisitor

interface ColdVMToMM extends ConditionRevisitor<ColdVMToMMOperation<? extends Operator>, ColdVMToMMOperation<And>, ColdVMToMMOperation<Equivalent>, ColdVMToMMOperation<Imply>, ColdVMToMMOperation<Not>, ColdVMToMMOperation<Or>, ColdVMToMMOperation<Proposition>> {
	override ColdVMToMMOperation<And> and(fr.mleduc.coldLang.And i) {
		[new And($(i.left).produce(it), $(i.right).produce(it))]
	}

	override ColdVMToMMOperation<Equivalent> equivalent(Equiv i) {
		[new Equivalent($(i.left).produce(it), $(i.right).produce(it))]
	}

	override ColdVMToMMOperation<Imply> imply(fr.mleduc.coldLang.Imply i) {
		[new Imply($(i.left).produce(it), $(i.right).produce(it))]
	}

	override ColdVMToMMOperation<Not> not(fr.mleduc.coldLang.Not i) {
		[new Not($(i.next).produce(it))]
	}

	override ColdVMToMMOperation<Or> or(fr.mleduc.coldLang.Or i) {
		[new Or($(i.left).produce(it), $(i.right).produce(it))]
	}

	override ColdVMToMMOperation<Proposition> feature(Feature p) {
		[it.proposition(p)]
	}
}
