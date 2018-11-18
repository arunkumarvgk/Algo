package com.practice.linkedList;

public class CLL {

	Node head;
	Node tail;
	static int size;

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

	public void insertToSortedList(Node n) {
		if (size == 0) {
			return;
		}

		if (n.data <= head.data) {
			n.next = head;
			tail.next = n;
			head = n;
			size++;
			return;
		}

		if (n.data >=  tail.data) {
			tail.next = n;
			n.next = head;
			tail = head;
			size++;
			return;
		}
		Node cur = head;

		while (cur.next != head) {
			if (n.data >= cur.data && n.data <= cur.next.data) {
				n.next = cur.next;
				cur.next = n;
				return;
			}
			cur = cur.next;
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
		CLL cl = new CLL();
		cl.addToStart(40);
		cl.addToStart(30);
		cl.addToStart(20);
		cl.addToStart(10);
		cl.print();
		cl.insertToSortedList(new Node(32));
		cl.insertToSortedList(new Node(0));
		cl.insertToSortedList(new Node(32));
		cl.insertToSortedList(new Node(34));
		cl.insertToSortedList(new Node(34));
		cl.insertToSortedList(new Node(31));
		cl.insertToSortedList(new Node(99));
		cl.print();
	}

}
