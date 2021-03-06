package fr.mleduc.generator

import com.google.inject.Inject
import fr.mleduc.explicitOperations.Model
import fr.mleduc.util.Model2Graph
import org.jgrapht.traverse.DepthFirstIterator
import fr.mleduc.explicitOperations.Composition

class LanguageBuildPlanGenerator {

	@Inject Model2Graph m2g

	def buildPlanLanguage(Model model) {
		val graph = m2g.languagesGraph(model)
		val dfi = new DepthFirstIterator(graph).toList.reverse

		'''
			«FOR x : dfi»
				«x»
			«ENDFOR»
		'''
	}

	def buildPlanInstance(Model model) {
		val graph = m2g.instanceGraph(model)
		val dfi = new DepthFirstIterator(graph).filter(Composition).map[name].toList

		'''
			«FOR x : dfi»
				«x»
			«ENDFOR»
		'''
	}

}
