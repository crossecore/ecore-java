package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EModelElementBase 
extends org.eclipse.emf.ecore.impl.BasicEObjectImpl implements org.eclipse.emf.ecore.EModelElement
{
	private Ocllib.OrderedSet<EAnnotation> _eAnnotations;
	
	public Ocllib.OrderedSet<EAnnotation> getEAnnotations()
	{
		if(_eAnnotations==null){
			_eAnnotations = new Ocllib.OrderedSet<EAnnotation>(this, EcorePackageImpl.EMODELELEMENT_EANNOTATIONS, EcorePackageImpl.EANNOTATION_EMODELELEMENT);
		}
		return _eAnnotations;
	
	}
	public EAnnotation getEAnnotation(String source
	)
	{
	    return null;
	}

	/*
	public static Set<EModelElement> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EMODELELEMENT;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EMODELELEMENT_EANNOTATIONS:
				return getEAnnotations().basicAdd((EAnnotation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EMODELELEMENT_EANNOTATIONS:
				return getEAnnotations().basicRemove((EAnnotation)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EMODELELEMENT_EANNOTATIONS:
				return getEAnnotations();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EMODELELEMENT_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
