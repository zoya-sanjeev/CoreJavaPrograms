package com.bridgeLabz.coreJava;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int number1=25, number2=43;
		System.out.println("Initial value of number 1:"+number1);
		System.out.println("Initial value of number 2:"+number2);
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("Value of number 1 after swap:"+number1);
		System.out.println("Value of number 2 after swap:"+number2);
	}

}
