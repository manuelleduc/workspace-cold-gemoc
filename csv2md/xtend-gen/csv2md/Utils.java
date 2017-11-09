package csv2md;

import com.google.common.base.Objects;
import java.io.File;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class Utils {
  public Path init(final Path rootPath) {
    try {
      Path _xifexpression = null;
      File _file = rootPath.toFile();
      boolean _exists = _file.exists();
      boolean _not = (!_exists);
      if (_not) {
        _xifexpression = Files.createDirectory(rootPath);
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void clean(final Path rootPath) {
    try {
      File _file = rootPath.toFile();
      boolean _exists = _file.exists();
      if (_exists) {
        Stream<Path> _walk = Files.walk(rootPath, FileVisitOption.FOLLOW_LINKS);
        Comparator<Path> _reverseOrder = Comparator.<Path>reverseOrder();
        Stream<Path> _sorted = _walk.sorted(_reverseOrder);
        final Function<Path, File> _function = (Path it) -> {
          return it.toFile();
        };
        Stream<File> _map = _sorted.<File>map(_function);
        final Consumer<File> _function_1 = (File it) -> {
          File _file_1 = rootPath.toFile();
          boolean _notEquals = (!Objects.equal(_file_1, it));
          if (_notEquals) {
            it.delete();
          }
        };
        _map.forEach(_function_1);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
