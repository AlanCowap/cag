/** 
 * Sample code to demonstrate inheritance, overriding, constructors, super, this
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

	private static final int MAX_NUM_VEHICLES = 90;
	private static final int MAX_NUM_CARS = 70;
	private static final int MAX_NUM_MOTORBIKES = 10;
	private static final int MAX_NUM_VANS = 10;
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
		int lastMotorbike = MAX_NUM_CARS + MAX_NUM_MOTORBIKES;
		for(int i=MAX_NUM_CARS; i < lastMotorbike; ++i){
			veh[i] = new MotorBike("VIN:"+ (i), "152-D-" + (i), true);
		}
		//Add vans
		//int lastVan = MAX_NUM_CARS + MAX_NUM_MOTORBIKES + MAX_NUM_VANS;
		for(int i=lastMotorbike; i < MAX_NUM_VEHICLES; ++i){
			veh[i] = new Van("VIN:"+ (i), "152-D-" + (i), false, 25.5D);
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
		this("Unknown", "Unknown");
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

	public MotorBike(String vin, String regNumber, boolean hasSidecar){
		super(vin, regNumber);
		this.hasSidecar = hasSidecar;
	}

	public String toString(){
		String str = this.hasSidecar ? "Has sidecar" : "Has no sidecar";
		return super.toString() + " " + str;
	}

}

class Van extends Vehicle{
	boolean hasTowHitch;
	double capacity;

	public Van(String vin, String regNumber, boolean hasTowHitch, double capacity){
		super(vin, regNumber);
		this.hasTowHitch = hasTowHitch;
		this.capacity = capacity;
	}

	public String toString(){
		String str = this.hasTowHitch ? "Has Towhitch" : "Has no Towhitch";
		return super.toString() + " " + str +" "+ this.capacity;
	}

}
