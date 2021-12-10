package com.technoelevate.collection;

public class Demo {
public void m1() {
	System.out.println("demo");
}
}
class B extends Demo{
	public void m1() {
		System.out.println("class b");
	}
	public static void main(String[] args) {
		
	
	Demo b=new B();
	b.m1();
	}
}

