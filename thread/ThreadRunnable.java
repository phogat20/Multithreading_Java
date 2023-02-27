package com.thread;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside:" + Thread.currentThread().getName());
	}
	
	
	public static void main(String[] a) {
		System.out.println("Inside:" + Thread.currentThread().getName());
		
		System.out.println("Creating Runnable.....");
		Runnable runnable = new ThreadRunnable();
		
		System.out.println("creating thread........");
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}
}
