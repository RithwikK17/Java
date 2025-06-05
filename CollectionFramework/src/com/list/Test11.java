package com.list;

public class Test11 {
	private int maxSize;
	private int[] stackArray;
	private int top;

	public Test11(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	// Push(Add element)
	public void push(int data) {
		if (top == maxSize - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		stackArray[++top] = data;
		System.out.println("Pushed: " + data);
	}

	// Pop(Remove element)
	public int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int popValue = stackArray[top--];
		System.out.println("Popped: " + popValue);
		return popValue;
	}

	// Display stack
	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.print("Stack: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Test11 stack = new Test11(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();

		stack.pop();
		stack.display();
	}
}
