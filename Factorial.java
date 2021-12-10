<<<<<<< HEAD
package com.technoelevate.basics;
import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		int fact=1;
		Scanner in = new Scanner(System.in);
		 
        System.out.println("enter num");
 
        int num = in.nextInt();

        
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial of "+num+" is "+fact);
		in.close();
	}

}
=======
package com.technoelevate.basics;
import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		int fact=1;
		Scanner in = new Scanner(System.in);
		 
        System.out.println("enter num");
 
        int num = in.nextInt();

        
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial of "+num+" is "+fact);
		in.close();
	}

}
>>>>>>> ca8077840db87a6101cbec6af10e97e7900a0621
