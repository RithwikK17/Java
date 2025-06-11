package com.stream;

import java.util.ArrayList;
import java.util.List;

//print average of squared even numbers
public class Test5 {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		double d = list.stream().filter(x -> x % 2 == 0).map(x -> x * x).mapToInt(x -> x).average().getAsDouble();
		System.out.println(d);
	}
}
