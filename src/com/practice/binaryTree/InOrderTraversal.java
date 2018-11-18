package com.practice.binaryTree;

import java.util.Stack;

public class InOrderTraversal {
	Node root;

	public void inOrderTraversal() {
		if (root == null) {
			return;
		}
		Node cur = root;
		Stack<Node> stack = new Stack<>();
		while (cur != null) {
			stack.add(cur);
			cur = cur.left;
		}

		while (stack.size() > 0) {
			cur = stack.pop();
			System.out.print(cur.data + " ");

			if (cur.right != null) {
				cur = cur.right;

				while (cur != null) {
					stack.add(cur);
					cur = cur.left;
				}
			}
		}
	}

	public static void main(String[] args) {
		InOrderTraversal tree = new InOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inOrderTraversal();

	}

}
