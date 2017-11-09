package fr.mleduc.generator;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import fr.mleduc.explicitOperations.Composition;
import fr.mleduc.explicitOperations.Model;
import fr.mleduc.explicitOperations.Referentiable;
import fr.mleduc.util.Model2Graph;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.DepthFirstIterator;

@SuppressWarnings("all")
public class LanguageBuildPlanGenerator {
  @Inject
  private Model2Graph m2g;
  
  public CharSequence buildPlanLanguage(final Model model) {
    CharSequence _xblockexpression = null;
    {
      final DirectedGraph<String, DefaultEdge> graph = this.m2g.languagesGraph(model);
      DepthFirstIterator<String, DefaultEdge> _depthFirstIterator = new DepthFirstIterator<String, DefaultEdge>(graph);
      List<String> _list = IteratorExtensions.<String>toList(_depthFirstIterator);
      final List<String> dfi = ListExtensions.<String>reverse(_list);
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String x : dfi) {
          _builder.append(x, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence buildPlanInstance(final Model model) {
    CharSequence _xblockexpression = null;
    {
      final DirectedGraph<Referentiable, DefaultEdge> graph = this.m2g.instanceGraph(model);
      DepthFirstIterator<Referentiable, DefaultEdge> _depthFirstIterator = new DepthFirstIterator<Referentiable, DefaultEdge>(graph);
      Iterator<Composition> _filter = Iterators.<Composition>filter(_depthFirstIterator, Composition.class);
      final Function1<Composition, String> _function = (Composition it) -> {
        return it.getName();
      };
      Iterator<String> _map = IteratorExtensions.<Composition, String>map(_filter, _function);
      final List<String> dfi = IteratorExtensions.<String>toList(_map);
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final String x : dfi) {
          _builder.append(x, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
