package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EOperationBase 
extends ETypedElementImpl implements org.eclipse.emf.ecore.EOperation
{
	public EClass getEContainingClass()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.EOPERATION_ECONTAININGCLASS) return null;
			return (EClass)eInternalContainer();
		
		
	}
	private Ocllib.OrderedSet<ETypeParameter> _eTypeParameters;
	
	public Ocllib.OrderedSet<ETypeParameter> getETypeParameters()
	{
		if(_eTypeParameters==null){
			_eTypeParameters = new Ocllib.OrderedSet<ETypeParameter>(this, EcorePackageImpl.EOPERATION_ETYPEPARAMETERS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EOPERATION_ETYPEPARAMETERS);
		}
		return _eTypeParameters;
	
	}
	private Ocllib.OrderedSet<EParameter> _eParameters;
	
	public Ocllib.OrderedSet<EParameter> getEParameters()
	{
		if(_eParameters==null){
			_eParameters = new Ocllib.OrderedSet<EParameter>(this, EcorePackageImpl.EOPERATION_EPARAMETERS, EcorePackageImpl.EPARAMETER_EOPERATION);
		}
		return _eParameters;
	
	}
	private Ocllib.OrderedSet<EClassifier> _eExceptions;
	
	public Ocllib.OrderedSet<EClassifier> getEExceptions()
	{
		if(_eExceptions==null){
			_eExceptions = new Ocllib.OrderedSet<EClassifier>(this, EcorePackageImpl.EOPERATION_EEXCEPTIONS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EOPERATION_EEXCEPTIONS);
		}
		return _eExceptions;
	
	}
	private Ocllib.OrderedSet<EGenericType> _eGenericExceptions;
	
	public Ocllib.OrderedSet<EGenericType> getEGenericExceptions()
	{
		if(_eGenericExceptions==null){
			_eGenericExceptions = new Ocllib.OrderedSet<EGenericType>(this, EcorePackageImpl.EOPERATION_EGENERICEXCEPTIONS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EOPERATION_EGENERICEXCEPTIONS);
		}
		return _eGenericExceptions;
	
	}
	public int getOperationID()
	{
	    return 0;
	}
	public boolean isOverrideOf(EOperation someOperation
	)
	{
	    return false;
	}

	/*
	public static Set<EOperation> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EOPERATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EOPERATION_ECONTAININGCLASS:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEContainingClass((EClass)otherEnd, msgs);
			case EcorePackageImpl.EOPERATION_EPARAMETERS:
				return getEParameters().basicAdd((EParameter)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EOPERATION_ECONTAININGCLASS:
				return basicSetEContainingClass(null, msgs);
			case EcorePackageImpl.EOPERATION_EPARAMETERS:
				return getEParameters().basicRemove((EParameter)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEContainingClass(EClass newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.EOPERATION_ECONTAININGCLASS, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EOPERATION_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EOPERATION_NAME:
				return getName();
			case EcorePackageImpl.EOPERATION_ORDERED:
				return getOrdered();
			case EcorePackageImpl.EOPERATION_UNIQUE:
				return getUnique();
			case EcorePackageImpl.EOPERATION_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.EOPERATION_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.EOPERATION_MANY:
				return getMany();
			case EcorePackageImpl.EOPERATION_REQUIRED:
				return getRequired();
			case EcorePackageImpl.EOPERATION_ETYPE:
				return getEType();
			case EcorePackageImpl.EOPERATION_EGENERICTYPE:
				return getEGenericType();
			case EcorePackageImpl.EOPERATION_ECONTAININGCLASS:
				return getEContainingClass();
			case EcorePackageImpl.EOPERATION_ETYPEPARAMETERS:
				return getETypeParameters();
			case EcorePackageImpl.EOPERATION_EPARAMETERS:
				return getEParameters();
			case EcorePackageImpl.EOPERATION_EEXCEPTIONS:
				return getEExceptions();
			case EcorePackageImpl.EOPERATION_EGENERICEXCEPTIONS:
				return getEGenericExceptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EOPERATION_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EOPERATION_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EOPERATION_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.EOPERATION_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.EOPERATION_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.EOPERATION_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.EOPERATION_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.EOPERATION_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
			case EcorePackageImpl.EOPERATION_ETYPEPARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((java.util.Collection<? extends ETypeParameter>) newValue);
				return;
			case EcorePackageImpl.EOPERATION_EPARAMETERS:
				getEParameters().clear();
				getEParameters().addAll((java.util.Collection<? extends EParameter>) newValue);
				return;
			case EcorePackageImpl.EOPERATION_EEXCEPTIONS:
				getEExceptions().clear();
				getEExceptions().addAll((java.util.Collection<? extends EClassifier>) newValue);
				return;
			case EcorePackageImpl.EOPERATION_EGENERICEXCEPTIONS:
				getEGenericExceptions().clear();
				getEGenericExceptions().addAll((java.util.Collection<? extends EGenericType>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
