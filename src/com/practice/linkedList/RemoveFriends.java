package com.practice.linkedList;

import java.util.Scanner;

public class RemoveFriends {

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
		Scanner sn = new Scanner(System.in);

		int tc = sn.nextInt();

		for (int i = 0; i < tc; i++) {
			int noOfFrends = sn.nextInt();
			int noOfDeletes = sn.nextInt();
			int deleted =0;
			Node n = null;
			for (int j = 0; j < noOfFrends; j++) {
				if (n != null) {
					n.next = new Node(sn.nextInt());
				} else {
					n = new Node(sn.nextInt());
				}

			}

			while (n != null) {
				if(n.data<n.next.data){
					
				}
			}

		}
	}

}
