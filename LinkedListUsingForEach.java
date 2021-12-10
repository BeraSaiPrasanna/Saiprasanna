package com.technoelevate.basics;

import java.util.LinkedList;

public class LinkedListUsingForEach {
	private static LinkedList<LinkedListTest> myList = new LinkedList<LinkedListTest>();

	public static void main(String[] args) {
		LinkedListTest t1 = new LinkedListTest("Panna", "Karnataka");
		LinkedListTest t2 = new LinkedListTest("Pranavi", "America");
		LinkedListTest t3 = new LinkedListTest("Ria", "India");
		LinkedListTest t4 = new LinkedListTest("Mounika", "Manikonda");
		LinkedListTest t5 = new LinkedListTest("Sandya", "Sanathnagar");
		myList.add(t1);
		myList.add(t2);
		myList.add(t3);
		myList.add(t4);
		myList.add(t5);
		getElements();
	}

	static void getElements() {
		for (LinkedListTest test : myList) {
			System.out.println(test.getName() + " is from " + test.getPlace());
		}
	}
}
