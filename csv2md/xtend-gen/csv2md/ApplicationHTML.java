package csv2md;

import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import csv2md.Utils;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@SuppressWarnings("all")
public class ApplicationHTML {
  @Extension
  private Utils _utils = new Utils();
  
  public void run() {
    try {
      final String targetDirectory = "/tmp/generation_html";
      final String readFile = "/tmp/parsers.html";
      FileSystem _default = FileSystems.getDefault();
      final Path targetDirectoryDir = _default.getPath(targetDirectory);
      this._utils.clean(targetDirectoryDir);
      this._utils.init(targetDirectoryDir);
      File _file = new File(readFile);
      Charset _defaultCharset = Charset.defaultCharset();
      String _string = _defaultCharset.toString();
      final Document doc = Jsoup.parse(_file, _string);
      final Elements divs = doc.select("body div.tabberlive div.tabbertab div.tabberlive div.tabbertab.tabbertabhide");
      final Consumer<Element> _function = (Element it) -> {
        try {
          Elements _select = it.select("h2");
          Element _head = IterableExtensions.<Element>head(_select);
          String _text = _head.text();
          final String name = _text.replaceAll("\\/", "_");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(name, "");
          _builder.append(".md");
          final Path fileMd = targetDirectoryDir.resolve(_builder.toString());
          Options _github = Options.github();
          final Remark remark = new Remark(_github);
          String _string_1 = it.toString();
          final String conv = remark.convert(_string_1);
          String _string_2 = conv.toString();
          Charset _defaultCharset_1 = Charset.defaultCharset();
          byte[] _bytes = _string_2.getBytes(_defaultCharset_1);
          Files.write(fileMd, _bytes);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      divs.forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    ApplicationHTML _applicationHTML = new ApplicationHTML();
    _applicationHTML.run();
  }
}
