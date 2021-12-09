package com.technoelevate.thread;

public class Server1 extends Thread {
	public void display() {
		System.out.println("Displaying....");
	}
//	@Override
//	public void run() {
//		try {
//			Thread.sleep(2000);
//			System.out.println("My first thread is"+Thread.currentThread().getName());
//		}
//		catch(InterruptedException e) {
////			System.out.println("My first thread is"+Thread.currentThread().getName());
//		}
		
	
//	}
	@Override
	public void run() {
		System.out.println("");
	}

}
