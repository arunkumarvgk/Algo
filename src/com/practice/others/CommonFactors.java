package com.practice.others;

import java.util.Scanner;

public class CommonFactors {
	public static int gcd(int a,int b){
		   return (b == 0) ? gcd(b,a%b):a;
	}
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int a = sn.nextInt();
		int b = sn.nextInt();
		int n= gcd(a,b);
		int ans=0;
		
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				ans ++ ;
		          if(i == n/i) ans--;
			}
		}
		
		System.out.println(ans);
	}

}
