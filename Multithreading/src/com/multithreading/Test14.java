package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test14 implements Runnable {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new Test14());
		executor.shutdown();
	}

	@Override
	public void run() {
		System.out.println("Task Completed...");
	}
}
