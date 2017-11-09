package csv2md;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ApplicationCSVCE {
  public void run() {
    try {
      final String targetFile = "/tmp/generation.sh";
      final String readFile = "/tmp/Liste mails 2017-2018.csv";
      File _file = new File(readFile);
      FileInputStream _fileInputStream = new FileInputStream(_file);
      InputStreamReader _inputStreamReader = new InputStreamReader(_fileInputStream);
      final CSVParser parser = new CSVParser(_inputStreamReader, CSVFormat.DEFAULT);
      final Function1<CSVRecord, Boolean> _function = (CSVRecord it) -> {
        String _get = it.get(0);
        String _trim = _get.trim();
        int _length = _trim.length();
        return Boolean.valueOf((_length > 0));
      };
      Iterable<CSVRecord> _filter = IterableExtensions.<CSVRecord>filter(parser, _function);
      final Function1<CSVRecord, String> _function_1 = (CSVRecord it) -> {
        String _xblockexpression = null;
        {
          final String mail = it.get(2);
          final String mailUrlEncode = URLEncoder.encode(mail);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("curl \'https://framalistes.org/sympa\' -H \'Host: framalistes.org\' -H \'User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:56.0) Gecko/20100101 Firefox/56.0\' -H \'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\' -H \'Accept-Language: en-US,en;q=0.5\' --compressed -H \'Content-Type: application/x-www-form-urlencoded\' -H \'Referer: https://framalistes.org/sympa/review/coureursdextreme\' -H \'Cookie: _pk_id.54.fe7b=486fd75b1c071c90.1505131440.5.1509959621.1509959587.; _pk_ref.54.fe7b=%5B%22%22%2C%22%22%2C1509959587%2C%22https%3A%2F%2Fduckduckgo.com%2F%22%5D; sympa_session=edb3d28aaa9ff10766151a4ccb13031c1c; _pk_ses.54.fe7b=*\' -H \'Connection: keep-alive\' -H \'Upgrade-Insecure-Requests: 1\' --data \'previous_action=review&list=coureursdextreme&action=add&email=");
          _builder.append(mailUrlEncode, "");
          _builder.append("&action_add=Add\' ");
          _xblockexpression = _builder.toString();
        }
        return _xblockexpression;
      };
      Iterable<String> _map = IterableExtensions.<CSVRecord, String>map(_filter, _function_1);
      final String res = IterableExtensions.join(_map, "\n");
      File _file_1 = new File(targetFile);
      Path _path = _file_1.toPath();
      String _string = res.toString();
      Charset _defaultCharset = Charset.defaultCharset();
      byte[] _bytes = _string.getBytes(_defaultCharset);
      Files.write(_path, _bytes);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    ApplicationCSVCE _applicationCSVCE = new ApplicationCSVCE();
    _applicationCSVCE.run();
  }
}
