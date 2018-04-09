package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EStructuralFeatureBase 
extends ETypedElementImpl implements org.eclipse.emf.ecore.EStructuralFeature
{
	private boolean _derived = false;
	public boolean getDerived()
	{
		return _derived;
	}
	public void setDerived(boolean value){
		
		_derived = value;
	}
	
	@Override
	public boolean isDerived() {
		//return this.eGet();
		
		return false;
	}
	private boolean _changeable = false;
	public boolean getChangeable()
	{
		return _changeable;
	}
	public void setChangeable(boolean value){
		
		_changeable = value;
	}
	
	@Override
	public boolean isChangeable() {
		//return this.eGet();
		
		return false;
	}
	private String _defaultValueLiteral = "";
	public String getDefaultValueLiteral()
	{
		return _defaultValueLiteral;
	}
	public void setDefaultValueLiteral(String value){
		
		_defaultValueLiteral = value;
	}
	
	private boolean _unsettable = false;
	public boolean getUnsettable()
	{
		return _unsettable;
	}
	public void setUnsettable(boolean value){
		
		_unsettable = value;
	}
	
	@Override
	public boolean isUnsettable() {
		//return this.eGet();
		
		return false;
	}
	private boolean _transient = false;
	public boolean getTransient()
	{
		return _transient;
	}
	public void setTransient(boolean value){
		
		_transient = value;
	}
	
	@Override
	public boolean isTransient() {
		//return this.eGet();
		
		return false;
	}
	private boolean _volatile = false;
	public boolean getVolatile()
	{
		return _volatile;
	}
	public void setVolatile(boolean value){
		
		_volatile = value;
	}
	
	@Override
	public boolean isVolatile() {
		//return this.eGet();
		
		return false;
	}
	public Object getDefaultValue()
	{
		//TODO implement derivation
		return null;
	}
	
	public EClass getEContainingClass()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS) return null;
			return (EClass)eInternalContainer();
		
		
	}
	public int getFeatureID()
	{
	    return null;
	}
	public Class getContainerClass()
	{
	    return null;
	}

	/*
	public static Set<EStructuralFeature> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ESTRUCTURALFEATURE;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEContainingClass((EClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS:
				return basicSetEContainingClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEContainingClass(EClass newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ESTRUCTURALFEATURE_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ESTRUCTURALFEATURE_NAME:
				return getName();
			case EcorePackageImpl.ESTRUCTURALFEATURE_ORDERED:
				return getOrdered();
			case EcorePackageImpl.ESTRUCTURALFEATURE_UNIQUE:
				return getUnique();
			case EcorePackageImpl.ESTRUCTURALFEATURE_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.ESTRUCTURALFEATURE_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.ESTRUCTURALFEATURE_MANY:
				return getMany();
			case EcorePackageImpl.ESTRUCTURALFEATURE_REQUIRED:
				return getRequired();
			case EcorePackageImpl.ESTRUCTURALFEATURE_ETYPE:
				return getEType();
			case EcorePackageImpl.ESTRUCTURALFEATURE_EGENERICTYPE:
				return getEGenericType();
			case EcorePackageImpl.ESTRUCTURALFEATURE_CHANGEABLE:
				return getChangeable();
			case EcorePackageImpl.ESTRUCTURALFEATURE_VOLATILE:
				return getVolatile();
			case EcorePackageImpl.ESTRUCTURALFEATURE_TRANSIENT:
				return getTransient();
			case EcorePackageImpl.ESTRUCTURALFEATURE_DEFAULTVALUELITERAL:
				return getDefaultValueLiteral();
			case EcorePackageImpl.ESTRUCTURALFEATURE_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.ESTRUCTURALFEATURE_UNSETTABLE:
				return getUnsettable();
			case EcorePackageImpl.ESTRUCTURALFEATURE_DERIVED:
				return getDerived();
			case EcorePackageImpl.ESTRUCTURALFEATURE_ECONTAININGCLASS:
				return getEContainingClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ESTRUCTURALFEATURE_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_CHANGEABLE:
				setChangeable((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_VOLATILE:
				setVolatile((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_TRANSIENT:
				setTransient((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_DEFAULTVALUELITERAL:
				setDefaultValueLiteral((String) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_UNSETTABLE:
				setUnsettable((boolean) newValue);
				return;
			case EcorePackageImpl.ESTRUCTURALFEATURE_DERIVED:
				setDerived((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
