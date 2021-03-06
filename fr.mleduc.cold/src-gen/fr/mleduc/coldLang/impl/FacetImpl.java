/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.coldLang.impl;

import fr.mleduc.coldLang.ColdLangPackage;
import fr.mleduc.coldLang.Condition;
import fr.mleduc.coldLang.Facet;
import fr.mleduc.coldLang.FacetComposition;
import fr.mleduc.coldLang.Perspective;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.coldLang.impl.FacetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.impl.FacetImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.impl.FacetImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.impl.FacetImpl#getCompositions <em>Compositions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacetImpl extends MinimalEObjectImpl.Container implements Facet
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPerspective() <em>Perspective</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerspective()
   * @generated
   * @ordered
   */
  protected Perspective perspective;

  /**
   * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected Condition activation;

  /**
   * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositions()
   * @generated
   * @ordered
   */
  protected EList<FacetComposition> compositions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetImpl()
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
    return ColdLangPackage.Literals.FACET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColdLangPackage.FACET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective getPerspective()
  {
    if (perspective != null && perspective.eIsProxy())
    {
      InternalEObject oldPerspective = (InternalEObject)perspective;
      perspective = (Perspective)eResolveProxy(oldPerspective);
      if (perspective != oldPerspective)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColdLangPackage.FACET__PERSPECTIVE, oldPerspective, perspective));
      }
    }
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Perspective basicGetPerspective()
  {
    return perspective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerspective(Perspective newPerspective)
  {
    Perspective oldPerspective = perspective;
    perspective = newPerspective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColdLangPackage.FACET__PERSPECTIVE, oldPerspective, perspective));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getActivation()
  {
    return activation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActivation(Condition newActivation, NotificationChain msgs)
  {
    Condition oldActivation = activation;
    activation = newActivation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColdLangPackage.FACET__ACTIVATION, oldActivation, newActivation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivation(Condition newActivation)
  {
    if (newActivation != activation)
    {
      NotificationChain msgs = null;
      if (activation != null)
        msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColdLangPackage.FACET__ACTIVATION, null, msgs);
      if (newActivation != null)
        msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColdLangPackage.FACET__ACTIVATION, null, msgs);
      msgs = basicSetActivation(newActivation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColdLangPackage.FACET__ACTIVATION, newActivation, newActivation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FacetComposition> getCompositions()
  {
    if (compositions == null)
    {
      compositions = new EObjectContainmentEList<FacetComposition>(FacetComposition.class, this, ColdLangPackage.FACET__COMPOSITIONS);
    }
    return compositions;
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
      case ColdLangPackage.FACET__ACTIVATION:
        return basicSetActivation(null, msgs);
      case ColdLangPackage.FACET__COMPOSITIONS:
        return ((InternalEList<?>)getCompositions()).basicRemove(otherEnd, msgs);
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
      case ColdLangPackage.FACET__NAME:
        return getName();
      case ColdLangPackage.FACET__PERSPECTIVE:
        if (resolve) return getPerspective();
        return basicGetPerspective();
      case ColdLangPackage.FACET__ACTIVATION:
        return getActivation();
      case ColdLangPackage.FACET__COMPOSITIONS:
        return getCompositions();
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
      case ColdLangPackage.FACET__NAME:
        setName((String)newValue);
        return;
      case ColdLangPackage.FACET__PERSPECTIVE:
        setPerspective((Perspective)newValue);
        return;
      case ColdLangPackage.FACET__ACTIVATION:
        setActivation((Condition)newValue);
        return;
      case ColdLangPackage.FACET__COMPOSITIONS:
        getCompositions().clear();
        getCompositions().addAll((Collection<? extends FacetComposition>)newValue);
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
      case ColdLangPackage.FACET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ColdLangPackage.FACET__PERSPECTIVE:
        setPerspective((Perspective)null);
        return;
      case ColdLangPackage.FACET__ACTIVATION:
        setActivation((Condition)null);
        return;
      case ColdLangPackage.FACET__COMPOSITIONS:
        getCompositions().clear();
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
      case ColdLangPackage.FACET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ColdLangPackage.FACET__PERSPECTIVE:
        return perspective != null;
      case ColdLangPackage.FACET__ACTIVATION:
        return activation != null;
      case ColdLangPackage.FACET__COMPOSITIONS:
        return compositions != null && !compositions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FacetImpl
