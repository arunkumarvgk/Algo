package Thougtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class XORProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int no = Integer.parseInt(br.readLine());
		int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int tc = Integer.parseInt(br.readLine());
		int j=4;
		while (tc != 0) {
			
			int query[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int min = Integer.MAX_VALUE;
			int accNum = Integer.MIN_VALUE;
			int cnt = 1;
			for (int i = (query[0] - 1); i < (query[1]); i++) {
				int num = arr[i];
				int xorVal = num ^ query[2];
				if (xorVal == min) {
					if(num==850007){
						cnt++;
						continue;
					}
					cnt++;
					continue;
				}

				if (xorVal < min) {
					accNum = num;
					min = xorVal;
				}
			}
			System.out.println(accNum + " " + cnt);
			j++;
			tc--;
		}

	}

}
