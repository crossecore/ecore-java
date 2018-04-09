package Ecore;
import org.eclipse.emf.ecore.*;
public interface EcoreFactory extends EFactory{
	
	EAttribute createEAttribute();
	EAnnotation createEAnnotation();
	EClass createEClass();
	EClassifier createEClassifier();
	EDataType createEDataType();
	EEnum createEEnum();
	EEnumLiteral createEEnumLiteral();
	EFactory createEFactory();
	EModelElement createEModelElement();
	ENamedElement createENamedElement();
	EObject createEObject();
	EOperation createEOperation();
	EPackage createEPackage();
	EParameter createEParameter();
	EReference createEReference();
	EStructuralFeature createEStructuralFeature();
	ETypedElement createETypedElement();
	EStringToStringMapEntry createEStringToStringMapEntry();
	EGenericType createEGenericType();
	ETypeParameter createETypeParameter();
}

