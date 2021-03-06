/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mLang;

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
 * @see fr.mleduc.mLang.MLangFactory
 * @model kind="package"
 * @generated
 */
public interface MLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mleduc.fr/MLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MLangPackage eINSTANCE = fr.mleduc.mLang.impl.MLangPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.ModelImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSTANCES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.InstanceImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__FIELDS = 2;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.FieldImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getField()
   * @generated
   */
  int FIELD = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VALUE = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.ValueImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.FreeValImpl <em>Free Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.FreeValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getFreeVal()
   * @generated
   */
  int FREE_VAL = 4;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VAL__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Free Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FREE_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.StringValImpl <em>String Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.StringValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getStringVal()
   * @generated
   */
  int STRING_VAL = 5;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAL__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.IntValImpl <em>Int Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.IntValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getIntVal()
   * @generated
   */
  int INT_VAL = 6;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAL__VAL = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.InstanceValImpl <em>Instance Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.InstanceValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getInstanceVal()
   * @generated
   */
  int INSTANCE_VAL = 7;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_VAL__REF = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.ListValImpl <em>List Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.ListValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getListVal()
   * @generated
   */
  int LIST_VAL = 8;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VAL__VALS = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.mleduc.mLang.impl.SetValImpl <em>Set Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.mleduc.mLang.impl.SetValImpl
   * @see fr.mleduc.mLang.impl.MLangPackageImpl#getSetVal()
   * @generated
   */
  int SET_VAL = 9;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VAL__VALS = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_VAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.mleduc.mLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.mLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mLang.Model#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metamodel</em>'.
   * @see fr.mleduc.mLang.Model#getMetamodel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mLang.Model#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see fr.mleduc.mLang.Model#getInstances()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Instances();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see fr.mleduc.mLang.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mLang.Instance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.mleduc.mLang.Instance#getName()
   * @see #getInstance()
   * @generated
   */
  EAttribute getInstance_Name();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mLang.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.mleduc.mLang.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mLang.Instance#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see fr.mleduc.mLang.Instance#getFields()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Fields();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see fr.mleduc.mLang.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mLang.Field#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key</em>'.
   * @see fr.mleduc.mLang.Field#getKey()
   * @see #getField()
   * @generated
   */
  EReference getField_Key();

  /**
   * Returns the meta object for the containment reference '{@link fr.mleduc.mLang.Field#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see fr.mleduc.mLang.Field#getValue()
   * @see #getField()
   * @generated
   */
  EReference getField_Value();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see fr.mleduc.mLang.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.FreeVal <em>Free Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Free Val</em>'.
   * @see fr.mleduc.mLang.FreeVal
   * @generated
   */
  EClass getFreeVal();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mLang.FreeVal#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see fr.mleduc.mLang.FreeVal#getVal()
   * @see #getFreeVal()
   * @generated
   */
  EAttribute getFreeVal_Val();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.StringVal <em>String Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Val</em>'.
   * @see fr.mleduc.mLang.StringVal
   * @generated
   */
  EClass getStringVal();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mLang.StringVal#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see fr.mleduc.mLang.StringVal#getVal()
   * @see #getStringVal()
   * @generated
   */
  EAttribute getStringVal_Val();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.IntVal <em>Int Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Val</em>'.
   * @see fr.mleduc.mLang.IntVal
   * @generated
   */
  EClass getIntVal();

  /**
   * Returns the meta object for the attribute '{@link fr.mleduc.mLang.IntVal#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see fr.mleduc.mLang.IntVal#getVal()
   * @see #getIntVal()
   * @generated
   */
  EAttribute getIntVal_Val();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.InstanceVal <em>Instance Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Val</em>'.
   * @see fr.mleduc.mLang.InstanceVal
   * @generated
   */
  EClass getInstanceVal();

  /**
   * Returns the meta object for the reference '{@link fr.mleduc.mLang.InstanceVal#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see fr.mleduc.mLang.InstanceVal#getRef()
   * @see #getInstanceVal()
   * @generated
   */
  EReference getInstanceVal_Ref();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.ListVal <em>List Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Val</em>'.
   * @see fr.mleduc.mLang.ListVal
   * @generated
   */
  EClass getListVal();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mLang.ListVal#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see fr.mleduc.mLang.ListVal#getVals()
   * @see #getListVal()
   * @generated
   */
  EReference getListVal_Vals();

  /**
   * Returns the meta object for class '{@link fr.mleduc.mLang.SetVal <em>Set Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Val</em>'.
   * @see fr.mleduc.mLang.SetVal
   * @generated
   */
  EClass getSetVal();

  /**
   * Returns the meta object for the containment reference list '{@link fr.mleduc.mLang.SetVal#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see fr.mleduc.mLang.SetVal#getVals()
   * @see #getSetVal()
   * @generated
   */
  EReference getSetVal_Vals();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MLangFactory getMLangFactory();

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
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.ModelImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INSTANCES = eINSTANCE.getModel_Instances();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.InstanceImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__FIELDS = eINSTANCE.getInstance_Fields();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.FieldImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__KEY = eINSTANCE.getField_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VALUE = eINSTANCE.getField_Value();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.ValueImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.FreeValImpl <em>Free Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.FreeValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getFreeVal()
     * @generated
     */
    EClass FREE_VAL = eINSTANCE.getFreeVal();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FREE_VAL__VAL = eINSTANCE.getFreeVal_Val();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.StringValImpl <em>String Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.StringValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getStringVal()
     * @generated
     */
    EClass STRING_VAL = eINSTANCE.getStringVal();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VAL__VAL = eINSTANCE.getStringVal_Val();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.IntValImpl <em>Int Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.IntValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getIntVal()
     * @generated
     */
    EClass INT_VAL = eINSTANCE.getIntVal();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VAL__VAL = eINSTANCE.getIntVal_Val();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.InstanceValImpl <em>Instance Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.InstanceValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getInstanceVal()
     * @generated
     */
    EClass INSTANCE_VAL = eINSTANCE.getInstanceVal();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_VAL__REF = eINSTANCE.getInstanceVal_Ref();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.ListValImpl <em>List Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.ListValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getListVal()
     * @generated
     */
    EClass LIST_VAL = eINSTANCE.getListVal();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_VAL__VALS = eINSTANCE.getListVal_Vals();

    /**
     * The meta object literal for the '{@link fr.mleduc.mLang.impl.SetValImpl <em>Set Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.mleduc.mLang.impl.SetValImpl
     * @see fr.mleduc.mLang.impl.MLangPackageImpl#getSetVal()
     * @generated
     */
    EClass SET_VAL = eINSTANCE.getSetVal();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_VAL__VALS = eINSTANCE.getSetVal_Vals();

  }

} //MLangPackage
