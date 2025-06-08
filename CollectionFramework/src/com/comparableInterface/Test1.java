package com.comparableInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Product implements Comparable {
	private int productId;
	private String productName;
	private int productPrice;

	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Product p1 = new Product(2, "Laptop", 56000);
		Product p2 = new Product(3, "Mobile", 34000);
		Product p3 = new Product(1, "Tv", 86000);

		List<Product> list = Arrays.asList(p1, p2, p3);
		System.out.println(list);
		Collections.sort(list);

		System.out.println(list);
	}
}
