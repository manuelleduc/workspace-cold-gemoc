package fr.mleduc.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class SmartParseHelper<T extends EObject> extends ParseHelper<T> {
  @Inject
  private IResourceFactory resourceFactory;
  
  public T parse(final CharSequence text, final ResourceSet resourceSetToUse, final String fileExtension) throws Exception {
    InputStream _asStream = this.getAsStream(text);
    URI _computeUnusedUri = this.computeUnusedUri(resourceSetToUse, fileExtension);
    T _parse = this.parse(_asStream, _computeUnusedUri, null, resourceSetToUse, fileExtension);
    return ((T) _parse);
  }
  
  public URI computeUnusedUri(final ResourceSet resourceSet, final String fileExtension) {
    final String name = "__synthetic";
    IntegerRange _upTo = new IntegerRange(0, Integer.MAX_VALUE);
    for (final Integer i : _upTo) {
      {
        final URI syntheticUri = URI.createURI((((name + i) + ".") + fileExtension));
        Resource _resource = resourceSet.getResource(syntheticUri, false);
        boolean _equals = Objects.equal(_resource, null);
        if (_equals) {
          return syntheticUri;
        }
      }
    }
    throw new IllegalStateException();
  }
  
  public T parse(final InputStream in, final URI uriToUse, final Map<?, ?> options, final ResourceSet resourceSet, final String fileExtension) {
    final Resource resource = resourceSet.createResource(uriToUse);
    try {
      resource.load(in, options);
      T _xifexpression = null;
      EList<EObject> _contents = resource.getContents();
      boolean _isEmpty = _contents.isEmpty();
      if (_isEmpty) {
        _xifexpression = null;
      } else {
        EList<EObject> _contents_1 = resource.getContents();
        EObject _get = _contents_1.get(0);
        _xifexpression = ((T) _get);
      }
      final T root = _xifexpression;
      return root;
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        throw new WrappedException(e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
