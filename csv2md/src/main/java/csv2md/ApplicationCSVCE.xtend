package csv2md

import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.net.URLEncoder
import java.nio.charset.Charset
import java.nio.file.Files
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser

class ApplicationCSVCE {

	def void run() {
		val targetFile = "/tmp/generation.sh"
		val readFile = "/tmp/Liste mails 2017-2018.csv"

		val parser = new CSVParser(new InputStreamReader(new FileInputStream(new File(readFile))), CSVFormat.DEFAULT)
		val res = parser.filter[it.get(0).trim.length > 0].map [
			val mail = it.get(2)
			val mailUrlEncode = URLEncoder.
				encode(
					mail)
			'''curl 'https://framalistes.org/sympa' -H 'Host: framalistes.org' -H 'User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:56.0) Gecko/20100101 Firefox/56.0' -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8' -H 'Accept-Language: en-US,en;q=0.5' --compressed -H 'Content-Type: application/x-www-form-urlencoded' -H 'Referer: https://framalistes.org/sympa/review/coureursdextreme' -H 'Cookie: _pk_id.54.fe7b=486fd75b1c071c90.1505131440.5.1509959621.1509959587.; _pk_ref.54.fe7b=%5B%22%22%2C%22%22%2C1509959587%2C%22https%3A%2F%2Fduckduckgo.com%2F%22%5D; sympa_session=edb3d28aaa9ff10766151a4ccb13031c1c; _pk_ses.54.fe7b=*' -H 'Connection: keep-alive' -H 'Upgrade-Insecure-Requests: 1' --data 'previous_action=review&list=coureursdextreme&action=add&email=«mailUrlEncode»&action_add=Add' '''
			].join('\n')
			Files.write(new File(targetFile).toPath, res.toString.getBytes(Charset.defaultCharset))
		}

		def static void main(String[] args) {
			new ApplicationCSVCE().run
		}
	}
	