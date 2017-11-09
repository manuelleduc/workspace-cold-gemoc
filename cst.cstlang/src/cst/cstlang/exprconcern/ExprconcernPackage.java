/**
 */
package cst.cstlang.exprconcern;

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
 * @see cst.cstlang.exprconcern.ExprconcernFactory
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
	String eNS_URI = "http://cst.cstlang/exprconcern/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprconcernPackage eINSTANCE = cst.cstlang.exprconcern.impl.ExprconcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link cst.cstlang.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cst.cstlang.exprconcern.impl.ExprImpl
	 * @see cst.cstlang.exprconcern.impl.ExprconcernPackageImpl#getExpr()
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
	 * The meta object id for the '{@link cst.cstlang.exprconcern.impl.CstImpl <em>Cst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cst.cstlang.exprconcern.impl.CstImpl
	 * @see cst.cstlang.exprconcern.impl.ExprconcernPackageImpl#getCst()
	 * @generated
	 */
	int CST = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CST__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CST_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link cst.cstlang.exprconcern.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see cst.cstlang.exprconcern.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link cst.cstlang.exprconcern.Cst <em>Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cst</em>'.
	 * @see cst.cstlang.exprconcern.Cst
	 * @generated
	 */
	EClass getCst();

	/**
	 * Returns the meta object for the attribute '{@link cst.cstlang.exprconcern.Cst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cst.cstlang.exprconcern.Cst#getValue()
	 * @see #getCst()
	 * @generated
	 */
	EAttribute getCst_Value();

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
		 * The meta object literal for the '{@link cst.cstlang.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cst.cstlang.exprconcern.impl.ExprImpl
		 * @see cst.cstlang.exprconcern.impl.ExprconcernPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link cst.cstlang.exprconcern.impl.CstImpl <em>Cst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cst.cstlang.exprconcern.impl.CstImpl
		 * @see cst.cstlang.exprconcern.impl.ExprconcernPackageImpl#getCst()
		 * @generated
		 */
		EClass CST = eINSTANCE.getCst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CST__VALUE = eINSTANCE.getCst_Value();

	}

} //ExprconcernPackage
