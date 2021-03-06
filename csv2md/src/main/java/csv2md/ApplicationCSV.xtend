package csv2md

import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.nio.charset.Charset
import java.nio.file.FileSystems
import java.nio.file.Files
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser

class ApplicationCSV {

	extension Utils = new Utils

	def void run() {
		val targetDirectory = "/tmp/generation"
		val readFile = "/tmp/reuse.csv"

		val targetDirectoryDir = FileSystems.getDefault().getPath(targetDirectory)

		targetDirectoryDir.clean
		targetDirectoryDir.init

		val parser = new CSVParser(new InputStreamReader(new FileInputStream(new File(readFile))), CSVFormat.DEFAULT)
		parser.filter[it.get(0).trim.length > 0].forEach [
			val name = it.get(0).replaceAll('\\/', '_')
			val links = it.get(2).split('\n').map[it.trim].filter[it.length > 0]
			val fileMd = targetDirectoryDir.resolve('''«name».md''')
			val description = it.get(1)

			println('''# «name»''')
			if(links.empty) println('''- no links''')
			if(description.empty) println('''- no description''')

			Files.write(fileMd, '''
				# «name»
				
				«IF !links.empty»
					## Links
					«FOR link : links»
						- «link»
					«ENDFOR»
					
				«ENDIF»
				## Description
				«description»
				
				## Examples
				
				    TODO
				
				## Key sources
				
				    TODO
			'''.toString.getBytes(Charset.defaultCharset))
		]
	}

	def static void main(String[] args) {
		new ApplicationCSV().run
	}
}
