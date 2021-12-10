package com.technoelevate.thread;

public class Server2 implements Runnable {

	@Override
	public void run() {
	System.out.println("My second thread is "+Thread.currentThread().getName());
		
	}


}
