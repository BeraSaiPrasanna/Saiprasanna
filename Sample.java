package com.technoelevate.thread;

 abstract class Anshu {
	public  void greet() {
	System.out.println("Hello "+this.getName());
	}
	public String getName() {
		return "Sai";
	}
}
public class Sample extends Anshu{
	public static void main(String[] args) {
		
	
	Sample s=new Sample();
	 s.greet();
	System.out.println(s.getName());
	}
}  