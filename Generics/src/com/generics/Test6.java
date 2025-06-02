package com.generics;

import java.util.Arrays;
import java.util.List;

public class Test6 {
	public static void print(List<? super Integer> list) {
		System.out.println(list);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		print(list);
		
//		List<String> list2 = Arrays.asList("Hello","World");
//		print(list2);
	}
}
