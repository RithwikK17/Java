package com.set5;

//12. Remove brackets from an algebraic expression
public class p12 {
	public static void main(String[] args) {
		String str = "(a+b)*[c-d]";
		System.out.println(str.replaceAll("[(){}\\[\\]]", ""));
	}
}
