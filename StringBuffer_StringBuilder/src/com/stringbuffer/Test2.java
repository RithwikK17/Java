package com.stringbuffer;

public class Test2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// 1. append
		sb.append("Code");

		// 2. indexOf
		System.out.println(sb.indexOf("C"));

		// 3. lastIndexOf
		System.out.println(sb.lastIndexOf("C"));

		// 4. insert
		System.out.println(sb.insert(0, "Python"));

		// 5. replace
		sb.replace(0, 6, "Java");
		System.out.println(sb);

		// 6. delete
		sb.delete(0, 4);
		System.out.println(sb);

		// 7. reverse
		sb.reverse();
		System.out.println(sb);

		// 8. capacity
		System.out.println(sb.capacity());

		// 9. length
		System.out.println(sb.length());

		// to convert string buffer obj into string obj
		StringBuffer sb2 = new StringBuffer("Java Program");
		String str = sb2.toString();

		// to convert back the string buffer obj into string obj
		StringBuffer sb3 = new StringBuffer(str);

	}
}
