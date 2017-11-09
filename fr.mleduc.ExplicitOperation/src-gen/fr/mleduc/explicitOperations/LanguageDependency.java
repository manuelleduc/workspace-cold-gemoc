/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.explicitOperations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.explicitOperations.LanguageDependency#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.explicitOperations.LanguageDependency#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguageDependency()
 * @model
 * @generated
 */
public interface LanguageDependency extends EObject
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
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguageDependency_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.LanguageDependency#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Language)
   * @see fr.mleduc.explicitOperations.ExplicitOperationsPackage#getLanguageDependency_Type()
   * @model
   * @generated
   */
  Language getType();

  /**
   * Sets the value of the '{@link fr.mleduc.explicitOperations.LanguageDependency#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Language value);

} // LanguageDependency