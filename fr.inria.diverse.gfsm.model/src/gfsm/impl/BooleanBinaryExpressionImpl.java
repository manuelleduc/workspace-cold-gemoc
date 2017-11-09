/**
 */
package gfsm.impl;

import gfsm.BooleanBinaryExpression;
import gfsm.BooleanExpression;
import gfsm.GfsmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gfsm.impl.BooleanBinaryExpressionImpl#getBoolExpression1 <em>Bool Expression1</em>}</li>
 *   <li>{@link gfsm.impl.BooleanBinaryExpressionImpl#getBoolExpression2 <em>Bool Expression2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BooleanBinaryExpressionImpl extends BooleanExpressionImpl implements BooleanBinaryExpression {
	/**
	 * The cached value of the '{@link #getBoolExpression1() <em>Bool Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolExpression1()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression boolExpression1;

	/**
	 * The cached value of the '{@link #getBoolExpression2() <em>Bool Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolExpression2()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression boolExpression2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GfsmPackage.Literals.BOOLEAN_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getBoolExpression1() {
		return boolExpression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolExpression1(BooleanExpression newBoolExpression1, NotificationChain msgs) {
		BooleanExpression oldBoolExpression1 = boolExpression1;
		boolExpression1 = newBoolExpression1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1, oldBoolExpression1, newBoolExpression1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolExpression1(BooleanExpression newBoolExpression1) {
		if (newBoolExpression1 != boolExpression1) {
			NotificationChain msgs = null;
			if (boolExpression1 != null)
				msgs = ((InternalEObject)boolExpression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1, null, msgs);
			if (newBoolExpression1 != null)
				msgs = ((InternalEObject)newBoolExpression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1, null, msgs);
			msgs = basicSetBoolExpression1(newBoolExpression1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1, newBoolExpression1, newBoolExpression1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getBoolExpression2() {
		return boolExpression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoolExpression2(BooleanExpression newBoolExpression2, NotificationChain msgs) {
		BooleanExpression oldBoolExpression2 = boolExpression2;
		boolExpression2 = newBoolExpression2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2, oldBoolExpression2, newBoolExpression2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolExpression2(BooleanExpression newBoolExpression2) {
		if (newBoolExpression2 != boolExpression2) {
			NotificationChain msgs = null;
			if (boolExpression2 != null)
				msgs = ((InternalEObject)boolExpression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2, null, msgs);
			if (newBoolExpression2 != null)
				msgs = ((InternalEObject)newBoolExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2, null, msgs);
			msgs = basicSetBoolExpression2(newBoolExpression2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2, newBoolExpression2, newBoolExpression2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
				return basicSetBoolExpression1(null, msgs);
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
				return basicSetBoolExpression2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
				return getBoolExpression1();
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
				return getBoolExpression2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
				setBoolExpression1((BooleanExpression)newValue);
				return;
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
				setBoolExpression2((BooleanExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
				setBoolExpression1((BooleanExpression)null);
				return;
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
				setBoolExpression2((BooleanExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION1:
				return boolExpression1 != null;
			case GfsmPackage.BOOLEAN_BINARY_EXPRESSION__BOOL_EXPRESSION2:
				return boolExpression2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanBinaryExpressionImpl
