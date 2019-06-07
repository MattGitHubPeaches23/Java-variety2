// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to compute book price and shipping cost with tax
 */

import java.util.Scanner;

public class pfivenineteen {
	
	public static int poWer(int a, int n, int bring ) {
		
		
		if(1 == n) {
			
			return a;
		}
		
		else { 
			n = n-1;
			return a*poWer(a,n,bring);
					
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = 0;
		int n = 0;
		System.out.println("Enter value for A in A to the power of N : ");
		a = in.nextInt();
		System.out.println("Enter value for N : ");
		n = in.nextInt();
		System.out.println("a = " + a + " n = " + n);
		int bring = 0;
		
		System.out.println(a + " to the power of " + n + " = " + poWer(a,n,bring));
			
		
	}	
}
