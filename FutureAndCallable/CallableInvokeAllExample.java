package com.FutureAndCallable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInvokeAllExample {
	public static void main(String[] a) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Callable<String> task1 = ()-> {
			Thread.sleep(1000);
			return "Task 1 Done";
		};
		
		Callable<String> task2 = ()-> {
			Thread.sleep(2000);
			return "Task 2 Done";
		};
		
		Callable<String> task3= ()-> {
			Thread.sleep(3000);
			return "Task 3 Done";
		};
		
		List<Callable<String>> taskList = Arrays.asList(task1,task2,task3);
		
		List<Future<String>> futures = executorService.invokeAll(taskList);
		
		
		for(Future<String> future: futures) {
			System.out.println(future.get());
		}
		executorService.shutdown();
	}
}
