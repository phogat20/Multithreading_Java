package com.executorAndThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] a) {
		System.out.println("Inside:" + Thread.currentThread().getName());

		System.out.println("Creating Executor Service(thread pool of Size 2)");

		// Created thread pool of size 2.
		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		ExecutorService executorService = Executors.newScheduledThreadPool(1);



		Runnable task1 = () -> {

			System.out.println("Executing task 1 inside:" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		};
		
		Runnable task2 = () -> {

			System.out.println("Executing task 2 inside:" + Thread.currentThread().getName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		};
		
		Runnable task3 = () -> {

			System.out.println("Executing task 3 inside:" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		};
		
		System.out.println("submitting the task for execution:");
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();
	}
}
