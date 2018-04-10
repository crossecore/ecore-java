package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ENamedElementBase 
extends EModelElementImpl implements org.eclipse.emf.ecore.ENamedElement
{
	private String _name = "";
	public String getName()
	{
		return _name;
	}
	public void setName(String value){
		
		_name = value;
	}
	

	/*
	public static Set<ENamedElement> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ENAMEDELEMENT;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ENAMEDELEMENT_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ENAMEDELEMENT_NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ENAMEDELEMENT_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ENAMEDELEMENT_NAME:
				setName((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
