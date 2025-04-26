package com.set5;

//4. Length of the string without using strlen()
public class p4 {
	public static void main(String[] args) {
		String str = "hello";
		int count = 0;
		for (char c : str.toCharArray())
			count++;
		System.out.println("Length: " + count);
	}
}
