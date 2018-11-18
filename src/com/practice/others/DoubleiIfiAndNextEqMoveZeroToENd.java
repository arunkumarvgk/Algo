package com.practice.others;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DoubleiIfiAndNextEqMoveZeroToENd {

	public static void doubleI(List<Integer> list, int size) {
		for (int j = 0; j < size - 1; j++) {
			if (list.get(j) == list.get(j + 1)) {
				list.set(j, list.get(j) * 2);
				list.remove(j + 1);
				list.add(0);
			}

			if (list.get(j) == 0) {
				list.remove(j);
				list.add(0);
			}
		}

		for (int j = 0; j < size; j++) {
			System.out.print(list.get(j) + " ");
		}
	}

	

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		arr.add(4);
		arr.add(4);
		arr.add(0);
		arr.add(2);
		arr.add(0);
		arr.add(8);

		for (int j = 0; j < arr.size(); j++) {
			System.out.print(arr.get(j) + " ");
		}
		System.out.println();
		doubleI(arr, arr.size());

		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(4);
		linkedList.add(4);
		linkedList.add(0);
		linkedList.add(2);
		linkedList.add(0);
		linkedList.add(8);
	}

}
