package com.practice.arrays;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int decimal = 0;
	    int p = 0;
	    int binaryNumber= sn.nextInt();
	    while(true){
	      if(binaryNumber == 0){
	        break;
	      } else {
	          int temp = binaryNumber%10;
	          decimal += temp*Math.pow(2, p);
	          binaryNumber = binaryNumber/10;
	          p++;
	       }
	    }
		
		System.out.println(decimal);
	}

}
