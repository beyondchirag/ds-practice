package com.ds.arrays;

import java.util.Arrays;


public class ArrayRotation {

//	Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 
//	Input 	arr[] =	[1, 2, 3, 4, 5, 6, 7], d = 2, n =7
//	Output 	arr[] = [3, 4, 5, 6, 7, 1,s]
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int[] output = rotate(arr, 2, 7);
		Arrays.stream(output).forEach(System.out::println);
	}

	private static int[] rotate(int[] arr, int elementCountToShift, int arrSize) {
//		new array of same size as originals
		int[] output = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
//			define element position in new array based on shift index and sizesO	
			if((arrSize - elementCountToShift + i) < arrSize) {
				output[arrSize - elementCountToShift + i] = arr[i];
			}else {
				output[i - elementCountToShift] = arr[i];
			}
		}
		return output;
	}

}


// Check if it can be done without creating a new array - potential problem in case of large arrays
// too many iterations to set the values - can be reconsidered since arrays are continuous memory segments 