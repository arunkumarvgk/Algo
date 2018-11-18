package com.practice.arrays;

import java.util.Scanner;

public class MicroAndArrayUpdate {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int noTestCases = sn.nextInt();
		int i = 0;
		for (i = 0; i < noTestCases; i++) {
			int n = sn.nextInt();
			int m = sn.nextInt();
			int arr[] = new int[n];
            int min=Integer.MAX_VALUE;
			for (int j = 0; j < n; j++) {
				arr[j] = sn.nextInt();
				if(arr[j]<min){
    				min=arr[j];
    			}
			}
			
			System.out.println(m>min?m-min:0);
		}

	}

}
