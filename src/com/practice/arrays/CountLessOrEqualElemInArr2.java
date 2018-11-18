package com.practice.arrays;

import java.util.Scanner;

public class CountLessOrEqualElemInArr2 {
	
	public static int[] getCount(int arr1[],int arr2[],int n,int m){
		int out[]=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr1[i]>=arr2[j]){
					out[i]++;
				}
			}
		}
		return out;
	}
	
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int noTestCases=sn.nextInt();
		int i=0;
		for(i=0;i<noTestCases;i++){
			int n=sn.nextInt();
			int m=sn.nextInt();
			int arr1[]= new int[n];
			int arr2[]= new int[m];
			
			
			for(int j=0;j<n;j++){
				arr1[j]=sn.nextInt();
			}
			for(int j=0;j<m;j++){
				arr2[j]=sn.nextInt();
			}
			int output[]= new int[n];
			
			output=getCount(arr1,arr2,n,m);
			for(int k:output){
				System.out.print(k+" ");
			}
		}
	}

}
