package com.technoelevate.basics;

import java.util.Scanner;
public class Sorting {	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("print array size");
		int size=scan.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[size];
	
		for( int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for (int i = 0; i < size; i++) 	{  
		for (int j = i + 1; j < size; j++)  		{  
		int tmp = 0;  
		if (arr[i] < arr[j])   {  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		scan.close();
		
		System.out.println(arr[i]);  
	}
}
}
		




