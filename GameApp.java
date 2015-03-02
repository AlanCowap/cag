/**
 * Sample code to demonstrate while loop, exception handling, ternary operator
 * Ask user how many times they want to play a game and count down
 * Use Exception handling for invalid user input
 * 
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */


//package com.alancowap.cag.testing;

import java.io.Console;

class GameApp{
	public static void main(String[] args){
		//User IO
		System.out.println("~~~Game Master~~~ ");
		Console con = System.console();		
		int numLivesLeft=0;
		boolean invalidEntry = true;

		//Get valid input from user
		while(invalidEntry){
			String strChoice = con.readLine("How many lives would you like to have? ");
			try{
				numLivesLeft = Integer.parseInt(strChoice);
				invalidEntry = false;
			}catch(NumberFormatException nfe){
				System.out.println("An invalid number was entered");
			}
		}//while


		//Play game
		while (numLivesLeft > 0){
			numLivesLeft--;
			//String mult="lives";
			//if (numLivesLeft == 1){mult = "life";}
			String mult = numLivesLeft==1 ? "life" : "lives"; //ternary operator
			System.out.println("...playing. "+ numLivesLeft + mult + "  remaining");
			
		}
		System.out.println("GAME OVER!\nEnter 10p to play again");
	}
}
