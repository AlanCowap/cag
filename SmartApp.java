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
	Device[] devices = new Device[100];

	public static void main(String[] args){
		new SmartApp().runProgram();
	}

	private void runProgram(){
		//Create & Populate Array		
		for(int i=0; i < 100; ++i){
			devices[i] = new Phone("Samsumg", "S6", 6, "1880000000");
			devices[++i] = new Tablet("Samsumg", "Tab4", 10);
		}

		String choice = "Not Applicable";
		do{
			// Display menu
			System.out.println("1) Enter details at specific position");
			System.out.println("2) Print all details");
			System.out.println("3) Calculate total screensize");
			System.out.println("4) Quit");
	
			//Get user choice
			Console con = System.console();
			choice = con.readLine("Please enter an option: ");
			//System.out.println(choice);
	
			//Evaluate user choice
			switch(choice){
				case "1" :	System.out.println(choice); break;
				case "2" :	this.outputDetails(); break;
				case "3" :	System.out.println(choice); break;
				case "4" :	System.out.println("Goodbye!"); break;
				default	 :	System.out.println("Invalid choice"); break;
			}//switch
		}while(!choice.equals("4"));
		

	
	}

	private void outputDetails(){
		//Output Device details				
		for(int i=0; i < 100; ++i){
			System.out.println(devices[i] +" ");
		}
	}

}

class Device{
	private String manufacturer = "Unknown";
	private String model = "Unknown";
	private int screenSize = -1;
	
	Device(){}
	
	Device(String manufacturer, String model, int screenSize){
		this.manufacturer = manufacturer;
		this.model = model;
		this.screenSize = screenSize;
	}

	//@Override
	public String toString(){
		return (manufacturer +" "+ model +" "+ screenSize);
	}

}

class Phone extends Device{
	String phoneNumber;

	Phone(String manufacturer, String model, int screenSize, String phoneNumber){
		super(manufacturer, model, screenSize);
		this.phoneNumber = phoneNumber;
	}

	//@Override
	public String toString(){
		return super.toString() + " "+ phoneNumber;
	}
}

class Tablet extends Device{
	Tablet(String manufacturer, String model, int screenSize){
		super(manufacturer, model, screenSize);
	}
}

