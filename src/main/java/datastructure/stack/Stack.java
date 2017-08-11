package datastructure.stack;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public class Stack<T> {
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public Stack() {
		arr = (T[]) new Object[TOTAL_SIZE];
	}
	
	// Stack implemented as array (LIFO)
	private T[] arr;
	
	// total memory size of array
	private int TOTAL_SIZE = 10;
	
	// current number of elements in array
	private int SIZE = 0;
	
	/**
	 * @return true if stack is empty
	 */
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	/**
	 * @return size of stack
	 */
	public int size() {
		return SIZE;
	}
	
	/**
	 * @return top of stack
	 * @throws StackException 
	 */
	public T pop() throws StackException {
		if (isEmpty()) {
			throw new StackException("Stack is empty");
		}
		T obj = arr[SIZE];
		SIZE--;
		if (SIZE < TOTAL_SIZE/2) {
			contract();
		}
		return obj;
	}
	
	/**
	 * @param obj object to be pushed into the stack
	 */
	public void push(T obj) {
		if (SIZE >= TOTAL_SIZE) {
			expand();
		} 
		arr[SIZE] = obj;
		SIZE++;
	}
	
	@SuppressWarnings("unchecked")
	private void expand() {
		TOTAL_SIZE = SIZE*2;
		T[] tmpArr = (T[]) new Object[TOTAL_SIZE];
		for (int i = 0; i < SIZE; i++) {
			tmpArr[i] = arr[i];
		}
		arr = tmpArr;
	}
	
	@SuppressWarnings("unchecked")
	private void contract() {
		TOTAL_SIZE = SIZE/2;
		T[] tmpArr = (T[]) new Object[TOTAL_SIZE];
		for (int i = 0; i < SIZE; i++) {
			tmpArr[i] = arr[i];
		}
		arr = tmpArr;
	}
}
