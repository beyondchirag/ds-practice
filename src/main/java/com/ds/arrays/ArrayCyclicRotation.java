package com.ds.arrays;

import java.util.Arrays;

public class ArrayCyclicRotation {
//	Input 	arr[] =	[1, 2, 3, 4, 5, 6, 7]
//	Output 	arr[] = [2, 3, 4, 5, 6, 7, 1]
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int output[] = cyclicRotate(arr);
		Arrays.stream(output).forEach(System.out::println);

	}

	private static int[] cyclicRotate(int[] arr) {
		int tempVar = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = tempVar;
		return arr;
	}

}

// retrieve the first element of the original list
// swap the elements
// insert the last element at the end