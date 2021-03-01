package com.ds.arrays;

import java.util.Arrays;

public class ArrayReverse {

//	Input 	arr[] =	[1, 2, 3, 4, 5, 6, 7]
//	Output 	arr[] = [7, 6, 5, 4, 3, 2, 1]
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7};
		int output[] = reverse(arr);
		Arrays.stream(output).forEach(System.out::println);
		
	}

	private static int[] reverse(int[] arr) {
		for(int i=0;i< arr.length/2;i++) {
			int tempVar = 0;
			tempVar = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tempVar;
		}
		return arr;
	}

}

// iterate over half length, keep swapping the variables