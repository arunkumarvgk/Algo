package com.practice.arrays;

import java.util.Scanner;

public class MatrxPairs {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int tc = sn.nextInt();
		
		for (int h = 0; h < tc; h++) {
			int l=0;
			int p = sn.nextInt();
			for(int i=0;i<p;i++){
				for(int j=0;j<2;j+=2){
					if(sn.nextInt() == sn.nextInt()){
						l++;
					}
				}
			}
			System.out.println(l);
		}

	}

}
