package abc.k3;

import abc.k3.A;
import abc.k3.B;
import abc.k3.C;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    A _a = new A();
    final Procedure1<A> _function = (A it) -> {
      B _b = new B();
      final Procedure1<B> _function_1 = (B it_1) -> {
        final C c1 = new C();
        final C c2 = new C();
        CollectionExtensions.<C>addAll(it_1.cs, c1, c2);
      };
      final B b1 = ObjectExtensions.<B>operator_doubleArrow(_b, _function_1);
      B _b_1 = new B();
      final Procedure1<B> _function_2 = (B it_1) -> {
        final C c1 = new C();
        final C c2 = new C();
        CollectionExtensions.<C>addAll(it_1.cs, c1, c2);
      };
      final B b2 = ObjectExtensions.<B>operator_doubleArrow(_b_1, _function_2);
      B _b_2 = new B();
      final Procedure1<B> _function_3 = (B it_1) -> {
        final C c1 = new C();
        final C c2 = new C();
        CollectionExtensions.<C>addAll(it_1.cs, c1, c2);
      };
      final B b3 = ObjectExtensions.<B>operator_doubleArrow(_b_2, _function_3);
      CollectionExtensions.<B>addAll(it.bs, b1, b2, b3);
    };
    final A a = ObjectExtensions.<A>operator_doubleArrow(_a, _function);
  }
}
