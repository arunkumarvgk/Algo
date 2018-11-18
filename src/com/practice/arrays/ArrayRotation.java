package com.practice.arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int rightArr[]=new int[arr.length]; 
		int leftArr[]=new int[arr.length];
		int rotate=1;
		int pos =0;
		int len=arr.length;
		for(int i=0;i<len;i++){
			pos=((rotate+i-1)%len);
			rightArr[pos]=arr[i];
		}
		
		for(int i:rightArr){
			System.out.print(i+"  ");
		}
	}

}
