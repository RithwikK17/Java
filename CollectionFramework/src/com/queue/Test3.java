package com.queue;

import java.util.ArrayDeque;

public class Test3 {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(10);
		System.out.println(ad);
		ad.addFirst(5);
		System.out.println(ad);
		ad.addLast(20);
		System.out.println(ad);
		
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
	}
}
