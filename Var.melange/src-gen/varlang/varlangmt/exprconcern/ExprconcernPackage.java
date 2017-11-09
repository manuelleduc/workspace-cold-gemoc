/**
 */
package varlang.varlangmt.exprconcern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see varlang.varlangmt.exprconcern.ExprconcernFactory
 * @model kind="package"
 * @generated
 */
public interface ExprconcernPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exprconcern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://varlang.varlangmt/exprconcern/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprconcernPackage eINSTANCE = varlang.varlangmt.exprconcern.impl.ExprconcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link varlang.varlangmt.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see varlang.varlangmt.exprconcern.impl.ExprImpl
	 * @see varlang.varlangmt.exprconcern.impl.ExprconcernPackageImpl#getExpr()
	 * @generated
	 */
	int EXPR = 0;

	/**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link varlang.varlangmt.exprconcern.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see varlang.varlangmt.exprconcern.impl.VariableImpl
	 * @see varlang.varlangmt.exprconcern.impl.ExprconcernPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link varlang.varlangmt.exprconcern.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see varlang.varlangmt.exprconcern.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link varlang.varlangmt.exprconcern.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see varlang.varlangmt.exprconcern.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link varlang.varlangmt.exprconcern.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see varlang.varlangmt.exprconcern.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExprconcernFactory getExprconcernFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link varlang.varlangmt.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see varlang.varlangmt.exprconcern.impl.ExprImpl
		 * @see varlang.varlangmt.exprconcern.impl.ExprconcernPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link varlang.varlangmt.exprconcern.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see varlang.varlangmt.exprconcern.impl.VariableImpl
		 * @see varlang.varlangmt.exprconcern.impl.ExprconcernPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

	}

} //ExprconcernPackage
