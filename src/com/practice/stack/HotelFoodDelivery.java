package com.practice.stack;

import java.util.Scanner;

public class HotelFoodDelivery {

	static int maxSize = 9999;
	static int top = -1;
	static int arr[] = new int[maxSize];

	public static void push(int element) {
		if (top == maxSize - 1) {
			System.out.println("Overflow....");
			return;
		}

		arr[++top] = element;
	}

	public static void pop() {
		if (top < 0) {
			System.out.println("No Food");
		} else {
			System.out.println(arr[top--]);
		}

	}

	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);

		int noOfQueries=sn.nextInt();
		for (int i = 0; i < noOfQueries; i++) {
			int val = sn.nextInt();
			if (val  == 1) {
				pop();
			} else {
				push(sn.nextInt());
			}
		}
	}

}
