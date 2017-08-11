package sort;

import org.junit.Test;
import sort.BubbleSort;
import static org.junit.Assert.assertArrayEquals;

/**
 * @author jugudanniesundar
 *
 */
public class TestSort {
	/**
	 * Test Method to validate bubble sort
	 */
	@Test
	public void testBubbleSort() {
		int arr[] = new int[]{5, 6, 2};
		BubbleSort bubble = new BubbleSort();
		bubble.sort(arr);
		int expected[] = new int[]{2, 5, 6};
		assertArrayEquals(expected, arr);
	}
}
