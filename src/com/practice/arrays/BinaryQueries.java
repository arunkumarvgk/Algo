package com.practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryQueries {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int N= sn.nextInt();
		int Q= sn.nextInt();
		String number = null;
		
		int arr[]= new int[N];
		for(int i=0;i<N;i++){
			arr[i]=sn.nextInt();
		}
		
		for(int j=0;j<Q;j++){
			String s[] = sn.nextLine().split(" ");
			System.out.println(s[0]+"--");
			if(Integer.parseInt(s[0])==1){
				int flipBit=Integer.valueOf(s[1]);
				arr[flipBit]=~arr[flipBit];
			}else{
				int from=Integer.valueOf(s[1]);
				int to=Integer.valueOf(s[2]);
				int arr2[]= new int[to-from+1];
				arr2=Arrays.copyOfRange(arr,from-1 , to-1);
				arr= new int[arr2.length];
				arr=Arrays.copyOf(arr2, arr2.length);
			}
		}

		System.out.println(arr[arr.length-1]==0?"Even":"Odd");
	}

}
