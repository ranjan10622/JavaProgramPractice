package com.java.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21...
		
		int f1=0;
		int f2=1;
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the number for Fibonacci series");
		 
		  int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println(f1 +" ");
			
			int f3=f2+f1;
			f1=f2;
			f2=f3;
		}
		
	    System.out.println("The fibonacci series are as follows");
		

	}

}
