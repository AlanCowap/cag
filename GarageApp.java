/** 
 * Sample code to demonstrate inheritance, overriding, consurctors, super, this
 * Invoke methods on an object
 * Call an objects constructor
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */ 


//package com.alancowap.cag.testing;

public class GarageApp{

	private static final int MAX_NUM_VEHICLES = 100;
	private static final int MAX_NUM_CARS = 90;
	private Vehicle[] veh = new Vehicle[MAX_NUM_VEHICLES];

	public static void main(String[] args){
		System.out.println("Hello world");
		new GarageApp().createVehicles();
		
	}

	private void createVehicles(){
		//Add cars
		for(int i=0; i < MAX_NUM_CARS; ++i){
			veh[i] = new Car("VIN:"+ (i), "152-D-" + (i));
		}
		//Add motorbikes
		for(int i=MAX_NUM_CARS; i < MAX_NUM_VEHICLES; ++i){
			veh[i] = new MotorBike("VIN:"+ (i), "152-D-" + (i));
		}

		//Display details
		for(int i=0; i < MAX_NUM_VEHICLES; ++i){
			System.out.println(veh[i]);
		}

	}

}

class Vehicle{
	private String vin;
	private String regNumber;

	public Vehicle(){
		this.vin = "Unknown";
		this.regNumber = "Unknown";
	}

	public Vehicle(String vin, String regNumber){
		this.vin = vin;
		this.regNumber = regNumber;
	}

	public String toString(){
		return this.vin + " " + this.regNumber;
	}

}

class Car extends Vehicle{
	public Car(String vin, String regNumber){
		super(vin, regNumber);
	}

}

class MotorBike extends Vehicle{
	boolean hasSidecar;

	public MotorBike(String vin, String regNumber){
		this(vin, regNumber, false);
	}

	public MotorBike(String vin, String regNumber, boolean hasSidecar){
		super(vin, regNumber);
		this.hasSidecar = hasSidecar;
	}

	public String toString(){
		return super.toString() + " " + this.hasSidecar;
	}

}
