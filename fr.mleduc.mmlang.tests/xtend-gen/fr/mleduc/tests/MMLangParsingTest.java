/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.tests;

import com.google.inject.Inject;
import fr.mleduc.generator.PrettyPrint;
import fr.mleduc.mMLang.Metamodel;
import fr.mleduc.tests.MMLangInjectorProvider;
import javax.inject.Provider;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(MMLangInjectorProvider.class)
@SuppressWarnings("all")
public class MMLangParsingTest {
  @Inject
  private ParseHelper<Metamodel> parseHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private PrettyPrint _prettyPrint;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class String {}");
      _builder.newLine();
      _builder.append("class Long {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class Person {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("name: String [1..1]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("age: Long [1..1]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class List<A> {}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("class Group {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("members: Person [0..*]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Metamodel result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
