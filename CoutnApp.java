/**
 * Sample code to demonstrate for loop
 * Calculate the sum of the numbers 1to100 inclusive
 * Caluclate the mean of the above numbers, including non-whole numbers.
 * Note the use of 'F' for floating point literal
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */


//package com.alancowap.cag.testing;
class CountApp{
	public static void main(String[] args){
		int sum = 0;
		float mean=0.0F;
		for(int i=1; i<101; ++i){
			sum = sum +i;
		}
		mean = sum/100.0F;
		System.out.println("Total = " + sum + "\nMean = " + mean);
	}
}
