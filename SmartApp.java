/** 
 * Sample code to demonstrate Inheritance, method overriding
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

import java.io.Console;

class SmartApp{
	public static void main(String[] args){
		// Display menu
		System.out.println("1) Enter details at specific position");
		System.out.println("2) Print all details");
		System.out.println("3) Calculate total screensize");
		System.out.println("4) Quit");

		//Get user choice
		Console con = System.console();
		String choice = con.readLine("Please enter an option: ");
		//System.out.println(choice);

		//Evaluate user choice
		switch(choice){
			case "1" :	System.out.println(choice); break;
			case "2" :	System.out.println(choice); break;
			case "3" :	System.out.println(choice); break;
			case "4" :	System.out.println(choice); break;
			default	 :	System.out.println("Invalid choice"); break;
		}


		Phone[] phones = new Phone[50];
		Tablet[] tablets = new Tablet[50];
	}
}


class Phone{
}

class Tablet{
}

