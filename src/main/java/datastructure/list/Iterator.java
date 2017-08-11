package datastructure.list;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public interface Iterator<T> {
	/**
	 * @return next element
	 */
	public T next();
	
	/**
	 * @return True if next element exits
	 */
	public boolean hasNext();
}
