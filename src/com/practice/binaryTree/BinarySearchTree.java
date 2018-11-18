package com.practice.binaryTree;

public class BinarySearchTree {

	Node root;

	public void insert(int element) {
		Node n = new Node(element);
		if (root == null) {
			root = n;
			return;
		}
		Node cur = root;
		Node prev = null;
		while (cur != null) {
			prev = cur;
			if (element > cur.data) {
				cur = cur.right;
			} else if (element < cur.data) {
				cur = cur.left;
			}
		}
		if (element > prev.data) {
			prev.right = n;
		} else {
			prev.left = n;
		}
	}

	public void search(int element) {
		if (root == null) {
			System.out.println("Empty tree");
			return;
		}

		Node cur = root;

		while (cur != null) {
			if (element == cur.data) {
				System.out.println(element + " found");
				return;
			} else if (element > cur.data) {
				cur = cur.right;
			} else {
				cur = cur.left;
			}
		}
		System.out.println(element + " Not found");
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(12);
		bst.insert(5);
		bst.insert(4);
		bst.insert(20);
		bst.insert(8);
		bst.insert(7);
		bst.insert(15);
		bst.insert(13);
		
		bst.search(34);
		bst.search(4);
		bst.search(43);
		bst.search(20);
		bst.search(5);
	}

}
