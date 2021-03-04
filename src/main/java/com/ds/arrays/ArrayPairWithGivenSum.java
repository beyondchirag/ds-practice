package com.ds.arrays;

import java.util.Arrays;

public class ArrayPairWithGivenSum {
//	Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16 // sorted and rotated
//	There is a pair (6, 10) with sum 16
	public static void main(String[] args) {
		int arr[] = { 11, 15, 8, 6, 9, 10 };
		//6 8 9 10 11 15
		int sum = 16;

		Arrays.sort(arr);

		findPair(arr, sum);

	}

	public static void findPair(int sortedArr[], int sum) {
		int startPointerIndex = 0;
		int lastPointerIndex = sortedArr.length - 1;

		while (lastPointerIndex > startPointerIndex) {
			int currentLastVal = sortedArr[lastPointerIndex];
			int currentStartVal = sortedArr[startPointerIndex];
			int currentSum = sortedArr[startPointerIndex] + sortedArr[lastPointerIndex];
			if (currentSum == sum) {
				System.out.println("Pair found [" + currentStartVal + "," + currentLastVal + "]");
				lastPointerIndex = lastPointerIndex - 1;
				startPointerIndex = startPointerIndex + 1;
			} else if (currentSum > sum) {
				lastPointerIndex = lastPointerIndex - 1;
			} else {
				startPointerIndex = startPointerIndex + 1;
			}

		}

	}
}

// since the array is sorted number at left index will always be less or equal to right index
// have one pointer at start and other at end
// if sum of these two values == 16, then pair found
// if sum of these two values > 16, then move right index inwards
// if sum of these two values < 16, then move left index inwards
// check if there is a way to do this without sorting