package Work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ScoreFinder {

	static Set<Integer> set = new HashSet<>();
	static int grade[] = { 5, 6, 7, 8, 9, 10 };

	static List<Integer> arr1 = new ArrayList<>();
	static List<List<Integer>> a = new ArrayList<>();

	public static void score(int[] arr, int n) {

	/*	for (int i = 0; i < n; i++) {
			int score = 0;
			for (int j = 0; j < grade.length; j++) {
				score = (arr[i] * grade[i]) + (arr[j] * grade[j]);
			}
			System.out.println(score);
			set.add(score);
		}*/

		for (List<Integer> abc : a) {
			for (int abcd : abc) {
				System.out.print(abcd+" ");
			}
			System.out.println("-");
		}

		//System.out.println(set.size());
	}

	static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
		if (index == r) {
			for (int j = 0; j < r; j++) {
				//System.out.print(data[j] + " ");
				arr1.add(data[j]);
			}
			a.add(arr1);
			return;
		}
		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			combinationUtil(arr, data, i + 1, end, index + 1, r);
		}
	}

	static void printCombination(int arr[], int n, int r) {
		int data[] = new int[r];
		combinationUtil(arr, data, 0, n - 1, 0, r);
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int no = sn.nextInt();
		int arr[] = new int[no];

		for (int i = 0; i < no; i++) {
			arr[i] = sn.nextInt();
		}
		printCombination(arr,no,no);
		score(arr, no);

	}

}
