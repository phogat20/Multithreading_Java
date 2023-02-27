package com.thread;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
		System.out.println("Get Priority of current Thread:"+ Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		System.out.println("Get Priority of  Thread:"+ Thread.currentThread().getPriority());
		
		t1.setPriority(MAX_PRIORITY);
		
		t1.start();
		System.out.println("Thread is alive or not: " + t1.isAlive());
//		t1.stop();
		System.out.println("Thread is alive or not: " + t1.isAlive());
	}

}
