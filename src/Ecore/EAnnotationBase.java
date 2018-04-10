package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EAnnotationBase 
extends EModelElementImpl implements org.eclipse.emf.ecore.EAnnotation
{
	private String _source = "";
	public String getSource()
	{
		return _source;
	}
	public void setSource(String value){
		
		_source = value;
	}
	
	private Ocllib.OrderedSet<EObject> _references;
	
	public Ocllib.OrderedSet<EObject> getReferences()
	{
		if(_references==null){
			_references = new Ocllib.OrderedSet<EObject>(this, EcorePackageImpl.EANNOTATION_REFERENCES, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EANNOTATION_REFERENCES);
		}
		return _references;
	
	}
	public EModelElement getEModelElement()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.EANNOTATION_EMODELELEMENT) return null;
			return (EModelElement)eInternalContainer();
		
		
	}
	public void setEModelElement(EModelElement value){
		if (value != eInternalContainer()) {
			NotificationChain msgs = null;
			if (eInternalContainer() != null){
				msgs = ((InternalEObject)eInternalContainer()).eInverseRemove(this, EcorePackageImpl.EMODELELEMENT_EANNOTATIONS, EAnnotation.class, msgs);
			}
			if (value != null){
				msgs = ((InternalEObject)value).eInverseAdd(this, EcorePackageImpl.EMODELELEMENT_EANNOTATIONS, EAnnotation.class, msgs);
			}
			msgs = basicSetEModelElement(value, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()){
			eNotify(new ENotificationImpl(this, NotificationImpl.SET,EcorePackageImpl.EANNOTATION_EMODELELEMENT , value, value));
		}
	}
	private Ocllib.OrderedSet<Map.Entry<String, String>> _details;
	
	public Ocllib.OrderedSet<Map.Entry<String, String>> getDetails()
	{
		if(_details==null){
			_details = new Ocllib.OrderedSet<Map.Entry<String, String>>(this, EcorePackageImpl.EANNOTATION_DETAILS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EANNOTATION_DETAILS);
		}
		return _details;
	
	}
	private Ocllib.OrderedSet<EObject> _contents;
	
	public Ocllib.OrderedSet<EObject> getContents()
	{
		if(_contents==null){
			_contents = new Ocllib.OrderedSet<EObject>(this, EcorePackageImpl.EANNOTATION_CONTENTS, EOPPOSITE_FEATURE_BASE - EcorePackageImpl.EANNOTATION_CONTENTS);
		}
		return _contents;
	
	}

	/*
	public static Set<EAnnotation> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EANNOTATION;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EANNOTATION_EMODELELEMENT:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEModelElement((EModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EANNOTATION_EMODELELEMENT:
				return basicSetEModelElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEModelElement(EModelElement newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.EANNOTATION_EMODELELEMENT, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EANNOTATION_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EANNOTATION_SOURCE:
				return getSource();
			case EcorePackageImpl.EANNOTATION_DETAILS:
				return getDetails();
			case EcorePackageImpl.EANNOTATION_EMODELELEMENT:
				return getEModelElement();
			case EcorePackageImpl.EANNOTATION_CONTENTS:
				return getContents();
			case EcorePackageImpl.EANNOTATION_REFERENCES:
				return getReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EANNOTATION_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EANNOTATION_SOURCE:
				setSource((String) newValue);
				return;
			case EcorePackageImpl.EANNOTATION_DETAILS:
				getDetails().clear();
				getDetails().addAll((java.util.Collection<? extends Map.Entry<String, String>>) newValue);
				return;
			case EcorePackageImpl.EANNOTATION_EMODELELEMENT:
				setEModelElement((EModelElement) newValue);
				return;
			case EcorePackageImpl.EANNOTATION_CONTENTS:
				getContents().clear();
				getContents().addAll((java.util.Collection<? extends EObject>) newValue);
				return;
			case EcorePackageImpl.EANNOTATION_REFERENCES:
				getReferences().clear();
				getReferences().addAll((java.util.Collection<? extends EObject>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
