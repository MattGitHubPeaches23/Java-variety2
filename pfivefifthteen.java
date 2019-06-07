// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to use recursive function to reverse string
 */
import java.util.Scanner;
public class pfivefifthteen {
	
	public static String reverse(String str) {
		
		
		if(1 == str.length()) {
			return str;
		}
		else {
			return reverse(str.substring(1)) + str.charAt(0);
		}
		
				
	}
	
	public static void main(String args[]) {
		
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter string to reverse : ");
			
			String input = in.next();			
			
			System.out.println("input = " + input + " \nReversed = " + reverse(input));			
		
	}
}
