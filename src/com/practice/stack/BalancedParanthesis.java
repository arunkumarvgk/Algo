package com.practice.stack;

import java.util.Stack;

public class BalancedParanthesis {
	static Stack<Character> stack = new Stack<>();
	public static boolean isBalanced = false;

	public static void isMatching(Character c1, Character c2) {
		if ((c1 == '(' && c2 == ')')) {
			isBalanced = true;
		} else if ((c1 == '{' && c2 == '}')) {
			isBalanced = true;
		} else if ((c1 == '[' && c2 == ']')) {
			isBalanced = true;
		}
		isBalanced = false;
	}

	public static void main(String[] args) {
		String s = "(3+{4-9[4+0]})";
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (c.equals('(') || c.equals('[') || c.equals('{')) {
				stack.push(c);
			}

			if (c.equals(')') || c.equals(']') || c.equals('}')) {
				if (stack.isEmpty()) {
					isBalanced = false;
				} else {
					Character popC = stack.pop();
					isMatching(popC, c);
				}
			}
		}

		System.out.println("String Balance :: " + ((isBalanced) && stack.isEmpty()));
	}

}
