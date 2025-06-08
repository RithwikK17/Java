package com.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("JAVA", 3);
		map.put("CyberSecurity", 4);
		map.put("Python", 5);
		map.put("Web Development", 6);
		map.put("JAVA", 10);

		System.out.println(map);

		System.out.println(map.containsKey("JAVA"));
		System.out.println(map.get("JAVA"));

		System.out.println(map.get("JS"));
		System.out.println(map.containsKey(10));

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
