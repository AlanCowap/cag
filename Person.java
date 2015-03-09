/** 
 * Sample code to demonstrate a simple class 
 * Class contains 'state' and 'behaviour'
 * Uses 'data hiding' and follows Javabeans convention
 *  
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 *  
 *  
 *  
 */ 

//package com.alancowap.cag.testing;

class Person{
	//state
	private String name ="Name not set";
	private float age = -1.0F;
	
	//constructors
	Person(){super();}

	Person(String name, float age){
		this.setName(name);
		this.setAge(age);
	}

	//behaviour
	public String getName(){
		return this.name;
	}
	public float getAge(){
		return this.age;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(float age){
		if(age >= 0.0F && age < 100){
			this.age = age;
		}
	}	
}
