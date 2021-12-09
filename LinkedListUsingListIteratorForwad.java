package com.technoelevate.basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsingListIteratorForwad {
	private static LinkedList<LinkedListTest> l = new LinkedList<LinkedListTest>();

	public static void main(String[] args) {

		LinkedListTest t1 = new LinkedListTest("Kumari", "Vijayawada");
		LinkedListTest t2 = new LinkedListTest("Pranay", "Poland");
		LinkedListTest t3 = new LinkedListTest("Kumar", "Kompally");
		LinkedListTest t4 = new LinkedListTest("Krish", "Kurnool");
		LinkedListTest t5 = new LinkedListTest("Lakshmi", "Lucknow");
		l.add(t1);
		l.add(t2);
		l.add(t3);
		l.add(t4);
		l.add(t5);
		getElements();
	}

	public static void getElements() {
		ListIterator itr = l.listIterator();

		while (itr.hasNext()) {
			LinkedListTest test = (LinkedListTest) itr.next();
			System.out.println(test.getName() + " is from " + test.getPlace());
		}
	}
}
