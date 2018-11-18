package com.practice.arrays2;

public class IndexOfTwoNumThatsEqToTarget {

	public static int[] twoSum(int[] nums, int target) {
		int output[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 17;
		int a[]=twoSum(nums, target);
		
		for(int i:a){
			System.out.println(i);
		}
		
	}

}
