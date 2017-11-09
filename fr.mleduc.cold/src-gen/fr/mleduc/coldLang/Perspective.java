/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.coldLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.coldLang.Perspective#getName <em>Name</em>}</li>
 *   <li>{@link fr.mleduc.coldLang.Perspective#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.coldLang.ColdLangPackage#getPerspective()
 * @model
 * @generated
 */
public interface Perspective extends EObject
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
   * @see fr.mleduc.coldLang.ColdLangPackage#getPerspective_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.coldLang.Perspective#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
   * The list contents are of type {@link fr.mleduc.coldLang.PerspectiveLanguage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Languages</em>' containment reference list.
   * @see fr.mleduc.coldLang.ColdLangPackage#getPerspective_Languages()
   * @model containment="true"
   * @generated
   */
  EList<PerspectiveLanguage> getLanguages();

} // Perspective
