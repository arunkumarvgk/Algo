package com.practice.arrays;

import java.util.Scanner;

public class SymmetricMatrix {

	public static boolean isSymmetric(int p, int aT[][], int a[][]) {
		boolean b = false;
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				if (aT[i][j] == a[i][j]) {
					b = true;
				} else {
					return false;
				}
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int tc = sn.nextInt();

		for (int h = 0; h < tc; h++) {
			int p = sn.nextInt();
			int a[][] = new int[p][p];
			int aT[][] = new int[p][p];
			
						
			for (int i = 0; i < p; i++) {
				String s= sn.next();
				for (int j = 0; j < p; j++) {
					a[i][j] = Character.digit(s.charAt(j), 10);
				}
			}

			for (int i = 0; i < p; i++) {
				for (int j = 0; j < p; j++) {
					aT[i][j] = a[j][i];
				}
			}

			System.out.println(isSymmetric(p, aT, a) ? "YES" : "NO");
		}

	}

}
