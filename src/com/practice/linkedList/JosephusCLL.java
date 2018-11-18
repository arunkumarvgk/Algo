package com.practice.linkedList;

public class JosephusCLL {
	Node head;
	Node tail;
	static int size;

	public void solveJosephusProblem(int m) {
		Node cur = head;
		Node prev = head;
		while (size > 1) {
			for (int i = 0; i < m; i++) {
				prev = cur;
				cur = cur.next;
			}
			System.out.println(cur.data);
			if (cur == head) {
				head = cur.next;
			} 
			prev.next = cur.next;
			size--;
			cur = prev.next;
			
		}
	}

	public void addToStart(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head = n;
			tail = n;
			head.next = head;
		} else {
			n.next = head;
			tail.next = n;
			head = n;
		}
		size++;
	}

	public void print() {
		if (size != 0) {
			Node traverse = head;
			do {
				System.out.print(" [" + traverse.data + "]");
				traverse = traverse.next;
			} while (traverse != head);
		} else {
			System.out.println("Empty CLL");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		JosephusCLL cl = new JosephusCLL();
		/*cl.addToStart(14);
		cl.addToStart(13);
		cl.addToStart(12);
		cl.addToStart(11);
		cl.addToStart(10);
		cl.addToStart(9);
		cl.addToStart(8);
		cl.addToStart(7);
		cl.addToStart(6);*/
		cl.addToStart(5);
		cl.addToStart(4);
		cl.addToStart(3);
		cl.addToStart(2);
		cl.addToStart(1);
		cl.print();
		cl.solveJosephusProblem(2);
		cl.print();
	}

}
