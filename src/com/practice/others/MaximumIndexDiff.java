package com.practice.others;

public class MaximumIndexDiff {

	static int maxDiff(int arr[], int n) {
		// Initialize diff, current sum and max sum
		int diff = arr[1] - arr[0];
		int curr_sum = diff;
		int max_sum = curr_sum;

		for (int i = 1; i < n - 1; i++) {
			// Calculate current diff
			diff = arr[i + 1] - arr[i];

			// Calculate current sum
			if (curr_sum > 0)
				curr_sum += diff;
			else
				curr_sum = diff;

			// Update max sum, if needed
			if (curr_sum > max_sum)
				max_sum = curr_sum;
		}

		return max_sum;
	}
	
	static int maxDiff2(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++) 
        {
            for (j = i + 1; j < arr_size; j++) 
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }
	

	public static void main(String[] args) {
		int arr[] = { 2, 0, 3, 5, 6, 1 };
		int arr1[] = { 9, 8, 7, 6, 5 };
		int diff = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					diff = (j - i) > diff ? (j - i) : diff;
				}
			}
		}

		System.out.println(diff);
		System.out.println(maxDiff2(arr, arr.length));
		System.out.println(maxDiff(arr, arr.length));
	}

}
