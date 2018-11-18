package com.practice.queue;

public class Queues {

	static int queue[] = new int[10];
	static int rear = -1;
	static int front = -1;
	static final int MAX_SIZE = 10;

	public void enqueue(int elem) {
		if (rear == MAX_SIZE - 1) {
			System.err.println("Overflow");
			return;
		}
		queue[++rear] = elem;

	}

	public void dequeue() {
		if (front == rear) {
			System.out.println("Underflow");
			return;
		}
		System.out.println("Removing : " + queue[++front]);
	}

	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queues q = new Queues();
		q.dequeue();
		q.display();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(355);
		//q.display();
	}

}
