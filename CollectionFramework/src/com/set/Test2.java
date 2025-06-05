package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		int[] ar = {1,2,3,4,5,6,6,7,8,9};
		int[] ar1 = {1,2,45,0,89,34,60};
		
		for(int ele:ar) {
			set1.add(ele);
		}
		
		for(int ele:ar1) {
			set2.add(ele);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
//		set1.addAll(set2);
//		System.out.println(set1);
		
//		set1.removeAll(set2);
//		System.out.println(set1);
		
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
