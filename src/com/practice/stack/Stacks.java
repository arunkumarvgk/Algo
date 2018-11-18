package com.practice.stack;

public class Stacks {
	static int maxSize = 5;
	static int top = 0;
	static int arr[]=new int[maxSize];

	public static void push(int element) {
		if (top == maxSize-1) {
			System.out.println("Overflow....");
			return;
		}
		
		arr[top]=element;
		top++;
	}
	
	public static int pop(){
		if(top<0){
			return -1;
		}else{
			return arr[--top];
		}
		
	}
	
	public static void print(){
		System.out.println();
		for(int i=top-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		print();
		pop();
		push(34);
		print();
		
	}

}
