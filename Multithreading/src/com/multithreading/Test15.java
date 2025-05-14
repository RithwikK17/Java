package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 1 Completed by " + Thread.currentThread().getName());
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Task 2 completed by " + Thread.currentThread().getName());
	}
}

public class Test15 {
	public static void main(String[] args) {
//		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
//		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		newCachedThreadPool.execute(new Task1());
		newCachedThreadPool.execute(new Task2());
		newCachedThreadPool.shutdown();
	}
}