package com.practice.linkedList;

public class SwapKthNodeBothEnds {
	NodeDLL head;
	NodeDLL tail;
	static int size;

	public void insert(int data) {
		if (size == 0) {
			tail = head = new NodeDLL(data);
			size++;
			return;
		}

		NodeDLL cur = new NodeDLL(data);
		cur.next = head;
		head.prev = cur;
		head = cur;
		size++;
	}

	public void swap(int k) {
		if (k > size || k > (size / 2) || k == 0) {
			System.out.println("K should be less than size and greater than 0 and should be <= " + (size / 2));
			return;
		}
		NodeDLL cur1 = head;
		NodeDLL cur2 = tail;

		for (int i = 0; i < k - 1; i++) {
			cur1 = cur1.next;
			cur2 = cur2.prev;
		}
		System.out.println(cur1.data + " " + cur2.data);

		if (cur1.next != null) {
			cur1.next.prev = cur2;
		}

		if (cur1.prev != null) {
			cur1.prev.next = cur2;
		}

		if (cur2.next != null) {
			cur2.next.prev = cur1;
		}

		if (cur2.prev != null) {
			cur2.prev.next = cur1;
		}

		NodeDLL temp1 = cur1.prev;
		NodeDLL temp2 = cur1.next;

		cur1.prev = cur2.prev;
		cur1.next = cur2.next;

		cur2.prev = temp1;
		cur2.next = temp2;
		if (k == 1) {
			head = cur2;
		}
	}

	public void print() {
		NodeDLL cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SwapKthNodeBothEnds s = new SwapKthNodeBothEnds();
		s.insert(100);
		s.insert(90);
		s.insert(80);
		s.insert(70);
		s.insert(60);
		s.insert(50);
		s.insert(40);
		s.insert(30);
		s.insert(20);
		s.insert(10);
		s.print();
		s.swap(4);
		s.print();
	}

}
