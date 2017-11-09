/**
 */
package gfsm.model.gfsm.impl;

import gfsm.model.gfsm.GfsmPackage;
import gfsm.model.gfsm.State;
import gfsm.model.gfsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gfsm.model.gfsm.impl.StateImpl#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link gfsm.model.gfsm.impl.StateImpl#getIncommings <em>Incommings</em>}</li>
 *   <li>{@link gfsm.model.gfsm.impl.StateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoings;

	/**
	 * The cached value of the '{@link #getIncommings() <em>Incommings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncommings()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incommings;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GfsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					GfsmPackage.STATE__OUTGOINGS, GfsmPackage.TRANSITION__FROM);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncommings() {
		if (incommings == null) {
			incommings = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					GfsmPackage.STATE__INCOMMINGS, GfsmPackage.TRANSITION__TO);
		}
		return incommings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GfsmPackage.STATE__OUTGOINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoings()).basicAdd(otherEnd, msgs);
		case GfsmPackage.STATE__INCOMMINGS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncommings()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GfsmPackage.STATE__OUTGOINGS:
			return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd, msgs);
		case GfsmPackage.STATE__INCOMMINGS:
			return ((InternalEList<?>) getIncommings()).basicRemove(otherEnd, msgs);
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
		case GfsmPackage.STATE__OUTGOINGS:
			return getOutgoings();
		case GfsmPackage.STATE__INCOMMINGS:
			return getIncommings();
		case GfsmPackage.STATE__NAME:
			return getName();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GfsmPackage.STATE__OUTGOINGS:
			getOutgoings().clear();
			getOutgoings().addAll((Collection<? extends Transition>) newValue);
			return;
		case GfsmPackage.STATE__INCOMMINGS:
			getIncommings().clear();
			getIncommings().addAll((Collection<? extends Transition>) newValue);
			return;
		case GfsmPackage.STATE__NAME:
			setName((String) newValue);
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
		case GfsmPackage.STATE__OUTGOINGS:
			getOutgoings().clear();
			return;
		case GfsmPackage.STATE__INCOMMINGS:
			getIncommings().clear();
			return;
		case GfsmPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
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
		case GfsmPackage.STATE__OUTGOINGS:
			return outgoings != null && !outgoings.isEmpty();
		case GfsmPackage.STATE__INCOMMINGS:
			return incommings != null && !incommings.isEmpty();
		case GfsmPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
