package com.queue;

import java.util.PriorityQueue;

public class Test2 {
	public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.offer(10);
	pq.offer(1);
	pq.offer(20);
	pq.offer(-1);
	
	System.out.println(pq.peek());
	System.out.println(pq.poll());
	System.out.println(pq.peek());
	
	}
}
