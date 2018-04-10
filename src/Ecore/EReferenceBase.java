package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EReferenceBase 
extends EStructuralFeatureImpl implements org.eclipse.emf.ecore.EReference
{
	public boolean getContainer()
	{
		//TODO implement derivation
		return null;
	}
	
	@Override
	public boolean isContainer() {
		//return this.eGet();
		
		return false;
	}
	private boolean _containment = false;
	public boolean getContainment()
	{
		return _containment;
	}
	public void setContainment(boolean value){
		
		_containment = value;
	}
	
	@Override
	public boolean isContainment() {
		//return this.eGet();
		
		return false;
	}
	private boolean _resolveProxies = false;
	public boolean getResolveProxies()
	{
		return _resolveProxies;
	}
	public void setResolveProxies(boolean value){
		
		_resolveProxies = value;
	}
	
	@Override
	public boolean isResolveProxies() {
		//return this.eGet();
		
		return false;
	}
	private Ocllib.OrderedSet<EAttribute> _eKeys;
	
	public Ocllib.OrderedSet<EAttribute> getEKeys()
	{
		if(_eKeys==null){
			_eKeys = new Ocllib.OrderedSet<EAttribute>(this, EcorePackageImpl.EREFERENCE_EKEYS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EREFERENCE_EKEYS);
		}
		return _eKeys;
	
	}
	public EClass getEReferenceType()
	{
		
			//TODO implement derivation
			return null;
		
		
	}
	private EReference _eOpposite;
	public EReference getEOpposite()
	{
		
			return _eOpposite;
		
		
	}
	public void setEOpposite(EReference value){
		EReference oldvalue = _eOpposite;
		_eOpposite = value;
		if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EREFERENCE_EOPPOSITE , oldvalue, value));
		}
	}

	/*
	public static Set<EReference> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EREFERENCE;
	}
	
	
	public NotificationChain basicSetEOpposite(EReference newobj, NotificationChain msgs) {
		EReference oldobj = _eOpposite;
		_eOpposite = newobj;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, NotificationImpl.SET, EcorePackageImpl.EREFERENCE_EOPPOSITE, oldobj, newobj);
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
			case EcorePackageImpl.EREFERENCE_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EREFERENCE_NAME:
				return getName();
			case EcorePackageImpl.EREFERENCE_ORDERED:
				return getOrdered();
			case EcorePackageImpl.EREFERENCE_UNIQUE:
				return getUnique();
			case EcorePackageImpl.EREFERENCE_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.EREFERENCE_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.EREFERENCE_MANY:
				return getMany();
			case EcorePackageImpl.EREFERENCE_REQUIRED:
				return getRequired();
			case EcorePackageImpl.EREFERENCE_ETYPE:
				return getEType();
			case EcorePackageImpl.EREFERENCE_EGENERICTYPE:
				return getEGenericType();
			case EcorePackageImpl.EREFERENCE_CHANGEABLE:
				return getChangeable();
			case EcorePackageImpl.EREFERENCE_VOLATILE:
				return getVolatile();
			case EcorePackageImpl.EREFERENCE_TRANSIENT:
				return getTransient();
			case EcorePackageImpl.EREFERENCE_DEFAULTVALUELITERAL:
				return getDefaultValueLiteral();
			case EcorePackageImpl.EREFERENCE_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.EREFERENCE_UNSETTABLE:
				return getUnsettable();
			case EcorePackageImpl.EREFERENCE_DERIVED:
				return getDerived();
			case EcorePackageImpl.EREFERENCE_ECONTAININGCLASS:
				return getEContainingClass();
			case EcorePackageImpl.EREFERENCE_CONTAINMENT:
				return getContainment();
			case EcorePackageImpl.EREFERENCE_CONTAINER:
				return getContainer();
			case EcorePackageImpl.EREFERENCE_RESOLVEPROXIES:
				return getResolveProxies();
			case EcorePackageImpl.EREFERENCE_EOPPOSITE:
				return getEOpposite();
			case EcorePackageImpl.EREFERENCE_EREFERENCETYPE:
				return getEReferenceType();
			case EcorePackageImpl.EREFERENCE_EKEYS:
				return getEKeys();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EREFERENCE_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_CHANGEABLE:
				setChangeable((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_VOLATILE:
				setVolatile((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_TRANSIENT:
				setTransient((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_DEFAULTVALUELITERAL:
				setDefaultValueLiteral((String) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_UNSETTABLE:
				setUnsettable((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_DERIVED:
				setDerived((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_CONTAINMENT:
				setContainment((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_RESOLVEPROXIES:
				setResolveProxies((boolean) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_EOPPOSITE:
				setEOpposite((EReference) newValue);
				return;
			case EcorePackageImpl.EREFERENCE_EKEYS:
				getEKeys().clear();
				getEKeys().addAll((java.util.Collection<? extends EAttribute>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
