/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mMCLang;

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
 * @see fr.mleduc.mMCLang.MMCLangFactory
 * @model kind="package"
 * @generated
 */
public interface MMCLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mMCLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mleduc.fr/MMCLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mMCLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MMCLangPackage eINSTANCE = fr.mleduc.mMCLang.impl.MMCLangPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mleduc.mMCLang.impl.CompositionImpl <em>Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mMCLang.impl.CompositionImpl
   * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getComposition()
   * @generated
   */
  int COMPOSITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mleduc.mMCLang.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mMCLang.impl.OperationImpl
   * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 1;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__METAMODEL = 0;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mMCLang.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mMCLang.impl.PairImpl
   * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__FROM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__NAME = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mleduc.mMCLang.impl.MergeImpl <em>Merge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mMCLang.impl.MergeImpl
   * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getMerge()
   * @generated
   */
  int MERGE = 3;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__METAMODEL = OPERATION__METAMODEL;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE__PAIRS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Merge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MERGE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mMCLang.impl.SliceImpl <em>Slice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mMCLang.impl.SliceImpl
   * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getSlice()
   * @generated
   */
  int SLICE = 4;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLICE__METAMODEL = OPERATION__METAMODEL;

  /**
   * The feature id for the '<em><b>Targets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLICE__TARGETS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Slice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLICE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.mleduc.mMCLang.Composition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition</em>'.
   * @see fr.mleduc.mMCLang.Composition
   * @generated
   */
  EClass getComposition();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mMCLang.Composition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.mMCLang.Composition#getName()
   * @see #getComposition()
   * @generated
   */
  EAttribute getComposition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mMCLang.Composition#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see fr.mleduc.mMCLang.Composition#getOperations()
   * @see #getComposition()
   * @generated
   */
  EReference getComposition_Operations();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mMCLang.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see fr.mleduc.mMCLang.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mMCLang.Operation#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metamodel</em>'.
   * @see fr.mleduc.mMCLang.Operation#getMetamodel()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Metamodel();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mMCLang.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see fr.mleduc.mMCLang.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mMCLang.Pair#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see fr.mleduc.mMCLang.Pair#getFrom()
   * @see #getPair()
   * @generated
   */
  EReference getPair_From();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mMCLang.Pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.mMCLang.Pair#getName()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Name();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mMCLang.Merge <em>Merge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Merge</em>'.
   * @see fr.mleduc.mMCLang.Merge
   * @generated
   */
  EClass getMerge();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mMCLang.Merge#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see fr.mleduc.mMCLang.Merge#getPairs()
   * @see #getMerge()
   * @generated
   */
  EReference getMerge_Pairs();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mMCLang.Slice <em>Slice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slice</em>'.
   * @see fr.mleduc.mMCLang.Slice
   * @generated
   */
  EClass getSlice();

  /**
   * Returns the meta object for the reference list '{@link fr.mleduc.mMCLang.Slice#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Targets</em>'.
   * @see fr.mleduc.mMCLang.Slice#getTargets()
   * @see #getSlice()
   * @generated
   */
  EReference getSlice_Targets();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MMCLangFactory getMMCLangFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.mleduc.mMCLang.impl.CompositionImpl <em>Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mMCLang.impl.CompositionImpl
     * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getComposition()
     * @generated
     */
    EClass COMPOSITION = eINSTANCE.getComposition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITION__NAME = eINSTANCE.getComposition_Name();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITION__OPERATIONS = eINSTANCE.getComposition_Operations();

    /**
     * The meta object literal for the '{@link fr.mleduc.mMCLang.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mMCLang.impl.OperationImpl
     * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__METAMODEL = eINSTANCE.getOperation_Metamodel();

    /**
     * The meta object literal for the '{@link fr.mleduc.mMCLang.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mMCLang.impl.PairImpl
     * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__FROM = eINSTANCE.getPair_From();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__NAME = eINSTANCE.getPair_Name();

    /**
     * The meta object literal for the '{@link fr.mleduc.mMCLang.impl.MergeImpl <em>Merge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mMCLang.impl.MergeImpl
     * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getMerge()
     * @generated
     */
    EClass MERGE = eINSTANCE.getMerge();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MERGE__PAIRS = eINSTANCE.getMerge_Pairs();

    /**
     * The meta object literal for the '{@link fr.mleduc.mMCLang.impl.SliceImpl <em>Slice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mMCLang.impl.SliceImpl
     * @see fr.mleduc.mMCLang.impl.MMCLangPackageImpl#getSlice()
     * @generated
     */
    EClass SLICE = eINSTANCE.getSlice();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLICE__TARGETS = eINSTANCE.getSlice_Targets();

  }

} //MMCLangPackage
