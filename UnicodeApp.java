/**
 * Sample code to demonstrate use of char and Unicode values
 * Also demonstrate overflow condition in integer primitives
 * 
 * 
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */

//package com.alancowap.cag.testing;

public class UnicodeApp{
	public static void main(String[] args){

		int count=0;
		//char is an unsigned int, and so can be treated as a number
		for(char i=32; i < 132; ++i){
			System.out.print(i + " ");
			++count;
			if(count == 10){
				System.out.println("");
				count=0;
			}
		}

		// Primitive overflow
		// Strange things happen when we go beyond the range of primitives
		// Range of byte is -128 to 127, what happens if we go to 128 or beyond?
		// An understanding of Twos Complement is needed to understand why...
		// 127 + 1 = -128
		// 0111 1111 + 1 = 1000 0000
		for(int i = 126; i <130; ++i){
			System.out.println((byte) i);
		}

		// Another example of primitive overflow
		// Be careful when you cast (just like fishing!)
		short s = 32767;
		short t = 10;
		short u = (short) (t + s);
		System.out.println(u);
		
	}
}
