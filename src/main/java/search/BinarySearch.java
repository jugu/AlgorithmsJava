package search;

import static util.Util.*;

/**
 * @author jugudanniesundar
 *
 */
public class BinarySearch {
	
	
	/**
	 * Method to find and return the index of search element in a sorted array (ascending)
	 * @param arr a sorted ascending array
	 * @param searchItem integer to be searched inside the array
	 * @return index of searchItem in the array. Returns -1 if not found
	 */
	public static int binarySearchOnSortedAscendingArrayNonRecursive(int[] arr, int searchItem) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		if (!isSortedAscending(arr)) {
			return -1;
		}
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int midIndex = arr.length/2;
		while (startIndex <= endIndex) {
			if (arr[midIndex] < searchItem) {
				startIndex = midIndex + 1;
			} else if (arr[midIndex] > searchItem){
				endIndex = midIndex - 1;
			} else {
				return midIndex;
			}
			midIndex = (endIndex + startIndex)/2;
		}
		return -1;
	}
	
	/**
	 * Method to perform binary search on sorted(descending) array using non recursive approach
	 * @param arr sorted descending non empty array
	 * @param searchItem integer to be searched within the array
	 * @return position of the searchItem within the array. Returns -1 if not found.
	 */
	public static int binarySearchOnSortedDescendingArrayNonRecursive(int [] arr, int searchItem) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		if (!isSortedDescending(arr)) {
			return -1;
		}
		int startIndex = 0;
		int endIndex = arr.length - 1;
		int midIndex = arr.length/2;
		while (startIndex <= endIndex) {
			if (arr[midIndex] > searchItem) {
				startIndex = midIndex + 1;
			} else if (arr[midIndex] < searchItem){
				endIndex = midIndex - 1;
			} else {
				return midIndex;
			}
			midIndex = (endIndex + startIndex)/2;
		}
		return -1;
	}
	
	/**
	 * Method to perform binary search on sorted array (ascending) in recursive anner
	 * @param arr sorted ascending array
	 * @param searchItem integer to be searched in the array
	 * @param loIndex lower index for range of the array to be searched 
	 * @param hiIndex upper index for range of the array to be searched
	 * @return index at which element was found in array. Returns -1 if not found.
	 */
	public static int binarySearchOnSortedAscendingArrayRecursive(int [] arr, int searchItem, int loIndex, int hiIndex) {
		if (arr == null || arr.length == 0) {
			return -1;
		}
		if (!isSortedAscending(arr)) {
			return -1;
		}
		if (loIndex > hiIndex) {
			return -1;
		}
		int midIndex = loIndex + (hiIndex - loIndex)/2;
		if (arr[midIndex] > searchItem) {
			return binarySearchOnSortedAscendingArrayRecursive(arr, searchItem, loIndex, midIndex - 1);
		} else if (arr[midIndex] < searchItem) {
			return binarySearchOnSortedAscendingArrayRecursive(arr, searchItem, midIndex + 1, hiIndex);
		}
		return midIndex;
	}
	
}
