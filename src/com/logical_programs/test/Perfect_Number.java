package com.logical_programs.test;

import java.util.Scanner;

public class Perfect_Number {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :  ");
		
		int Number =sc.nextInt();
		int Sum=0;
		int i=1;
		while(i<=Number/2)
			
		{
			if(Number%i==0)
			{
				Sum=Sum+i;
			}
			i++;
		}
		if(Sum==Number)
		{
			System.out.println("It is a Perfect Number  ");
			
		}
		else
		{
			System.out.println("It is not a Perfect Number  ");
		}
}
}
