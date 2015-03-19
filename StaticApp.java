/** 
 * Sample code to demonstrate use of static variables
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


class StaticApp{

	private static final int MAX_NUM_PEOPLE=20;
	private Person[] people = new Person[MAX_NUM_PEOPLE];

	public static void main(String[] args){
		new StaticApp().runProgram();		
	}

	private void runProgram(){
		for(int i=0; i < people.length; ++i){
			people[i] = new Person("Joe Doe"+i, 21+i);
		}
		for(int i=0; i < people.length; ++i){
			System.out.println(people[i]);
		}
		System.out.println("Total number of Person objects = " + 
			Person.getNumPersons());		
	}

}


class Person{
	private String name;
	private int age;
	private static int count = 0;

	Person(String name, int age){
		this.name = name;
		this.age = age;
		count++;
	}

	public String toString(){
		return (name +" "+ age);
	}

	public static int getNumPersons(){
		return count;
	}

}



