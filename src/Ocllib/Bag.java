/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */

package Ocllib;

import org.eclipse.emf.ecore.InternalEObject;

public class Bag<T> extends AbstractCollection<T> {
	private Class<?> dataClass = null;
    public Bag(Class<?> dataClass)
    {
        super(dataClass);
        this.dataClass = dataClass;
    }

    public Bag(Class<?> dataClass, InternalEObject owner, int featureId)
    {
    	super(dataClass, owner, featureId, NO_FEATURE);
    	this.dataClass = dataClass;
    }

    public Bag(Class<?> dataClass,InternalEObject owner, int featureId, int oppositeFeatureId)
    {
    	super(dataClass, owner, featureId, oppositeFeatureId);
    	this.dataClass = dataClass;
    }
}
