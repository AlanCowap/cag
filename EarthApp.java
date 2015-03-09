/** 
 * Sample code to demonstrate creating a custom object 
 * Invoke methods on an object
 * Call an objects constructor
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies package com.alancowap.cag.testing.Person.java
 *  
 *  
 */ 

//package com.alancowap.cag.testing;

class EarthApp{
	public static void main(String[] args){
		System.out.println("Hello world");
		Person my = new Person("Tyler", 30);
		//my.setAge(45);
		//my.setName("Frank");
		System.out.println(my.getName() + my.getAge());
	}
}
