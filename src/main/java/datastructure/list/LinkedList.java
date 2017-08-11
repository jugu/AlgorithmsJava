package datastructure.list;

/**
 * @author jugudanniesundar
 * @param <T> 
 *
 */
public class LinkedList<T> extends List<T> {
	@SuppressWarnings("rawtypes")
	private class Node implements Iterator{
		private T current;
		private Node next;
		@Override
		public T next() {
			// TODO Auto-generated method stub
			Node tmp = next;
			next = next.next;
			return tmp.current;
		}
		@Override
		public boolean hasNext() {
			return next != null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	/**
	 * 
	 */
	public LinkedList() {
		size = 0;
	}
	
	/**
	 * @param element Element to be added to the linked list
	 */
	public void add(T element) {
		if (head == null) {
			head = new Node();
			head.current = element;
			tail = head;
		} else {
			tail.next = new Node();
			tail.next.current = element;
			tail = tail.next;
		}
		size++;
	}
	
	/**
	 * @param element Element to be removed from the linked list
	 * @throws LinkedListException 
	 */
	public T remove(T element) throws LinkedListException{
		if (size == 0 || head == null) {
			throw new LinkedListException();
		}
		Node tmp = head;
		Node prev = null;
		T retElem = null;
		while (tmp != null) {
			if (tmp.current.equals(element)) {
				retElem = tmp.current;
				if (prev != null) {
					prev.next = tmp.next;
				}
				tmp.current = null;
				tmp.next = null;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		size--;
		return retElem;
	}
	
	/**
	 * @return Size of linkedlist
	 */
	public int size() {
		return size;
		
	}
	
	/**
	 * @return True if list is empty, else False
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @return head of the linkedlist
	 */
	@SuppressWarnings("unchecked")
	public Iterator<T> iterator() {
		Node tmp = new Node();
		tmp.next = head;
		return tmp;
	}
}
