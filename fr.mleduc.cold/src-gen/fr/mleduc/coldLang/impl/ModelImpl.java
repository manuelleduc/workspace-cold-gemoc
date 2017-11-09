/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.coldLang.impl;

import fr.mleduc.coldLang.ColdLangPackage;
import fr.mleduc.coldLang.Concern;
import fr.mleduc.coldLang.Language;
import fr.mleduc.coldLang.Model;
import fr.mleduc.coldLang.Perspective;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.coldLang.impl.ModelImpl#getConcerns <em>Concerns</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.impl.ModelImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.impl.ModelImpl#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getConcerns() <em>Concerns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcerns()
   * @generated
   * @ordered
   */
  protected EList<Concern> concerns;

  /**
   * The cached value of the '{@link #getLanguages() <em>Languages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguages()
   * @generated
   * @ordered
   */
  protected EList<Language> languages;

  /**
   * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspectives()
   * @generated
   * @ordered
   */
  protected EList<Perspective> perspectives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ColdLangPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concern> getConcerns()
  {
    if (concerns == null)
    {
      concerns = new EObjectContainmentEList<Concern>(Concern.class, this, ColdLangPackage.MODEL__CONCERNS);
    }
    return concerns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Language> getLanguages()
  {
    if (languages == null)
    {
      languages = new EObjectContainmentEList<Language>(Language.class, this, ColdLangPackage.MODEL__LANGUAGES);
    }
    return languages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Perspective> getPerspectives()
  {
    if (perspectives == null)
    {
      perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this, ColdLangPackage.MODEL__PERSPECTIVES);
    }
    return perspectives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ColdLangPackage.MODEL__CONCERNS:
        return ((InternalEList<?>)getConcerns()).basicRemove(otherEnd, msgs);
      case ColdLangPackage.MODEL__LANGUAGES:
        return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
      case ColdLangPackage.MODEL__PERSPECTIVES:
        return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ColdLangPackage.MODEL__CONCERNS:
        return getConcerns();
      case ColdLangPackage.MODEL__LANGUAGES:
        return getLanguages();
      case ColdLangPackage.MODEL__PERSPECTIVES:
        return getPerspectives();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ColdLangPackage.MODEL__CONCERNS:
        getConcerns().clear();
        getConcerns().addAll((Collection<? extends Concern>)newValue);
        return;
      case ColdLangPackage.MODEL__LANGUAGES:
        getLanguages().clear();
        getLanguages().addAll((Collection<? extends Language>)newValue);
        return;
      case ColdLangPackage.MODEL__PERSPECTIVES:
        getPerspectives().clear();
        getPerspectives().addAll((Collection<? extends Perspective>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ColdLangPackage.MODEL__CONCERNS:
        getConcerns().clear();
        return;
      case ColdLangPackage.MODEL__LANGUAGES:
        getLanguages().clear();
        return;
      case ColdLangPackage.MODEL__PERSPECTIVES:
        getPerspectives().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ColdLangPackage.MODEL__CONCERNS:
        return concerns != null && !concerns.isEmpty();
      case ColdLangPackage.MODEL__LANGUAGES:
        return languages != null && !languages.isEmpty();
      case ColdLangPackage.MODEL__PERSPECTIVES:
        return perspectives != null && !perspectives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl