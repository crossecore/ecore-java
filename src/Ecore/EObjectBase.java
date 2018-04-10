package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EObjectBase 
extends org.eclipse.emf.ecore.impl.BasicEObjectImpl implements org.eclipse.emf.ecore.EObject
{
	public Object eInvoke(EOperation operation,
	org.eclipse.emf.common.util.EList<?> arguments
	)
	{
	    return null;
	}
	public boolean eIsSet(EStructuralFeature feature
	)
	{
	    return false;
	}
	public boolean eIsProxy()
	{
	    return false;
	}
	public void eUnset(EStructuralFeature feature
	)
	{
	}
	public void eSet(EStructuralFeature feature,
	Object newValue
	)
	{
	}
	public org.eclipse.emf.ecore.resource.Resource eResource()
	{
	    return null;
	}
	public Object eGet(EStructuralFeature feature
	)
	{
	    return null;
	}
	public EClass eClass()
	{
	    return null;
	}
	public org.eclipse.emf.common.util.TreeIterator<EObject> eAllContents()
	{
	    return null;
	}
	public Object eGet(EStructuralFeature feature,
	boolean resolve
	)
	{
	    return null;
	}
	public EReference eContainmentFeature()
	{
	    return null;
	}
	public org.eclipse.emf.common.util.EList<EObject> eCrossReferences()
	{
	    return null;
	}
	public EStructuralFeature eContainingFeature()
	{
	    return null;
	}
	public org.eclipse.emf.common.util.EList<EObject> eContents()
	{
	    return null;
	}
	public EObject eContainer()
	{
	    return null;
	}

	/*
	public static Set<EObject> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EOBJECT;
	}
	
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		}
		super.eSet(featureID, newValue);
	}
	
}
