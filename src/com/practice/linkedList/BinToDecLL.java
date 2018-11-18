package com.practice.linkedList;

public class BinToDecLL {
	Node head;
	
	public void findVal(){
		Node n= head;
		int result=0;
		
		while(n!=null){
			System.out.print((result<<1)+" ");
			result = (result<<1)+n.data;
			n=n.next;
		}
		System.out.println();
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		BinToDecLL bToD = new BinToDecLL();
		Node n1 = new Node(0);
		Node n2 = new Node(1);
		Node n3 = new Node(1);
		Node n4 = new Node(0);
		Node n5 = new Node(1);
		
		bToD.head= new Node(0);
		
		bToD.head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		bToD.findVal();
	}

}
