/** 
 * Sample code to demonstrate method overloading
 * 
 * 
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */ 


//package com.alancowap.cag.testing;

class UtilApp{
	public int add(int num, int num2){
		return (num + num2);
	}
	public double add(double num, double num2){
		return (num + num2);
	}
	public int add(int[] arr){
		int total=0;
		for(int i : arr){
			total += i;
		}
		return total;
	}
	public static void main(String[] args){
		UtilApp ua = new UtilApp();
		int total = ua.add(11, 10);
		double sum = ua.add(11.7D, 9.51D);
		System.out.println(total +" "+ sum);

		//What about an unkknown amount of numbers to add
		int[] arr = {1,2,3,4,5};
		total = ua.add(arr);
		System.out.println(total);
		
	}
}
