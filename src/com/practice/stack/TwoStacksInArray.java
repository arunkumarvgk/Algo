package com.practice.stack;

public class TwoStacksInArray {

	static int size = 10;
	static int arr[] = new int[size];

	static int top1 = -1;
	static int top2 = size;

	public static void push1(int elem) {
		if (arr[top1 + 1] == 0) {
			arr[++top1] = elem;
		}
	}

	public static void push2(int elem) {
		if (arr[top2 - 1] == 0) {
			arr[--top2] = elem;
		}
	}

	public static void pop1() {
		arr[top1]=0;
		top1--;
	}
	
	public static void pop2() {
		arr[top2]=0;
		top2++;
	}
	
	public static void print() {
		System.out.println("Stack 1 ");
		int t1=top1;
		int t2=top2;
		while (!(t1 == -1)) {
			System.out.print(arr[t1--] + " ");
		}
		System.out.println();

		System.out.println("Stack 2");
		while (!(t2 == size)) {
			System.out.print(arr[t2++] + " ");
		}
		System.out.println();
		System.out.println("=================================");
	}

	public static void main(String[] args) {
		push1(10);
		push2(100);
		push1(20);
		push2(200);
		push1(30);
		push2(300);
		push1(40);
		push2(400);
		push1(50);
		print();
		pop1();
		pop2();
		pop2();
		print();
		push1(60);
		print();
		push1(70);
		push1(80);
		print();
	}

}
