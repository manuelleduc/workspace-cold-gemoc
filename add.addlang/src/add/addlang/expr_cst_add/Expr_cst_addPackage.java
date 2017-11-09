/**
 */
package add.addlang.expr_cst_add;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see add.addlang.expr_cst_add.Expr_cst_addFactory
 * @model kind="package"
 * @generated
 */
public interface Expr_cst_addPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expr_cst_add";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://add.addlang/expr_cst_add/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "add";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Expr_cst_addPackage eINSTANCE = add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl.init();

	/**
	 * The meta object id for the '{@link add.addlang.expr_cst_add.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.addlang.expr_cst_add.impl.ExprImpl
	 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getExpr()
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
	 * The meta object id for the '{@link add.addlang.expr_cst_add.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.addlang.expr_cst_add.impl.AddImpl
	 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__LEFT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__RIGHT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link add.addlang.expr_cst_add.impl.CstImpl <em>Cst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.addlang.expr_cst_add.impl.CstImpl
	 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getCst()
	 * @generated
	 */
	int CST = 2;

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
	 * Returns the meta object for class '{@link add.addlang.expr_cst_add.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see add.addlang.expr_cst_add.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link add.addlang.expr_cst_add.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see add.addlang.expr_cst_add.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the containment reference '{@link add.addlang.expr_cst_add.Add#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see add.addlang.expr_cst_add.Add#getLeft()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link add.addlang.expr_cst_add.Add#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see add.addlang.expr_cst_add.Add#getRight()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Right();

	/**
	 * Returns the meta object for class '{@link add.addlang.expr_cst_add.Cst <em>Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cst</em>'.
	 * @see add.addlang.expr_cst_add.Cst
	 * @generated
	 */
	EClass getCst();

	/**
	 * Returns the meta object for the attribute '{@link add.addlang.expr_cst_add.Cst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see add.addlang.expr_cst_add.Cst#getValue()
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
	Expr_cst_addFactory getExpr_cst_addFactory();

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
		 * The meta object literal for the '{@link add.addlang.expr_cst_add.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.addlang.expr_cst_add.impl.ExprImpl
		 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link add.addlang.expr_cst_add.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.addlang.expr_cst_add.impl.AddImpl
		 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__LEFT = eINSTANCE.getAdd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__RIGHT = eINSTANCE.getAdd_Right();

		/**
		 * The meta object literal for the '{@link add.addlang.expr_cst_add.impl.CstImpl <em>Cst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.addlang.expr_cst_add.impl.CstImpl
		 * @see add.addlang.expr_cst_add.impl.Expr_cst_addPackageImpl#getCst()
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

} //Expr_cst_addPackage
