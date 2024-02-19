package com.java.practice;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		
		//5! = 5x4x3x2x1;
		
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		
		
		

	}
		System.out.println("factorial of a number is " + fact);

	}
}
