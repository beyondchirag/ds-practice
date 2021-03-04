package com.ds.arrays;

public class ArrayRotationCount {
//	Input : arr[] = {15, 18, 2, 3, 6, 12}
//	Output: 2
//	Explanation : Initial array must be {2, 3,	6, 12, 15, 18}. We get the given array after rotating the initial array twice.
	public static void main(String[] args) {
//		int arr[] = {15, 18, 2, 3, 6, 12};
//		int arr[] = { 5, 7, 9, 11, 12 };
		int arr[] = { 7, 9, 11, 12, 5 };

		for (int i = 0; i < arr.length; i++) {
			if (((i + 1) >= arr.length)) {
				System.out.println("Already sorted");
			} else if (arr[i] < arr[i + 1]) {
				continue;
			} else {
				System.out.println(i + 1);
				break;
			}
		}
	}
}


//iterate till the next element is less than current element