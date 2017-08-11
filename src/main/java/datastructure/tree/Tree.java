package datastructure.tree;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public abstract class Tree<T> {
	/**
	 * @return root of tree
	 */
	public abstract T root();
	
	/**
	 * @param node
	 */
	public abstract void add(T node);
	
	/**
	 * @param node
	 */
	public abstract void remove(T node);
}
