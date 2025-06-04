package com.list;

// to add a new node at the given index of the linked list 
public class Test6 {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void append(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	public void insertAt(int index, int data) {
		Node newNode = new Node(data);

		if (index < 0) {
			System.out.println("Invalid index");
			return;
		}

		if (index == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			if (temp == null) {
				System.out.println("Index out of bounds");
				return;
			}
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Index out of bounds");
			return;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void printList() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		Test6 list = new Test6();

		// initial Linked List
		list.append(10);
		list.append(20);
		list.append(30);
		list.printList();

		// insertion at index 1
		list.insertAt(1, 15);
		list.printList();

		// insertion at head position
		list.insertAt(0, 5);
		list.printList();

		// insertion at invalid index (out of bounds index)
		list.insertAt(10, 99);
	}
}
