package com.bridgeLabz.coreJava;

public class FlipCoin {

	public static void main(String[] args) {
		
		int noOfFlips=10;
		int noOfHeads=0;
		for(int index=0;index<noOfFlips;index++) {
			double flip=Math.random();
			if(flip<0.5)
				noOfHeads++;
		}
		int percentOfHeads=noOfHeads*100/10;
		int percentOfTails=(noOfFlips-noOfHeads)*100/10;
		System.out.println("Percentage of Heads="+percentOfHeads);
		System.out.println("Percentage of Tails="+percentOfTails);
		

	}

}
