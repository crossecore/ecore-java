package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EStringToStringMapEntryBase 
extends org.eclipse.emf.ecore.impl.BasicEObjectImpl implements org.eclipse.emf.ecore.EStringToStringMapEntry
{
	private String _key = "";
	public String getKey()
	{
		return _key;
	}
	public void setKey(String value){
		
		_key = value;
	}
	
	private String _value = "";
	public String getValue()
	{
		return _value;
	}
	public void setValue(String value){
		
		_value = value;
	}
	

	/*
	public static Set<EStringToStringMapEntry> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ESTRINGTOSTRINGMAPENTRY;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ESTRINGTOSTRINGMAPENTRY_KEY:
				return getKey();
			case EcorePackageImpl.ESTRINGTOSTRINGMAPENTRY_VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ESTRINGTOSTRINGMAPENTRY_KEY:
				setKey((String) newValue);
				return;
			case EcorePackageImpl.ESTRINGTOSTRINGMAPENTRY_VALUE:
				setValue((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
