package com.logical_programs.test;

import java.util.Scanner;

public class Reverse_Of_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number :  ");
	int Num=sc.nextInt();
	  int Reverse_Num =0;
	  while(Num != 0)
	  {
		  int Remainder=Num%10;
		  Reverse_Num=Reverse_Num*10+Remainder;
		  Num =Num/10;
		  
	  }
	System.out.println("Reversed Number is :  " +Reverse_Num);
       }
}
