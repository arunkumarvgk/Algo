package com.practice.stack;

import java.util.Stack;

public class MinStackAtSpace {

	int minEle;
	Stack<Integer> s = new Stack<>();

	int getMin() {
		if (s.isEmpty())
			return -1;
		return minEle;
	}

	int pop() {
		if (s.isEmpty())
			return -1;
		int t = s.pop();
		if (t >= minEle) {
			int m = minEle;
			minEle = t;
			return m;
		}
		return minEle - t;
	}

	void push(int x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
		} else if (x > minEle) {
			s.push(minEle - x);
		} else {
			s.push(minEle);
			minEle = x;
		}
	}

	public static void main(String[] args) {
		MinStackAtSpace m = new MinStackAtSpace();
		
		m.push(10);
		m.push(120);
		m.push(7);
		m.push(130);
		m.push(12);
		System.out.println(m.getMin());
		System.out.println("Popped "+m.pop());
		System.out.println(m.getMin());
		System.out.println("Popped "+m.pop());
		System.out.println(m.getMin());
		System.out.println("Popped "+m.pop());
		System.out.println(m.getMin());
	}

}
