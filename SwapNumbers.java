import java.util.Scanner;
public class SwapNumbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 integer numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a="+a+" b="+b);
		
	}

}
