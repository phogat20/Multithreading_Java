package com.FutureAndCallable;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableInvokeAnyExample {
	
	public static void main(String[] a) throws InterruptedException, ExecutionException{
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Callable<String> task1 = ()-> {
			Thread.sleep(1000);
			return "Task 1!! ";
		};
		
		Callable<String> task2 = ()-> {
			Thread.sleep(2000);
			return "Task 3!! ";
		};
		
		Callable<String> task3 = ()-> {
			Thread.sleep(3000);
			return "Task 3!! ";
		};
		
		String result = executorService.invokeAny(Arrays.asList(task1,task2,task3));
		
		System.out.println(result);
		executorService.shutdown();
	}

		
}
