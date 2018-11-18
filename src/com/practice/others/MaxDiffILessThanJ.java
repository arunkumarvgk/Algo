package com.practice.others;

public class MaxDiffILessThanJ {

	public static int maxDiff(int[] arr, int size) {
		int min = arr[0]; // We will have min element always
		int max_diff = arr[1] - arr[0]; // check for max diff with each elem in
										// arr update if found

		for (int i = 1; i < size; i++) {
			if (arr[i] - min > max_diff) {
				max_diff = arr[i] - min;
			}

			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return max_diff;
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 0, 3, 5, 6, 1 };
		int arr[] = { 8, 9, 7, 6, 50 };

		System.out.println(maxDiff(arr, arr.length));

	}

}
