package com.set5;

//21. Check if two strings match with wildcard characters
public class p21 {
	public static void main(String[] args) {
		String s = "abc", p = "a*c";
		System.out.println(s.matches(p.replace("?", ".").replace("*", ".*")));
	}
}
