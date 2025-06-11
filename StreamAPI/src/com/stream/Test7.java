package com.stream;

import java.util.ArrayList;
import java.util.List;

// print numbers start from 2 . input int[] ar = {21,12,23,222,123,212,453,245};
public class Test7 {

	public static void main(String[] args) {
		int[] ar = { 21, 12, 23, 222, 123, 212, 453, 245 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		list.stream().map(x -> String.valueOf(x)).filter(x -> x.startsWith("2")).map(x -> Integer.parseInt(x))
				.forEach(x -> System.out.println(x + ""));
	}

}
