/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.mleduc.mMLang.Metamodel

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MMLangGenerator extends AbstractGenerator {

//	@Inject extension Compose
	@Inject extension PrettyPrint

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		val mm = resource.allContents.head as Metamodel
//		fsa.generateFile('''«mm.name»_final.mmlang''', mm.reduce.print)
	}
}
