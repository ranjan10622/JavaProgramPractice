package com.java.practice;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// 9119  --- reversed num  
		
		Scanner sc = new Scanner(System.in);
		 
		  System.out.println(" Enter a number to check if it is a palindrom or not");
		  
		     int num = sc.nextInt();
		     
		     int temp;
		     int rev =0;
		     temp=num;
		     
		     
		     while (num>0)
		     {
		    	 
		    	 int rem = num%10;
		    	  rev= rev *10 + rem;
		    	  num = num/10;
		    	  
		    	  
		     }
		     
		     if( temp==rev)
		   
		    	 System.out.println("The number is palindrome ");
		     
		     
		     else 
		    	 System.out.println("The number is not a plainddrome");

		     
		    
	}

}
