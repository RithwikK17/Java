package com.generics;

class Generic<T> {
	private T obj;

	Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}
}

public class Test2 {
	public static void main(String[] args) {
		Generic<Integer> intObj = new Generic<>(10);
		Generic<Float> floatObj = new Generic<>(11.5f);
		Generic<Double> doubleObj = new Generic<>(14.56778);
		Generic<String> strObj = new Generic<>("This is Generic Class");

		System.out.println(intObj.getObj());
		System.out.println(floatObj.getObj());
		System.out.println(doubleObj.getObj());
		System.out.println(strObj.getObj());
	}
}
