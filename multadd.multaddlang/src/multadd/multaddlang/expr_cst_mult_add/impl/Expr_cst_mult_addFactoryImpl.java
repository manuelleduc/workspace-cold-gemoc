/**
 */
package multadd.multaddlang.expr_cst_mult_add.impl;

import multadd.multaddlang.expr_cst_mult_add.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Expr_cst_mult_addFactoryImpl extends EFactoryImpl implements Expr_cst_mult_addFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Expr_cst_mult_addFactory init() {
		try {
			Expr_cst_mult_addFactory theExpr_cst_mult_addFactory = (Expr_cst_mult_addFactory)EPackage.Registry.INSTANCE.getEFactory(Expr_cst_mult_addPackage.eNS_URI);
			if (theExpr_cst_mult_addFactory != null) {
				return theExpr_cst_mult_addFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Expr_cst_mult_addFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr_cst_mult_addFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Expr_cst_mult_addPackage.ADD: return createAdd();
			case Expr_cst_mult_addPackage.MULT: return createMult();
			case Expr_cst_mult_addPackage.CST: return createCst();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cst createCst() {
		CstImpl cst = new CstImpl();
		return cst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr_cst_mult_addPackage getExpr_cst_mult_addPackage() {
		return (Expr_cst_mult_addPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Expr_cst_mult_addPackage getPackage() {
		return Expr_cst_mult_addPackage.eINSTANCE;
	}

} //Expr_cst_mult_addFactoryImpl
