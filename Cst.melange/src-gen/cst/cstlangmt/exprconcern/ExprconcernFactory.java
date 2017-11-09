/**
 */
package cst.cstlangmt.exprconcern;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cst.cstlangmt.exprconcern.ExprconcernPackage
 * @generated
 */
public interface ExprconcernFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprconcernFactory eINSTANCE = cst.cstlangmt.exprconcern.impl.ExprconcernFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cst</em>'.
	 * @generated
	 */
	Cst createCst();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExprconcernPackage getExprconcernPackage();

} //ExprconcernFactory
