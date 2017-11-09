/**
 * generated by Xtext 2.10.0
 */
package varadd.cs.tests;

import com.google.inject.Inject;
import eval.operation.EvalCExpr;
import java.util.HashMap;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import varadd.cs.tests.VarAddLangInjectorProvider;
import varadd.rev.VarAddEvalRev;
import varadd.varaddlang.exprconcern.Expr;

@RunWith(XtextRunner.class)
@InjectWith(VarAddLangInjectorProvider.class)
@SuppressWarnings("all")
public class VarAddLangParsingTest {
  @Inject
  private ParseHelper<Expr> parseHelper;
  
  @Test
  public void load1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final VarAddEvalRev rev = new VarAddEvalRev() {
      };
      final EvalCExpr op = rev.$(result);
      Pair<String, Long> _mappedTo = Pair.<String, Long>of("a", Long.valueOf(1L));
      HashMap<String, Long> _newHashMap = CollectionLiterals.<String, Long>newHashMap(_mappedTo);
      final Long res = op.eval(_newHashMap);
      Assert.assertEquals(1, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void load12() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a + b");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final VarAddEvalRev rev = new VarAddEvalRev() {
      };
      final EvalCExpr op = rev.$(result);
      Pair<String, Long> _mappedTo = Pair.<String, Long>of("a", Long.valueOf(1L));
      Pair<String, Long> _mappedTo_1 = Pair.<String, Long>of("b", Long.valueOf(2L));
      HashMap<String, Long> _newHashMap = CollectionLiterals.<String, Long>newHashMap(_mappedTo, _mappedTo_1);
      final Long res = op.eval(_newHashMap);
      Assert.assertEquals(3, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void load123() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a + b + c ");
      _builder.newLine();
      final Expr result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      final VarAddEvalRev rev = new VarAddEvalRev() {
      };
      final EvalCExpr op = rev.$(result);
      Pair<String, Long> _mappedTo = Pair.<String, Long>of("a", Long.valueOf(1L));
      Pair<String, Long> _mappedTo_1 = Pair.<String, Long>of("b", Long.valueOf(3L));
      Pair<String, Long> _mappedTo_2 = Pair.<String, Long>of("c", Long.valueOf(2L));
      HashMap<String, Long> _newHashMap = CollectionLiterals.<String, Long>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2);
      final Long res = op.eval(_newHashMap);
      Assert.assertEquals(6, (res).longValue());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
