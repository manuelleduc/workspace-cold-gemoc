package fr.mleduc.util;

import com.google.common.base.Objects;
import fr.mleduc.explicitOperations.Artifact;
import fr.mleduc.explicitOperations.Composition;
import fr.mleduc.explicitOperations.CompositionParameter;
import fr.mleduc.explicitOperations.Language;
import fr.mleduc.explicitOperations.LanguageDependency;
import fr.mleduc.explicitOperations.Model;
import fr.mleduc.explicitOperations.Referentiable;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

@SuppressWarnings("all")
public class Model2Graph {
  public DirectedGraph<String, DefaultEdge> languagesGraph(final Model model) {
    DirectedGraph<String, DefaultEdge> _xblockexpression = null;
    {
      final EList<Language> languages = model.getLanguages();
      final DirectedGraph<String, DefaultEdge> graph = new SimpleDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
      final Consumer<Language> _function = (Language it) -> {
        String _name = it.getName();
        graph.addVertex(_name);
      };
      languages.forEach(_function);
      for (final Language l : languages) {
        EList<LanguageDependency> _dependencies = l.getDependencies();
        for (final LanguageDependency d : _dependencies) {
          String _name = l.getName();
          Language _type = d.getType();
          String _name_1 = _type.getName();
          boolean _notEquals = (!Objects.equal(_name, _name_1));
          if (_notEquals) {
            String _name_2 = l.getName();
            Language _type_1 = d.getType();
            String _name_3 = _type_1.getName();
            graph.addEdge(_name_2, _name_3);
          }
        }
      }
      _xblockexpression = graph;
    }
    return _xblockexpression;
  }
  
  public DirectedGraph<Referentiable, DefaultEdge> instanceGraph(final Model model) {
    DirectedGraph<Referentiable, DefaultEdge> _xblockexpression = null;
    {
      final DirectedGraph<Referentiable, DefaultEdge> graph = new SimpleDirectedGraph<Referentiable, DefaultEdge>(DefaultEdge.class);
      final EList<Composition> compositions = model.getCompositions();
      final EList<Artifact> artifacts = model.getArtifacts();
      final Consumer<Artifact> _function = (Artifact it) -> {
        graph.addVertex(it);
      };
      artifacts.forEach(_function);
      final Consumer<Composition> _function_1 = (Composition it) -> {
        graph.addVertex(it);
      };
      compositions.forEach(_function_1);
      final Consumer<Composition> _function_2 = (Composition c) -> {
        EList<CompositionParameter> _parameters = c.getParameters();
        final Consumer<CompositionParameter> _function_3 = (CompositionParameter it) -> {
          Referentiable _artifact = it.getArtifact();
          graph.addEdge(c, _artifact);
        };
        _parameters.forEach(_function_3);
      };
      compositions.forEach(_function_2);
      _xblockexpression = graph;
    }
    return _xblockexpression;
  }
  
  public <A extends Object, B extends Object> boolean isAcyclic(final DirectedGraph<A, B> graph) {
    CycleDetector<A, B> _cycleDetector = new CycleDetector<A, B>(graph);
    return _cycleDetector.detectCycles();
  }
}
