package fr.mleduc.lib;

import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Functional programming mini lib.
 */
@SuppressWarnings("all")
public class FPLib {
  /**
   * fold the list l = [n0...nx] by intersecting every elements with the f function
   * 
   * the returned value is f(nx ... f(n1, f(n0, n1)))
   * 
   * if l is size zero, d est returned
   * if l is zied one, l.head is return
   */
  public <R extends Object, T extends R> R fold1(final Iterable<T> l, final Function2<? super R, ? super T, ? extends R> f, final R d) {
    R _xblockexpression = null;
    {
      final int lt = ((Object[])Conversions.unwrapArray(l, Object.class)).length;
      R _xifexpression = null;
      if ((lt == 1)) {
        _xifexpression = IterableExtensions.<T>head(l);
      } else {
        R _xifexpression_1 = null;
        if ((lt > 1)) {
          Iterable<T> _tail = IterableExtensions.<T>tail(l);
          T _head = IterableExtensions.<T>head(l);
          _xifexpression_1 = IterableExtensions.<T, R>fold(_tail, _head, f);
        } else {
          _xifexpression_1 = d;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
