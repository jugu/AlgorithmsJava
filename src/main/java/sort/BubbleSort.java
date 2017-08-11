package sort;

/**
 * @author jugudanniesundar
 *
 */
public class BubbleSort extends Sort {

	@Override
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for (int i: arr)
			System.out.print(i+" ");
	}
	
	
}
