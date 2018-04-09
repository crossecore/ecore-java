package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class ETypeParameterBase 
extends ENamedElementImpl implements org.eclipse.emf.ecore.ETypeParameter
{
	private Ocllib.OrderedSet<EGenericType> _eBounds;
	
	public Ocllib.OrderedSet<EGenericType> getEBounds()
	{
		if(_eBounds==null){
			_eBounds = new Ocllib.OrderedSet<EGenericType>(this, EcorePackageImpl.ETYPEPARAMETER_EBOUNDS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.ETYPEPARAMETER_EBOUNDS);
		}
		return _eBounds;
	
	}

	/*
	public static Set<ETypeParameter> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.ETYPEPARAMETER;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.ETYPEPARAMETER_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.ETYPEPARAMETER_NAME:
				return getName();
			case EcorePackageImpl.ETYPEPARAMETER_EBOUNDS:
				return getEBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.ETYPEPARAMETER_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.ETYPEPARAMETER_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.ETYPEPARAMETER_EBOUNDS:
				getEBounds().clear();
				getEBounds().addAll((java.util.Collection<? extends EGenericType>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
