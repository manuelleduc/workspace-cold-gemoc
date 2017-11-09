/**
 */
package gfsm.model.gfsm.impl;

import gfsm.model.gfsm.GfsmPackage;
import gfsm.model.gfsm.Guard;
import gfsm.model.gfsm.State;
import gfsm.model.gfsm.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gfsm.model.gfsm.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link gfsm.model.gfsm.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link gfsm.model.gfsm.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link gfsm.model.gfsm.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected State from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected State to;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GfsmPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (State) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GfsmPackage.TRANSITION__FROM, oldFrom,
							from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(State newFrom, NotificationChain msgs) {
		State oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__FROM,
					oldFrom, newFrom);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(State newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this, GfsmPackage.STATE__OUTGOINGS, State.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this, GfsmPackage.STATE__OUTGOINGS, State.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (State) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GfsmPackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(State newTo, NotificationChain msgs) {
		State oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__TO,
					oldTo, newTo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(State newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, GfsmPackage.STATE__INCOMMINGS, State.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this, GfsmPackage.STATE__INCOMMINGS, State.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GfsmPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GfsmPackage.TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GfsmPackage.TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GfsmPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GfsmPackage.TRANSITION__FROM:
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this, GfsmPackage.STATE__OUTGOINGS, State.class, msgs);
			return basicSetFrom((State) otherEnd, msgs);
		case GfsmPackage.TRANSITION__TO:
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this, GfsmPackage.STATE__INCOMMINGS, State.class, msgs);
			return basicSetTo((State) otherEnd, msgs);
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
		case GfsmPackage.TRANSITION__FROM:
			return basicSetFrom(null, msgs);
		case GfsmPackage.TRANSITION__TO:
			return basicSetTo(null, msgs);
		case GfsmPackage.TRANSITION__GUARD:
			return basicSetGuard(null, msgs);
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
		case GfsmPackage.TRANSITION__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case GfsmPackage.TRANSITION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case GfsmPackage.TRANSITION__EVENT:
			return getEvent();
		case GfsmPackage.TRANSITION__GUARD:
			return getGuard();
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
		case GfsmPackage.TRANSITION__FROM:
			setFrom((State) newValue);
			return;
		case GfsmPackage.TRANSITION__TO:
			setTo((State) newValue);
			return;
		case GfsmPackage.TRANSITION__EVENT:
			setEvent((String) newValue);
			return;
		case GfsmPackage.TRANSITION__GUARD:
			setGuard((Guard) newValue);
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
		case GfsmPackage.TRANSITION__FROM:
			setFrom((State) null);
			return;
		case GfsmPackage.TRANSITION__TO:
			setTo((State) null);
			return;
		case GfsmPackage.TRANSITION__EVENT:
			setEvent(EVENT_EDEFAULT);
			return;
		case GfsmPackage.TRANSITION__GUARD:
			setGuard((Guard) null);
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
		case GfsmPackage.TRANSITION__FROM:
			return from != null;
		case GfsmPackage.TRANSITION__TO:
			return to != null;
		case GfsmPackage.TRANSITION__EVENT:
			return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
		case GfsmPackage.TRANSITION__GUARD:
			return guard != null;
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
		result.append(" (event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
