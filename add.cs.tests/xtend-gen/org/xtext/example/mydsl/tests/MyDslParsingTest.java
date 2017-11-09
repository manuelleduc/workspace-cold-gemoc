/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.tests;

import add.addlang.expr_cst_add.Expr;
import add.rev.AddEvalRev;
import com.google.inject.Inject;
import eval.operation.EvalExpr;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private ParseHelper<Expr> parseHelper;
  
  @Test
  public void load1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final AddEvalRev rev = new AddEvalRev() {
      };
      final EvalExpr op = rev.$(result);
      final Long res = op.eval();
      Assert.assertEquals(1, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void load12() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1 + 2");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final AddEvalRev rev = new AddEvalRev() {
      };
      final EvalExpr op = rev.$(result);
      final Long res = op.eval();
      Assert.assertEquals(3, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void load123() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("1 + 2 + 3 ");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final AddEvalRev rev = new AddEvalRev() {
      };
      final EvalExpr op = rev.$(result);
      final Long res = op.eval();
      Assert.assertEquals(6, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}