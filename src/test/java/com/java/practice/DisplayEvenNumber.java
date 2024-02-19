package com.java.practice;

import java.util.Scanner;

public class DisplayEvenNumber {

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		
		   System.out.println(" Enter the end number to display even number");
		   
		   int num = sc.nextInt();
		   
		   for(int i=2; i<=num; i++)
		   {
			   
			   if(i%2==0)
			   {
				   System.out.println(i + " ");
			   }
		   }
		   
		   

	}

}
