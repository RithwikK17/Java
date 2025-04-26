package com.set5;

//5. Toggle each character in a string
public class p5 {
	public static void main(String[] args) {
		String str = "JaVa iS aN iNtErEsTiNg PrOgRaMmInG lAnGuAgE";
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
			else if (Character.isLowerCase(c))
				sb.append(Character.toUpperCase(c));
			else
				sb.append(c);
		}
		System.out.println(sb);
	}
}
