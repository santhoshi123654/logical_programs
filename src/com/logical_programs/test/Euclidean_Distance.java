package com.logical_programs.test;

import java.util.Scanner;

public class Euclidean_Distance {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter X1 Value : ");
	
	int x1=sc.nextInt();

	System.out.println("Enter Y1 Value : ");
	
	int y1=sc.nextInt();

	System.out.println("Enter X2 Value : ");
	
	int x2=sc.nextInt();

	System.out.println("Enter Y2 Value : ");
	
	int y2=sc.nextInt();
	
	int d= (int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2);
	
	double distance=(double)Math.sqrt(d);
	
	System.out.println("The distance is : " + distance);
	
		
	}
}
