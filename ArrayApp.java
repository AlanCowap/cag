/**
 * Sample code to demonstrate use of Arrays & for loops
 * Array: creation, initialisation, iteration
 * Calculate min, max, mean, total
 * 
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */


//package com.alancowap.cag.testing;

class ArrayApp{
	public static void main(String[] args){
		//Create array, and array reference
		int[] arr = new int[100];		

		//Array initialisation (1..100)
		for(int i=0; i < arr.length; ++i){
			arr[i] = i+1;			
			//System.out.print(arr[i]+ " ");
		}
		
		//Calculate stats
		int total = 0;
		int min = arr[0]; //initally set to first element in array
		int max = arr[0]; //initally set to first element in array
		for(int i=0; i < arr.length; ++i){
			//calcualte total
			total = total + arr[i]; 
			//calculate min
			if(min > arr[i]){
				min = arr[i];
			}
			//calculate max
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("\nTotal: " + total);
		
		double mean = (double) total / arr.length;
		System.out.println("\nMean: " + mean);
		System.out.println("\nMin: " + min);
		System.out.println("\nMax: " + max);
	}
}
