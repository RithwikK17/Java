package com.set5;

//19. Replacing a particular word with another word in a string
public class p19 {
	public static void main(String[] args) {
		String str = "this is a java test";
		System.out.println("Before replacing: "+ str);
		System.out.println("After Replacing:"+ str.replaceAll("\\btest\\b", "quiz"));		
	}
}
