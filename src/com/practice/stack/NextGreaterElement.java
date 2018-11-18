package com.practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
	Stack<Integer> st = new Stack<>();

	public void getNextGreater(int arr[]) {
		int n = arr.length;

		st.push(arr[0]);

		for (int i = 1; i < n; i++) {
			int next = arr[i];

			if (!st.isEmpty()) {
				int element = st.pop();

				while (next > element) {
					System.out.println(element + " -> " + next);
					if (st.isEmpty()) {
						break;
					}
					element = st.pop();
				}

				if (next < element) {
					st.push(element);
				}
			}

			st.push(next);
		}

		while (!st.isEmpty()) {
			System.out.println(st.pop() + " -> -1");
		}
	}

	public static void main(String[] args) {
		NextGreaterElement nge = new NextGreaterElement();
		Scanner sn= new Scanner(System.in);
		int arr[] = { 4, 15, 2, 9, 20, 11, 13 };
		nge.getNextGreater(arr);
	}

}
