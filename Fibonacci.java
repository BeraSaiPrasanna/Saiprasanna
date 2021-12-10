<<<<<<< HEAD
package com.technoelevate.basics;

public class Fibonacci {
	void fibonacci() {
		int a=0,b=1,c,count=10;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<count;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		f.fibonacci();
	}

}
=======
package com.technoelevate.basics;

public class Fibonacci {
	void fibonacci() {
		int a=0,b=1,c,count=10;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<count;i++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		f.fibonacci();
	}

}
>>>>>>> ca8077840db87a6101cbec6af10e97e7900a0621
