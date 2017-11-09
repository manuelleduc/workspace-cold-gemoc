/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations.impl;

import fr.mleduc.explicitOperations.ArtifactParameter;
import fr.mleduc.explicitOperations.ExplicitOperationsPackage;
import fr.mleduc.explicitOperations.LanguageDependency;
import fr.mleduc.explicitOperations.Referentiable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.impl.ArtifactParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.impl.ArtifactParameterImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactParameterImpl extends MinimalEObjectImpl.Container implements ArtifactParameter
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected LanguageDependency name;

  /**
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected Referentiable artifact;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactParameterImpl()
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
    return ExplicitOperationsPackage.Literals.ARTIFACT_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageDependency getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (LanguageDependency)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageDependency basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(LanguageDependency newName)
  {
    LanguageDependency oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Referentiable getArtifact()
  {
    if (artifact != null && artifact.eIsProxy())
    {
      InternalEObject oldArtifact = (InternalEObject)artifact;
      artifact = (Referentiable)eResolveProxy(oldArtifact);
      if (artifact != oldArtifact)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT, oldArtifact, artifact));
      }
    }
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Referentiable basicGetArtifact()
  {
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifact(Referentiable newArtifact)
  {
    Referentiable oldArtifact = artifact;
    artifact = newArtifact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT, oldArtifact, artifact));
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
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME:
        if (resolve) return getName();
        return basicGetName();
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT:
        if (resolve) return getArtifact();
        return basicGetArtifact();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME:
        setName((LanguageDependency)newValue);
        return;
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT:
        setArtifact((Referentiable)newValue);
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
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME:
        setName((LanguageDependency)null);
        return;
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT:
        setArtifact((Referentiable)null);
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
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__NAME:
        return name != null;
      case ExplicitOperationsPackage.ARTIFACT_PARAMETER__ARTIFACT:
        return artifact != null;
    }
    return super.eIsSet(featureID);
  }

} //ArtifactParameterImpl
