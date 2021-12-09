package com.technoelevate.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListUsingIterator {
	private static LinkedList<LinkedListTest> my = new LinkedList<LinkedListTest>();

	public static void main(String[] args) {

		LinkedListTest t1 = new LinkedListTest("Anju", "Kerala");
		LinkedListTest t2 = new LinkedListTest("Keerthi", "Nizampet");
		LinkedListTest t3 = new LinkedListTest("Karthik", "Kolakata");
		LinkedListTest t4 = new LinkedListTest("Pushpa", "Pondicherry");
		LinkedListTest t5 = new LinkedListTest("Sonali", "Saudi");
		my.add(t1);
		my.add(t2);
		my.add(t3);
		my.add(t4);
		my.add(t5);
		getElements();
	}

	public static void getElements() {
		Iterator itr = my.iterator();
		while (itr.hasNext()) {
			LinkedListTest test = (LinkedListTest) itr.next();
			System.out.println(test.getName() + " is from " + test.getPlace());
		}
	}
}
