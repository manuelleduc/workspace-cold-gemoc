/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.generator

import com.google.inject.Inject
import fr.mleduc.mMCLang.Composition
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MMCLangGenerator extends AbstractGenerator {

	@Inject extension Compose
	@Inject extension PrettyPrint

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val mm = resource.allContents.head as Composition
		fsa.generateFile('''«mm.name».mmlang''', mm.reduce.print)
	}
}
