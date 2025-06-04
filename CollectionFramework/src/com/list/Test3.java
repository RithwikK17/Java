package com.list;

import java.util.LinkedList;

public class Test3 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		System.out.println(list);
		list.addFirst(5);
		System.out.println(list);
		list.addLast(15);
		System.out.println(list);
		list.add(1,45);
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println("\n");
		
		for(Integer obj : list) {
			System.out.println(obj);
		}
		
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		
		list.set(1, 56);
		System.out.println(list);
		
		int obj = list.poll();
		System.out.println(obj);
		System.out.println(list);
	}
}