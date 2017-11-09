/**
 */
package mult.multlang.exprconcern;

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
 * @see mult.multlang.exprconcern.ExprconcernFactory
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
	String eNS_URI = "http://mult.multlang/exprconcern/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mult";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExprconcernPackage eINSTANCE = mult.multlang.exprconcern.impl.ExprconcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link mult.multlang.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mult.multlang.exprconcern.impl.ExprImpl
	 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getExpr()
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
	 * The meta object id for the '{@link mult.multlang.exprconcern.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mult.multlang.exprconcern.impl.MultImpl
	 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__LEFT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__RIGHT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mult.multlang.exprconcern.impl.CstImpl <em>Cst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mult.multlang.exprconcern.impl.CstImpl
	 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getCst()
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
	 * Returns the meta object for class '{@link mult.multlang.exprconcern.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see mult.multlang.exprconcern.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link mult.multlang.exprconcern.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see mult.multlang.exprconcern.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for the containment reference '{@link mult.multlang.exprconcern.Mult#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see mult.multlang.exprconcern.Mult#getLeft()
	 * @see #getMult()
	 * @generated
	 */
	EReference getMult_Left();

	/**
	 * Returns the meta object for the containment reference '{@link mult.multlang.exprconcern.Mult#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see mult.multlang.exprconcern.Mult#getRight()
	 * @see #getMult()
	 * @generated
	 */
	EReference getMult_Right();

	/**
	 * Returns the meta object for class '{@link mult.multlang.exprconcern.Cst <em>Cst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cst</em>'.
	 * @see mult.multlang.exprconcern.Cst
	 * @generated
	 */
	EClass getCst();

	/**
	 * Returns the meta object for the attribute '{@link mult.multlang.exprconcern.Cst#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mult.multlang.exprconcern.Cst#getValue()
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
		 * The meta object literal for the '{@link mult.multlang.exprconcern.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mult.multlang.exprconcern.impl.ExprImpl
		 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link mult.multlang.exprconcern.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mult.multlang.exprconcern.impl.MultImpl
		 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULT__LEFT = eINSTANCE.getMult_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULT__RIGHT = eINSTANCE.getMult_Right();

		/**
		 * The meta object literal for the '{@link mult.multlang.exprconcern.impl.CstImpl <em>Cst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mult.multlang.exprconcern.impl.CstImpl
		 * @see mult.multlang.exprconcern.impl.ExprconcernPackageImpl#getCst()
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
