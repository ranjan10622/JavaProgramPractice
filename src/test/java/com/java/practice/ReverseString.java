package com.java.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sbc = new Scanner(System.in);
			System.out.println("Please Enter the string");
			   
			   String str= sbc.nextLine();
			
			String rev ="";
			
			for(int i=str.length()-1; i>=0;i-- )
			{
				rev= rev +str.charAt(i);
			}
			
			System.out.println("The reverse string is "+ rev);
		}

	}


