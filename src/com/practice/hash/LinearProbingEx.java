package com.practice.hash;

public class LinearProbingEx {
	public static int hashtableSize = 7;
	public static Student[] hashTable = new Student[7];

	public static int hashFunc(int rollNo) {
		return Math.abs((rollNo % hashtableSize));
	}

	public static void insert(Student student) {
		int index = hashFunc(student.rollno);
		System.out.println("HashFunction Index for rollNo " + student.rollno + " is " + index);
		while (hashTable[index] != null) {
			System.out.println("Collision at ----> " + index);
			index = Math.abs((index + 1) % hashtableSize);
		}
		System.out.println("Insertion Index " + index);
		hashTable[index] = student;
		System.out.println(".............................................");
		System.out.println();
	}

	public static void search(int rollNo) {
		System.out.println();
		System.out.println("-----Search " + rollNo + " -----");
		int index = hashFunc(rollNo);
		int i = 0;
		System.out.println("Actual Index : " + index);

		if (hashTable[index].rollno == rollNo) {
			System.out.println("Record not found for rollno " + rollNo);
			return;
		}

		if (hashTable[index] == null) {
			System.out.println("Record not found for rollno " + rollNo);
			return;
		}

		while (hashTable[index].rollno != rollNo && (hashTable[index] == null || i < (hashtableSize))) {
			i++;
			index = Math.abs((index + 1) % hashtableSize);
		}

		if (hashTable[index] == null || i == (hashtableSize)) {
			System.out.println("Record not found for rollno " + rollNo);
			return;
		}
		System.out.println("Found at index  " + index + " after " + i + " iteration(s)");
		System.out.println("Name : " + hashTable[index].name);
	}

	public static void print() {

		System.out.print(" -------------------------------------");
		System.out.println();
		System.out.print(" | ");
		for (int i = 0; i < hashTable.length; i++) {
			System.out.print(i + " | ");
		}
		System.out.println();
		System.out.print(" -------------------------------------");
		System.out.println();
		System.out.print(" | ");
		for (int i = 0; i < hashTable.length; i++) {
			if ((hashTable[i] == null)) {
				System.out.print("- | ");
			} else {
				System.out.print(hashTable[i].rollno + " | ");
			}

		}
		System.out.println();
		System.out.print(" -------------------------------------");

	}

	public static void main(String[] args) {
		insert(new Student(1, "Girish", 3));
		insert(new Student(8, "Suresh", 4));
		insert(new Student(15, "Vignesh", 2));
		insert(new Student(6, "Ramesh", 4));
		insert(new Student(5, "Yogesh", 3));
		insert(new Student(13, "Ramesh", 4));
		insert(new Student(1, "Manesh", 2));

		print();
		search(15);
		search(105);
		search(0);
		search(6);
		search(5);
	}

}

class Student {
	int rollno;
	String name;
	int standard;

	Student(int rollNo, String name, int standard) {
		this.name = name;
		this.rollno = rollNo;
		this.standard = standard;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getStandard() {
		return standard;
	}

}
