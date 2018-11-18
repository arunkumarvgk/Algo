package com.practice.hash;

public class SeperateChaning {
	public static int hashtableSize = 7;
	static Linkedlist[] sp = new Linkedlist[hashtableSize];

	public static int hashFunc(int elem) {
		return Math.abs((elem % hashtableSize));
	}

	public static void insert(int elem) {
		int index = hashFunc(elem);

		if (sp[index] == null) {
			sp[index] = new Linkedlist(elem);
			return;
		}

		Linkedlist ll = sp[index];
		Node node = new Node(elem);
		node.next = ll.getHead();
		ll.setHead(node);
	}

	public static void search(int elem) {
		int index = hashFunc(elem);
		int i = 0;

		if (sp[index].head.data == elem) {
			System.out.println("Elem "+elem+" Found at index "+index+" without iteration");
			return;
		}
		
		Linkedlist ll = sp[index];
		Node node = ll.getHead().next;
		
		while(node!=null){
			i++;
			if(node.data == elem){
				System.out.println("Elem "+elem+" Found at index "+index+" after "+i+" iteration(s)");
				return;
			}
			node=node.next;
		}
		
		System.out.println("Elem "+elem+" Not Found");
	}

	public static void print() {
		for (int i = 0; i < hashtableSize; i++) {
			Linkedlist ll = sp[i];
			Node n = ll.getHead();
			System.out.println();
			System.out.print("Index " + i + " :: " + n.data);
			while (n.next != null) {
				n = n.next;
				System.out.print(" -> " + n.data);
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		insert(0);
		insert(1);
		insert(2);
		insert(3);
		insert(4);
		insert(5);
		insert(6);
		insert(13);
		insert(43);
		insert(65);
		insert(78);
		insert(33);
		insert(21);
		insert(598);
		insert(44);
		insert(12);
		insert(786);
		insert(654);
		insert(278);
		insert(133);
		insert(221);
		insert(338);
		insert(446);
		insert(446);
		print();
		search(1);
		search(221);
		search(78);
		search(13);
		search(786);
		search(100);
		search(65);
		search(2);
		search(33);
	}

}
