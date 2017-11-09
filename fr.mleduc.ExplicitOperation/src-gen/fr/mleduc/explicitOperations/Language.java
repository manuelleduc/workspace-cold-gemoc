/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.Language#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.Language#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EObject
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
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.Language#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.explicitOperations.LanguageDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguage_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<LanguageDependency> getDependencies();

} // Language