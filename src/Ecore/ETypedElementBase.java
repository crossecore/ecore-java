package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ETypedElementBase 
extends ENamedElementImpl implements org.eclipse.emf.ecore.ETypedElement
{
	private boolean _ordered = false;
	public boolean getOrdered()
	{
		return _ordered;
	}
	public void setOrdered(boolean value){
		
		_ordered = value;
	}
	
	@Override
	public boolean isOrdered() {
		//return this.eGet();
		
		return false;
	}
	public boolean getRequired()
	{
		//TODO implement derivation
		return null;
	}
	
	@Override
	public boolean isRequired() {
		//return this.eGet();
		
		return false;
	}
	private int _upperBound = 0;
	public int getUpperBound()
	{
		return _upperBound;
	}
	public void setUpperBound(int value){
		
		_upperBound = value;
	}
	
	public boolean getMany()
	{
		//TODO implement derivation
		return null;
	}
	
	@Override
	public boolean isMany() {
		//return this.eGet();
		
		return false;
	}
	private boolean _unique = false;
	public boolean getUnique()
	{
		return _unique;
	}
	public void setUnique(boolean value){
		
		_unique = value;
	}
	
	@Override
	public boolean isUnique() {
		//return this.eGet();
		
		return false;
	}
	private int _lowerBound = 0;
	public int getLowerBound()
	{
		return _lowerBound;
	}
	public void setLowerBound(int value){
		
		_lowerBound = value;
	}
	
	private EClassifier _eType;
	public EClassifier getEType()
	{
		
			return _eType;
		
		
	}
	public void setEType(EClassifier value){
		EClassifier oldvalue = _eType;
		_eType = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.ETYPEDELEMENT_ETYPE , oldvalue, value));
		}
	}
	private EGenericType _eGenericType;
	public EGenericType getEGenericType()
	{
		
			return _eGenericType;
		
		
	}
	public void setEGenericType(EGenericType value){
		if (value != _eGenericType) {
			NotificationChain msgs = null;
			if (_eGenericType != null){
				msgs = ((InternalEObject)_eGenericType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE, null, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE, null, msgs);
			}
			msgs = basicSetEGenericType(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE , value, value));
		}
	}

	/*
	public static Set<ETypedElement> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ETYPEDELEMENT;
	}
	
	
	public NotificationChain basicSetEType(EClassifier newobj, NotificationChain msgs) {
		EClassifier oldobj = _eType;
		_eType = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.ETYPEDELEMENT_ETYPE, oldobj, newobj);
			if (msgs == null){
				msgs = notification;
			}
			else{
				msgs.add(notification);
			}
		}
		return msgs;
	}
	public NotificationChain basicSetEGenericType(EGenericType newobj, NotificationChain msgs) {
		EGenericType oldobj = _eGenericType;
		_eGenericType = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE, oldobj, newobj);
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
			case EcorePackageImpl.ETYPEDELEMENT_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ETYPEDELEMENT_NAME:
				return getName();
			case EcorePackageImpl.ETYPEDELEMENT_ORDERED:
				return getOrdered();
			case EcorePackageImpl.ETYPEDELEMENT_UNIQUE:
				return getUnique();
			case EcorePackageImpl.ETYPEDELEMENT_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.ETYPEDELEMENT_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.ETYPEDELEMENT_MANY:
				return getMany();
			case EcorePackageImpl.ETYPEDELEMENT_REQUIRED:
				return getRequired();
			case EcorePackageImpl.ETYPEDELEMENT_ETYPE:
				return getEType();
			case EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE:
				return getEGenericType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ETYPEDELEMENT_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.ETYPEDELEMENT_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
