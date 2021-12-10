package com.technoelevate.basics;

import java.util.LinkedList;

public class LinkedListUsingForLoop {
	private static LinkedList<LinkedListTest> list = new LinkedList<LinkedListTest>();

	public static void main(String[] args) {

		LinkedListTest t1 = new LinkedListTest("Shreya", "Australia");
		LinkedListTest t2 = new LinkedListTest("Bindu", "Warangal");
		LinkedListTest t3 = new LinkedListTest("Sherry", "Kukatpally");
		LinkedListTest t4 = new LinkedListTest("Manasa", "Nizambad");
		LinkedListTest t5 = new LinkedListTest("Swetha", "Siddipet");
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		getElements();

	}

	public static void getElements() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " is from " + list.get(i).getPlace());
		}
	}
}
