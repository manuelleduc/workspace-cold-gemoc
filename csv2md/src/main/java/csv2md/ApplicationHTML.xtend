package csv2md

import com.overzealous.remark.Options
import com.overzealous.remark.Remark
import java.io.File
import java.nio.charset.Charset
import java.nio.file.FileSystems
import java.nio.file.Files
import org.jsoup.Jsoup

class ApplicationHTML {
	extension Utils = new Utils

	def void run() {
		val targetDirectory = "/tmp/generation_html"
		val readFile = "/tmp/parsers.html"

		val targetDirectoryDir = FileSystems.getDefault().getPath(targetDirectory)

		targetDirectoryDir.clean
		targetDirectoryDir.init

		val doc = Jsoup.parse(new File(readFile), Charset.defaultCharset.toString);

		val divs = doc.select("body div.tabberlive div.tabbertab div.tabberlive div.tabbertab.tabbertabhide")

		divs.forEach [
			val name = it.select('h2').head.text.replaceAll('\\/', '_')
			val fileMd = targetDirectoryDir.resolve('''«name».md''')

			val remark = new Remark(Options.github());

			val conv = remark.convert(it.toString)
			Files.write(fileMd, conv.toString.getBytes(Charset.defaultCharset))
		]
	}

	def static void main(String[] args) {
		new ApplicationHTML().run
	}
}
