package fr.mleduc.lib.pl.revisitor

import fr.mleduc.coldLang.Feature
import fr.mleduc.coldLang.FeatureModel
import fr.mleduc.coldLang.OneOf
import fr.mleduc.coldLang.SomeOf

interface FeatureModelRevisitor<FeatureModelT, FeatureT extends FeatureModelT, OneOfT extends FeatureModelT, SomeOfT extends FeatureModelT> {

	def FeatureT feature(Feature i)

	def OneOfT oneOf(OneOf i)

	def SomeOfT someOf(SomeOf i)

	def $(FeatureModel i) {
		if(i instanceof Feature) return feature(i)
		if(i instanceof OneOf) return oneOf(i)
		if(i instanceof SomeOf) return someOf(i)
	}

}
