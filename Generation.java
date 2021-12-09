package com.technoelevate.collection;

import java.util.Scanner;

public class Generation {
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	int year=2021-age;
	
	 if(year<=1996 && year>=1981) {
			System.out.println("You belong to Mellenial");
	 }
			else if(year>=1997 && year<=2021) {
		System.out.println("You belong to Gen-Z");
	}
		
		else 
			System.out.println("You don't belong to any Generation");
	 sc.close();
	}
	
}

		


