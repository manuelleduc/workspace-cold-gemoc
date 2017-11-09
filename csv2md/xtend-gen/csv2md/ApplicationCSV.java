package csv2md;

import csv2md.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ApplicationCSV {
  @Extension
  private Utils _utils = new Utils();
  
  public void run() {
    try {
      final String targetDirectory = "/tmp/generation";
      final String readFile = "/tmp/reuse.csv";
      FileSystem _default = FileSystems.getDefault();
      final Path targetDirectoryDir = _default.getPath(targetDirectory);
      this._utils.clean(targetDirectoryDir);
      this._utils.init(targetDirectoryDir);
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
      final Consumer<CSVRecord> _function_1 = (CSVRecord it) -> {
        try {
          String _get = it.get(0);
          final String name = _get.replaceAll("\\/", "_");
          String _get_1 = it.get(2);
          String[] _split = _get_1.split("\n");
          final Function1<String, String> _function_2 = (String it_1) -> {
            return it_1.trim();
          };
          List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function_2);
          final Function1<String, Boolean> _function_3 = (String it_1) -> {
            int _length = it_1.length();
            return Boolean.valueOf((_length > 0));
          };
          final Iterable<String> links = IterableExtensions.<String>filter(_map, _function_3);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(name, "");
          _builder.append(".md");
          final Path fileMd = targetDirectoryDir.resolve(_builder.toString());
          final String description = it.get(1);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("# ");
          _builder_1.append(name, "");
          InputOutput.<String>println(_builder_1.toString());
          boolean _isEmpty = IterableExtensions.isEmpty(links);
          if (_isEmpty) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("- no links");
            InputOutput.<String>println(_builder_2.toString());
          }
          boolean _isEmpty_1 = description.isEmpty();
          if (_isEmpty_1) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("- no description");
            InputOutput.<String>println(_builder_3.toString());
          }
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("# ");
          _builder_4.append(name, "");
          _builder_4.newLineIfNotEmpty();
          _builder_4.newLine();
          {
            boolean _isEmpty_2 = IterableExtensions.isEmpty(links);
            boolean _not = (!_isEmpty_2);
            if (_not) {
              _builder_4.append("## Links");
              _builder_4.newLine();
              {
                for(final String link : links) {
                  _builder_4.append("- ");
                  _builder_4.append(link, "");
                  _builder_4.newLineIfNotEmpty();
                }
              }
              _builder_4.newLine();
            }
          }
          _builder_4.append("## Description");
          _builder_4.newLine();
          _builder_4.append(description, "");
          _builder_4.newLineIfNotEmpty();
          _builder_4.newLine();
          _builder_4.append("## Examples");
          _builder_4.newLine();
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("TODO");
          _builder_4.newLine();
          _builder_4.newLine();
          _builder_4.append("## Key sources");
          _builder_4.newLine();
          _builder_4.newLine();
          _builder_4.append("    ");
          _builder_4.append("TODO");
          _builder_4.newLine();
          String _string = _builder_4.toString();
          Charset _defaultCharset = Charset.defaultCharset();
          byte[] _bytes = _string.getBytes(_defaultCharset);
          Files.write(fileMd, _bytes);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _filter.forEach(_function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    ApplicationCSV _applicationCSV = new ApplicationCSV();
    _applicationCSV.run();
  }
}
