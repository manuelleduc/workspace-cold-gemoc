/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.generator;

import fr.mleduc.explicitOperations.Artifact;
import fr.mleduc.explicitOperations.Composition;
import fr.mleduc.explicitOperations.CompositionParameter;
import fr.mleduc.explicitOperations.Language;
import fr.mleduc.explicitOperations.LanguageDependency;
import fr.mleduc.explicitOperations.Model;
import fr.mleduc.explicitOperations.Operation;
import fr.mleduc.explicitOperations.OperationParameter;
import fr.mleduc.explicitOperations.Referentiable;
import fr.mleduc.generator.LanguageBuildPlanGenerator;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExplicitOperationsGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private LanguageBuildPlanGenerator _languageBuildPlanGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof Model));
    };
    EObject _findFirst = IteratorExtensions.<EObject>findFirst(_allContents, _function);
    final Model model = ((Model) _findFirst);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("system_");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append(".dot");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("digraph ");
    String _name_1 = model.getName();
    _builder_1.append(_name_1, "");
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    {
      EList<Language> _languages = model.getLanguages();
      for(final Language language : _languages) {
        _builder_1.append("\t");
        _builder_1.append("language_");
        String _name_2 = language.getName();
        _builder_1.append(_name_2, "\t");
        _builder_1.append(" [label=\"");
        String _name_3 = language.getName();
        _builder_1.append(_name_3, "\t");
        _builder_1.append("\"]");
        _builder_1.newLineIfNotEmpty();
        {
          EList<LanguageDependency> _dependencies = language.getDependencies();
          for(final LanguageDependency depds : _dependencies) {
            _builder_1.append("\t");
            _builder_1.append("language_");
            String _name_4 = language.getName();
            _builder_1.append(_name_4, "\t");
            _builder_1.append(" -> language_");
            Language _type = depds.getType();
            String _name_5 = _type.getName();
            _builder_1.append(_name_5, "\t");
            _builder_1.append(" [label=\"");
            String _name_6 = depds.getName();
            _builder_1.append(_name_6, "\t");
            _builder_1.append("\", style=dashed]");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Operation> _operations = model.getOperations();
      for(final Operation operation : _operations) {
        _builder_1.append("\t");
        _builder_1.append("operation_");
        String _name_7 = operation.getName();
        _builder_1.append(_name_7, "\t");
        _builder_1.append(" [label=\"");
        String _name_8 = operation.getName();
        _builder_1.append(_name_8, "\t");
        _builder_1.append("\", shape=rectangle]");
        _builder_1.newLineIfNotEmpty();
        {
          EList<OperationParameter> _inputs = operation.getInputs();
          for(final OperationParameter input : _inputs) {
            _builder_1.append("\t");
            _builder_1.append("language_");
            Language _type_1 = input.getType();
            String _name_9 = _type_1.getName();
            _builder_1.append(_name_9, "\t");
            _builder_1.append(" -> operation_");
            String _name_10 = operation.getName();
            _builder_1.append(_name_10, "\t");
            _builder_1.append("  [label=\"");
            String _name_11 = input.getName();
            _builder_1.append(_name_11, "\t");
            _builder_1.append("\"]");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("operation_");
        String _name_12 = operation.getName();
        _builder_1.append(_name_12, "\t");
        _builder_1.append(" -> language_");
        OperationParameter _output = operation.getOutput();
        Language _type_2 = _output.getType();
        String _name_13 = _type_2.getName();
        _builder_1.append(_name_13, "\t");
        _builder_1.append(" [label=\"");
        OperationParameter _output_1 = operation.getOutput();
        String _name_14 = _output_1.getName();
        _builder_1.append(_name_14, "\t");
        _builder_1.append("\"]");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), _builder_1);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("language_build_plan_");
    String _name_15 = model.getName();
    _builder_2.append(_name_15, "");
    _builder_2.append(".txt");
    CharSequence _buildPlanLanguage = this._languageBuildPlanGenerator.buildPlanLanguage(model);
    fsa.generateFile(_builder_2.toString(), _buildPlanLanguage);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("instance_build_plan_");
    String _name_16 = model.getName();
    _builder_3.append(_name_16, "");
    _builder_3.append(".txt");
    CharSequence _buildPlanInstance = this._languageBuildPlanGenerator.buildPlanInstance(model);
    fsa.generateFile(_builder_3.toString(), _buildPlanInstance);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("instance_");
    String _name_17 = model.getName();
    _builder_4.append(_name_17, "");
    _builder_4.append(".dot");
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("digraph ");
    String _name_18 = model.getName();
    _builder_5.append(_name_18, "");
    _builder_5.append(" {");
    _builder_5.newLineIfNotEmpty();
    {
      EList<Artifact> _artifacts = model.getArtifacts();
      for(final Artifact artifact : _artifacts) {
        _builder_5.append("\t");
        _builder_5.append("artifact_");
        String _name_19 = artifact.getName();
        _builder_5.append(_name_19, "\t");
        _builder_5.append(" [label=");
        String _name_20 = artifact.getName();
        _builder_5.append(_name_20, "\t");
        _builder_5.append("]");
        _builder_5.newLineIfNotEmpty();
      }
    }
    {
      EList<Composition> _compositions = model.getCompositions();
      for(final Composition composition : _compositions) {
        _builder_5.append("\t");
        _builder_5.append("composition_");
        String _name_21 = composition.getName();
        _builder_5.append(_name_21, "\t");
        _builder_5.append(" [label=\"");
        String _name_22 = composition.getName();
        _builder_5.append(_name_22, "\t");
        _builder_5.append(": ");
        Operation _operation = composition.getOperation();
        String _name_23 = _operation.getName();
        _builder_5.append(_name_23, "\t");
        _builder_5.append("\", shape=rect]");
        _builder_5.newLineIfNotEmpty();
        {
          EList<CompositionParameter> _parameters = composition.getParameters();
          for(final CompositionParameter param : _parameters) {
            _builder_5.append("\t");
            _builder_5.append("composition_");
            String _name_24 = composition.getName();
            _builder_5.append(_name_24, "\t");
            _builder_5.append(" -> ");
            {
              Referentiable _artifact = param.getArtifact();
              if ((_artifact instanceof Artifact)) {
                _builder_5.append("artifact_");
                Referentiable _artifact_1 = param.getArtifact();
                String _name_25 = _artifact_1.getName();
                _builder_5.append(_name_25, "\t");
              } else {
                _builder_5.append("composition_");
                Referentiable _artifact_2 = param.getArtifact();
                String _name_26 = _artifact_2.getName();
                _builder_5.append(_name_26, "\t");
              }
            }
            _builder_5.append(" [label=");
            OperationParameter _name_27 = param.getName();
            String _name_28 = _name_27.getName();
            _builder_5.append(_name_28, "\t");
            _builder_5.append("] ");
            _builder_5.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_5.append("}");
    _builder_5.newLine();
    fsa.generateFile(_builder_4.toString(), _builder_5);
  }
}
