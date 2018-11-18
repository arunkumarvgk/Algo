package com.practice.binaryTree;

import java.util.Stack;

public class PreOrderTraversal {
	Node root;

	public void preOrder() {
		if (root == null) {
			return;
		}

		Stack<Node> s = new Stack<>();
		s.push(root);

		while (s.size() > 0) {
			Node cur = s.pop();
			System.out.print(cur.data + " ");

			if (cur.right != null) {
				s.push(cur.right);
			}

			if (cur.left != null) {
				s.push(cur.left);
			}
		}
	}

	public static void main(String[] args) {
		PreOrderTraversal tree = new PreOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.preOrder();
	}

}
