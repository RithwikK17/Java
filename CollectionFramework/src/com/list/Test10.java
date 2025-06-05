package com.list;

import java.util.Stack;

public class Test10 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(100);
		stack.push(1000);
		stack.push(10000);

		System.out.println(stack);
		System.out.println(stack.pop());

		System.out.println(stack.get(1));
	}

}
