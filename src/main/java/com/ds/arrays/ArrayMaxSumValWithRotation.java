package com.ds.arrays;

public class ArrayMaxSumValWithRotation {
//	Input: arr[] = {1, 20, 2, 10}
//	Output: 72
//	We can get 72 by rotating array twice.
//	{2, 10, 1, 20}
//	20*3 + 1*2 + 10*1 + 2*0 = 72

	public static void main(String[] args) {
//		int arr[] = { 1, 20, 2, 10 };
		int arr[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int previousRotation = 0;
		int totalArraySum = 0;
		int highestSum = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int data = i * arr[i];
			totalArraySum = totalArraySum + arr[i];
			previousRotation = previousRotation + data;
		}
		highestSum = previousRotation;
		System.out.println("Total sum of elements " + totalArraySum);
		System.out.println("0 Rotation : " + previousRotation);

		for (int rotation = 1; rotation < len; rotation++) {
			int rotatedSum = previousRotation + totalArraySum - arr[len - rotation] * len;
			System.out.println(rotation + " Rotation : " + rotatedSum);
			previousRotation = rotatedSum;
			if (highestSum < rotatedSum) {
				highestSum = rotatedSum;
			}
		}

		System.out.println("Highest " + highestSum);

	}
}

// normal shifting and computation would take len^2 iterations to compute all the possible sums
// we can comute the next rotation sum using current rotation sum
//
//Rotation0 = a[0]*0 + a[1]*1 + a[2]*2 + a[3]*3 + a[4]*4
//Rotation1 = a[0]*1 + a[1]*2 + a[2]*3 + a[3]*4 + a[4]*0
//-------------------------------------------------------
//R1 - R0   = a[0]   + a[1]   + a[2]   + a[3] -a[4]*4 == sum of all elements -a[4]*5
//
//
//Rotation1 = a[0]*1 + a[1]*2 + a[2]*3 + a[3]*4 + a[4]*0
//Rotation2 = a[0]*2 + a[1]*3 + a[2]*4 + a[3]*0 + a[4]*1
//------------------------------------------------------
//R2 - R1   = a[0]   + a[1]   + a[2]   - a[3]*4 + a[4] == sum of all elements -a[3]*5
//
//
//
//Rotation2 = a[0]*2 + a[1]*3 + a[2]*4 + a[3]*0 + a[4]*1
//Rotation3 = a[0]*3 + a[1]*4 + a[2]*0 + a[3]*1 + a[4]*2
//------------------------------------------------------
//R3 - R2   = a[0]   + a[1]   - a[2]*4 + a[3] + a[4] == sum of all elements -a[2]*5 == sum of all elements - a[len - rotation]*len




