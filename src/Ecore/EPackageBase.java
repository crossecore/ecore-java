package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EPackageBase 
extends ENamedElementImpl implements org.eclipse.emf.ecore.EPackage
{
	private String _nsURI = "";
	public String getNsURI()
	{
		return _nsURI;
	}
	public void setNsURI(String value){
		
		_nsURI = value;
	}
	
	private String _nsPrefix = "";
	public String getNsPrefix()
	{
		return _nsPrefix;
	}
	public void setNsPrefix(String value){
		
		_nsPrefix = value;
	}
	
	private EFactory _eFactoryInstance;
	public EFactory getEFactoryInstance()
	{
		
			return _eFactoryInstance;
		
		
	}
	public void setEFactoryInstance(EFactory value){
		if (value != _eFactoryInstance) {
			NotificationChain msgs = null;
			if (_eFactoryInstance != null){
				msgs = ((InternalEObject)_eFactoryInstance).eInverseRemove(this, EcorePackageImpl.EFACTORY_EPACKAGE, EPackage.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EcorePackageImpl.EFACTORY_EPACKAGE, EPackage.class, msgs);
			}
			msgs = basicSetEFactoryInstance(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE , value, value));
		}
	}
	private Ocllib.OrderedSet<EPackage> _eSubpackages;
	
	public Ocllib.OrderedSet<EPackage> getESubpackages()
	{
		if(_eSubpackages==null){
			_eSubpackages = new Ocllib.OrderedSet<EPackage>(this, EcorePackageImpl.EPACKAGE_ESUBPACKAGES, EcorePackageImpl.EPACKAGE_ESUPERPACKAGE);
		}
		return _eSubpackages;
	
	}
	public EPackage getESuperPackage()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.EPACKAGE_ESUPERPACKAGE) return null;
			return (EPackage)eInternalContainer();
		
		
	}
	private Ocllib.OrderedSet<EClassifier> _eClassifiers;
	
	public Ocllib.OrderedSet<EClassifier> getEClassifiers()
	{
		if(_eClassifiers==null){
			_eClassifiers = new Ocllib.OrderedSet<EClassifier>(this, EcorePackageImpl.EPACKAGE_ECLASSIFIERS, EcorePackageImpl.ECLASSIFIER_EPACKAGE);
		}
		return _eClassifiers;
	
	}
	public EClassifier getEClassifier(String name
	)
	{
	    return null;
	}

	/*
	public static Set<EPackage> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EPACKAGE;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE:
				if (_eFactoryInstance != null){
					msgs = ((InternalEObject)_eFactoryInstance).eInverseRemove(this, EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE, EFactory.class, msgs);
				}
				return basicSetEFactoryInstance((EFactory)otherEnd, msgs);
			case EcorePackageImpl.EPACKAGE_ESUBPACKAGES:
				return getESubpackages().basicAdd((EPackage)otherEnd, msgs);
			case EcorePackageImpl.EPACKAGE_ESUPERPACKAGE:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetESuperPackage((EPackage)otherEnd, msgs);
			case EcorePackageImpl.EPACKAGE_ECLASSIFIERS:
				return getEClassifiers().basicAdd((EClassifier)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE:
				return basicSetEFactoryInstance(null, msgs);
			case EcorePackageImpl.EPACKAGE_ESUBPACKAGES:
				return getESubpackages().basicRemove((EPackage)otherEnd, msgs);
			case EcorePackageImpl.EPACKAGE_ESUPERPACKAGE:
				return basicSetESuperPackage(null, msgs);
			case EcorePackageImpl.EPACKAGE_ECLASSIFIERS:
				return getEClassifiers().basicRemove((EClassifier)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEFactoryInstance(EFactory newobj, NotificationChain msgs) {
		EFactory oldobj = _eFactoryInstance;
		_eFactoryInstance = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetESuperPackage(EPackage newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.EPACKAGE_ESUPERPACKAGE, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EPACKAGE_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EPACKAGE_NAME:
				return getName();
			case EcorePackageImpl.EPACKAGE_NSURI:
				return getNsURI();
			case EcorePackageImpl.EPACKAGE_NSPREFIX:
				return getNsPrefix();
			case EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE:
				return getEFactoryInstance();
			case EcorePackageImpl.EPACKAGE_ECLASSIFIERS:
				return getEClassifiers();
			case EcorePackageImpl.EPACKAGE_ESUBPACKAGES:
				return getESubpackages();
			case EcorePackageImpl.EPACKAGE_ESUPERPACKAGE:
				return getESuperPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EPACKAGE_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_NSURI:
				setNsURI((String) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_NSPREFIX:
				setNsPrefix((String) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE:
				setEFactoryInstance((EFactory) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_ECLASSIFIERS:
				getEClassifiers().clear();
				getEClassifiers().addAll((java.util.Collection<? extends EClassifier>) newValue);
				return;
			case EcorePackageImpl.EPACKAGE_ESUBPACKAGES:
				getESubpackages().clear();
				getESubpackages().addAll((java.util.Collection<? extends EPackage>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
