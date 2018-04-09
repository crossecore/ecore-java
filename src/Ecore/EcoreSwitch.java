package Ecore;

import org.eclipse.emf.ecore.*;

public class EcoreSwitch<T> extends org.eclipse.emf.ecore.util.Switch<T> {

	protected static EcorePackage modelPackage;
	
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}
	
	public EcoreSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = EcorePackageImpl.eINSTANCE;
		}
	}
	
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcorePackageImpl.EATTRIBUTE: {
				EAttribute eattribute = (EAttribute) theEObject;
				T result = caseEAttribute(eattribute);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EANNOTATION: {
				EAnnotation eannotation = (EAnnotation) theEObject;
				T result = caseEAnnotation(eannotation);
				
				if (result == null) result = caseEModelElement(eannotation);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ECLASS: {
				EClass eclass = (EClass) theEObject;
				T result = caseEClass(eclass);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ECLASSIFIER: {
				EClassifier eclassifier = (EClassifier) theEObject;
				T result = caseEClassifier(eclassifier);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EDATATYPE: {
				EDataType edatatype = (EDataType) theEObject;
				T result = caseEDataType(edatatype);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EENUM: {
				EEnum eenum = (EEnum) theEObject;
				T result = caseEEnum(eenum);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EENUMLITERAL: {
				EEnumLiteral eenumliteral = (EEnumLiteral) theEObject;
				T result = caseEEnumLiteral(eenumliteral);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EFACTORY: {
				EFactory efactory = (EFactory) theEObject;
				T result = caseEFactory(efactory);
				
				if (result == null) result = caseEModelElement(efactory);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EMODELELEMENT: {
				EModelElement emodelelement = (EModelElement) theEObject;
				T result = caseEModelElement(emodelelement);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ENAMEDELEMENT: {
				ENamedElement enamedelement = (ENamedElement) theEObject;
				T result = caseENamedElement(enamedelement);
				
				if (result == null) result = caseEModelElement(enamedelement);
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EOBJECT: {
				EObject eobject = (EObject) theEObject;
				T result = caseEObject(eobject);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EOPERATION: {
				EOperation eoperation = (EOperation) theEObject;
				T result = caseEOperation(eoperation);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EPACKAGE: {
				EPackage epackage = (EPackage) theEObject;
				T result = caseEPackage(epackage);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EPARAMETER: {
				EParameter eparameter = (EParameter) theEObject;
				T result = caseEParameter(eparameter);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EREFERENCE: {
				EReference ereference = (EReference) theEObject;
				T result = caseEReference(ereference);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ESTRUCTURALFEATURE: {
				EStructuralFeature estructuralfeature = (EStructuralFeature) theEObject;
				T result = caseEStructuralFeature(estructuralfeature);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ETYPEDELEMENT: {
				ETypedElement etypedelement = (ETypedElement) theEObject;
				T result = caseETypedElement(etypedelement);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ESTRINGTOSTRINGMAPENTRY: {
				EStringToStringMapEntry estringtostringmapentry = (EStringToStringMapEntry) theEObject;
				T result = caseEStringToStringMapEntry(estringtostringmapentry);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.EGENERICTYPE: {
				EGenericType egenerictype = (EGenericType) theEObject;
				T result = caseEGenericType(egenerictype);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcorePackageImpl.ETYPEPARAMETER: {
				ETypeParameter etypeparameter = (ETypeParameter) theEObject;
				T result = caseETypeParameter(etypeparameter);
				
				
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}
	
	
	public T caseEAttribute(EAttribute theEObject) {
		return null;
	}
	public T caseEAnnotation(EAnnotation theEObject) {
		return null;
	}
	public T caseEClass(EClass theEObject) {
		return null;
	}
	public T caseEClassifier(EClassifier theEObject) {
		return null;
	}
	public T caseEDataType(EDataType theEObject) {
		return null;
	}
	public T caseEEnum(EEnum theEObject) {
		return null;
	}
	public T caseEEnumLiteral(EEnumLiteral theEObject) {
		return null;
	}
	public T caseEFactory(EFactory theEObject) {
		return null;
	}
	public T caseEModelElement(EModelElement theEObject) {
		return null;
	}
	public T caseENamedElement(ENamedElement theEObject) {
		return null;
	}
	public T caseEObject(EObject theEObject) {
		return null;
	}
	public T caseEOperation(EOperation theEObject) {
		return null;
	}
	public T caseEPackage(EPackage theEObject) {
		return null;
	}
	public T caseEParameter(EParameter theEObject) {
		return null;
	}
	public T caseEReference(EReference theEObject) {
		return null;
	}
	public T caseEStructuralFeature(EStructuralFeature theEObject) {
		return null;
	}
	public T caseETypedElement(ETypedElement theEObject) {
		return null;
	}
	public T caseEStringToStringMapEntry(EStringToStringMapEntry theEObject) {
		return null;
	}
	public T caseEGenericType(EGenericType theEObject) {
		return null;
	}
	public T caseETypeParameter(ETypeParameter theEObject) {
		return null;
	}
	
}

