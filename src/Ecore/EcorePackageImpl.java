package Ecore;

import org.eclipse.emf.ecore.*;

public class EcorePackageImpl extends org.eclipse.emf.ecore.impl.EPackageImpl implements EcorePackage{
		public static String eNAME = "ecore";
		
		public static String eNS_URI = "http://www.eclipse.org/emf/2002/Ecore";
		
		public static String eNS_PREFIX = "ecore";
		
		public static EcorePackage eINSTANCE = init();
		
		private EcorePackageImpl()
		{
			super(eNS_URI, EcoreFactoryImpl.eINSTANCE);
		}
		
	            public static EcorePackage init()
	            {
	                // Obtain or create and register package
	                EcorePackageImpl theEcorePackage = new EcorePackageImpl();
	
	                // Create package meta-data objects
	                theEcorePackage.createPackageContents();
	
	                // Initialize created meta-data
	                theEcorePackage.initializePackageContents();
	
	        return theEcorePackage;
        }
        
        private boolean isCreated = false;
	            public void createPackageContents()
	            {
	                if (isCreated) return;
	                isCreated = true;
			EAttributeEClass = createEClass(EATTRIBUTE);
			createEAttribute(EAttributeEClass, EATTRIBUTE_ID);
			createEReference(EAttributeEClass, EATTRIBUTE_EATTRIBUTETYPE);
			EAnnotationEClass = createEClass(EANNOTATION);
			createEAttribute(EAnnotationEClass, EANNOTATION_SOURCE);
			createEReference(EAnnotationEClass, EANNOTATION_DETAILS);
			createEReference(EAnnotationEClass, EANNOTATION_EMODELELEMENT);
			createEReference(EAnnotationEClass, EANNOTATION_CONTENTS);
			createEReference(EAnnotationEClass, EANNOTATION_REFERENCES);
			EClassEClass = createEClass(ECLASS);
			createEAttribute(EClassEClass, ECLASS_ABSTRACT);
			createEAttribute(EClassEClass, ECLASS_INTERFACE);
			createEReference(EClassEClass, ECLASS_ESUPERTYPES);
			createEReference(EClassEClass, ECLASS_EOPERATIONS);
			createEReference(EClassEClass, ECLASS_EALLATTRIBUTES);
			createEReference(EClassEClass, ECLASS_EALLREFERENCES);
			createEReference(EClassEClass, ECLASS_EREFERENCES);
			createEReference(EClassEClass, ECLASS_EATTRIBUTES);
			createEReference(EClassEClass, ECLASS_EALLCONTAINMENTS);
			createEReference(EClassEClass, ECLASS_EALLOPERATIONS);
			createEReference(EClassEClass, ECLASS_EALLSTRUCTURALFEATURES);
			createEReference(EClassEClass, ECLASS_EALLSUPERTYPES);
			createEReference(EClassEClass, ECLASS_EIDATTRIBUTE);
			createEReference(EClassEClass, ECLASS_ESTRUCTURALFEATURES);
			createEReference(EClassEClass, ECLASS_EGENERICSUPERTYPES);
			createEReference(EClassEClass, ECLASS_EALLGENERICSUPERTYPES);
			EClassifierEClass = createEClass(ECLASSIFIER);
			createEAttribute(EClassifierEClass, ECLASSIFIER_INSTANCECLASSNAME);
			createEAttribute(EClassifierEClass, ECLASSIFIER_INSTANCECLASS);
			createEAttribute(EClassifierEClass, ECLASSIFIER_DEFAULTVALUE);
			createEAttribute(EClassifierEClass, ECLASSIFIER_INSTANCETYPENAME);
			createEReference(EClassifierEClass, ECLASSIFIER_EPACKAGE);
			createEReference(EClassifierEClass, ECLASSIFIER_ETYPEPARAMETERS);
			EDataTypeEClass = createEClass(EDATATYPE);
			createEAttribute(EDataTypeEClass, EDATATYPE_SERIALIZABLE);
			EEnumEClass = createEClass(EENUM);
			createEReference(EEnumEClass, EENUM_ELITERALS);
			EEnumLiteralEClass = createEClass(EENUMLITERAL);
			createEAttribute(EEnumLiteralEClass, EENUMLITERAL_VALUE);
			createEAttribute(EEnumLiteralEClass, EENUMLITERAL_INSTANCE);
			createEAttribute(EEnumLiteralEClass, EENUMLITERAL_LITERAL);
			createEReference(EEnumLiteralEClass, EENUMLITERAL_EENUM);
			EFactoryEClass = createEClass(EFACTORY);
			createEReference(EFactoryEClass, EFACTORY_EPACKAGE);
			EModelElementEClass = createEClass(EMODELELEMENT);
			createEReference(EModelElementEClass, EMODELELEMENT_EANNOTATIONS);
			ENamedElementEClass = createEClass(ENAMEDELEMENT);
			createEAttribute(ENamedElementEClass, ENAMEDELEMENT_NAME);
			EObjectEClass = createEClass(EOBJECT);
			EOperationEClass = createEClass(EOPERATION);
			createEReference(EOperationEClass, EOPERATION_ECONTAININGCLASS);
			createEReference(EOperationEClass, EOPERATION_ETYPEPARAMETERS);
			createEReference(EOperationEClass, EOPERATION_EPARAMETERS);
			createEReference(EOperationEClass, EOPERATION_EEXCEPTIONS);
			createEReference(EOperationEClass, EOPERATION_EGENERICEXCEPTIONS);
			EPackageEClass = createEClass(EPACKAGE);
			createEAttribute(EPackageEClass, EPACKAGE_NSURI);
			createEAttribute(EPackageEClass, EPACKAGE_NSPREFIX);
			createEReference(EPackageEClass, EPACKAGE_EFACTORYINSTANCE);
			createEReference(EPackageEClass, EPACKAGE_ECLASSIFIERS);
			createEReference(EPackageEClass, EPACKAGE_ESUBPACKAGES);
			createEReference(EPackageEClass, EPACKAGE_ESUPERPACKAGE);
			EParameterEClass = createEClass(EPARAMETER);
			createEReference(EParameterEClass, EPARAMETER_EOPERATION);
			EReferenceEClass = createEClass(EREFERENCE);
			createEAttribute(EReferenceEClass, EREFERENCE_CONTAINMENT);
			createEAttribute(EReferenceEClass, EREFERENCE_CONTAINER);
			createEAttribute(EReferenceEClass, EREFERENCE_RESOLVEPROXIES);
			createEReference(EReferenceEClass, EREFERENCE_EOPPOSITE);
			createEReference(EReferenceEClass, EREFERENCE_EREFERENCETYPE);
			createEReference(EReferenceEClass, EREFERENCE_EKEYS);
			EStructuralFeatureEClass = createEClass(ESTRUCTURALFEATURE);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_CHANGEABLE);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_VOLATILE);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_TRANSIENT);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_DEFAULTVALUELITERAL);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_DEFAULTVALUE);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_UNSETTABLE);
			createEAttribute(EStructuralFeatureEClass, ESTRUCTURALFEATURE_DERIVED);
			createEReference(EStructuralFeatureEClass, ESTRUCTURALFEATURE_ECONTAININGCLASS);
			ETypedElementEClass = createEClass(ETYPEDELEMENT);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_ORDERED);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_UNIQUE);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_LOWERBOUND);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_UPPERBOUND);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_MANY);
			createEAttribute(ETypedElementEClass, ETYPEDELEMENT_REQUIRED);
			createEReference(ETypedElementEClass, ETYPEDELEMENT_ETYPE);
			createEReference(ETypedElementEClass, ETYPEDELEMENT_EGENERICTYPE);
			EStringToStringMapEntryEClass = createEClass(ESTRINGTOSTRINGMAPENTRY);
			createEAttribute(EStringToStringMapEntryEClass, ESTRINGTOSTRINGMAPENTRY_KEY);
			createEAttribute(EStringToStringMapEntryEClass, ESTRINGTOSTRINGMAPENTRY_VALUE);
			EGenericTypeEClass = createEClass(EGENERICTYPE);
			createEReference(EGenericTypeEClass, EGENERICTYPE_EUPPERBOUND);
			createEReference(EGenericTypeEClass, EGENERICTYPE_ETYPEARGUMENTS);
			createEReference(EGenericTypeEClass, EGENERICTYPE_ERAWTYPE);
			createEReference(EGenericTypeEClass, EGENERICTYPE_ELOWERBOUND);
			createEReference(EGenericTypeEClass, EGENERICTYPE_ETYPEPARAMETER);
			createEReference(EGenericTypeEClass, EGENERICTYPE_ECLASSIFIER);
			ETypeParameterEClass = createEClass(ETYPEPARAMETER);
			createEReference(ETypeParameterEClass, ETYPEPARAMETER_EBOUNDS);
			
        }
        
        private boolean isInitialized = false;
        public void initializePackageContents()
        {
	                if (isInitialized) return;
	                isInitialized = true;
            // Initialize package
            name = eNAME;
            nsPrefix = eNS_PREFIX;
            nsURI = eNS_URI;

			
			EAttributeEClass.getESuperTypes().add(getEStructuralFeature());
										
			
			EAnnotationEClass.getESuperTypes().add(getEModelElement());
										
			
			EClassEClass.getESuperTypes().add(getEClassifier());
										
			
			EClassifierEClass.getESuperTypes().add(getENamedElement());
										
			
			EDataTypeEClass.getESuperTypes().add(getEClassifier());
										
			
			EEnumEClass.getESuperTypes().add(getEDataType());
										
			
			EEnumLiteralEClass.getESuperTypes().add(getENamedElement());
										
			
			EFactoryEClass.getESuperTypes().add(getEModelElement());
										
			
			
			ENamedElementEClass.getESuperTypes().add(getEModelElement());
										
			
			
			EOperationEClass.getESuperTypes().add(getETypedElement());
										
			
			EPackageEClass.getESuperTypes().add(getENamedElement());
										
			
			EParameterEClass.getESuperTypes().add(getETypedElement());
										
			
			EReferenceEClass.getESuperTypes().add(getEStructuralFeature());
										
			
			EStructuralFeatureEClass.getESuperTypes().add(getETypedElement());
										
			
			ETypedElementEClass.getESuperTypes().add(getENamedElement());
										
			
			
			
			ETypeParameterEClass.getESuperTypes().add(getENamedElement());
										
			
			initEClass(EAttributeEClass, EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEAttribute_ID(), 
				ecorePackage.getEBoolean(), 
				"iD", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEAttribute_EAttributeType(), 
				ecorePackage.getEDataType(), 
				null, 
				"eAttributeType", 
				null, 
				1, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EAnnotationEClass, EAnnotation.class, "EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEAnnotation_Source(), 
				ecorePackage.getEString(), 
				"source", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEAnnotation_Details(), 
				ecorePackage.getEStringToStringMapEntry(), 
				null, 
				"details", 
				null, 
				0, 
				-1, 
				EAnnotation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEAnnotation_EModelElement(), 
				ecorePackage.getEModelElement(), 
				getEModelElement_EAnnotations(), 
				"eModelElement", 
				null, 
				0, 
				1, 
				EAnnotation.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEAnnotation_Contents(), 
				ecorePackage.getEObject(), 
				null, 
				"contents", 
				null, 
				0, 
				-1, 
				EAnnotation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEAnnotation_References(), 
				ecorePackage.getEObject(), 
				null, 
				"references", 
				null, 
				0, 
				-1, 
				EAnnotation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EClassEClass, EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEClass_Abstract(), 
				ecorePackage.getEBoolean(), 
				"abstract_", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEClass_Interface(), 
				ecorePackage.getEBoolean(), 
				"interface_", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEClass_ESuperTypes(), 
				ecorePackage.getEClass(), 
				null, 
				"eSuperTypes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EOperations(), 
				ecorePackage.getEOperation(), 
				getEOperation_EContainingClass(), 
				"eOperations", 
				null, 
				0, 
				-1, 
				EClass.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllAttributes(), 
				ecorePackage.getEAttribute(), 
				null, 
				"eAllAttributes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllReferences(), 
				ecorePackage.getEReference(), 
				null, 
				"eAllReferences", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EReferences(), 
				ecorePackage.getEReference(), 
				null, 
				"eReferences", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAttributes(), 
				ecorePackage.getEAttribute(), 
				null, 
				"eAttributes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllContainments(), 
				ecorePackage.getEReference(), 
				null, 
				"eAllContainments", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllOperations(), 
				ecorePackage.getEOperation(), 
				null, 
				"eAllOperations", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllStructuralFeatures(), 
				ecorePackage.getEStructuralFeature(), 
				null, 
				"eAllStructuralFeatures", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllSuperTypes(), 
				ecorePackage.getEClass(), 
				null, 
				"eAllSuperTypes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EIDAttribute(), 
				ecorePackage.getEAttribute(), 
				null, 
				"eIDAttribute", 
				null, 
				0, 
				1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EStructuralFeatures(), 
				ecorePackage.getEStructuralFeature(), 
				getEStructuralFeature_EContainingClass(), 
				"eStructuralFeatures", 
				null, 
				0, 
				-1, 
				EClass.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EGenericSuperTypes(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eGenericSuperTypes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClass_EAllGenericSuperTypes(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eAllGenericSuperTypes", 
				null, 
				0, 
				-1, 
				EClass.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EClassifierEClass, EClassifier.class, "EClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEClassifier_InstanceClassName(), 
				ecorePackage.getEString(), 
				"instanceClassName", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEClassifier_InstanceClass(), 
				ecorePackage.getEJavaClass(), 
				"instanceClass", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEClassifier_DefaultValue(), 
				ecorePackage.getEJavaObject(), 
				"defaultValue", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEClassifier_InstanceTypeName(), 
				ecorePackage.getEString(), 
				"instanceTypeName", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEClassifier_EPackage(), 
				ecorePackage.getEPackage(), 
				getEPackage_EClassifiers(), 
				"ePackage", 
				null, 
				0, 
				1, 
				EClassifier.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEClassifier_ETypeParameters(), 
				ecorePackage.getETypeParameter(), 
				null, 
				"eTypeParameters", 
				null, 
				0, 
				-1, 
				EClassifier.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EDataTypeEClass, EDataType.class, "EDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEDataType_Serializable(), 
				ecorePackage.getEBoolean(), 
				"serializable", 
				"true", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			initEClass(EEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEEnum_ELiterals(), 
				ecorePackage.getEEnumLiteral(), 
				getEEnumLiteral_EEnum(), 
				"eLiterals", 
				null, 
				0, 
				-1, 
				EEnum.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEEnumLiteral_Value(), 
				ecorePackage.getEInt(), 
				"value", 
				"0", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEEnumLiteral_Instance(), 
				ecorePackage.getEEnumerator(), 
				"instance", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEEnumLiteral_Literal(), 
				ecorePackage.getEString(), 
				"literal", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEEnumLiteral_EEnum(), 
				ecorePackage.getEEnum(), 
				getEEnum_ELiterals(), 
				"eEnum", 
				null, 
				0, 
				1, 
				EEnumLiteral.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EFactoryEClass, EFactory.class, "EFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEFactory_EPackage(), 
				ecorePackage.getEPackage(), 
				getEPackage_EFactoryInstance(), 
				"ePackage", 
				null, 
				1, 
				1, 
				EFactory.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EModelElementEClass, EModelElement.class, "EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEModelElement_EAnnotations(), 
				ecorePackage.getEAnnotation(), 
				getEAnnotation_EModelElement(), 
				"eAnnotations", 
				null, 
				0, 
				-1, 
				EModelElement.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(ENamedElementEClass, ENamedElement.class, "ENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getENamedElement_Name(), 
				ecorePackage.getEString(), 
				"name", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			initEClass(EObjectEClass, EObject.class, "EObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			
			initEClass(EOperationEClass, EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEOperation_EContainingClass(), 
				ecorePackage.getEClass(), 
				getEClass_EOperations(), 
				"eContainingClass", 
				null, 
				0, 
				1, 
				EOperation.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEOperation_ETypeParameters(), 
				ecorePackage.getETypeParameter(), 
				null, 
				"eTypeParameters", 
				null, 
				0, 
				-1, 
				EOperation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEOperation_EParameters(), 
				ecorePackage.getEParameter(), 
				getEParameter_EOperation(), 
				"eParameters", 
				null, 
				0, 
				-1, 
				EOperation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEOperation_EExceptions(), 
				ecorePackage.getEClassifier(), 
				null, 
				"eExceptions", 
				null, 
				0, 
				-1, 
				EOperation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEOperation_EGenericExceptions(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eGenericExceptions", 
				null, 
				0, 
				-1, 
				EOperation.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EPackageEClass, EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEPackage_NsURI(), 
				ecorePackage.getEString(), 
				"nsURI", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEPackage_NsPrefix(), 
				ecorePackage.getEString(), 
				"nsPrefix", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEPackage_EFactoryInstance(), 
				ecorePackage.getEFactory(), 
				getEFactory_EPackage(), 
				"eFactoryInstance", 
				null, 
				1, 
				1, 
				EPackage.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEPackage_EClassifiers(), 
				ecorePackage.getEClassifier(), 
				getEClassifier_EPackage(), 
				"eClassifiers", 
				null, 
				0, 
				-1, 
				EPackage.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEPackage_ESubpackages(), 
				ecorePackage.getEPackage(), 
				getEPackage_ESuperPackage(), 
				"eSubpackages", 
				null, 
				0, 
				-1, 
				EPackage.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEPackage_ESuperPackage(), 
				ecorePackage.getEPackage(), 
				getEPackage_ESubpackages(), 
				"eSuperPackage", 
				null, 
				0, 
				1, 
				EPackage.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEParameter_EOperation(), 
				ecorePackage.getEOperation(), 
				getEOperation_EParameters(), 
				"eOperation", 
				null, 
				0, 
				1, 
				EParameter.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EReferenceEClass, EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEReference_Containment(), 
				ecorePackage.getEBoolean(), 
				"containment", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEReference_Container(), 
				ecorePackage.getEBoolean(), 
				"container", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEReference_ResolveProxies(), 
				ecorePackage.getEBoolean(), 
				"resolveProxies", 
				"true", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEReference_EOpposite(), 
				ecorePackage.getEReference(), 
				null, 
				"eOpposite", 
				null, 
				0, 
				1, 
				EReference.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEReference_EReferenceType(), 
				ecorePackage.getEClass(), 
				null, 
				"eReferenceType", 
				null, 
				1, 
				1, 
				EReference.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEReference_EKeys(), 
				ecorePackage.getEAttribute(), 
				null, 
				"eKeys", 
				null, 
				0, 
				-1, 
				EReference.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EStructuralFeatureEClass, EStructuralFeature.class, "EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEStructuralFeature_Changeable(), 
				ecorePackage.getEBoolean(), 
				"changeable", 
				"true", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_Volatile(), 
				ecorePackage.getEBoolean(), 
				"volatile_", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_Transient(), 
				ecorePackage.getEBoolean(), 
				"transient", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_DefaultValueLiteral(), 
				ecorePackage.getEString(), 
				"defaultValueLiteral", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_DefaultValue(), 
				ecorePackage.getEJavaObject(), 
				"defaultValue", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_Unsettable(), 
				ecorePackage.getEBoolean(), 
				"unsettable", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStructuralFeature_Derived(), 
				ecorePackage.getEBoolean(), 
				"derived", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getEStructuralFeature_EContainingClass(), 
				ecorePackage.getEClass(), 
				getEClass_EStructuralFeatures(), 
				"eContainingClass", 
				null, 
				0, 
				1, 
				EStructuralFeature.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(ETypedElementEClass, ETypedElement.class, "ETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getETypedElement_Ordered(), 
				ecorePackage.getEBoolean(), 
				"ordered", 
				"true", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getETypedElement_Unique(), 
				ecorePackage.getEBoolean(), 
				"unique", 
				"true", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getETypedElement_LowerBound(), 
				ecorePackage.getEInt(), 
				"lowerBound", 
				"0", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getETypedElement_UpperBound(), 
				ecorePackage.getEInt(), 
				"upperBound", 
				"1", 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getETypedElement_Many(), 
				ecorePackage.getEBoolean(), 
				"many", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getETypedElement_Required(), 
				ecorePackage.getEBoolean(), 
				"required", 
				"false", 
				0, 
				1, 
				EAttribute.class, 
				IS_TRANSIENT, 
				IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			
			initEReference(
				getETypedElement_EType(), 
				ecorePackage.getEClassifier(), 
				null, 
				"eType", 
				null, 
				0, 
				1, 
				ETypedElement.class, 
				!IS_TRANSIENT, 
				IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getETypedElement_EGenericType(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eGenericType", 
				null, 
				0, 
				1, 
				ETypedElement.class, 
				!IS_TRANSIENT, 
				IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(EStringToStringMapEntryEClass, EStringToStringMapEntry.class, "EStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			initEAttribute(getEStringToStringMapEntry_Key(), 
				ecorePackage.getEString(), 
				"key", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEAttribute(getEStringToStringMapEntry_Value(), 
				ecorePackage.getEString(), 
				"value", 
				null, 
				0, 
				1, 
				EAttribute.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_UNSETTABLE, 
				!IS_ID, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			
			initEClass(EGenericTypeEClass, EGenericType.class, "EGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getEGenericType_EUpperBound(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eUpperBound", 
				null, 
				0, 
				1, 
				EGenericType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEGenericType_ETypeArguments(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eTypeArguments", 
				null, 
				0, 
				-1, 
				EGenericType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEGenericType_ERawType(), 
				ecorePackage.getEClassifier(), 
				null, 
				"eRawType", 
				null, 
				1, 
				1, 
				EGenericType.class, 
				IS_TRANSIENT, 
				!IS_VOLATILE, 
				!IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEGenericType_ELowerBound(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eLowerBound", 
				null, 
				0, 
				1, 
				EGenericType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEGenericType_ETypeParameter(), 
				ecorePackage.getETypeParameter(), 
				null, 
				"eTypeParameter", 
				null, 
				0, 
				1, 
				EGenericType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			initEReference(
				getEGenericType_EClassifier(), 
				ecorePackage.getEClassifier(), 
				null, 
				"eClassifier", 
				null, 
				0, 
				1, 
				EGenericType.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				!IS_COMPOSITE, 
				IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
			initEClass(ETypeParameterEClass, ETypeParameter.class, "ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);						
			
			
			initEReference(
				getETypeParameter_EBounds(), 
				ecorePackage.getEGenericType(), 
				null, 
				"eBounds", 
				null, 
				0, 
				-1, 
				ETypeParameter.class, 
				!IS_TRANSIENT, 
				!IS_VOLATILE, 
				IS_CHANGEABLE, 
				IS_COMPOSITE, 
				!IS_RESOLVE_PROXIES, 
				!IS_UNSETTABLE, 
				IS_UNIQUE, 
				!IS_DERIVED, 
				IS_ORDERED);
			
        }
        
		
		private EClass EAttributeEClass = null;
		private EClass EAnnotationEClass = null;
		private EClass EClassEClass = null;
		private EClass EClassifierEClass = null;
		private EClass EDataTypeEClass = null;
		private EClass EEnumEClass = null;
		private EClass EEnumLiteralEClass = null;
		private EClass EFactoryEClass = null;
		private EClass EModelElementEClass = null;
		private EClass ENamedElementEClass = null;
		private EClass EObjectEClass = null;
		private EClass EOperationEClass = null;
		private EClass EPackageEClass = null;
		private EClass EParameterEClass = null;
		private EClass EReferenceEClass = null;
		private EClass EStructuralFeatureEClass = null;
		private EClass ETypedElementEClass = null;
		private EClass EStringToStringMapEntryEClass = null;
		private EClass EGenericTypeEClass = null;
		private EClass ETypeParameterEClass = null;
		
		
		
		private EDataType EBigDecimalEDataType = null;
		private EDataType EBigIntegerEDataType = null;
		private EDataType EBooleanEDataType = null;
		private EDataType EBooleanObjectEDataType = null;
		private EDataType EByteEDataType = null;
		private EDataType EByteArrayEDataType = null;
		private EDataType EByteObjectEDataType = null;
		private EDataType ECharEDataType = null;
		private EDataType ECharacterObjectEDataType = null;
		private EDataType EDateEDataType = null;
		private EDataType EDiagnosticChainEDataType = null;
		private EDataType EDoubleEDataType = null;
		private EDataType EDoubleObjectEDataType = null;
		private EDataType EEListEDataType = null;
		private EDataType EEnumeratorEDataType = null;
		private EDataType EFeatureMapEDataType = null;
		private EDataType EFeatureMapEntryEDataType = null;
		private EDataType EFloatEDataType = null;
		private EDataType EFloatObjectEDataType = null;
		private EDataType EIntEDataType = null;
		private EDataType EIntegerObjectEDataType = null;
		private EDataType EJavaClassEDataType = null;
		private EDataType EJavaObjectEDataType = null;
		private EDataType ELongEDataType = null;
		private EDataType ELongObjectEDataType = null;
		private EDataType EMapEDataType = null;
		private EDataType EResourceEDataType = null;
		private EDataType EResourceSetEDataType = null;
		private EDataType EShortEDataType = null;
		private EDataType EShortObjectEDataType = null;
		private EDataType EStringEDataType = null;
		private EDataType ETreeIteratorEDataType = null;
		private EDataType EInvocationTargetExceptionEDataType = null;
		
		
		public final static int EOBJECT = 10;
		public final static int EOBJECT_FEATURE_COUNT = 0;
		public final static int EOBJECT_OPERATION_COUNT = 15;
		
		
		public final static int EMODELELEMENT = 8;
		public final static int EMODELELEMENT_FEATURE_COUNT = 1;
		public final static int EMODELELEMENT_OPERATION_COUNT = 1;
		
		public final static int EMODELELEMENT_EANNOTATIONS = 0;
		
		public final static int ESTRINGTOSTRINGMAPENTRY = 48;
		public final static int ESTRINGTOSTRINGMAPENTRY_FEATURE_COUNT = 2;
		public final static int ESTRINGTOSTRINGMAPENTRY_OPERATION_COUNT = 0;
		
		public final static int ESTRINGTOSTRINGMAPENTRY_KEY = 0;
		public final static int ESTRINGTOSTRINGMAPENTRY_VALUE = 1;
		
		public final static int EGENERICTYPE = 50;
		public final static int EGENERICTYPE_FEATURE_COUNT = 6;
		public final static int EGENERICTYPE_OPERATION_COUNT = 1;
		
		public final static int EGENERICTYPE_EUPPERBOUND = 0;
		public final static int EGENERICTYPE_ETYPEARGUMENTS = 1;
		public final static int EGENERICTYPE_ERAWTYPE = 2;
		public final static int EGENERICTYPE_ELOWERBOUND = 3;
		public final static int EGENERICTYPE_ETYPEPARAMETER = 4;
		public final static int EGENERICTYPE_ECLASSIFIER = 5;
		
		public final static int EANNOTATION = 1;
		public final static int EANNOTATION_FEATURE_COUNT = EMODELELEMENT_FEATURE_COUNT + 5;
		public final static int EANNOTATION_OPERATION_COUNT = EMODELELEMENT_OPERATION_COUNT + 0;
		
		public final static int EANNOTATION_EANNOTATIONS = 0;
		public final static int EANNOTATION_SOURCE = 1;
		public final static int EANNOTATION_DETAILS = 2;
		public final static int EANNOTATION_EMODELELEMENT = 3;
		public final static int EANNOTATION_CONTENTS = 4;
		public final static int EANNOTATION_REFERENCES = 5;
		
		public final static int EFACTORY = 7;
		public final static int EFACTORY_FEATURE_COUNT = EMODELELEMENT_FEATURE_COUNT + 1;
		public final static int EFACTORY_OPERATION_COUNT = EMODELELEMENT_OPERATION_COUNT + 3;
		
		public final static int EFACTORY_EANNOTATIONS = 0;
		public final static int EFACTORY_EPACKAGE = 1;
		
		public final static int ENAMEDELEMENT = 9;
		public final static int ENAMEDELEMENT_FEATURE_COUNT = EMODELELEMENT_FEATURE_COUNT + 1;
		public final static int ENAMEDELEMENT_OPERATION_COUNT = EMODELELEMENT_OPERATION_COUNT + 0;
		
		public final static int ENAMEDELEMENT_EANNOTATIONS = 0;
		public final static int ENAMEDELEMENT_NAME = 1;
		
		public final static int ECLASSIFIER = 3;
		public final static int ECLASSIFIER_FEATURE_COUNT = ENAMEDELEMENT_FEATURE_COUNT + 6;
		public final static int ECLASSIFIER_OPERATION_COUNT = ENAMEDELEMENT_OPERATION_COUNT + 2;
		
		public final static int ECLASSIFIER_EANNOTATIONS = 0;
		public final static int ECLASSIFIER_NAME = 1;
		public final static int ECLASSIFIER_INSTANCECLASSNAME = 2;
		public final static int ECLASSIFIER_INSTANCECLASS = 3;
		public final static int ECLASSIFIER_DEFAULTVALUE = 4;
		public final static int ECLASSIFIER_INSTANCETYPENAME = 5;
		public final static int ECLASSIFIER_EPACKAGE = 6;
		public final static int ECLASSIFIER_ETYPEPARAMETERS = 7;
		
		public final static int EENUMLITERAL = 6;
		public final static int EENUMLITERAL_FEATURE_COUNT = ENAMEDELEMENT_FEATURE_COUNT + 4;
		public final static int EENUMLITERAL_OPERATION_COUNT = ENAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int EENUMLITERAL_EANNOTATIONS = 0;
		public final static int EENUMLITERAL_NAME = 1;
		public final static int EENUMLITERAL_VALUE = 2;
		public final static int EENUMLITERAL_INSTANCE = 3;
		public final static int EENUMLITERAL_LITERAL = 4;
		public final static int EENUMLITERAL_EENUM = 5;
		
		public final static int EPACKAGE = 12;
		public final static int EPACKAGE_FEATURE_COUNT = ENAMEDELEMENT_FEATURE_COUNT + 6;
		public final static int EPACKAGE_OPERATION_COUNT = ENAMEDELEMENT_OPERATION_COUNT + 1;
		
		public final static int EPACKAGE_EANNOTATIONS = 0;
		public final static int EPACKAGE_NAME = 1;
		public final static int EPACKAGE_NSURI = 2;
		public final static int EPACKAGE_NSPREFIX = 3;
		public final static int EPACKAGE_EFACTORYINSTANCE = 4;
		public final static int EPACKAGE_ECLASSIFIERS = 5;
		public final static int EPACKAGE_ESUBPACKAGES = 6;
		public final static int EPACKAGE_ESUPERPACKAGE = 7;
		
		public final static int ETYPEDELEMENT = 16;
		public final static int ETYPEDELEMENT_FEATURE_COUNT = ENAMEDELEMENT_FEATURE_COUNT + 8;
		public final static int ETYPEDELEMENT_OPERATION_COUNT = ENAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int ETYPEDELEMENT_EANNOTATIONS = 0;
		public final static int ETYPEDELEMENT_NAME = 1;
		public final static int ETYPEDELEMENT_ORDERED = 2;
		public final static int ETYPEDELEMENT_UNIQUE = 3;
		public final static int ETYPEDELEMENT_LOWERBOUND = 4;
		public final static int ETYPEDELEMENT_UPPERBOUND = 5;
		public final static int ETYPEDELEMENT_MANY = 6;
		public final static int ETYPEDELEMENT_REQUIRED = 7;
		public final static int ETYPEDELEMENT_ETYPE = 8;
		public final static int ETYPEDELEMENT_EGENERICTYPE = 9;
		
		public final static int ETYPEPARAMETER = 51;
		public final static int ETYPEPARAMETER_FEATURE_COUNT = ENAMEDELEMENT_FEATURE_COUNT + 1;
		public final static int ETYPEPARAMETER_OPERATION_COUNT = ENAMEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int ETYPEPARAMETER_EANNOTATIONS = 0;
		public final static int ETYPEPARAMETER_NAME = 1;
		public final static int ETYPEPARAMETER_EBOUNDS = 2;
		
		public final static int ECLASS = 2;
		public final static int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 16;
		public final static int ECLASS_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 10;
		
		public final static int ECLASS_EANNOTATIONS = 0;
		public final static int ECLASS_NAME = 1;
		public final static int ECLASS_INSTANCECLASSNAME = 2;
		public final static int ECLASS_INSTANCECLASS = 3;
		public final static int ECLASS_DEFAULTVALUE = 4;
		public final static int ECLASS_INSTANCETYPENAME = 5;
		public final static int ECLASS_EPACKAGE = 6;
		public final static int ECLASS_ETYPEPARAMETERS = 7;
		public final static int ECLASS_ABSTRACT = 8;
		public final static int ECLASS_INTERFACE = 9;
		public final static int ECLASS_ESUPERTYPES = 10;
		public final static int ECLASS_EOPERATIONS = 11;
		public final static int ECLASS_EALLATTRIBUTES = 12;
		public final static int ECLASS_EALLREFERENCES = 13;
		public final static int ECLASS_EREFERENCES = 14;
		public final static int ECLASS_EATTRIBUTES = 15;
		public final static int ECLASS_EALLCONTAINMENTS = 16;
		public final static int ECLASS_EALLOPERATIONS = 17;
		public final static int ECLASS_EALLSTRUCTURALFEATURES = 18;
		public final static int ECLASS_EALLSUPERTYPES = 19;
		public final static int ECLASS_EIDATTRIBUTE = 20;
		public final static int ECLASS_ESTRUCTURALFEATURES = 21;
		public final static int ECLASS_EGENERICSUPERTYPES = 22;
		public final static int ECLASS_EALLGENERICSUPERTYPES = 23;
		
		public final static int EDATATYPE = 4;
		public final static int EDATATYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;
		public final static int EDATATYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;
		
		public final static int EDATATYPE_EANNOTATIONS = 0;
		public final static int EDATATYPE_NAME = 1;
		public final static int EDATATYPE_INSTANCECLASSNAME = 2;
		public final static int EDATATYPE_INSTANCECLASS = 3;
		public final static int EDATATYPE_DEFAULTVALUE = 4;
		public final static int EDATATYPE_INSTANCETYPENAME = 5;
		public final static int EDATATYPE_EPACKAGE = 6;
		public final static int EDATATYPE_ETYPEPARAMETERS = 7;
		public final static int EDATATYPE_SERIALIZABLE = 8;
		
		public final static int EOPERATION = 11;
		public final static int EOPERATION_FEATURE_COUNT = ETYPEDELEMENT_FEATURE_COUNT + 5;
		public final static int EOPERATION_OPERATION_COUNT = ETYPEDELEMENT_OPERATION_COUNT + 2;
		
		public final static int EOPERATION_EANNOTATIONS = 0;
		public final static int EOPERATION_NAME = 1;
		public final static int EOPERATION_ORDERED = 2;
		public final static int EOPERATION_UNIQUE = 3;
		public final static int EOPERATION_LOWERBOUND = 4;
		public final static int EOPERATION_UPPERBOUND = 5;
		public final static int EOPERATION_MANY = 6;
		public final static int EOPERATION_REQUIRED = 7;
		public final static int EOPERATION_ETYPE = 8;
		public final static int EOPERATION_EGENERICTYPE = 9;
		public final static int EOPERATION_ECONTAININGCLASS = 10;
		public final static int EOPERATION_ETYPEPARAMETERS = 11;
		public final static int EOPERATION_EPARAMETERS = 12;
		public final static int EOPERATION_EEXCEPTIONS = 13;
		public final static int EOPERATION_EGENERICEXCEPTIONS = 14;
		
		public final static int EPARAMETER = 13;
		public final static int EPARAMETER_FEATURE_COUNT = ETYPEDELEMENT_FEATURE_COUNT + 1;
		public final static int EPARAMETER_OPERATION_COUNT = ETYPEDELEMENT_OPERATION_COUNT + 0;
		
		public final static int EPARAMETER_EANNOTATIONS = 0;
		public final static int EPARAMETER_NAME = 1;
		public final static int EPARAMETER_ORDERED = 2;
		public final static int EPARAMETER_UNIQUE = 3;
		public final static int EPARAMETER_LOWERBOUND = 4;
		public final static int EPARAMETER_UPPERBOUND = 5;
		public final static int EPARAMETER_MANY = 6;
		public final static int EPARAMETER_REQUIRED = 7;
		public final static int EPARAMETER_ETYPE = 8;
		public final static int EPARAMETER_EGENERICTYPE = 9;
		public final static int EPARAMETER_EOPERATION = 10;
		
		public final static int ESTRUCTURALFEATURE = 15;
		public final static int ESTRUCTURALFEATURE_FEATURE_COUNT = ETYPEDELEMENT_FEATURE_COUNT + 8;
		public final static int ESTRUCTURALFEATURE_OPERATION_COUNT = ETYPEDELEMENT_OPERATION_COUNT + 2;
		
		public final static int ESTRUCTURALFEATURE_EANNOTATIONS = 0;
		public final static int ESTRUCTURALFEATURE_NAME = 1;
		public final static int ESTRUCTURALFEATURE_ORDERED = 2;
		public final static int ESTRUCTURALFEATURE_UNIQUE = 3;
		public final static int ESTRUCTURALFEATURE_LOWERBOUND = 4;
		public final static int ESTRUCTURALFEATURE_UPPERBOUND = 5;
		public final static int ESTRUCTURALFEATURE_MANY = 6;
		public final static int ESTRUCTURALFEATURE_REQUIRED = 7;
		public final static int ESTRUCTURALFEATURE_ETYPE = 8;
		public final static int ESTRUCTURALFEATURE_EGENERICTYPE = 9;
		public final static int ESTRUCTURALFEATURE_CHANGEABLE = 10;
		public final static int ESTRUCTURALFEATURE_VOLATILE = 11;
		public final static int ESTRUCTURALFEATURE_TRANSIENT = 12;
		public final static int ESTRUCTURALFEATURE_DEFAULTVALUELITERAL = 13;
		public final static int ESTRUCTURALFEATURE_DEFAULTVALUE = 14;
		public final static int ESTRUCTURALFEATURE_UNSETTABLE = 15;
		public final static int ESTRUCTURALFEATURE_DERIVED = 16;
		public final static int ESTRUCTURALFEATURE_ECONTAININGCLASS = 17;
		
		public final static int EENUM = 5;
		public final static int EENUM_FEATURE_COUNT = EDATATYPE_FEATURE_COUNT + 1;
		public final static int EENUM_OPERATION_COUNT = EDATATYPE_OPERATION_COUNT + 3;
		
		public final static int EENUM_EANNOTATIONS = 0;
		public final static int EENUM_NAME = 1;
		public final static int EENUM_INSTANCECLASSNAME = 2;
		public final static int EENUM_INSTANCECLASS = 3;
		public final static int EENUM_DEFAULTVALUE = 4;
		public final static int EENUM_INSTANCETYPENAME = 5;
		public final static int EENUM_EPACKAGE = 6;
		public final static int EENUM_ETYPEPARAMETERS = 7;
		public final static int EENUM_SERIALIZABLE = 8;
		public final static int EENUM_ELITERALS = 9;
		
		public final static int EATTRIBUTE = 0;
		public final static int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURALFEATURE_FEATURE_COUNT + 2;
		public final static int EATTRIBUTE_OPERATION_COUNT = ESTRUCTURALFEATURE_OPERATION_COUNT + 0;
		
		public final static int EATTRIBUTE_EANNOTATIONS = 0;
		public final static int EATTRIBUTE_NAME = 1;
		public final static int EATTRIBUTE_ORDERED = 2;
		public final static int EATTRIBUTE_UNIQUE = 3;
		public final static int EATTRIBUTE_LOWERBOUND = 4;
		public final static int EATTRIBUTE_UPPERBOUND = 5;
		public final static int EATTRIBUTE_MANY = 6;
		public final static int EATTRIBUTE_REQUIRED = 7;
		public final static int EATTRIBUTE_ETYPE = 8;
		public final static int EATTRIBUTE_EGENERICTYPE = 9;
		public final static int EATTRIBUTE_CHANGEABLE = 10;
		public final static int EATTRIBUTE_VOLATILE = 11;
		public final static int EATTRIBUTE_TRANSIENT = 12;
		public final static int EATTRIBUTE_DEFAULTVALUELITERAL = 13;
		public final static int EATTRIBUTE_DEFAULTVALUE = 14;
		public final static int EATTRIBUTE_UNSETTABLE = 15;
		public final static int EATTRIBUTE_DERIVED = 16;
		public final static int EATTRIBUTE_ECONTAININGCLASS = 17;
		public final static int EATTRIBUTE_ID = 18;
		public final static int EATTRIBUTE_EATTRIBUTETYPE = 19;
		
		public final static int EREFERENCE = 14;
		public final static int EREFERENCE_FEATURE_COUNT = ESTRUCTURALFEATURE_FEATURE_COUNT + 6;
		public final static int EREFERENCE_OPERATION_COUNT = ESTRUCTURALFEATURE_OPERATION_COUNT + 0;
		
		public final static int EREFERENCE_EANNOTATIONS = 0;
		public final static int EREFERENCE_NAME = 1;
		public final static int EREFERENCE_ORDERED = 2;
		public final static int EREFERENCE_UNIQUE = 3;
		public final static int EREFERENCE_LOWERBOUND = 4;
		public final static int EREFERENCE_UPPERBOUND = 5;
		public final static int EREFERENCE_MANY = 6;
		public final static int EREFERENCE_REQUIRED = 7;
		public final static int EREFERENCE_ETYPE = 8;
		public final static int EREFERENCE_EGENERICTYPE = 9;
		public final static int EREFERENCE_CHANGEABLE = 10;
		public final static int EREFERENCE_VOLATILE = 11;
		public final static int EREFERENCE_TRANSIENT = 12;
		public final static int EREFERENCE_DEFAULTVALUELITERAL = 13;
		public final static int EREFERENCE_DEFAULTVALUE = 14;
		public final static int EREFERENCE_UNSETTABLE = 15;
		public final static int EREFERENCE_DERIVED = 16;
		public final static int EREFERENCE_ECONTAININGCLASS = 17;
		public final static int EREFERENCE_CONTAINMENT = 18;
		public final static int EREFERENCE_CONTAINER = 19;
		public final static int EREFERENCE_RESOLVEPROXIES = 20;
		public final static int EREFERENCE_EOPPOSITE = 21;
		public final static int EREFERENCE_EREFERENCETYPE = 22;
		public final static int EREFERENCE_EKEYS = 23;
		
		public final static int EBIGDECIMAL = 17;
		public final static int EBIGINTEGER = 18;
		public final static int EBOOLEAN = 19;
		public final static int EBOOLEANOBJECT = 20;
		public final static int EBYTE = 21;
		public final static int EBYTEARRAY = 22;
		public final static int EBYTEOBJECT = 23;
		public final static int ECHAR = 24;
		public final static int ECHARACTEROBJECT = 25;
		public final static int EDATE = 26;
		public final static int EDIAGNOSTICCHAIN = 27;
		public final static int EDOUBLE = 28;
		public final static int EDOUBLEOBJECT = 29;
		public final static int EELIST = 30;
		public final static int EENUMERATOR = 31;
		public final static int EFEATUREMAP = 32;
		public final static int EFEATUREMAPENTRY = 33;
		public final static int EFLOAT = 34;
		public final static int EFLOATOBJECT = 35;
		public final static int EINT = 36;
		public final static int EINTEGEROBJECT = 37;
		public final static int EJAVACLASS = 38;
		public final static int EJAVAOBJECT = 39;
		public final static int ELONG = 40;
		public final static int ELONGOBJECT = 41;
		public final static int EMAP = 42;
		public final static int ERESOURCE = 43;
		public final static int ERESOURCESET = 44;
		public final static int ESHORT = 45;
		public final static int ESHORTOBJECT = 46;
		public final static int ESTRING = 47;
		public final static int ETREEITERATOR = 49;
		public final static int EINVOCATIONTARGETEXCEPTION = 52;
		
		
		public EClass getEObject(){return EObjectEClass;}
		
		public EClass getEModelElement(){return EModelElementEClass;}
		
		public EReference getEModelElement_EAnnotations(){return (EReference)EModelElementEClass.getEStructuralFeatures().get(0);}
		public EClass getEStringToStringMapEntry(){return EStringToStringMapEntryEClass;}
		
		public EAttribute getEStringToStringMapEntry_Key(){return (EAttribute)EStringToStringMapEntryEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEStringToStringMapEntry_Value(){return (EAttribute)EStringToStringMapEntryEClass.getEStructuralFeatures().get(1);}
		public EClass getEGenericType(){return EGenericTypeEClass;}
		
		public EReference getEGenericType_EUpperBound(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(0);}
		public EReference getEGenericType_ETypeArguments(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(1);}
		public EReference getEGenericType_ERawType(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(2);}
		public EReference getEGenericType_ELowerBound(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(3);}
		public EReference getEGenericType_ETypeParameter(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(4);}
		public EReference getEGenericType_EClassifier(){return (EReference)EGenericTypeEClass.getEStructuralFeatures().get(5);}
		public EClass getEAnnotation(){return EAnnotationEClass;}
		
		public EAttribute getEAnnotation_Source(){return (EAttribute)EAnnotationEClass.getEStructuralFeatures().get(0);}
		public EReference getEAnnotation_Details(){return (EReference)EAnnotationEClass.getEStructuralFeatures().get(1);}
		public EReference getEAnnotation_EModelElement(){return (EReference)EAnnotationEClass.getEStructuralFeatures().get(2);}
		public EReference getEAnnotation_Contents(){return (EReference)EAnnotationEClass.getEStructuralFeatures().get(3);}
		public EReference getEAnnotation_References(){return (EReference)EAnnotationEClass.getEStructuralFeatures().get(4);}
		public EClass getEFactory(){return EFactoryEClass;}
		
		public EReference getEFactory_EPackage(){return (EReference)EFactoryEClass.getEStructuralFeatures().get(0);}
		public EClass getENamedElement(){return ENamedElementEClass;}
		
		public EAttribute getENamedElement_Name(){return (EAttribute)ENamedElementEClass.getEStructuralFeatures().get(0);}
		public EClass getEClassifier(){return EClassifierEClass;}
		
		public EAttribute getEClassifier_InstanceClassName(){return (EAttribute)EClassifierEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEClassifier_InstanceClass(){return (EAttribute)EClassifierEClass.getEStructuralFeatures().get(1);}
		public EAttribute getEClassifier_DefaultValue(){return (EAttribute)EClassifierEClass.getEStructuralFeatures().get(2);}
		public EAttribute getEClassifier_InstanceTypeName(){return (EAttribute)EClassifierEClass.getEStructuralFeatures().get(3);}
		public EReference getEClassifier_EPackage(){return (EReference)EClassifierEClass.getEStructuralFeatures().get(4);}
		public EReference getEClassifier_ETypeParameters(){return (EReference)EClassifierEClass.getEStructuralFeatures().get(5);}
		public EClass getEEnumLiteral(){return EEnumLiteralEClass;}
		
		public EAttribute getEEnumLiteral_Value(){return (EAttribute)EEnumLiteralEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEEnumLiteral_Instance(){return (EAttribute)EEnumLiteralEClass.getEStructuralFeatures().get(1);}
		public EAttribute getEEnumLiteral_Literal(){return (EAttribute)EEnumLiteralEClass.getEStructuralFeatures().get(2);}
		public EReference getEEnumLiteral_EEnum(){return (EReference)EEnumLiteralEClass.getEStructuralFeatures().get(3);}
		public EClass getEPackage(){return EPackageEClass;}
		
		public EAttribute getEPackage_NsURI(){return (EAttribute)EPackageEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEPackage_NsPrefix(){return (EAttribute)EPackageEClass.getEStructuralFeatures().get(1);}
		public EReference getEPackage_EFactoryInstance(){return (EReference)EPackageEClass.getEStructuralFeatures().get(2);}
		public EReference getEPackage_EClassifiers(){return (EReference)EPackageEClass.getEStructuralFeatures().get(3);}
		public EReference getEPackage_ESubpackages(){return (EReference)EPackageEClass.getEStructuralFeatures().get(4);}
		public EReference getEPackage_ESuperPackage(){return (EReference)EPackageEClass.getEStructuralFeatures().get(5);}
		public EClass getETypedElement(){return ETypedElementEClass;}
		
		public EAttribute getETypedElement_Ordered(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(0);}
		public EAttribute getETypedElement_Unique(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(1);}
		public EAttribute getETypedElement_LowerBound(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(2);}
		public EAttribute getETypedElement_UpperBound(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(3);}
		public EAttribute getETypedElement_Many(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(4);}
		public EAttribute getETypedElement_Required(){return (EAttribute)ETypedElementEClass.getEStructuralFeatures().get(5);}
		public EReference getETypedElement_EType(){return (EReference)ETypedElementEClass.getEStructuralFeatures().get(6);}
		public EReference getETypedElement_EGenericType(){return (EReference)ETypedElementEClass.getEStructuralFeatures().get(7);}
		public EClass getETypeParameter(){return ETypeParameterEClass;}
		
		public EReference getETypeParameter_EBounds(){return (EReference)ETypeParameterEClass.getEStructuralFeatures().get(0);}
		public EClass getEClass(){return EClassEClass;}
		
		public EAttribute getEClass_Abstract(){return (EAttribute)EClassEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEClass_Interface(){return (EAttribute)EClassEClass.getEStructuralFeatures().get(1);}
		public EReference getEClass_ESuperTypes(){return (EReference)EClassEClass.getEStructuralFeatures().get(2);}
		public EReference getEClass_EOperations(){return (EReference)EClassEClass.getEStructuralFeatures().get(3);}
		public EReference getEClass_EAllAttributes(){return (EReference)EClassEClass.getEStructuralFeatures().get(4);}
		public EReference getEClass_EAllReferences(){return (EReference)EClassEClass.getEStructuralFeatures().get(5);}
		public EReference getEClass_EReferences(){return (EReference)EClassEClass.getEStructuralFeatures().get(6);}
		public EReference getEClass_EAttributes(){return (EReference)EClassEClass.getEStructuralFeatures().get(7);}
		public EReference getEClass_EAllContainments(){return (EReference)EClassEClass.getEStructuralFeatures().get(8);}
		public EReference getEClass_EAllOperations(){return (EReference)EClassEClass.getEStructuralFeatures().get(9);}
		public EReference getEClass_EAllStructuralFeatures(){return (EReference)EClassEClass.getEStructuralFeatures().get(10);}
		public EReference getEClass_EAllSuperTypes(){return (EReference)EClassEClass.getEStructuralFeatures().get(11);}
		public EReference getEClass_EIDAttribute(){return (EReference)EClassEClass.getEStructuralFeatures().get(12);}
		public EReference getEClass_EStructuralFeatures(){return (EReference)EClassEClass.getEStructuralFeatures().get(13);}
		public EReference getEClass_EGenericSuperTypes(){return (EReference)EClassEClass.getEStructuralFeatures().get(14);}
		public EReference getEClass_EAllGenericSuperTypes(){return (EReference)EClassEClass.getEStructuralFeatures().get(15);}
		public EClass getEDataType(){return EDataTypeEClass;}
		
		public EAttribute getEDataType_Serializable(){return (EAttribute)EDataTypeEClass.getEStructuralFeatures().get(0);}
		public EClass getEOperation(){return EOperationEClass;}
		
		public EReference getEOperation_EContainingClass(){return (EReference)EOperationEClass.getEStructuralFeatures().get(0);}
		public EReference getEOperation_ETypeParameters(){return (EReference)EOperationEClass.getEStructuralFeatures().get(1);}
		public EReference getEOperation_EParameters(){return (EReference)EOperationEClass.getEStructuralFeatures().get(2);}
		public EReference getEOperation_EExceptions(){return (EReference)EOperationEClass.getEStructuralFeatures().get(3);}
		public EReference getEOperation_EGenericExceptions(){return (EReference)EOperationEClass.getEStructuralFeatures().get(4);}
		public EClass getEParameter(){return EParameterEClass;}
		
		public EReference getEParameter_EOperation(){return (EReference)EParameterEClass.getEStructuralFeatures().get(0);}
		public EClass getEStructuralFeature(){return EStructuralFeatureEClass;}
		
		public EAttribute getEStructuralFeature_Changeable(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEStructuralFeature_Volatile(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(1);}
		public EAttribute getEStructuralFeature_Transient(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(2);}
		public EAttribute getEStructuralFeature_DefaultValueLiteral(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(3);}
		public EAttribute getEStructuralFeature_DefaultValue(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(4);}
		public EAttribute getEStructuralFeature_Unsettable(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(5);}
		public EAttribute getEStructuralFeature_Derived(){return (EAttribute)EStructuralFeatureEClass.getEStructuralFeatures().get(6);}
		public EReference getEStructuralFeature_EContainingClass(){return (EReference)EStructuralFeatureEClass.getEStructuralFeatures().get(7);}
		public EClass getEEnum(){return EEnumEClass;}
		
		public EReference getEEnum_ELiterals(){return (EReference)EEnumEClass.getEStructuralFeatures().get(0);}
		public EClass getEAttribute(){return EAttributeEClass;}
		
		public EAttribute getEAttribute_ID(){return (EAttribute)EAttributeEClass.getEStructuralFeatures().get(0);}
		public EReference getEAttribute_EAttributeType(){return (EReference)EAttributeEClass.getEStructuralFeatures().get(1);}
		public EClass getEReference(){return EReferenceEClass;}
		
		public EAttribute getEReference_Containment(){return (EAttribute)EReferenceEClass.getEStructuralFeatures().get(0);}
		public EAttribute getEReference_Container(){return (EAttribute)EReferenceEClass.getEStructuralFeatures().get(1);}
		public EAttribute getEReference_ResolveProxies(){return (EAttribute)EReferenceEClass.getEStructuralFeatures().get(2);}
		public EReference getEReference_EOpposite(){return (EReference)EReferenceEClass.getEStructuralFeatures().get(3);}
		public EReference getEReference_EReferenceType(){return (EReference)EReferenceEClass.getEStructuralFeatures().get(4);}
		public EReference getEReference_EKeys(){return (EReference)EReferenceEClass.getEStructuralFeatures().get(5);}
		public EDataType getEBigDecimal(){return EBigDecimalEDataType;}
		public EDataType getEBigInteger(){return EBigIntegerEDataType;}
		public EDataType getEBoolean(){return EBooleanEDataType;}
		public EDataType getEBooleanObject(){return EBooleanObjectEDataType;}
		public EDataType getEByte(){return EByteEDataType;}
		public EDataType getEByteArray(){return EByteArrayEDataType;}
		public EDataType getEByteObject(){return EByteObjectEDataType;}
		public EDataType getEChar(){return ECharEDataType;}
		public EDataType getECharacterObject(){return ECharacterObjectEDataType;}
		public EDataType getEDate(){return EDateEDataType;}
		public EDataType getEDiagnosticChain(){return EDiagnosticChainEDataType;}
		public EDataType getEDouble(){return EDoubleEDataType;}
		public EDataType getEDoubleObject(){return EDoubleObjectEDataType;}
		public EDataType getEEList(){return EEListEDataType;}
		public EDataType getEEnumerator(){return EEnumeratorEDataType;}
		public EDataType getEFeatureMap(){return EFeatureMapEDataType;}
		public EDataType getEFeatureMapEntry(){return EFeatureMapEntryEDataType;}
		public EDataType getEFloat(){return EFloatEDataType;}
		public EDataType getEFloatObject(){return EFloatObjectEDataType;}
		public EDataType getEInt(){return EIntEDataType;}
		public EDataType getEIntegerObject(){return EIntegerObjectEDataType;}
		public EDataType getEJavaClass(){return EJavaClassEDataType;}
		public EDataType getEJavaObject(){return EJavaObjectEDataType;}
		public EDataType getELong(){return ELongEDataType;}
		public EDataType getELongObject(){return ELongObjectEDataType;}
		public EDataType getEMap(){return EMapEDataType;}
		public EDataType getEResource(){return EResourceEDataType;}
		public EDataType getEResourceSet(){return EResourceSetEDataType;}
		public EDataType getEShort(){return EShortEDataType;}
		public EDataType getEShortObject(){return EShortObjectEDataType;}
		public EDataType getEString(){return EStringEDataType;}
		public EDataType getETreeIterator(){return ETreeIteratorEDataType;}
		public EDataType getEInvocationTargetException(){return EInvocationTargetExceptionEDataType;}
		
		public static class Literals{
			public final static EClass EOBJECT = EcorePackageImpl.eINSTANCE.getEObject();
			
			
			public final static EClass EMODELELEMENT = EcorePackageImpl.eINSTANCE.getEModelElement();
			
			public final static EReference EMODELELEMENT_EANNOTATIONS = EcorePackageImpl.eINSTANCE.getEModelElement_EAnnotations();
			
			public final static EClass ESTRINGTOSTRINGMAPENTRY = EcorePackageImpl.eINSTANCE.getEStringToStringMapEntry();
			
			
			public final static EAttribute ESTRINGTOSTRINGMAPENTRY_KEY = EcorePackageImpl.eINSTANCE.getEStringToStringMapEntry_Key();
			public final static EAttribute ESTRINGTOSTRINGMAPENTRY_VALUE = EcorePackageImpl.eINSTANCE.getEStringToStringMapEntry_Value();
			public final static EClass EGENERICTYPE = EcorePackageImpl.eINSTANCE.getEGenericType();
			
			public final static EReference EGENERICTYPE_EUPPERBOUND = EcorePackageImpl.eINSTANCE.getEGenericType_EUpperBound();
			public final static EReference EGENERICTYPE_ETYPEARGUMENTS = EcorePackageImpl.eINSTANCE.getEGenericType_ETypeArguments();
			public final static EReference EGENERICTYPE_ERAWTYPE = EcorePackageImpl.eINSTANCE.getEGenericType_ERawType();
			public final static EReference EGENERICTYPE_ELOWERBOUND = EcorePackageImpl.eINSTANCE.getEGenericType_ELowerBound();
			public final static EReference EGENERICTYPE_ETYPEPARAMETER = EcorePackageImpl.eINSTANCE.getEGenericType_ETypeParameter();
			public final static EReference EGENERICTYPE_ECLASSIFIER = EcorePackageImpl.eINSTANCE.getEGenericType_EClassifier();
			
			public final static EClass EANNOTATION = EcorePackageImpl.eINSTANCE.getEAnnotation();
			
			public final static EReference EANNOTATION_DETAILS = EcorePackageImpl.eINSTANCE.getEAnnotation_Details();
			public final static EReference EANNOTATION_EMODELELEMENT = EcorePackageImpl.eINSTANCE.getEAnnotation_EModelElement();
			public final static EReference EANNOTATION_CONTENTS = EcorePackageImpl.eINSTANCE.getEAnnotation_Contents();
			public final static EReference EANNOTATION_REFERENCES = EcorePackageImpl.eINSTANCE.getEAnnotation_References();
			
			public final static EAttribute EANNOTATION_SOURCE = EcorePackageImpl.eINSTANCE.getEAnnotation_Source();
			public final static EClass EFACTORY = EcorePackageImpl.eINSTANCE.getEFactory();
			
			public final static EReference EFACTORY_EPACKAGE = EcorePackageImpl.eINSTANCE.getEFactory_EPackage();
			
			public final static EClass ENAMEDELEMENT = EcorePackageImpl.eINSTANCE.getENamedElement();
			
			
			public final static EAttribute ENAMEDELEMENT_NAME = EcorePackageImpl.eINSTANCE.getENamedElement_Name();
			public final static EClass ECLASSIFIER = EcorePackageImpl.eINSTANCE.getEClassifier();
			
			public final static EReference ECLASSIFIER_EPACKAGE = EcorePackageImpl.eINSTANCE.getEClassifier_EPackage();
			public final static EReference ECLASSIFIER_ETYPEPARAMETERS = EcorePackageImpl.eINSTANCE.getEClassifier_ETypeParameters();
			
			public final static EAttribute ECLASSIFIER_INSTANCECLASSNAME = EcorePackageImpl.eINSTANCE.getEClassifier_InstanceClassName();
			public final static EAttribute ECLASSIFIER_INSTANCECLASS = EcorePackageImpl.eINSTANCE.getEClassifier_InstanceClass();
			public final static EAttribute ECLASSIFIER_DEFAULTVALUE = EcorePackageImpl.eINSTANCE.getEClassifier_DefaultValue();
			public final static EAttribute ECLASSIFIER_INSTANCETYPENAME = EcorePackageImpl.eINSTANCE.getEClassifier_InstanceTypeName();
			public final static EClass EENUMLITERAL = EcorePackageImpl.eINSTANCE.getEEnumLiteral();
			
			public final static EReference EENUMLITERAL_EENUM = EcorePackageImpl.eINSTANCE.getEEnumLiteral_EEnum();
			
			public final static EAttribute EENUMLITERAL_VALUE = EcorePackageImpl.eINSTANCE.getEEnumLiteral_Value();
			public final static EAttribute EENUMLITERAL_INSTANCE = EcorePackageImpl.eINSTANCE.getEEnumLiteral_Instance();
			public final static EAttribute EENUMLITERAL_LITERAL = EcorePackageImpl.eINSTANCE.getEEnumLiteral_Literal();
			public final static EClass EPACKAGE = EcorePackageImpl.eINSTANCE.getEPackage();
			
			public final static EReference EPACKAGE_EFACTORYINSTANCE = EcorePackageImpl.eINSTANCE.getEPackage_EFactoryInstance();
			public final static EReference EPACKAGE_ECLASSIFIERS = EcorePackageImpl.eINSTANCE.getEPackage_EClassifiers();
			public final static EReference EPACKAGE_ESUBPACKAGES = EcorePackageImpl.eINSTANCE.getEPackage_ESubpackages();
			public final static EReference EPACKAGE_ESUPERPACKAGE = EcorePackageImpl.eINSTANCE.getEPackage_ESuperPackage();
			
			public final static EAttribute EPACKAGE_NSURI = EcorePackageImpl.eINSTANCE.getEPackage_NsURI();
			public final static EAttribute EPACKAGE_NSPREFIX = EcorePackageImpl.eINSTANCE.getEPackage_NsPrefix();
			public final static EClass ETYPEDELEMENT = EcorePackageImpl.eINSTANCE.getETypedElement();
			
			public final static EReference ETYPEDELEMENT_ETYPE = EcorePackageImpl.eINSTANCE.getETypedElement_EType();
			public final static EReference ETYPEDELEMENT_EGENERICTYPE = EcorePackageImpl.eINSTANCE.getETypedElement_EGenericType();
			
			public final static EAttribute ETYPEDELEMENT_ORDERED = EcorePackageImpl.eINSTANCE.getETypedElement_Ordered();
			public final static EAttribute ETYPEDELEMENT_UNIQUE = EcorePackageImpl.eINSTANCE.getETypedElement_Unique();
			public final static EAttribute ETYPEDELEMENT_LOWERBOUND = EcorePackageImpl.eINSTANCE.getETypedElement_LowerBound();
			public final static EAttribute ETYPEDELEMENT_UPPERBOUND = EcorePackageImpl.eINSTANCE.getETypedElement_UpperBound();
			public final static EAttribute ETYPEDELEMENT_MANY = EcorePackageImpl.eINSTANCE.getETypedElement_Many();
			public final static EAttribute ETYPEDELEMENT_REQUIRED = EcorePackageImpl.eINSTANCE.getETypedElement_Required();
			public final static EClass ETYPEPARAMETER = EcorePackageImpl.eINSTANCE.getETypeParameter();
			
			public final static EReference ETYPEPARAMETER_EBOUNDS = EcorePackageImpl.eINSTANCE.getETypeParameter_EBounds();
			
			public final static EClass ECLASS = EcorePackageImpl.eINSTANCE.getEClass();
			
			public final static EReference ECLASS_ESUPERTYPES = EcorePackageImpl.eINSTANCE.getEClass_ESuperTypes();
			public final static EReference ECLASS_EOPERATIONS = EcorePackageImpl.eINSTANCE.getEClass_EOperations();
			public final static EReference ECLASS_EALLATTRIBUTES = EcorePackageImpl.eINSTANCE.getEClass_EAllAttributes();
			public final static EReference ECLASS_EALLREFERENCES = EcorePackageImpl.eINSTANCE.getEClass_EAllReferences();
			public final static EReference ECLASS_EREFERENCES = EcorePackageImpl.eINSTANCE.getEClass_EReferences();
			public final static EReference ECLASS_EATTRIBUTES = EcorePackageImpl.eINSTANCE.getEClass_EAttributes();
			public final static EReference ECLASS_EALLCONTAINMENTS = EcorePackageImpl.eINSTANCE.getEClass_EAllContainments();
			public final static EReference ECLASS_EALLOPERATIONS = EcorePackageImpl.eINSTANCE.getEClass_EAllOperations();
			public final static EReference ECLASS_EALLSTRUCTURALFEATURES = EcorePackageImpl.eINSTANCE.getEClass_EAllStructuralFeatures();
			public final static EReference ECLASS_EALLSUPERTYPES = EcorePackageImpl.eINSTANCE.getEClass_EAllSuperTypes();
			public final static EReference ECLASS_EIDATTRIBUTE = EcorePackageImpl.eINSTANCE.getEClass_EIDAttribute();
			public final static EReference ECLASS_ESTRUCTURALFEATURES = EcorePackageImpl.eINSTANCE.getEClass_EStructuralFeatures();
			public final static EReference ECLASS_EGENERICSUPERTYPES = EcorePackageImpl.eINSTANCE.getEClass_EGenericSuperTypes();
			public final static EReference ECLASS_EALLGENERICSUPERTYPES = EcorePackageImpl.eINSTANCE.getEClass_EAllGenericSuperTypes();
			
			public final static EAttribute ECLASS_ABSTRACT = EcorePackageImpl.eINSTANCE.getEClass_Abstract();
			public final static EAttribute ECLASS_INTERFACE = EcorePackageImpl.eINSTANCE.getEClass_Interface();
			public final static EClass EDATATYPE = EcorePackageImpl.eINSTANCE.getEDataType();
			
			
			public final static EAttribute EDATATYPE_SERIALIZABLE = EcorePackageImpl.eINSTANCE.getEDataType_Serializable();
			public final static EClass EOPERATION = EcorePackageImpl.eINSTANCE.getEOperation();
			
			public final static EReference EOPERATION_ECONTAININGCLASS = EcorePackageImpl.eINSTANCE.getEOperation_EContainingClass();
			public final static EReference EOPERATION_ETYPEPARAMETERS = EcorePackageImpl.eINSTANCE.getEOperation_ETypeParameters();
			public final static EReference EOPERATION_EPARAMETERS = EcorePackageImpl.eINSTANCE.getEOperation_EParameters();
			public final static EReference EOPERATION_EEXCEPTIONS = EcorePackageImpl.eINSTANCE.getEOperation_EExceptions();
			public final static EReference EOPERATION_EGENERICEXCEPTIONS = EcorePackageImpl.eINSTANCE.getEOperation_EGenericExceptions();
			
			public final static EClass EPARAMETER = EcorePackageImpl.eINSTANCE.getEParameter();
			
			public final static EReference EPARAMETER_EOPERATION = EcorePackageImpl.eINSTANCE.getEParameter_EOperation();
			
			public final static EClass ESTRUCTURALFEATURE = EcorePackageImpl.eINSTANCE.getEStructuralFeature();
			
			public final static EReference ESTRUCTURALFEATURE_ECONTAININGCLASS = EcorePackageImpl.eINSTANCE.getEStructuralFeature_EContainingClass();
			
			public final static EAttribute ESTRUCTURALFEATURE_CHANGEABLE = EcorePackageImpl.eINSTANCE.getEStructuralFeature_Changeable();
			public final static EAttribute ESTRUCTURALFEATURE_VOLATILE = EcorePackageImpl.eINSTANCE.getEStructuralFeature_Volatile();
			public final static EAttribute ESTRUCTURALFEATURE_TRANSIENT = EcorePackageImpl.eINSTANCE.getEStructuralFeature_Transient();
			public final static EAttribute ESTRUCTURALFEATURE_DEFAULTVALUELITERAL = EcorePackageImpl.eINSTANCE.getEStructuralFeature_DefaultValueLiteral();
			public final static EAttribute ESTRUCTURALFEATURE_DEFAULTVALUE = EcorePackageImpl.eINSTANCE.getEStructuralFeature_DefaultValue();
			public final static EAttribute ESTRUCTURALFEATURE_UNSETTABLE = EcorePackageImpl.eINSTANCE.getEStructuralFeature_Unsettable();
			public final static EAttribute ESTRUCTURALFEATURE_DERIVED = EcorePackageImpl.eINSTANCE.getEStructuralFeature_Derived();
			public final static EClass EENUM = EcorePackageImpl.eINSTANCE.getEEnum();
			
			public final static EReference EENUM_ELITERALS = EcorePackageImpl.eINSTANCE.getEEnum_ELiterals();
			
			public final static EClass EATTRIBUTE = EcorePackageImpl.eINSTANCE.getEAttribute();
			
			public final static EReference EATTRIBUTE_EATTRIBUTETYPE = EcorePackageImpl.eINSTANCE.getEAttribute_EAttributeType();
			
			public final static EAttribute EATTRIBUTE_ID = EcorePackageImpl.eINSTANCE.getEAttribute_ID();
			public final static EClass EREFERENCE = EcorePackageImpl.eINSTANCE.getEReference();
			
			public final static EReference EREFERENCE_EOPPOSITE = EcorePackageImpl.eINSTANCE.getEReference_EOpposite();
			public final static EReference EREFERENCE_EREFERENCETYPE = EcorePackageImpl.eINSTANCE.getEReference_EReferenceType();
			public final static EReference EREFERENCE_EKEYS = EcorePackageImpl.eINSTANCE.getEReference_EKeys();
			
			public final static EAttribute EREFERENCE_CONTAINMENT = EcorePackageImpl.eINSTANCE.getEReference_Containment();
			public final static EAttribute EREFERENCE_CONTAINER = EcorePackageImpl.eINSTANCE.getEReference_Container();
			public final static EAttribute EREFERENCE_RESOLVEPROXIES = EcorePackageImpl.eINSTANCE.getEReference_ResolveProxies();
			public final static EDataType EBIGDECIMAL = EcorePackageImpl.eINSTANCE.getEBigDecimal();
			public final static EDataType EBIGINTEGER = EcorePackageImpl.eINSTANCE.getEBigInteger();
			public final static EDataType EBOOLEAN = EcorePackageImpl.eINSTANCE.getEBoolean();
			public final static EDataType EBOOLEANOBJECT = EcorePackageImpl.eINSTANCE.getEBooleanObject();
			public final static EDataType EBYTE = EcorePackageImpl.eINSTANCE.getEByte();
			public final static EDataType EBYTEARRAY = EcorePackageImpl.eINSTANCE.getEByteArray();
			public final static EDataType EBYTEOBJECT = EcorePackageImpl.eINSTANCE.getEByteObject();
			public final static EDataType ECHAR = EcorePackageImpl.eINSTANCE.getEChar();
			public final static EDataType ECHARACTEROBJECT = EcorePackageImpl.eINSTANCE.getECharacterObject();
			public final static EDataType EDATE = EcorePackageImpl.eINSTANCE.getEDate();
			public final static EDataType EDIAGNOSTICCHAIN = EcorePackageImpl.eINSTANCE.getEDiagnosticChain();
			public final static EDataType EDOUBLE = EcorePackageImpl.eINSTANCE.getEDouble();
			public final static EDataType EDOUBLEOBJECT = EcorePackageImpl.eINSTANCE.getEDoubleObject();
			public final static EDataType EELIST = EcorePackageImpl.eINSTANCE.getEEList();
			public final static EDataType EENUMERATOR = EcorePackageImpl.eINSTANCE.getEEnumerator();
			public final static EDataType EFEATUREMAP = EcorePackageImpl.eINSTANCE.getEFeatureMap();
			public final static EDataType EFEATUREMAPENTRY = EcorePackageImpl.eINSTANCE.getEFeatureMapEntry();
			public final static EDataType EFLOAT = EcorePackageImpl.eINSTANCE.getEFloat();
			public final static EDataType EFLOATOBJECT = EcorePackageImpl.eINSTANCE.getEFloatObject();
			public final static EDataType EINT = EcorePackageImpl.eINSTANCE.getEInt();
			public final static EDataType EINTEGEROBJECT = EcorePackageImpl.eINSTANCE.getEIntegerObject();
			public final static EDataType EJAVACLASS = EcorePackageImpl.eINSTANCE.getEJavaClass();
			public final static EDataType EJAVAOBJECT = EcorePackageImpl.eINSTANCE.getEJavaObject();
			public final static EDataType ELONG = EcorePackageImpl.eINSTANCE.getELong();
			public final static EDataType ELONGOBJECT = EcorePackageImpl.eINSTANCE.getELongObject();
			public final static EDataType EMAP = EcorePackageImpl.eINSTANCE.getEMap();
			public final static EDataType ERESOURCE = EcorePackageImpl.eINSTANCE.getEResource();
			public final static EDataType ERESOURCESET = EcorePackageImpl.eINSTANCE.getEResourceSet();
			public final static EDataType ESHORT = EcorePackageImpl.eINSTANCE.getEShort();
			public final static EDataType ESHORTOBJECT = EcorePackageImpl.eINSTANCE.getEShortObject();
			public final static EDataType ESTRING = EcorePackageImpl.eINSTANCE.getEString();
			public final static EDataType ETREEITERATOR = EcorePackageImpl.eINSTANCE.getETreeIterator();
			public final static EDataType EINVOCATIONTARGETEXCEPTION = EcorePackageImpl.eINSTANCE.getEInvocationTargetException();
		}
 
}

