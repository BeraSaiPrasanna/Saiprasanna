package com.technoelevate.collection;

import java.util.Iterator;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayListImplementation list = new ArrayListImplementation(2);
		list.addElements("prassu");
		list.addElements("bindu");
		list.addElements("kaki");
		System.out.println(list.size());
		list.addElements("Sachin");
		list.addElements("sai");
		list.addElements("prasanna");
		
		System.out.println(list.size());
		System.out.println("getElements");
		list.getAllElement();
	

		
	System.out.println("Iterator used ");
		Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		

	}
}
