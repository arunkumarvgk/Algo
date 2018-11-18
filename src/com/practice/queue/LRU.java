package com.practice.queue;

public class LRU {

	static int size = 0;
	Node head;
	Node tail;

	static int pageFaults = 0;
	static int pageHits = 0;

	public void LRUCache(int val, int capacity) {
		System.out.print("Value " + val + "  -> ");
		beforeCache();
		int pos = availableAtPos(val);
		Node n = new Node(val);
		if (pos != -1) {
			pageHits++;
			updateCache(pos, n, capacity);
			return;
		}

		if (head == null) {
			head = tail = n;
			size++;
			pageFaults++;
			return;
		}

		if (size < capacity) {
			tail.next = n;
			n.prev = tail;
			tail = n;
			size++;
			pageFaults++;
			return;
		}

		removeHead();
		tail.next = n;
		n.prev = tail;
		tail = n;
		pageFaults++;
	}

	public void updateCache(int pos, Node newNode, int capacity) {
		Node n = head;

		if (pos == 1) {
			removeHead();
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			return;
		}

		if (pos == capacity) {
			return;
		}

		for (int i = 1; i < pos; i++) {
			n = n.next;
		}

		n.prev.next = n.next;
		n.next.prev = n.prev;

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void removeHead() {
		head = head.next;
		head.prev = null;
	}

	public int availableAtPos(int val) {
		Node n = head;
		int pos = 1;
		while (n != null) {
			if (n.val == val) {
				return pos;
			}
			pos++;
			n = n.next;
		}
		return -1;
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.val + " ");
			n = n.next;
		}
		System.out.println();
		System.out.println("-----------------------");
	}

	public void beforeCache() {
		Node n = head;
		while (n != null) {
			System.out.print(" " + n.val + " ");
			n = n.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		LRU lru = new LRU();

		int arr[] = { 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5,5 };
		int capacity = 3;

		for (int i : arr) {
			lru.LRUCache(i, capacity);
			lru.display();
		}

		System.out.println("Page faults " + pageFaults);
		System.out.println("Page hits " + pageHits);
	}

}

class Node {
	int val;
	Node next;
	Node prev;

	Node(int val) {
		this.val = val;
	}
}
