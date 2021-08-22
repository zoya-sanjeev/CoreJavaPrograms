package com.bridgeLabz.coreJava;

public class HarmonicNumber {

	public static void main(String[] args) {
		int N=9;
		float harmonicValue=0;
		for(int index=1; index<N; index++) {
			harmonicValue+=(1.0/index);
		}
		System.out.println(harmonicValue);
	}

}
