package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EGenericTypeBase 
extends org.eclipse.emf.ecore.impl.BasicEObjectImpl implements org.eclipse.emf.ecore.EGenericType
{
	public EClassifier getERawType()
	{
		
			//TODO implement derivation
			return null;
		
		
	}
	private EClassifier _eClassifier;
	public EClassifier getEClassifier()
	{
		
			return _eClassifier;
		
		
	}
	public void setEClassifier(EClassifier value){
		EClassifier oldvalue = _eClassifier;
		_eClassifier = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EGENERICTYPE_ECLASSIFIER , oldvalue, value));
		}
	}
	private EGenericType _eUpperBound;
	public EGenericType getEUpperBound()
	{
		
			return _eUpperBound;
		
		
	}
	public void setEUpperBound(EGenericType value){
		if (value != _eUpperBound) {
			NotificationChain msgs = null;
			if (_eUpperBound != null){
				msgs = ((InternalEObject)_eUpperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EGENERICTYPE_EUPPERBOUND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EGENERICTYPE_EUPPERBOUND, null, msgs);
			}
			msgs = basicSetEUpperBound(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EGENERICTYPE_EUPPERBOUND , value, value));
		}
	}
	private ETypeParameter _eTypeParameter;
	public ETypeParameter getETypeParameter()
	{
		
			return _eTypeParameter;
		
		
	}
	public void setETypeParameter(ETypeParameter value){
		ETypeParameter oldvalue = _eTypeParameter;
		_eTypeParameter = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EGENERICTYPE_ETYPEPARAMETER , oldvalue, value));
		}
	}
	private Ocllib.OrderedSet<EGenericType> _eTypeArguments;
	
	public Ocllib.OrderedSet<EGenericType> getETypeArguments()
	{
		if(_eTypeArguments==null){
			_eTypeArguments = new Ocllib.OrderedSet<EGenericType>(this, EcorePackageImpl.EGENERICTYPE_ETYPEARGUMENTS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EGENERICTYPE_ETYPEARGUMENTS);
		}
		return _eTypeArguments;
	
	}
	private EGenericType _eLowerBound;
	public EGenericType getELowerBound()
	{
		
			return _eLowerBound;
		
		
	}
	public void setELowerBound(EGenericType value){
		if (value != _eLowerBound) {
			NotificationChain msgs = null;
			if (_eLowerBound != null){
				msgs = ((InternalEObject)_eLowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EGENERICTYPE_ELOWERBOUND, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EGENERICTYPE_ELOWERBOUND, null, msgs);
			}
			msgs = basicSetELowerBound(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EGENERICTYPE_ELOWERBOUND , value, value));
		}
	}
	public boolean isInstance(Object object_
	)
	{
	    return null;
	}

	/*
	public static Set<EGenericType> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EGENERICTYPE;
	}
	
	
	public NotificationChain basicSetEClassifier(EClassifier newobj, NotificationChain msgs) {
		EClassifier oldobj = _eClassifier;
		_eClassifier = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EGENERICTYPE_ECLASSIFIER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetEUpperBound(EGenericType newobj, NotificationChain msgs) {
		EGenericType oldobj = _eUpperBound;
		_eUpperBound = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EGENERICTYPE_EUPPERBOUND, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetETypeParameter(ETypeParameter newobj, NotificationChain msgs) {
		ETypeParameter oldobj = _eTypeParameter;
		_eTypeParameter = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EGENERICTYPE_ETYPEPARAMETER, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetELowerBound(EGenericType newobj, NotificationChain msgs) {
		EGenericType oldobj = _eLowerBound;
		_eLowerBound = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EGENERICTYPE_ELOWERBOUND, oldobj, newobj);
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
			case EcorePackageImpl.EGENERICTYPE_EUPPERBOUND:
				return getEUpperBound();
			case EcorePackageImpl.EGENERICTYPE_ETYPEARGUMENTS:
				return getETypeArguments();
			case EcorePackageImpl.EGENERICTYPE_ERAWTYPE:
				return getERawType();
			case EcorePackageImpl.EGENERICTYPE_ELOWERBOUND:
				return getELowerBound();
			case EcorePackageImpl.EGENERICTYPE_ETYPEPARAMETER:
				return getETypeParameter();
			case EcorePackageImpl.EGENERICTYPE_ECLASSIFIER:
				return getEClassifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EGENERICTYPE_EUPPERBOUND:
				setEUpperBound((EGenericType) newValue);
				return;
			case EcorePackageImpl.EGENERICTYPE_ETYPEARGUMENTS:
				getETypeArguments().clear();
				getETypeArguments().addAll((java.util.Collection<? extends EGenericType>) newValue);
				return;
			case EcorePackageImpl.EGENERICTYPE_ELOWERBOUND:
				setELowerBound((EGenericType) newValue);
				return;
			case EcorePackageImpl.EGENERICTYPE_ETYPEPARAMETER:
				setETypeParameter((ETypeParameter) newValue);
				return;
			case EcorePackageImpl.EGENERICTYPE_ECLASSIFIER:
				setEClassifier((EClassifier) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
