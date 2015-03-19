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
			if(i < 40){
				devices[i] = new Phone("Samsung", "S6", 6, "1880000000");
			}else if (i < 80){
				devices[i] = new Tablet("Samsung", "Tab4", 10);
			}else{
				devices[i] = new Watch("Samsung", "Gear", 2);
			}
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
				case "1" :	this.insertDevice(); break;
				case "2" :	this.outputDeviceDetails(); break;
				case "3" :	this.calculateTotScreenSize(); break;
				case "4" :	System.out.println("Goodbye!"); break;
				default	 :	System.out.println("Invalid choice"); break;
			}//switch
		}while(!choice.equals("4"));
	}

	private void insertDevice(){
		//get index
		//get details
		Console con = System.console();
		String manufacturer = con.readLine("Enter Manufacturer: ");
		String model = con.readLine("Enter Model: ");
		String screenSize = con.readLine("Enter Screen Size (inches): ");
		String index = con.readLine("Enter index 1..100 : ");
		int idx = Integer.parseInt(index);
		int intScreenSize = Integer.parseInt(screenSize);

		//add Device to array
		devices[idx-1] = new Tablet(manufacturer, model, intScreenSize);		
				

	}

	private void calculateTotScreenSize(){
		int total=0;
		for(Device d : devices){
			total += d.getScreenSize();
		}

		System.out.println("Total screen size = " + total);
	}

	private void outputDeviceDetails(){
		for(int i=0; i < 100; ++i){
			System.out.println(i+1 +" "+ devices[i] +" ");
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
	
	public int getScreenSize(){
		return this.screenSize;
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

class Watch extends Device{
	Watch(String manufacturer, String model, int screenSize){
		super(manufacturer, model, screenSize);
	}
}
