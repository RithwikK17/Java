package com.strings;

//Non-primitive : == (compare reference), equals()
public class test2 {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		String str2 = "hello";

		if (str1 == str2)
			System.out.println("Points to same object");
		else
			System.out.println("points to different object");

	}

}