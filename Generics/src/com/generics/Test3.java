package com.generics;

import java.util.Arrays;
import java.util.List;

public class Test3 {
	public <T> void print(List <T> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Test3 obj = new Test3();
		obj.print(list);

		List<String> list2 = Arrays.asList("Hello", "Java", "Generics");
		Test3 obj2 = new Test3();
		obj2.print(list2);

		List<Double> list3 = Arrays.asList(3.1464, 5.998800, 3.68686);
		Test3 obj3 = new Test3();
		obj3.print(list3);
	}
}
