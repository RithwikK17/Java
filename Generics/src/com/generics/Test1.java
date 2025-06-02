package com.generics;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("123");
		list.add("345");
		list.add("123abc");

		for (Object o : list) {
			System.out.println((Integer.parseInt((String) o)));
		}

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("123");
		list2.add("345");
//		list2.add(2);
//		list2.add("123abc");
		for (String str : list2) {
			System.out.println(Integer.parseInt(str));
		}
	}
}
