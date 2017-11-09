/**
 */
package multadd.multaddlangmt.expr_cst_mult_add;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see multadd.multaddlangmt.expr_cst_mult_add.Expr_cst_mult_addPackage
 * @generated
 */
public interface Expr_cst_mult_addFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Expr_cst_mult_addFactory eINSTANCE = multadd.multaddlangmt.expr_cst_mult_add.impl.Expr_cst_mult_addFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mult</em>'.
	 * @generated
	 */
	Mult createMult();

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
	Expr_cst_mult_addPackage getExpr_cst_mult_addPackage();

} //Expr_cst_mult_addFactory
