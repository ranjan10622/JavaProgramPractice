package com.java.practice;

import java.util.Scanner;

public class ReverseAnumber {
    //123    
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		
		  int num = sc.nextInt();
		  
		  int  rev =0;
		  
		   while (num>0)
		   {
			   
			     
			   int rem= num%10;
			   rev = rev *10+rem;
			   num= num/10;
			   
			    
		   }
		  
		  System.out.println(" The reversed number is "+ rev);

	}

}
