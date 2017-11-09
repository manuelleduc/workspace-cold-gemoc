/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.mleduc.explicitOperations.Model
import javax.inject.Inject
import fr.mleduc.explicitOperations.Artifact

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ExplicitOperationsGenerator extends AbstractGenerator {

	@Inject extension LanguageBuildPlanGenerator

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val model = resource.allContents.findFirst[it instanceof Model] as Model

		fsa.generateFile('''system_«model.name».dot''', '''
			digraph «model.name» {
				«FOR language : model.languages»
					language_«language.name» [label="«language.name»"]
					«FOR depds: language.dependencies»
						language_«language.name» -> language_«depds.type.name» [label="«depds.name»", style=dashed]
					«ENDFOR»
				«ENDFOR»
				«FOR operation : model.operations»
					operation_«operation.name» [label="«operation.name»", shape=rectangle]
					«FOR input:operation.inputs»
						language_«input.type.name» -> operation_«operation.name»  [label="«input.name»"]
					«ENDFOR»
					
					operation_«operation.name» -> language_«operation.output.type.name» [label="«operation.output.name»"]
				«ENDFOR»
			}
		''')

		fsa.generateFile('''language_build_plan_«model.name».txt''', buildPlanLanguage(model))
		fsa.generateFile('''instance_build_plan_«model.name».txt''', buildPlanInstance(model))

		fsa.generateFile('''instance_«model.name».dot''', '''
			digraph «model.name» {
				«FOR artifact : model.artifacts»
					artifact_«artifact.name» [label=«artifact.name»]
				«ENDFOR»
				«FOR composition : model.compositions»
					composition_«composition.name» [label="«composition.name»: «composition.operation.name»", shape=rect]
					«FOR param: composition.parameters»
						composition_«composition.name» -> «IF param.artifact instanceof Artifact»artifact_«param.artifact.name»«ELSE»composition_«param.artifact.name»«ENDIF» [label=«param.name.name»] 
					«ENDFOR»
				«ENDFOR»
			}
		''')
	}
}
