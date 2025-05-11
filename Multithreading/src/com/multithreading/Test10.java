package com.multithreading;

class SharedResource {
	static int counter = 0;

	public synchronized void incrementCounter() {
		counter++;
	}
}

public class Test10 {
	public static void main(String[] args) throws InterruptedException {
		SharedResource sr = new SharedResource();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					sr.incrementCounter();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					sr.incrementCounter();
				}
			}
		};

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("The final value of counter:" + SharedResource.counter);
	}
}
