package com.stream;

import java.util.ArrayList;
import java.util.List;

// print the sum of last k elements in the given array. Input int[] ar = {1,2,3,4,5,6,7,8}
public class Test12 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		Integer reduce = list.stream().skip(list.size() - k).reduce(0, (sum, a) -> sum + a);
		System.out.println(reduce);
	}

}
