package pratice.labdas2;

@FunctionalInterface
public interface ConditionGeneric<T> {

	public boolean test(T t);
	
	
}
