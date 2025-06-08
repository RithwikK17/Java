package com.set;

import java.util.Collections;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(Collections.reverseOrder());
		ts.add("Yogi");
		ts.add("Vijay");
		ts.add("John");

		System.out.println(ts);
//		ts.add(null);
	}
}
