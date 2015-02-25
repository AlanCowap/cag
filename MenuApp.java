/**
 * Sample code to demonstrate use of decision statement: if
 * 
 * Use of other decision statements not permitted.
 *	
 * @author Alan Cowap
 * @version 1.0 Menu-driven interface
 * 
 * 
 * 
 */


//package com.alancowap.cag.testing;

import java.io.Console;

class MenuApp{
	public static void main(String[] args){
		//Display menu
		System.out.println("1) Enter a name");
		System.out.println("2) Enter an age");
		System.out.println("3) Quit");

		//Get user choice
		Console con = System.console();
		String choiceStr = con.readLine("Please enter your choice: ");
		int choice = Integer.parseInt(choiceStr);
		//System.out.println("You chose " + choiceStr +" "+ choice);

		//Decide what to do based on user choice
		//Enter Name
		if(choice == 1){
			//System.out.println("You chose " + choice);
			String name = con.readLine("Please enter your name: ");
			System.out.println("Hello " + name);
		}

		//Enter Age
		if(choice == 2){
			//System.out.println("You chose " + choice);
			String age = con.readLine("Please enter your age: ");
			System.out.println("You are " + age);
		}

		//Exit
		if(choice == 3){
			System.out.println("Goodbye!");
		}

	}
}
