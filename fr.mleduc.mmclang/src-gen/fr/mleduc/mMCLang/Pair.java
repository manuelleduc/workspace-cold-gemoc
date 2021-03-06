/**
 * generated by Xtext 2.10.0
 */
package fr.mleduc.mMCLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mleduc.mMCLang.Pair#getFrom <em>From</em>}</li>
 *   <li>{@link fr.mleduc.mMCLang.Pair#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.mleduc.mMCLang.MMCLangPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(fr.mleduc.mMLang.Class)
   * @see fr.mleduc.mMCLang.MMCLangPackage#getPair_From()
   * @model
   * @generated
   */
  fr.mleduc.mMLang.Class getFrom();

  /**
   * Sets the value of the '{@link fr.mleduc.mMCLang.Pair#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(fr.mleduc.mMLang.Class value);

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
   * @see fr.mleduc.mMCLang.MMCLangPackage#getPair_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.mleduc.mMCLang.Pair#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Pair
