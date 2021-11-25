package com.technoelevate.basics;

public class Armstrong {
	int res=0,rem,temp=0;
	
	
	 void isArmstrong(int num) {	
		
		temp=num;
		while(num!=0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if(temp==res)
			System.out.println(res+"is Armstrong number");
		else
			System.out.println(res +" is not Armstrong number");
	}
	public static void main(String[] args) {
		Armstrong arm=new Armstrong();
		arm.isArmstrong(153);
	}

}
