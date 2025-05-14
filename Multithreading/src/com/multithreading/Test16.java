package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TX implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "Task Completed";
	}
}

public class Test16 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		Future<String> response = newCachedThreadPool.submit(new TX());
		System.out.println(response.get());
		newCachedThreadPool.shutdown();
	}

}
