package com.queue;

public class Test1 {
	private int front, rear, size;
	private int[] queue;

	public Test1(int capacity) {
		front = 0;
		rear = -1;
		size = 0;
		queue = new int[capacity];
	}

	public void enqueue(int element) {
		if (size == queue.length) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1) % queue.length;
		queue[rear] = element;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int removedElement = queue[front];
		front = (front + 1) % queue.length;
		size--;
		return removedElement;
	}

	public void traverse() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = 0; i < size; i++) {
			int index = (front + i) % queue.length;
			System.out.print(queue[index] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Test1 q = new Test1(6);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);

		q.traverse();

		System.out.println("Dequeued: " + q.dequeue());
		System.out.println("Dequeued: " + q.dequeue());

		q.traverse();
	}
}
