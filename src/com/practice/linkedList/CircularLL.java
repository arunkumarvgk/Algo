package com.practice.linkedList;

public class CircularLL {
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
	
	public void addTOEnd(int data){
		Node n= new Node(data);
		if(size==0){
			addTOEnd(data);
		}else{
			tail.next=n;
			n.next=head;
			tail=n;
		}
		size++;
	}
	
	public void deleteFromStart(){
		if(size==0){
			System.out.println("No delete Empty CLL");
			return;
		}else{
			head=head.next;
			tail.next=head;
		}
		size--;
	}
	
	public void print() {
		
		if (size != 0) {
			Node traverse=head;
			do{
				System.out.print(" ["+traverse.data+"]");
				traverse=traverse.next;
			}while(traverse!=head);
		}else{
			System.out.println("Empty CLL");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CircularLL cl = new CircularLL();
		cl.deleteFromStart();
		cl.print();
		System.out.println("Size of CLL is "+size);
		cl.addToStart(10);
		cl.addToStart(20);
		cl.addToStart(30);
		cl.addToStart(40);
		cl.print();
		System.out.println("Size of CLL is "+size);
		cl.addTOEnd(-10);
		cl.addTOEnd(-20);
		cl.addTOEnd(-30);
		cl.addTOEnd(-40);
		cl.print();
		System.out.println("Size of CLL is "+size);
		cl.deleteFromStart();
		cl.print();
		System.out.println("Size of CLL is "+size);

	}

}
