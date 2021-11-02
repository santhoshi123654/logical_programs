package com.logical_programs.test;

import java.util.Scanner;

public class Quadratic_Roots_Equation {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);

	System.out.println("Enter thevalue of A :  ");
	double a=sc.nextDouble();
	System.out.println("Enter thevalue of B :  ");
	double b=sc.nextDouble();
	System.out.println("Enter thevalue of C :  ");
	double c=sc.nextDouble();

	double delta = (b*b)-4.0*a*c;
	double d=Math.sqrt(delta);
	if(delta > 0.0)
	{
	double Root_of_X1 = (-b+d)/(2.0*a);
	
	double Root_of_X2 = (-b-d)/(2.0*a);
	 
	System.out.println("Roots are : "+Root_of_X1 + "and" +Root_of_X2);
	}
	else if(delta == 0.0)
	{
		double Root_of_X1= -b/(2.0 *a);
	
		System.out.println("The root is " + Root_of_X1);
	
	}
	else
	{
		System.out.println("Roots are not real ");
	}
	
	}
}
	
