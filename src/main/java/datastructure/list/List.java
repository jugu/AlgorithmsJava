package datastructure.list;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public abstract class List<T> {
	/**
	 * @param element element to be added to the list
	 */
	public abstract void add(T element);
	
	/**
	 * @param element element to be removed from list
	 * @return Removed element. Null if not found
	 * @throws LinkedListException
	 */
	public abstract T remove(T element) throws LinkedListException;
	
	/**
	 * @return size of list
	 */
	public abstract int size();
}
