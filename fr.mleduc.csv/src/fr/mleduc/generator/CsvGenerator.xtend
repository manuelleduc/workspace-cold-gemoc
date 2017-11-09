/*
 * generated by Xtext 2.10.0
 */
package fr.mleduc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.mleduc.csv.Line

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CsvGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val lines = resource.allContents.filter(Line)
//		val header = lines.head
		val content = lines.tail

		content.forEach [
			val cells = it.cells.map[it.content]

//			if (cells.size > 2) {
			val title = cells.get(0)
			val links = cells.get(2)

			fsa.generateFile('''«title».md''', '''
				# «title»
				
				## Links
				«links»
			''')
//			}
		]

//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
}
