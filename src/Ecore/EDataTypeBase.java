package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EDataTypeBase 
extends EClassifierImpl implements org.eclipse.emf.ecore.EDataType
{
	private boolean _serializable = false;
	public boolean getSerializable()
	{
		return _serializable;
	}
	public void setSerializable(boolean value){
		
		_serializable = value;
	}
	
	@Override
	public boolean isSerializable() {
		//return this.eGet();
		
		return false;
	}

	/*
	public static Set<EDataType> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EDATATYPE;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EDATATYPE_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EDATATYPE_NAME:
				return getName();
			case EcorePackageImpl.EDATATYPE_INSTANCECLASSNAME:
				return getInstanceClassName();
			case EcorePackageImpl.EDATATYPE_INSTANCECLASS:
				return getInstanceClass();
			case EcorePackageImpl.EDATATYPE_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.EDATATYPE_INSTANCETYPENAME:
				return getInstanceTypeName();
			case EcorePackageImpl.EDATATYPE_EPACKAGE:
				return getEPackage();
			case EcorePackageImpl.EDATATYPE_ETYPEPARAMETERS:
				return getETypeParameters();
			case EcorePackageImpl.EDATATYPE_SERIALIZABLE:
				return getSerializable();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EDATATYPE_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EDATATYPE_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EDATATYPE_INSTANCECLASSNAME:
				setInstanceClassName((String) newValue);
				return;
			case EcorePackageImpl.EDATATYPE_INSTANCETYPENAME:
				setInstanceTypeName((String) newValue);
				return;
			case EcorePackageImpl.EDATATYPE_ETYPEPARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((java.util.Collection<? extends ETypeParameter>) newValue);
				return;
			case EcorePackageImpl.EDATATYPE_SERIALIZABLE:
				setSerializable((boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
