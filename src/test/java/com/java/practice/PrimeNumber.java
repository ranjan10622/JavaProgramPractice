package com.java.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		 
		
		// prime number - 2, 3, 5 ,7 ,11 (divides by 1 and itself)
		 
		 Scanner sc = new Scanner (System.in);
		 
		 
		   System.out.println(" Enter the number");
		    
		     int num = sc.nextInt();
		   
		   if(num%2==0 && num<2)
		   {
			   System.out.println(" Number is not a prime ");
		   }
		
		   for(int i=2;i<=num/2;i++)
		   {
			   
		   }

	}

}
