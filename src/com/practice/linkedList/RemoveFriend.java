package com.practice.linkedList;

public class RemoveFriend {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {
		RemoveFriend rf = new RemoveFriend();

		rf.head = new Node(10);
		Node second =new Node(20);
		rf.head.next = second;
		
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		second.next=third;
		third.next=fourth;
		fourth.next=null;
		
		Node n= rf.head;
		
		do{
			System.out.print(n.data+" -> ");
			n=n.next;
		}while(n != null);
		
	}

}
