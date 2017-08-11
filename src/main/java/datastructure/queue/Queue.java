package datastructure.queue;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public class Queue<T> {
	private T[] arr;
	
	private int TOTAL_SIZE = 10;
	
	private int SIZE = 0;
	
	private int frontIndex = 0;
	
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public Queue() {
		arr = (T[]) new Object[TOTAL_SIZE];
	}
	
	/**
	 * @param element element to be added to the queue
	 */
	public void add(T element) {
		if (SIZE == TOTAL_SIZE) {
			expand();
		}
		arr[SIZE] = element;
		SIZE++;
	}
	
	/**
	 * @return first element in queue without removing it from queue
	 * @throws QueueException 
	 */
	public T peek() throws QueueException{
		if (isEmpty()) {
			throw new QueueException();
		}
		return arr[frontIndex];
		
	}
	
	/**
	 * @return first element in queue by removing it from queue
	 * @throws QueueException 
	 */
	public T poll() throws QueueException {
		if (isEmpty()) {
			throw new QueueException();
		}
		T element = arr[frontIndex];
		frontIndex++;
		SIZE--;
		if (SIZE > 9 && SIZE < TOTAL_SIZE/2) {
			contract();
		}
		return element;
		
	}
	
	/**
	 * @return size of queue
	 */
	public int size() {
		return SIZE;
	}
	
	/**
	 * 
	 * @return true if queue is empty else false
	 */
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	@SuppressWarnings("unchecked")
	private void expand() {
		T[] tmp = (T[]) new Object[SIZE*2];
		TOTAL_SIZE = SIZE*2;
		for (int i = 0; frontIndex + i < SIZE; i++) {
			tmp[i] = arr[frontIndex + i];
		}
		frontIndex = 0;
		arr = tmp;
	}
	
	@SuppressWarnings("unchecked")
	private void contract() {
		T[] tmp = (T[]) new Object[TOTAL_SIZE/2];
		TOTAL_SIZE = TOTAL_SIZE/2;
		for (int i = 0; i < SIZE; i++) {
			tmp[i] = arr[i + frontIndex];
		}
		frontIndex = 0;
		arr = tmp;
	}
}
