package com.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	int ProductPrice;

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		this.ProductPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productPrice=]" + ProductPrice + "]";
	}
}

interface Myinterface<T> extends Comparator<T> {

}

class MyInterfaceImpl<T> implements Myinterface<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductPrice() - o2.getProductPrice();
	}

}

public class Test5 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductPrice(3400);

		Product p2 = new Product();
		p2.setProductPrice(1400);

		Product p3 = new Product();
		p3.setProductPrice(1700);

		List<Product> list = Arrays.asList(p1, p2, p3);

		Collections.sort(list, new MyInterfaceImpl());
		System.out.println(list);
	}
}
