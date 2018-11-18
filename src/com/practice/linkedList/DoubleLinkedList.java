package com.practice.linkedList;

public class DoubleLinkedList {
	NodeDLL head;
	static int size;

	public boolean isHeadNull() {
		return (head == null);
	}

	public void addFront(int data) {
		NodeDLL node = new NodeDLL(data);
		if (isHeadNull()) {
			head = node;
			size++;
			return;
		}

		node.next = head;
		head.prev = node;
		head = node;
		size++;
	}

	public void addLast(int data) {
		NodeDLL node = new NodeDLL(data);
		if (isHeadNull()) {
			head = node;
			return;
		}
		NodeDLL cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}

		cur.next = node;
		node.prev = cur;
		size++;
	}

	public void addToPosition(int pos, int data) {

		if (pos == 0) {
			System.out.println("use postion 1 instead of 0 to insert front");
			return;
		}

		if (pos == 1) {
			addFront(data);
			return;
		}

		if (pos == size + 1) {
			addLast(data);
			return;
		}

		if (size < pos) {
			System.out.println("Position not available current size " + size);
			return;
		}

		NodeDLL node = new NodeDLL(data);
		NodeDLL cur = head;

		for (int i = 0; i < pos - 1; i++) {
			if (cur.next != null) {
				cur = cur.next;
			}
		}

		cur.prev.next = node;
		node.prev = cur.prev;
		node.next = cur;
		cur.prev = node;
		size++;
	}

	public void addAfterElement(int data, int element) {
		if (size == 0 || head == null) {
			System.out.println("DLL is empty");
			return;
		}

		NodeDLL node = new NodeDLL(data);
		NodeDLL cur = head;

		while (cur != null) {
			if (cur.data == element) {
				if (cur.next != null) {
					cur.next.prev = node;
				}
				node.next = cur.next;
				cur.next = node;
				node.prev = cur;
				size++;
				return;
			}
			cur = cur.next;
		}
		System.out.println("Element " + element + " not found in DLL");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}

		head = head.next;
		head.prev = null;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}
		NodeDLL cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.prev.next=null;
		cur.prev=null;
	}
	
	public void deleteAtPosition(int pos){
		if (pos == 0) {
			System.out.println("use postion 1 instead of 0 to insert front");
			return;
		}

		if (pos == 1) {
			deleteFirst();
			return;
		}

		if (pos == size) {
			deleteLast();
			return;
		}

		if (size < pos) {
			System.out.println("Position not available current size " + size);
			return;
		}
		NodeDLL cur=head;
		for(int i=0;i<pos-1;i++){
			cur=cur.next;
		}
		cur.prev.next=cur.next;
		cur.next.prev=cur.prev;
		
	}
	
	public void printStraight() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}
		NodeDLL node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public void printReverse() {
		if (head == null) {
			System.out.println("DLL is empty");
			return;
		}

		NodeDLL node = head;
		while (node.next != null) {
			node = node.next;
		}
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.prev;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.addFront(50);
		dll.addFront(40);
		dll.addFront(30);
		dll.addFront(20);
		dll.addFront(10);
		dll.printStraight();
		dll.addLast(60);
		dll.addLast(70);
		dll.addLast(80);
		dll.printStraight();
		dll.addToPosition(3, 25);
		dll.addToPosition(1, 05);
		dll.addToPosition(11, 85);
		dll.addToPosition(14, 105);
		dll.addToPosition(0, -5);
		dll.printStraight();
		dll.addAfterElement(65, 60);
		dll.printStraight();
		dll.addAfterElement(90, 85);
		dll.printStraight();
		dll.deleteFirst();
		dll.printStraight();
		dll.deleteLast();
		dll.printStraight();
		dll.deleteAtPosition(5);
		dll.printStraight();
		// dll.printReverse();
	}

}
