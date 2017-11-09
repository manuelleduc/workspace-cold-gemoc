package fr.mleduc.lib

import fr.mleduc.coldLang.Feature
import fr.mleduc.coldLang.OneOf
import fr.mleduc.coldLang.SomeOf
import fr.mleduc.lib.pl.model.Proposition
import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * Generate propositions from COLD instances. Keep track of the produced objects in a cache.
 */
class PropositionCache {
	val Map<EObject, Proposition> propositionCache = newHashMap()

//	def dispatch proposition(Artifact that) {
//		if (!propositionCache.containsKey(that))
//			propositionCache.put(that, new Proposition("artifact_" + that.name))
//
//		propositionCache.get(that)
//	}
//	def dispatch proposition(Language that) {
//		if (!propositionCache.containsKey(that))
//			propositionCache.put(that, new Proposition("language_" + that.name))
//
//		propositionCache.get(that)
//	}

//	def dispatch proposition(Facet that) {
//		if (!propositionCache.containsKey(that))
//			propositionCache.put(that, new Proposition("facet_" + that.name))
//
//		propositionCache.get(that)
//	}

//	def dispatch proposition(Perspective that) {
//		if (!propositionCache.containsKey(that))
//			propositionCache.put(that, new Proposition("perspective_" + that.name))
//
//		propositionCache.get(that)
//	}

	def dispatch proposition(Feature that) {
		if (!propositionCache.containsKey(that))
			propositionCache.put(that, new Proposition("coldvmfeature_" + that.name))

		propositionCache.get(that)
	}

	def dispatch proposition(OneOf that) {
		if (!propositionCache.containsKey(that))
			propositionCache.put(that, new Proposition("coldvmoneof_" + that.name))

		propositionCache.get(that)
	}

	def dispatch proposition(SomeOf that) {
		if (!propositionCache.containsKey(that))
			propositionCache.put(that, new Proposition("coldvmsomeof_" + that.name))

		propositionCache.get(that)
	}
}
