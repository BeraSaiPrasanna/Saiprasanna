package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GroceryItems {
	static public ArrayList<String> items=new ArrayList<String>();
	public static void main(String[] args) {
		items.add("Salt");
		items.add("Sugar");
		items.add("Lentils");
		items.add("Oil");
		items.add("Spices");
		items.add("Meat");
		items.add("Fruits");
		items.add("Eggs");
		items.add("Bread");
		items.add("Butter");
		System.out.println("....Grocery items list....");
		getItems();
		System.out.println("....Searched Items....");
		findItems();
		System.out.println("....after removing cart list...");
		removeItems();
		System.out.println("...After Replacing the cart list....");
		replaceItems();
		
	}
	
	public static void getItems() {
		Iterator itr=items.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}	
	public static void findItems() {
		System.out.println(items.get(2));
	}
	public static void removeItems() {
		items.remove(2);
		items.remove(5);
		items.remove(6);
		for(String i:items) {
			System.out.println(i);
		}
	}
	public static void replaceItems() {
		items.set(1,"Jam");
		for(String i:items) {
			System.out.println(i);
		}
	}
	
	
	
}
