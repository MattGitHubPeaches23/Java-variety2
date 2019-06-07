// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program that turns zip codes into bar codes
 */

import java.util.Scanner;


public class pfivetwentyfive {
	
	public static void printBarCode(int zipCode) {
		
		int sum = 0;
		
		String sub = "" + zipCode;
		
		
		String combo = "|";
		
		for(int i = 0; i < sub.length(); ++i) {
			
			String fill = "";
			
			
			
			if('1' == sub.charAt(i)) {
				fill = ":::||";
				sum += 1;
			}
			else if('2' == sub.charAt(i)) {
				fill = "::|:|";
				sum += 2;
			}
			else if('3' == sub.charAt(i)) {
				fill = "::||:";
				sum += 3;
			}
			else if('4' == sub.charAt(i)) {
				fill = ":|::|";
				sum += 4;
			}
			else if('5' == sub.charAt(i)) {
				fill = ":|:|:";
				sum += 5;
			}
			else if('6' == sub.charAt(i)) {
				fill = ":||::";
				sum += 6;
			}
			else if('7' == sub.charAt(i)) {
				fill = "|:::|";
				sum += 7;
			}
			else if('8' == sub.charAt(i)) {
				fill = "|::|:";
				sum += 8;
			}
			else if('9' == sub.charAt(i)) {
				fill = "|:|::";
				sum += 9;
			}
			else if('0' == sub.charAt(i)) {
				fill = "||:::";
				sum += 0;
			}
			combo += fill;
			
		}

		
		int j = 0; 
		int tempSum = sum;
		boolean stop = false;
		
		while(stop == false) {
			if(0 == tempSum % 10) {
				stop = true;
			}
			else {
				j += 1;
				tempSum += j;
			}
		}
		
		System.out.println("tempSum = " + tempSum);
		System.out.println("j = " + j);
		
		String fill2 = "";
		if(1 == j) {
			fill2 = ":::||";
		}
		else if(2 == j) {
			fill2 = "::|:|";
		}
		else if(3 == j) {
			fill2 = "::||:";
		}
		else if(4 == j) {
			fill2 = ":|::|";
		}
		else if(5 == j) {
			fill2 = ":|:|:";
		}
		else if(6 == j) {
			fill2 = ":||::";
		}
		else if(7 == j) {
			fill2 = "|:::|";
		}
		else if(8 == j) {
			fill2 = "|::|:";
		}
		else if(9 == j) {
			fill2 = "|:|::";
		}
		else if(0 == j) {
			fill2 = "||:::";
		}
		
		System.out.println("fill2 = " + fill2 + " combo = " + combo);
		combo += fill2;
		
		
		combo += "|";
		System.out.println("Bar Code = " + combo);
		
	}
	
	public static void printDigit(int d) {
		
		
		String sub = "" + d;
		int sum = 0;
		
		for(int i = 0; i < sub.length(); ++i) {
			char c = sub.charAt(i);
			int pop = Character.getNumericValue(c);
			
			
			if(0 == i) {
				sum += 7*pop; 				
			}
			if(1 == i) {
				sum += 4*pop;
			}
			if(2 == i) {
				sum += 2*pop;
			}
			if(3 == i) {
				sum += 1*pop;
			}
			if(4 == i) {
				sum += 0*pop;
			}
		}
		
		System.out.println("Digit = " + sum);
		
		
	}
	
	public static void main(String arg[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter zip code : ");
		
		int zip = in.nextInt();
		
		printBarCode(zip);
		
		printDigit(zip);		
		
		
	}

}
