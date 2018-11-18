package com.practice.others;

import java.util.Scanner;

/*
 * Problem :https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/monk-and-prisoner-of-azkaban/
 */
public class MockProblem {

	public static void selectXY(int input[], int xArr[], int yArr[], int m) {
		for (int i = 1; i < input.length; i++) {
			int max=m;
			for (int j = 1; j < input.length; j++) {
				int xy = input[j];

				if (xy < i && input[xy] > input[i] && xy > xArr[i]) {
					xArr[i] = xy;
				}

				if (xy > i && input[xy] > input[i] && xy < max) {
					yArr[i] = xy;
					max = xy;
				}

			}
			if (xArr[i] == 0) {
				xArr[i] = -1;
			}

			if (yArr[i] == 0) {
				yArr[i] = -1;
			}
			System.out.print(xArr[i]+yArr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int input[] = new int[n + 1];
		int max = 0;
		int next = 0;
		for (int i = 1; i <= n; i++) {
			next = sn.nextInt();
			if (max < next) {
				max = next;
			}
			input[i] = next;
		}

		int xArr[] = new int[n + 1];
		int yArr[] = new int[n + 1];

		selectXY(input, xArr, yArr, max);
	}

}
