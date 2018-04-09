package Ecore;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
public class EEnumBase 
extends EDataTypeImpl implements org.eclipse.emf.ecore.EEnum
{
	private Ocllib.OrderedSet<EEnumLiteral> _eLiterals;
	
	public Ocllib.OrderedSet<EEnumLiteral> getELiterals()
	{
		if(_eLiterals==null){
			_eLiterals = new Ocllib.OrderedSet<EEnumLiteral>(this, EcorePackageImpl.EENUM_ELITERALS, EcorePackageImpl.EENUMLITERAL_EENUM);
		}
		return _eLiterals;
	
	}
	public EEnumLiteral getEEnumLiteral(int value
	)
	{
	    return null;
	}
	public EEnumLiteral getEEnumLiteral(String name
	)
	{
	    return null;
	}
	public EEnumLiteral getEEnumLiteralByLiteral(String literal
	)
	{
	    return null;
	}

	/*
	public static Set<EEnum> allInstances(){
		throw new NotImplementedException();
	}
	*/
	
	@Override
	protected EClass eStaticClass() {
		return EcorePackageImpl.Literals.EENUM;
	}
	
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EENUM_ELITERALS:
				return getELiterals().basicAdd((EEnumLiteral)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcorePackageImpl.EENUM_ELITERALS:
				return getELiterals().basicRemove((EEnumLiteral)otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcorePackageImpl.EENUM_EANNOTATIONS:
				return getEAnnotations();
			case EcorePackageImpl.EENUM_NAME:
				return getName();
			case EcorePackageImpl.EENUM_INSTANCECLASSNAME:
				return getInstanceClassName();
			case EcorePackageImpl.EENUM_INSTANCECLASS:
				return getInstanceClass();
			case EcorePackageImpl.EENUM_DEFAULTVALUE:
				return getDefaultValue();
			case EcorePackageImpl.EENUM_INSTANCETYPENAME:
				return getInstanceTypeName();
			case EcorePackageImpl.EENUM_EPACKAGE:
				return getEPackage();
			case EcorePackageImpl.EENUM_ETYPEPARAMETERS:
				return getETypeParameters();
			case EcorePackageImpl.EENUM_SERIALIZABLE:
				return getSerializable();
			case EcorePackageImpl.EENUM_ELITERALS:
				return getELiterals();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcorePackageImpl.EENUM_EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((java.util.Collection<? extends EAnnotation>) newValue);
				return;
			case EcorePackageImpl.EENUM_NAME:
				setName((String) newValue);
				return;
			case EcorePackageImpl.EENUM_INSTANCECLASSNAME:
				setInstanceClassName((String) newValue);
				return;
			case EcorePackageImpl.EENUM_INSTANCETYPENAME:
				setInstanceTypeName((String) newValue);
				return;
			case EcorePackageImpl.EENUM_ETYPEPARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((java.util.Collection<? extends ETypeParameter>) newValue);
				return;
			case EcorePackageImpl.EENUM_SERIALIZABLE:
				setSerializable((boolean) newValue);
				return;
			case EcorePackageImpl.EENUM_ELITERALS:
				getELiterals().clear();
				getELiterals().addAll((java.util.Collection<? extends EEnumLiteral>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
}
