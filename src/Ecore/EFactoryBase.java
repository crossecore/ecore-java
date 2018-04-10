package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EFactoryBase 
extends EModelElementImpl implements org.eclipse.emf.ecore.EFactory
{
	private EPackage _ePackage;
	public EPackage getEPackage()
	{
		
			return _ePackage;
		
		
	}
	public void setEPackage(EPackage value){
		if (value != _ePackage) {
			NotificationChain msgs = null;
			if (_ePackage != null){
				msgs = ((InternalEObject)_ePackage).eInverseRemove(this, EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE, EFactory.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EcorePackageImpl.EPACKAGE_EFACTORYINSTANCE, EFactory.class, msgs);
			}
			msgs = basicSetEPackage(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EFACTORY_EPACKAGE , value, value));
		}
	}
	public String convertToString(EDataType eDataType,
	Object instanceValue
	)
	{
	    return "";
	}
	public Object createFromString(EDataType eDataType,
	String literalValue
	)
	{
	    return null;
	}
	public EObject create(EClass eClass
	)
	{
	    return null;
	}

	/*
	public static Set<EFactory> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EFACTORY;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EFACTORY_EPACKAGE:
				if (_ePackage != null){
					msgs = ((InternalEObject)_ePackage).eInverseRemove(this, EcorePackageImpl.EFACTORY_EPACKAGE, EPackage.class, msgs);
				}
				return basicSetEPackage((EPackage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EFACTORY_EPACKAGE:
				return basicSetEPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEPackage(EPackage newobj, NotificationChain msgs) {
		EPackage oldobj = _ePackage;
		_ePackage = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EFACTORY_EPACKAGE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EFACTORY_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EFACTORY_EPACKAGE:
				return getEPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EFACTORY_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EFACTORY_EPACKAGE:
				setEPackage((EPackage) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
