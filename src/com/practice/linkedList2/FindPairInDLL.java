package com.practice.linkedList2;

public class FindPairInDLL {
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

	public static void main(String[] args) {
		FindPairInDLL fp = new FindPairInDLL();
		fp.insert(9);
		fp.insert(8);
		fp.insert(6);
		fp.insert(5);
		fp.insert(4);
		fp.insert(2);
		fp.insert(1);
		fp.findPair(7);
	}

}
