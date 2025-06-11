package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

//2. print average of all numbers .Input: int[] ar ={1,2,3,4,5,6,7}
public class Test4 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> list = new ArrayList<>();
		for (int ele : ar) {
			list.add(ele);
		}
		OptionalDouble res = list.stream().mapToInt(x -> x).average();
		System.out.println(res.getAsDouble());
	}

}
