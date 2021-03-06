/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getLanguages <em>Languages</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getOperations <em>Operations</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getFeatureModels <em>Feature Models</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Model#getActivations <em>Activations</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.Language}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Languages</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Languages()
   * @model containment="true"
   * @generated
   */
  EList<Language> getLanguages();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.Artifact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifacts</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Artifacts()
   * @model containment="true"
   * @generated
   */
  EList<Artifact> getArtifacts();

  /**
   * Returns the value of the '<em><b>Compositions</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.Composition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compositions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compositions</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Compositions()
   * @model containment="true"
   * @generated
   */
  EList<Composition> getCompositions();

  /**
   * Returns the value of the '<em><b>Feature Models</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.FeatureModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Models</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_FeatureModels()
   * @model containment="true"
   * @generated
   */
  EList<FeatureModel> getFeatureModels();

  /**
   * Returns the value of the '<em><b>Activations</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.Activation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activations</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getModel_Activations()
   * @model containment="true"
   * @generated
   */
  EList<Activation> getActivations();

} // Model
