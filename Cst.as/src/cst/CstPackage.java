/**
 */
package cst;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cst.CstFactory
 * @model kind="package"
 * @generated
 */
public interface CstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cst";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cst";

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
	CstPackage eINSTANCE = cst.impl.CstPackageImpl.init();

	/**
	 * The meta object id for the '{@link cst.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cst.impl.ExprImpl
	 * @see cst.impl.CstPackageImpl#getExpr()
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
	 * The number of operations of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cst.impl.CstImpl <em>Cst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cst.impl.CstImpl
	 * @see cst.impl.CstPackageImpl#getCst()
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
	 * The number of operations of the '<em>Cst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CST_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link cst.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see cst.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link cst.Cst <em>Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cst</em>'.
	 * @see cst.Cst
	 * @generated
	 */
	EClass getCst();

	/**
	 * Returns the meta object for the attribute '{@link cst.Cst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cst.Cst#getValue()
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
	CstFactory getCstFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cst.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cst.impl.ExprImpl
		 * @see cst.impl.CstPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link cst.impl.CstImpl <em>Cst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cst.impl.CstImpl
		 * @see cst.impl.CstPackageImpl#getCst()
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

} //CstPackage
