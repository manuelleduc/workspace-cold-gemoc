/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations.impl;

import fr.mleduc.explicitOperations.CardVal;
import fr.mleduc.explicitOperations.Cardinality;
import fr.mleduc.explicitOperations.ExplicitOperationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.impl.CardinalityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.impl.CardinalityImpl#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityImpl extends MinimalEObjectImpl.Container implements Cardinality
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected CardVal start;

  /**
   * The cached value of the '{@link #getStop() <em>Stop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStop()
   * @generated
   * @ordered
   */
  protected CardVal stop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CardinalityImpl()
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
    return ExplicitOperationsPackage.Literals.CARDINALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardVal getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(CardVal newStart, NotificationChain msgs)
  {
    CardVal oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.CARDINALITY__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(CardVal newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExplicitOperationsPackage.CARDINALITY__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExplicitOperationsPackage.CARDINALITY__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.CARDINALITY__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CardVal getStop()
  {
    return stop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStop(CardVal newStop, NotificationChain msgs)
  {
    CardVal oldStop = stop;
    stop = newStop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.CARDINALITY__STOP, oldStop, newStop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStop(CardVal newStop)
  {
    if (newStop != stop)
    {
      NotificationChain msgs = null;
      if (stop != null)
        msgs = ((InternalEObject)stop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExplicitOperationsPackage.CARDINALITY__STOP, null, msgs);
      if (newStop != null)
        msgs = ((InternalEObject)newStop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExplicitOperationsPackage.CARDINALITY__STOP, null, msgs);
      msgs = basicSetStop(newStop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExplicitOperationsPackage.CARDINALITY__STOP, newStop, newStop));
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
      case ExplicitOperationsPackage.CARDINALITY__START:
        return basicSetStart(null, msgs);
      case ExplicitOperationsPackage.CARDINALITY__STOP:
        return basicSetStop(null, msgs);
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
      case ExplicitOperationsPackage.CARDINALITY__START:
        return getStart();
      case ExplicitOperationsPackage.CARDINALITY__STOP:
        return getStop();
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
      case ExplicitOperationsPackage.CARDINALITY__START:
        setStart((CardVal)newValue);
        return;
      case ExplicitOperationsPackage.CARDINALITY__STOP:
        setStop((CardVal)newValue);
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
      case ExplicitOperationsPackage.CARDINALITY__START:
        setStart((CardVal)null);
        return;
      case ExplicitOperationsPackage.CARDINALITY__STOP:
        setStop((CardVal)null);
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
      case ExplicitOperationsPackage.CARDINALITY__START:
        return start != null;
      case ExplicitOperationsPackage.CARDINALITY__STOP:
        return stop != null;
    }
    return super.eIsSet(featureID);
  }

} //CardinalityImpl
