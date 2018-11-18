package com.practice.linkedList2;

public class InsertIntoSortedDLL {
	NodeDLL head;
	NodeDLL tail;
	static int size;

	public void insert(int data) {
		NodeDLL node = new NodeDLL(data);
		if (size == 0) {
			head = tail = node;
			size++;
			return;
		}

		head.prev = node;
		node.next = head;
		head = node;
		size++;
	}

	public void findPair(int x) {
		NodeDLL first = head;
		NodeDLL last = tail;

		if (size < 2) {
			System.out.println("No Pairs ");
			return;
		}

		while (first != null && last != null && first != last) {
			int sum = first.data + last.data;
			if (sum == x) {
				System.out.println("( " + first.data + " , " + last.data + " )");
				first = first.next;
				last = last.prev;
				continue;
			}

			if (sum > x) {
				last = last.prev;
			} else {
				first = first.next;
			}
		}
	}

	public void insertSorted(int data) {
		NodeDLL node = new NodeDLL(data);
		
		if (size == 0) {
			head = tail = node;
			size++;
			return;
		}

		NodeDLL cur = head;
		
		while (cur != null && cur.data < node.data) {
			cur = cur.next;
		}

		if (cur == null) {
			tail.next=node;
			node.prev=tail;
			tail=node;
			size++;
			return;
		}
		
		if(cur.prev == null){
			node.next = cur;
			cur.prev=node;
			head=node;
			size++; 
			return;
		}
		
		cur.prev.next = node;
		node.prev = cur.prev;
		node.next = cur;
		cur.prev = node;
		size++;
	}

	public void printt() {
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

	public static void main(String[] args) {
		InsertIntoSortedDLL fp = new InsertIntoSortedDLL();
		fp.insert(9);
		fp.insert(8);
		fp.insert(6);
		fp.insert(5);
		fp.insert(4);
		fp.insert(2);
		fp.insert(1);
		fp.printt();
		fp.findPair(7);
		fp.printt();
		fp.insertSorted(10);
		fp.insertSorted(10);
		fp.insertSorted(0);
		fp.insertSorted(56);
		fp.insertSorted(3);
		fp.printt();

	}

}
