/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.formatting2;

import com.google.inject.Inject;
import fr.mleduc.coldLang.Artifact;
import fr.mleduc.coldLang.Concern;
import fr.mleduc.coldLang.Facet;
import fr.mleduc.coldLang.FeatureModel;
import fr.mleduc.coldLang.Language;
import fr.mleduc.coldLang.Model;
import fr.mleduc.coldLang.Perspective;
import fr.mleduc.coldLang.PerspectiveLanguage;
import fr.mleduc.services.ColdLangGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegionsFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ColdLangFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ColdLangGrammarAccess _coldLangGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<Concern> _concerns = model.getConcerns();
    for (final Concern concerns : _concerns) {
      document.<Concern>format(concerns);
    }
    EList<Language> _languages = model.getLanguages();
    for (final Language languages : _languages) {
      document.<Language>format(languages);
    }
    EList<Perspective> _perspectives = model.getPerspectives();
    for (final Perspective perspective : _perspectives) {
      document.<Perspective>format(perspective);
    }
  }
  
  protected void _format(final Perspective perspective, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(perspective);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _append = document.append(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    ISemanticRegion _prepend = document.prepend(_append, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(perspective);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(_prepend, _keyword_1, _function_2);
    EList<PerspectiveLanguage> _languages = perspective.getLanguages();
    for (final PerspectiveLanguage language : _languages) {
      {
        document.<PerspectiveLanguage>format(language);
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setNewLines(1, 1, 2);
        };
        document.<PerspectiveLanguage>append(language, _function_3);
      }
    }
  }
  
  protected void _format(final Concern concern, @Extension final IFormattableDocument document) {
    ISemanticRegionsFinder _regionFor = this.textRegionExtensions.regionFor(concern);
    ISemanticRegion _keyword = _regionFor.keyword("{");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    ISemanticRegion _append = document.append(_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    ISemanticRegion _prepend = document.prepend(_append, _function_1);
    ISemanticRegionsFinder _regionFor_1 = this.textRegionExtensions.regionFor(concern);
    ISemanticRegion _keyword_1 = _regionFor_1.keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(_prepend, _keyword_1, _function_2);
    EList<Facet> _facets = concern.getFacets();
    for (final Facet facets : _facets) {
      {
        document.<Facet>format(facets);
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setNewLines(1, 1, 2);
        };
        document.<Facet>append(facets, _function_3);
      }
    }
    EList<Artifact> _artifact = concern.getArtifact();
    for (final Artifact artifact : _artifact) {
      {
        document.<Artifact>format(artifact);
        final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
          it.setNewLines(1, 1, 2);
        };
        document.<Artifact>append(artifact, _function_3);
      }
    }
    FeatureModel _fm = concern.getFm();
    document.<FeatureModel>format(_fm);
  }
  
  public void format(final Object concern, final IFormattableDocument document) {
    if (concern instanceof XtextResource) {
      _format((XtextResource)concern, document);
      return;
    } else if (concern instanceof Concern) {
      _format((Concern)concern, document);
      return;
    } else if (concern instanceof Model) {
      _format((Model)concern, document);
      return;
    } else if (concern instanceof Perspective) {
      _format((Perspective)concern, document);
      return;
    } else if (concern instanceof EObject) {
      _format((EObject)concern, document);
      return;
    } else if (concern == null) {
      _format((Void)null, document);
      return;
    } else if (concern != null) {
      _format(concern, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(concern, document).toString());
    }
  }
}