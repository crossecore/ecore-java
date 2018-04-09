/* CrossEcore is a cross-platform modeling framework that generates C#, TypeScript, 
 * JavaScript, Swift code from Ecore models with embedded OCL (http://www.crossecore.org/).
 * The original Eclipse Modeling Framework is available at https://www.eclipse.org/modeling/emf/.
 * 
 * contributor: Simon Schwichtenberg
 */

package Ocllib;

import java.util.function.Function;

public interface Collection<T> extends java.util.Collection<T> {
    
	boolean add(T element);
	//boolean remove(T element);
	boolean equals(Collection<T> c);
    boolean notEquals(Collection<T> c);
    int size();
    boolean includes(T element);
    boolean excludes(T element);
    int count(T element);
    boolean includesAll(Collection<T> c2);
    boolean excludesAll(Collection<T> c2);
    boolean isEmpty();
    boolean notEmpty();
    T max();
    T min();
    double sum();
    Set<T> asSet();
    OrderedSet<T> asOrderedSet();
    Sequence<T> asSequence();
    Bag<T> asBag();
    //Collection<T2> flatten<T2>();
    T any(Function<T, Boolean> lambda);
    //Collection<T2> closure<T2>(Func<T, T2> lambda);

    //Collection<T2> collect<T2>(Func<T, T2> lambda);
    //Collection<T2> collect<T2>(Func<T, Collection<T2>> lambda);

    //Collection<T> including(T element);
    //Collection<T> excluding(T element);
    //Collection<T2> collect<T2>(Func<T, T2> lambda);
    //Collection<T2> collect<T2>(Func<T, Collection<T2>> lambda);
    boolean exists(Function<T, Boolean> lambda);
    boolean forAll(Function<T, Boolean> lambda);
    <T2> boolean isUnique(Function<T, T2> lambda);
    boolean one(Function<T, Boolean> lambda);
}
