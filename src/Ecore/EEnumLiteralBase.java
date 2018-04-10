package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EEnumLiteralBase 
extends ENamedElementImpl implements org.eclipse.emf.ecore.EEnumLiteral
{
	private int _value = 0;
	public int getValue()
	{
		return _value;
	}
	public void setValue(int value){
		
		_value = value;
	}
	
	private String _literal = "";
	public String getLiteral()
	{
		return _literal;
	}
	public void setLiteral(String value){
		
		_literal = value;
	}
	
	private org.eclipse.emf.common.util.Enumerator _instance = null;
	public org.eclipse.emf.common.util.Enumerator getInstance()
	{
		return _instance;
	}
	public void setInstance(org.eclipse.emf.common.util.Enumerator value){
		
		_instance = value;
	}
	
	public EEnum getEEnum()
	{
		
			if (eContainerFeatureID() != EcorePackageImpl.EENUMLITERAL_EENUM) return null;
			return (EEnum)eInternalContainer();
		
		
	}

	/*
	public static Set<EEnumLiteral> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EENUMLITERAL;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EENUMLITERAL_EENUM:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetEEnum((EEnum)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EENUMLITERAL_EENUM:
				return basicSetEEnum(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	public NotificationChain basicSetEEnum(EEnum newobj, NotificationChain msgs) {
			msgs = eBasicSetContainer((InternalEObject)newobj, EcorePackageImpl.EENUMLITERAL_EENUM, msgs);
			return msgs;
	}
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EENUMLITERAL_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EENUMLITERAL_NAME:
				return getName();
			case EcorePackageImpl.EENUMLITERAL_VALUE:
				return getValue();
			case EcorePackageImpl.EENUMLITERAL_INSTANCE:
				return getInstance();
			case EcorePackageImpl.EENUMLITERAL_LITERAL:
				return getLiteral();
			case EcorePackageImpl.EENUMLITERAL_EENUM:
				return getEEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EENUMLITERAL_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EENUMLITERAL_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EENUMLITERAL_VALUE:
				setValue((int) newValue);
				return;
			case EcorePackageImpl.EENUMLITERAL_INSTANCE:
				setInstance((org.eclipse.emf.common.util.Enumerator) newValue);
				return;
			case EcorePackageImpl.EENUMLITERAL_LITERAL:
				setLiteral((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
