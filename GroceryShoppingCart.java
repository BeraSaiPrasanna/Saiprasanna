package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GroceryShoppingCart {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("---select your option---");
		System.out.println("1.Add items to your cart");
		System.out.println("2.View items");
		System.out.println("3.Search item");
		System.out.println("4.Remove items");
		System.out.println("5.Replace items");
		System.out.println("6.Exit");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		while(i!=6) {
			System.out.println("enter your choice");
			int j=sc.nextInt();
			switch(j) {
				case 1:
					{
						System.out.println("enter number of items ");
						int a=sc.nextInt();
						for(int x=0;x<a;x++) {
							System.out.println("Enter items");
							String s=sc.next();
							list.add(s);
							
						}
						break;
					}
				case 2:{
						System.out.println("Items list in your cart");
						Iterator itr=list.iterator();
						while(itr.hasNext()) {
						   System.out.println(itr.next());					
						}
						break;
				}
				case 3:{
						System.out.println("enter index");
				  	   int b=sc.nextInt();
				  	   if(b<=list.size()) {
				  		   System.out.println(list.get(b));
				  	   }
				  	   else {
				  		 System.out.println("enter valid index");
				  	   }
				  	   break;
				}
				case 4:{
					
					Iterator it=list.iterator();
						while(it.hasNext()) {
							System.out.println(it.next());	
					    
						}
						   System.out.println(" enter how many items you want to remove ");
						   int c=sc.nextInt();
						   while(c<=list.size()) {
							   for(int x=1;x<=c;x++) {
								   list.remove(x);
							   }
						   }
						   break;
				}
				case 5:{
						Iterator iter=list.iterator();
					   while(iter.hasNext()) {
						   System.out.println(iter.next());	
			    
					   }
					   System.out.println("enter item index you want to replace");
					   int d=sc.nextInt();
					   String s1=sc.nextLine();
					   list.set(d,s1);
					   break;
				}
				default:{
					System.out.println("enter your choice: ");
					i=sc.nextInt();
				}
					
				}
				
		
					
			}	  
		System.out.println("Thank you");
	
			}
		}
	

