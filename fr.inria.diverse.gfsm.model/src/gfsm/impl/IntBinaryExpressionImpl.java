/**
 */
package gfsm.impl;

import gfsm.GfsmPackage;
import gfsm.IntBinaryExpression;
import gfsm.IntExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Int Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gfsm.impl.IntBinaryExpressionImpl#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link gfsm.impl.IntBinaryExpressionImpl#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntBinaryExpressionImpl extends IntExpressionImpl implements IntBinaryExpression {
	/**
	 * The cached value of the '{@link #getExpression1() <em>Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression1()
	 * @generated
	 * @ordered
	 */
	protected IntExpression expression1;

	/**
	 * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression2()
	 * @generated
	 * @ordered
	 */
	protected IntExpression expression2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntBinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GfsmPackage.Literals.INT_BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getExpression1() {
		return expression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression1(IntExpression newExpression1, NotificationChain msgs) {
		IntExpression oldExpression1 = expression1;
		expression1 = newExpression1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1, oldExpression1, newExpression1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression1(IntExpression newExpression1) {
		if (newExpression1 != expression1) {
			NotificationChain msgs = null;
			if (expression1 != null)
				msgs = ((InternalEObject)expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1, null, msgs);
			if (newExpression1 != null)
				msgs = ((InternalEObject)newExpression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1, null, msgs);
			msgs = basicSetExpression1(newExpression1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1, newExpression1, newExpression1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntExpression getExpression2() {
		return expression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression2(IntExpression newExpression2, NotificationChain msgs) {
		IntExpression oldExpression2 = expression2;
		expression2 = newExpression2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2, oldExpression2, newExpression2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression2(IntExpression newExpression2) {
		if (newExpression2 != expression2) {
			NotificationChain msgs = null;
			if (expression2 != null)
				msgs = ((InternalEObject)expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2, null, msgs);
			if (newExpression2 != null)
				msgs = ((InternalEObject)newExpression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2, null, msgs);
			msgs = basicSetExpression2(newExpression2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2, newExpression2, newExpression2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
				return basicSetExpression1(null, msgs);
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				return basicSetExpression2(null, msgs);
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
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
				return getExpression1();
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				return getExpression2();
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
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
				setExpression1((IntExpression)newValue);
				return;
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				setExpression2((IntExpression)newValue);
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
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
				setExpression1((IntExpression)null);
				return;
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				setExpression2((IntExpression)null);
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
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION1:
				return expression1 != null;
			case GfsmPackage.INT_BINARY_EXPRESSION__EXPRESSION2:
				return expression2 != null;
		}
		return super.eIsSet(featureID);
	}

} //IntBinaryExpressionImpl
