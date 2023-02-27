package com.thread;

public class ThreadJoin {
	public static void main(String[] a) {
		// CREATE thread 1
		Thread t1 = new Thread(() -> {
			System.out.println("Entered Thread 1");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Exiting thread 1");
		});

		// Create thread 2
		Thread t2 = new Thread(() -> {
			System.out.println("Entered Thread 2");

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Exiting thread 2");
		});
		
		//Starting Thread One
		System.out.println("Starting Thread 1");
		t1.start();
		
		System.out.println("Waiting for thread 1 to complete!!");
		
		try {
			t1.join(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("!! Second Coming!!2 starting");
		t2.start();
	}
}
