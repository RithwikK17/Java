package com.stream;

import java.util.ArrayList;
import java.util.List;

//get the kth smallest number input int[] ar = {6,1,4,3,2,7,10,9,8}
public class Test13 {
	public static void main(String[] args) {
		int[] ar = { 6, 1, 4, 3, 2, 7, 10, 9, 8 };
		int k = 5;
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		list.stream().sorted().skip(k - 1).limit(1).forEach(x -> System.out.println(x));
	}
}
