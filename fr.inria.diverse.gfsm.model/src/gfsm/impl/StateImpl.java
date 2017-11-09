/**
 */
package gfsm.impl;

import gfsm.FSM;
import gfsm.GfsmPackage;
import gfsm.IntOperation;
import gfsm.State;
import gfsm.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gfsm.impl.StateImpl#getInExpression <em>In Expression</em>}</li>
 *   <li>{@link gfsm.impl.StateImpl#getOutExpression <em>Out Expression</em>}</li>
 *   <li>{@link gfsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link gfsm.impl.StateImpl#getFsm <em>Fsm</em>}</li>
 *   <li>{@link gfsm.impl.StateImpl#getOutgoingtransitions <em>Outgoingtransitions</em>}</li>
 *   <li>{@link gfsm.impl.StateImpl#getIncommingtransitions <em>Incommingtransitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getInExpression() <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInExpression()
	 * @generated
	 * @ordered
	 */
	protected IntOperation inExpression;

	/**
	 * The cached value of the '{@link #getOutExpression() <em>Out Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutExpression()
	 * @generated
	 * @ordered
	 */
	protected IntOperation outExpression;

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
	 * The cached value of the '{@link #getOutgoingtransitions() <em>Outgoingtransitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingtransitions;

	/**
	 * The cached value of the '{@link #getIncommingtransitions() <em>Incommingtransitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncommingtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incommingtransitions;

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
	public IntOperation getInExpression() {
		return inExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInExpression(IntOperation newInExpression, NotificationChain msgs) {
		IntOperation oldInExpression = inExpression;
		inExpression = newInExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__IN_EXPRESSION, oldInExpression, newInExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInExpression(IntOperation newInExpression) {
		if (newInExpression != inExpression) {
			NotificationChain msgs = null;
			if (inExpression != null)
				msgs = ((InternalEObject)inExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.STATE__IN_EXPRESSION, null, msgs);
			if (newInExpression != null)
				msgs = ((InternalEObject)newInExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.STATE__IN_EXPRESSION, null, msgs);
			msgs = basicSetInExpression(newInExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__IN_EXPRESSION, newInExpression, newInExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOperation getOutExpression() {
		return outExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutExpression(IntOperation newOutExpression, NotificationChain msgs) {
		IntOperation oldOutExpression = outExpression;
		outExpression = newOutExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__OUT_EXPRESSION, oldOutExpression, newOutExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutExpression(IntOperation newOutExpression) {
		if (newOutExpression != outExpression) {
			NotificationChain msgs = null;
			if (outExpression != null)
				msgs = ((InternalEObject)outExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.STATE__OUT_EXPRESSION, null, msgs);
			if (newOutExpression != null)
				msgs = ((InternalEObject)newOutExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GfsmPackage.STATE__OUT_EXPRESSION, null, msgs);
			msgs = basicSetOutExpression(newOutExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__OUT_EXPRESSION, newOutExpression, newOutExpression));
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
	public FSM getFsm() {
		if (eContainerFeatureID() != GfsmPackage.STATE__FSM) return null;
		return (FSM)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFsm(FSM newFsm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFsm, GfsmPackage.STATE__FSM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFsm(FSM newFsm) {
		if (newFsm != eInternalContainer() || (eContainerFeatureID() != GfsmPackage.STATE__FSM && newFsm != null)) {
			if (EcoreUtil.isAncestor(this, newFsm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFsm != null)
				msgs = ((InternalEObject)newFsm).eInverseAdd(this, GfsmPackage.FSM__STATES, FSM.class, msgs);
			msgs = basicSetFsm(newFsm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.STATE__FSM, newFsm, newFsm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingtransitions() {
		if (outgoingtransitions == null) {
			outgoingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, GfsmPackage.STATE__OUTGOINGTRANSITIONS, GfsmPackage.TRANSITION__FROM);
		}
		return outgoingtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncommingtransitions() {
		if (incommingtransitions == null) {
			incommingtransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, GfsmPackage.STATE__INCOMMINGTRANSITIONS, GfsmPackage.TRANSITION__TO);
		}
		return incommingtransitions;
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
			case GfsmPackage.STATE__FSM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFsm((FSM)otherEnd, msgs);
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingtransitions()).basicAdd(otherEnd, msgs);
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncommingtransitions()).basicAdd(otherEnd, msgs);
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
			case GfsmPackage.STATE__IN_EXPRESSION:
				return basicSetInExpression(null, msgs);
			case GfsmPackage.STATE__OUT_EXPRESSION:
				return basicSetOutExpression(null, msgs);
			case GfsmPackage.STATE__FSM:
				return basicSetFsm(null, msgs);
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return ((InternalEList<?>)getOutgoingtransitions()).basicRemove(otherEnd, msgs);
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return ((InternalEList<?>)getIncommingtransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GfsmPackage.STATE__FSM:
				return eInternalContainer().eInverseRemove(this, GfsmPackage.FSM__STATES, FSM.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GfsmPackage.STATE__IN_EXPRESSION:
				return getInExpression();
			case GfsmPackage.STATE__OUT_EXPRESSION:
				return getOutExpression();
			case GfsmPackage.STATE__NAME:
				return getName();
			case GfsmPackage.STATE__FSM:
				return getFsm();
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return getOutgoingtransitions();
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return getIncommingtransitions();
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
			case GfsmPackage.STATE__IN_EXPRESSION:
				setInExpression((IntOperation)newValue);
				return;
			case GfsmPackage.STATE__OUT_EXPRESSION:
				setOutExpression((IntOperation)newValue);
				return;
			case GfsmPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case GfsmPackage.STATE__FSM:
				setFsm((FSM)newValue);
				return;
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				getOutgoingtransitions().clear();
				getOutgoingtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				getIncommingtransitions().clear();
				getIncommingtransitions().addAll((Collection<? extends Transition>)newValue);
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
			case GfsmPackage.STATE__IN_EXPRESSION:
				setInExpression((IntOperation)null);
				return;
			case GfsmPackage.STATE__OUT_EXPRESSION:
				setOutExpression((IntOperation)null);
				return;
			case GfsmPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GfsmPackage.STATE__FSM:
				setFsm((FSM)null);
				return;
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				getOutgoingtransitions().clear();
				return;
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				getIncommingtransitions().clear();
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
			case GfsmPackage.STATE__IN_EXPRESSION:
				return inExpression != null;
			case GfsmPackage.STATE__OUT_EXPRESSION:
				return outExpression != null;
			case GfsmPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GfsmPackage.STATE__FSM:
				return getFsm() != null;
			case GfsmPackage.STATE__OUTGOINGTRANSITIONS:
				return outgoingtransitions != null && !outgoingtransitions.isEmpty();
			case GfsmPackage.STATE__INCOMMINGTRANSITIONS:
				return incommingtransitions != null && !incommingtransitions.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
