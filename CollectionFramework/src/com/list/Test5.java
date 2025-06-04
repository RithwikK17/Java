package com.list;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	public void addAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
	}

	public void display() {
		Node current = head;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("null");
	}
}

public class Test5 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addAtEnd(10);
		list.addAtEnd(20);
		list.addAtEnd(30);

		System.out.println("Linked List after adding nodes at the end:");
		list.display();
	}
}
