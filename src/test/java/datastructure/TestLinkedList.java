package datastructure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import datastructure.list.Iterator;
import datastructure.list.LinkedList;
import datastructure.list.LinkedListException;

/**
 * @author jugudanniesundar
 *
 */
public class TestLinkedList {
	
	private LinkedList<Integer> integerList;
	
	
	/**
	 * 
	 */
	@Test
	public void testAdd() {
		integerList = new LinkedList<>();
		assertNotNull(integerList);
		assertTrue(integerList.isEmpty());
		integerList.add(1);
		assertEquals(1, integerList.size());
		integerList.add(2);
		assertEquals(2, integerList.size());
		integerList.add(3);
		assertEquals(3, integerList.size());
	}
	
	/**
	 * @throws LinkedListException 
	 * 
	 */
	@Test
	public void testRemove() throws LinkedListException {
		integerList = new LinkedList<>();
		assertNotNull(integerList);
		assertTrue(integerList.isEmpty());
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		assertEquals(3, integerList.size());
		integerList.remove(3);
		assertEquals(2, integerList.size());
	}
	
	/**
	 * 
	 */
	@Test
	public void testIterator() {
		integerList = new LinkedList<>();
		assertNotNull(integerList);
		assertTrue(integerList.isEmpty());
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		Iterator<Integer> itr = integerList.iterator();
		int[] actual = new int[3];
		int i = 0;
		while (itr.hasNext()) {
			Integer x = itr.next();
			actual[i++] = x;
		}
		int expected[] = {1,2,3};
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * 
	 */
	@Test
	public void testIteratorComplex() {
		
		class Tmp {
			int a;
			int b; 
			int c;
			public Tmp(int a, int b, int c) {
				this.a = a;
				this.b = b;
				this.c = c;
			}
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + a;
				result = prime * result + b;
				result = prime * result + c;
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Tmp other = (Tmp) obj;
				if (a != other.a)
					return false;
				if (b != other.b)
					return false;
				if (c != other.c)
					return false;
				return true;
			}
			
			
		}
		LinkedList<Tmp> tmpList = new LinkedList<>();
		assertNotNull(tmpList);
		assertTrue(tmpList.isEmpty());
		tmpList.add(new Tmp(1,2,3));
		tmpList.add(new Tmp(4,5,6));
		tmpList.add(new Tmp(1,2,5));
		Iterator<Tmp> itr = tmpList.iterator();
		Tmp[] actual = new Tmp [3];
		int i = 0;
		while (itr.hasNext()) {
			Tmp x = itr.next();
			actual[i++] = new Tmp(x.a, x.b, x.c);
		}
		Tmp[] expected = {
				new Tmp(1, 2, 3),
				new Tmp(4, 5, 6),
				new Tmp(1, 2, 5)
		};
		assertArrayEquals(expected, actual);
	}
	
}
