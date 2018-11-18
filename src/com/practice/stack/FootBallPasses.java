package com.practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootBallPasses {


	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		Integer num_testcases = Integer.parseInt(s.readLine());
		while (num_testcases > 0) {
			String lineOne = s.readLine();
			String[] input = lineOne.split(" ");
			Integer num_instructions = Integer.parseInt(input[0]);
			int temp = -99;
			int cur = Integer.parseInt(input[1]);
			int prev = Integer.parseInt(input[1]);
			for (int i = 1; i <= num_instructions; i++) {
				String line = s.readLine().trim();
				String instruction[] = line.split(" ");
				String command = instruction[0];

				if ("P".equals(command)) {
					prev = cur;
					cur = Integer.parseInt(instruction[1]);
					temp = -99;
				} else {
					if (temp == -99) {
						temp = cur;
						cur = prev;
					} else {
						int temp2 = temp;
						temp = cur;
						cur = temp2;
					}
				}
			}
			System.out.println("Player " + cur);
			num_testcases--;
		}

	}
}
