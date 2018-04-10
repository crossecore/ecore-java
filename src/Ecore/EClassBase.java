package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EClassBase 
extends EClassifierImpl implements org.eclipse.emf.ecore.EClass
{
	private boolean _abstract = false;
	public boolean getAbstract()
	{
		return _abstract;
	}
	public void setAbstract(boolean value){
		
		_abstract = value;
	}
	
	@Override
	public boolean isAbstract() {
		//return this.eGet();
		
		return false;
	}
	private boolean _interface = false;
	public boolean getInterface()
	{
		return _interface;
	}
	public void setInterface(boolean value){
		
		_interface = value;
	}
	
	@Override
	public boolean isInterface() {
		//return this.eGet();
		
		return false;
	}
	
	public Ocllib.OrderedSet<EReference> getEReferences()
	{
		//TODO implement derivation
		return null;
	
	}
	
	public Ocllib.OrderedSet<EGenericType> getEAllGenericSuperTypes()
	{
		//TODO implement derivation
		return null;
	
	}
	
	public Ocllib.OrderedSet<EAttribute> getEAttributes()
	{
		//TODO implement derivation
		return null;
	
	}
	private Ocllib.OrderedSet<EClass> _eSuperTypes;
	
	public Ocllib.OrderedSet<EClass> getESuperTypes()
	{
		if(_eSuperTypes==null){
			_eSuperTypes = new Ocllib.OrderedSet<EClass>(this, EcorePackageImpl.ECLASS_ESUPERTYPES, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ECLASS_ESUPERTYPES);
		}
		return _eSuperTypes;
	
	}
	
	public Ocllib.OrderedSet<EReference> getEAllContainments()
	{
		//TODO implement derivation
		return null;
	
	}
	
	public Ocllib.OrderedSet<EStructuralFeature> getEAllStructuralFeatures()
	{
		//TODO implement derivation
		return null;
	
	}
	private Ocllib.OrderedSet<EStructuralFeature> _eStructuralFeatures;
	
	public Ocllib.OrderedSet<EStructuralFeature> getEStructuralFeatures()
	{
		if(_eStructuralFeatures==null){
			_eStructuralFeatures = new Ocllib.OrderedSet<EStructuralFeature>(this, EcorePackageImpl.ECLASS_ESTRUCTURALFEATURES, EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS);
		}
		return _eStructuralFeatures;
	
	}
	
	public Ocllib.OrderedSet<EClass> getEAllSuperTypes()
	{
		//TODO implement derivation
		return null;
	
	}
	
	public Ocllib.OrderedSet<EOperation> getEAllOperations()
	{
		//TODO implement derivation
		return null;
	
	}
	private Ocllib.OrderedSet<EOperation> _eOperations;
	
	public Ocllib.OrderedSet<EOperation> getEOperations()
	{
		if(_eOperations==null){
			_eOperations = new Ocllib.OrderedSet<EOperation>(this, EcorePackageImpl.ECLASS_EOPERATIONS, EcorePackageImpl.EOPERATION_ECONTAININGCLASS);
		}
		return _eOperations;
	
	}
	
	public Ocllib.OrderedSet<EReference> getEAllReferences()
	{
		//TODO implement derivation
		return null;
	
	}
	public EAttribute getEIDAttribute()
	{
		
			//TODO implement derivation
			return null;
		
		
	}
	private Ocllib.OrderedSet<EGenericType> _eGenericSuperTypes;
	
	public Ocllib.OrderedSet<EGenericType> getEGenericSuperTypes()
	{
		if(_eGenericSuperTypes==null){
			_eGenericSuperTypes = new Ocllib.OrderedSet<EGenericType>(this, EcorePackageImpl.ECLASS_EGENERICSUPERTYPES, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ECLASS_EGENERICSUPERTYPES);
		}
		return _eGenericSuperTypes;
	
	}
	
	public Ocllib.OrderedSet<EAttribute> getEAllAttributes()
	{
		//TODO implement derivation
		return null;
	
	}
	public EOperation getEOperation(int operationID
	)
	{
	    return null;
	}
	public EStructuralFeature getEStructuralFeature(String featureName
	)
	{
	    return null;
	}
	public EGenericType getFeatureType(EStructuralFeature feature
	)
	{
	    return null;
	}
	public int getOperationID(EOperation operation
	)
	{
	    return 0;
	}
	public int getOperationCount()
	{
	    return 0;
	}
	public boolean isSuperTypeOf(EClass someClass
	)
	{
	    return false;
	}
	public EStructuralFeature getEStructuralFeature(int featureID
	)
	{
	    return null;
	}
	public int getFeatureID(EStructuralFeature feature
	)
	{
	    return 0;
	}
	public EOperation getOverride(EOperation operation
	)
	{
	    return null;
	}
	public int getFeatureCount()
	{
	    return 0;
	}

	/*
	public static Set<EClass> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ECLASS;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ECLASS_EOPERATIONS:
				return getEOperations().basicAdd((EOperation)otherEnd, msgs);
			case EcorePackageImpl.ECLASS_ESTRUCTURALFEATURES:
				return getEStructuralFeatures().basicAdd((EStructuralFeature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ECLASS_EOPERATIONS:
				return getEOperations().basicRemove((EOperation)otherEnd, msgs);
			case EcorePackageImpl.ECLASS_ESTRUCTURALFEATURES:
				return getEStructuralFeatures().basicRemove((EStructuralFeature)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ECLASS_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ECLASS_NAME:
				return getName();
			case EcorePackageImpl.ECLASS_INSTANCECLASSNAME:
				return getInstanceClassName();
			case EcorePackageImpl.ECLASS_INSTANCECLASS:
				return getInstanceClass();
			case EcorePackageImpl.ECLASS_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.ECLASS_INSTANCETYPENAME:
				return getInstanceTypeName();
			case EcorePackageImpl.ECLASS_EPACKAGE:
				return getEPackage();
			case EcorePackageImpl.ECLASS_ETYPEPARAMETERS:
				return getETypeParameters();
			case EcorePackageImpl.ECLASS_ABSTRACT:
				return getAbstract();
			case EcorePackageImpl.ECLASS_INTERFACE:
				return getInterface();
			case EcorePackageImpl.ECLASS_ESUPERTYPES:
				return getESuperTypes();
			case EcorePackageImpl.ECLASS_EOPERATIONS:
				return getEOperations();
			case EcorePackageImpl.ECLASS_EALLATTRIBUTES:
				return getEAllAttributes();
			case EcorePackageImpl.ECLASS_EALLREFERENCES:
				return getEAllReferences();
			case EcorePackageImpl.ECLASS_EREFERENCES:
				return getEReferences();
			case EcorePackageImpl.ECLASS_EATTRIBUTES:
				return getEAttributes();
			case EcorePackageImpl.ECLASS_EALLCONTAINMENTS:
				return getEAllContainments();
			case EcorePackageImpl.ECLASS_EALLOPERATIONS:
				return getEAllOperations();
			case EcorePackageImpl.ECLASS_EALLSTRUCTURALFEATURES:
				return getEAllStructuralFeatures();
			case EcorePackageImpl.ECLASS_EALLSUPERTYPES:
				return getEAllSuperTypes();
			case EcorePackageImpl.ECLASS_EIDATTRIBUTE:
				return getEIDAttribute();
			case EcorePackageImpl.ECLASS_ESTRUCTURALFEATURES:
				return getEStructuralFeatures();
			case EcorePackageImpl.ECLASS_EGENERICSUPERTYPES:
				return getEGenericSuperTypes();
			case EcorePackageImpl.ECLASS_EALLGENERICSUPERTYPES:
				return getEAllGenericSuperTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ECLASS_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ECLASS_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.ECLASS_INSTANCECLASSNAME:
				setInstanceClassName((String) newValue);
				return;
			case EcorePackageImpl.ECLASS_INSTANCETYPENAME:
				setInstanceTypeName((String) newValue);
				return;
			case EcorePackageImpl.ECLASS_ETYPEPARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((java.util.Collection<? extends ETypeParameter>) newValue);
				return;
			case EcorePackageImpl.ECLASS_ABSTRACT:
				setAbstract((boolean) newValue);
				return;
			case EcorePackageImpl.ECLASS_INTERFACE:
				setInterface((boolean) newValue);
				return;
			case EcorePackageImpl.ECLASS_ESUPERTYPES:
				getESuperTypes().clear();
				getESuperTypes().addAll((java.util.Collection<? extends EClass>) newValue);
				return;
			case EcorePackageImpl.ECLASS_EOPERATIONS:
				getEOperations().clear();
				getEOperations().addAll((java.util.Collection<? extends EOperation>) newValue);
				return;
			case EcorePackageImpl.ECLASS_ESTRUCTURALFEATURES:
				getEStructuralFeatures().clear();
				getEStructuralFeatures().addAll((java.util.Collection<? extends EStructuralFeature>) newValue);
				return;
			case EcorePackageImpl.ECLASS_EGENERICSUPERTYPES:
				getEGenericSuperTypes().clear();
				getEGenericSuperTypes().addAll((java.util.Collection<? extends EGenericType>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
