package com.set;

import java.util.LinkedHashSet;

public class Test3 {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Monish");
		hs.add("Pateek");
		hs.add("Raghav");
		hs.add("Rithwik");

		System.out.println(hs);
		
		hs.add(null);
		System.out.println(hs);
	}
}
