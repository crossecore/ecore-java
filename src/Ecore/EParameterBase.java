package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EParameterBase 
extends ETypedElementImpl implements org.eclipse.emf.ecore.EParameter
{
	public EOperation getEOperation()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.EPARAMETER_EOPERATION) return null;
			return (EOperation)eInternalContainer();
		
		
	}

	/*
	public static Set<EParameter> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EPARAMETER;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EPARAMETER_EOPERATION:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEOperation((EOperation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EPARAMETER_EOPERATION:
				return basicSetEOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEOperation(EOperation newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.EPARAMETER_EOPERATION, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EPARAMETER_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EPARAMETER_NAME:
				return getName();
			case EcorePackageImpl.EPARAMETER_ORDERED:
				return getOrdered();
			case EcorePackageImpl.EPARAMETER_UNIQUE:
				return getUnique();
			case EcorePackageImpl.EPARAMETER_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.EPARAMETER_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.EPARAMETER_MANY:
				return getMany();
			case EcorePackageImpl.EPARAMETER_REQUIRED:
				return getRequired();
			case EcorePackageImpl.EPARAMETER_ETYPE:
				return getEType();
			case EcorePackageImpl.EPARAMETER_EGENERICTYPE:
				return getEGenericType();
			case EcorePackageImpl.EPARAMETER_EOPERATION:
				return getEOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EPARAMETER_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.EPARAMETER_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
