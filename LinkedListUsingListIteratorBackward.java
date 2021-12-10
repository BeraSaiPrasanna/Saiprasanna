package com.technoelevate.basics;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsingListIteratorBackward {
	private static LinkedList<LinkedListTest> l1 = new LinkedList<LinkedListTest>();

	public static void main(String[] args) {

		LinkedListTest t1 = new LinkedListTest("Kaaki", "Kakinada");
		LinkedListTest t2 = new LinkedListTest("Urmila", "Uganada");
		LinkedListTest t3 = new LinkedListTest("Sahoo", "Santoshnagar");
		LinkedListTest t4 = new LinkedListTest("Revanth", "Raipur");
		LinkedListTest t5 = new LinkedListTest("Nani", "Noida");
		l1.add(t1);
		l1.add(t2);
		l1.add(t3);
		l1.add(t4);
		l1.add(t5);
		getElements();
	}

	public static void getElements() {
		ListIterator itr = l1.listIterator(l1.size());
		while (itr.hasPrevious()) {
			LinkedListTest test = (LinkedListTest) itr.previous();
			System.out.println(test.getName() + " is from " + test.getPlace());
		}
	}

}
