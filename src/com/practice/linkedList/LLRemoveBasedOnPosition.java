package com.practice.linkedList;

public class LLRemoveBasedOnPosition {
	Node head;

	LLRemoveBasedOnPosition() {

	}

	LLRemoveBasedOnPosition(int data) {
		head = new Node(data);
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
			temp=cur;
			cur = cur.next;
		}
		temp.next = null;
	}
	
	public void insertWithPositin(Node node,int pos) {
		if(pos==0){
			node.next=head;
			head=node;
			return;
		}
		
		Node cur=head;
		
		for(int i=0;i<pos-1;i++){
			cur=cur.next;
			if(cur == null){
				System.out.println("Position "+pos+" unavilable");
				break;
			}
		}
		
		node.next=cur.next;
		cur.next=node;
	}
	
	public void deleteWithPositin(int pos) {
		if(pos==0){
			head=head.next;
			return;
		}
		
		Node cur=head;
		Node temp=null;
		for(int i=0;i<pos;i++){
			temp=cur;
			cur=cur.next;
			if(cur == null){
				System.out.println("Position "+pos+" unavilable");
				break;
			}
		}
		
		temp.next=cur.next;
	}
	
	public void deleteOnValue(int val) {
		if(head==null){
			System.out.println("Linked List is empty");
			return;
		}
		
		if(head.data == val ){
			head=head.next;
			return;
		}
		
		Node cur=head;
		Node temp=head;
		while(cur!=null){
			if(cur.data==val){
				temp.next=cur.next;
			}
			temp=cur;
			cur=cur.next;
		}
	}
	
	
	public static void main(String[] args) {

		// LLRemoveBasedOnPosition ll= new LLRemoveBasedOnPosition();
		LLRemoveBasedOnPosition ll = new LLRemoveBasedOnPosition(10);

		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);
		Node n4 = new Node(50);
		Node n5 = new Node(60);

		ll.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println("------All------");
		ll.display();

		System.out.println("------Insert first 3000------");
		Node nodeInsertfirst = new Node(3000);
		ll.insertFirst(nodeInsertfirst);
		ll.display();

		System.out.println("------Insert first 4000------");
		Node nodeInsertfirst2 = new Node(4000);
		ll.insertFirst(nodeInsertfirst2);
		ll.display();

		System.out.println("------Insert last 6000------");
		Node nodeInsertLast = new Node(6000);
		ll.insertLast(nodeInsertLast);
		ll.display();

		System.out.println("------Insert last 7000------");
		Node nodeInsertLast2 = new Node(7000);
		ll.insertLast(nodeInsertLast2);
		ll.display();

		System.out.println("------delete first------");
		ll.deleteFirst();
		ll.display();

		System.out.println("------delete last------");
		ll.deleteLast();
		ll.display();
		
		System.out.println("------Insert 8000 at 4------");
		Node nodeInsert3 = new Node(8000);
		ll.insertWithPositin(nodeInsert3, 4);;
		ll.display();
		
		System.out.println("------Delete 8000 at 4------");
		ll.deleteWithPositin(4);
		ll.display();
		
		System.out.println("------Delete value 40------");
		ll.deleteOnValue(6000);
		ll.display();
	}

}
