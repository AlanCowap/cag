/**
 * Sample code to demonstrate 'if' and 'switch' statements
 * Validation is omitted for simplicity
 * Requires Java 7 or later (switch statement uses java.lang.String)
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */


//package com.alancowap.cag.testing;

import java.io.Console;

public class GradeApp{

	public static void main(String[] args){
		GradeApp ga = new GradeApp();
		String grade = ga.calculateGrade();
		//String grade = (args.length < 1) ? "undefined" : args[0];
		ga.calculateScore(grade);
	}

	private void calculateScore(String grade){
		grade = grade.toUpperCase();
		String result = "undefined";
		switch(grade){
			case "A" : result = "85-100"; break;
			case "B" : result = "70-84"; break;
			case "C" : result = "55-69"; break;
			case "D" : result = "40-54"; break;
			default  : result = "Fail"; break;
		}
		System.out.println(result);
	}

	private String calculateGrade(){
		Console con = System.console();
		String resultStr = con.readLine("Enter your result (0-100): ");
		int result = Integer.parseInt(resultStr);
		String grade="undefined";
		if(result > 84){ grade = "A"; }
		else if(result > 69){ grade = "B"; }
		else if(result > 54){ grade = "C"; }
		else if(result > 39){ grade = "D"; }
		else { grade = "Fail"; }
		System.out.println(grade);
		return grade;
	}
}



