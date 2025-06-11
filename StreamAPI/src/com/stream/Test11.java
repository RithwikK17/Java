package com.stream;

import java.util.ArrayList;
import java.util.List;

// print the sum of first five numbers in the given array. Input int[] ar = {1,2,3,4,5,6,7,8}
public class Test11 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		Integer reduce = list.stream().limit(5).reduce(0, (sum, a) -> sum + a);
		System.out.println(reduce);
	}

}
