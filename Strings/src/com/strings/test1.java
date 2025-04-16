package com.strings;

public class test1 {
	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);
		System.out.println(str.hashCode());

		System.out.println("______________________________");
		str.concat("code");
		System.out.println(str);
		System.out.println(str.hashCode());

		System.out.println("______________________________");
		str = str.concat(" World");
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println("______________________________");

		System.out.println(str.concat(" Program"));
	}
}