package com.list;

class NodeS { 
	int data;
	Node next;

	NodeS(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Test7 {

	public static int getLength(Node head) {
		int count = 0;
		Node current = head;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public static Node nodeAtGivenPosition(Node head, int index) {
		int currentIndex = 0;
		Node current = head;

		while (current != null) {
			if (currentIndex == index) {
				return current;
			}
			currentIndex++;
			current = current.next;
		}
		return null;
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);

		int length = getLength(head);
		System.out.println("Length of linked list: " + length);

		int index = 2;
		Node result = nodeAtGivenPosition(head, index);
		if (result != null) {
			System.out.println("Node at index " + index + ": " + result.data);
		} else {
			System.out.println("Index " + index + " is out of bounds.");
		}
	}
}
