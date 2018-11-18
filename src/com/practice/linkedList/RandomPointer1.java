package com.practice.linkedList;

public class RandomPointer1 {

	NodeR head;
	NodeR copyHead;

	public void copyRandomPointer() {
		if (head == null) {
			System.out.println("Empty LL");
			return;
		}

		NodeR original = head;
		NodeR copy = null;
		NodeR copyPointer = null;
		while (original != null) {
			copy = new NodeR(original.data);
			copy.random = original.random;
			if (copyHead == null) {
				copyHead = copy;
				copyPointer = copy;
				copyPointer.next = original.next;
			} else {
				copyPointer = copy;
				copyPointer.next = original.next;
			}
			original = original.next;
		}
	}

	public void printOriginal() {
		NodeR org = head;
		while (org != null) {
			System.out.println(org.data + " -> " + ((org.next!=null)?org.next.data:" ") + " " + org.random.data);
			org = org.next;
		}
	}

	public void printCopy() {
		NodeR cpy = copyHead;
		while (cpy != null) {
			System.out.println(cpy.data + " -> " + ((cpy.next!=null)?cpy.next.data:" ") + " " + cpy.random.data);
			cpy = cpy.next;
		}
	}

	public static void main(String[] args) {
		RandomPointer1 rp = new RandomPointer1();
		rp.head = new NodeR(1);
		NodeR n2 = new NodeR(2);
		NodeR n3 = new NodeR(3);
		NodeR n4 = new NodeR(4);

		rp.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next=null; //not necessary by default n4->next will point
		
		rp.head.random=n4;
		n2.random=n3;
		n3.random=n2;
		n4.random=rp.head;
		rp.copyRandomPointer();
		rp.printOriginal();
		rp.printCopy();
		
	}

}

class NodeR {
	int data;
	NodeR next;
	NodeR random;

	NodeR(int data) {
		this.data = data;
	}
}