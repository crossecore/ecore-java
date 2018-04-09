/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */

package Ocllib;

import org.eclipse.emf.ecore.InternalEObject;

public class OrderedSet<T> extends AbstractCollection<T> {

    public OrderedSet()
    {
    	super();
    }



    public OrderedSet(InternalEObject owner, int featureId)
    {
    	super(owner, featureId, NO_FEATURE);
    }

    public OrderedSet(InternalEObject owner, int featureId, int oppositeFeatureId)
    {
    	
    	super(owner, featureId, oppositeFeatureId);

    }
	
	
	public T at(int i) {
		
		return this.get(i);
	}


}
