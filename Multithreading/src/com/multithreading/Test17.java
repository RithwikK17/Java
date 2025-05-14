package com.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class T1_A implements Callable<String> {
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 50000; i++)
			continue;
		return "Task 1 Completed...";
	}
}

class T2_A implements Callable<String> {
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 50; i++)
			continue;
		return "Task 2 Completed...";
	}
}

public class Test17 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		List<Callable<String>> list = Arrays.asList(new T1_A(), new T2_A());
//		List<Future<String>> tasks = newCachedThreadPool.invokeAll(list);
//		for (Future<String> task : tasks) {
//			System.out.println(task.get());
//		}
		String invokeAny = newCachedThreadPool.invokeAny(list);
		System.out.println(invokeAny);
		newCachedThreadPool.shutdown();
	}
}
