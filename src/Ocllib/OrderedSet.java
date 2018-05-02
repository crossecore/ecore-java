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

public class OrderedSet<T> extends AbstractCollection<T> {

	private Class<?> dataClass = null;
    public OrderedSet(Class<?> dataClass)
    {
        super(dataClass);
        this.dataClass = dataClass;
    }

    public OrderedSet(Class<?> dataClass, InternalEObject owner, int featureId)
    {
    	super(dataClass, owner, featureId, NO_FEATURE);
    	this.dataClass = dataClass;
    }

    public OrderedSet(Class<?> dataClass,InternalEObject owner, int featureId, int oppositeFeatureId)
    {
    	super(dataClass, owner, featureId, oppositeFeatureId);
    	this.dataClass = dataClass;
    }
	
	
	public T at(int i) {
		
		return this.get(i);
	}
	
    public <T2> OrderedSet<T2> collect(Class<T2> c, Function<T, T2> lambda){
    	OrderedSet<T2> result = new OrderedSet<T2>(dataClass);

        for (T element : this)
        {
            result.add(lambda.apply(element));
        }

        return result;
    }
    
    public <T2> OrderedSet<T2> collect2(Class<T2> c, Function<T, Collection<T2>> lambda){
    	OrderedSet<T2> result = new OrderedSet<T2>(dataClass);

        for (T element : this)
        {
        	
        	Collection<T2> e = lambda.apply(element);
        	
        	for(T2 ee : e) {
        		result.add(ee);
        	}
            
        }

        return result;
    }
    
    public OrderedSet<T> select(Predicate<T> lambda)
    {
    	OrderedSet<T> result = new OrderedSet<T>(dataClass);

        for (T element : this)
        {
        	if(lambda.test(element)) {
        		
        		result.add(element);
        	}
        }

        return result;
    }


}
