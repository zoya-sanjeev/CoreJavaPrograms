package com.bridgeLabz.coreJava;

public class LargestAmongThree {

	public static void main(String[] args) {
		int number1=4,number2=45,number3=10;
		
		int tempNumber=number1>number2?number1:number2;
		int largestNumber=tempNumber>number3?tempNumber:number3;
		
		System.out.println("The largest number among the three is:"+largestNumber);

	}

}
