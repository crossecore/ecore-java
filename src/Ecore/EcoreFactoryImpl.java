package Ecore;
import org.eclipse.emf.ecore.*;
public class EcoreFactoryImpl extends org.eclipse.emf.ecore.impl.EFactoryImpl implements EcoreFactory {
	
	public static EcoreFactory eINSTANCE = EcoreFactoryImpl.init();
	
	        public static EcoreFactory init()
	        {
	            return new EcoreFactoryImpl();
	        }
	
	public EAttribute createEAttribute(){
		EAttributeImpl theEAttribute = new EAttributeImpl();
		return theEAttribute;
	}
	public EAnnotation createEAnnotation(){
		EAnnotationImpl theEAnnotation = new EAnnotationImpl();
		return theEAnnotation;
	}
	public EClass createEClass(){
		EClassImpl theEClass = new EClassImpl();
		return theEClass;
	}
	public EClassifier createEClassifier(){
		EClassifierImpl theEClassifier = new EClassifierImpl();
		return theEClassifier;
	}
	public EDataType createEDataType(){
		EDataTypeImpl theEDataType = new EDataTypeImpl();
		return theEDataType;
	}
	public EEnum createEEnum(){
		EEnumImpl theEEnum = new EEnumImpl();
		return theEEnum;
	}
	public EEnumLiteral createEEnumLiteral(){
		EEnumLiteralImpl theEEnumLiteral = new EEnumLiteralImpl();
		return theEEnumLiteral;
	}
	public EFactory createEFactory(){
		EFactoryImpl theEFactory = new EFactoryImpl();
		return theEFactory;
	}
	public EModelElement createEModelElement(){
		EModelElementImpl theEModelElement = new EModelElementImpl();
		return theEModelElement;
	}
	public ENamedElement createENamedElement(){
		ENamedElementImpl theENamedElement = new ENamedElementImpl();
		return theENamedElement;
	}
	public EObject createEObject(){
		EObjectImpl theEObject = new EObjectImpl();
		return theEObject;
	}
	public EOperation createEOperation(){
		EOperationImpl theEOperation = new EOperationImpl();
		return theEOperation;
	}
	public EPackage createEPackage(){
		EPackageImpl theEPackage = new EPackageImpl();
		return theEPackage;
	}
	public EParameter createEParameter(){
		EParameterImpl theEParameter = new EParameterImpl();
		return theEParameter;
	}
	public EReference createEReference(){
		EReferenceImpl theEReference = new EReferenceImpl();
		return theEReference;
	}
	public EStructuralFeature createEStructuralFeature(){
		EStructuralFeatureImpl theEStructuralFeature = new EStructuralFeatureImpl();
		return theEStructuralFeature;
	}
	public ETypedElement createETypedElement(){
		ETypedElementImpl theETypedElement = new ETypedElementImpl();
		return theETypedElement;
	}
	public EStringToStringMapEntry createEStringToStringMapEntry(){
		EStringToStringMapEntryImpl theEStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return theEStringToStringMapEntry;
	}
	public EGenericType createEGenericType(){
		EGenericTypeImpl theEGenericType = new EGenericTypeImpl();
		return theEGenericType;
	}
	public ETypeParameter createETypeParameter(){
		ETypeParameterImpl theETypeParameter = new ETypeParameterImpl();
		return theETypeParameter;
	}
}
