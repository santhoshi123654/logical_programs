package com.logical_programs.test;

import java.util.Scanner;

public class Fibonacci_Series_Program {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number=sc.nextInt();
				
		int n1=0;
		int n2=1;
		int n3;
		
for(int i=0;i < Number; ++i)
{
	System.out.println(n1 + " ");
    n3=n1+n2;
n1=n2;
n2=n3;
}

}
}