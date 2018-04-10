package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EAttributeBase 
extends EStructuralFeatureImpl implements org.eclipse.emf.ecore.EAttribute
{
	private boolean _iD = false;
	public boolean getID()
	{
		return _iD;
	}
	public void setID(boolean value){
		
		_iD = value;
	}
	
	@Override
	public boolean isID() {
		//return this.eGet();
		
		return false;
	}
	public EDataType getEAttributeType()
	{
		
			//TODO implement derivation
			return null;
		
		
	}

	/*
	public static Set<EAttribute> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EATTRIBUTE;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EATTRIBUTE_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EATTRIBUTE_NAME:
				return getName();
			case EcorePackageImpl.EATTRIBUTE_ORDERED:
				return getOrdered();
			case EcorePackageImpl.EATTRIBUTE_UNIQUE:
				return getUnique();
			case EcorePackageImpl.EATTRIBUTE_LOWERBOUND:
				return getLowerBound();
			case EcorePackageImpl.EATTRIBUTE_UPPERBOUND:
				return getUpperBound();
			case EcorePackageImpl.EATTRIBUTE_MANY:
				return getMany();
			case EcorePackageImpl.EATTRIBUTE_REQUIRED:
				return getRequired();
			case EcorePackageImpl.EATTRIBUTE_ETYPE:
				return getEType();
			case EcorePackageImpl.EATTRIBUTE_EGENERICTYPE:
				return getEGenericType();
			case EcorePackageImpl.EATTRIBUTE_CHANGEABLE:
				return getChangeable();
			case EcorePackageImpl.EATTRIBUTE_VOLATILE:
				return getVolatile();
			case EcorePackageImpl.EATTRIBUTE_TRANSIENT:
				return getTransient();
			case EcorePackageImpl.EATTRIBUTE_DEFAULTVALUELITERAL:
				return getDefaultValueLiteral();
			case EcorePackageImpl.EATTRIBUTE_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.EATTRIBUTE_UNSETTABLE:
				return getUnsettable();
			case EcorePackageImpl.EATTRIBUTE_DERIVED:
				return getDerived();
			case EcorePackageImpl.EATTRIBUTE_ECONTAININGCLASS:
				return getEContainingClass();
			case EcorePackageImpl.EATTRIBUTE_ID:
				return getID();
			case EcorePackageImpl.EATTRIBUTE_EATTRIBUTETYPE:
				return getEAttributeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EATTRIBUTE_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_ORDERED:
				setOrdered((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_UNIQUE:
				setUnique((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_LOWERBOUND:
				setLowerBound((int) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_UPPERBOUND:
				setUpperBound((int) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_ETYPE:
				setEType((EClassifier) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_EGENERICTYPE:
				setEGenericType((EGenericType) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_CHANGEABLE:
				setChangeable((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_VOLATILE:
				setVolatile((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_TRANSIENT:
				setTransient((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_DEFAULTVALUELITERAL:
				setDefaultValueLiteral((String) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_UNSETTABLE:
				setUnsettable((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_DERIVED:
				setDerived((boolean) newValue);
				return;
			case EcorePackageImpl.EATTRIBUTE_ID:
				setID((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
