package com.practice.stack;

public class GetMinInStack {
	int max = 10;
	int[] arr = new int[max];
	int[] arr2 = new int[max];
	int top = -1;

	public void push(int val) {
		if (top >= max) {
			System.out.println("Stack Full");
			return;
		}

		++top;

		if (top == 0) {
			arr[top] = val;
			arr2[top] = val;
			return;
		}

		if (arr2[top-1] > val) {
			arr2[top] = val;
			arr[top] = val;
		} else {
			arr[top] = val;
			arr2[top] = arr2[top - 1];
		}
 	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack empty");
			return -999;
		}

		return arr[top--];
	}

	public int getMin() {
		return arr2[top];
	}

	public static void main(String[] args) {
		GetMinInStack s = new GetMinInStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		s.push(16);
		
		System.out.println(s.getMin());
		
		s.pop();
		s.pop();
		
		System.out.println(s.getMin());
	}

}
