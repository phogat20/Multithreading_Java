package com.thread;

public class ThreadExtends extends Thread {
	@Override
	public void run() {
		System.out.println("Inside : " + Thread.currentThread().getName());
	}
	
	 public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());
		
		
		System.out.println("Creating Thread........");
		Thread t1 = new ThreadExtends();
		Thread t2 = new ThreadExtends();
		
		System.out.println("Starting Thread.........");
		t1.start();
		t2.start();
	}
}
