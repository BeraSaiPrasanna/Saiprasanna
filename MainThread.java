package com.technoelevate.thread;

public class MainThread {
public static void main(String[] args) {
	System.out.println("Main Thread is called");
	Server1 s1=new Server1();
	s1.start();
	Server2 s2=new Server2();
//	Thread t1=new Thread(s2);
//	t1.start();
//	s1.display();
	
//	new Thread(){
//
//		@Override
//		public void run() {
//			System.out.println("My third thread is "+Thread.currentThread().getName());
//		}
		
//	}.start();
	Thread t2=new Thread(new Server1() {

		@Override
		public void run() {
			try {
				s1.join(5000);
				System.out.println("I cant wait I'm starting my execution ");
			} catch (InterruptedException e) {
				e.printStackTrace()
;			}


		}
		
	});
	t2.start(); 
}

}
