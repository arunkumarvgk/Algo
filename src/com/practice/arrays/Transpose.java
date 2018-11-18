package com.practice.arrays;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int p = sn.nextInt();
		int q = sn.nextInt();

		int a[][] = new int[p][q];

		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				a[i][j] = sn.nextInt();
			}
		}

		for (int i = 0; i < q; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}
}
