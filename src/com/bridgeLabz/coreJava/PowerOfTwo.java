package com.bridgeLabz.coreJava;

public class PowerOfTwo {
	
	public static boolean isLeapYear(int year) {
		
		if((year%4==0 &&year%100!=0) || (year%400==0)) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int N=Integer.parseInt(args[0]);
		double year=0;
		boolean isLeap;
		if(N>0 && N<=31) {
			
			for(int powerOfN=1; powerOfN<=N; powerOfN++) {
				year=Math.pow(2, powerOfN);
				isLeap=isLeapYear((int)year);
				if(isLeap==true)
					System.out.println((int)year+" is a leap year");
				else
					System.out.println((int)year+" is not a leap year");
			}
		}
		else {
			System.out.println("Enter N between 1 and 31");
		}
		
	}

}
