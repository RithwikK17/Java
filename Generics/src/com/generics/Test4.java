package com.generics;

//BoundedType parameter
public class Test4 {
	public static <T extends Number> void add(T obj, T obj2) {
		double sum= 0.0;
		sum = obj.doubleValue() + obj2.doubleValue();
        System.out.println("Sum: " + sum);
	}
	public static void main(String[] args) {
		add(10, 20);        
        add(5.5, 3.3);       
        add(4.5f, 2.5f);
	}
}
