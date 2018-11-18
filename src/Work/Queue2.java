package Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue2 {

	int rear = 0;
	int front = 0;
	static int max = 100000;

	public void enqueue(int arr[], int elem) {
		if (rear == max - 1) {
			return;
		}
		arr[rear++] = elem;
	}

	public int dequeue(int arr[]) {
		if (front == rear) {
			return -1;
		}

		return arr[front++];
	}

	public int queueSize() {
		return rear - front;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue2 q = new Queue2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		int arr[] = new int[max];
		for (int i = 0; i < no; i++) {
			String input[] = br.readLine().split(" ");

			if ("D".equals(input[0])) {
				System.out.println(q.dequeue(arr) + " " + q.queueSize());
			} else {
				q.enqueue(arr, Integer.parseInt(input[1]));
				System.out.println(q.queueSize());
			}
		}

	}

}
