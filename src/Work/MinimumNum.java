package Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinimumNum {

	public static void insertInToStack(Stack<Integer> s, int elem) {
		if (s.size() > 0 && s.peek() < elem) {
			int old = s.pop();
			s.add(elem);
			s.add(old);
		} else {
			s.add(elem);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases = Integer.parseInt(br.readLine());

		for (int i = 0; i < noOfTestCases; i++) {
			boolean changed = false;
			String input[] = br.readLine().split(" ");
			int size = Integer.parseInt(input[0]);
			int noOfSegments = Integer.parseInt(input[1]);
			int q = Integer.parseInt(input[2]);
			int count = 0;
			String arrElem[] = br.readLine().split(" ");
			double noOfElemInSeg;
			Stack stackArray[] = new Stack[noOfSegments];
			Stack<Integer> s;
			for (int j = 0; j < noOfSegments; j++) {
				noOfElemInSeg = Math.ceil(size / noOfSegments);
				s = new Stack<Integer>();
				for (int k = 0; k < noOfElemInSeg; k++) {
					insertInToStack(s, Integer.parseInt(arrElem[count++]));
				}/*
				while (count + 1 != size) { 
					insertInToStack(s,Integer.parseInt(arrElem[count++])); 
				}*/
				stackArray[j] = s;
			}
			int min = q;
			for (int j = 0; j < noOfSegments; j++) {

				Stack<Integer> s1 = stackArray[j];
				if (s1.peek() < min) {
					changed = true;
					min = s1.peek();
				}
			}
			if (changed) {
				System.out.println(min);
			} else {
				System.out.println("NO");
			}
		}

	}

}
