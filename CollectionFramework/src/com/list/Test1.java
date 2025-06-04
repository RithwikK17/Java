package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		Collections.synchronizedList(list);
//		CopyOnWriteArrayList
		
		//insert
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(20);
		list.add(null);
		
		System.out.println(list);
		System.out.println("\n");
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		
		list.addAll(list2);
		System.out.println(list);
		System.out.println("\n");
		
		System.out.println(list.isEmpty());
		System.out.println("\n");
		
		// get()
		System.out.println(list.get(2));
		System.out.println("\n");
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n");
		
		for(Integer obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n");
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//list.add(500);
		}
		System.out.println("\n");
		
		//update
		list.set(2, 2000);
		System.out.println(list);
		System.out.println("\n");
		
		//delete
		list.remove(3);
		System.out.println(list);
		System.out.println("\n");
		
	}
}
