/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */

package Ocllib;


import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.InternalEObject;

public class Set<T> extends AbstractCollection<T> {

	private Class<?> dataClass = null;
    public Set(Class<?> dataClass)
    {
        super(dataClass);
        this.dataClass = dataClass;
    }

    public Set(Class<?> dataClass, InternalEObject owner, int featureId)
    {
    	super(dataClass, owner, featureId, NO_FEATURE);
    	this.dataClass = dataClass;
    }

    public Set(Class<?> dataClass,InternalEObject owner, int featureId, int oppositeFeatureId)
    {
    	super(dataClass, owner, featureId, oppositeFeatureId);
    	this.dataClass = dataClass;
    }
    
    
    public <T2> Set<T2> collect(Function<T, T2> lambda){
    	Set<T2> result = new Set<T2>(dataClass);

        for (T element : this)
        {
            result.add(lambda.apply(element));
        }

        return result;
    }
    
    public Set<T> select(Predicate<T> lambda)
    {
    	Set<T> result = new Set<T>(dataClass);

        for (T element : this)
        {
        	if(lambda.test(element)) {
        		
        		result.add(element);
        	}
        }

        return result;
    }
    
    
    
	
}
