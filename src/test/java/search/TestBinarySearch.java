package search;

import static search.BinarySearch.binarySearchOnSortedAscendingArrayNonRecursive;
import static search.BinarySearch.binarySearchOnSortedDescendingArrayNonRecursive;
import static search.BinarySearch.binarySearchOnSortedAscendingArrayRecursive;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * @author jugudanniesundar
 *
 */
public class TestBinarySearch {
	
	/**
	 * Method to test and validate binary search on sorted array using non-recursive algorithm
	 */
	@Test
	public void testBinarySearchOnSortedArrayNonRecursive() {
		int[] arr = null;
		int item = 0;
		int index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index); 
		
		arr = new int[] {0};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0, 1};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0, 1, 99};
		item = 0;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(0, index);
		
		arr = new int[] {1, 1, 2, 2, 3};
		item = 1;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertTrue(index >= 0);
		
		arr = new int[] {1, 1, 3, 1, 2};
		item = 1;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {1, 1, 0, -1, -2};
		item = 1;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0, 1, 99};
		item = 1;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(1, index);
		
		arr = new int[] {0, 1, 99};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(2, index);
		
		arr = new int[] {1, 2, 3, 5, 7, 8, 99};
		item = 99;
		index = binarySearchOnSortedAscendingArrayNonRecursive(arr, item);
		assertEquals(6, index);
		
		arr = new int[] {};
		item = 99;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index); 
		
		arr = new int[] {0};
		item = 99;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0};
		item = 99;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0, 1};
		item = 99;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {0, 1, 99};
		item = 0;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {3, 3, 2, 2, 1};
		item = 1;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertTrue(index >= 0);
		
		arr = new int[] {3, 1,0, 1, 2};
		item = 1;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(-1, index);
		
		arr = new int[] {1, 1, 0, -1, -2};
		item = 1;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertTrue(index >= 0);
		
		arr = new int[] {99, 1, 0};
		item = 0;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(2, index);
		
		arr = new int[] {99, 1, 0};
		item = 99;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertEquals(0, index);
		
		arr = new int[] {99, 6, 5, 3, 2, 1, 1};
		item = 1;
		index = binarySearchOnSortedDescendingArrayNonRecursive(arr, item);
		assertTrue(index >= 0);
	}
	
	
	/**
	 * Method to test and validate binary search on sorted array using recursive algorithm
	 */
	@Test
	public void testBinarySearchOnSortedArrayRecursive() {
		int[] arr = {0, 2, 4, 6};
		int item = 4;
		int index = binarySearchOnSortedAscendingArrayRecursive(arr, item, 0, arr.length - 1);
		assertTrue (index >= 0);
	}
}
