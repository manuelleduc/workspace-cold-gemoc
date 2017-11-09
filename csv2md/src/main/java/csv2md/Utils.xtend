package csv2md

import java.nio.file.FileVisitOption
import java.nio.file.Files
import java.nio.file.Path
import java.util.Comparator

class Utils {
	def init(Path rootPath) {
		if (!rootPath.toFile.exists)
			Files.createDirectory(rootPath)
	}

	def clean(Path rootPath) {
		if (rootPath.toFile.exists)
			Files.walk(rootPath, FileVisitOption.FOLLOW_LINKS).sorted(Comparator::reverseOrder).map [
				toFile
			].forEach [
				if (rootPath.toFile != it)
					delete
			]
	}
}
