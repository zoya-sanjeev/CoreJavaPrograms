package com.bridgeLabz.coreJava;

public class PrimeFactors {

	public static void main(String[] args) {
		int number=50;
		while(number%2==0) {
			System.out.println("2 ");
			number=number/2;
		}
		for(int divisor=3;divisor*divisor<=number; divisor=divisor+2) {
			
			while(number%divisor==0) {
				System.out.println(divisor+" ");
				number=number/divisor;
			}
		}
		if (number > 2)
            System.out.println(number);
		

	}

}
