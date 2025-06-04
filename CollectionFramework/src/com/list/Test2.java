package com.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(100);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.add(200);
		}
		System.out.println(list);
	}

}