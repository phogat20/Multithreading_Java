package com.thread;

public class RunnableExampleLambdaExpression {

	public static void main(String[] a) {
		System.out.println("Inside:" + Thread.currentThread().getName());

		// Creating Runnable
		System.out.println("Creating Runnable......");

		Runnable runnable = () -> {

			System.out.println("Inside:" + Thread.currentThread().getName());

		};

		// Creating Thread
		System.out.println("Creating Thread");
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);

		t1.start();
		t2.start();
	}
}
