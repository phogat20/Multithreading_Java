package com.thread;

import java.util.Iterator;

public class ThreadSleep {

	public static void main(String[] args) {
		System.out.println("Inside" + Thread.currentThread().getName());
		
		String[] message = {"chetan", "ketan", "phogat", "gitesh"};  
		
		
		Runnable runnable = ()-> {
			System.out.println("Inside : " + Thread.currentThread().getName());
			
			for(String m: message) {
				 System.out.println(m);
				 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		
	}

}
