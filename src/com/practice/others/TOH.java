package com.practice.others;

public class TOH {
	static int count=0;
	public static void shift(int n, String src, String aux, String dest) {
		if (n == 0) {
			return;
		}
		shift(n - 1, src, dest, aux);
		System.out.println((++count)+ " =>  Move "  + n + " from " + src + " -> " + dest);
		shift(n - 1, aux, src, dest);
	}

	public static void main(String[] args) {
		int noOfDisks = 3;
		shift(noOfDisks, "A", "B", "C");
	}

}
