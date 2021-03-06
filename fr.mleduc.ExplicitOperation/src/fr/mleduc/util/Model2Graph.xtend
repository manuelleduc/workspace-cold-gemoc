package fr.mleduc.util

import fr.mleduc.explicitOperations.Model
import fr.mleduc.explicitOperations.Referentiable
import org.jgrapht.DirectedGraph
import org.jgrapht.alg.CycleDetector
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.graph.SimpleDirectedGraph

class Model2Graph {
	public def DirectedGraph<String, DefaultEdge> languagesGraph(Model model) {
		val languages = model.languages

		val DirectedGraph<String, DefaultEdge> graph = new SimpleDirectedGraph(DefaultEdge)

		languages.forEach[graph.addVertex(it.name)]

		for (l : languages) {
			for (d : l.dependencies) {
				if (l.name != d.type.name)
					graph.addEdge(l.name, d.type.name)
			}
		}
		graph
	}

	public def DirectedGraph<Referentiable, DefaultEdge> instanceGraph(Model model) {
		val DirectedGraph<Referentiable, DefaultEdge> graph = new SimpleDirectedGraph(DefaultEdge)
		val compositions = model.compositions
		val artifacts = model.artifacts

		artifacts.forEach[graph.addVertex(it)]
		compositions.forEach[graph.addVertex(it)]

		compositions.forEach[c|c.parameters.forEach[graph.addEdge(c, it.artifact)]]

		graph
	}

	public def <A, B> boolean isAcyclic(DirectedGraph<A, B> graph) {
		new CycleDetector(graph).detectCycles
	}
}
