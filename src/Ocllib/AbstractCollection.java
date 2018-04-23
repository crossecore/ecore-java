/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */
package Ocllib;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

public class AbstractCollection<T> extends EcoreEList<T> implements Collection<T>{

    protected static int NO_FEATURE = Integer.MIN_VALUE;

    private InternalEObject owner;
    private int featureId = NO_FEATURE;
    private int oppositeFeatureId = NO_FEATURE;
    private Class<?> dataClass = null;

    public AbstractCollection(Class<?> dataClass)
    {
        this(dataClass, null, NO_FEATURE);
    }
    


    public AbstractCollection(Class<?> dataClass, InternalEObject owner, int featureId)
    {

    	this(dataClass,owner, featureId, NO_FEATURE);

    }

    public AbstractCollection(Class<?> dataClass, InternalEObject owner, int featureId, int oppositeFeatureId)
    {
    	super(dataClass, owner);
    	
    	this.owner = owner;
    	this.featureId = featureId;
    	this.oppositeFeatureId = oppositeFeatureId;
    }
    
    @Override
	protected boolean isNotificationRequired() {
    	if(owner!=null) {
    		return super.isNotificationRequired();
    	}
    	return false;
	}



	
	
	@Override
	public boolean notEquals(Collection<T> c) {
		return !this.equals(c);
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public boolean includes(T element) {
		return this.contains(element);
	}

	@Override
	public boolean excludes(T element) {
		return !this.contains(element);
	}

	@Override
	public int count(T element) {
		int count = 0;
        for(T element_ : this)
        {
        	if(element_.equals(element)) {
        		count++;
        	}
        }
        return count;
	}


	@Override
	public boolean notEmpty() {
		return !this.isEmpty();
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<T> asSet() {
		Set<T> result = new Set<T>(dataClass);
		
		for(Iterator<T> iter = this.iterator();iter.hasNext();) {
			
			T next = iter.next();
			
			result.add(next);
		}
		
		return result;
		
	}

	@Override
	public OrderedSet<T> asOrderedSet() {
		OrderedSet<T> result = new OrderedSet<T>(dataClass);
		
		for(Iterator<T> iter = this.iterator();iter.hasNext();) {
			
			T next = iter.next();
			
			result.add(next);
		}
		
		return result;
	}

	@Override
	public Sequence<T> asSequence() {
		Sequence<T> result = new Sequence<T>(dataClass);
		
		for(Iterator<T> iter = this.iterator();iter.hasNext();) {
			
			T next = iter.next();
			
			result.add(next);
		}
		
		return result;
	}

	@Override
	public Bag<T> asBag() {

		Bag<T> result = new Bag<T>(dataClass);
		
		result.addAll(this);
		
		for(Iterator<T> iter = this.iterator();iter.hasNext();) {
			
			T next = iter.next();
			
			result.add(next);
		}
		
		return result;
	}

	@Override
	public T any(Function<T, Boolean> lambda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Function<T, Boolean> lambda) {
        for(T element : this)
        {
            if (lambda.apply(element))
            {
                return true;
            }
        }
        return false;
	}

	@Override
	public boolean forAll(Function<T, Boolean> lambda) {
        for(T element : this)
        {
            if (!lambda.apply(element))
            {
                return false;
            }
        }
        return true;
	}

	@Override
	public <T2> boolean isUnique(Function<T, T2> lambda) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean one(Function<T, Boolean> lambda) {
		
		boolean found = false;
        for(T element : this)
        {
            if (lambda.apply(element))
            {
            	if(found) {
            		return false;
            	}
            	else {
            		found = true;
            	}
            }
        }
        return found;
		
	}


	@Override
	public boolean equals(Collection<T> c) {
		return this.equals(c);
	}


	@Override
	public boolean includesAll(Collection<T> c2) {
		return this.containsAll(c2);
	}

	@Override
	public boolean excludesAll(Collection<T> c2) {

		return !this.containsAll(c2);
	}



}
