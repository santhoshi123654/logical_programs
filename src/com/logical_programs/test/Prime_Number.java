package com.logical_programs.test;

import java.util.Scanner;

public class Prime_Number {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Value ");
	
	 int Number =sc.nextInt();
	boolean isPrime = true;
	 int i;
	 for(i=2;i<=Number/2;i++)
	 {
		if(Number%i==0)
		{
	        isPrime=false;
			
		 }
	 }
	 if(isPrime)
	 {
		 System.out.println( "It is a Prime Number ");
	 }
	 else
	 {
		 System.out.println("It is Not a Prime Number ");
	 }
}
}
