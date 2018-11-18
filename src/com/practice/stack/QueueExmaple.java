package com.practice.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmaple {

	public static Queue<Integer> q = new LinkedList<>();
	static int size = 0;

	public static void push(int val) {
		q.add(val);
		int size2 = q.size();
		size++;

		while (size2 > 1) {
			q.add(q.remove());
			size2--;
		}
	}

	public static int pop() {
		size--;
		return q.poll();
	}
	
	public static void dissplay(){
		Queue<Integer> q2 = new LinkedList<>(q);
		for(int i=0;i<size;i++){
			System.out.print(" "+q2.poll());
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		dissplay();      
		System.out.println(pop());
		dissplay();
		System.out.println(pop());
		dissplay();
		System.out.println(pop());
		dissplay();
		System.out.println(pop());
		dissplay();
		System.out.println(pop());
		
	}

}
