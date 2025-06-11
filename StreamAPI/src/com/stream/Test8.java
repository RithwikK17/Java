package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// print all duplicate elements from given array. Input int[] ar = {2,1,1,2,3,4,4,5,3}
public class Test8 {

	public static void main(String[] args) {
		int[] ar = { 2, 1, 1, 2, 3, 4, 4, 5, 3 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		list.stream().filter(x -> Collections.frequency(list, x) > 1).distinct()
				.forEach(x -> System.out.println(x + " "));
	}

}