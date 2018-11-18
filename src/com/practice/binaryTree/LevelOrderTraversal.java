package com.practice.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	Node root;
	
	void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		System.out.println(root.data + " ");
		while (!queue.isEmpty()) {

			/*
			 * poll() removes the present head. For more information on poll()
			 * visit http://www.tutorialspoint.com/java/util/linkedlist_poll.htm
			 */
			Node tempNode = queue.poll();
			

			/* Enqueue left child */
			if (tempNode.left != null) {
				System.out.print(tempNode.left.data + " ");
				queue.add(tempNode.left);
			}

			/* Enqueue right child */
			if (tempNode.right != null) {
				System.out.print(tempNode.right.data + " ");
				queue.add(tempNode.right);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		LevelOrderTraversal tree_level = new LevelOrderTraversal();
		tree_level.root = new Node(1);
		tree_level.root.left = new Node(2);
		tree_level.root.right = new Node(3);
		tree_level.root.left.left = new Node(4);
		tree_level.root.left.right = new Node(5);

		System.out.println("Level order traversal of binary tree is - ");
		tree_level.printLevelOrder();
	}

}

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}