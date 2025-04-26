package com.set5;

//13. Count the sum of numbers in a string
public class p13 {
	public static void main(String[] args) {
		String str = "abc12def34";
		int sum = 0;
		String num = "";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c))
				num += c;
			else {
				if (!num.isEmpty()) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}
		}
		if (!num.isEmpty())
			sum += Integer.parseInt(num);
		System.out.println("Sum: " + sum);
	}
}
