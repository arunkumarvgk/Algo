package com.practice.hash;

public class Linkedlist {
	Node head;

	public Linkedlist(int data) {
		head = new Node(data);
	}

	public Node getHead() {
		return head;
	}
	
	public void setHead(Node node) {
		head=node;
	}
	
	public void display() {
		Node node = head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("");
		System.out.println("");
	}

	public void insertFirst(Node node) {
		if (head == null) {
			head = node;
			return;
		}

		node.next = head;
		head = node;
	}

	public void deleteFirst() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	public void insertLast(Node node) {
		if (head == null) {
			head = node;
			return;
		}

		Node cur = head;

		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = node;
	}

	public void deleteLast() {
		if (head == null) {
			return;
		}
		Node cur = head;
		Node temp = null;
		while (cur.next != null) {
			temp = cur;
			cur = cur.next;
		}
		temp.next = null;
	}

	public void insertWithPositin(Node node, int pos) {
		if (pos == 0) {
			node.next = head;
			head = node;
			return;
		}

		Node cur = head;

		for (int i = 0; i < pos - 1; i++) {
			cur = cur.next;
			if (cur == null) {
				System.out.println("Position " + pos + " unavilable");
				break;
			}
		}

		node.next = cur.next;
		cur.next = node;
	}

	public void deleteWithPositin(int pos) {
		if (pos == 0) {
			head = head.next;
			return;
		}

		Node cur = head;
		Node temp = null;
		for (int i = 0; i < pos; i++) {
			temp = cur;
			cur = cur.next;
			if (cur == null) {
				System.out.println("Position " + pos + " unavilable");
				break;
			}
		}

		temp.next = cur.next;
	}

	public void deleteOnValue(int val) {
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		}

		if (head.data == val) {
			head = head.next;
			return;
		}

		Node cur = head;
		Node temp = head;
		while (cur != null) {
			if (cur.data == val) {
				temp.next = cur.next;
			}
			temp = cur;
			cur = cur.next;
		}
	}

}