package com.practice.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LastOccuranceOfX {
	
	public static int lastOccurance(int q,int a[]){
		for (int l = a.length - 1; l >= 0; l--) {
			if (q == a[l]) {
				return l;
			}
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());

		for (int i = 0; i < tc; i++) {
			int arrLength = Integer.parseInt(reader.readLine());

			int a[] = new int[arrLength];

			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

			for (int j = 0; j < arrLength; j++) {
				a[j] = Integer.valueOf(st.nextToken());
			}

			int quries = Integer.parseInt(reader.readLine());

			int q[] = new int[quries];

			for (int j = 0; j < quries; j++) {
				q[j] = Integer.parseInt(reader.readLine());
				System.out.println(lastOccurance(q[j],a));
			}

		}

	}

}
