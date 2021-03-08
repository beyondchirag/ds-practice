package com.ds.arrays;

public class ArrayMinmumElementSortedRotated {
//	Input: { 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4 }
//	Output: 1

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4 };
		System.out.println(findMinimum(arr, 0, arr.length - 1));
	}

	static int findMinimum(int arr[], int lowerIndex, int higherIndex) {

		int output = 0;
		int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;

		if (higherIndex < lowerIndex) {
			// corner case
			output = arr[0];
		} else if (midIndex == 0) {
			// only 1 element
			output = arr[lowerIndex];
		} else if (midIndex < higherIndex && arr[midIndex + 1] < arr[midIndex]) {
			// adjacent to mid index is the minimum
			output = arr[midIndex + 1];
		} else if (midIndex > lowerIndex && arr[midIndex] < arr[midIndex - 1]) {
			// midIndex is the minimum
			output = arr[midIndex];
		} else if (arr[higherIndex] > arr[midIndex]) {
			// move towards left
			output = findMinimum(arr, lowerIndex, midIndex - 1);
		} else {
			// move towards right
			output = findMinimum(arr, midIndex + 1, higherIndex);
		}
		return output;
	}
}

//similar to binary search - get the middle value and based on that decide to move left or right