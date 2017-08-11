package util;

/**
 * @author jugudanniesundar
 *
 */
public class Util {
	/**
	 * Method to validate if the input array parameter is sorted in ascending manner
	 * @param arr integer array
	 * @return true if array is sorted ascending, else returns false
	 */
	public static boolean isSortedAscending(int [] arr) {
		if (isNull(arr)) {
			return false;
		}
		for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
			if (arr[j] < arr[i] ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Method to validate if the input array is sorted in descending mannger
	 * @param arr integer array
	 * @return true if array is sorted descending, else returns false
	 */
	public static boolean isSortedDescending(int [] arr) {
		if (isNull(arr)) {
			return false;
		}
		for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
			if (arr[j] > arr[i] ) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Method to validate if the input object is not null
	 * @param o input object
	 * @return true if object is not null
	 */
	public static boolean isNotNull(Object o) {
		return o != null;
	}
	
	/**
	 * Method to validate if the input object is null
	 * @param o input object
	 * @return true if object is null
	 */
	public static boolean isNull(Object o) {
		return o == null;
	}
	
}
