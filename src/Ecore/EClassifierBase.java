package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EClassifierBase 
extends ENamedElementImpl implements org.eclipse.emf.ecore.EClassifier
{
	public Class getInstanceClass()
	{
		//TODO implement derivation
		return null;
	}
	
	public Object getDefaultValue()
	{
		//TODO implement derivation
		return null;
	}
	
	private String _instanceClassName = "";
	public String getInstanceClassName()
	{
		return _instanceClassName;
	}
	public void setInstanceClassName(String value){
		
		_instanceClassName = value;
	}
	
	private String _instanceTypeName = "";
	public String getInstanceTypeName()
	{
		return _instanceTypeName;
	}
	public void setInstanceTypeName(String value){
		
		_instanceTypeName = value;
	}
	
	public EPackage getEPackage()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.ECLASSIFIER_EPACKAGE) return null;
			return (EPackage)eInternalContainer();
		
		
	}
	private Ocllib.OrderedSet<ETypeParameter> _eTypeParameters;
	
	public Ocllib.OrderedSet<ETypeParameter> getETypeParameters()
	{
		if(_eTypeParameters==null){
			_eTypeParameters = new Ocllib.OrderedSet<ETypeParameter>(this, EcorePackageImpl.ECLASSIFIER_ETYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ECLASSIFIER_ETYPEPARAMETERS);
		}
		return _eTypeParameters;
	
	}
	public int getClassifierID()
	{
	    return 0;
	}
	public boolean isInstance(Object object_
	)
	{
	    return false;
	}

	/*
	public static Set<EClassifier> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ECLASSIFIER;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ECLASSIFIER_EPACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEPackage((EPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ECLASSIFIER_EPACKAGE:
				return basicSetEPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEPackage(EPackage newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.ECLASSIFIER_EPACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ECLASSIFIER_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ECLASSIFIER_NAME:
				return getName();
			case EcorePackageImpl.ECLASSIFIER_INSTANCECLASSNAME:
				return getInstanceClassName();
			case EcorePackageImpl.ECLASSIFIER_INSTANCECLASS:
				return getInstanceClass();
			case EcorePackageImpl.ECLASSIFIER_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.ECLASSIFIER_INSTANCETYPENAME:
				return getInstanceTypeName();
			case EcorePackageImpl.ECLASSIFIER_EPACKAGE:
				return getEPackage();
			case EcorePackageImpl.ECLASSIFIER_ETYPEPARAMETERS:
				return getETypeParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ECLASSIFIER_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ECLASSIFIER_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.ECLASSIFIER_INSTANCECLASSNAME:
				setInstanceClassName((String) newValue);
				return;
			case EcorePackageImpl.ECLASSIFIER_INSTANCETYPENAME:
				setInstanceTypeName((String) newValue);
				return;
			case EcorePackageImpl.ECLASSIFIER_ETYPEPARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((java.util.Collection<? extends ETypeParameter>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
